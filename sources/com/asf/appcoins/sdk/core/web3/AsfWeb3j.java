package com.asf.appcoins.sdk.core.web3;

import java.math.BigDecimal;
import org.web3j.abi.datatypes.Address;
import org.web3j.protocol.core.methods.request.Transaction;
import p120q.p326a.C11482n;

public interface AsfWeb3j {
    C11482n<String> call(Transaction transaction);

    C11482n<BigDecimal> getBalance(Address address);

    C11482n<Long> getGasPrice(Address address);

    C11482n<Long> getNonce(Address address);

    C11482n<com.asf.appcoins.sdk.core.transaction.Transaction> getTransactionByHash(String str);

    C11482n<String> sendRawTransaction(String str);
}
