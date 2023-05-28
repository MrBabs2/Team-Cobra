package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.download.view.DownloadDialogProvider;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesDownloadDialogManagerFactory */
public final class FragmentModule_ProvidesDownloadDialogManagerFactory implements C10824b<DownloadDialogProvider> {
    private final FragmentModule module;
    private final Provider<ThemeManager> themeManagerProvider;

    public FragmentModule_ProvidesDownloadDialogManagerFactory(FragmentModule fragmentModule, Provider<ThemeManager> provider) {
        this.module = fragmentModule;
        this.themeManagerProvider = provider;
    }

    public static FragmentModule_ProvidesDownloadDialogManagerFactory create(FragmentModule fragmentModule, Provider<ThemeManager> provider) {
        return new FragmentModule_ProvidesDownloadDialogManagerFactory(fragmentModule, provider);
    }

    public static DownloadDialogProvider providesDownloadDialogManager(FragmentModule fragmentModule, ThemeManager themeManager) {
        DownloadDialogProvider providesDownloadDialogManager = fragmentModule.providesDownloadDialogManager(themeManager);
        C10825c.m36718a(providesDownloadDialogManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesDownloadDialogManager;
    }

    public DownloadDialogProvider get() {
        return providesDownloadDialogManager(this.module, this.themeManagerProvider.get());
    }
}
