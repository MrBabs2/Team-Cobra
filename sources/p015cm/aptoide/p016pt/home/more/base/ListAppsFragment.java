package p015cm.aptoide.p016pt.home.more.base;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.C0069a;
import androidx.appcompat.app.C0076d;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.C0456c;
import androidx.recyclerview.widget.GridLayoutManager;
import java.util.HashMap;
import java.util.List;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9117p;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.aptoideviews.errors.ErrorView;
import p015cm.aptoide.aptoideviews.recyclerview.GridRecyclerView;
import p015cm.aptoide.aptoideviews.swipe.AptoideSwipeRefresh;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.home.more.base.ListAppsViewHolder;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.Translator;
import p015cm.aptoide.p016pt.view.app.Application;
import p015cm.aptoide.p016pt.view.fragment.NavigationTrackFragment;
import p112n.p118g.p301a.p303b.p306b.p307a.C10677c;
import p112n.p118g.p301a.p303b.p308c.p309a.C10685c;
import p123rx.C5368e;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006B\u0005¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016J\u001a\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00010\u0016H&J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH&J\b\u0010\u001d\u001a\u00020\u001eH\u0014J\n\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0014\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0\u000fH\u0016J\b\u0010#\u001a\u00020\u0018H'J\b\u0010$\u001a\u00020\u0018H'J\b\u0010%\u001a\u00020\u0018H\u0014J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u001eH\u0002J\u0010\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u0018H\u0002J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100\u001aH\u0016J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u001aH\u0016J\u0012\u0010*\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0018\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J&\u00102\u001a\u0004\u0018\u0001032\u0006\u00100\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u00172\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u001a\u00106\u001a\u00020\u00122\u0006\u00107\u001a\u0002032\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00100\u001aH\u0016J\u0010\u00109\u001a\u00020\u00122\u0006\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u00020\u0012H\u0002J\b\u0010=\u001a\u00020\u0012H\u0002J\u0016\u0010>\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016J\b\u0010?\u001a\u00020\u0012H\u0002J\b\u0010@\u001a\u00020\u0012H\u0016J\b\u0010A\u001a\u00020\u0012H\u0016J\b\u0010B\u001a\u00020\u0012H\u0016J\b\u0010C\u001a\u00020\u0012H\u0016J\b\u0010D\u001a\u00020\u0012H\u0002R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX.¢\u0006\u0002\n\u0000¨\u0006E"}, mo16641d2 = {"Lcm/aptoide/pt/home/more/base/ListAppsFragment;", "T", "Lcm/aptoide/pt/view/app/Application;", "V", "Lcm/aptoide/pt/home/more/base/ListAppsViewHolder;", "Lcm/aptoide/pt/view/fragment/NavigationTrackFragment;", "Lcm/aptoide/pt/home/more/base/ListAppsView;", "()V", "adapter", "Lcm/aptoide/pt/home/more/base/ListAppsAdapter;", "getAdapter", "()Lcm/aptoide/pt/home/more/base/ListAppsAdapter;", "setAdapter", "(Lcm/aptoide/pt/home/more/base/ListAppsAdapter;)V", "headerClickListener", "Lrx/subjects/PublishSubject;", "Ljava/lang/Void;", "addApps", "", "apps", "", "createViewHolder", "Lkotlin/Function2;", "Landroid/view/ViewGroup;", "", "errorRetryClick", "Lrx/Observable;", "getAdapterStrategy", "Lcm/aptoide/aptoideviews/recyclerview/GridRecyclerView$AdaptStrategy;", "getContainerPaddingDp", "Landroid/graphics/Rect;", "getHistoryTracker", "Lcm/aptoide/analytics/implementation/navigation/ScreenTagHistory;", "getItemClickEvents", "Lcm/aptoide/pt/home/more/base/ListAppsClickEvent;", "getItemSizeHeight", "getItemSizeWidth", "getItemSpacingDp", "getPixels", "dp", "headerClicks", "onBottomReached", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "onViewCreated", "view", "refreshEvents", "setToolbarInfo", "title", "", "setupHeaderListener", "setupToolbar", "showApps", "showErrorVisibility", "showGenericError", "showHeader", "showLoading", "showNoNetworkError", "showResultsVisibility", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.base.ListAppsFragment */
/* compiled from: ListAppsFragment.kt */
public abstract class ListAppsFragment<T extends Application, V extends ListAppsViewHolder<? super T>> extends NavigationTrackFragment implements ListAppsView<T> {
    private HashMap _$_findViewCache;
    protected ListAppsAdapter<T, V> adapter;
    /* access modifiers changed from: private */
    public C12871b<Void> headerClickListener;

