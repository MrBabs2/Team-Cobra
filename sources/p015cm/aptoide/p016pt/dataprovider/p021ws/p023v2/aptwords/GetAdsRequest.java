package p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.text.TextUtils;
import java.util.List;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.ads.AdNetworkUtils;
import p015cm.aptoide.p016pt.dataprovider.model.p018v2.GetAdsResponse;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords.Aptwords;
import p015cm.aptoide.p016pt.dataprovider.util.HashMapNotNull;
import p015cm.aptoide.p016pt.dataprovider.util.referrer.ReferrerUtils;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v2.aptwords.GetAdsRequest */
public class GetAdsRequest extends Aptwords<GetAdsResponse> {
    private static String forcedCountry;
    private String categories;
    private final String clientUniqueId;
    private ConnectivityManager connectivityManager;
    private String excludedNetworks;
    private String excludedPackage;
    private final boolean googlePlayServicesAvailable;
    private String groupPackageName;
    private String keyword;
    private Integer limit;
    private Location location;
    private boolean mature;
    private final String oemid;
    private String packageName;

    /* renamed from: q */
    private final String f4864q;
    private String repo;
    private Resources resources;
    private final SharedPreferences sharedPreferences;
    private final AdsApplicationVersionCodeProvider versionCodeProvider;

    private GetAdsRequest(String str, boolean z, String str2, boolean z2, Converter.Factory factory, OkHttpClient okHttpClient, String str3, SharedPreferences sharedPreferences2, ConnectivityManager connectivityManager2, Resources resources2, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider) {
        super(okHttpClient, factory, sharedPreferences2);
        this.clientUniqueId = str;
        this.googlePlayServicesAvailable = z;
        this.oemid = str2;
        this.mature = z2;
        this.f4864q = str3;
        this.sharedPreferences = sharedPreferences2;
        this.connectivityManager = connectivityManager2;
        this.resources = resources2;
        this.versionCodeProvider = adsApplicationVersionCodeProvider;
    }

    private String getExcludedPackages() {
        return this.excludedPackage;
    }

    public static String getForcedCountry() {
        return forcedCountry;
    }

    private String getGroupPackageName() {
        return this.groupPackageName;
    }

    /* renamed from: of */
    private static GetAdsRequest m5233of(Location location2, Integer num, String str, boolean z, String str2, boolean z2, OkHttpClient okHttpClient, Converter.Factory factory, String str3, SharedPreferences sharedPreferences2, ConnectivityManager connectivityManager2, Resources resources2, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider) {
        return m5234of(location2, "__NULL__", num, str, z, str2, z2, okHttpClient, factory, str3, sharedPreferences2, connectivityManager2, resources2, adsApplicationVersionCodeProvider);
    }

    public static GetAdsRequest ofAppviewOrganic(String str, String str2, String str3, boolean z, String str4, boolean z2, OkHttpClient okHttpClient, Converter.Factory factory, String str5, SharedPreferences sharedPreferences2, ConnectivityManager connectivityManager2, Resources resources2, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider) {
        GetAdsRequest ofPackageName = ofPackageName(Location.appview, str, str3, z, str4, z2, okHttpClient, factory, str5, sharedPreferences2, connectivityManager2, resources2, adsApplicationVersionCodeProvider);
        String str6 = str2;
        ofPackageName.setRepo(str2);
        String str7 = str;
        ofPackageName.setGroupPackageName(str);
        return ofPackageName;
    }

    public static GetAdsRequest ofAppviewSuggested(List<String> list, String str, boolean z, String str2, String str3, boolean z2, OkHttpClient okHttpClient, Converter.Factory factory, String str4, SharedPreferences sharedPreferences2, ConnectivityManager connectivityManager2, Resources resources2, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider) {
        String str5 = str2;
        GetAdsRequest of = m5233of(Location.middleappview, 1, str, z, str3, z2, okHttpClient, factory, str4, sharedPreferences2, connectivityManager2, resources2, adsApplicationVersionCodeProvider);
        of.setExcludedPackage(str5);
        StringBuilder sb = new StringBuilder();
        List<String> list2 = list;
        sb.append(AptoideUtils.StringU.join((Iterable<?>) list, ","));
        sb.append(",__null__");
        of.setKeyword(sb.toString());
        of.setGroupPackageName(str5);
        return of;
    }

