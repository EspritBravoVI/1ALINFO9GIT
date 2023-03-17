class Git {
    public String indexing;
    public String commit;
    public String push;
    public String pull;
    public String merge;
    public String rebase;

    public String getIndexing() {
        return indexing;
    }

    public String getCommit() {
        return commit;
    }

    public String getPush() {
        return push;
    }

    public String getPull() {
        return pull;
    }

    public String getMerge() {
        return merge;
    }

    public String getRebase() {
        return rebase;
    }

    public void setIndexing(String indexing) {
        this.indexing = indexing;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public void setPush(String push) {
        this.push = push;
    }

    public void setPull(String pull) {
        this.pull = pull;
    }

    public void setMerge(String merge) {
        this.merge = merge;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Git{" +
                "indexing='" + indexing + '\'' +
                ", commit='" + commit + '\'' +
                ", push='" + push + '\'' +
                ", pull='" + pull + '\'' +
                ", merge='" + merge + '\'' +
                ", rebase='" + rebase + '\'' +
                '}';
    }

    public void setRebase(String rebase) {
        this.rebase = rebase;
    }

    public Git(String indexing, String commit, String push, String pull, String merge, String rebase) {
        this.indexing = indexing;
        this.commit = commit;
        this.push = push;
        this.pull = pull;
        this.merge = merge;
        this.rebase = rebase;
    }

    public Git() {
    }

}