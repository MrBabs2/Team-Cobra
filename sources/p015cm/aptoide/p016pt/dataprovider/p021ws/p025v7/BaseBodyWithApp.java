package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.content.SharedPreferences;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.BaseBodyWithApp */
public class BaseBodyWithApp extends BaseBodyWithAlphaBetaKey {
    private String storePassSha1;
    private String storeUser;

    public BaseBodyWithApp(SharedPreferences sharedPreferences) {
        super(sharedPreferences);
    }

    public String getStorePassSha1() {
        return this.storePassSha1;
    }

    public String getStoreUser() {
        return this.storeUser;
    }

    public void setStorePassSha1(String str) {
        this.storePassSha1 = str;
    }

    public void setStoreUser(String str) {
        this.storeUser = str;
    }
}
