package p015cm.aptoide.p016pt.download.view.outofspace;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.fragment.BaseDialogFragment_MembersInjector;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.download.view.outofspace.OutOfSpaceDialogFragment_MembersInjector */
public final class OutOfSpaceDialogFragment_MembersInjector implements C10822a<OutOfSpaceDialogFragment> {
    private final Provider<OutOfSpaceDialogPresenter> presenterProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public OutOfSpaceDialogFragment_MembersInjector(Provider<ThemeManager> provider, Provider<OutOfSpaceDialogPresenter> provider2) {
        this.themeManagerProvider = provider;
        this.presenterProvider = provider2;
    }

    public static C10822a<OutOfSpaceDialogFragment> create(Provider<ThemeManager> provider, Provider<OutOfSpaceDialogPresenter> provider2) {
        return new OutOfSpaceDialogFragment_MembersInjector(provider, provider2);
    }

    public static void injectPresenter(OutOfSpaceDialogFragment outOfSpaceDialogFragment, OutOfSpaceDialogPresenter outOfSpaceDialogPresenter) {
        outOfSpaceDialogFragment.presenter = outOfSpaceDialogPresenter;
    }

    public void injectMembers(OutOfSpaceDialogFragment outOfSpaceDialogFragment) {
        BaseDialogFragment_MembersInjector.injectThemeManager(outOfSpaceDialogFragment, this.themeManagerProvider.get());
        injectPresenter(outOfSpaceDialogFragment, this.presenterProvider.get());
    }
}
