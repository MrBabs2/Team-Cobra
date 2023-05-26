package p015cm.aptoide.p016pt.view.wizard;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.util.MarketResourceFormatter;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.view.wizard.WizardPageTwoFragment_MembersInjector */
public final class WizardPageTwoFragment_MembersInjector implements C10822a<WizardPageTwoFragment> {
    private final Provider<MarketResourceFormatter> marketResourceFormatterProvider;

    public WizardPageTwoFragment_MembersInjector(Provider<MarketResourceFormatter> provider) {
        this.marketResourceFormatterProvider = provider;
    }

    public static C10822a<WizardPageTwoFragment> create(Provider<MarketResourceFormatter> provider) {
        return new WizardPageTwoFragment_MembersInjector(provider);
    }

    public static void injectMarketResourceFormatter(WizardPageTwoFragment wizardPageTwoFragment, MarketResourceFormatter marketResourceFormatter) {
        wizardPageTwoFragment.marketResourceFormatter = marketResourceFormatter;
    }

    public void injectMembers(WizardPageTwoFragment wizardPageTwoFragment) {
        injectMarketResourceFormatter(wizardPageTwoFragment, this.marketResourceFormatterProvider.get());
    }
}
