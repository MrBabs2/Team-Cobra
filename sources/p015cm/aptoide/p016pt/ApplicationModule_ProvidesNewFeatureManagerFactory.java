package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p015cm.aptoide.p016pt.notification.sync.LocalNotificationSyncManager;
import p015cm.aptoide.p016pt.themes.NewFeature;
import p015cm.aptoide.p016pt.themes.NewFeatureManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesNewFeatureManagerFactory */
public final class ApplicationModule_ProvidesNewFeatureManagerFactory implements C10824b<NewFeatureManager> {
    private final Provider<LocalNotificationSyncManager> localNotificationSyncManagerProvider;
    private final ApplicationModule module;
    private final Provider<NewFeature> newFeatureProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvidesNewFeatureManagerFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider, Provider<NewFeature> provider2, Provider<LocalNotificationSyncManager> provider3) {
        this.module = applicationModule;
        this.sharedPreferencesProvider = provider;
        this.newFeatureProvider = provider2;
        this.localNotificationSyncManagerProvider = provider3;
    }

    public static ApplicationModule_ProvidesNewFeatureManagerFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider, Provider<NewFeature> provider2, Provider<LocalNotificationSyncManager> provider3) {
        return new ApplicationModule_ProvidesNewFeatureManagerFactory(applicationModule, provider, provider2, provider3);
    }

    public static NewFeatureManager providesNewFeatureManager(ApplicationModule applicationModule, SharedPreferences sharedPreferences, NewFeature newFeature, LocalNotificationSyncManager localNotificationSyncManager) {
        NewFeatureManager providesNewFeatureManager = applicationModule.providesNewFeatureManager(sharedPreferences, newFeature, localNotificationSyncManager);
        C10825c.m36718a(providesNewFeatureManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesNewFeatureManager;
    }

    public NewFeatureManager get() {
        return providesNewFeatureManager(this.module, this.sharedPreferencesProvider.get(), this.newFeatureProvider.get(), this.localNotificationSyncManagerProvider.get());
    }
}
