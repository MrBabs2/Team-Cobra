package p015cm.aptoide.p016pt.account.view.magiclink;

import kotlin.C4789l;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo16641d2 = {"<anonymous>", "", "isValid", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Boolean;)V"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.account.view.magiclink.SendMagicLinkPresenter$validateEmail$1 */
/* compiled from: SendMagicLinkPresenter.kt */
final class SendMagicLinkPresenter$validateEmail$1<T> implements C5378b<Boolean> {
    final /* synthetic */ SendMagicLinkPresenter this$0;

    SendMagicLinkPresenter$validateEmail$1(SendMagicLinkPresenter sendMagicLinkPresenter) {
        this.this$0 = sendMagicLinkPresenter;
    }

    public final void call(Boolean bool) {
        if (!bool.booleanValue()) {
            this.this$0.view.setEmailInvalidError();
        }
    }
}
