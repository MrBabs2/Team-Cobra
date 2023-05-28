package p015cm.aptoide.p016pt.home.bundles.base;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, mo16641d2 = {"Lcm/aptoide/pt/home/bundles/base/AppComingSoonPromotionalBundle;", "Lcm/aptoide/pt/home/bundles/base/ActionBundle;", "title", "", "type", "Lcm/aptoide/pt/home/bundles/base/HomeBundle$BundleType;", "event", "Lcm/aptoide/pt/dataprovider/model/v7/Event;", "tag", "actionItem", "Lcm/aptoide/pt/home/bundles/base/ActionItem;", "isRegisteredForNotification", "", "(Ljava/lang/String;Lcm/aptoide/pt/home/bundles/base/HomeBundle$BundleType;Lcm/aptoide/pt/dataprovider/model/v7/Event;Ljava/lang/String;Lcm/aptoide/pt/home/bundles/base/ActionItem;Z)V", "()Z", "setRegisteredForNotification", "(Z)V", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.bundles.base.AppComingSoonPromotionalBundle */
/* compiled from: AppComingSoonPromotionalBundle.kt */
public final class AppComingSoonPromotionalBundle extends ActionBundle {
    private boolean isRegisteredForNotification;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppComingSoonPromotionalBundle(String str, HomeBundle.BundleType bundleType, Event event, String str2, ActionItem actionItem, boolean z) {
        super(str, bundleType, event, str2, actionItem);
        C10202j.m34178b(str, "title");
        C10202j.m34178b(bundleType, "type");
        C10202j.m34178b(str2, StoreTabGridRecyclerFragment.BundleCons.TAG);
        C10202j.m34178b(actionItem, "actionItem");
        this.isRegisteredForNotification = z;
    }

    public final boolean isRegisteredForNotification() {
        return this.isRegisteredForNotification;
    }

    public final void setRegisteredForNotification(boolean z) {
        this.isRegisteredForNotification = z;
    }
}
