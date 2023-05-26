package p015cm.aptoide.p016pt.view.fragment;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.view.fragment.BaseDialogView_MembersInjector */
public final class BaseDialogView_MembersInjector implements C10822a<BaseDialogView> {
    private final Provider<ThemeManager> themeManagerProvider;

    public BaseDialogView_MembersInjector(Provider<ThemeManager> provider) {
        this.themeManagerProvider = provider;
    }

    public static C10822a<BaseDialogView> create(Provider<ThemeManager> provider) {
        return new BaseDialogView_MembersInjector(provider);
    }

    public void injectMembers(BaseDialogView baseDialogView) {
        BaseDialogFragment_MembersInjector.injectThemeManager(baseDialogView, this.themeManagerProvider.get());
    }
}
