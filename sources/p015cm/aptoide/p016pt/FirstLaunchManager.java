package p015cm.aptoide.p016pt;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.networking.IdsRepository;
import p015cm.aptoide.p016pt.root.RootAvailabilityManager;
import p015cm.aptoide.p016pt.view.MainActivity;
import p123rx.C5328b;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0006\u0010\u0016\u001a\u00020\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo16641d2 = {"Lcm/aptoide/pt/FirstLaunchManager;", "", "defaultSharedPreferences", "Landroid/content/SharedPreferences;", "idsRepository", "Lcm/aptoide/pt/networking/IdsRepository;", "followedStoresManager", "Lcm/aptoide/pt/FollowedStoresManager;", "rootAvailabilityManager", "Lcm/aptoide/pt/root/RootAvailabilityManager;", "accountManager", "Lcm/aptoide/accountmanager/AptoideAccountManager;", "shortcutManager", "Lcm/aptoide/pt/AptoideShortcutManager;", "context", "Landroid/content/Context;", "(Landroid/content/SharedPreferences;Lcm/aptoide/pt/networking/IdsRepository;Lcm/aptoide/pt/FollowedStoresManager;Lcm/aptoide/pt/root/RootAvailabilityManager;Lcm/aptoide/accountmanager/AptoideAccountManager;Lcm/aptoide/pt/AptoideShortcutManager;Landroid/content/Context;)V", "createAppShortcut", "", "createShortcut", "Lrx/Completable;", "generateAptoideUuid", "runFirstLaunch", "setSharedPreferencesValues", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.FirstLaunchManager */
/* compiled from: FirstLaunchManager.kt */
public final class FirstLaunchManager {
    private final AptoideAccountManager accountManager;
    /* access modifiers changed from: private */
    public final Context context;
    /* access modifiers changed from: private */
    public final SharedPreferences defaultSharedPreferences;
    private final FollowedStoresManager followedStoresManager;
    /* access modifiers changed from: private */
    public final IdsRepository idsRepository;
    private final RootAvailabilityManager rootAvailabilityManager;
    /* access modifiers changed from: private */
    public final AptoideShortcutManager shortcutManager;

    public FirstLaunchManager(SharedPreferences sharedPreferences, IdsRepository idsRepository2, FollowedStoresManager followedStoresManager2, RootAvailabilityManager rootAvailabilityManager2, AptoideAccountManager aptoideAccountManager, AptoideShortcutManager aptoideShortcutManager, Context context2) {
        C10202j.m34178b(sharedPreferences, "defaultSharedPreferences");
        C10202j.m34178b(idsRepository2, "idsRepository");
        C10202j.m34178b(followedStoresManager2, "followedStoresManager");
        C10202j.m34178b(rootAvailabilityManager2, "rootAvailabilityManager");
        C10202j.m34178b(aptoideAccountManager, "accountManager");
        C10202j.m34178b(aptoideShortcutManager, "shortcutManager");
        C10202j.m34178b(context2, "context");
        this.defaultSharedPreferences = sharedPreferences;
        this.idsRepository = idsRepository2;
        this.followedStoresManager = followedStoresManager2;
        this.rootAvailabilityManager = rootAvailabilityManager2;
        this.accountManager = aptoideAccountManager;
        this.shortcutManager = aptoideShortcutManager;
        this.context = context2;
    }

    /* access modifiers changed from: private */
    public final void createAppShortcut() {
        Intent intent = new Intent(this.context, MainActivity.class);
        intent.setAction("android.intent.action.MAIN");
        Intent intent2 = new Intent();
        intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
        intent2.putExtra("android.intent.extra.shortcut.NAME", this.context.getResources().getString(C1086R.string.app_name));
        intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(this.context, C1086R.mipmap.ic_launcher));
        intent2.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        this.context.sendBroadcast(intent2);
    }

    private final C5328b createShortcut() {
        C5328b d = C5328b.m10169d(new FirstLaunchManager$createShortcut$1(this));
        C10202j.m34174a((Object) d, "Completable.fromAction {…pShortcut()\n      }\n    }");
        return d;
    }

    private final C5328b generateAptoideUuid() {
        C5328b d = C5328b.m10169d(new FirstLaunchManager$generateAptoideUuid$1(this));
        C10202j.m34174a((Object) d, "Completable.fromAction {…sitory.uniqueIdentifier }");
        return d;
    }

    private final C5328b setSharedPreferencesValues() {
        C5328b d = C5328b.m10169d(new FirstLaunchManager$setSharedPreferencesValues$1(this));
        C10202j.m34174a((Object) d, "Completable.fromAction {…tackTrace()\n      }\n    }");
        return d;
    }

    public final C5328b runFirstLaunch() {
        C5328b a = C5328b.m10167b(setSharedPreferencesValues(), generateAptoideUuid()).mo18587a(C5328b.m10167b(this.followedStoresManager.setDefaultFollowedStores(), this.rootAvailabilityManager.updateRootAvailability(), this.accountManager.updateAccount().mo18598b(), createShortcut())).mo18590a((C5378b<? super Throwable>) FirstLaunchManager$runFirstLaunch$1.INSTANCE);
        C10202j.m34174a((Object) a, "Completable.mergeDelayEr…rt.getInstance().log(e) }");
        return a;
    }
}
