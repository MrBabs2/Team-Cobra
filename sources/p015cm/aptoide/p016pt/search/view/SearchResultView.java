package p015cm.aptoide.p016pt.search.view;

import android.content.DialogInterface;
import android.view.MenuItem;
import java.util.List;
import p015cm.aptoide.aptoideviews.filters.Filter;
import p015cm.aptoide.p016pt.app.view.screenshots.ScreenShotClickEvent;
import p015cm.aptoide.p016pt.download.view.DownloadClick;
import p015cm.aptoide.p016pt.search.model.SearchAppResult;
import p015cm.aptoide.p016pt.search.model.SearchAppResultWrapper;
import p015cm.aptoide.p016pt.search.model.SearchQueryModel;
import p015cm.aptoide.p016pt.search.model.SearchResultError;
import p015cm.aptoide.p016pt.search.suggestions.SearchQueryEvent;
import p050l.p075h.p083k.C5004d;
import p112n.p118g.p301a.p303b.p308c.p309a.C10691g;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.search.view.SearchResultView */
public interface SearchResultView extends SearchSuggestionsView {

    /* renamed from: cm.aptoide.pt.search.view.SearchResultView$Model */
    public interface Model {
        List<Filter> getFilters();

        SearchQueryModel getSearchQueryModel();

        String getStoreName();

        String getStoreTheme();

        boolean hasLoadedAds();

        boolean hasLoadedResults();
    }

    void addAllStoresResult(String str, List<SearchAppResult> list, boolean z, boolean z2, boolean z3, SearchResultError searchResultError);

    C5368e<DialogInterface> adultContentDialogNegativeClick();

    C5368e<DialogInterface> adultContentDialogPositiveClick();

    C5368e<DialogInterface> adultContentPinDialogNegativeClick();

    C5368e<CharSequence> adultContentWithPinDialogPositiveClick();

    void clearUnsubmittedQuery();

    C5368e<Boolean> clickAdultContentSwitch();

    void disableAdultContent();

    void disableUpNavigation();

    void enableAdultContent();

    C5368e<List<Filter>> filtersChangeEvents();

    C5368e<DownloadClick> getDownloadClickEvents();

    C5368e<ScreenShotClickEvent> getScreenshotClickEvent();

    Model getViewModel();

    boolean hasResults();

    void hideLoading();

    void hideSuggestionsViews();

    boolean isSearchViewExpanded();

    C5368e<C5004d<String, SearchQueryEvent>> listenToSuggestionClick();

    C5368e<SearchAppResultWrapper> onViewItemClicked();

    C5368e<C10691g> queryChanged();

    void queryEvent(C10691g gVar);

    C5368e<Void> retryClicked();

    void scrollToTop();

    C5368e<MenuItem> searchMenuItemClick();

    C5368e<Void> searchResultsReachedBottom();

    C5368e<Void> searchSetup();

    void setAdultContentSwitch(Boolean bool);

    void setUnsubmittedQuery(String str);

    void setVisibilityOnRestore();

    boolean shouldFocusInSearchBar();

    boolean shouldHideUpNavigation();

    boolean shouldShowSuggestions();

    void showAdultContentConfirmationDialog();

    void showAdultContentConfirmationDialogWithPin();

    void showBannerAd();

    void showGenericErrorView();

    void showLoading();

    void showMoreLoading();

    void showNativeAds();

    void showNoNetworkView();

    void showNoResultsView();

    void showResultsLoading();

    void showResultsView();

    void showWrongPinErrorMessage();

    void toggleSuggestionsView();

    void toggleTrendingView();

    C5368e<Void> toolbarClick();

    C5368e<Void> viewHasNoResults();
}
