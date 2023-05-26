package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.download.SplitAnalyticsMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_SplitAnalyticsMapperFactory */
public final class ApplicationModule_SplitAnalyticsMapperFactory implements C10824b<SplitAnalyticsMapper> {
    private final ApplicationModule module;

    public ApplicationModule_SplitAnalyticsMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_SplitAnalyticsMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_SplitAnalyticsMapperFactory(applicationModule);
    }

    public static SplitAnalyticsMapper splitAnalyticsMapper(ApplicationModule applicationModule) {
        SplitAnalyticsMapper splitAnalyticsMapper = applicationModule.splitAnalyticsMapper();
        C10825c.m36718a(splitAnalyticsMapper, "Cannot return null from a non-@Nullable @Provides method");
        return splitAnalyticsMapper;
    }

    public SplitAnalyticsMapper get() {
        return splitAnalyticsMapper(this.module);
    }
}
