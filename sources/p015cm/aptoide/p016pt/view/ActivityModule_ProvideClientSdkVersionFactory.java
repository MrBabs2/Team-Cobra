package p015cm.aptoide.p016pt.view;

import p320o.p321b.C10824b;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvideClientSdkVersionFactory */
public final class ActivityModule_ProvideClientSdkVersionFactory implements C10824b<Integer> {
    private final ActivityModule module;

    public ActivityModule_ProvideClientSdkVersionFactory(ActivityModule activityModule) {
        this.module = activityModule;
    }

    public static ActivityModule_ProvideClientSdkVersionFactory create(ActivityModule activityModule) {
        return new ActivityModule_ProvideClientSdkVersionFactory(activityModule);
    }

    public static int provideClientSdkVersion(ActivityModule activityModule) {
        return activityModule.provideClientSdkVersion();
    }

    public Integer get() {
        return Integer.valueOf(provideClientSdkVersion(this.module));
    }
}
