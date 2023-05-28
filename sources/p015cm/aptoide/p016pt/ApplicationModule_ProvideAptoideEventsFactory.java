package p015cm.aptoide.p016pt;

import java.util.Collection;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideAptoideEventsFactory */
public final class ApplicationModule_ProvideAptoideEventsFactory implements C10824b<Collection<String>> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideAptoideEventsFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideAptoideEventsFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideAptoideEventsFactory(applicationModule);
    }

    public static Collection<String> provideAptoideEvents(ApplicationModule applicationModule) {
        Collection<String> provideAptoideEvents = applicationModule.provideAptoideEvents();
        C10825c.m36718a(provideAptoideEvents, "Cannot return null from a non-@Nullable @Provides method");
        return provideAptoideEvents;
    }

    public Collection<String> get() {
        return provideAptoideEvents(this.module);
    }
}
