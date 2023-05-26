package com.asf.appcoins.sdk.contractproxy;

import com.asf.appcoins.sdk.contractproxy.repository.RemoteRepository;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

public final class AppCoinsAddressProxyBuilder {
    /* access modifiers changed from: private */
    public RemoteRepository.Api provideApi(int i) {
        return (RemoteRepository.Api) new Retrofit.Builder().baseUrl(i != 3 ? BuildConfig.MAIN_NETWORK_BACKEND_BASE_HOST : BuildConfig.ROPSTEN_NETWORK_BACKEND_BASE_HOST).client(new OkHttpClient.Builder().build()).addConverterFactory(JacksonConverterFactory.create()).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build().create(RemoteRepository.Api.class);
    }

    public AppCoinsAddressProxySdk createAddressProxySdk() {
        return new BdsAppCoinsAddressProxySdk(new RemoteRepository(new C5840a(this)));
    }
}
