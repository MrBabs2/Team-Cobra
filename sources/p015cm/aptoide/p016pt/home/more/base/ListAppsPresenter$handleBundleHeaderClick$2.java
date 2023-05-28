package p015cm.aptoide.p016pt.home.more.base;

import kotlin.C4789l;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5368e;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00042\u000e\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\b"}, mo16641d2 = {"<anonymous>", "Lrx/Observable;", "Ljava/lang/Void;", "T", "Lcm/aptoide/pt/view/app/Application;", "it", "Lcm/aptoide/pt/presenter/View$LifecycleEvent;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.base.ListAppsPresenter$handleBundleHeaderClick$2 */
/* compiled from: ListAppsPresenter.kt */
final class ListAppsPresenter$handleBundleHeaderClick$2<T, R> implements C5379n<T, C5368e<? extends R>> {
    final /* synthetic */ ListAppsPresenter this$0;

    ListAppsPresenter$handleBundleHeaderClick$2(ListAppsPresenter listAppsPresenter) {
        this.this$0 = listAppsPresenter;
    }

    public final C5368e<Void> call(View.LifecycleEvent lifecycleEvent) {
        return this.this$0.view.headerClicks();
    }
}
