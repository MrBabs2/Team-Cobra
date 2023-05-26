package p015cm.aptoide.p016pt.home.more.apps;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.WindowManager;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListApps;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.GetEskillsAppsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.ListAppsRequest;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p123rx.C5368e;
import retrofit2.Converter;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.J\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.J&\u00100\u001a\b\u0012\u0004\u0012\u00020*0)2\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.2\u0006\u00101\u001a\u000202R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00063"}, mo16641d2 = {"Lcm/aptoide/pt/home/more/apps/ListAppsMoreRepository;", "", "storeCredentialsProvider", "Lcm/aptoide/pt/store/StoreCredentialsProvider;", "bodyInterceptor", "Lcm/aptoide/pt/dataprovider/ws/BodyInterceptor;", "Lcm/aptoide/pt/dataprovider/ws/v7/BaseBody;", "okHttpClient", "Lokhttp3/OkHttpClient;", "converterFactory", "Lretrofit2/Converter$Factory;", "tokenInvalidator", "Lcm/aptoide/pt/dataprovider/interfaces/TokenInvalidator;", "sharedPreferences", "Landroid/content/SharedPreferences;", "resources", "Landroid/content/res/Resources;", "windowManager", "Landroid/view/WindowManager;", "appBundlesVisibilityManager", "Lcm/aptoide/pt/dataprovider/aab/AppBundlesVisibilityManager;", "(Lcm/aptoide/pt/store/StoreCredentialsProvider;Lcm/aptoide/pt/dataprovider/ws/BodyInterceptor;Lokhttp3/OkHttpClient;Lretrofit2/Converter$Factory;Lcm/aptoide/pt/dataprovider/interfaces/TokenInvalidator;Landroid/content/SharedPreferences;Landroid/content/res/Resources;Landroid/view/WindowManager;Lcm/aptoide/pt/dataprovider/aab/AppBundlesVisibilityManager;)V", "getAppBundlesVisibilityManager", "()Lcm/aptoide/pt/dataprovider/aab/AppBundlesVisibilityManager;", "getBodyInterceptor", "()Lcm/aptoide/pt/dataprovider/ws/BodyInterceptor;", "getConverterFactory", "()Lretrofit2/Converter$Factory;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "getResources", "()Landroid/content/res/Resources;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "getStoreCredentialsProvider", "()Lcm/aptoide/pt/store/StoreCredentialsProvider;", "getTokenInvalidator", "()Lcm/aptoide/pt/dataprovider/interfaces/TokenInvalidator;", "getWindowManager", "()Landroid/view/WindowManager;", "getApps", "Lrx/Observable;", "Lcm/aptoide/pt/dataprovider/model/v7/ListApps;", "url", "", "refresh", "", "getEskillsApps", "loadMoreApps", "offset", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.apps.ListAppsMoreRepository */
/* compiled from: ListAppsMoreRepository.kt */
public final class ListAppsMoreRepository {
    private final AppBundlesVisibilityManager appBundlesVisibilityManager;
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    private final Converter.Factory converterFactory;
    private final OkHttpClient okHttpClient;
    private final Resources resources;
    private final SharedPreferences sharedPreferences;
    private final StoreCredentialsProvider storeCredentialsProvider;
    private final TokenInvalidator tokenInvalidator;
    private final WindowManager windowManager;

    public ListAppsMoreRepository(StoreCredentialsProvider storeCredentialsProvider2, BodyInterceptor<BaseBody> bodyInterceptor2, OkHttpClient okHttpClient2, Converter.Factory factory, TokenInvalidator tokenInvalidator2, SharedPreferences sharedPreferences2, Resources resources2, WindowManager windowManager2, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        C10202j.m34178b(storeCredentialsProvider2, "storeCredentialsProvider");
        C10202j.m34178b(bodyInterceptor2, "bodyInterceptor");
        C10202j.m34178b(okHttpClient2, "okHttpClient");
        C10202j.m34178b(factory, "converterFactory");
        C10202j.m34178b(tokenInvalidator2, "tokenInvalidator");
        C10202j.m34178b(sharedPreferences2, "sharedPreferences");
        C10202j.m34178b(resources2, "resources");
        C10202j.m34178b(windowManager2, "windowManager");
        C10202j.m34178b(appBundlesVisibilityManager2, "appBundlesVisibilityManager");
        this.storeCredentialsProvider = storeCredentialsProvider2;
        this.bodyInterceptor = bodyInterceptor2;
        this.okHttpClient = okHttpClient2;
        this.converterFactory = factory;
        this.tokenInvalidator = tokenInvalidator2;
        this.sharedPreferences = sharedPreferences2;
        this.resources = resources2;
        this.windowManager = windowManager2;
        this.appBundlesVisibilityManager = appBundlesVisibilityManager2;
    }

    public final AppBundlesVisibilityManager getAppBundlesVisibilityManager() {
        return this.appBundlesVisibilityManager;
    }

    public final C5368e<ListApps> getApps(String str, boolean z) {
        C5368e<ListApps> observe = ListAppsRequest.ofAction(str, this.storeCredentialsProvider.fromUrl(str), this.bodyInterceptor, this.okHttpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, this.resources, this.windowManager, this.appBundlesVisibilityManager).observe(z);
        C10202j.m34174a((Object) observe, "ListAppsRequest.ofAction…Manager).observe(refresh)");
        return observe;
    }

    public final BodyInterceptor<BaseBody> getBodyInterceptor() {
        return this.bodyInterceptor;
    }

    public final Converter.Factory getConverterFactory() {
        return this.converterFactory;
    }

    public final C5368e<ListApps> getEskillsApps(String str, boolean z) {
        C10202j.m34178b(str, "url");
        C5368e<ListApps> observe = new GetEskillsAppsRequest(str, this.okHttpClient, this.converterFactory, this.bodyInterceptor, this.tokenInvalidator, this.sharedPreferences, this.appBundlesVisibilityManager).observe(z);
        C10202j.m34174a((Object) observe, "GetEskillsAppsRequest(ur…er\n    ).observe(refresh)");
        return observe;
    }

    public final OkHttpClient getOkHttpClient() {
        return this.okHttpClient;
    }

    public final Resources getResources() {
        return this.resources;
    }

    public final SharedPreferences getSharedPreferences() {
        return this.sharedPreferences;
    }

    public final StoreCredentialsProvider getStoreCredentialsProvider() {
        return this.storeCredentialsProvider;
    }

    public final TokenInvalidator getTokenInvalidator() {
        return this.tokenInvalidator;
    }

    public final WindowManager getWindowManager() {
        return this.windowManager;
    }

    public final C5368e<ListApps> loadMoreApps(String str, boolean z, int i) {
        ListAppsRequest ofAction = ListAppsRequest.ofAction(str, this.storeCredentialsProvider.fromUrl(str), this.bodyInterceptor, this.okHttpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, this.resources, this.windowManager, this.appBundlesVisibilityManager);
        C10202j.m34174a((Object) ofAction, "request");
        ListAppsRequest.Body body = (ListAppsRequest.Body) ofAction.getBody();
        C10202j.m34174a((Object) body, "request.body");
        body.setOffset(i);
        C5368e<ListApps> observe = ofAction.observe(z);
        C10202j.m34174a((Object) observe, "request.observe(refresh)");
        return observe;
    }
}
