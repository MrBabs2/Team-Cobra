package com.asf.appcoins.sdk.contractproxy;

import com.asf.appcoins.sdk.contractproxy.repository.ApiProvider;
import com.asf.appcoins.sdk.contractproxy.repository.RemoteRepository;

/* renamed from: com.asf.appcoins.sdk.contractproxy.a */
/* compiled from: lambda */
public final /* synthetic */ class C5840a implements ApiProvider {

    /* renamed from: a */
    private final /* synthetic */ AppCoinsAddressProxyBuilder f10528a;

    public /* synthetic */ C5840a(AppCoinsAddressProxyBuilder appCoinsAddressProxyBuilder) {
        this.f10528a = appCoinsAddressProxyBuilder;
    }

    public final RemoteRepository.Api getApi(int i) {
        return this.f10528a.provideApi(i);
    }
}
