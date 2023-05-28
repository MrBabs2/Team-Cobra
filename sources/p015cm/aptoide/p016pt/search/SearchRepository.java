package p015cm.aptoide.p016pt.search;

import android.content.SharedPreferences;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.aab.Split;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.exception.NoNetworkConnectionException;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Aab;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.DataList;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.App;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.File;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.search.ListSearchApps;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.search.SearchApp;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.ListSearchAppsRequest;
import p015cm.aptoide.p016pt.dataprovider.util.HashMapNotNull;
import p015cm.aptoide.p016pt.download.OemidProvider;
import p015cm.aptoide.p016pt.download.view.DownloadStatusModel;
import p015cm.aptoide.p016pt.search.model.SearchAppResult;
import p015cm.aptoide.p016pt.search.model.SearchFilters;
import p015cm.aptoide.p016pt.search.model.SearchResult;
import p015cm.aptoide.p016pt.search.model.SearchResultError;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p015cm.aptoide.p016pt.store.StoreUtils;
import p015cm.aptoide.p016pt.view.app.AppScreenshot;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.C5375k;
import p123rx.Single;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;
import p123rx.p127s.C12871b;
import p123rx.schedulers.Schedulers;
import retrofit2.Converter;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J&\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\"J,\u00104\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u0001052\u0006\u0010.\u001a\u00020/2\b\u00106\u001a\u0004\u0018\u00010/2\u0006\u00107\u001a\u000208H\u0002J \u00109\u001a\u00020\"2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010.\u001a\u00020/H\u0002J\u0018\u0010>\u001a\u00020\"2\u0006\u0010?\u001a\u00020/2\u0006\u0010.\u001a\u00020/H\u0002J\u001e\u0010@\u001a\b\u0012\u0004\u0012\u00020B0A2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010AH\u0002J \u0010E\u001a\u00020F2\u0006\u0010<\u001a\u00020=2\u0006\u0010G\u001a\u00020/2\u0006\u0010H\u001a\u00020\"H\u0002J*\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0A0J2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020=0A2\u0006\u0010.\u001a\u00020/H\u0002J2\u0010L\u001a\b\u0012\u0004\u0012\u00020\u0019052\u0006\u0010.\u001a\u00020/2\b\u0010M\u001a\u0004\u0018\u00010N2\u0006\u00100\u001a\u0002012\b\u00106\u001a\u0004\u0018\u00010/H\u0002J\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00190JJ8\u0010P\u001a\b\u0012\u0004\u0012\u00020\u0019052\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010Q\u001a\u00020;2\u0006\u00102\u001a\u00020\"2\b\u00106\u001a\u0004\u0018\u00010/H\u0002J2\u0010R\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\"2\b\u00106\u001a\u0004\u0018\u00010/2\u0006\u00103\u001a\u00020\"H\u0002J.\u0010S\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\"2\u0006\u0010T\u001a\u00020/2\u0006\u00103\u001a\u00020\"J\u0012\u0010U\u001a\u00020-2\b\u0010V\u001a\u0004\u0018\u00010\u0019H\u0002R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190\u001bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006W"}, mo16641d2 = {"Lcm/aptoide/pt/search/SearchRepository;", "", "storeRepository", "Lcm/aptoide/pt/store/RoomStoreRepository;", "bodyInterceptor", "Lcm/aptoide/pt/dataprovider/ws/BodyInterceptor;", "Lcm/aptoide/pt/dataprovider/ws/v7/BaseBody;", "httpClient", "Lokhttp3/OkHttpClient;", "converterFactory", "Lretrofit2/Converter$Factory;", "tokenInvalidator", "Lcm/aptoide/pt/dataprovider/interfaces/TokenInvalidator;", "sharedPreferences", "Landroid/content/SharedPreferences;", "appBundlesVisibilityManager", "Lcm/aptoide/pt/dataprovider/aab/AppBundlesVisibilityManager;", "oemidProvider", "Lcm/aptoide/pt/download/OemidProvider;", "(Lcm/aptoide/pt/store/RoomStoreRepository;Lcm/aptoide/pt/dataprovider/ws/BodyInterceptor;Lokhttp3/OkHttpClient;Lretrofit2/Converter$Factory;Lcm/aptoide/pt/dataprovider/interfaces/TokenInvalidator;Landroid/content/SharedPreferences;Lcm/aptoide/pt/dataprovider/aab/AppBundlesVisibilityManager;Lcm/aptoide/pt/download/OemidProvider;)V", "getAppBundlesVisibilityManager", "()Lcm/aptoide/pt/dataprovider/aab/AppBundlesVisibilityManager;", "getBodyInterceptor", "()Lcm/aptoide/pt/dataprovider/ws/BodyInterceptor;", "cachedSearchResults", "Lcm/aptoide/pt/search/model/SearchResult;", "cancelationSubject", "Lrx/subjects/PublishSubject;", "Ljava/lang/Void;", "getConverterFactory", "()Lretrofit2/Converter$Factory;", "getHttpClient", "()Lokhttp3/OkHttpClient;", "loadingMore", "", "getOemidProvider", "()Lcm/aptoide/pt/download/OemidProvider;", "resultsSubject", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "getStoreRepository", "()Lcm/aptoide/pt/store/RoomStoreRepository;", "getTokenInvalidator", "()Lcm/aptoide/pt/dataprovider/interfaces/TokenInvalidator;", "generalSearch", "Lrx/Completable;", "query", "", "filters", "Lcm/aptoide/pt/search/model/SearchFilters;", "matureEnabled", "useCachedValues", "handleSearchError", "Lrx/Single;", "specificStore", "throwable", "", "isHighlightedResult", "i", "", "app", "Lcm/aptoide/pt/dataprovider/model/v7/search/SearchApp;", "isQuerySameAsAppName", "appName", "mapSplits", "", "Lcm/aptoide/pt/aab/Split;", "splits", "Lcm/aptoide/pt/dataprovider/model/v7/Split;", "mapToSearchAppResult", "Lcm/aptoide/pt/search/model/SearchAppResult;", "oemid", "isHighlighted", "mapToSearchAppResultList", "Lrx/Observable;", "searchAppList", "mapToSearchResult", "response", "Lcm/aptoide/pt/dataprovider/model/v7/search/ListSearchApps;", "observeSearchResults", "requestSearchResults", "nextOffset", "search", "searchInStore", "storeName", "updateMemCache", "results", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.search.SearchRepository */
/* compiled from: SearchRepository.kt */
public final class SearchRepository {
    private final AppBundlesVisibilityManager appBundlesVisibilityManager;
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    /* access modifiers changed from: private */
    public SearchResult cachedSearchResults;
    private final C12871b<Void> cancelationSubject;
    private final Converter.Factory converterFactory;
    private final OkHttpClient httpClient;
    /* access modifiers changed from: private */
    public boolean loadingMore;
    private final OemidProvider oemidProvider;
    /* access modifiers changed from: private */
    public final C12871b<SearchResult> resultsSubject;
    private final SharedPreferences sharedPreferences;
    private final RoomStoreRepository storeRepository;
    private final TokenInvalidator tokenInvalidator;

    public SearchRepository(RoomStoreRepository roomStoreRepository, BodyInterceptor<BaseBody> bodyInterceptor2, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator2, SharedPreferences sharedPreferences2, AppBundlesVisibilityManager appBundlesVisibilityManager2, OemidProvider oemidProvider2) {
        C10202j.m34178b(roomStoreRepository, "storeRepository");
        C10202j.m34178b(bodyInterceptor2, "bodyInterceptor");
        C10202j.m34178b(okHttpClient, "httpClient");
        C10202j.m34178b(factory, "converterFactory");
        C10202j.m34178b(tokenInvalidator2, "tokenInvalidator");
        C10202j.m34178b(sharedPreferences2, "sharedPreferences");
        C10202j.m34178b(appBundlesVisibilityManager2, "appBundlesVisibilityManager");
        C10202j.m34178b(oemidProvider2, "oemidProvider");
        this.storeRepository = roomStoreRepository;
        this.bodyInterceptor = bodyInterceptor2;
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.tokenInvalidator = tokenInvalidator2;
        this.sharedPreferences = sharedPreferences2;
        this.appBundlesVisibilityManager = appBundlesVisibilityManager2;
        this.oemidProvider = oemidProvider2;
        C12871b<SearchResult> p = C12871b.m41468p();
        C10202j.m34174a((Object) p, "PublishSubject.create()");
        this.resultsSubject = p;
        C12871b<Void> p2 = C12871b.m41468p();
        C10202j.m34174a((Object) p2, "PublishSubject.create()");
        this.cancelationSubject = p2;
    }

    /* access modifiers changed from: private */
    public final Single<SearchResult> handleSearchError(String str, String str2, Throwable th) {
        if ((th instanceof UnknownHostException) || (th instanceof NoNetworkConnectionException)) {
            return Single.m10119a(new SearchResult(str, str2, SearchResultError.NO_NETWORK));
        }
        return Single.m10119a(new SearchResult(str, str2, SearchResultError.GENERIC));
    }

    private final boolean isHighlightedResult(int i, SearchApp searchApp, String str) {
        if (i == 0) {
            String name = searchApp.getName();
            C10202j.m34174a((Object) name, "app.name");
            if (isQuerySameAsAppName(name, str)) {
                File file = searchApp.getFile();
                C10202j.m34174a((Object) file, "app.file");
                Malware malware = file.getMalware();
                C10202j.m34174a((Object) malware, "app.file.malware");
                if (malware.getRank() == Malware.Rank.TRUSTED) {
                    App.Stats stats = searchApp.getStats();
                    C10202j.m34174a((Object) stats, "app.stats");
                    if (stats.getPdownloads() >= 1000000) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final boolean isQuerySameAsAppName(String str, String str2) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            C10202j.m34174a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            String a = C12130v.m40045a(C12130v.m40045a(lowerCase, " ", "", false, 4, (Object) null), "-", "", false, 4, (Object) null);
            if (str2 != null) {
                String lowerCase2 = str2.toLowerCase();
                C10202j.m34174a((Object) lowerCase2, "(this as java.lang.String).toLowerCase()");
                return C10202j.m34176a((Object) a, (Object) C12130v.m40045a(C12130v.m40045a(lowerCase2, " ", "", false, 4, (Object) null), "-", "", false, 4, (Object) null));
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    private final List<Split> mapSplits(List<? extends p015cm.aptoide.p016pt.dataprovider.model.p020v7.Split> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (p015cm.aptoide.p016pt.dataprovider.model.p020v7.Split split : list) {
            String name = split.getName();
            C10202j.m34174a((Object) name, "split.name");
            String type = split.getType();
            C10202j.m34174a((Object) type, "split.type");
            String path = split.getPath();
            C10202j.m34174a((Object) path, "split.path");
            long filesize = split.getFilesize();
            String md5sum = split.getMd5sum();
            C10202j.m34174a((Object) md5sum, "split.md5sum");
            arrayList.add(new Split(name, type, path, filesize, md5sum));
        }
        return arrayList;
    }

    private final SearchAppResult mapToSearchAppResult(SearchApp searchApp, String str, boolean z) {
        List<String> emptyList = Collections.emptyList();
        List<p015cm.aptoide.p016pt.dataprovider.model.p020v7.Split> emptyList2 = Collections.emptyList();
        Aab aab = searchApp.getAab();
        if (aab != null) {
            emptyList = aab.getRequiredSplits();
            emptyList2 = aab.getSplits();
        }
        List<String> list = emptyList;
        File file = searchApp.getFile();
        C10202j.m34174a((Object) file, "app.file");
        Malware malware = file.getMalware();
        C10202j.m34174a((Object) malware, "app.file.malware");
        int ordinal = malware.getRank().ordinal();
        String icon = searchApp.getIcon();
        Store store = searchApp.getStore();
        C10202j.m34174a((Object) store, "app.store");
        String name = store.getName();
        Store store2 = searchApp.getStore();
        C10202j.m34174a((Object) store2, "app.store");
        Long valueOf = Long.valueOf(store2.getId());
        Store store3 = searchApp.getStore();
        C10202j.m34174a((Object) store3, "app.store");
        Store.Appearance appearance = store3.getAppearance();
        C10202j.m34174a((Object) appearance, "app.store.appearance");
        String theme = appearance.getTheme();
        Date modified = searchApp.getModified();
        C10202j.m34174a((Object) modified, "app.modified");
        long time = modified.getTime();
        App.Stats stats = searchApp.getStats();
        C10202j.m34174a((Object) stats, "app.stats");
        App.Stats.Rating rating = stats.getRating();
        C10202j.m34174a((Object) rating, "app.stats.rating");
        float avg = rating.getAvg();
        App.Stats stats2 = searchApp.getStats();
        C10202j.m34174a((Object) stats2, "app.stats");
        String name2 = searchApp.getName();
        String packageName = searchApp.getPackageName();
        SearchAppResult searchAppResult = r2;
        File file2 = searchApp.getFile();
        C10202j.m34174a((Object) file2, "app.file");
        String str2 = "app.file";
        String md5sum = file2.getMd5sum();
        long id = searchApp.getId();
        File file3 = searchApp.getFile();
        C10202j.m34174a((Object) file3, str2);
        int vercode = file3.getVercode();
        File file4 = searchApp.getFile();
        C10202j.m34174a((Object) file4, str2);
        String vername = file4.getVername();
        File file5 = searchApp.getFile();
        C10202j.m34174a((Object) file5, str2);
        String path = file5.getPath();
        File file6 = searchApp.getFile();
        C10202j.m34174a((Object) file6, str2);
        String pathAlt = file6.getPathAlt();
        File file7 = searchApp.getFile();
        C10202j.m34174a((Object) file7, str2);
        SearchAppResult searchAppResult2 = new SearchAppResult(ordinal, icon, name, valueOf, theme, time, avg, (long) stats2.getPdownloads(), name2, packageName, md5sum, id, vercode, vername, path, pathAlt, file7.getMalware(), searchApp.getSize(), searchApp.hasVersions(), searchApp.hasBilling(), searchApp.hasAdvertising(), str, z, searchApp.getObb(), list, mapSplits(emptyList2), (DownloadStatusModel) null, (List<AppScreenshot>) null);
        return searchAppResult;
    }

    /* access modifiers changed from: private */
    public final C5368e<List<SearchAppResult>> mapToSearchAppResultList(List<? extends SearchApp> list, String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (SearchApp searchApp : list) {
            String oemid = this.oemidProvider.getOemid();
            C10202j.m34174a((Object) oemid, "oemidProvider.oemid");
            arrayList.add(mapToSearchAppResult(searchApp, oemid, isHighlightedResult(i, searchApp, str)));
            i++;
        }
        C5368e<List<SearchAppResult>> c = C5368e.m10257c(arrayList);
        C10202j.m34174a((Object) c, "Observable.just(newList)");
        return c;
    }

    /* access modifiers changed from: private */
    public final Single<SearchResult> mapToSearchResult(String str, ListSearchApps listSearchApps, SearchFilters searchFilters, String str2) {
        if (listSearchApps != null) {
            DataList dataList = listSearchApps.getDataList();
            C10202j.m34174a((Object) dataList, "r.dataList");
            Single<SearchResult> e = C5368e.m10257c(dataList.getList()).mo18687f(new SearchRepository$mapToSearchResult$$inlined$let$lambda$1(this, str, str2, searchFilters)).mo18669c().mo18694j(new SearchRepository$mapToSearchResult$$inlined$let$lambda$2(listSearchApps, this, str, str2, searchFilters)).mo18700m().mo18570e(new SearchRepository$mapToSearchResult$$inlined$let$lambda$3(this, str, str2, searchFilters));
            C10202j.m34174a((Object) e, "Observable.just(r.dataLi…e, throwable)\n          }");
            return e;
        }
        Single<SearchResult> a = Single.m10119a(new SearchResult(str, SearchResultError.GENERIC));
        C10202j.m34174a((Object) a, "Single.just(SearchResult…archResultError.GENERIC))");
        return a;
    }

    private final Single<SearchResult> requestSearchResults(String str, SearchFilters searchFilters, int i, boolean z, String str2) {
        String str3;
        SearchRepository searchRepository;
        String str4 = str;
        HashMapNotNull<String, List<String>> subscribedStoresAuthMap = StoreUtils.getSubscribedStoresAuthMap(this.storeRepository);
        boolean onlyFollowedStores = searchFilters.getOnlyFollowedStores();
        boolean onlyTrustedApps = searchFilters.getOnlyTrustedApps();
        boolean onlyBetaApps = searchFilters.getOnlyBetaApps();
        boolean onlyAppcApps = searchFilters.getOnlyAppcApps();
        Boolean valueOf = Boolean.valueOf(z);
        List<Long> subscribedStoresIds = StoreUtils.getSubscribedStoresIds(this.storeRepository);
        BodyInterceptor<BaseBody> bodyInterceptor2 = this.bodyInterceptor;
        OkHttpClient okHttpClient = this.httpClient;
        Converter.Factory factory = this.converterFactory;
        TokenInvalidator tokenInvalidator2 = this.tokenInvalidator;
        SharedPreferences sharedPreferences2 = this.sharedPreferences;
        AppBundlesVisibilityManager appBundlesVisibilityManager2 = this.appBundlesVisibilityManager;
        String str5 = str2;
        ListSearchAppsRequest of = ListSearchAppsRequest.m5267of(str, i, onlyFollowedStores, onlyTrustedApps, onlyBetaApps, onlyAppcApps, valueOf, subscribedStoresIds, subscribedStoresAuthMap, bodyInterceptor2, okHttpClient, factory, tokenInvalidator2, sharedPreferences2, appBundlesVisibilityManager2);
        if (str5 != null) {
            str3 = str5;
            searchRepository = this;
            of = ListSearchAppsRequest.m5266of(str, i, str2, searchFilters.getOnlyTrustedApps(), searchFilters.getOnlyBetaApps(), searchFilters.getOnlyAppcApps(), Boolean.valueOf(z), subscribedStoresAuthMap, searchRepository.bodyInterceptor, searchRepository.httpClient, searchRepository.converterFactory, searchRepository.tokenInvalidator, searchRepository.sharedPreferences, searchRepository.appBundlesVisibilityManager);
        } else {
            str3 = str5;
            searchRepository = this;
        }
        String str6 = str;
        Single<SearchResult> e = of.observe(false).mo18700m().mo18559a(new SearchRepository$requestSearchResults$2(searchRepository, str6, searchFilters, str3)).mo18570e(new SearchRepository$requestSearchResults$3(searchRepository, str6, str3));
        C10202j.m34174a((Object) e, "request\n        .observe…ore, throwable)\n        }");
        return e;
    }

    /* access modifiers changed from: private */
    public final synchronized C5328b search(String str, SearchFilters searchFilters, boolean z, String str2, boolean z2) {
        if (z2) {
            C5328b d = C5328b.m10169d(new SearchRepository$search$1(this));
            C10202j.m34174a((Object) d, "Completable.fromAction {…hedSearchResults)\n      }");
            return d;
        }
        SearchResult searchResult = this.cachedSearchResults;
        if (searchResult == null || !C10202j.m34176a((Object) searchResult.getQuery(), (Object) str) || !C10202j.m34176a((Object) searchResult.getSpecificStore(), (Object) str2) || !C10202j.m34176a((Object) searchFilters, (Object) searchResult.getFilters()) || searchResult.hasError()) {
            this.cachedSearchResults = null;
            this.cancelationSubject.onNext(null);
            C5328b b = requestSearchResults(str, searchFilters, 0, z, str2).mo18567c().mo18683e(this.cancelationSubject).mo18639a(null).mo18700m().mo18566b(new SearchRepository$search$3(this));
            C10202j.m34174a((Object) b, "requestSearchResults(que…updateMemCache(results) }");
            return b;
        } else if (!searchResult.hasMore()) {
            C5328b d2 = C5328b.m10169d(new SearchRepository$search$$inlined$let$lambda$6(searchResult, this, str, str2, searchFilters, z));
            C10202j.m34174a((Object) d2, "Completable.fromAction {…ctiveResults)\n          }");
            return d2;
        } else if (this.loadingMore) {
            C5328b f = C5328b.m10170f();
            C10202j.m34174a((Object) f, "Completable.complete()");
            return f;
        } else {
            C5328b a = requestSearchResults(str, searchFilters, searchResult.getNextOffset(), z, str2).mo18567c().mo18683e(this.cancelationSubject).mo18639a(null).mo18700m().mo18566b(new SearchRepository$search$$inlined$let$lambda$1(this, str, str2, searchFilters, z)).mo18602b((C5378b<? super C5375k>) new SearchRepository$search$$inlined$let$lambda$2(this, str, str2, searchFilters, z)).mo18607c((C5377a) new SearchRepository$search$$inlined$let$lambda$3(this, str, str2, searchFilters, z)).mo18601b((C5377a) new SearchRepository$search$$inlined$let$lambda$4(this, str, str2, searchFilters, z)).mo18590a((C5378b<? super Throwable>) new SearchRepository$search$$inlined$let$lambda$5(this, str, str2, searchFilters, z));
            C10202j.m34174a((Object) a, "requestSearchResults(que…r { loadingMore = false }");
            return a;
        }
    }

    /* access modifiers changed from: private */
    public final synchronized C5328b updateMemCache(SearchResult searchResult) {
        C5328b d;
        d = C5328b.m10169d(new SearchRepository$updateMemCache$1(this, searchResult));
        C10202j.m34174a((Object) d, "Completable.fromAction {…)\n        }\n      }\n    }");
        return d;
    }

    public final C5328b generalSearch(String str, SearchFilters searchFilters, boolean z, boolean z2) {
        C10202j.m34178b(str, "query");
        C10202j.m34178b(searchFilters, "filters");
        C5328b b = Single.m10119a(str).mo18566b(new SearchRepository$generalSearch$1(this, str, searchFilters, z, z2)).mo18600b(Schedulers.m10352io());
        C10202j.m34174a((Object) b, "Single.just(query)\n     …scribeOn(Schedulers.io())");
        return b;
    }

    public final AppBundlesVisibilityManager getAppBundlesVisibilityManager() {
        return this.appBundlesVisibilityManager;
    }

    public final BodyInterceptor<BaseBody> getBodyInterceptor() {
        return this.bodyInterceptor;
    }

    public final Converter.Factory getConverterFactory() {
        return this.converterFactory;
    }

    public final OkHttpClient getHttpClient() {
        return this.httpClient;
    }

    public final OemidProvider getOemidProvider() {
        return this.oemidProvider;
    }

    public final SharedPreferences getSharedPreferences() {
        return this.sharedPreferences;
    }

    public final RoomStoreRepository getStoreRepository() {
        return this.storeRepository;
    }

    public final TokenInvalidator getTokenInvalidator() {
        return this.tokenInvalidator;
    }

    public final C5368e<SearchResult> observeSearchResults() {
        return this.resultsSubject;
    }

    public final C5328b searchInStore(String str, SearchFilters searchFilters, boolean z, String str2, boolean z2) {
        C10202j.m34178b(str, "query");
        C10202j.m34178b(searchFilters, "filters");
        C10202j.m34178b(str2, "storeName");
        C5328b b = Single.m10119a(str).mo18566b(new SearchRepository$searchInStore$1(this, str, searchFilters, z, str2, z2)).mo18600b(Schedulers.m10352io());
        C10202j.m34174a((Object) b, "Single.just(query)\n     …scribeOn(Schedulers.io())");
        return b;
    }
}
