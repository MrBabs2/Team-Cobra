package p015cm.aptoide.aptoideviews.login;

import android.widget.AutoCompleteTextView;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.C1033R;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.login.SendMagicLinkView$getMagicLinkSubmit$1 */
/* compiled from: SendMagicLinkView.kt */
final class SendMagicLinkView$getMagicLinkSubmit$1<T, R> implements C5379n<T, R> {
    final /* synthetic */ SendMagicLinkView this$0;

    SendMagicLinkView$getMagicLinkSubmit$1(SendMagicLinkView sendMagicLinkView) {
        this.this$0 = sendMagicLinkView;
    }

    public final String call(Void voidR) {
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) this.this$0._$_findCachedViewById(C1033R.C1035id.email);
        C10202j.m34174a((Object) autoCompleteTextView, "email");
        return autoCompleteTextView.getText().toString();
    }
}
