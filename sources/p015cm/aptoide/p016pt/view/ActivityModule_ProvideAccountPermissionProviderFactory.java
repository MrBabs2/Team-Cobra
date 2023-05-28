package p015cm.aptoide.p016pt.view;

import p015cm.aptoide.p016pt.permission.AccountPermissionProvider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvideAccountPermissionProviderFactory */
public final class ActivityModule_ProvideAccountPermissionProviderFactory implements C10824b<AccountPermissionProvider> {
    private final ActivityModule module;

    public ActivityModule_ProvideAccountPermissionProviderFactory(ActivityModule activityModule) {
        this.module = activityModule;
    }

    public static ActivityModule_ProvideAccountPermissionProviderFactory create(ActivityModule activityModule) {
        return new ActivityModule_ProvideAccountPermissionProviderFactory(activityModule);
    }

    public static AccountPermissionProvider provideAccountPermissionProvider(ActivityModule activityModule) {
        AccountPermissionProvider provideAccountPermissionProvider = activityModule.provideAccountPermissionProvider();
        C10825c.m36718a(provideAccountPermissionProvider, "Cannot return null from a non-@Nullable @Provides method");
        return provideAccountPermissionProvider;
    }

    public AccountPermissionProvider get() {
        return provideAccountPermissionProvider(this.module);
    }
}
