package p015cm.aptoide.p016pt.search.view;

import android.view.MenuItem;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.widget.SearchView;
import com.trello.rxlifecycle.C4749b;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.search.SuggestionCursorAdapter;
import p015cm.aptoide.p016pt.search.analytics.SearchAnalytics;
import p015cm.aptoide.p016pt.search.analytics.SearchSource;
import p015cm.aptoide.p016pt.search.model.Suggestion;
import p015cm.aptoide.p016pt.search.suggestions.SearchQueryEvent;
import p015cm.aptoide.p016pt.view.fragment.FragmentView;
import p112n.p118g.p301a.p303b.p308c.p309a.C10686d;
import p112n.p118g.p301a.p303b.p308c.p309a.C10691g;
import p123rx.C5368e;
import p123rx.p126m.C5378b;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.search.view.AppSearchSuggestionsView */
public class AppSearchSuggestionsView implements SearchSuggestionsView {
    private static final int COMPLETION_THRESHOLD = 0;
    private final CrashReport crashReport;
    private final String currentQuery;
    private final FragmentView parentView;
    /* access modifiers changed from: private */
    public final C12871b<SearchQueryEvent> queryTextChangedPublisher;
    private final SearchAnalytics searchAnalytics;
    private MenuItem searchMenuItem;
    private SearchView searchView;
    /* access modifiers changed from: private */
    public final SuggestionCursorAdapter suggestionCursorAdapter;
    private final C5368e<Void> toolbarClickObservable;
    private C5368e<MenuItem> toolbarMenuItemClick;

    public AppSearchSuggestionsView(FragmentView fragmentView, C5368e<Void> eVar, CrashReport crashReport2, SuggestionCursorAdapter suggestionCursorAdapter2, C12871b<SearchQueryEvent> bVar, C5368e<MenuItem> eVar2, SearchAnalytics searchAnalytics2) {
        this(fragmentView, eVar, crashReport2, "", suggestionCursorAdapter2, bVar, eVar2, searchAnalytics2);
    }

    /* renamed from: b */
    static /* synthetic */ void m7041b(C10691g gVar) {
    }

    /* renamed from: c */
    static /* synthetic */ void m7042c(Void voidR) {
    }

