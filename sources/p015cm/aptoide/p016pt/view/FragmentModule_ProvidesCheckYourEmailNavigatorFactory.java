package p015cm.aptoide.p016pt.view;

import p015cm.aptoide.p016pt.account.view.magiclink.CheckYourEmailNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesCheckYourEmailNavigatorFactory */
public final class FragmentModule_ProvidesCheckYourEmailNavigatorFactory implements C10824b<CheckYourEmailNavigator> {
    private final FragmentModule module;

    public FragmentModule_ProvidesCheckYourEmailNavigatorFactory(FragmentModule fragmentModule) {
        this.module = fragmentModule;
    }

    public static FragmentModule_ProvidesCheckYourEmailNavigatorFactory create(FragmentModule fragmentModule) {
        return new FragmentModule_ProvidesCheckYourEmailNavigatorFactory(fragmentModule);
    }

    public static CheckYourEmailNavigator providesCheckYourEmailNavigator(FragmentModule fragmentModule) {
        CheckYourEmailNavigator providesCheckYourEmailNavigator = fragmentModule.providesCheckYourEmailNavigator();
        C10825c.m36718a(providesCheckYourEmailNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return providesCheckYourEmailNavigator;
    }

    public CheckYourEmailNavigator get() {
        return providesCheckYourEmailNavigator(this.module);
    }
}
