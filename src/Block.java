class Block {
    private String hash;
    private String previousHash;
    private String transaction;

    Block(String transaction, String previousHash, String hash) {
        this.transaction = transaction;
        this.previousHash = previousHash;
        this.hash = hash;
    }

    public String getHash() {
        return hash;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public String getTransaction() {
        return transaction;
    }
}
