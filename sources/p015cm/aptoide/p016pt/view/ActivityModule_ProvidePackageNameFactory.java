package p015cm.aptoide.p016pt.view;

import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvidePackageNameFactory */
public final class ActivityModule_ProvidePackageNameFactory implements C10824b<String> {
    private final ActivityModule module;

    public ActivityModule_ProvidePackageNameFactory(ActivityModule activityModule) {
        this.module = activityModule;
    }

    public static ActivityModule_ProvidePackageNameFactory create(ActivityModule activityModule) {
        return new ActivityModule_ProvidePackageNameFactory(activityModule);
    }

    public static String providePackageName(ActivityModule activityModule) {
        String providePackageName = activityModule.providePackageName();
        C10825c.m36718a(providePackageName, "Cannot return null from a non-@Nullable @Provides method");
        return providePackageName;
    }

    public String get() {
        return providePackageName(this.module);
    }
}
