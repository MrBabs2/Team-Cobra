package p015cm.aptoide.p016pt.view.wizard;

import javax.inject.Provider;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.view.wizard.WizardFragment_MembersInjector */
public final class WizardFragment_MembersInjector implements C10822a<WizardFragment> {
    private final Provider<WizardFragmentProvider> wizardFragmentProvider;
    private final Provider<WizardPresenter> wizardPresenterProvider;

    public WizardFragment_MembersInjector(Provider<WizardPresenter> provider, Provider<WizardFragmentProvider> provider2) {
        this.wizardPresenterProvider = provider;
        this.wizardFragmentProvider = provider2;
    }

    public static C10822a<WizardFragment> create(Provider<WizardPresenter> provider, Provider<WizardFragmentProvider> provider2) {
        return new WizardFragment_MembersInjector(provider, provider2);
    }

    public static void injectWizardFragmentProvider(WizardFragment wizardFragment, WizardFragmentProvider wizardFragmentProvider2) {
        wizardFragment.wizardFragmentProvider = wizardFragmentProvider2;
    }

    public static void injectWizardPresenter(WizardFragment wizardFragment, WizardPresenter wizardPresenter) {
        wizardFragment.wizardPresenter = wizardPresenter;
    }

    public void injectMembers(WizardFragment wizardFragment) {
        injectWizardPresenter(wizardFragment, this.wizardPresenterProvider.get());
        injectWizardFragmentProvider(wizardFragment, this.wizardFragmentProvider.get());
    }
}
