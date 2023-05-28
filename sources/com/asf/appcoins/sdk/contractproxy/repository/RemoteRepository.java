package com.asf.appcoins.sdk.contractproxy.repository;

import p120q.p326a.C11496w;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class RemoteRepository {
    private final ApiProvider apiProvider;

    public interface Api {
        @GET("appc/proxyaddress")
        C11496w<ProxyResponse> getAddress(@Query("contract") String str);
    }

    public enum Contracts {
        APPCOINS_IAB("appcoinsiab"),
        APPCOINS("appcoins"),
        APPCOINS_ADS("advertisement");
        
        /* access modifiers changed from: private */
        public final String value;

        private Contracts(String str) {
            this.value = str;
        }
    }

    private static class ProxyResponse {
        private String wallet;

        public String getWallet() {
            return this.wallet;
        }

        public void setWallet(String str) {
            this.wallet = str;
        }
    }

    public RemoteRepository(ApiProvider apiProvider2) {
        this.apiProvider = apiProvider2;
    }

    public C11496w<String> getAddress(Contracts contracts, int i) {
        return this.apiProvider.getApi(i).getAddress(contracts.value).mo37610b(C5843a.f10532f);
    }
}