    public static GetAdsRequest ofFirstInstall(String str, boolean z, String str2, int i, boolean z2, OkHttpClient okHttpClient, Converter.Factory factory, String str3, SharedPreferences sharedPreferences2, ConnectivityManager connectivityManager2, Resources resources2, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider) {
        return m5233of(Location.firstinstall, Integer.valueOf(i), str, z, str2, z2, okHttpClient, factory, str3, sharedPreferences2, connectivityManager2, resources2, adsApplicationVersionCodeProvider);
    }

    public static GetAdsRequest ofHomepage(String str, boolean z, String str2, boolean z2, OkHttpClient okHttpClient, Converter.Factory factory, String str3, SharedPreferences sharedPreferences2, Resources resources2, ConnectivityManager connectivityManager2, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider, int i) {
        return m5233of(Location.homepage, Integer.valueOf(i), str, z, str2, z2, okHttpClient, factory, str3, sharedPreferences2, connectivityManager2, resources2, adsApplicationVersionCodeProvider);
    }

    public static GetAdsRequest ofHomepageMore(String str, boolean z, String str2, boolean z2, OkHttpClient okHttpClient, Converter.Factory factory, String str3, SharedPreferences sharedPreferences2, ConnectivityManager connectivityManager2, Resources resources2, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider) {
        return m5233of(Location.homepage, 50, str, z, str2, z2, okHttpClient, factory, str3, sharedPreferences2, connectivityManager2, resources2, adsApplicationVersionCodeProvider);
    }

    private static GetAdsRequest ofPackageName(Location location2, String str, String str2, boolean z, String str3, boolean z2, OkHttpClient okHttpClient, Converter.Factory factory, String str4, SharedPreferences sharedPreferences2, ConnectivityManager connectivityManager2, Resources resources2, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider) {
        String str5 = str;
        GetAdsRequest of = m5233of(location2, 1, str2, z, str3, z2, okHttpClient, factory, str4, sharedPreferences2, connectivityManager2, resources2, adsApplicationVersionCodeProvider);
        of.setPackageName(str5);
        if (ReferrerUtils.excludedNetworks.containsKey(str5)) {
            of.excludedNetworks = AptoideUtils.StringU.commaSeparatedValues((List) ReferrerUtils.excludedNetworks.get(str5));
        }
        return of;
    }

    public static GetAdsRequest ofSearch(String str, String str2, boolean z, String str3, boolean z2, OkHttpClient okHttpClient, Converter.Factory factory, String str4, SharedPreferences sharedPreferences2, ConnectivityManager connectivityManager2, Resources resources2, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider) {
        return m5234of(Location.search, str, 1, str2, z, str3, z2, okHttpClient, factory, str4, sharedPreferences2, connectivityManager2, resources2, adsApplicationVersionCodeProvider);
    }

    public static GetAdsRequest ofSecondInstall(String str, String str2, boolean z, String str3, boolean z2, OkHttpClient okHttpClient, Converter.Factory factory, String str4, SharedPreferences sharedPreferences2, ConnectivityManager connectivityManager2, Resources resources2, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider) {
        return ofPackageName(Location.secondinstall, str, str2, z, str3, z2, okHttpClient, factory, str4, sharedPreferences2, connectivityManager2, resources2, adsApplicationVersionCodeProvider);
    }

    public static GetAdsRequest ofSecondTry(String str, String str2, boolean z, String str3, boolean z2, OkHttpClient okHttpClient, Converter.Factory factory, String str4, SharedPreferences sharedPreferences2, ConnectivityManager connectivityManager2, Resources resources2, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider) {
        return ofPackageName(Location.secondtry, str, str2, z, str3, z2, okHttpClient, factory, str4, sharedPreferences2, connectivityManager2, resources2, adsApplicationVersionCodeProvider);
    }

    public static void setForcedCountry(String str) {
        forcedCountry = str;
    }

    private void setGroupPackageName(String str) {
        this.groupPackageName = str;
    }

    public String getCategories() {
        return this.categories;
    }

    public String getClientUniqueId() {
        return this.clientUniqueId;
    }

    public ConnectivityManager getConnectivityManager() {
        return this.connectivityManager;
    }

    public String getExcludedNetworks() {
        return this.excludedNetworks;
    }

