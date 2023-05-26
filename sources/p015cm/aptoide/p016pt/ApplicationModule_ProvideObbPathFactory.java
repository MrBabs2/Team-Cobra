package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideObbPathFactory */
public final class ApplicationModule_ProvideObbPathFactory implements C10824b<String> {
    private final Provider<String> cachePathProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideObbPathFactory(ApplicationModule applicationModule, Provider<String> provider) {
        this.module = applicationModule;
        this.cachePathProvider = provider;
    }

    public static ApplicationModule_ProvideObbPathFactory create(ApplicationModule applicationModule, Provider<String> provider) {
        return new ApplicationModule_ProvideObbPathFactory(applicationModule, provider);
    }

    public static String provideObbPath(ApplicationModule applicationModule, String str) {
        String provideObbPath = applicationModule.provideObbPath(str);
        C10825c.m36718a(provideObbPath, "Cannot return null from a non-@Nullable @Provides method");
        return provideObbPath;
    }

    public String get() {
        return provideObbPath(this.module, this.cachePathProvider.get());
    }
}
