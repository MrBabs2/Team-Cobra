package p015cm.aptoide.p016pt.notification;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.download.DownloadFactory;
import p015cm.aptoide.p016pt.updates.UpdateRepository;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.notification.PullingContentService_MembersInjector */
public final class PullingContentService_MembersInjector implements C10822a<PullingContentService> {
    private final Provider<DownloadFactory> downloadFactoryProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<UpdateRepository> updateRepositoryProvider;

    public PullingContentService_MembersInjector(Provider<String> provider, Provider<DownloadFactory> provider2, Provider<UpdateRepository> provider3) {
        this.marketNameProvider = provider;
        this.downloadFactoryProvider = provider2;
        this.updateRepositoryProvider = provider3;
    }

    public static C10822a<PullingContentService> create(Provider<String> provider, Provider<DownloadFactory> provider2, Provider<UpdateRepository> provider3) {
        return new PullingContentService_MembersInjector(provider, provider2, provider3);
    }

    public static void injectDownloadFactory(PullingContentService pullingContentService, DownloadFactory downloadFactory) {
        pullingContentService.downloadFactory = downloadFactory;
    }

    public static void injectMarketName(PullingContentService pullingContentService, String str) {
        pullingContentService.marketName = str;
    }

    public static void injectUpdateRepository(PullingContentService pullingContentService, UpdateRepository updateRepository) {
        pullingContentService.updateRepository = updateRepository;
    }

    public void injectMembers(PullingContentService pullingContentService) {
        injectMarketName(pullingContentService, this.marketNameProvider.get());
        injectDownloadFactory(pullingContentService, this.downloadFactoryProvider.get());
        injectUpdateRepository(pullingContentService, this.updateRepositoryProvider.get());
    }
}
