package p015cm.aptoide.p016pt.dataprovider.p021ws.p026v8.reactions;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v8.reactions.SetReactionRequest */
public class SetReactionRequest extends C2185V7<BaseV7Response, Body> {

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v8.reactions.SetReactionRequest$Body */
    public static class Body extends BaseBody {

        /* renamed from: id */
        private final String f4979id;

        public Body(String str) {
            this.f4979id = str;
        }
    }

    public SetReactionRequest(Body body, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor bodyInterceptor, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, C2185V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    /* access modifiers changed from: protected */
    public C5368e<BaseV7Response> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        throw new IllegalStateException("webservice not implemented, should not be used.");
    }
}
