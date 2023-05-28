package p015cm.aptoide.p016pt;

import java.util.Map;
import p015cm.aptoide.p016pt.navigator.Result;
import p112n.p118g.p119b.C5303a;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideFragmentNavigatorRelayFactory */
public final class ApplicationModule_ProvideFragmentNavigatorRelayFactory implements C10824b<C5303a<Map<Integer, Result>>> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideFragmentNavigatorRelayFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideFragmentNavigatorRelayFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideFragmentNavigatorRelayFactory(applicationModule);
    }

    public static C5303a<Map<Integer, Result>> provideFragmentNavigatorRelay(ApplicationModule applicationModule) {
        C5303a<Map<Integer, Result>> provideFragmentNavigatorRelay = applicationModule.provideFragmentNavigatorRelay();
        C10825c.m36718a(provideFragmentNavigatorRelay, "Cannot return null from a non-@Nullable @Provides method");
        return provideFragmentNavigatorRelay;
    }

    public C5303a<Map<Integer, Result>> get() {
        return provideFragmentNavigatorRelay(this.module);
    }
}
