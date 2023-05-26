package p015cm.aptoide.p016pt.home.more.base;

import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.home.bundles.apps.EskillsApp;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0006*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, mo16641d2 = {"<anonymous>", "", "T", "Lcm/aptoide/pt/view/app/Application;", "apps", "", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.base.ListAppsPresenter$loadApps$1 */
/* compiled from: ListAppsPresenter.kt */
final class ListAppsPresenter$loadApps$1<T> implements C5378b<List<? extends T>> {
    final /* synthetic */ ListAppsPresenter this$0;

    ListAppsPresenter$loadApps$1(ListAppsPresenter listAppsPresenter) {
        this.this$0 = listAppsPresenter;
    }

    public final void call(List<? extends T> list) {
        C10202j.m34174a((Object) list, DeepLinkIntentReceiver.DeepLinksTargets.APPS);
        if ((!list.isEmpty()) && (list.get(0) instanceof EskillsApp)) {
            this.this$0.view.showHeader();
        }
        this.this$0.view.showApps(list);
    }
}
