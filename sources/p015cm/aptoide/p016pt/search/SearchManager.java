package p015cm.aptoide.p016pt.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.aptoideviews.filters.Filter;
import p015cm.aptoide.p016pt.download.view.DownloadStatusManager;
import p015cm.aptoide.p016pt.download.view.DownloadStatusModel;
import p015cm.aptoide.p016pt.search.model.SearchAppResult;
import p015cm.aptoide.p016pt.search.model.SearchFilterType;
import p015cm.aptoide.p016pt.search.model.SearchFilters;
import p015cm.aptoide.p016pt.search.model.SearchResult;
import p015cm.aptoide.p016pt.view.app.AppCenter;
import p015cm.aptoide.p016pt.view.app.AppScreenshot;
import p015cm.aptoide.p016pt.view.app.DetailedAppRequestResult;
import p123rx.C5328b;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.search.SearchManager */
public class SearchManager {
    private final AptoideAccountManager accountManager;
    private final AppCenter appCenter;
    private final DownloadStatusManager downloadStatusManager;
    private final SearchRepository searchRepository;

    public SearchManager(AptoideAccountManager aptoideAccountManager, SearchRepository searchRepository2, DownloadStatusManager downloadStatusManager2, AppCenter appCenter2) {
        this.accountManager = aptoideAccountManager;
        this.searchRepository = searchRepository2;
        this.downloadStatusManager = downloadStatusManager2;
        this.appCenter = appCenter2;
    }

    private C5368e<SearchResult> getHighlightedSearchResult(SearchResult searchResult) {
        return C5368e.m10257c(new SearchResult(searchResult.getQuery(), searchResult.getSpecificStore(), searchResult.getSearchResultsList(), searchResult.getFilters(), searchResult.getCurrentOffset(), searchResult.getNextOffset(), searchResult.getTotal(), searchResult.getLoading(), false, searchResult.getError()));
    }

    private C5368e<List<AppScreenshot>> loadAppScreenShots(long j, String str, String str2) {
        return C5368e.m10258c(C5368e.m10257c(null), (C5368e) this.appCenter.unsafeLoadDetailedApp(j, str, str2).mo18567c()).mo18694j(C3991d.f7075f).mo18682e(700, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: private */
    /* renamed from: mergeSearchResult */
    public SearchResult mo14081a(SearchResult searchResult, DownloadStatusModel downloadStatusModel, List<AppScreenshot> list) {
        ArrayList arrayList = new ArrayList(searchResult.getSearchResultsList());
        arrayList.set(0, new SearchAppResult((SearchAppResult) arrayList.get(0), downloadStatusModel, list));
        return new SearchResult(searchResult.getQuery(), searchResult.getSpecificStore(), arrayList, searchResult.getFilters(), searchResult.getCurrentOffset(), searchResult.getNextOffset(), searchResult.getTotal(), searchResult.getLoading(), searchResult.isFreshResult(), searchResult.getError());
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo14083a(String str, List list, boolean z, Boolean bool) {
        return this.searchRepository.generalSearch(str, getSearchFilters(list), bool.booleanValue(), z);
    }

    public C5328b disableAdultContent() {
        return this.accountManager.disable();
    }

    public C5328b enableAdultContent() {
        return this.accountManager.enable();
    }

    public C5328b enableAdultContentWithPin(int i) {
        return this.accountManager.enable(i);
    }

    public SearchFilters getSearchFilters(List<Filter> list) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (Filter next : list) {
            if (next.getIdentifier() != null) {
                if (next.getIdentifier().equals(SearchFilterType.FOLLOWED_STORES.name())) {
                    z = next.getSelected();
                } else if (next.getIdentifier().equals(SearchFilterType.TRUSTED.name())) {
                    z2 = next.getSelected();
                } else if (next.getIdentifier().equals(SearchFilterType.BETA.name())) {
                    z3 = next.getSelected();
                } else if (next.getIdentifier().equals(SearchFilterType.APPC.name())) {
                    z4 = next.getSelected();
                }
            }
        }
        return new SearchFilters(z, z2, z3, z4);
    }

    public C5368e<Boolean> isAdultContentEnabled() {
        return this.accountManager.hasMatureContentEnabled();
    }

    public C5368e<Boolean> isAdultContentPinRequired() {
        return this.accountManager.pinRequired();
    }

    public C5368e<SearchResult> observeHighlightedSearchResult(SearchResult searchResult) {
        SearchAppResult searchAppResult = searchResult.getSearchResultsList().get(0);
        return C5368e.m10246a(getHighlightedSearchResult(searchResult), this.downloadStatusManager.loadDownloadModel(searchAppResult.getMd5(), searchAppResult.getPackageName(), searchAppResult.getVersionCode(), (String) null, searchAppResult.getStoreId().longValue(), searchAppResult.hasAdvertising() || searchAppResult.hasBilling()), loadAppScreenShots(searchAppResult.getAppId(), searchAppResult.getStoreName(), searchAppResult.getPackageName()), new C3990c(this));
    }

    public C5368e<SearchResult> observeSearchResults() {
        return this.searchRepository.observeSearchResults().mo18703o(new C3987a(this));
    }

    public C5328b searchAppInStores(String str, List<Filter> list, boolean z) {
        return this.accountManager.hasMatureContentEnabled().mo18669c().mo18700m().mo18566b(new C3989b(this, str, list, z));
    }

    public C5328b searchInStore(String str, String str2, List<Filter> list, boolean z) {
        return this.accountManager.hasMatureContentEnabled().mo18669c().mo18700m().mo18566b(new C3992e(this, str, list, str2, z));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo14084a(SearchResult searchResult) {
        List<SearchAppResult> searchResultsList = searchResult.getSearchResultsList();
        if (searchResultsList.isEmpty() || !searchResultsList.get(0).isHighlightedResult()) {
            return C5368e.m10257c(searchResult);
        }
        if (searchResult.isFreshResult()) {
            return C5368e.m10258c(C5368e.m10257c(searchResult), (C5368e) observeHighlightedSearchResult(searchResult));
        }
        return observeHighlightedSearchResult(searchResult);
    }

    /* renamed from: a */
    static /* synthetic */ List m7028a(DetailedAppRequestResult detailedAppRequestResult) {
        List emptyList = Collections.emptyList();
        return (detailedAppRequestResult == null || detailedAppRequestResult.getDetailedApp() == null || detailedAppRequestResult.getDetailedApp().getMedia() == null || detailedAppRequestResult.getDetailedApp().getMedia().getScreenshots() == null) ? emptyList : detailedAppRequestResult.getDetailedApp().getMedia().getScreenshots();
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo14082a(String str, List list, String str2, boolean z, Boolean bool) {
        return this.searchRepository.searchInStore(str, getSearchFilters(list), bool.booleanValue(), str2, z);
    }
}