    public static final /* synthetic */ C12871b access$getHeaderClickListener$p(ListAppsFragment listAppsFragment) {
        C12871b<Void> bVar = listAppsFragment.headerClickListener;
        if (bVar != null) {
            return bVar;
        }
        C10202j.m34181d("headerClickListener");
        throw null;
    }

    private final int getPixels(int i) {
        View view = getView();
        return AptoideUtils.ScreenU.getPixelsForDip(i, view != null ? view.getResources() : null);
    }

    private final void setupHeaderListener() {
        C12871b<Void> p = C12871b.m41468p();
        C10202j.m34174a((Object) p, "PublishSubject.create()");
        this.headerClickListener = p;
        Group group = (Group) _$_findCachedViewById(C1086R.C1088id.bundle_header_group);
        C10202j.m34174a((Object) group, "bundle_header_group");
        ListAppsFragmentKt.setAllOnClickListener(group, new ListAppsFragment$setupHeaderListener$1(this));
    }

    private final void setupToolbar() {
        C0456c activity = getActivity();
        if (activity != null) {
            C0076d dVar = (C0076d) activity;
            Bundle arguments = getArguments();
            if (arguments == null || !arguments.getBoolean(StoreTabGridRecyclerFragment.BundleCons.TOOLBAR, true)) {
                View _$_findCachedViewById = _$_findCachedViewById(C1086R.C1088id.action_bar);
                C10202j.m34174a((Object) _$_findCachedViewById, "action_bar");
                _$_findCachedViewById.setVisibility(8);
                return;
            }
            dVar.setSupportActionBar((Toolbar) _$_findCachedViewById(C1086R.C1088id.toolbar));
            C0069a supportActionBar = dVar.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.mo188d(true);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
    }

    private final void showErrorVisibility() {
        ErrorView errorView = (ErrorView) _$_findCachedViewById(C1086R.C1088id.error_view);
        C10202j.m34174a((Object) errorView, "error_view");
        errorView.setVisibility(0);
        GridRecyclerView gridRecyclerView = (GridRecyclerView) _$_findCachedViewById(C1086R.C1088id.apps_list);
        C10202j.m34174a((Object) gridRecyclerView, "apps_list");
        gridRecyclerView.setVisibility(8);
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C1086R.C1088id.progress_bar);
        C10202j.m34174a((Object) progressBar, "progress_bar");
        progressBar.setVisibility(8);
        AptoideSwipeRefresh aptoideSwipeRefresh = (AptoideSwipeRefresh) _$_findCachedViewById(C1086R.C1088id.swipe_container);
        C10202j.m34174a((Object) aptoideSwipeRefresh, "swipe_container");
        aptoideSwipeRefresh.setRefreshing(false);
    }

    private final void showResultsVisibility() {
        GridRecyclerView gridRecyclerView = (GridRecyclerView) _$_findCachedViewById(C1086R.C1088id.apps_list);
        C10202j.m34174a((Object) gridRecyclerView, "apps_list");
        gridRecyclerView.setVisibility(0);
        ErrorView errorView = (ErrorView) _$_findCachedViewById(C1086R.C1088id.error_view);
        C10202j.m34174a((Object) errorView, "error_view");
        errorView.setVisibility(8);
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C1086R.C1088id.progress_bar);
        C10202j.m34174a((Object) progressBar, "progress_bar");
        progressBar.setVisibility(8);
        AptoideSwipeRefresh aptoideSwipeRefresh = (AptoideSwipeRefresh) _$_findCachedViewById(C1086R.C1088id.swipe_container);
        C10202j.m34174a((Object) aptoideSwipeRefresh, "swipe_container");
        aptoideSwipeRefresh.setRefreshing(false);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void addApps(List<? extends T> list) {
        C10202j.m34178b(list, DeepLinkIntentReceiver.DeepLinksTargets.APPS);
        showResultsVisibility();
        ListAppsAdapter<T, V> listAppsAdapter = this.adapter;
        if (listAppsAdapter != null) {
            listAppsAdapter.addData(list);
        } else {
            C10202j.m34181d("adapter");
            throw null;
        }
    }

