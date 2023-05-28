package p015cm.aptoide.p016pt;

import java.util.Map;
import p015cm.aptoide.p016pt.navigator.Result;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideFragmentNavigatorMapFactory */
public final class ApplicationModule_ProvideFragmentNavigatorMapFactory implements C10824b<Map<Integer, Result>> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideFragmentNavigatorMapFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideFragmentNavigatorMapFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideFragmentNavigatorMapFactory(applicationModule);
    }

    public static Map<Integer, Result> provideFragmentNavigatorMap(ApplicationModule applicationModule) {
        Map<Integer, Result> provideFragmentNavigatorMap = applicationModule.provideFragmentNavigatorMap();
        C10825c.m36718a(provideFragmentNavigatorMap, "Cannot return null from a non-@Nullable @Provides method");
        return provideFragmentNavigatorMap;
    }

    public Map<Integer, Result> get() {
        return provideFragmentNavigatorMap(this.module);
    }
}
