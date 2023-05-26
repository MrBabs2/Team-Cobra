package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p320o.p321b.C10824b;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvideLocalVersionCodeFactory */
public final class ActivityModule_ProvideLocalVersionCodeFactory implements C10824b<Integer> {
    private final ActivityModule module;
    private final Provider<String> packageNameProvider;

    public ActivityModule_ProvideLocalVersionCodeFactory(ActivityModule activityModule, Provider<String> provider) {
        this.module = activityModule;
        this.packageNameProvider = provider;
    }

    public static ActivityModule_ProvideLocalVersionCodeFactory create(ActivityModule activityModule, Provider<String> provider) {
        return new ActivityModule_ProvideLocalVersionCodeFactory(activityModule, provider);
    }

    public static int provideLocalVersionCode(ActivityModule activityModule, String str) {
        return activityModule.provideLocalVersionCode(str);
    }

    public Integer get() {
        return Integer.valueOf(provideLocalVersionCode(this.module, this.packageNameProvider.get()));
    }
}
