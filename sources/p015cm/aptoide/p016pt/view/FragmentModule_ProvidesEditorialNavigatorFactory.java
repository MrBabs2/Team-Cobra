package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.editorial.EditorialNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.socialmedia.SocialMediaNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesEditorialNavigatorFactory */
public final class FragmentModule_ProvidesEditorialNavigatorFactory implements C10824b<EditorialNavigator> {
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<AppNavigator> appNavigatorProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final FragmentModule module;
    private final Provider<SocialMediaNavigator> socialMediaNavigatorProvider;

    public FragmentModule_ProvidesEditorialNavigatorFactory(FragmentModule fragmentModule, Provider<AppNavigator> provider, Provider<AccountNavigator> provider2, Provider<SocialMediaNavigator> provider3, Provider<FragmentNavigator> provider4) {
        this.module = fragmentModule;
        this.appNavigatorProvider = provider;
        this.accountNavigatorProvider = provider2;
        this.socialMediaNavigatorProvider = provider3;
        this.fragmentNavigatorProvider = provider4;
    }

    public static FragmentModule_ProvidesEditorialNavigatorFactory create(FragmentModule fragmentModule, Provider<AppNavigator> provider, Provider<AccountNavigator> provider2, Provider<SocialMediaNavigator> provider3, Provider<FragmentNavigator> provider4) {
        return new FragmentModule_ProvidesEditorialNavigatorFactory(fragmentModule, provider, provider2, provider3, provider4);
    }

    public static EditorialNavigator providesEditorialNavigator(FragmentModule fragmentModule, AppNavigator appNavigator, AccountNavigator accountNavigator, SocialMediaNavigator socialMediaNavigator, FragmentNavigator fragmentNavigator) {
        EditorialNavigator providesEditorialNavigator = fragmentModule.providesEditorialNavigator(appNavigator, accountNavigator, socialMediaNavigator, fragmentNavigator);
        C10825c.m36718a(providesEditorialNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return providesEditorialNavigator;
    }

    public EditorialNavigator get() {
        return providesEditorialNavigator(this.module, this.appNavigatorProvider.get(), this.accountNavigatorProvider.get(), this.socialMediaNavigatorProvider.get(), this.fragmentNavigatorProvider.get());
    }
}
