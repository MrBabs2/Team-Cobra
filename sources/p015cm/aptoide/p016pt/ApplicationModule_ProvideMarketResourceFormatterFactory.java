package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.util.MarketResourceFormatter;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideMarketResourceFormatterFactory */
public final class ApplicationModule_ProvideMarketResourceFormatterFactory implements C10824b<MarketResourceFormatter> {
    private final Provider<String> marketNameProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideMarketResourceFormatterFactory(ApplicationModule applicationModule, Provider<String> provider) {
        this.module = applicationModule;
        this.marketNameProvider = provider;
    }

    public static ApplicationModule_ProvideMarketResourceFormatterFactory create(ApplicationModule applicationModule, Provider<String> provider) {
        return new ApplicationModule_ProvideMarketResourceFormatterFactory(applicationModule, provider);
    }

    public static MarketResourceFormatter provideMarketResourceFormatter(ApplicationModule applicationModule, String str) {
        MarketResourceFormatter provideMarketResourceFormatter = applicationModule.provideMarketResourceFormatter(str);
        C10825c.m36718a(provideMarketResourceFormatter, "Cannot return null from a non-@Nullable @Provides method");
        return provideMarketResourceFormatter;
    }

    public MarketResourceFormatter get() {
        return provideMarketResourceFormatter(this.module, this.marketNameProvider.get());
    }
}
