package p015cm.aptoide.p016pt;

import java.util.Collection;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesRakamEventsFactory */
public final class ApplicationModule_ProvidesRakamEventsFactory implements C10824b<Collection<String>> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesRakamEventsFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesRakamEventsFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesRakamEventsFactory(applicationModule);
    }

    public static Collection<String> providesRakamEvents(ApplicationModule applicationModule) {
        Collection<String> providesRakamEvents = applicationModule.providesRakamEvents();
        C10825c.m36718a(providesRakamEvents, "Cannot return null from a non-@Nullable @Provides method");
        return providesRakamEvents;
    }

    public Collection<String> get() {
        return providesRakamEvents(this.module);
    }
}
