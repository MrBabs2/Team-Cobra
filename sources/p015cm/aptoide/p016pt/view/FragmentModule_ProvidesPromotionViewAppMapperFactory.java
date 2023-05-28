package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.DownloadStateParser;
import p015cm.aptoide.p016pt.promotions.PromotionViewAppMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesPromotionViewAppMapperFactory */
public final class FragmentModule_ProvidesPromotionViewAppMapperFactory implements C10824b<PromotionViewAppMapper> {
    private final Provider<DownloadStateParser> downloadStateParserProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesPromotionViewAppMapperFactory(FragmentModule fragmentModule, Provider<DownloadStateParser> provider) {
        this.module = fragmentModule;
        this.downloadStateParserProvider = provider;
    }

    public static FragmentModule_ProvidesPromotionViewAppMapperFactory create(FragmentModule fragmentModule, Provider<DownloadStateParser> provider) {
        return new FragmentModule_ProvidesPromotionViewAppMapperFactory(fragmentModule, provider);
    }

    public static PromotionViewAppMapper providesPromotionViewAppMapper(FragmentModule fragmentModule, DownloadStateParser downloadStateParser) {
        PromotionViewAppMapper providesPromotionViewAppMapper = fragmentModule.providesPromotionViewAppMapper(downloadStateParser);
        C10825c.m36718a(providesPromotionViewAppMapper, "Cannot return null from a non-@Nullable @Provides method");
        return providesPromotionViewAppMapper;
    }

    public PromotionViewAppMapper get() {
        return providesPromotionViewAppMapper(this.module, this.downloadStateParserProvider.get());
    }
}
