package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceManager;
import p015cm.aptoide.p016pt.install.InstallAppSizeValidator;
import p015cm.aptoide.p016pt.install.InstallManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesOutOfSpaceManagerFactory */
public final class FragmentModule_ProvidesOutOfSpaceManagerFactory implements C10824b<OutOfSpaceManager> {
    private final Provider<InstallAppSizeValidator> installAppSizeValidatorProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesOutOfSpaceManagerFactory(FragmentModule fragmentModule, Provider<InstallManager> provider, Provider<InstallAppSizeValidator> provider2) {
        this.module = fragmentModule;
        this.installManagerProvider = provider;
        this.installAppSizeValidatorProvider = provider2;
    }

    public static FragmentModule_ProvidesOutOfSpaceManagerFactory create(FragmentModule fragmentModule, Provider<InstallManager> provider, Provider<InstallAppSizeValidator> provider2) {
        return new FragmentModule_ProvidesOutOfSpaceManagerFactory(fragmentModule, provider, provider2);
    }

    public static OutOfSpaceManager providesOutOfSpaceManager(FragmentModule fragmentModule, InstallManager installManager, InstallAppSizeValidator installAppSizeValidator) {
        OutOfSpaceManager providesOutOfSpaceManager = fragmentModule.providesOutOfSpaceManager(installManager, installAppSizeValidator);
        C10825c.m36718a(providesOutOfSpaceManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesOutOfSpaceManager;
    }

    public OutOfSpaceManager get() {
        return providesOutOfSpaceManager(this.module, this.installManagerProvider.get(), this.installAppSizeValidatorProvider.get());
    }
}