    public abstract C9117p<ViewGroup, Integer, V> createViewHolder();

    public C5368e<Void> errorRetryClick() {
        return ((ErrorView) _$_findCachedViewById(C1086R.C1088id.error_view)).retryClick();
    }

    /* access modifiers changed from: protected */
    public final ListAppsAdapter<T, V> getAdapter() {
        ListAppsAdapter<T, V> listAppsAdapter = this.adapter;
        if (listAppsAdapter != null) {
            return listAppsAdapter;
        }
        C10202j.m34181d("adapter");
        throw null;
    }

    public abstract GridRecyclerView.AdaptStrategy getAdapterStrategy();

    /* access modifiers changed from: protected */
    public Rect getContainerPaddingDp() {
        return new Rect(8, 8, 8, 8);
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName(), "", StoreContext.home.name());
    }

    public abstract int getItemSizeHeight();

    public abstract int getItemSizeWidth();

    /* access modifiers changed from: protected */
    public int getItemSpacingDp() {
        return 8;
    }

    public C5368e<Void> headerClicks() {
        C12871b<Void> bVar = this.headerClickListener;
        if (bVar != null) {
            return bVar;
        }
        C10202j.m34181d("headerClickListener");
        throw null;
    }

    public C5368e<Void> onBottomReached() {
        C5368e<R> j = C10685c.m36211a((GridRecyclerView) _$_findCachedViewById(C1086R.C1088id.apps_list)).mo18694j(new ListAppsFragment$onBottomReached$1(this)).mo18656b().mo18681d(ListAppsFragment$onBottomReached$2.INSTANCE).mo18694j(ListAppsFragment$onBottomReached$3.INSTANCE);
        C10202j.m34174a((Object) j, "RxRecyclerView.scrollEve…d -> isEnd }.map { null }");
        return j;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        this.adapter = new ListAppsAdapter<>(createViewHolder());
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C10202j.m34178b(menu, "menu");
        C10202j.m34178b(menuInflater, "inflater");
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C1086R.C1089menu.menu_empty, menu);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C10202j.m34178b(layoutInflater, "inflater");
        return layoutInflater.inflate(C1086R.layout.fragment_list_apps, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C10202j.m34178b(view, "view");
        super.onViewCreated(view, bundle);
        GridRecyclerView gridRecyclerView = (GridRecyclerView) _$_findCachedViewById(C1086R.C1088id.apps_list);
        C10202j.m34174a((Object) gridRecyclerView, "apps_list");
        gridRecyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 3));
        ((GridRecyclerView) _$_findCachedViewById(C1086R.C1088id.apps_list)).setAdaptiveLayout(getItemSizeWidth(), getItemSizeHeight(), getAdapterStrategy());
        ((GridRecyclerView) _$_findCachedViewById(C1086R.C1088id.apps_list)).setIntendedItemSpacing(getItemSpacingDp());
        Rect pixels = getPixels(getContainerPaddingDp());
        ((GridRecyclerView) _$_findCachedViewById(C1086R.C1088id.apps_list)).setPadding(pixels.left, pixels.top, pixels.right, pixels.bottom);
        GridRecyclerView gridRecyclerView2 = (GridRecyclerView) _$_findCachedViewById(C1086R.C1088id.apps_list);
        C10202j.m34174a((Object) gridRecyclerView2, "apps_list");
        ListAppsAdapter<T, V> listAppsAdapter = this.adapter;
        if (listAppsAdapter != null) {
            gridRecyclerView2.setAdapter(listAppsAdapter);
            setupHeaderListener();
            setupToolbar();
            return;
        }
        C10202j.m34181d("adapter");
        throw null;
    }

    public C5368e<Void> refreshEvents() {
        C5368e<Void> a = C10677c.m36206a((AptoideSwipeRefresh) _$_findCachedViewById(C1086R.C1088id.swipe_container));
        C10202j.m34174a((Object) a, "RxSwipeRefreshLayout.refreshes(swipe_container)");
        return a;
    }

    /* access modifiers changed from: protected */
    public final void setAdapter(ListAppsAdapter<T, V> listAppsAdapter) {
        C10202j.m34178b(listAppsAdapter, "<set-?>");
        this.adapter = listAppsAdapter;
    }

    public void setToolbarInfo(String str) {
        C10202j.m34178b(str, "title");
        Toolbar toolbar = (Toolbar) _$_findCachedViewById(C1086R.C1088id.toolbar);
        C10202j.m34174a((Object) toolbar, StoreTabGridRecyclerFragment.BundleCons.TOOLBAR);
        toolbar.setTitle((CharSequence) Translator.translate(str, getContext(), ""));
        ((Toolbar) _$_findCachedViewById(C1086R.C1088id.toolbar)).setLogo((int) C1086R.C1087drawable.logo_toolbar);
    }

    public void showApps(List<? extends T> list) {
        C10202j.m34178b(list, DeepLinkIntentReceiver.DeepLinksTargets.APPS);
        showResultsVisibility();
        ListAppsAdapter<T, V> listAppsAdapter = this.adapter;
        if (listAppsAdapter != null) {
            listAppsAdapter.setData(list);
            ((GridRecyclerView) _$_findCachedViewById(C1086R.C1088id.apps_list)).scheduleLayoutAnimation();
            return;
        }
        C10202j.m34181d("adapter");
        throw null;
    }

    public void showGenericError() {
        ((ErrorView) _$_findCachedViewById(C1086R.C1088id.error_view)).setError(ErrorView.Error.GENERIC);
        showErrorVisibility();
    }

    public void showHeader() {
        ImageView imageView = (ImageView) _$_findCachedViewById(C1086R.C1088id.bundle_image);
        C10202j.m34174a((Object) imageView, "bundle_image");
        imageView.setVisibility(0);
        TextView textView = (TextView) _$_findCachedViewById(C1086R.C1088id.bundle_title_1);
        C10202j.m34174a((Object) textView, "bundle_title_1");
        textView.setVisibility(0);
        TextView textView2 = (TextView) _$_findCachedViewById(C1086R.C1088id.bundle_title_2);
        C10202j.m34174a((Object) textView2, "bundle_title_2");
        textView2.setVisibility(0);
        TextView textView3 = (TextView) _$_findCachedViewById(C1086R.C1088id.bundle_description);
        C10202j.m34174a((Object) textView3, "bundle_description");
        textView3.setVisibility(0);
        TextView textView4 = (TextView) _$_findCachedViewById(C1086R.C1088id.eskills_title);
        C10202j.m34174a((Object) textView4, "eskills_title");
        textView4.setVisibility(0);
    }

    public void showLoading() {
        GridRecyclerView gridRecyclerView = (GridRecyclerView) _$_findCachedViewById(C1086R.C1088id.apps_list);
        C10202j.m34174a((Object) gridRecyclerView, "apps_list");
        gridRecyclerView.setVisibility(8);
        ErrorView errorView = (ErrorView) _$_findCachedViewById(C1086R.C1088id.error_view);
        C10202j.m34174a((Object) errorView, "error_view");
        errorView.setVisibility(8);
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C1086R.C1088id.progress_bar);
        C10202j.m34174a((Object) progressBar, "progress_bar");
        progressBar.setVisibility(0);
    }

    public void showNoNetworkError() {
        ((ErrorView) _$_findCachedViewById(C1086R.C1088id.error_view)).setError(ErrorView.Error.NO_NETWORK);
        showErrorVisibility();
    }

    private final Rect getPixels(Rect rect) {
        return new Rect(getPixels(rect.left), getPixels(rect.top), getPixels(rect.right), getPixels(rect.bottom));
    }

    public C12871b<ListAppsClickEvent<T>> getItemClickEvents() {
        ListAppsAdapter<T, V> listAppsAdapter = this.adapter;
        if (listAppsAdapter != null) {
            return listAppsAdapter.getClickListener();
        }
        C10202j.m34181d("adapter");
        throw null;
    }
}
