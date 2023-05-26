package p015cm.aptoide.p016pt.download.view.outofspace;

import android.content.Intent;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.navigator.Result;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, mo16641d2 = {"Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceNavigator;", "", "fragmentNavigator", "Lcm/aptoide/pt/navigator/FragmentNavigator;", "packageName", "", "(Lcm/aptoide/pt/navigator/FragmentNavigator;Ljava/lang/String;)V", "clearedEnoughSpace", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.outofspace.OutOfSpaceNavigator */
/* compiled from: OutOfSpaceNavigator.kt */
public final class OutOfSpaceNavigator {
    private final FragmentNavigator fragmentNavigator;
    private final String packageName;

    public OutOfSpaceNavigator(FragmentNavigator fragmentNavigator2, String str) {
        C10202j.m34178b(fragmentNavigator2, "fragmentNavigator");
        C10202j.m34178b(str, "packageName");
        this.fragmentNavigator = fragmentNavigator2;
        this.packageName = str;
    }

    public final void clearedEnoughSpace() {
        this.fragmentNavigator.popDialogWithResult(new Result(1994, -1, new Intent().setPackage(this.packageName)));
    }
}
