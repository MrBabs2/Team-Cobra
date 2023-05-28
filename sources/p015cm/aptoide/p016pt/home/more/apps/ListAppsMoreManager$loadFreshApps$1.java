package p015cm.aptoide.p016pt.home.more.apps;

import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.ads.MinimalAd;
import p015cm.aptoide.p016pt.view.app.Application;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012*\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00010\u0004H\n¢\u0006\u0002\b\u0007"}, mo16641d2 = {"<anonymous>", "", "Lcm/aptoide/pt/view/app/Application;", "response", "", "Lcm/aptoide/pt/ads/MinimalAd;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.apps.ListAppsMoreManager$loadFreshApps$1 */
/* compiled from: ListAppsMoreManager.kt */
final class ListAppsMoreManager$loadFreshApps$1<T, R> implements C5379n<T, R> {
    final /* synthetic */ ListAppsMoreManager this$0;

    ListAppsMoreManager$loadFreshApps$1(ListAppsMoreManager listAppsMoreManager) {
        this.this$0 = listAppsMoreManager;
    }

    public final List<Application> call(List<MinimalAd> list) {
        ListAppsMoreManager listAppsMoreManager = this.this$0;
        C10202j.m34174a((Object) list, "response");
        return listAppsMoreManager.mapAdsResponse(list);
    }
}
