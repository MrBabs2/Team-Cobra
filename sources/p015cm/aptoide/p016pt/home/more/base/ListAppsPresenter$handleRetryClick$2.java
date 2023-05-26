package p015cm.aptoide.p016pt.home.more.base;

import java.util.List;
import kotlin.C4789l;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5368e;
import p123rx.p126m.C5378b;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u0002H\u0003 \u0004*\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u0002H\u0003 \u0004*\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00052\u000e\u0010\u0006\u001a\n \u0004*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\b"}, mo16641d2 = {"<anonymous>", "Lrx/Observable;", "", "T", "kotlin.jvm.PlatformType", "Lcm/aptoide/pt/view/app/Application;", "it", "Lcm/aptoide/pt/presenter/View$LifecycleEvent;", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.base.ListAppsPresenter$handleRetryClick$2 */
/* compiled from: ListAppsPresenter.kt */
final class ListAppsPresenter$handleRetryClick$2<T, R> implements C5379n<T, C5368e<? extends R>> {
    final /* synthetic */ ListAppsPresenter this$0;

    ListAppsPresenter$handleRetryClick$2(ListAppsPresenter listAppsPresenter) {
        this.this$0 = listAppsPresenter;
    }

    public final C5368e<List<T>> call(View.LifecycleEvent lifecycleEvent) {
        return this.this$0.view.errorRetryClick().mo18664b(new C5378b<Void>(this) {
            final /* synthetic */ ListAppsPresenter$handleRetryClick$2 this$0;

            {
                this.this$0 = r1;
            }

            public final void call(Void voidR) {
                this.this$0.this$0.view.showLoading();
            }
        }).mo18687f(new C5379n<T, C5368e<? extends R>>(this) {
            final /* synthetic */ ListAppsPresenter$handleRetryClick$2 this$0;

            {
                this.this$0 = r1;
            }

            public final C5368e<List<T>> call(Void voidR) {
                return this.this$0.this$0.loadApps(true);
            }
        }).mo18686f();
    }
}
