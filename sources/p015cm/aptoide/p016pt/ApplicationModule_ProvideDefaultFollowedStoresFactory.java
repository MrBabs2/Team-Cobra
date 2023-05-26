package p015cm.aptoide.p016pt;

import java.util.List;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideDefaultFollowedStoresFactory */
public final class ApplicationModule_ProvideDefaultFollowedStoresFactory implements C10824b<List<String>> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideDefaultFollowedStoresFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideDefaultFollowedStoresFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideDefaultFollowedStoresFactory(applicationModule);
    }

    public static List<String> provideDefaultFollowedStores(ApplicationModule applicationModule) {
        List<String> provideDefaultFollowedStores = applicationModule.provideDefaultFollowedStores();
        C10825c.m36718a(provideDefaultFollowedStores, "Cannot return null from a non-@Nullable @Provides method");
        return provideDefaultFollowedStores;
    }

    public List<String> get() {
        return provideDefaultFollowedStores(this.module);
    }
}
