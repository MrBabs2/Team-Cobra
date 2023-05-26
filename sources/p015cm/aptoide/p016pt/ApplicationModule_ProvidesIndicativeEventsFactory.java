package p015cm.aptoide.p016pt;

import java.util.Collection;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesIndicativeEventsFactory */
public final class ApplicationModule_ProvidesIndicativeEventsFactory implements C10824b<Collection<String>> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesIndicativeEventsFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesIndicativeEventsFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesIndicativeEventsFactory(applicationModule);
    }

    public static Collection<String> providesIndicativeEvents(ApplicationModule applicationModule) {
        Collection<String> providesIndicativeEvents = applicationModule.providesIndicativeEvents();
        C10825c.m36718a(providesIndicativeEvents, "Cannot return null from a non-@Nullable @Provides method");
        return providesIndicativeEvents;
    }

    public Collection<String> get() {
        return providesIndicativeEvents(this.module);
    }
}
