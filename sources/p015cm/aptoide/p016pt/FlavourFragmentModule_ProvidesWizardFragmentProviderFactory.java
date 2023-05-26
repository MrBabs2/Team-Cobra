package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.wizard.WizardFragmentProvider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.FlavourFragmentModule_ProvidesWizardFragmentProviderFactory */
public final class FlavourFragmentModule_ProvidesWizardFragmentProviderFactory implements C10824b<WizardFragmentProvider> {
    private final FlavourFragmentModule module;
    private final Provider<ThemeManager> themeManagerProvider;

    public FlavourFragmentModule_ProvidesWizardFragmentProviderFactory(FlavourFragmentModule flavourFragmentModule, Provider<ThemeManager> provider) {
        this.module = flavourFragmentModule;
        this.themeManagerProvider = provider;
    }

    public static FlavourFragmentModule_ProvidesWizardFragmentProviderFactory create(FlavourFragmentModule flavourFragmentModule, Provider<ThemeManager> provider) {
        return new FlavourFragmentModule_ProvidesWizardFragmentProviderFactory(flavourFragmentModule, provider);
    }

    public static WizardFragmentProvider providesWizardFragmentProvider(FlavourFragmentModule flavourFragmentModule, ThemeManager themeManager) {
        WizardFragmentProvider providesWizardFragmentProvider = flavourFragmentModule.providesWizardFragmentProvider(themeManager);
        C10825c.m36718a(providesWizardFragmentProvider, "Cannot return null from a non-@Nullable @Provides method");
        return providesWizardFragmentProvider;
    }

    public WizardFragmentProvider get() {
        return providesWizardFragmentProvider(this.module, this.themeManagerProvider.get());
    }
}
