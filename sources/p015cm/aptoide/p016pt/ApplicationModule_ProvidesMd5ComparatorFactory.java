package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.download.Md5Comparator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesMd5ComparatorFactory */
public final class ApplicationModule_ProvidesMd5ComparatorFactory implements C10824b<Md5Comparator> {
    private final Provider<String> cachePathProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesMd5ComparatorFactory(ApplicationModule applicationModule, Provider<String> provider) {
        this.module = applicationModule;
        this.cachePathProvider = provider;
    }

    public static ApplicationModule_ProvidesMd5ComparatorFactory create(ApplicationModule applicationModule, Provider<String> provider) {
        return new ApplicationModule_ProvidesMd5ComparatorFactory(applicationModule, provider);
    }

    public static Md5Comparator providesMd5Comparator(ApplicationModule applicationModule, String str) {
        Md5Comparator providesMd5Comparator = applicationModule.providesMd5Comparator(str);
        C10825c.m36718a(providesMd5Comparator, "Cannot return null from a non-@Nullable @Provides method");
        return providesMd5Comparator;
    }

    public Md5Comparator get() {
        return providesMd5Comparator(this.module, this.cachePathProvider.get());
    }
}
