package p015cm.aptoide.p016pt.download.view;

import kotlin.C4789l;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "", "lifecycleEvent", "Lcm/aptoide/pt/presenter/View$LifecycleEvent;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.DownloadViewActionPresenter$present$2 */
/* compiled from: DownloadViewActionPresenter.kt */
final class DownloadViewActionPresenter$present$2<T, R> implements C5379n<View.LifecycleEvent, Boolean> {
    public static final DownloadViewActionPresenter$present$2 INSTANCE = new DownloadViewActionPresenter$present$2();

    DownloadViewActionPresenter$present$2() {
    }

    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return Boolean.valueOf(call((View.LifecycleEvent) obj));
    }

    public final boolean call(View.LifecycleEvent lifecycleEvent) {
        return lifecycleEvent == View.LifecycleEvent.CREATE;
    }
}
