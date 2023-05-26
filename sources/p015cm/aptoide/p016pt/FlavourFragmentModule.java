package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.FragmentScope;
import p015cm.aptoide.p016pt.view.wizard.WizardFragmentProvider;

/* renamed from: cm.aptoide.pt.FlavourFragmentModule */
public class FlavourFragmentModule {
    /* access modifiers changed from: package-private */
    @FragmentScope
    public WizardFragmentProvider providesWizardFragmentProvider(ThemeManager themeManager) {
        return new WizardFragmentProvider(themeManager);
    }
}