    public String getExcludedPackage() {
        return this.excludedPackage;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public Location getLocation() {
        return this.location;
    }

    public String getOemid() {
        return this.oemid;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getQ() {
        return this.f4864q;
    }

    public String getRepo() {
        return this.repo;
    }

    public Resources getResources() {
        return this.resources;
    }

    public SharedPreferences getSharedPreferences() {
        return this.sharedPreferences;
    }

    public AdsApplicationVersionCodeProvider getVersionCodeProvider() {
        return this.versionCodeProvider;
    }

    public boolean isGooglePlayServicesAvailable() {
        return this.googlePlayServicesAvailable;
    }

    public boolean isMature() {
        return this.mature;
    }

    public void setCategories(String str) {
        this.categories = str;
    }

    public void setConnectivityManager(ConnectivityManager connectivityManager2) {
        this.connectivityManager = connectivityManager2;
    }

    public void setExcludedNetworks(String str) {
        this.excludedNetworks = str;
    }

    public void setExcludedPackage(String str) {
        this.excludedPackage = str;
    }

    public void setKeyword(String str) {
        this.keyword = str;
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public void setLocation(Location location2) {
        this.location = location2;
    }

    public void setMature(boolean z) {
        this.mature = z;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setRepo(String str) {
        this.repo = str;
    }

    public void setResources(Resources resources2) {
        this.resources = resources2;
    }

    /* renamed from: of */
    public static GetAdsRequest m5234of(Location location2, String str, Integer num, String str2, boolean z, String str3, boolean z2, OkHttpClient okHttpClient, Converter.Factory factory, String str4, SharedPreferences sharedPreferences2, ConnectivityManager connectivityManager2, Resources resources2, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider) {
        GetAdsRequest getAdsRequest = new GetAdsRequest(str2, z, str3, z2, factory, okHttpClient, str4, sharedPreferences2, connectivityManager2, resources2, adsApplicationVersionCodeProvider);
        Location location3 = location2;
        getAdsRequest.setLocation(location2);
        String str5 = str;
        getAdsRequest.setKeyword(str);
        Integer num2 = num;
        getAdsRequest.setLimit(num);
        return getAdsRequest;
    }

    /* access modifiers changed from: protected */
    public C5368e<GetAdsResponse> loadDataFromNetwork(Aptwords.Interfaces interfaces, boolean z) {
        HashMapNotNull hashMapNotNull = new HashMapNotNull();
        hashMapNotNull.put("q", this.f4864q);
        hashMapNotNull.put("lang", AptoideUtils.SystemU.getCountryCode(this.resources));
        hashMapNotNull.put("cpuid", this.clientUniqueId);
        hashMapNotNull.put("location", this.location.toString());
        hashMapNotNull.put("type", "1-3");
        hashMapNotNull.put("partners", "1-3,5-10");
        hashMapNotNull.put("keywords", this.keyword);
        String str = this.oemid;
        if (str != null && !str.isEmpty()) {
            hashMapNotNull.put("oem_id", this.oemid);
        }
        hashMapNotNull.put("country", forcedCountry);
        hashMapNotNull.put("group_package_name", this.groupPackageName);
        String forceCountry = ToolboxManager.getForceCountry(this.sharedPreferences);
        if (!TextUtils.isEmpty(forceCountry)) {
            hashMapNotNull.put("country", forceCountry);
        }
        if (this.googlePlayServicesAvailable) {
            hashMapNotNull.put("flag", "gms");
        }
        hashMapNotNull.put("excluded_pkg", getExcludedPackages());
        hashMapNotNull.put("limit", String.valueOf(this.limit));
        hashMapNotNull.put("get_mature", Integer.toString(this.mature ? 1 : 0));
        hashMapNotNull.put("app_pkg", this.packageName);
        hashMapNotNull.put("app_store", this.repo);
        hashMapNotNull.put("filter_pkg", "true");
        hashMapNotNull.put("conn_type", AptoideUtils.SystemU.getConnectionType(this.connectivityManager));
        hashMapNotNull.put("excluded_partners", this.excludedNetworks);
        return this.versionCodeProvider.getApplicationVersionCode().mo18568c(new C2178b(hashMapNotNull, interfaces, z));
    }

    /* renamed from: a */
    static /* synthetic */ void m5232a(GetAdsResponse getAdsResponse) {
        for (GetAdsResponse.C2176Ad knockImpression : getAdsResponse.getAds()) {
            AdNetworkUtils.knockImpression(knockImpression);
        }
    }
}
