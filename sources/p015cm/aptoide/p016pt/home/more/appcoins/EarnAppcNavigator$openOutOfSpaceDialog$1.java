package p015cm.aptoide.p016pt.home.more.appcoins;

import kotlin.C4789l;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceDialogFragment;
import p123rx.p126m.C5377a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo16641d2 = {"<anonymous>", "", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcNavigator$openOutOfSpaceDialog$1 */
/* compiled from: EarnAppcNavigator.kt */
final class EarnAppcNavigator$openOutOfSpaceDialog$1 implements C5377a {
    final /* synthetic */ String $packageName;
    final /* synthetic */ long $requiredSpace;
    final /* synthetic */ EarnAppcNavigator this$0;

    EarnAppcNavigator$openOutOfSpaceDialog$1(EarnAppcNavigator earnAppcNavigator, long j, String str) {
        this.this$0 = earnAppcNavigator;
        this.$requiredSpace = j;
        this.$packageName = str;
    }

    public final void call() {
        this.this$0.getFragmentNavigator().navigateToDialogForResult(OutOfSpaceDialogFragment.Companion.newInstance(this.$requiredSpace, this.$packageName), 1994);
    }
}