    /* renamed from: d */
    static /* synthetic */ Boolean m7043d(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.RESUME);
    }

    /* renamed from: d */
    static /* synthetic */ void m7044d(MenuItem menuItem) {
    }

    /* renamed from: e */
    static /* synthetic */ Boolean m7045e(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.RESUME);
    }

    /* renamed from: f */
    static /* synthetic */ Boolean m7046f(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.RESUME);
    }

    private void searchMenuItemClickExpandsSearch() {
        getLifecycleEvent().mo18681d(C4055f.f7134f).mo18687f(new C4073h(this)).mo18681d(new C4171s(this)).mo18664b(new C4028c(this)).mo18664b(new C4046e(this)).mo18641a(bindUntilEvent(View.LifecycleEvent.PAUSE)).mo18655a(C4064g.f7144f, (C5378b<Throwable>) new C4163r(this));
    }

    private void toolbarClickExpandsSearch() {
        getLifecycleEvent().mo18681d(C4128n.f7211f).mo18687f(new C4092j(this)).mo18664b(new C4082i(this)).mo18664b(new C4101k(this)).mo18641a(bindUntilEvent(View.LifecycleEvent.PAUSE)).mo18655a(C4019b.f7098f, (C5378b<Throwable>) new C4155q(this));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo14279a(View.LifecycleEvent lifecycleEvent) {
        return C10686d.m36212a(this.searchView);
    }

    public void attachPresenter(Presenter presenter) {
        this.parentView.attachPresenter(presenter);
    }

    /* renamed from: b */
    public /* synthetic */ void mo14286b(Void voidR) {
        focusInSearchBar();
    }

    public <T> C4749b<T> bindUntilEvent(View.LifecycleEvent lifecycleEvent) {
        return this.parentView.bindUntilEvent(lifecycleEvent);
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo14287c(View.LifecycleEvent lifecycleEvent) {
        return this.toolbarClickObservable;
    }

    public void collapseSearchBar(boolean z) {
        MenuItem menuItem = this.searchMenuItem;
        if (menuItem != null) {
            menuItem.collapseActionView();
        }
    }

    public void focusInSearchBar() {
        MenuItem menuItem = this.searchMenuItem;
        if (menuItem != null) {
            menuItem.expandActionView();
        }
        if (this.searchView != null && !getCurrentQuery().isEmpty()) {
            this.searchView.mo1161a((CharSequence) getCurrentQuery(), false);
        }
    }

    public String getCurrentQuery() {
        String str = this.currentQuery;
        return str != null ? str : "";
    }

    public C5368e<View.LifecycleEvent> getLifecycleEvent() {
        return this.parentView.getLifecycleEvent();
    }

    public void initialize(MenuItem menuItem) {
        this.searchMenuItem = menuItem;
        SearchView searchView2 = (SearchView) menuItem.getActionView();
        this.searchView = searchView2;
        searchView2.setSuggestionsAdapter(this.suggestionCursorAdapter);
        this.searchView.setOnSuggestionListener(new SearchView.C0208m() {
            public boolean onSuggestionClick(int i) {
                AppSearchSuggestionsView.this.queryTextChangedPublisher.onNext(new SearchQueryEvent(AppSearchSuggestionsView.this.suggestionCursorAdapter.getSuggestionAt(i).toString(), i, true, true));
                return true;
            }

            public boolean onSuggestionSelect(int i) {
                return false;
            }
        });
        ((AutoCompleteTextView) this.searchView.findViewById(C1086R.C1088id.search_src_text)).setThreshold(0);
        getLifecycleEvent().mo18681d(C4119m.f7202f).mo18687f(new C4146p(this)).mo18664b(new C4110l(this)).mo18641a(bindUntilEvent(View.LifecycleEvent.PAUSE)).mo18655a(C4137o.f7220f, (C5378b<Throwable>) new C4037d(this));
        toolbarClickExpandsSearch();
        searchMenuItemClickExpandsSearch();
    }

    public C5368e<SearchQueryEvent> onQueryTextChanged() {
        return this.queryTextChangedPublisher;
    }

    public void setSuggestionsList(List<String> list) {
    }

    public void setTrendingCursor(List<String> list) {
        this.suggestionCursorAdapter.setData(list);
    }

    public void setTrendingList(List<Suggestion> list) {
    }

    public AppSearchSuggestionsView(FragmentView fragmentView, C5368e<Void> eVar, CrashReport crashReport2, String str, SuggestionCursorAdapter suggestionCursorAdapter2, C12871b<SearchQueryEvent> bVar, C5368e<MenuItem> eVar2, SearchAnalytics searchAnalytics2) {
        this.parentView = fragmentView;
        this.toolbarClickObservable = eVar;
        this.crashReport = crashReport2;
        this.currentQuery = str;
        this.suggestionCursorAdapter = suggestionCursorAdapter2;
        this.queryTextChangedPublisher = bVar;
        this.toolbarMenuItemClick = eVar2;
        this.searchAnalytics = searchAnalytics2;
    }

    /* renamed from: a */
    public /* synthetic */ void mo14282a(C10691g gVar) {
        this.queryTextChangedPublisher.onNext(new SearchQueryEvent(gVar.mo36343c().toString(), gVar.mo36342b()));
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo14283b(View.LifecycleEvent lifecycleEvent) {
        return this.toolbarMenuItemClick;
    }

    /* renamed from: c */
    public /* synthetic */ void mo14289c(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: b */
    public /* synthetic */ void mo14284b(MenuItem menuItem) {
        this.searchAnalytics.searchStart(SearchSource.SEARCH_ICON, true);
    }

    /* renamed from: c */
    public /* synthetic */ void mo14288c(MenuItem menuItem) {
        focusInSearchBar();
    }

    /* renamed from: b */
    public /* synthetic */ void mo14285b(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14280a(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14281a(Void voidR) {
        this.searchAnalytics.searchStart(SearchSource.SEARCH_TOOLBAR, true);
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo14278a(MenuItem menuItem) {
        return Boolean.valueOf(menuItem.getItemId() == this.searchMenuItem.getItemId());
    }
}
