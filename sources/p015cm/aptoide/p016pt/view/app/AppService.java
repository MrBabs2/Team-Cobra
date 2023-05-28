package p015cm.aptoide.p016pt.view.app;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.aab.Split;
import p015cm.aptoide.p016pt.aab.SplitsMapper;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.exception.NoNetworkConnectionException;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetApp;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetAppMeta;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListApps;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Obb;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.App;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.File;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.ListAppVersions;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.GetAppRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.GetRecommendedRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.ListAppsRequest;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.store.StoreUtils;
import p015cm.aptoide.p016pt.view.app.AppsList;
import p015cm.aptoide.p016pt.view.app.DetailedAppRequestResult;
import p015cm.aptoide.p016pt.view.app.FlagsVote;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p126m.C5377a;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.view.app.AppService */
public class AppService {
    private static final int MATURE_APP_RATING = 18;
    private final AppBundlesVisibilityManager appBundlesVisibilityManager;
    private final BodyInterceptor<BaseBody> bodyInterceptorV7;
    private final Converter.Factory converterFactory;
    private final OkHttpClient httpClient;
    private boolean loadingAppcSimilarApps;
    private boolean loadingApps;
    private boolean loadingSimilarApps;
    private final SharedPreferences sharedPreferences;
    private final SplitsMapper splitsMapper;
    private final StoreCredentialsProvider storeCredentialsProvider;
    private final TokenInvalidator tokenInvalidator;

