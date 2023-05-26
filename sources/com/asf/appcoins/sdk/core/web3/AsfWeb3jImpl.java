package com.asf.appcoins.sdk.core.web3;

import com.asf.appcoins.sdk.core.exception.TransactionFailedException;
import com.asf.appcoins.sdk.core.factory.TransactionFactory;
import com.asf.appcoins.sdk.core.transaction.Transaction;
import java.math.BigDecimal;
import org.web3j.abi.datatypes.Address;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.request.Transaction;
import org.web3j.protocol.core.methods.response.EthCall;
import org.web3j.protocol.core.methods.response.EthGasPrice;
import org.web3j.protocol.core.methods.response.EthGetTransactionCount;
import org.web3j.protocol.core.methods.response.EthGetTransactionReceipt;
import org.web3j.protocol.core.methods.response.EthSendTransaction;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;

public final class AsfWeb3jImpl implements AsfWeb3j {
    private final Web3j web3j;

    public AsfWeb3jImpl(Web3j web3j2) {
        this.web3j = web3j2;
    }

    /* access modifiers changed from: private */
    public String successOrThrow(EthSendTransaction ethSendTransaction) throws TransactionFailedException {
        if (ethSendTransaction.getError() == null) {
            return ethSendTransaction.getTransactionHash();
        }
        throw new TransactionFailedException(ethSendTransaction.getError().getMessage());
    }

    /* renamed from: a */
    public /* synthetic */ EthGetTransactionCount mo19869a(Address address) throws Exception {
        return this.web3j.ethGetTransactionCount(address.getValue(), DefaultBlockParameterName.PENDING).send();
    }

    /* renamed from: b */
    public /* synthetic */ EthSendTransaction mo19872b(String str) throws Exception {
        return this.web3j.ethSendRawTransaction(str).send();
    }

    public C11482n<String> call(Transaction transaction) {
        return C11482n.fromCallable(new C5850b(this, transaction)).map(C5854f.f10548f);
    }

    public C11482n<BigDecimal> getBalance(Address address) {
        throw new RuntimeException("Not implemented yet");
    }

    public C11482n<Long> getGasPrice(Address address) {
        return C11482n.fromCallable(new C5855g(this)).map(C5851c.f10543f);
    }

    public C11482n<Long> getNonce(Address address) {
        return C11482n.fromCallable(new C5852d(this, address)).map(C5859k.f10554f);
    }

    public C11482n<com.asf.appcoins.sdk.core.transaction.Transaction> getTransactionByHash(String str) {
        return C11482n.fromCallable(new C5849a(this, str)).flatMap(new C5858j(this, str)).retryWhen(C5860l.f10555f);
    }

    public C11482n<String> sendRawTransaction(String str) {
        return C11482n.fromCallable(new C5853e(this, str)).map(new C5856h(this));
    }

    /* renamed from: a */
    public /* synthetic */ EthGasPrice mo19868a() throws Exception {
        return this.web3j.ethGasPrice().send();
    }

    /* renamed from: a */
    public /* synthetic */ EthGetTransactionReceipt mo19870a(String str) throws Exception {
        return this.web3j.ethGetTransactionReceipt(str).send();
    }

    /* renamed from: a */
    public /* synthetic */ C11488s mo19871a(String str, EthGetTransactionReceipt ethGetTransactionReceipt) throws Exception {
        if (ethGetTransactionReceipt == null || ethGetTransactionReceipt.getTransactionReceipt() == null) {
            return C11482n.just(TransactionFactory.fromEthTransaction(this.web3j.ethGetTransactionByHash(str).send(), Transaction.Status.PENDING));
        }
        return C11482n.just(TransactionFactory.fromEthGetTransactionReceipt(ethGetTransactionReceipt));
    }

    /* renamed from: a */
    public /* synthetic */ EthCall mo19867a(org.web3j.protocol.core.methods.request.Transaction transaction) throws Exception {
        return this.web3j.ethCall(transaction, DefaultBlockParameterName.LATEST).send();
    }
}
