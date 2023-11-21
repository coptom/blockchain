import com.google.gson.GsonBuilder;
import java.util.ArrayList;

public class Main {

    private static ArrayList<Block> blockchain = new ArrayList<>();
    private final static int difficulty = 5;
    public static void main(String[] args) {
        Miner miner = new Miner(difficulty);

        // 1. Create transaction
        String firstTransaction = "Thomas pays Lucy 5 CC";
        // 2. Miner listens to this transaction and mines block
        Block firstBlock = miner.mineBlock(firstTransaction, "0");
        // 3. Block is added to the blockchain
        blockchain.add(firstBlock);

        // 1. Create transaction
        String secondTransaction = "John pays Paul 2 CC";
        // 2. Miner listens to this transaction and mines block
        Block secondBlock = miner.mineBlock(secondTransaction, firstBlock.getHash());
        // 3. Block is added to the blockchain
        blockchain.add(secondBlock);

        // 1. Create transaction
        String thirdTransaction = "Paul pays Thomas 4 CC";
        // 2. Miner listens to this transaction and mines block
        Block thirdBlock = miner.mineBlock(thirdTransaction, secondBlock.getHash());
        // 3. Block is added to the blockchain
        blockchain.add(thirdBlock);

        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
        System.out.println("Blockchain:");
        System.out.println(blockchainJson);
    }
}