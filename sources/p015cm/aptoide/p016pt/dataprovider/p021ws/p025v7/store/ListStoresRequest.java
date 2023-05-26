package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store;

import android.content.SharedPreferences;
import android.text.TextUtils;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.ListStores;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.Endless;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.ListStoresRequest */
public class ListStoresRequest extends C2185V7<ListStores, Body> {
    static final String STORT_BY_DOWNLOADS = "downloads7d";
    private String url;

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.ListStoresRequest$Body */
    public static class Body extends BaseBody implements Endless {
        /* access modifiers changed from: private */
        public Integer limit;
        private int offset;

        public Integer getLimit() {
            return this.limit;
        }

        public int getOffset() {
            return this.offset;
        }

        public void setOffset(int i) {
            this.offset = i;
        }
    }

    private ListStoresRequest(String str, Body body, String str2, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator) {
        this(body, str2, bodyInterceptor, okHttpClient, factory, tokenInvalidator);
        this.url = str;
    }

    public static ListStoresRequest ofAction(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        String replace = str.replace("listStores", "");
        if (!replace.startsWith("/")) {
            replace = "/" + replace;
        }
        return new ListStoresRequest(replace, new Body(), C2185V7.getHost(sharedPreferences), bodyInterceptor, okHttpClient, factory, tokenInvalidator);
    }

    public static ListStoresRequest ofTopStores(int i, int i2, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        Body body = new Body();
        body.setOffset(i);
        Integer unused = body.limit = Integer.valueOf(i2);
        return new ListStoresRequest(body, C2185V7.getHost(sharedPreferences), bodyInterceptor, okHttpClient, factory, tokenInvalidator);
    }

    /* access modifiers changed from: protected */
    public C5368e<ListStores> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        if (TextUtils.isEmpty(this.url)) {
            return interfaces.listTopStores(STORT_BY_DOWNLOADS, 10, (Body) this.body, z);
        }
        return interfaces.listStores(this.url, (Body) this.body, z);
    }

    private ListStoresRequest(Body body, String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator) {
        super(body, str, okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }
}
