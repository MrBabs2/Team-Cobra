package p015cm.aptoide.p016pt.home.more.base;

import kotlin.C4789l;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, mo16641d2 = {"<anonymous>", "", "T", "Lcm/aptoide/pt/view/app/Application;", "lifecycleEvent", "Lcm/aptoide/pt/presenter/View$LifecycleEvent;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.base.ListAppsPresenter$loadAppList$1 */
/* compiled from: ListAppsPresenter.kt */
final class ListAppsPresenter$loadAppList$1<T, R> implements C5379n<View.LifecycleEvent, Boolean> {
    public static final ListAppsPresenter$loadAppList$1 INSTANCE = new ListAppsPresenter$loadAppList$1();

    ListAppsPresenter$loadAppList$1() {
    }

    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return Boolean.valueOf(call((View.LifecycleEvent) obj));
    }

    public final boolean call(View.LifecycleEvent lifecycleEvent) {
        return lifecycleEvent == View.LifecycleEvent.CREATE;
    }
}
