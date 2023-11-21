import java.nio.charset.StandardCharsets;
import com.google.common.hash.Hashing;

class Hasher {
    static String calculateHash(String previousHash, String transaction, long nounce) {
        final String toHash = previousHash + transaction + nounce;
        return Hashing.sha256().hashString(toHash, StandardCharsets.UTF_8).toString();
    }
}
