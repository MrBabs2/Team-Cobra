package com.asf.appcoins.sdk.contractproxy;

import com.asf.appcoins.sdk.contractproxy.proxy.WalletAddressProvider;
import com.asf.appcoins.sdk.contractproxy.proxy.Web3jProxyContract;
import java.util.Map;
import p120q.p326a.C11496w;
import p120q.p326a.p349h0.C11461a;

public class ContractAddressProvider implements AppCoinsAddressProxySdk {
    static final String ADVERTISEMENT_CONTRACT_ID = "advertisement";
    static final String APPCOINS_CONTRACT_ID = "appcoins";
    static final String IAB_CONTRACT_ID = "appcoinsiab";
    private int NETWORK_ROPSTEN = 3;
    private final Map<String, String> cache;
    private final WalletAddressProvider walletProvider;
    private final Web3jProxyContract web3jProxyContract;

    public ContractAddressProvider(WalletAddressProvider walletAddressProvider, Web3jProxyContract web3jProxyContract2, Map<String, String> map) {
        this.walletProvider = walletAddressProvider;
        this.web3jProxyContract = web3jProxyContract2;
        this.cache = map;
    }

    private C11496w<String> getAddress(int i, String str) {
        return this.walletProvider.get().mo37608a(C11461a.m37548b()).mo37610b(new C5841b(this, i, str));
    }

    /* access modifiers changed from: private */
    /* renamed from: syncGetContractAddress */
    public synchronized String mo19841a(int i, String str, String str2) {
        String str3;
        str3 = str2 + i;
        if (this.cache.get(str3) == null) {
            this.cache.put(str3, this.web3jProxyContract.getContractAddressById(str, i, str2));
        }
        return this.cache.get(str3);
    }

    public C11496w<String> getAdsAddress(int i) {
        return getAddress(i, ADVERTISEMENT_CONTRACT_ID);
    }

    public C11496w<String> getAppCoinsAddress(int i) {
        return getAddress(i, APPCOINS_CONTRACT_ID);
    }

    public C11496w<String> getIabAddress(int i) {
        return getAddress(i, IAB_CONTRACT_ID);
    }
}
