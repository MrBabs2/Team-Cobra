package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.listapps;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.LinkedList;
import java.util.List;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.ListAppVersions;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBodyWithApp;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.Endless;
import p015cm.aptoide.p016pt.dataprovider.util.HashMapNotNull;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.listapps.ListAppVersionsRequest */
public class ListAppVersionsRequest extends C2185V7<ListAppVersions, Body> {
    private static final Integer MAX_LIMIT = 10;
    private final AppBundlesVisibilityManager appBundlesVisibilityManager;

    private ListAppVersionsRequest(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        super(body, C2185V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.appBundlesVisibilityManager = appBundlesVisibilityManager2;
    }

    /* renamed from: of */
    public static ListAppVersionsRequest m5347of(String str, HashMapNotNull<String, List<String>> hashMapNotNull, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, Resources resources, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        String str2 = str;
        Body body = new Body(str, sharedPreferences, AptoideUtils.SystemU.getCountryCode(resources));
        HashMapNotNull<String, List<String>> hashMapNotNull2 = hashMapNotNull;
        body.setStoresAuthMap(hashMapNotNull);
        body.setLimit(MAX_LIMIT);
        return new ListAppVersionsRequest(body, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, appBundlesVisibilityManager2);
    }

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.listapps.ListAppVersionsRequest$Body */
    public static class Body extends BaseBodyWithApp implements Endless {
        private Integer apkId;
        private String apkMd5sum;
        private Integer appId;
        private String lang;
        private Integer limit;
        private int offset;
        private Integer packageId;
        private String packageName;
        private List<Long> storeIds;
        private List<String> storeNames;
        private HashMapNotNull<String, List<String>> storesAuthMap;

        public Body(SharedPreferences sharedPreferences, String str) {
            super(sharedPreferences);
            this.lang = str;
        }

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof Body;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Body)) {
                return false;
            }
            Body body = (Body) obj;
            if (!body.canEqual(this) || !super.equals(obj)) {
                return false;
            }
            Integer apkId2 = getApkId();
            Integer apkId3 = body.getApkId();
            if (apkId2 != null ? !apkId2.equals(apkId3) : apkId3 != null) {
                return false;
            }
            String apkMd5sum2 = getApkMd5sum();
            String apkMd5sum3 = body.getApkMd5sum();
            if (apkMd5sum2 != null ? !apkMd5sum2.equals(apkMd5sum3) : apkMd5sum3 != null) {
                return false;
            }
            Integer appId2 = getAppId();
            Integer appId3 = body.getAppId();
            if (appId2 != null ? !appId2.equals(appId3) : appId3 != null) {
                return false;
            }
            String lang2 = getLang();
            String lang3 = body.getLang();
            if (lang2 != null ? !lang2.equals(lang3) : lang3 != null) {
                return false;
            }
            Integer packageId2 = getPackageId();
            Integer packageId3 = body.getPackageId();
            if (packageId2 != null ? !packageId2.equals(packageId3) : packageId3 != null) {
                return false;
            }
            String packageName2 = getPackageName();
            String packageName3 = body.getPackageName();
            if (packageName2 != null ? !packageName2.equals(packageName3) : packageName3 != null) {
                return false;
            }
            List<Long> storeIds2 = getStoreIds();
            List<Long> storeIds3 = body.getStoreIds();
            if (storeIds2 != null ? !storeIds2.equals(storeIds3) : storeIds3 != null) {
                return false;
            }
            List<String> storeNames2 = getStoreNames();
            List<String> storeNames3 = body.getStoreNames();
            if (storeNames2 != null ? !storeNames2.equals(storeNames3) : storeNames3 != null) {
                return false;
            }
            Integer limit2 = getLimit();
            Integer limit3 = body.getLimit();
            if (limit2 != null ? !limit2.equals(limit3) : limit3 != null) {
                return false;
            }
            if (getOffset() != body.getOffset()) {
                return false;
            }
            HashMapNotNull<String, List<String>> storesAuthMap2 = getStoresAuthMap();
            HashMapNotNull<String, List<String>> storesAuthMap3 = body.getStoresAuthMap();
            return storesAuthMap2 != null ? storesAuthMap2.equals(storesAuthMap3) : storesAuthMap3 == null;
        }

        public Integer getApkId() {
            return this.apkId;
        }

        public String getApkMd5sum() {
            return this.apkMd5sum;
        }

        public Integer getAppId() {
            return this.appId;
        }

        public String getLang() {
            return this.lang;
        }

        public Integer getLimit() {
            return this.limit;
        }

        public int getOffset() {
            return this.offset;
        }

        public Integer getPackageId() {
            return this.packageId;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public List<Long> getStoreIds() {
            return this.storeIds;
        }

        public List<String> getStoreNames() {
            return this.storeNames;
        }

        public HashMapNotNull<String, List<String>> getStoresAuthMap() {
            return this.storesAuthMap;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            Integer apkId2 = getApkId();
            int hashCode = (super.hashCode() + 59) * 59;
            int i10 = 43;
            if (apkId2 == null) {
                i = 43;
            } else {
                i = apkId2.hashCode();
            }
            int i11 = hashCode + i;
            String apkMd5sum2 = getApkMd5sum();
            int i12 = i11 * 59;
            if (apkMd5sum2 == null) {
                i2 = 43;
            } else {
                i2 = apkMd5sum2.hashCode();
            }
            int i13 = i12 + i2;
            Integer appId2 = getAppId();
            int i14 = i13 * 59;
            if (appId2 == null) {
                i3 = 43;
            } else {
                i3 = appId2.hashCode();
            }
            int i15 = i14 + i3;
            String lang2 = getLang();
            int i16 = i15 * 59;
            if (lang2 == null) {
                i4 = 43;
            } else {
                i4 = lang2.hashCode();
            }
            int i17 = i16 + i4;
            Integer packageId2 = getPackageId();
            int i18 = i17 * 59;
            if (packageId2 == null) {
                i5 = 43;
            } else {
                i5 = packageId2.hashCode();
            }
            int i19 = i18 + i5;
            String packageName2 = getPackageName();
            int i20 = i19 * 59;
            if (packageName2 == null) {
                i6 = 43;
            } else {
                i6 = packageName2.hashCode();
            }
            int i21 = i20 + i6;
            List<Long> storeIds2 = getStoreIds();
            int i22 = i21 * 59;
            if (storeIds2 == null) {
                i7 = 43;
            } else {
                i7 = storeIds2.hashCode();
            }
            int i23 = i22 + i7;
            List<String> storeNames2 = getStoreNames();
            int i24 = i23 * 59;
            if (storeNames2 == null) {
                i8 = 43;
            } else {
                i8 = storeNames2.hashCode();
            }
            int i25 = i24 + i8;
            Integer limit2 = getLimit();
            int i26 = i25 * 59;
            if (limit2 == null) {
                i9 = 43;
            } else {
                i9 = limit2.hashCode();
            }
            int offset2 = ((i26 + i9) * 59) + getOffset();
            HashMapNotNull<String, List<String>> storesAuthMap2 = getStoresAuthMap();
            int i27 = offset2 * 59;
            if (storesAuthMap2 != null) {
                i10 = storesAuthMap2.hashCode();
            }
            return i27 + i10;
        }

        public void setApkId(Integer num) {
            this.apkId = num;
        }

        public void setApkMd5sum(String str) {
            this.apkMd5sum = str;
        }

        public void setAppId(Integer num) {
            this.appId = num;
        }

        public void setLang(String str) {
            this.lang = str;
        }

        public void setLimit(Integer num) {
            this.limit = num;
        }

        public void setOffset(int i) {
            this.offset = i;
        }

        public void setPackageId(Integer num) {
            this.packageId = num;
        }

        public void setPackageName(String str) {
            this.packageName = str;
        }

        public void setStoreIds(List<Long> list) {
            this.storeIds = list;
        }

        public void setStoreNames(List<String> list) {
            this.storeNames = list;
        }

        public void setStoresAuthMap(HashMapNotNull<String, List<String>> hashMapNotNull) {
            if (hashMapNotNull != null) {
                this.storesAuthMap = hashMapNotNull;
                this.storeNames = new LinkedList(hashMapNotNull.keySet());
            }
        }

        public String toString() {
            return "ListAppVersionsRequest.Body(apkId=" + getApkId() + ", apkMd5sum=" + getApkMd5sum() + ", appId=" + getAppId() + ", lang=" + getLang() + ", packageId=" + getPackageId() + ", packageName=" + getPackageName() + ", storeIds=" + getStoreIds() + ", storeNames=" + getStoreNames() + ", limit=" + getLimit() + ", offset=" + getOffset() + ", storesAuthMap=" + getStoresAuthMap() + ")";
        }

        public Body(String str, SharedPreferences sharedPreferences, String str2) {
            this(sharedPreferences, str2);
            this.packageName = str;
        }

        public Body(String str, List<String> list, HashMapNotNull<String, List<String>> hashMapNotNull, SharedPreferences sharedPreferences, String str2) {
            this(str, sharedPreferences, str2);
            this.storeNames = list;
            setStoresAuthMap(hashMapNotNull);
        }
    }

    /* access modifiers changed from: protected */
    public C5368e<ListAppVersions> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.listAppVersions((Body) this.body, z, this.appBundlesVisibilityManager.shouldEnableAppBundles());
    }
}
