package p015cm.aptoide.p016pt.download.view.outofspace;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo16641d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Long;)V"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.outofspace.OutOfSpaceDialogPresenter$loadRequiredStorageSize$3 */
/* compiled from: OutOfSpaceDialogPresenter.kt */
final class OutOfSpaceDialogPresenter$loadRequiredStorageSize$3<T> implements C5378b<Long> {
    final /* synthetic */ OutOfSpaceDialogPresenter this$0;

    OutOfSpaceDialogPresenter$loadRequiredStorageSize$3(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter) {
        this.this$0 = outOfSpaceDialogPresenter;
    }

    public final void call(Long l) {
        OutOfSpaceDialogView access$getView$p = this.this$0.view;
        C10202j.m34174a((Object) l, "it");
        access$getView$p.requiredSpaceToInstall(l.longValue());
    }
}
