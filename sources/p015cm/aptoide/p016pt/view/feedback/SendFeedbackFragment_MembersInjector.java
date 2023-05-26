package p015cm.aptoide.p016pt.view.feedback;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.view.feedback.SendFeedbackFragment_MembersInjector */
public final class SendFeedbackFragment_MembersInjector implements C10822a<SendFeedbackFragment> {
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;

    public SendFeedbackFragment_MembersInjector(Provider<AptoideInstalledAppsRepository> provider) {
        this.aptoideInstalledAppsRepositoryProvider = provider;
    }

    public static C10822a<SendFeedbackFragment> create(Provider<AptoideInstalledAppsRepository> provider) {
        return new SendFeedbackFragment_MembersInjector(provider);
    }

    public static void injectAptoideInstalledAppsRepository(SendFeedbackFragment sendFeedbackFragment, AptoideInstalledAppsRepository aptoideInstalledAppsRepository) {
        sendFeedbackFragment.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository;
    }

    public void injectMembers(SendFeedbackFragment sendFeedbackFragment) {
        injectAptoideInstalledAppsRepository(sendFeedbackFragment, this.aptoideInstalledAppsRepositoryProvider.get());
    }
}
