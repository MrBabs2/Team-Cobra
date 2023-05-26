package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.DownloadStateParser;
import p015cm.aptoide.p016pt.promotions.PromotionViewAppMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesPromotionViewAppMapperFactory */
public final class ApplicationModule_ProvidesPromotionViewAppMapperFactory implements C10824b<PromotionViewAppMapper> {
    private final Provider<DownloadStateParser> downloadStateParserProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesPromotionViewAppMapperFactory(ApplicationModule applicationModule, Provider<DownloadStateParser> provider) {
        this.module = applicationModule;
        this.downloadStateParserProvider = provider;
    }

    public static ApplicationModule_ProvidesPromotionViewAppMapperFactory create(ApplicationModule applicationModule, Provider<DownloadStateParser> provider) {
        return new ApplicationModule_ProvidesPromotionViewAppMapperFactory(applicationModule, provider);
    }

    public static PromotionViewAppMapper providesPromotionViewAppMapper(ApplicationModule applicationModule, DownloadStateParser downloadStateParser) {
        PromotionViewAppMapper providesPromotionViewAppMapper = applicationModule.providesPromotionViewAppMapper(downloadStateParser);
        C10825c.m36718a(providesPromotionViewAppMapper, "Cannot return null from a non-@Nullable @Provides method");
        return providesPromotionViewAppMapper;
    }

    public PromotionViewAppMapper get() {
        return providesPromotionViewAppMapper(this.module, this.downloadStateParserProvider.get());
    }
}
