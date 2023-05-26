package p015cm.aptoide.p016pt;

import kotlin.C4789l;
import p015cm.aptoide.p016pt.preferences.secure.SecurePreferences;
import p123rx.p126m.C5377a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo16641d2 = {"<anonymous>", "", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.LaunchManager$updateLaunchSettings$1 */
/* compiled from: LaunchManager.kt */
final class LaunchManager$updateLaunchSettings$1 implements C5377a {
    final /* synthetic */ LaunchManager this$0;

    LaunchManager$updateLaunchSettings$1(LaunchManager launchManager) {
        this.this$0 = launchManager;
    }

    public final void call() {
        SecurePreferences.setFirstRun(false, this.this$0.secureSharedPreferences);
        SecurePreferences.setCurrentVersionCode(BuildConfig.VERSION_CODE, this.this$0.secureSharedPreferences);
    }
}
