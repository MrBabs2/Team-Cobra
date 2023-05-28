package p015cm.aptoide.p016pt.themes;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.feature.NewFeatureDialogPresenter;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.themes.NewFeatureDialogFragment_MembersInjector */
public final class NewFeatureDialogFragment_MembersInjector implements C10822a<NewFeatureDialogFragment> {
    private final Provider<NewFeatureDialogPresenter> presenterProvider;

    public NewFeatureDialogFragment_MembersInjector(Provider<NewFeatureDialogPresenter> provider) {
        this.presenterProvider = provider;
    }

    public static C10822a<NewFeatureDialogFragment> create(Provider<NewFeatureDialogPresenter> provider) {
        return new NewFeatureDialogFragment_MembersInjector(provider);
    }

    public static void injectPresenter(NewFeatureDialogFragment newFeatureDialogFragment, NewFeatureDialogPresenter newFeatureDialogPresenter) {
        newFeatureDialogFragment.presenter = newFeatureDialogPresenter;
    }

    public void injectMembers(NewFeatureDialogFragment newFeatureDialogFragment) {
        injectPresenter(newFeatureDialogFragment, this.presenterProvider.get());
    }
}
