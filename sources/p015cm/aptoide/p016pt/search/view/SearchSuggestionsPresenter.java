package p015cm.aptoide.p016pt.search.view;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.search.SearchNavigator;
import p015cm.aptoide.p016pt.search.SuggestionCursorAdapter;
import p015cm.aptoide.p016pt.search.analytics.SearchAnalytics;
import p015cm.aptoide.p016pt.search.model.SearchQueryModel;
import p015cm.aptoide.p016pt.search.suggestions.SearchQueryEvent;
import p015cm.aptoide.p016pt.search.suggestions.SearchSuggestionManager;
import p015cm.aptoide.p016pt.search.suggestions.TrendingManager;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.Single;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.search.view.SearchSuggestionsPresenter */
public class SearchSuggestionsPresenter implements Presenter {
    private static final String TAG = "cm.aptoide.pt.search.view.SearchSuggestionsPresenter";
    private final CrashReport crashReport;
    private final SearchNavigator navigator;
    private final SearchAnalytics searchAnalytics;
    private final SearchSuggestionManager searchSuggestionManager;
    private boolean showSuggestionsOnFirstLoadWithEmptyQuery;
    private final SuggestionCursorAdapter suggestionCursorAdapter;
    private final TrendingManager trendingManager;
    private final SearchSuggestionsView view;
    private final C5373h viewScheduler;

    public SearchSuggestionsPresenter(SearchSuggestionsView searchSuggestionsView, SearchSuggestionManager searchSuggestionManager2, C5373h hVar, SuggestionCursorAdapter suggestionCursorAdapter2, CrashReport crashReport2, TrendingManager trendingManager2, SearchNavigator searchNavigator, boolean z, SearchAnalytics searchAnalytics2) {
        this.view = searchSuggestionsView;
        this.searchSuggestionManager = searchSuggestionManager2;
        this.viewScheduler = hVar;
        this.suggestionCursorAdapter = suggestionCursorAdapter2;
        this.crashReport = crashReport2;
        this.trendingManager = trendingManager2;
        this.navigator = searchNavigator;
        this.showSuggestionsOnFirstLoadWithEmptyQuery = z;
        this.searchAnalytics = searchAnalytics2;
    }

    /* renamed from: e */
    static /* synthetic */ void m7235e(List list) {
    }

    /* renamed from: f */
    static /* synthetic */ void m7238f(List list) {
    }

    private C5368e<SearchQueryEvent> getDebouncedQueryChanges() {
        return this.view.onQueryTextChanged().mo18634a(250, TimeUnit.MILLISECONDS);
    }

    /* renamed from: h */
    static /* synthetic */ Boolean m7243h(SearchQueryEvent searchQueryEvent) {
        return Boolean.valueOf(searchQueryEvent.hasQuery() && searchQueryEvent.isSubmitted());
    }

    /* renamed from: h */
    static /* synthetic */ void m7244h(List list) {
    }

