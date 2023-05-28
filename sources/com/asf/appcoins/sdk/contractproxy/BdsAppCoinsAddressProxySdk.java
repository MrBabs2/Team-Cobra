package com.asf.appcoins.sdk.contractproxy;

import com.asf.appcoins.sdk.contractproxy.repository.RemoteRepository;
import p120q.p326a.C11496w;

public class BdsAppCoinsAddressProxySdk implements AppCoinsAddressProxySdk {
    private final RemoteRepository repository;

    public BdsAppCoinsAddressProxySdk(RemoteRepository remoteRepository) {
        this.repository = remoteRepository;
    }

    public C11496w<String> getAdsAddress(int i) {
        return this.repository.getAddress(RemoteRepository.Contracts.APPCOINS_ADS, i);
    }

    public C11496w<String> getAppCoinsAddress(int i) {
        return this.repository.getAddress(RemoteRepository.Contracts.APPCOINS, i);
    }

    public C11496w<String> getIabAddress(int i) {
        return this.repository.getAddress(RemoteRepository.Contracts.APPCOINS_IAB, i);
    }
}
