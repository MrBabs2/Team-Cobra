package com.asf.appcoins.sdk.core.factory;

import com.asf.appcoins.sdk.core.transaction.Transaction;
import java.math.BigInteger;
import java.util.Arrays;
import org.spongycastle.util.encoders.Hex;
import org.web3j.abi.datatypes.Address;
import org.web3j.protocol.core.methods.response.EthGetTransactionReceipt;
import org.web3j.protocol.core.methods.response.EthTransaction;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;

public final class TransactionFactory {
    private TransactionFactory() {
    }

    public static BigInteger decodeInt(byte[] bArr, int i) {
        return new BigInteger(Arrays.copyOfRange(bArr, i, i + 32));
    }

    static String extractToFromEthTransaction(String str) {
        return new Address(decodeInt(Hex.decode(str.substring(10, str.length() - 64)), 0)).toString();
    }

    static String extractValueFromEthGetTransactionReceipt(String str) {
        if (str.startsWith("0x")) {
            str = str.substring(2);
        }
        return decodeInt(Hex.decode(str), 0).toString();
    }

    static String extractValueFromEthTransaction(String str) {
        return decodeInt(Hex.decode(str.substring(str.length() - 64)), 0).toString();
    }

    public static Transaction fromEthGetTransactionReceipt(EthGetTransactionReceipt ethGetTransactionReceipt) {
        TransactionReceipt transactionReceipt = ethGetTransactionReceipt.getTransactionReceipt();
        String transactionHash = transactionReceipt.getTransactionHash();
        String from = transactionReceipt.getFrom();
        Log log = (Log) transactionReceipt.getLogs().get(0);
        String address = log.getAddress();
        String extractValueFromEthGetTransactionReceipt = extractValueFromEthGetTransactionReceipt(log.getData());
        Transaction.Status parseStatus = parseStatus(transactionReceipt.getStatus());
        ethGetTransactionReceipt.getTransactionReceipt().getTo();
        return new Transaction(transactionHash, from, address, extractValueFromEthGetTransactionReceipt, parseStatus);
    }

    public static Transaction fromEthTransaction(EthTransaction ethTransaction, Transaction.Status status) {
        org.web3j.protocol.core.methods.response.Transaction transaction = ethTransaction.getTransaction();
        String hash = transaction.getHash();
        String from = transaction.getFrom();
        String input = ethTransaction.getTransaction().getInput();
        String extractToFromEthTransaction = extractToFromEthTransaction(input);
        String extractValueFromEthTransaction = extractValueFromEthTransaction(input);
        ethTransaction.getTransaction().getTo();
        return new Transaction(hash, from, extractToFromEthTransaction, extractValueFromEthTransaction, status);
    }

    private static Transaction.Status parseStatus(String str) {
        if (str.equals("0x1")) {
            return Transaction.Status.ACCEPTED;
        }
        return Transaction.Status.FAILED;
    }
}