    private void handleQueryTextChanged() {
        this.view.getLifecycleEvent().mo18681d(C4153p6.f7236f).mo18687f(new C4162q6(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4109k7.f7192f, (C5378b<Throwable>) new C4036c7(this));
    }

    private void handleQueryTextCleaned() {
        this.view.getLifecycleEvent().mo18681d(C4186t6.f7269f).mo18687f(new C4072g7(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4234z6.f7317f, (C5378b<Throwable>) new C4144o6(this));
    }

    private void handleQueryTextSubmitted() {
        this.view.getLifecycleEvent().mo18681d(C4136n7.f7219f).mo18687f(new C4117l6(this)).mo18644a(this.viewScheduler).mo18664b(new C4145o7(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4194u6.f7277f, (C5378b<Throwable>) new C4218x6(this));
    }

    /* renamed from: i */
    static /* synthetic */ void m7245i(SearchQueryEvent searchQueryEvent) {
    }

    private void showSuggestionsIfCurrentQueryIsEmpty() {
        this.view.getLifecycleEvent().mo18681d(C4100j7.f7182f).mo18692i(new C4202v6(this)).mo18681d(new C4081h7(this)).mo18692i(new C4135n6(this)).mo18681d(C4118l7.f7201f).mo18644a(this.viewScheduler).mo18664b(new C4027b7(this)).mo18664b(new C4154p7(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4226y6.f7309f, (C5378b<Throwable>) new C4127m7(this));
    }

    /* renamed from: a */
    public /* synthetic */ Single mo14509a(SearchQueryEvent searchQueryEvent) {
        return this.trendingManager.getTrendingCursorSuggestions().mo18556a(this.viewScheduler).mo18564b(new C4126m6(this));
    }

    /* renamed from: b */
    public /* synthetic */ void mo14515b(SearchQueryEvent searchQueryEvent) {
        this.view.collapseSearchBar(true);
        SearchQueryModel searchQueryModel = new SearchQueryModel(searchQueryEvent.getQuery());
        this.navigator.navigate(searchQueryModel);
        if (searchQueryEvent.isSuggestion()) {
            this.searchAnalytics.searchFromSuggestion(searchQueryModel, searchQueryEvent.getPosition());
        } else {
            this.searchAnalytics.search(searchQueryModel);
        }
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo14519c(View.LifecycleEvent lifecycleEvent) {
        return getDebouncedQueryChanges().mo18681d(C4090i7.f7170f);
    }

    /* renamed from: d */
    public /* synthetic */ void mo14524d(Throwable th) {
        this.crashReport.log(th);
    }

    public void present() {
        handleQueryTextSubmitted();
        handleQueryTextCleaned();
        handleQueryTextChanged();
        if (this.showSuggestionsOnFirstLoadWithEmptyQuery) {
            showSuggestionsIfCurrentQueryIsEmpty();
        }
    }

    /* renamed from: e */
    static /* synthetic */ Boolean m7234e(SearchQueryEvent searchQueryEvent) {
        return Boolean.valueOf(searchQueryEvent.hasQuery() && !searchQueryEvent.isSubmitted());
    }

    /* renamed from: c */
    public /* synthetic */ void mo14520c(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: d */
    public /* synthetic */ Single mo14522d(View.LifecycleEvent lifecycleEvent) {
        return this.view.onQueryTextChanged().mo18669c().mo18700m();
    }

    /* renamed from: g */
    static /* synthetic */ Boolean m7241g(List list) {
        return Boolean.valueOf(list != null && list.size() > 0);
    }

    /* renamed from: c */
    public /* synthetic */ Boolean mo14518c(SearchQueryEvent searchQueryEvent) {
        String currentQuery = this.view.getCurrentQuery();
        return Boolean.valueOf((searchQueryEvent == null || searchQueryEvent.getQuery().length() == 0) && (currentQuery == null || currentQuery.isEmpty()));
    }

    /* renamed from: e */
    public /* synthetic */ void mo14526e(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo14512a(View.LifecycleEvent lifecycleEvent) {
        return getDebouncedQueryChanges().mo18681d(C4018a7.f7097f).mo18694j(C4170r6.f7253f).mo18692i(new C4054e7(this)).mo18686f();
    }

    /* renamed from: d */
    public /* synthetic */ Single mo14523d(SearchQueryEvent searchQueryEvent) {
        return this.trendingManager.getTrendingCursorSuggestions();
    }

    /* renamed from: d */
    public /* synthetic */ void mo14525d(List list) {
        this.view.focusInSearchBar();
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo14514b(View.LifecycleEvent lifecycleEvent) {
        return getDebouncedQueryChanges().mo18681d(C4045d7.f7124f).mo18692i(new C4063f7(this)).mo18686f();
    }

    /* renamed from: c */
    public /* synthetic */ void mo14521c(List list) {
        this.view.setTrendingCursor(list);
    }

    /* renamed from: a */
    public /* synthetic */ Single mo14510a(String str) {
        return this.searchSuggestionManager.getSuggestionsForApp(str).mo18570e(new C4210w6(this)).mo18556a(this.viewScheduler).mo18564b(new C4178s6(this));
    }

    /* renamed from: b */
    public /* synthetic */ void mo14517b(List list) {
        this.view.setTrendingCursor(list);
    }

    /* renamed from: b */
    public /* synthetic */ void mo14516b(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ Single mo14511a(Throwable th) {
        if (!(th instanceof TimeoutException)) {
            return Single.m10120a(th);
        }
        Logger.getInstance().mo12984i(TAG, "Timeout reached while waiting for application suggestions");
        return Single.m10119a(this.suggestionCursorAdapter.getSuggestions());
    }

    /* renamed from: a */
    public /* synthetic */ void mo14513a(List list) {
        this.suggestionCursorAdapter.setData(list);
    }
}
