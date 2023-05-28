package p015cm.aptoide.p016pt.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.dataprovider.model.p018v2.GetAdsResponse;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords.AdsApplicationVersionCodeProvider;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords.GetAdsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords.Location;
import p015cm.aptoide.p016pt.networking.IdsRepository;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p015cm.aptoide.p016pt.utils.p030q.QManager;
import p123rx.C5368e;
import p123rx.p126m.C5379n;
import p123rx.schedulers.Schedulers;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.ads.AdsRepository */
public class AdsRepository {
    private final AptoideAccountManager accountManager;
    private final MinimalAdMapper adMapper;
    private final ConnectivityManager connectivityManager;
    private final Context context;
    private final Converter.Factory converterFactory;
    private final GooglePlayServicesAvailabilityChecker googlePlayServicesAvailabilityChecker;
    private final OkHttpClient httpClient;
    private final IdsRepository idsRepository;
    private final String partnerId;
    private final QManager qManager;
    private final Resources resources;
    private final SharedPreferences sharedPreferences;
    private final AdsApplicationVersionCodeProvider versionCodeProvider;

    public AdsRepository(IdsRepository idsRepository2, AptoideAccountManager aptoideAccountManager, OkHttpClient okHttpClient, Converter.Factory factory, QManager qManager2, SharedPreferences sharedPreferences2, Context context2, ConnectivityManager connectivityManager2, Resources resources2, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider, GooglePlayServicesAvailabilityChecker googlePlayServicesAvailabilityChecker2, String str, MinimalAdMapper minimalAdMapper) {
        this.idsRepository = idsRepository2;
        this.accountManager = aptoideAccountManager;
        this.versionCodeProvider = adsApplicationVersionCodeProvider;
        this.googlePlayServicesAvailabilityChecker = googlePlayServicesAvailabilityChecker2;
        this.partnerId = str;
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.qManager = qManager2;
        this.sharedPreferences = sharedPreferences2;
        this.context = context2;
        this.connectivityManager = connectivityManager2;
        this.resources = resources2;
        this.adMapper = minimalAdMapper;
    }

    /* renamed from: c */
    static /* synthetic */ C5368e m4509c(GetAdsResponse getAdsResponse) {
        if (!validAds(getAdsResponse)) {
            return C5368e.m10238a((Throwable) new IllegalStateException("Invalid ads returned from server"));
        }
        return C5368e.m10257c(getAdsResponse);
    }

    private C5368e<MinimalAd> mapRandomAd(C5368e<GetAdsResponse> eVar) {
        return eVar.mo18694j(C1346e.f3790f).mo18687f(new C1356k(new Random())).mo18694j(new C1352h(this));
    }

    private C5368e<MinimalAd> mapToMinimalAd(C5368e<GetAdsResponse> eVar) {
        return eVar.mo18694j(C1343d.f3788f).mo18687f(C1337a.f3776f).mo18694j(new C1362q(this));
    }

    private C5368e<List<MinimalAd>> mapToMinimalAds(C5368e<GetAdsResponse> eVar) {
        return eVar.mo18687f((C5379n<? super GetAdsResponse, ? extends C5368e<? extends R>>) C1350g.f3794f).mo18694j(C1358m.f3806f).mo18694j(new C1348f(this));
    }

