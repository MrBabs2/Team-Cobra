package p015cm.aptoide.p016pt;

import java.util.Collection;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideFacebookEventsFactory */
public final class ApplicationModule_ProvideFacebookEventsFactory implements C10824b<Collection<String>> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideFacebookEventsFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideFacebookEventsFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideFacebookEventsFactory(applicationModule);
    }

    public static Collection<String> provideFacebookEvents(ApplicationModule applicationModule) {
        Collection<String> provideFacebookEvents = applicationModule.provideFacebookEvents();
        C10825c.m36718a(provideFacebookEvents, "Cannot return null from a non-@Nullable @Provides method");
        return provideFacebookEvents;
    }

    public Collection<String> get() {
        return provideFacebookEvents(this.module);
    }
}
