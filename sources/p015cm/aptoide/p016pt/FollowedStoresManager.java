package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.store.StoreUtilsProxy;
import p123rx.C5328b;
import p123rx.C5368e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo16641d2 = {"Lcm/aptoide/pt/FollowedStoresManager;", "", "storeCredentials", "Lcm/aptoide/pt/store/StoreCredentialsProvider;", "defaultFollowedStores", "", "", "storeUtilsProxy", "Lcm/aptoide/pt/store/StoreUtilsProxy;", "accountSettingsBodyInterceptorPoolV7", "Lcm/aptoide/pt/dataprovider/ws/BodyInterceptor;", "Lcm/aptoide/pt/dataprovider/ws/v7/BaseBody;", "accountManager", "Lcm/aptoide/accountmanager/AptoideAccountManager;", "defaultClient", "Lokhttp3/OkHttpClient;", "tokenInvalidator", "Lcm/aptoide/pt/dataprovider/interfaces/TokenInvalidator;", "defaultSharedPreferences", "Landroid/content/SharedPreferences;", "(Lcm/aptoide/pt/store/StoreCredentialsProvider;Ljava/util/List;Lcm/aptoide/pt/store/StoreUtilsProxy;Lcm/aptoide/pt/dataprovider/ws/BodyInterceptor;Lcm/aptoide/accountmanager/AptoideAccountManager;Lokhttp3/OkHttpClient;Lcm/aptoide/pt/dataprovider/interfaces/TokenInvalidator;Landroid/content/SharedPreferences;)V", "setDefaultFollowedStores", "Lrx/Completable;", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.FollowedStoresManager */
/* compiled from: FollowedStoresManager.kt */
public final class FollowedStoresManager {
    /* access modifiers changed from: private */
    public final AptoideAccountManager accountManager;
    /* access modifiers changed from: private */
    public final BodyInterceptor<BaseBody> accountSettingsBodyInterceptorPoolV7;
    /* access modifiers changed from: private */
    public final OkHttpClient defaultClient;
    private final List<String> defaultFollowedStores;
    /* access modifiers changed from: private */
    public final SharedPreferences defaultSharedPreferences;
    /* access modifiers changed from: private */
    public final StoreCredentialsProvider storeCredentials;
    /* access modifiers changed from: private */
    public final StoreUtilsProxy storeUtilsProxy;
    /* access modifiers changed from: private */
    public final TokenInvalidator tokenInvalidator;

    public FollowedStoresManager(StoreCredentialsProvider storeCredentialsProvider, List<String> list, StoreUtilsProxy storeUtilsProxy2, BodyInterceptor<BaseBody> bodyInterceptor, AptoideAccountManager aptoideAccountManager, OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator2, SharedPreferences sharedPreferences) {
        C10202j.m34178b(storeCredentialsProvider, "storeCredentials");
        C10202j.m34178b(list, "defaultFollowedStores");
        C10202j.m34178b(storeUtilsProxy2, "storeUtilsProxy");
        C10202j.m34178b(bodyInterceptor, "accountSettingsBodyInterceptorPoolV7");
        C10202j.m34178b(aptoideAccountManager, "accountManager");
        C10202j.m34178b(okHttpClient, "defaultClient");
        C10202j.m34178b(tokenInvalidator2, "tokenInvalidator");
        C10202j.m34178b(sharedPreferences, "defaultSharedPreferences");
        this.storeCredentials = storeCredentialsProvider;
        this.defaultFollowedStores = list;
        this.storeUtilsProxy = storeUtilsProxy2;
        this.accountSettingsBodyInterceptorPoolV7 = bodyInterceptor;
        this.accountManager = aptoideAccountManager;
        this.defaultClient = okHttpClient;
        this.tokenInvalidator = tokenInvalidator2;
        this.defaultSharedPreferences = sharedPreferences;
    }

    public final C5328b setDefaultFollowedStores() {
        C5328b b = C5368e.m10234a(this.defaultFollowedStores).mo18689g(new FollowedStoresManager$setDefaultFollowedStores$1(this)).mo18698l().mo18669c().mo18700m().mo18565b();
        C10202j.m34174a((Object) b, "Observable.from(defaultF…\n        .toCompletable()");
        return b;
    }
}
