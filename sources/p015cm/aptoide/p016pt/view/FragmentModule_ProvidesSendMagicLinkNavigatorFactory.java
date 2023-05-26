package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.account.view.magiclink.SendMagicLinkNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesSendMagicLinkNavigatorFactory */
public final class FragmentModule_ProvidesSendMagicLinkNavigatorFactory implements C10824b<SendMagicLinkNavigator> {
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final FragmentModule module;
    private final Provider<ThemeManager> themeManagerProvider;

    public FragmentModule_ProvidesSendMagicLinkNavigatorFactory(FragmentModule fragmentModule, Provider<FragmentNavigator> provider, Provider<ThemeManager> provider2) {
        this.module = fragmentModule;
        this.fragmentNavigatorProvider = provider;
        this.themeManagerProvider = provider2;
    }

    public static FragmentModule_ProvidesSendMagicLinkNavigatorFactory create(FragmentModule fragmentModule, Provider<FragmentNavigator> provider, Provider<ThemeManager> provider2) {
        return new FragmentModule_ProvidesSendMagicLinkNavigatorFactory(fragmentModule, provider, provider2);
    }

    public static SendMagicLinkNavigator providesSendMagicLinkNavigator(FragmentModule fragmentModule, FragmentNavigator fragmentNavigator, ThemeManager themeManager) {
        SendMagicLinkNavigator providesSendMagicLinkNavigator = fragmentModule.providesSendMagicLinkNavigator(fragmentNavigator, themeManager);
        C10825c.m36718a(providesSendMagicLinkNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return providesSendMagicLinkNavigator;
    }

    public SendMagicLinkNavigator get() {
        return providesSendMagicLinkNavigator(this.module, this.fragmentNavigatorProvider.get(), this.themeManagerProvider.get());
    }
}
