package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.preferences.secure.SecurePreferences;
import p123rx.C5328b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo16641d2 = {"Lcm/aptoide/pt/LaunchManager;", "", "firstLaunchManager", "Lcm/aptoide/pt/FirstLaunchManager;", "updateLaunchManager", "Lcm/aptoide/pt/UpdateLaunchManager;", "secureSharedPreferences", "Landroid/content/SharedPreferences;", "(Lcm/aptoide/pt/FirstLaunchManager;Lcm/aptoide/pt/UpdateLaunchManager;Landroid/content/SharedPreferences;)V", "launch", "Lrx/Completable;", "runFirstLaunch", "runUpdateLaunch", "updateLaunchSettings", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.LaunchManager */
/* compiled from: LaunchManager.kt */
public final class LaunchManager {
    private final FirstLaunchManager firstLaunchManager;
    /* access modifiers changed from: private */
    public final SharedPreferences secureSharedPreferences;
    private final UpdateLaunchManager updateLaunchManager;

    public LaunchManager(FirstLaunchManager firstLaunchManager2, UpdateLaunchManager updateLaunchManager2, SharedPreferences sharedPreferences) {
        C10202j.m34178b(firstLaunchManager2, "firstLaunchManager");
        C10202j.m34178b(updateLaunchManager2, "updateLaunchManager");
        C10202j.m34178b(sharedPreferences, "secureSharedPreferences");
        this.firstLaunchManager = firstLaunchManager2;
        this.updateLaunchManager = updateLaunchManager2;
        this.secureSharedPreferences = sharedPreferences;
    }

    private final C5328b runFirstLaunch() {
        if (SecurePreferences.isFirstRun(this.secureSharedPreferences)) {
            C5328b c = this.firstLaunchManager.runFirstLaunch().mo18606c(updateLaunchSettings());
            C10202j.m34174a((Object) c, "firstLaunchManager.runFi…h(updateLaunchSettings())");
            return c;
        }
        C5328b f = C5328b.m10170f();
        C10202j.m34174a((Object) f, "Completable.complete()");
        return f;
    }

    private final C5328b runUpdateLaunch() {
        boolean isFirstRun = SecurePreferences.isFirstRun(this.secureSharedPreferences);
        int latestVersionCode = SecurePreferences.getLatestVersionCode(this.secureSharedPreferences);
        if (!isFirstRun && 12010 > latestVersionCode) {
            return this.updateLaunchManager.runUpdateLaunch(latestVersionCode, BuildConfig.VERSION_CODE);
        }
        C5328b f = C5328b.m10170f();
        C10202j.m34174a((Object) f, "Completable.complete()");
        return f;
    }

    private final C5328b updateLaunchSettings() {
        C5328b d = C5328b.m10169d(new LaunchManager$updateLaunchSettings$1(this));
        C10202j.m34174a((Object) d, "Completable.fromAction {…eSharedPreferences)\n    }");
        return d;
    }

    public final C5328b launch() {
        C5328b b = C5328b.m10167b(runFirstLaunch(), runUpdateLaunch());
        C10202j.m34174a((Object) b, "Completable.mergeDelayEr…nch(), runUpdateLaunch())");
        return b;
    }
}
