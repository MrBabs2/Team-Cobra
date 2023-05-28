package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.listapps;

import android.content.SharedPreferences;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.ListAppsUpdates;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBodyWithAlphaBetaKey;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p123rx.C5368e;
import p123rx.schedulers.Schedulers;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.listapps.ListAppsUpdatesRequest */
public class ListAppsUpdatesRequest extends C2185V7<ListAppsUpdates, Body> {
    private static final int SPLIT_SIZE = 100;
    private final AppBundlesVisibilityManager appBundlesVisibilityManager;
    private final SharedPreferences sharedPreferences;

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.listapps.ListAppsUpdatesRequest$ApksData */
    public static class ApksData {
        private boolean isEnabled;
        @JsonProperty("package")
        private String packageName;
        private String signature;
        @JsonProperty("vercode")
        private int versionCode;

        public ApksData(String str, int i, String str2, boolean z) {
            this.packageName = str;
            this.versionCode = i;
            this.signature = str2;
            this.isEnabled = z;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public String getSignature() {
            return this.signature;
        }

        public int getVersionCode() {
            return this.versionCode;
        }

        public boolean isEnabled() {
            return this.isEnabled;
        }
    }

    private ListAppsUpdatesRequest(Body body, String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences2, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        super(body, str, okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.sharedPreferences = sharedPreferences2;
        this.appBundlesVisibilityManager = appBundlesVisibilityManager2;
    }

    /* renamed from: b */
    static /* synthetic */ Iterable m5350b(List list) {
        return list;
    }

    /* renamed from: c */
    static /* synthetic */ Iterable m5351c(List list) {
        return list;
    }

    /* renamed from: d */
    static /* synthetic */ ListAppsUpdates m5352d(List list) {
        ListAppsUpdates listAppsUpdates = new ListAppsUpdates();
        listAppsUpdates.setList(list);
        return listAppsUpdates;
    }

    private Body getBody(List<ApksData> list, int i, SharedPreferences sharedPreferences2) {
        Body body = new Body((Body) this.body, sharedPreferences2);
        int i2 = i + 100;
        if (i2 > list.size()) {
            i2 = (list.size() % 100) + i;
        }
        body.setApksData(list.subList(i, i2));
        return body;
    }

    /* renamed from: of */
    public static ListAppsUpdatesRequest m5353of(List<ApksData> list, List<Long> list2, String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences2, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        List<ApksData> list3 = list;
        List<Long> list4 = list2;
        String str2 = str;
        SharedPreferences sharedPreferences3 = sharedPreferences2;
        return new ListAppsUpdatesRequest(new Body(list, list2, str, sharedPreferences3), C2185V7.getHost(sharedPreferences2), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences3, appBundlesVisibilityManager2);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo10399a(C2185V7.Interfaces interfaces, boolean z, Integer num) {
        if (num.intValue() <= 100) {
            return interfaces.listAppsUpdates((Body) this.body, z, this.appBundlesVisibilityManager.shouldEnableAppBundles());
        }
        List<ApksData> apksData = ((Body) this.body).getApksData();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < apksData.size(); i += 100) {
            arrayList.add(getBody(apksData, i, this.sharedPreferences));
        }
        return C5368e.m10234a(arrayList).mo18644a(Schedulers.m10352io()).mo18694j(new C2225b(this, interfaces, z)).mo18698l().mo18687f(C2229f.f4929f).mo18698l().mo18691h(C2227d.f4927f).mo18694j(C2224a.f4922f).mo18691h(C2226c.f4926f).mo18698l().mo18694j(C2228e.f4928f);
    }

    /* access modifiers changed from: protected */
    public C5368e<ListAppsUpdates> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return C5368e.m10257c(Integer.valueOf(((Body) this.body).getApksData().size())).mo18687f(new C2230g(this, interfaces, z));
    }

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.listapps.ListAppsUpdatesRequest$Body */
    public static class Body extends BaseBodyWithAlphaBetaKey {
        private String aaid;
        private List<ApksData> apksData;
        private String notPackageTags;
        private List<Long> storeIds;

        public Body(List<ApksData> list, List<Long> list2, String str, SharedPreferences sharedPreferences) {
            super(sharedPreferences);
            this.apksData = list;
            this.storeIds = list2;
            this.aaid = str;
            setSystemAppsUpdates(sharedPreferences);
        }

        private void setSystemAppsUpdates(SharedPreferences sharedPreferences) {
            if (!ManagerPreferences.getUpdatesSystemAppsKey(sharedPreferences)) {
                this.notPackageTags = "system";
            }
        }

        public String getAaid() {
            return this.aaid;
        }

        public List<ApksData> getApksData() {
            return this.apksData;
        }

        public String getNotPackageTags() {
            return this.notPackageTags;
        }

        public List<Long> getStoreIds() {
            return this.storeIds;
        }

        public void setAaid(String str) {
            this.aaid = str;
        }

        public void setApksData(List<ApksData> list) {
            this.apksData = list;
        }

        public Body(Body body, SharedPreferences sharedPreferences) {
            super(sharedPreferences);
            this.apksData = body.getApksData();
            this.storeIds = body.getStoreIds();
            setQ(body.getQ());
            setCountry(body.getCountry());
            setAptoideVercode(body.getAptoideVercode());
            this.aaid = body.getAaid();
            setAptoideId(body.getAptoideId());
            this.notPackageTags = body.getNotPackageTags();
            setAptoideMd5sum(body.getAptoideMd5sum());
            setAptoidePackage(body.getAptoidePackage());
            setLang(body.getLang());
            setCdn(body.getCdn());
            setMature(body.isMature());
        }
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo10398a(C2185V7.Interfaces interfaces, boolean z, Body body) {
        return interfaces.listAppsUpdates(body, z, this.appBundlesVisibilityManager.shouldEnableAppBundles());
    }
}
