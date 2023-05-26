package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.account.AgentPersistence;
import p015cm.aptoide.p016pt.account.view.magiclink.SendMagicLinkNavigator;
import p015cm.aptoide.p016pt.account.view.magiclink.SendMagicLinkPresenter;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvideSendMagicLinkPresenterFactory */
public final class FragmentModule_ProvideSendMagicLinkPresenterFactory implements C10824b<SendMagicLinkPresenter> {
    private final Provider<AptoideAccountManager> accountManagerProvider;
    private final Provider<AgentPersistence> agentPersitenceProvider;
    private final FragmentModule module;
    private final Provider<SendMagicLinkNavigator> navigatorProvider;

    public FragmentModule_ProvideSendMagicLinkPresenterFactory(FragmentModule fragmentModule, Provider<AptoideAccountManager> provider, Provider<SendMagicLinkNavigator> provider2, Provider<AgentPersistence> provider3) {
        this.module = fragmentModule;
        this.accountManagerProvider = provider;
        this.navigatorProvider = provider2;
        this.agentPersitenceProvider = provider3;
    }

    public static FragmentModule_ProvideSendMagicLinkPresenterFactory create(FragmentModule fragmentModule, Provider<AptoideAccountManager> provider, Provider<SendMagicLinkNavigator> provider2, Provider<AgentPersistence> provider3) {
        return new FragmentModule_ProvideSendMagicLinkPresenterFactory(fragmentModule, provider, provider2, provider3);
    }

    public static SendMagicLinkPresenter provideSendMagicLinkPresenter(FragmentModule fragmentModule, AptoideAccountManager aptoideAccountManager, SendMagicLinkNavigator sendMagicLinkNavigator, AgentPersistence agentPersistence) {
        SendMagicLinkPresenter provideSendMagicLinkPresenter = fragmentModule.provideSendMagicLinkPresenter(aptoideAccountManager, sendMagicLinkNavigator, agentPersistence);
        C10825c.m36718a(provideSendMagicLinkPresenter, "Cannot return null from a non-@Nullable @Provides method");
        return provideSendMagicLinkPresenter;
    }

    public SendMagicLinkPresenter get() {
        return provideSendMagicLinkPresenter(this.module, this.accountManagerProvider.get(), this.navigatorProvider.get(), this.agentPersitenceProvider.get());
    }
}
