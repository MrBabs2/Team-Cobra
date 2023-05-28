package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.home.bundles.ads.AdMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAdMapperFactory */
public final class ApplicationModule_ProvidesAdMapperFactory implements C10824b<AdMapper> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAdMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesAdMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesAdMapperFactory(applicationModule);
    }

    public static AdMapper providesAdMapper(ApplicationModule applicationModule) {
        AdMapper providesAdMapper = applicationModule.providesAdMapper();
        C10825c.m36718a(providesAdMapper, "Cannot return null from a non-@Nullable @Provides method");
        return providesAdMapper;
    }

    public AdMapper get() {
        return providesAdMapper(this.module);
    }
}
