package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.content.SharedPreferences;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetApp;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.GetAppRequest */
public class GetAppRequest extends C2185V7<GetApp, Body> {
    private final AppBundlesVisibilityManager appBundlesVisibilityManager;

    private GetAppRequest(String str, Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
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
    public static GetAppRequest m5253of(String str, String str2, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        String str3 = str;
        String str4 = str2;
        return new GetAppRequest(getHost(sharedPreferences), new Body(str, str2, ManagerPreferences.getAndResetForceServerRefresh(sharedPreferences), sharedPreferences), bodyInterceptor, okHttpClient, factory, tokenInvalidator, appBundlesVisibilityManager2);
    }

    public static GetAppRequest ofMd5(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        return new GetAppRequest(getHost(sharedPreferences), new Body(sharedPreferences, str), bodyInterceptor, okHttpClient, factory, tokenInvalidator, appBundlesVisibilityManager2);
    }

    public static GetAppRequest ofUname(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        return new GetAppRequest(getHost(sharedPreferences), new Body(str, sharedPreferences), bodyInterceptor, okHttpClient, factory, tokenInvalidator, appBundlesVisibilityManager2);
    }

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.GetAppRequest$Body */
    public static class Body extends BaseBodyWithApp {
        private Long appId;
        @JsonProperty("apk_md5sum")
        private String md5;
        private Node nodes;
        private String packageName;
        @JsonProperty("store_name")
        private String storeName;
        @JsonProperty("package_uname")
        private String uname;

        public Body(Long l, String str, SharedPreferences sharedPreferences) {
            this(l.longValue(), sharedPreferences);
            this.nodes = new Node(l, str);
        }

        public Long getAppId() {
            return this.appId;
        }

        public String getMd5() {
            return this.md5;
        }

        public Node getNodes() {
            return this.nodes;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public String getStoreName() {
            return this.storeName;
        }

        public String getUname() {
            return this.uname;
        }

        public Body(Long l, String str, String str2, SharedPreferences sharedPreferences) {
            this(l.longValue(), sharedPreferences);
            this.storeName = str;
            this.nodes = new Node(l, str2);
        }

        /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.GetAppRequest$Body$Node */
        private static class Node {
            private Groups groups;
            private Meta meta;
            private Versions versions;

            /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.GetAppRequest$Body$Node$Groups */
            private static class Groups {
                private Groups() {
                }
            }

            /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.GetAppRequest$Body$Node$Meta */
            private static class Meta {
                @JsonInclude(JsonInclude.Include.NON_NULL)
                private Long appId;

                private Meta() {
                }

                public Long getAppId() {
                    return this.appId;
                }

                public void setAppId(Long l) {
                    this.appId = l;
                }
            }

            /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.GetAppRequest$Body$Node$Versions */
            private static class Versions {
                @JsonInclude(JsonInclude.Include.NON_NULL)
                private String packageName;

                private Versions() {
                }

                public String getPackageName() {
                    return this.packageName;
                }

                public void setPackageName(String str) {
                    this.packageName = str;
                }
            }

            public Node(Long l, String str) {
                Meta meta2 = new Meta();
                this.meta = meta2;
                meta2.setAppId(l);
                Versions versions2 = new Versions();
                this.versions = versions2;
                versions2.setPackageName(str);
                this.groups = new Groups();
            }

            public Groups getGroups() {
                return this.groups;
            }

            public Meta getMeta() {
                return this.meta;
            }

            public Versions getVersions() {
                return this.versions;
            }

            public void setGroups(Groups groups2) {
                this.groups = groups2;
            }

            public void setMeta(Meta meta2) {
                this.meta = meta2;
            }

            public void setVersions(Versions versions2) {
                this.versions = versions2;
            }

            public Node(long j) {
                this(Long.valueOf(j), (String) null);
            }

            public Node(String str) {
                this((Long) null, str);
            }

            public Node() {
                this((Long) null, (String) null);
            }
        }

        public Body(String str, String str2, boolean z, SharedPreferences sharedPreferences) {
            this(str, Boolean.valueOf(z), sharedPreferences);
            this.storeName = str2;
            this.nodes = new Node();
        }

        public Body(String str, Boolean bool, SharedPreferences sharedPreferences) {
            super(sharedPreferences);
            this.packageName = str;
            this.nodes = new Node();
        }

        public Body(String str, SharedPreferences sharedPreferences) {
            super(sharedPreferences);
            this.uname = str;
            this.nodes = new Node();
        }

        public Body(SharedPreferences sharedPreferences, String str) {
            super(sharedPreferences);
            this.md5 = str;
            this.nodes = new Node();
        }

        public Body(long j, SharedPreferences sharedPreferences) {
            super(sharedPreferences);
            this.appId = Long.valueOf(j);
            this.nodes = new Node();
        }
    }

    /* access modifiers changed from: protected */
    public C5368e<GetApp> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.getApp(z ? "no-cache" : null, getQueryStringMapper().map((Body) this.body, this.appBundlesVisibilityManager.shouldEnableAppBundles()));
    }

    /* renamed from: of */
    public static GetAppRequest m5251of(String str, BodyInterceptor<BaseBody> bodyInterceptor, long j, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        String str2 = str;
        return new GetAppRequest(getHost(sharedPreferences), new Body(Long.valueOf(j), str, sharedPreferences), bodyInterceptor, okHttpClient, factory, tokenInvalidator, appBundlesVisibilityManager2);
    }

    /* renamed from: of */
    public static GetAppRequest m5252of(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        String str2 = str;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        return new GetAppRequest(getHost(sharedPreferences), new Body(str, Boolean.valueOf(ManagerPreferences.getAndResetForceServerRefresh(sharedPreferences)), sharedPreferences), bodyInterceptor, okHttpClient, factory, tokenInvalidator, appBundlesVisibilityManager2);
    }

    /* renamed from: of */
    public static GetAppRequest m5250of(long j, String str, BaseRequestWithStore.StoreCredentials storeCredentials, String str2, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        String str3 = str;
        String str4 = str2;
        Body body = new Body(Long.valueOf(j), str, str2, sharedPreferences);
        body.setStoreUser(storeCredentials.getUsername());
        body.setStorePassSha1(storeCredentials.getPasswordSha1());
        return new GetAppRequest(getHost(sharedPreferences), body, bodyInterceptor, okHttpClient, factory, tokenInvalidator, appBundlesVisibilityManager2);
    }
}
