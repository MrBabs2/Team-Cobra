package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.install.FilePathProvider;
import p015cm.aptoide.p016pt.install.InstallAppSizeValidator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesInstallAppSizeValidatorFactory */
public final class ApplicationModule_ProvidesInstallAppSizeValidatorFactory implements C10824b<InstallAppSizeValidator> {
    private final Provider<FilePathProvider> filePathProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesInstallAppSizeValidatorFactory(ApplicationModule applicationModule, Provider<FilePathProvider> provider) {
        this.module = applicationModule;
        this.filePathProvider = provider;
    }

    public static ApplicationModule_ProvidesInstallAppSizeValidatorFactory create(ApplicationModule applicationModule, Provider<FilePathProvider> provider) {
        return new ApplicationModule_ProvidesInstallAppSizeValidatorFactory(applicationModule, provider);
    }

    public static InstallAppSizeValidator providesInstallAppSizeValidator(ApplicationModule applicationModule, FilePathProvider filePathProvider2) {
        InstallAppSizeValidator providesInstallAppSizeValidator = applicationModule.providesInstallAppSizeValidator(filePathProvider2);
        C10825c.m36718a(providesInstallAppSizeValidator, "Cannot return null from a non-@Nullable @Provides method");
        return providesInstallAppSizeValidator;
    }

    public InstallAppSizeValidator get() {
        return providesInstallAppSizeValidator(this.module, this.filePathProvider.get());
    }
}