    public static boolean validAds(List<GetAdsResponse.C2176Ad> list) {
        if (list == null || list.isEmpty() || list.get(0) == null || list.get(0).getPartner() == null || list.get(0).getPartner().getData() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo6666a(String str, String str2, Account account) {
        return this.idsRepository.getUniqueIdentifier().mo18568c(new C1366u(this, str, str2, account));
    }

    public C5368e<MinimalAd> getAdForShortcut() {
        return this.accountManager.accountStatus().mo18669c().mo18687f(new C1368w(this));
    }

    public C5368e<List<MinimalAd>> getAdsFromHomepageMore(boolean z) {
        return this.accountManager.accountStatus().mo18669c().mo18687f(new C1359n(this, z));
    }

    public C5368e<MinimalAd> getAdsFromSearch(String str) {
        return this.accountManager.accountStatus().mo18669c().mo18687f(new C1355j(this, str));
    }

    public C5368e<MinimalAd> getAdsFromSecondInstall(String str) {
        return this.accountManager.accountStatus().mo18669c().mo18687f(new C1365t(this, str));
    }

    public C5368e<MinimalAd> getAdsFromSecondTry(String str) {
        return this.accountManager.accountStatus().mo18669c().mo18687f(new C1360o(this, str));
    }

    public C5368e<MinimalAd> loadAdsFromAppView(String str, String str2) {
        return this.accountManager.accountStatus().mo18669c().mo18687f(new C1354i(this, str, str2));
    }

    public C5368e<List<MinimalAd>> loadAdsFromAppviewSuggested(String str, List<String> list) {
        return this.accountManager.accountStatus().mo18669c().mo18687f(new C1341c(this, list, str));
    }

    /* renamed from: b */
    static /* synthetic */ C5368e m4508b(List list) {
        if (!validAds((List<GetAdsResponse.C2176Ad>) list)) {
            return C5368e.m10238a((Throwable) new IllegalStateException("Invalid ads returned from server"));
        }
        return C5368e.m10257c((GetAdsResponse.C2176Ad) list.get(0));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo6667a(String str, String str2, Account account, String str3) {
        return mapToMinimalAd(GetAdsRequest.ofAppviewOrganic(str, str2, str3, this.googlePlayServicesAvailabilityChecker.isAvailable(this.context), this.partnerId, account.isAdultContentEnabled(), this.httpClient, this.converterFactory, this.qManager.getFilters(ManagerPreferences.getHWSpecsFilter(this.sharedPreferences)), this.sharedPreferences, this.connectivityManager, this.resources, this.versionCodeProvider).observe());
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo6674c(String str, Account account) {
        return this.idsRepository.getUniqueIdentifier().mo18568c(new C1361p(this, str, account));
    }

    /* renamed from: b */
    public /* synthetic */ MinimalAd mo6671b(GetAdsResponse.C2176Ad ad) {
        return this.adMapper.map(ad);
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo6672b(String str, Account account) {
        return this.idsRepository.getUniqueIdentifier().mo18568c(new C1367v(this, str, account));
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo6675c(String str, Account account, String str2) {
        return mapToMinimalAd(GetAdsRequest.ofSecondTry(str, str2, this.googlePlayServicesAvailabilityChecker.isAvailable(this.context), this.partnerId, account.isAdultContentEnabled(), this.httpClient, this.converterFactory, this.qManager.getFilters(ManagerPreferences.getHWSpecsFilter(this.sharedPreferences)), this.sharedPreferences, this.connectivityManager, this.resources, this.versionCodeProvider).observe());
    }

    public static boolean validAds(GetAdsResponse getAdsResponse) {
        return getAdsResponse != null && validAds(getAdsResponse.getAds());
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo6673b(String str, Account account, String str2) {
        return mapToMinimalAd(GetAdsRequest.ofSecondInstall(str, str2, this.googlePlayServicesAvailabilityChecker.isAvailable(this.context), this.partnerId, account.isAdultContentEnabled(), this.httpClient, this.converterFactory, this.qManager.getFilters(ManagerPreferences.getHWSpecsFilter(this.sharedPreferences)), this.sharedPreferences, this.connectivityManager, this.resources, this.versionCodeProvider).observe());
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo6670a(boolean z, Account account) {
        return this.idsRepository.getUniqueIdentifier().mo18568c(new C1363r(this, account, z));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo6663a(Account account, boolean z, String str) {
        return mapToMinimalAds(GetAdsRequest.ofHomepageMore(str, this.googlePlayServicesAvailabilityChecker.isAvailable(this.context), this.partnerId, account.isAdultContentEnabled(), this.httpClient, this.converterFactory, this.qManager.getFilters(ManagerPreferences.getHWSpecsFilter(this.sharedPreferences)), this.sharedPreferences, this.connectivityManager, this.resources, this.versionCodeProvider).observe(z));
    }

    /* renamed from: a */
    public /* synthetic */ List mo6660a(List list) {
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedList.add(this.adMapper.map((GetAdsResponse.C2176Ad) it.next()));
        }
        return linkedList;
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo6668a(List list, String str, Account account) {
        return this.idsRepository.getUniqueIdentifier().mo18568c(new C1339b(this, list, str, account));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo6669a(List list, String str, Account account, String str2) {
        return mapToMinimalAds(GetAdsRequest.ofAppviewSuggested(list, str2, this.googlePlayServicesAvailabilityChecker.isAvailable(this.context), str, this.partnerId, account.isAdultContentEnabled(), this.httpClient, this.converterFactory, this.qManager.getFilters(ManagerPreferences.getHWSpecsFilter(this.sharedPreferences)), this.sharedPreferences, this.connectivityManager, this.resources, this.versionCodeProvider).observe()).mo18662b(Schedulers.m10352io());
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo6664a(String str, Account account) {
        return this.idsRepository.getUniqueIdentifier().mo18568c(new C1364s(this, str, account));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo6665a(String str, Account account, String str2) {
        return mapToMinimalAd(GetAdsRequest.ofSearch(str, str2, this.googlePlayServicesAvailabilityChecker.isAvailable(this.context), this.partnerId, account.isAdultContentEnabled(), this.httpClient, this.converterFactory, this.qManager.getFilters(ManagerPreferences.getHWSpecsFilter(this.sharedPreferences)), this.sharedPreferences, this.connectivityManager, this.resources, this.versionCodeProvider).observe());
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo6661a(Account account) {
        return this.idsRepository.getUniqueIdentifier().mo18568c(new C1357l(this, account));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo6662a(Account account, String str) {
        return mapRandomAd(GetAdsRequest.m5234of(Location.homepage, "__NULL__", 10, str, this.googlePlayServicesAvailabilityChecker.isAvailable(this.context), this.partnerId, account.isAdultContentEnabled(), this.httpClient, this.converterFactory, this.qManager.getFilters(ManagerPreferences.getHWSpecsFilter(this.sharedPreferences)), this.sharedPreferences, this.connectivityManager, this.resources, this.versionCodeProvider).observe());
    }

    /* renamed from: a */
    static /* synthetic */ C5368e m4506a(Random random, List list) {
        if (!validAds((List<GetAdsResponse.C2176Ad>) list)) {
            return C5368e.m10238a((Throwable) new IllegalStateException("Invalid ads returned from server"));
        }
        return C5368e.m10257c((GetAdsResponse.C2176Ad) list.get(random.nextInt(10)));
    }

    /* renamed from: a */
    public /* synthetic */ MinimalAd mo6659a(GetAdsResponse.C2176Ad ad) {
        return this.adMapper.map(ad);
    }
}
