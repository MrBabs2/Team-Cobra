package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.WindowManager;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetStoreWidgets;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.Endless;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.WidgetsArgs;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.home.GetHomeBundlesRequest */
public class GetHomeBundlesRequest extends C2185V7<GetStoreWidgets, Body> {

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.home.GetHomeBundlesRequest$Body */
    public static class Body extends BaseBody implements Endless {
        private StoreContext context = StoreContext.home;
        private Integer limit;
        private int offset;
        private long storeId = 15;
        private WidgetsArgs widgetsArgs;

        public Body(Integer num, int i, WidgetsArgs widgetsArgs2) {
            this.limit = num;
            this.offset = i;
            this.widgetsArgs = widgetsArgs2;
        }

        public StoreContext getContext() {
            return this.context;
        }

        public Integer getLimit() {
            return this.limit;
        }

        public int getOffset() {
            return this.offset;
        }

        public long getStoreId() {
            return this.storeId;
        }

        public WidgetsArgs getWidgetsArgs() {
            return this.widgetsArgs;
        }

        public void setOffset(int i) {
            this.offset = i;
        }

        public void setStoreId(long j) {
            this.storeId = j;
        }

        public void setWidgetsArgs(WidgetsArgs widgetsArgs2) {
            this.widgetsArgs = widgetsArgs2;
        }
    }

    private GetHomeBundlesRequest(Body body, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor bodyInterceptor, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, C2185V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    /* renamed from: of */
    public static GetHomeBundlesRequest m5345of(int i, int i2, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor bodyInterceptor, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, Resources resources, WindowManager windowManager) {
        int i3 = i2;
        return new GetHomeBundlesRequest(new Body(Integer.valueOf(i), i2, WidgetsArgs.createDefault(resources, windowManager)), okHttpClient, factory, bodyInterceptor, tokenInvalidator, sharedPreferences);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo10367a(C2185V7.Interfaces interfaces, boolean z, Object obj) {
        return interfaces.getHomeBundles((Body) this.body, z);
    }

    public C5368e<GetStoreWidgets> observe(boolean z, boolean z2) {
        return super.observe(z, z2);
    }

    /* access modifiers changed from: protected */
    public C5368e<GetStoreWidgets> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return C5368e.m10257c(null).mo18687f(new C2211a(this, interfaces, z));
    }
}
