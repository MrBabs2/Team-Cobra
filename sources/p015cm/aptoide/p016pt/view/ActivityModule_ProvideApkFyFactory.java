package p015cm.aptoide.p016pt.view;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p015cm.aptoide.p016pt.util.ApkFyManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvideApkFyFactory */
public final class ActivityModule_ProvideApkFyFactory implements C10824b<ApkFyManager> {
    private final ActivityModule module;
    private final Provider<SharedPreferences> securePreferencesProvider;

    public ActivityModule_ProvideApkFyFactory(ActivityModule activityModule, Provider<SharedPreferences> provider) {
        this.module = activityModule;
        this.securePreferencesProvider = provider;
    }

    public static ActivityModule_ProvideApkFyFactory create(ActivityModule activityModule, Provider<SharedPreferences> provider) {
        return new ActivityModule_ProvideApkFyFactory(activityModule, provider);
    }

    public static ApkFyManager provideApkFy(ActivityModule activityModule, SharedPreferences sharedPreferences) {
        ApkFyManager provideApkFy = activityModule.provideApkFy(sharedPreferences);
        C10825c.m36718a(provideApkFy, "Cannot return null from a non-@Nullable @Provides method");
        return provideApkFy;
    }

    public ApkFyManager get() {
        return provideApkFy(this.module, this.securePreferencesProvider.get());
    }
}
