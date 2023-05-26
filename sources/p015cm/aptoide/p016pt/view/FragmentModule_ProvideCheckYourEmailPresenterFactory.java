package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.account.view.magiclink.CheckYourEmailNavigator;
import p015cm.aptoide.p016pt.account.view.magiclink.CheckYourEmailPresenter;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvideCheckYourEmailPresenterFactory */
public final class FragmentModule_ProvideCheckYourEmailPresenterFactory implements C10824b<CheckYourEmailPresenter> {
    private final FragmentModule module;
    private final Provider<CheckYourEmailNavigator> navigatorProvider;

    public FragmentModule_ProvideCheckYourEmailPresenterFactory(FragmentModule fragmentModule, Provider<CheckYourEmailNavigator> provider) {
        this.module = fragmentModule;
        this.navigatorProvider = provider;
    }

    public static FragmentModule_ProvideCheckYourEmailPresenterFactory create(FragmentModule fragmentModule, Provider<CheckYourEmailNavigator> provider) {
        return new FragmentModule_ProvideCheckYourEmailPresenterFactory(fragmentModule, provider);
    }

    public static CheckYourEmailPresenter provideCheckYourEmailPresenter(FragmentModule fragmentModule, CheckYourEmailNavigator checkYourEmailNavigator) {
        CheckYourEmailPresenter provideCheckYourEmailPresenter = fragmentModule.provideCheckYourEmailPresenter(checkYourEmailNavigator);
        C10825c.m36718a(provideCheckYourEmailPresenter, "Cannot return null from a non-@Nullable @Provides method");
        return provideCheckYourEmailPresenter;
    }

    public CheckYourEmailPresenter get() {
        return provideCheckYourEmailPresenter(this.module, this.navigatorProvider.get());
    }
}
