package p015cm.aptoide.p016pt.view.fragment;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.view.fragment.BaseDialogFragment_MembersInjector */
public final class BaseDialogFragment_MembersInjector implements C10822a<BaseDialogFragment> {
    private final Provider<ThemeManager> themeManagerProvider;

    public BaseDialogFragment_MembersInjector(Provider<ThemeManager> provider) {
        this.themeManagerProvider = provider;
    }

    public static C10822a<BaseDialogFragment> create(Provider<ThemeManager> provider) {
        return new BaseDialogFragment_MembersInjector(provider);
    }

    public static void injectThemeManager(BaseDialogFragment baseDialogFragment, ThemeManager themeManager) {
        baseDialogFragment.themeManager = themeManager;
    }

    public void injectMembers(BaseDialogFragment baseDialogFragment) {
        injectThemeManager(baseDialogFragment, this.themeManagerProvider.get());
    }
}
