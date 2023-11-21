class Block {
    private String hash;
    private String previousHash;
    private String transaction;
    private long nounce; // Nonce is the number that blockchain miners are solving for

    Block(String transaction, String previousHash, String hash, long nounce) {
        this.transaction = transaction;
        this.previousHash = previousHash;
        this.hash = hash;
        this.nounce = nounce;
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

    public long getNounce() {
        return nounce;
    }
}
