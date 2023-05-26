package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.account.view.ImagePickerNavigator;
import p015cm.aptoide.p016pt.account.view.ImagePickerPresenter;
import p015cm.aptoide.p016pt.account.view.ImageValidator;
import p015cm.aptoide.p016pt.account.view.PhotoFileGenerator;
import p015cm.aptoide.p016pt.account.view.UriToPathResolver;
import p015cm.aptoide.p016pt.permission.AccountPermissionProvider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvideImagePickerPresenterFactory */
public final class FragmentModule_ProvideImagePickerPresenterFactory implements C10824b<ImagePickerPresenter> {
    private final Provider<AccountPermissionProvider> accountPermissionProvider;
    private final Provider<ImagePickerNavigator> imagePickerNavigatorProvider;
    private final Provider<ImageValidator> imageValidatorProvider;
    private final FragmentModule module;
    private final Provider<PhotoFileGenerator> photoFileGeneratorProvider;
    private final Provider<UriToPathResolver> uriToPathResolverProvider;

    public FragmentModule_ProvideImagePickerPresenterFactory(FragmentModule fragmentModule, Provider<AccountPermissionProvider> provider, Provider<PhotoFileGenerator> provider2, Provider<ImageValidator> provider3, Provider<UriToPathResolver> provider4, Provider<ImagePickerNavigator> provider5) {
        this.module = fragmentModule;
        this.accountPermissionProvider = provider;
        this.photoFileGeneratorProvider = provider2;
        this.imageValidatorProvider = provider3;
        this.uriToPathResolverProvider = provider4;
        this.imagePickerNavigatorProvider = provider5;
    }

    public static FragmentModule_ProvideImagePickerPresenterFactory create(FragmentModule fragmentModule, Provider<AccountPermissionProvider> provider, Provider<PhotoFileGenerator> provider2, Provider<ImageValidator> provider3, Provider<UriToPathResolver> provider4, Provider<ImagePickerNavigator> provider5) {
        return new FragmentModule_ProvideImagePickerPresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5);
    }

    public static ImagePickerPresenter provideImagePickerPresenter(FragmentModule fragmentModule, AccountPermissionProvider accountPermissionProvider2, PhotoFileGenerator photoFileGenerator, ImageValidator imageValidator, UriToPathResolver uriToPathResolver, ImagePickerNavigator imagePickerNavigator) {
        ImagePickerPresenter provideImagePickerPresenter = fragmentModule.provideImagePickerPresenter(accountPermissionProvider2, photoFileGenerator, imageValidator, uriToPathResolver, imagePickerNavigator);
        C10825c.m36718a(provideImagePickerPresenter, "Cannot return null from a non-@Nullable @Provides method");
        return provideImagePickerPresenter;
    }

    public ImagePickerPresenter get() {
        return provideImagePickerPresenter(this.module, this.accountPermissionProvider.get(), this.photoFileGeneratorProvider.get(), this.imageValidatorProvider.get(), this.uriToPathResolverProvider.get(), this.imagePickerNavigatorProvider.get());
    }
}
