package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideApkPathFactory */
public final class ApplicationModule_ProvideApkPathFactory implements C10824b<String> {
    private final Provider<String> cachePathProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideApkPathFactory(ApplicationModule applicationModule, Provider<String> provider) {
        this.module = applicationModule;
        this.cachePathProvider = provider;
    }

    public static ApplicationModule_ProvideApkPathFactory create(ApplicationModule applicationModule, Provider<String> provider) {
        return new ApplicationModule_ProvideApkPathFactory(applicationModule, provider);
    }

    public static String provideApkPath(ApplicationModule applicationModule, String str) {
        String provideApkPath = applicationModule.provideApkPath(str);
        C10825c.m36718a(provideApkPath, "Cannot return null from a non-@Nullable @Provides method");
        return provideApkPath;
    }

    public String get() {
        return provideApkPath(this.module, this.cachePathProvider.get());
    }
}
