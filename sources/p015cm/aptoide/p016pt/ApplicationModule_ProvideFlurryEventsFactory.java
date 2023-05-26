package p015cm.aptoide.p016pt;

import java.util.Collection;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideFlurryEventsFactory */
public final class ApplicationModule_ProvideFlurryEventsFactory implements C10824b<Collection<String>> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideFlurryEventsFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideFlurryEventsFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideFlurryEventsFactory(applicationModule);
    }

    public static Collection<String> provideFlurryEvents(ApplicationModule applicationModule) {
        Collection<String> provideFlurryEvents = applicationModule.provideFlurryEvents();
        C10825c.m36718a(provideFlurryEvents, "Cannot return null from a non-@Nullable @Provides method");
        return provideFlurryEvents;
    }

    public Collection<String> get() {
        return provideFlurryEvents(this.module);
    }
}
