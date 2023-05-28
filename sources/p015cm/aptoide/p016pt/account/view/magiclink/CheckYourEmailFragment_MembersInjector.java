package p015cm.aptoide.p016pt.account.view.magiclink;

import javax.inject.Provider;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.account.view.magiclink.CheckYourEmailFragment_MembersInjector */
public final class CheckYourEmailFragment_MembersInjector implements C10822a<CheckYourEmailFragment> {
    private final Provider<CheckYourEmailPresenter> presenterProvider;

    public CheckYourEmailFragment_MembersInjector(Provider<CheckYourEmailPresenter> provider) {
        this.presenterProvider = provider;
    }

    public static C10822a<CheckYourEmailFragment> create(Provider<CheckYourEmailPresenter> provider) {
        return new CheckYourEmailFragment_MembersInjector(provider);
    }

    public static void injectPresenter(CheckYourEmailFragment checkYourEmailFragment, CheckYourEmailPresenter checkYourEmailPresenter) {
        checkYourEmailFragment.presenter = checkYourEmailPresenter;
    }

    public void injectMembers(CheckYourEmailFragment checkYourEmailFragment) {
        injectPresenter(checkYourEmailFragment, this.presenterProvider.get());
    }
}
