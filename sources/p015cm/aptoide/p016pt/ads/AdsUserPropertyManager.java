package p015cm.aptoide.p016pt.ads;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.Single;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.ads.AdsUserPropertyManager */
public class AdsUserPropertyManager {
    private static final String WALLET_PACKAGE = "com.appcoins.wallet";
    private final AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    private final CrashReport crashReport;
    private final C5373h ioScheduler;
    private final MoPubAdsManager moPubAdsManager;
    private final MoPubAnalytics moPubAnalytics;

    public AdsUserPropertyManager(MoPubAdsManager moPubAdsManager2, AptoideInstalledAppsRepository aptoideInstalledAppsRepository2, MoPubAnalytics moPubAnalytics2, CrashReport crashReport2, C5373h hVar) {
        this.moPubAdsManager = moPubAdsManager2;
        this.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository2;
        this.crashReport = crashReport2;
        this.moPubAnalytics = moPubAnalytics2;
        this.ioScheduler = hVar;
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m4528a(WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        return Boolean.valueOf(offerResponseStatus != WalletAdsOfferManager.OfferResponseStatus.NO_ADS);
    }

    /* renamed from: b */
    static /* synthetic */ void m4529b(WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo6686b(Boolean bool) {
        return this.moPubAdsManager.getAdsVisibilityStatus().mo18567c();
    }

    public C5328b setUp(String str) {
        return this.aptoideInstalledAppsRepository.isInstalled(WALLET_PACKAGE).mo18669c().mo18644a(this.ioScheduler).mo18656b().mo18692i(new C1370y(this)).mo18664b(new C1342c0(this, str)).mo18696k();
    }

    public void start() {
        C5368e<R> f = this.aptoideInstalledAppsRepository.isInstalled(WALLET_PACKAGE).mo18644a(this.ioScheduler).mo18656b().mo18687f(new C1338a0(this));
        MoPubAnalytics moPubAnalytics2 = this.moPubAnalytics;
        moPubAnalytics2.getClass();
        f.mo18664b((C5378b<? super R>) new C1353h0(moPubAnalytics2)).mo18706r(C1340b0.f3782f).mo18655a(C1371z.f3833f, (C5378b<Throwable>) new C1369x(this));
    }

    /* renamed from: a */
    public /* synthetic */ void mo6685a(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ Single mo6683a(Boolean bool) {
        return this.moPubAdsManager.getAdsVisibilityStatus();
    }

    /* renamed from: a */
    public /* synthetic */ void mo6684a(String str, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        this.moPubAnalytics.setAdsVisibilityUserProperty(offerResponseStatus);
        this.moPubAnalytics.setUserId(str);
    }
}
