package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.SetUserSettings */
public class SetUserSettings extends C2185V7<BaseV7Response, Body> {

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.SetUserSettings$Body */
    public static class Body extends BaseBody {
        public boolean mature;

        public Body(boolean z) {
            this.mature = z;
        }

        public boolean isMature() {
            return this.mature;
        }

        public void setMature(boolean z) {
            this.mature = z;
        }
    }

    protected SetUserSettings(Body body, String str, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor bodyInterceptor, TokenInvalidator tokenInvalidator) {
        super(body, str, okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    public static String getHost() {
        return "https://ws75-primary.aptoide.com/api/7/";
    }

    /* renamed from: of */
    public static SetUserSettings m5275of(boolean z, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor bodyInterceptor, TokenInvalidator tokenInvalidator) {
        Body body = new Body(z);
        body.setMature(z);
        return new SetUserSettings(body, getHost(), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    /* access modifiers changed from: protected */
    public C5368e<BaseV7Response> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.setUserSettings((Body) this.body);
    }
}
