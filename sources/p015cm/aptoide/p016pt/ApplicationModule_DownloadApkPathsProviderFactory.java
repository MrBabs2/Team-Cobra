package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.download.DownloadApkPathsProvider;
import p015cm.aptoide.p016pt.download.OemidProvider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_DownloadApkPathsProviderFactory */
public final class ApplicationModule_DownloadApkPathsProviderFactory implements C10824b<DownloadApkPathsProvider> {
    private final ApplicationModule module;
    private final Provider<OemidProvider> oemidProvider;

    public ApplicationModule_DownloadApkPathsProviderFactory(ApplicationModule applicationModule, Provider<OemidProvider> provider) {
        this.module = applicationModule;
        this.oemidProvider = provider;
    }

    public static ApplicationModule_DownloadApkPathsProviderFactory create(ApplicationModule applicationModule, Provider<OemidProvider> provider) {
        return new ApplicationModule_DownloadApkPathsProviderFactory(applicationModule, provider);
    }

    public static DownloadApkPathsProvider downloadApkPathsProvider(ApplicationModule applicationModule, OemidProvider oemidProvider2) {
        DownloadApkPathsProvider downloadApkPathsProvider = applicationModule.downloadApkPathsProvider(oemidProvider2);
        C10825c.m36718a(downloadApkPathsProvider, "Cannot return null from a non-@Nullable @Provides method");
        return downloadApkPathsProvider;
    }

    public DownloadApkPathsProvider get() {
        return downloadApkPathsProvider(this.module, this.oemidProvider.get());
    }
}
