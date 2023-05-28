package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.download.AppValidator;
import p015cm.aptoide.p016pt.download.DownloadApkPathsProvider;
import p015cm.aptoide.p016pt.download.DownloadFactory;
import p015cm.aptoide.p016pt.download.SplitTypeSubFileTypeMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideDownloadFactoryFactory */
public final class ApplicationModule_ProvideDownloadFactoryFactory implements C10824b<DownloadFactory> {
    private final Provider<AppValidator> appValidatorProvider;
    private final Provider<String> cachePathProvider;
    private final Provider<DownloadApkPathsProvider> downloadApkPathsProvider;
    private final Provider<String> marketNameProvider;
    private final ApplicationModule module;
    private final Provider<SplitTypeSubFileTypeMapper> splitTypeSubFileTypeMapperProvider;

    public ApplicationModule_ProvideDownloadFactoryFactory(ApplicationModule applicationModule, Provider<String> provider, Provider<DownloadApkPathsProvider> provider2, Provider<String> provider3, Provider<AppValidator> provider4, Provider<SplitTypeSubFileTypeMapper> provider5) {
        this.module = applicationModule;
        this.marketNameProvider = provider;
        this.downloadApkPathsProvider = provider2;
        this.cachePathProvider = provider3;
        this.appValidatorProvider = provider4;
        this.splitTypeSubFileTypeMapperProvider = provider5;
    }

    public static ApplicationModule_ProvideDownloadFactoryFactory create(ApplicationModule applicationModule, Provider<String> provider, Provider<DownloadApkPathsProvider> provider2, Provider<String> provider3, Provider<AppValidator> provider4, Provider<SplitTypeSubFileTypeMapper> provider5) {
        return new ApplicationModule_ProvideDownloadFactoryFactory(applicationModule, provider, provider2, provider3, provider4, provider5);
    }

    public static DownloadFactory provideDownloadFactory(ApplicationModule applicationModule, String str, DownloadApkPathsProvider downloadApkPathsProvider2, String str2, AppValidator appValidator, SplitTypeSubFileTypeMapper splitTypeSubFileTypeMapper) {
        DownloadFactory provideDownloadFactory = applicationModule.provideDownloadFactory(str, downloadApkPathsProvider2, str2, appValidator, splitTypeSubFileTypeMapper);
        C10825c.m36718a(provideDownloadFactory, "Cannot return null from a non-@Nullable @Provides method");
        return provideDownloadFactory;
    }

    public DownloadFactory get() {
        return provideDownloadFactory(this.module, this.marketNameProvider.get(), this.downloadApkPathsProvider.get(), this.cachePathProvider.get(), this.appValidatorProvider.get(), this.splitTypeSubFileTypeMapperProvider.get());
    }
}
