package com.asf.appcoins.sdk.contractproxy.proxy;

import java.io.IOException;
import java.util.ArrayList;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.FunctionReturnDecoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.Response;
import org.web3j.protocol.core.methods.request.Transaction;
import org.web3j.protocol.core.methods.response.EthCall;

public class Web3jProxyContract implements ProxyContract {
    private final ProxyContractAddressProvider proxyContractAddressProvider;
    private final Web3jProvider web3jProvider;

    public Web3jProxyContract(Web3jProvider web3jProvider2, ProxyContractAddressProvider proxyContractAddressProvider2) {
        this.web3jProvider = web3jProvider2;
        this.proxyContractAddressProvider = proxyContractAddressProvider2;
    }

    private String mapErrorToMessage(Response.Error error) {
        return "Code: " + error.getCode() + "\nmessage: " + error.getMessage() + "\nData: " + error.getData();
    }

    private Bytes32 stringToBytes32(String str) {
        byte[] bArr = new byte[32];
        byte[] bytes = str.getBytes();
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return new Bytes32(bArr);
    }

    public String getContractAddressById(String str, int i, String str2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new TypeReference<Address>() {
        });
        arrayList.add(stringToBytes32(str2));
        Function function = new Function("getContractAddressById", arrayList, arrayList2);
        try {
            EthCall send = this.web3jProvider.get(i).ethCall(Transaction.createEthCallTransaction(str, this.proxyContractAddressProvider.getProxyContractAddress(i), FunctionEncoder.encode(function)), DefaultBlockParameterName.LATEST).send();
            if (!send.hasError()) {
                return ((Address) FunctionReturnDecoder.decode(send.getValue(), function.getOutputParameters()).get(0)).getValue();
            }
            throw new RuntimeException(mapErrorToMessage(send.getError()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
