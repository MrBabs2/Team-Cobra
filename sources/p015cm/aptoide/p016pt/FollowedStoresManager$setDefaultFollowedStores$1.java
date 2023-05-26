package p015cm.aptoide.p016pt;

import kotlin.C4789l;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetStoreMetaRequest;
import p123rx.C5328b;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "followedStoreName", "", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.FollowedStoresManager$setDefaultFollowedStores$1 */
/* compiled from: FollowedStoresManager.kt */
final class FollowedStoresManager$setDefaultFollowedStores$1<T, R> implements C5379n<String, C5328b> {
    final /* synthetic */ FollowedStoresManager this$0;

    FollowedStoresManager$setDefaultFollowedStores$1(FollowedStoresManager followedStoresManager) {
        this.this$0 = followedStoresManager;
    }

    public final C5328b call(String str) {
        BaseRequestWithStore.StoreCredentials storeCredentials = this.this$0.storeCredentials.get(str);
        return this.this$0.storeUtilsProxy.addDefaultStore(GetStoreMetaRequest.m5366of(storeCredentials, this.this$0.accountSettingsBodyInterceptorPoolV7, this.this$0.defaultClient, WebService.getDefaultConverter(), this.this$0.tokenInvalidator, this.this$0.defaultSharedPreferences), this.this$0.accountManager, storeCredentials);
    }
}
