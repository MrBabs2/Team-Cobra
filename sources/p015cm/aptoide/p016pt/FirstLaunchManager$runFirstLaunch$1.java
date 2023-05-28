package p015cm.aptoide.p016pt;

import kotlin.C4789l;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.FirstLaunchManager$runFirstLaunch$1 */
/* compiled from: FirstLaunchManager.kt */
final class FirstLaunchManager$runFirstLaunch$1<T> implements C5378b<Throwable> {
    public static final FirstLaunchManager$runFirstLaunch$1 INSTANCE = new FirstLaunchManager$runFirstLaunch$1();

    FirstLaunchManager$runFirstLaunch$1() {
    }

    public final void call(Throwable th) {
        CrashReport.getInstance().log(th);
    }
}
