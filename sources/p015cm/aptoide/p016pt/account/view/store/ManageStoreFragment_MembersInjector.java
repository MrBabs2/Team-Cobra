package p015cm.aptoide.p016pt.account.view.store;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.account.view.ImagePickerPresenter;
import p015cm.aptoide.p016pt.orientation.ScreenOrientationManager;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.account.view.store.ManageStoreFragment_MembersInjector */
public final class ManageStoreFragment_MembersInjector implements C10822a<ManageStoreFragment> {
    private final Provider<ImagePickerPresenter> imagePickerPresenterProvider;
    private final Provider<ManageStorePresenter> manageStorePresenterProvider;
    private final Provider<ScreenOrientationManager> orientationManagerProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public ManageStoreFragment_MembersInjector(Provider<ImagePickerPresenter> provider, Provider<ManageStorePresenter> provider2, Provider<ScreenOrientationManager> provider3, Provider<ThemeManager> provider4) {
        this.imagePickerPresenterProvider = provider;
        this.manageStorePresenterProvider = provider2;
        this.orientationManagerProvider = provider3;
        this.themeManagerProvider = provider4;
    }

    public static C10822a<ManageStoreFragment> create(Provider<ImagePickerPresenter> provider, Provider<ManageStorePresenter> provider2, Provider<ScreenOrientationManager> provider3, Provider<ThemeManager> provider4) {
        return new ManageStoreFragment_MembersInjector(provider, provider2, provider3, provider4);
    }

    public static void injectImagePickerPresenter(ManageStoreFragment manageStoreFragment, ImagePickerPresenter imagePickerPresenter) {
        manageStoreFragment.imagePickerPresenter = imagePickerPresenter;
    }

    public static void injectManageStorePresenter(ManageStoreFragment manageStoreFragment, ManageStorePresenter manageStorePresenter) {
        manageStoreFragment.manageStorePresenter = manageStorePresenter;
    }

    public static void injectOrientationManager(ManageStoreFragment manageStoreFragment, ScreenOrientationManager screenOrientationManager) {
        manageStoreFragment.orientationManager = screenOrientationManager;
    }

    public static void injectThemeManager(ManageStoreFragment manageStoreFragment, ThemeManager themeManager) {
        manageStoreFragment.themeManager = themeManager;
    }

    public void injectMembers(ManageStoreFragment manageStoreFragment) {
        injectImagePickerPresenter(manageStoreFragment, this.imagePickerPresenterProvider.get());
        injectManageStorePresenter(manageStoreFragment, this.manageStorePresenterProvider.get());
        injectOrientationManager(manageStoreFragment, this.orientationManagerProvider.get());
        injectThemeManager(manageStoreFragment, this.themeManagerProvider.get());
    }
}
