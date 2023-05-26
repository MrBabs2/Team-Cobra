package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideImageCachePatchFactory */
public final class ApplicationModule_ProvideImageCachePatchFactory implements C10824b<String> {
    private final Provider<String> cachePathProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideImageCachePatchFactory(ApplicationModule applicationModule, Provider<String> provider) {
        this.module = applicationModule;
        this.cachePathProvider = provider;
    }

    public static ApplicationModule_ProvideImageCachePatchFactory create(ApplicationModule applicationModule, Provider<String> provider) {
        return new ApplicationModule_ProvideImageCachePatchFactory(applicationModule, provider);
    }

    public static String provideImageCachePatch(ApplicationModule applicationModule, String str) {
        String provideImageCachePatch = applicationModule.provideImageCachePatch(str);
        C10825c.m36718a(provideImageCachePatch, "Cannot return null from a non-@Nullable @Provides method");
        return provideImageCachePatch;
    }

    public String get() {
        return provideImageCachePatch(this.module, this.cachePathProvider.get());
    }
}