    /* renamed from: cm.aptoide.pt.view.app.AppService$1 */
    static /* synthetic */ class C44991 {

        /* renamed from: $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$GetAppMeta$GetAppMetaFile$Flags$Vote$Type */
        static final /* synthetic */ int[] f7732xb9b5ac52;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$GetAppMetaFile$Flags$Vote$Type[] r0 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetAppMeta.GetAppMetaFile.Flags.Vote.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7732xb9b5ac52 = r0
                cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$GetAppMetaFile$Flags$Vote$Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetAppMeta.GetAppMetaFile.Flags.Vote.Type.FAKE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7732xb9b5ac52     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$GetAppMetaFile$Flags$Vote$Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetAppMeta.GetAppMetaFile.Flags.Vote.Type.GOOD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7732xb9b5ac52     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$GetAppMetaFile$Flags$Vote$Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetAppMeta.GetAppMetaFile.Flags.Vote.Type.VIRUS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7732xb9b5ac52     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$GetAppMetaFile$Flags$Vote$Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetAppMeta.GetAppMetaFile.Flags.Vote.Type.FREEZE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f7732xb9b5ac52     // Catch:{ NoSuchFieldError -> 0x003e }
                cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$GetAppMetaFile$Flags$Vote$Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetAppMeta.GetAppMetaFile.Flags.Vote.Type.LICENSE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.view.app.AppService.C44991.<clinit>():void");
        }
    }

    public AppService(StoreCredentialsProvider storeCredentialsProvider2, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator2, SharedPreferences sharedPreferences2, SplitsMapper splitsMapper2, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        this.storeCredentialsProvider = storeCredentialsProvider2;
        this.bodyInterceptorV7 = bodyInterceptor;
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.tokenInvalidator = tokenInvalidator2;
        this.sharedPreferences = sharedPreferences2;
        this.splitsMapper = splitsMapper2;
        this.appBundlesVisibilityManager = appBundlesVisibilityManager2;
    }

    private boolean canCompare(ListAppVersions listAppVersions) {
        return (listAppVersions == null || listAppVersions.getList() == null || listAppVersions.getList().isEmpty()) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: createDetailedAppRequestResultError */
    public DetailedAppRequestResult mo15355h(Throwable th) {
        if (th instanceof NoNetworkConnectionException) {
            return new DetailedAppRequestResult(DetailedAppRequestResult.Error.NETWORK);
        }
        return new DetailedAppRequestResult(DetailedAppRequestResult.Error.GENERIC);
    }

    /* access modifiers changed from: private */
    /* renamed from: createErrorAppsList */
    public AppsList mo15353g(Throwable th) {
        if (th instanceof NoNetworkConnectionException) {
            return new AppsList(AppsList.Error.NETWORK);
        }
        return new AppsList(AppsList.Error.GENERIC);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isBeta(java.util.List<java.lang.String> r5, java.lang.String r6) {
        /*
            r4 = this;
            java.util.Iterator r5 = r5.iterator()
        L_0x0004:
            boolean r0 = r5.hasNext()
            r1 = 1
            java.lang.String r2 = "beta"
            java.lang.String r3 = "alpha"
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0021
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0004
        L_0x0021:
            return r1
        L_0x0022:
            boolean r5 = r6.contains(r3)
            if (r5 != 0) goto L_0x0030
            boolean r5 = r6.contains(r2)
            if (r5 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.view.app.AppService.isBeta(java.util.List, java.lang.String):boolean");
    }

    private boolean isLatestTrustedVersion(ListAppVersions listAppVersions, File file) {
        if (!canCompare(listAppVersions) || !file.getMd5sum().equals(((App) listAppVersions.getList().get(0)).getFile().getMd5sum()) || file.getMalware().getRank() != Malware.Rank.TRUSTED) {
            return false;
        }
        return true;
    }

    private Single<AppsList> loadApps(long j, boolean z, int i, int i2) {
        if (this.loadingApps) {
            return Single.m10119a(new AppsList(true));
        }
        ListAppsRequest.Body body = new ListAppsRequest.Body(this.storeCredentialsProvider.get(j), i2, this.sharedPreferences);
        body.setOffset(i);
        body.setStoreId(j);
        return new ListAppsRequest(body, this.bodyInterceptorV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, this.appBundlesVisibilityManager).observe(z, false).mo18663b((C5377a) new C4573v0(this)).mo18680d((C5377a) new C4551o(this)).mo18673c((C5377a) new C4552o0(this)).mo18687f(new C4578x(this)).mo18700m().mo18571f(new C4540k0(this));
    }

    private FlagsVote.VoteType map(GetAppMeta.GetAppMetaFile.Flags.Vote.Type type) {
        int i = C44991.f7732xb9b5ac52[type.ordinal()];
        if (i == 1) {
            return FlagsVote.VoteType.FAKE;
        }
        if (i == 2) {
            return FlagsVote.VoteType.GOOD;
        }
        if (i == 3) {
            return FlagsVote.VoteType.VIRUS;
        }
        if (i == 4) {
            return FlagsVote.VoteType.FREEZE;
        }
        if (i != 5) {
            return null;
        }
        return FlagsVote.VoteType.LICENSE;
    }

    /* access modifiers changed from: private */
    /* renamed from: mapApp */
    public C5368e<DetailedAppRequestResult> mo15336a(GetApp getApp, String str) {
        List<Split> list;
        if (!getApp.isOk()) {
            return C5368e.m10238a((Throwable) new IllegalStateException("Could not obtain request from server."));
        }
        GetAppMeta.App data = getApp.getNodes().getMeta().getData();
        ListAppVersions versions = getApp.getNodes().getVersions();
        GetAppMeta.GetAppMetaFile file = data.getFile();
        GetAppMeta.GetAppMetaFile.Flags flags = data.getFile().getFlags();
        GetAppMeta.Developer developer = data.getDeveloper();
        GetAppMeta.Stats stats = data.getStats();
        GetAppMeta.Stats.Rating rating = stats.getRating();
        GetAppMeta.Stats.Rating globalRating = stats.getGlobalRating();
        GetAppMeta.Media media = data.getMedia();
        AppFlags appFlags = new AppFlags(flags.getReview(), mapToFlagsVote(flags.getVotes()));
        AppDeveloper appDeveloper = new AppDeveloper(developer.getName(), developer.getEmail(), developer.getPrivacy(), developer.getWebsite());
        AppStats appStats = new AppStats(new AppRating(rating.getAvg(), rating.getTotal(), mapToRatingsVote(rating.getVotes())), new AppRating(globalRating.getAvg(), globalRating.getTotal(), mapToRatingsVote(globalRating.getVotes())), stats.getDownloads(), stats.getPdownloads());
        AppMedia appMedia = new AppMedia(media.getDescription(), media.getKeywords(), media.getNews(), mapToScreenShots(media.getScreenshots()), mapToVideo(media.getVideos()));
        long id = data.getId();
        String name = data.getName();
        String packageName = data.getPackageName();
        long size = data.getSize();
        String icon = data.getIcon();
        String graphic = data.getGraphic();
        String added = data.getAdded();
        String modified = data.getModified();
        boolean isGoodApp = file.isGoodApp();
        Malware malware = file.getMalware();
        List<String> tags = file.getTags();
        List<String> usedFeatures = file.getUsedFeatures();
        List<String> usedPermissions = file.getUsedPermissions();
        long filesize = file.getFilesize();
        String md5 = data.getMd5();
        String path = file.getPath();
        String pathAlt = file.getPathAlt();
        int vercode = file.getVercode();
        String vername = file.getVername();
        Store store = data.getStore();
        Obb obb = data.getObb();
        String w = data.getUrls().getW();
        boolean isLatestTrustedVersion = isLatestTrustedVersion(versions, file);
        boolean hasBilling = data.hasBilling();
        boolean hasAdvertising = data.hasAdvertising();
        List<String> bdsFlags = data.getBdsFlags();
        boolean z = data.getAge().getRating() == 18;
        String sha1 = data.getFile().getSignature().getSha1();
        if (data.hasSplits()) {
            list = this.splitsMapper.mapSplits(data.getAab().getSplits());
        } else {
            list = Collections.emptyList();
        }
        return C5368e.m10257c(new DetailedAppRequestResult(new DetailedApp(id, name, packageName, size, icon, graphic, added, modified, isGoodApp, malware, appFlags, tags, usedFeatures, usedPermissions, filesize, md5, path, pathAlt, vercode, vername, appDeveloper, store, appMedia, appStats, obb, w, isLatestTrustedVersion, str, hasBilling, hasAdvertising, bdsFlags, z, sha1, list, data.hasSplits() ? data.getAab().getRequiredSplits() : Collections.emptyList(), isBeta(file.getTags(), file.getVername()))));
    }

    /* access modifiers changed from: private */
    /* renamed from: mapListApps */
    public C5368e<AppsList> mo15344c(ListApps listApps) {
        if (!listApps.isOk()) {
            return C5368e.m10238a((Throwable) new IllegalStateException("Could not obtain request from server."));
        }
        ArrayList arrayList = new ArrayList();
        for (App app : listApps.getDataList().getList()) {
            arrayList.add(new Application(app.getName(), app.getIcon(), app.getStats().getRating().getAvg(), app.getStats().getDownloads(), app.getPackageName(), app.getId(), "", app.getAppcoins() != null && app.getAppcoins().hasBilling()));
        }
        return C5368e.m10257c(new AppsList(arrayList, false, listApps.getDataList().getNext()));
    }

    private List<FlagsVote> mapToFlagsVote(List<GetAppMeta.GetAppMetaFile.Flags.Vote> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (GetAppMeta.GetAppMetaFile.Flags.Vote next : list) {
                arrayList.add(new FlagsVote(next.getCount(), map(next.getType())));
            }
        }
        return arrayList;
    }

    private List<RatingVote> mapToRatingsVote(List<GetAppMeta.Stats.Rating.Vote> list) {
        ArrayList arrayList = new ArrayList();
        for (GetAppMeta.Stats.Rating.Vote next : list) {
            arrayList.add(new RatingVote(next.getCount(), next.getValue()));
        }
        return arrayList;
    }

    private List<AppScreenshot> mapToScreenShots(List<GetAppMeta.Media.Screenshot> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (GetAppMeta.Media.Screenshot next : list) {
                arrayList.add(new AppScreenshot(next.getHeight(), next.getWidth(), next.getOrientation(), next.getUrl()));
            }
        }
        return arrayList;
    }

    private List<AppVideo> mapToVideo(List<GetAppMeta.Media.Video> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (GetAppMeta.Media.Video next : list) {
                arrayList.add(new AppVideo(next.getThumbnail(), next.getType(), next.getUrl()));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo15334a(GetApp getApp) {
        return mo15336a(getApp, "");
    }

    /* renamed from: d */
    public /* synthetic */ void mo15348d() {
        this.loadingApps = true;
    }

    /* renamed from: e */
    public /* synthetic */ void mo15350e() {
        this.loadingApps = false;
    }

    /* renamed from: f */
    public /* synthetic */ void mo15352f() {
        this.loadingApps = false;
    }

    /* renamed from: g */
    public /* synthetic */ void mo15354g() {
        this.loadingApps = true;
    }

    /* renamed from: i */
    public /* synthetic */ void mo15357i() {
        this.loadingApps = false;
    }

    /* renamed from: j */
    public /* synthetic */ void mo15358j() {
        this.loadingApps = true;
    }

    /* renamed from: k */
    public /* synthetic */ void mo15359k() {
        this.loadingApps = false;
    }

    /* renamed from: l */
    public /* synthetic */ void mo15360l() {
        this.loadingApps = false;
    }

    public Single<AppsList> loadAppcRecommendedApps(int i, String str) {
        if (this.loadingAppcSimilarApps) {
            return Single.m10119a(new AppsList(true));
        }
        return new GetRecommendedRequest(new GetRecommendedRequest.Body(i, str, "appc"), this.bodyInterceptorV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(true, false).mo18663b((C5377a) new C4569u(this)).mo18680d((C5377a) new C4563s(this)).mo18673c((C5377a) new C4584z(this)).mo18687f(new C4524f0(this)).mo18700m().mo18571f(new C4567t0(this));
    }

    public Single<DetailedAppRequestResult> loadDetailedApp(long j, String str, String str2) {
        if (this.loadingApps) {
            return Single.m10119a(new DetailedAppRequestResult(true));
        }
        return GetAppRequest.m5250of(j, (String) null, StoreUtils.getStoreCredentials(str, this.storeCredentialsProvider), str2, this.bodyInterceptorV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, this.appBundlesVisibilityManager).observe(false, false).mo18663b((C5377a) new C4561r0(this)).mo18680d((C5377a) new C4548n(this)).mo18673c((C5377a) new C4545m(this)).mo18687f(new C4554p(this)).mo18700m().mo18571f(new C4534i0(this));
    }

    public Single<DetailedAppRequestResult> loadDetailedAppFromMd5(String str) {
        if (this.loadingApps) {
            return Single.m10119a(new DetailedAppRequestResult(true));
        }
        return GetAppRequest.ofMd5(str, this.bodyInterceptorV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, this.appBundlesVisibilityManager).observe(false, ManagerPreferences.getAndResetForceServerRefresh(this.sharedPreferences)).mo18663b((C5377a) new C4508b0(this)).mo18680d((C5377a) new C4504a0(this)).mo18673c((C5377a) new C4564s0(this)).mo18687f(new C4585z0(this)).mo18700m().mo18571f(new C4512c0(this));
    }

    public Single<DetailedAppRequestResult> loadDetailedAppFromUniqueName(String str) {
        if (this.loadingApps) {
            return Single.m10119a(new DetailedAppRequestResult(true));
        }
        return GetAppRequest.ofUname(str, this.bodyInterceptorV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, this.appBundlesVisibilityManager).observe(false, false).mo18663b((C5377a) new C4576w0(this)).mo18680d((C5377a) new C4572v(this)).mo18673c((C5377a) new C4558q0(this)).mo18687f(new C4570u0(this, str)).mo18700m().mo18571f(new C4582y0(this));
    }

    public Single<AppsList> loadFreshApps(long j, int i) {
        return loadApps(j, true, 0, i);
    }

    public Single<AppsList> loadRecommendedApps(int i, String str) {
        if (this.loadingSimilarApps) {
            return Single.m10119a(new AppsList(true));
        }
        return new GetRecommendedRequest(new GetRecommendedRequest.Body(i, str), this.bodyInterceptorV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(true, false).mo18663b((C5377a) new C4528g0(this)).mo18680d((C5377a) new C4557q(this)).mo18673c((C5377a) new C4537j0(this)).mo18687f(new C4555p0(this)).mo18700m().mo18571f(new C4543l0(this));
    }

    /* renamed from: m */
    public /* synthetic */ void mo15369m() {
        this.loadingApps = true;
    }

    /* renamed from: n */
    public /* synthetic */ void mo15370n() {
        this.loadingApps = false;
    }

    /* renamed from: o */
    public /* synthetic */ void mo15371o() {
        this.loadingApps = false;
    }

    /* renamed from: p */
    public /* synthetic */ void mo15372p() {
        this.loadingApps = true;
    }

    /* renamed from: q */
    public /* synthetic */ void mo15373q() {
        this.loadingApps = false;
    }

    /* renamed from: r */
    public /* synthetic */ void mo15374r() {
        this.loadingApps = false;
    }

    /* renamed from: s */
    public /* synthetic */ void mo15375s() {
        this.loadingSimilarApps = true;
    }

    /* renamed from: t */
    public /* synthetic */ void mo15376t() {
        this.loadingSimilarApps = false;
    }

    /* renamed from: u */
    public /* synthetic */ void mo15377u() {
        this.loadingSimilarApps = false;
    }

    public Single<DetailedAppRequestResult> unsafeLoadDetailedApp(long j, String str, String str2) {
        return GetAppRequest.m5250of(j, (String) null, StoreUtils.getStoreCredentials(str, this.storeCredentialsProvider), str2, this.bodyInterceptorV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, this.appBundlesVisibilityManager).observe(false, false).mo18663b((C5377a) new C4566t(this)).mo18680d((C5377a) new C4549n0(this)).mo18673c((C5377a) new C4531h0(this)).mo18687f(new C4579x0(this)).mo18700m().mo18571f(new C4520e0(this));
    }

    /* renamed from: v */
    public /* synthetic */ void mo15379v() {
        this.loadingApps = true;
    }

    /* renamed from: w */
    public /* synthetic */ void mo15380w() {
        this.loadingApps = false;
    }

    /* renamed from: x */
    public /* synthetic */ void mo15381x() {
        this.loadingApps = false;
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo15343c(GetApp getApp) {
        return mo15336a(getApp, "");
    }

    /* renamed from: h */
    public /* synthetic */ void mo15356h() {
        this.loadingApps = false;
    }

    /* renamed from: a */
    public /* synthetic */ void mo15337a() {
        this.loadingAppcSimilarApps = true;
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo15339b(GetApp getApp) {
        return mo15336a(getApp, "");
    }

    /* renamed from: d */
    public /* synthetic */ C5368e mo15347d(GetApp getApp) {
        return mo15336a(getApp, "");
    }

    /* renamed from: b */
    public /* synthetic */ void mo15341b() {
        this.loadingAppcSimilarApps = false;
    }

    /* renamed from: c */
    public /* synthetic */ void mo15345c() {
        this.loadingAppcSimilarApps = false;
    }

    public Single<DetailedAppRequestResult> loadDetailedApp(String str, String str2) {
        if (this.loadingApps) {
            return Single.m10119a(new DetailedAppRequestResult(true));
        }
        return GetAppRequest.m5253of(str, str2, this.bodyInterceptorV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, this.appBundlesVisibilityManager).observe(false, false).mo18663b((C5377a) new C4546m0(this)).mo18680d((C5377a) new C4560r(this)).mo18673c((C5377a) new C4581y(this)).mo18687f(new C4516d0(this)).mo18700m().mo18571f(new C4575w(this));
    }

    public Single<AppsList> loadApps(long j, int i, int i2) {
        return loadApps(j, false, i, i2);
    }
}
