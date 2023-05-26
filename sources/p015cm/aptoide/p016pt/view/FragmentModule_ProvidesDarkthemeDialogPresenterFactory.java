package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.feature.NewFeatureDialogPresenter;
import p015cm.aptoide.p016pt.themes.NewFeatureManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesDarkthemeDialogPresenterFactory */
public final class FragmentModule_ProvidesDarkthemeDialogPresenterFactory implements C10824b<NewFeatureDialogPresenter> {
    private final FragmentModule module;
    private final Provider<NewFeatureManager> newFeatureManagerProvider;

    public FragmentModule_ProvidesDarkthemeDialogPresenterFactory(FragmentModule fragmentModule, Provider<NewFeatureManager> provider) {
        this.module = fragmentModule;
        this.newFeatureManagerProvider = provider;
    }

    public static FragmentModule_ProvidesDarkthemeDialogPresenterFactory create(FragmentModule fragmentModule, Provider<NewFeatureManager> provider) {
        return new FragmentModule_ProvidesDarkthemeDialogPresenterFactory(fragmentModule, provider);
    }

    public static NewFeatureDialogPresenter providesDarkthemeDialogPresenter(FragmentModule fragmentModule, NewFeatureManager newFeatureManager) {
        NewFeatureDialogPresenter providesDarkthemeDialogPresenter = fragmentModule.providesDarkthemeDialogPresenter(newFeatureManager);
        C10825c.m36718a(providesDarkthemeDialogPresenter, "Cannot return null from a non-@Nullable @Provides method");
        return providesDarkthemeDialogPresenter;
    }

    public NewFeatureDialogPresenter get() {
        return providesDarkthemeDialogPresenter(this.module, this.newFeatureManagerProvider.get());
    }
}
