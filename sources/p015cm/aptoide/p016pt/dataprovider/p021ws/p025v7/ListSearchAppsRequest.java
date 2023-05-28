package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.content.SharedPreferences;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.PrintStream;
import java.util.Collections;
import java.util.List;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.search.ListSearchApps;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.util.HashMapNotNull;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.ListSearchAppsRequest */
public class ListSearchAppsRequest extends C2185V7<ListSearchApps, Body> {
    private static final int LIMIT = 15;
    private final AppBundlesVisibilityManager appBundlesVisibilityManager;

    private ListSearchAppsRequest(Body body, String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        super(body, str, okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.appBundlesVisibilityManager = appBundlesVisibilityManager2;
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_V7_CACHE_HOST);
        sb.append("/api/7/");
        return sb.toString();
    }

    /* renamed from: of */
    public static ListSearchAppsRequest m5266of(String str, int i, String str2, boolean z, boolean z2, boolean z3, Boolean bool, HashMapNotNull<String, List<String>> hashMapNotNull, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        return new ListSearchAppsRequest(new Body((Integer) 15, i, str, hashMapNotNull, (List<String>) str2 != null ? Collections.singletonList(str2) : null, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), sharedPreferences, bool), getHost(sharedPreferences), bodyInterceptor, okHttpClient, factory, tokenInvalidator, appBundlesVisibilityManager2);
    }

    /* access modifiers changed from: protected */
    public C5368e<ListSearchApps> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.listSearchApps(z ? "no-cache" : null, getQueryStringMapper().map((Body) this.body, this.appBundlesVisibilityManager.shouldEnableAppBundles()));
    }

    /* renamed from: of */
    public static ListSearchAppsRequest m5267of(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, Boolean bool, List<Long> list, HashMapNotNull<String, List<String>> hashMapNotNull, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        Body body;
        if (z) {
            body = new Body((Integer) 15, i, str, list, hashMapNotNull, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), sharedPreferences, bool);
        } else {
            body = new Body(15, i, str, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), sharedPreferences, bool);
        }
        return new ListSearchAppsRequest(body, getHost(sharedPreferences), bodyInterceptor, okHttpClient, factory, tokenInvalidator, appBundlesVisibilityManager2);
    }

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.ListSearchAppsRequest$Body */
    public static class Body extends BaseBodyWithAlphaBetaKey implements Endless {
        private Integer limit;
        private int offset;
        private Boolean onlyAppc;
        private Boolean onlyBeta;
        private Boolean onlyTrusted;
        private String query;
        private List<Long> storeIds;
        private List<String> storeNames;
        private HashMapNotNull<String, List<String>> storesAuthMap;

        public Body(Integer num, int i, String str, List<Long> list, HashMapNotNull<String, List<String>> hashMapNotNull, Boolean bool, Boolean bool2, Boolean bool3, SharedPreferences sharedPreferences, Boolean bool4) {
            super(sharedPreferences);
            this.limit = num;
            this.offset = i;
            this.query = str;
            this.storeIds = list;
            this.storesAuthMap = hashMapNotNull;
            this.onlyTrusted = bool;
            setMature(bool4.booleanValue());
            this.onlyBeta = bool2;
            this.onlyAppc = bool3;
        }

        public Integer getLimit() {
            return this.limit;
        }

        public int getOffset() {
            return this.offset;
        }

        public Boolean getOnlyAppc() {
            return this.onlyAppc;
        }

        public Boolean getOnlyBeta() {
            return this.onlyBeta;
        }

        public Boolean getOnlyTrusted() {
            return this.onlyTrusted;
        }

        public String getQuery() {
            return this.query;
        }

        public List<Long> getStoreIds() {
            return this.storeIds;
        }

        public String getStoreIdsAsString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < this.storeIds.size(); i++) {
                if (i != this.storeIds.size() - 1) {
                    sb.append(this.storeIds.get(i));
                    sb.append(",");
                } else {
                    sb.append(this.storeIds.get(i));
                }
            }
            return sb.toString();
        }

        public List<String> getStoreNames() {
            return this.storeNames;
        }

        public String getStoreNamesAsString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < this.storeNames.size(); i++) {
                if (i != this.storeNames.size() - 1) {
                    sb.append(this.storeNames.get(i));
                    sb.append(",");
                } else {
                    sb.append(this.storeNames.get(i));
                }
            }
            return sb.toString();
        }

        public HashMapNotNull<String, List<String>> getStoresAuthMap() {
            return this.storesAuthMap;
        }

        public String getStoresAuthMapAsString() {
            String str = null;
            try {
                str = new ObjectMapper().writeValueAsString(this.storesAuthMap);
                PrintStream printStream = System.out;
                printStream.println("json = " + str);
                return str;
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                return str;
            }
        }

        public void setOffset(int i) {
            this.offset = i;
        }

        public boolean shouldIncludeTag() {
            return !this.onlyBeta.booleanValue();
        }

        public Body(Integer num, int i, String str, HashMapNotNull<String, List<String>> hashMapNotNull, List<String> list, Boolean bool, Boolean bool2, Boolean bool3, SharedPreferences sharedPreferences, Boolean bool4) {
            super(sharedPreferences);
            this.limit = num;
            this.offset = i;
            this.query = str;
            this.storesAuthMap = hashMapNotNull;
            this.storeNames = list;
            this.onlyTrusted = bool;
            this.onlyBeta = bool2;
            this.onlyAppc = bool3;
            setMature(bool4.booleanValue());
        }

        public Body(Integer num, int i, String str, Boolean bool, Boolean bool2, Boolean bool3, SharedPreferences sharedPreferences, Boolean bool4) {
            super(sharedPreferences);
            this.limit = num;
            this.offset = i;
            this.query = str;
            this.onlyTrusted = bool;
            setMature(bool4.booleanValue());
            this.onlyBeta = bool2;
            this.onlyAppc = bool3;
        }
    }
}
