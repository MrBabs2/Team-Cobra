package p015cm.aptoide.p016pt.home.more.appcoins;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p123rx.C5368e;
import p123rx.p126m.C12495m;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0000\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002 \u0003*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, mo16641d2 = {"<anonymous>", "Lrx/Observable;", "", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcListPresenter$startWalletDownload$1 */
/* compiled from: EarnAppcListPresenter.kt */
final class EarnAppcListPresenter$startWalletDownload$1<R> implements C12495m<C5368e<T>> {
    final /* synthetic */ EarnAppcListPresenter this$0;

    EarnAppcListPresenter$startWalletDownload$1(EarnAppcListPresenter earnAppcListPresenter) {
        this.this$0 = earnAppcListPresenter;
    }

    public final C5368e call() {
        if (this.this$0.earnAppcListManager.shouldShowRootInstallWarningPopup()) {
            this.this$0.view.showRootInstallWarningPopup().mo18664b(new C5378b<Boolean>(this) {
                final /* synthetic */ EarnAppcListPresenter$startWalletDownload$1 this$0;

                {
                    this.this$0 = r1;
                }

                public final void call(Boolean bool) {
                    EarnAppcListManager access$getEarnAppcListManager$p = this.this$0.this$0.earnAppcListManager;
                    C10202j.m34174a((Object) bool, "answer");
                    access$getEarnAppcListManager$p.allowRootInstall(bool.booleanValue());
                }
            });
        }
        return C5368e.m10257c(null);
    }
}
