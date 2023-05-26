package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.WindowManager;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.ListStores;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.Endless;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.GetMyStoreListRequest */
public class GetMyStoreListRequest extends C2185V7<ListStores, EndlessBody> {
    private static boolean useEndless;
    private String url;

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.GetMyStoreListRequest$Body */
    public static class Body extends BaseBody {
        private boolean refresh;
        private WidgetsArgs widgetsArgs;

        public Body(WidgetsArgs widgetsArgs2) {
            this.widgetsArgs = widgetsArgs2;
        }

        public WidgetsArgs getWidgetsArgs() {
            return this.widgetsArgs;
        }

        public void setRefresh(boolean z) {
            this.refresh = z;
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.GetMyStoreListRequest$EndlessBody */
    public static class EndlessBody extends Body implements Endless {
        private Integer limit = 25;
        private int offset;

        public EndlessBody(WidgetsArgs widgetsArgs) {
            super(widgetsArgs);
        }

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

    public GetMyStoreListRequest(String str, EndlessBody endlessBody, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(endlessBody, C2185V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.url = str;
    }

    /* renamed from: of */
    public static GetMyStoreListRequest m5363of(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, Resources resources, WindowManager windowManager) {
        return m5364of(str, false, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, resources, windowManager);
    }

    /* renamed from: of */
    public static GetMyStoreListRequest m5364of(String str, boolean z, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, Resources resources, WindowManager windowManager) {
        useEndless = z;
        return new GetMyStoreListRequest(str, new EndlessBody(WidgetsArgs.createDefault(resources, windowManager)), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* access modifiers changed from: protected */
    public C5368e<ListStores> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        if (this.url.contains("getSubscribed")) {
            ((EndlessBody) this.body).setRefresh(z);
        }
        if (TextUtils.isEmpty(this.url)) {
            return interfaces.getMyStoreList((Body) this.body, z);
        }
        if (useEndless) {
            return interfaces.getMyStoreListEndless(this.url, (EndlessBody) this.body, z);
        }
        return interfaces.getMyStoreList(this.url, (Body) this.body, z);
    }
}
