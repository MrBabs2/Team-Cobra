package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.install.FilePathProvider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_FilePathManagerFactory */
public final class ApplicationModule_FilePathManagerFactory implements C10824b<FilePathProvider> {
    private final Provider<String> apkPathProvider;
    private final Provider<String> cachePathProvider;
    private final ApplicationModule module;
    private final Provider<String> obbPathProvider;

    public ApplicationModule_FilePathManagerFactory(ApplicationModule applicationModule, Provider<String> provider, Provider<String> provider2, Provider<String> provider3) {
        this.module = applicationModule;
        this.cachePathProvider = provider;
        this.apkPathProvider = provider2;
        this.obbPathProvider = provider3;
    }

    public static ApplicationModule_FilePathManagerFactory create(ApplicationModule applicationModule, Provider<String> provider, Provider<String> provider2, Provider<String> provider3) {
        return new ApplicationModule_FilePathManagerFactory(applicationModule, provider, provider2, provider3);
    }

    public static FilePathProvider filePathManager(ApplicationModule applicationModule, String str, String str2, String str3) {
        FilePathProvider filePathManager = applicationModule.filePathManager(str, str2, str3);
        C10825c.m36718a(filePathManager, "Cannot return null from a non-@Nullable @Provides method");
        return filePathManager;
    }

    public FilePathProvider get() {
        return filePathManager(this.module, this.cachePathProvider.get(), this.apkPathProvider.get(), this.obbPathProvider.get());
    }
}
