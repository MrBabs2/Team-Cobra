package p015cm.aptoide.p016pt.themes;

import android.content.SharedPreferences;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.notification.sync.LocalNotificationSync;
import p015cm.aptoide.p016pt.notification.sync.LocalNotificationSyncManager;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, mo16641d2 = {"Lcm/aptoide/pt/themes/NewFeatureManager;", "", "preferences", "Landroid/content/SharedPreferences;", "localNotificationSyncManager", "Lcm/aptoide/pt/notification/sync/LocalNotificationSyncManager;", "newFeature", "Lcm/aptoide/pt/themes/NewFeature;", "(Landroid/content/SharedPreferences;Lcm/aptoide/pt/notification/sync/LocalNotificationSyncManager;Lcm/aptoide/pt/themes/NewFeature;)V", "getLocalNotificationSyncManager", "()Lcm/aptoide/pt/notification/sync/LocalNotificationSyncManager;", "getNewFeature", "()Lcm/aptoide/pt/themes/NewFeature;", "getPreferences", "()Landroid/content/SharedPreferences;", "hasShownFeature", "", "scheduleNotification", "", "setFeatureAsShown", "unscheduleNotification", "Companion", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.themes.NewFeatureManager */
/* compiled from: NewFeatureManager.kt */
public final class NewFeatureManager {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String HAS_SHOWN_FEATURE = "12010_has_shown_new_feature_";
    private final LocalNotificationSyncManager localNotificationSyncManager;
    private final NewFeature newFeature;
    private final SharedPreferences preferences;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo16641d2 = {"Lcm/aptoide/pt/themes/NewFeatureManager$Companion;", "", "()V", "HAS_SHOWN_FEATURE", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.themes.NewFeatureManager$Companion */
    /* compiled from: NewFeatureManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public NewFeatureManager(SharedPreferences sharedPreferences, LocalNotificationSyncManager localNotificationSyncManager2, NewFeature newFeature2) {
        C10202j.m34178b(sharedPreferences, "preferences");
        C10202j.m34178b(localNotificationSyncManager2, "localNotificationSyncManager");
        C10202j.m34178b(newFeature2, "newFeature");
        this.preferences = sharedPreferences;
        this.localNotificationSyncManager = localNotificationSyncManager2;
        this.newFeature = newFeature2;
    }

    public final LocalNotificationSyncManager getLocalNotificationSyncManager() {
        return this.localNotificationSyncManager;
    }

    public final NewFeature getNewFeature() {
        return this.newFeature;
    }

    public final SharedPreferences getPreferences() {
        return this.preferences;
    }

    public final boolean hasShownFeature() {
        SharedPreferences sharedPreferences = this.preferences;
        return sharedPreferences.getBoolean(HAS_SHOWN_FEATURE + this.newFeature.getId(), false);
    }

    public final void scheduleNotification() {
        LocalNotificationSyncManager localNotificationSyncManager2 = this.localNotificationSyncManager;
        String title = this.newFeature.getTitle();
        String description = this.newFeature.getDescription();
        int actionStringRes = this.newFeature.getActionStringRes();
        localNotificationSyncManager2.schedule(title, description, "", actionStringRes, "aptoidefeature://id=" + this.newFeature.getId() + "&action=" + this.newFeature.getActionId(), LocalNotificationSync.NEW_FEATURE, 8, LocalNotificationSyncManager.TWO_MINUTES);
    }

    public final void setFeatureAsShown() {
        SharedPreferences.Editor edit = this.preferences.edit();
        edit.putBoolean(HAS_SHOWN_FEATURE + this.newFeature.getId(), true).apply();
    }

    public final void unscheduleNotification() {
        this.localNotificationSyncManager.unschedule(LocalNotificationSync.NEW_FEATURE);
    }
}
