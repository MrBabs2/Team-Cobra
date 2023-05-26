package p015cm.aptoide.p016pt.view;

import p015cm.aptoide.p016pt.account.view.LoginSignUpCredentialsConfiguration;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesLoginSignUpCredentialsConfigurationFactory */
public final class C4494xd0ca61e4 implements C10824b<LoginSignUpCredentialsConfiguration> {
    private final FragmentModule module;

    public C4494xd0ca61e4(FragmentModule fragmentModule) {
        this.module = fragmentModule;
    }

    public static C4494xd0ca61e4 create(FragmentModule fragmentModule) {
        return new C4494xd0ca61e4(fragmentModule);
    }

    public static LoginSignUpCredentialsConfiguration providesLoginSignUpCredentialsConfiguration(FragmentModule fragmentModule) {
        LoginSignUpCredentialsConfiguration providesLoginSignUpCredentialsConfiguration = fragmentModule.providesLoginSignUpCredentialsConfiguration();
        C10825c.m36718a(providesLoginSignUpCredentialsConfiguration, "Cannot return null from a non-@Nullable @Provides method");
        return providesLoginSignUpCredentialsConfiguration;
    }

    public LoginSignUpCredentialsConfiguration get() {
        return providesLoginSignUpCredentialsConfiguration(this.module);
    }
}
