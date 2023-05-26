package com.asf.appcoins.sdk.core.transaction;

public final class Transaction {
    private String from;
    private String hash;
    private final Status status;

    /* renamed from: to */
    private final String f10533to;
    private final String value;

    public Transaction(String str, String str2, String str3, String str4, Status status2) {
        this.hash = str;
        this.from = str2;
        this.f10533to = str3;
        this.value = str4;
        this.status = status2;
    }

    public String getFrom() {
        return this.from;
    }

    public String getHash() {
        return this.hash;
    }

    public Status getStatus() {
        return this.status;
    }

    public String getTo() {
        return this.f10533to;
    }

    public String getValue() {
        return this.value;
    }

    public void setFrom(String str) {
        this.from = str;
    }

    public void setHash(String str) {
        this.hash = str;
    }

    public enum Status {
        PENDING((String) -1),
        ACCEPTED((String) 1),
        FAILED((String) 0);
        
        private final String value;

        private Status(int i) {
            this.value = Integer.toString(i);
        }

        public String getValue() {
            return this.value;
        }

        private Status(String str) {
            this.value = str;
        }
    }
}
