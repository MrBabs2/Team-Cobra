package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.account.view.ImageInfoProvider;
import p015cm.aptoide.p016pt.account.view.ImageValidator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvideImageValidatorFactory */
public final class FragmentModule_ProvideImageValidatorFactory implements C10824b<ImageValidator> {
    private final Provider<ImageInfoProvider> imageInfoProvider;
    private final FragmentModule module;

    public FragmentModule_ProvideImageValidatorFactory(FragmentModule fragmentModule, Provider<ImageInfoProvider> provider) {
        this.module = fragmentModule;
        this.imageInfoProvider = provider;
    }

    public static FragmentModule_ProvideImageValidatorFactory create(FragmentModule fragmentModule, Provider<ImageInfoProvider> provider) {
        return new FragmentModule_ProvideImageValidatorFactory(fragmentModule, provider);
    }

    public static ImageValidator provideImageValidator(FragmentModule fragmentModule, ImageInfoProvider imageInfoProvider2) {
        ImageValidator provideImageValidator = fragmentModule.provideImageValidator(imageInfoProvider2);
        C10825c.m36718a(provideImageValidator, "Cannot return null from a non-@Nullable @Provides method");
        return provideImageValidator;
    }

    public ImageValidator get() {
        return provideImageValidator(this.module, this.imageInfoProvider.get());
    }
}
