package p015cm.aptoide.p016pt.home.more.appcoins;

import kotlin.C4789l;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceNavigatorWrapper;
import p123rx.C5328b;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "Lrx/Completable;", "it", "Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceNavigatorWrapper;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcListPresenter$handleOutOfSpaceDialogResult$4 */
/* compiled from: EarnAppcListPresenter.kt */
final class EarnAppcListPresenter$handleOutOfSpaceDialogResult$4<T, R> implements C5379n<OutOfSpaceNavigatorWrapper, C5328b> {
    final /* synthetic */ EarnAppcListPresenter this$0;

    EarnAppcListPresenter$handleOutOfSpaceDialogResult$4(EarnAppcListPresenter earnAppcListPresenter) {
        this.this$0 = earnAppcListPresenter;
    }

    public final C5328b call(OutOfSpaceNavigatorWrapper outOfSpaceNavigatorWrapper) {
        EarnAppcListPresenter earnAppcListPresenter = this.this$0;
        return earnAppcListPresenter.startWalletDownload(earnAppcListPresenter.earnAppcListManager.resumeWalletDownload());
    }
}
