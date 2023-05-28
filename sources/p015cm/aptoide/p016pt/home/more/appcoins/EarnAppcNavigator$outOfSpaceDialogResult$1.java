package p015cm.aptoide.p016pt.home.more.appcoins;

import android.content.Intent;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceNavigatorWrapper;
import p015cm.aptoide.p016pt.navigator.Result;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo16641d2 = {"<anonymous>", "Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceNavigatorWrapper;", "result", "Lcm/aptoide/pt/navigator/Result;", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcNavigator$outOfSpaceDialogResult$1 */
/* compiled from: EarnAppcNavigator.kt */
final class EarnAppcNavigator$outOfSpaceDialogResult$1<T, R> implements C5379n<T, R> {
    public static final EarnAppcNavigator$outOfSpaceDialogResult$1 INSTANCE = new EarnAppcNavigator$outOfSpaceDialogResult$1();

    EarnAppcNavigator$outOfSpaceDialogResult$1() {
    }

    public final OutOfSpaceNavigatorWrapper call(Result result) {
        String str;
        C10202j.m34178b(result, "result");
        boolean z = result.getResultCode() == -1;
        if (result.getData() != null) {
            Intent data = result.getData();
            if (data != null) {
                str = data.getPackage();
            } else {
                C10202j.m34172a();
                throw null;
            }
        } else {
            str = "";
        }
        C10202j.m34174a((Object) str, "if (result.data != null)…    .getPackage() else \"\"");
        return new OutOfSpaceNavigatorWrapper(z, str);
    }
}
