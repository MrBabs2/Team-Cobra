package p015cm.aptoide.p016pt.home;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.Snackbar;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Named;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.aptoideviews.errors.ErrorView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationActivity;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationItem;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.editorial.CaptionBackgroundPainter;
import p015cm.aptoide.p016pt.editorial.EditorialFragment;
import p015cm.aptoide.p016pt.home.bundles.BundlesAdapter;
import p015cm.aptoide.p016pt.home.bundles.HomeBundlesModel;
import p015cm.aptoide.p016pt.home.bundles.ads.AdHomeEvent;
import p015cm.aptoide.p016pt.home.bundles.ads.AdsBundlesViewHolderFactory;
import p015cm.aptoide.p016pt.home.bundles.base.AppComingSoonPromotionalBundle;
import p015cm.aptoide.p016pt.home.bundles.base.AppHomeEvent;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.home.bundles.editorial.EditorialBundleViewHolder;
import p015cm.aptoide.p016pt.home.bundles.editorial.EditorialHomeEvent;
import p015cm.aptoide.p016pt.home.bundles.misc.ErrorHomeBundle;
import p015cm.aptoide.p016pt.home.bundles.misc.ProgressBundle;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.reactions.ReactionsHomeEvent;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.utils.design.ShowMessage;
import p015cm.aptoide.p016pt.view.fragment.NavigationTrackFragment;
import p050l.p106r.p107a.C5189c;
import p112n.p118g.p301a.p303b.p306b.p307a.C10677c;
import p112n.p118g.p301a.p303b.p308c.p309a.C10681a;
import p112n.p118g.p301a.p303b.p308c.p309a.C10685c;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.HomeFragment */
public class HomeFragment extends NavigationTrackFragment implements HomeView, ScrollableView {
    private static final BottomNavigationItem BOTTOM_NAVIGATION_ITEM = BottomNavigationItem.HOME;
    private static final String LIST_STATE_KEY = "cm.aptoide.pt.BottomHomeFragment.ListState";
    private static final String TAG = EditorialFragment.class.getName();
    private static final int VISIBLE_THRESHOLD = 2;
    private C12871b<AdHomeEvent> adClickedEvents;
    private BundlesAdapter adapter;
    private BottomNavigationActivity bottomNavigationActivity;
    private RecyclerView bundlesList;
    @Inject
    CaptionBackgroundPainter captionBackgroundPainter;
    private ErrorView errorView;
    private C12871b<Boolean> firstBundleLoadListener;
    private LinearLayoutManager layoutManager;
    private Parcelable listState;
    @Inject
    @Named
    String marketName;
    private DecimalFormat oneDecimalFormatter;
    @Inject
    HomePresenter presenter;
    private ProgressBar progressBar;
    private C12871b<Void> snackListener;
    private C5189c swipeRefreshLayout;
    @Inject
    ThemeManager themeManager;
    private C12871b<HomeEvent> uiEventsListener;
    private ImageView userAvatar;

    /* renamed from: a */
    static /* synthetic */ Boolean m5900a(Boolean bool) {
        return bool;
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m5902b(Boolean bool) {
        return bool;
    }

    /* renamed from: c */
    static /* synthetic */ Integer m5905c(Boolean bool) {
        return 0;
    }

    private void fireFirstBundleLoadedEvent(HomeBundlesModel homeBundlesModel) {
        try {
            if (homeBundlesModel.getList().get(0).getContent() != null) {
                this.firstBundleLoadListener.onNext(true);
            }
        } catch (Exception unused) {
        }
    }

    private EditorialBundleViewHolder getViewHolderForAdapterPosition(int i) {
        try {
            return (EditorialBundleViewHolder) this.bundlesList.findViewHolderForAdapterPosition(i);
        } catch (Exception unused) {
            Log.e(TAG, "Unable to find editorialViewHolder");
            return null;
        }
    }

    private boolean isEndReached() {
        return this.layoutManager.getItemCount() - this.layoutManager.findLastVisibleItemPosition() <= 2 && this.adapter.isLoaded();
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo11678a(C10681a aVar) {
        return Boolean.valueOf(isEndReached());
    }

    public C5368e<AdHomeEvent> adClicked() {
        return this.adClickedEvents;
    }

    public C5368e<AppHomeEvent> appClicked() {
        return this.uiEventsListener.mo18681d(C3054l4.f5995f).mo18638a(AppHomeEvent.class);
    }

    public C5368e<HomeEvent> bundleScrolled() {
        return this.uiEventsListener.mo18681d(C2950d4.f5883f).mo18634a(200, TimeUnit.MILLISECONDS);
    }

    public C5368e<HomeEvent> cancelNotifyMeClicked() {
        return this.uiEventsListener.mo18681d(C3142r3.f6068f);
    }

    public C5368e<HomeEvent> dismissBundleClicked() {
        return this.uiEventsListener.mo18681d(C3095n4.f6021f);
    }

    public C5368e<HomeEvent> eSkillsKnowMoreClick() {
        return this.uiEventsListener.mo18681d(C3166t3.f6092f);
    }

    public C5368e<EditorialHomeEvent> editorialCardClicked() {
        return this.uiEventsListener.mo18681d(C2864b4.f5716f).mo18638a(EditorialHomeEvent.class);
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(HomeFragment.class.getSimpleName(), "", StoreContext.home.name());
    }

    public void hideBundle(int i) {
        this.adapter.remove(i);
    }

    public void hideLoading() {
        this.bundlesList.setVisibility(0);
        this.errorView.setVisibility(8);
        this.progressBar.setVisibility(8);
        this.swipeRefreshLayout.setVisibility(0);
    }

    public void hideRefresh() {
        this.swipeRefreshLayout.setRefreshing(false);
    }

    public void hideShowMore() {
        BundlesAdapter bundlesAdapter = this.adapter;
        if (bundlesAdapter != null) {
            bundlesAdapter.removeLoadMore();
        }
    }

    public C5368e<Void> imageClick() {
        return C10695a.m36221a(this.userAvatar);
    }

    public C5368e<HomeEvent> infoBundleKnowMoreClicked() {
        return this.uiEventsListener.mo18681d(C3178u3.f6104f);
    }

    public boolean isAtTop() {
        return ((LinearLayoutManager) this.bundlesList.getLayoutManager()).findFirstVisibleItemPosition() == 0;
    }

    public C5368e<HomeEvent> moreClicked() {
        return this.uiEventsListener.mo18681d(C2963e4.f5896f);
    }

    public C5368e<HomeEvent> notifyMeClicked() {
        return this.uiEventsListener.mo18681d(C3202w3.f6130f);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof BottomNavigationActivity) {
            this.bottomNavigationActivity = (BottomNavigationActivity) activity;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.uiEventsListener = C12871b.m41468p();
        this.adClickedEvents = C12871b.m41468p();
        this.snackListener = C12871b.m41468p();
        this.firstBundleLoadListener = C12871b.m41468p();
        this.oneDecimalFormatter = new DecimalFormat("0.0");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1086R.layout.fragment_home, viewGroup, false);
    }

    public void onDestroy() {
        this.uiEventsListener = null;
        this.oneDecimalFormatter = null;
        this.adClickedEvents = null;
        this.userAvatar = null;
        this.snackListener = null;
        super.onDestroy();
    }

    public void onDestroyView() {
        this.listState = this.bundlesList.getLayoutManager().onSaveInstanceState();
        this.bundlesList = null;
        this.adapter = null;
        this.layoutManager = null;
        this.swipeRefreshLayout = null;
        this.errorView = null;
        this.progressBar = null;
        super.onDestroyView();
    }

    public void onDetach() {
        this.bottomNavigationActivity = null;
        super.onDetach();
    }

    public C5368e<HomeEvent> onLoadMoreRetryClicked() {
        return this.uiEventsListener.mo18681d(C3041k4.f5981f);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        RecyclerView recyclerView = this.bundlesList;
        if (recyclerView != null) {
            bundle.putParcelable(LIST_STATE_KEY, recyclerView.getLayoutManager().onSaveInstanceState());
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        BottomNavigationActivity bottomNavigationActivity2 = this.bottomNavigationActivity;
        if (bottomNavigationActivity2 != null) {
            bottomNavigationActivity2.requestFocus(BOTTOM_NAVIGATION_ITEM);
        }
        if (bundle != null && bundle.containsKey(LIST_STATE_KEY)) {
            this.listState = bundle.getParcelable(LIST_STATE_KEY);
            bundle.putParcelable(LIST_STATE_KEY, (Parcelable) null);
        }
        this.userAvatar = (ImageView) view.findViewById(C1086R.C1088id.user_actionbar_icon);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C1086R.C1088id.bundles_list);
        this.bundlesList = recyclerView;
        recyclerView.getItemAnimator().setChangeDuration(0);
        this.errorView = (ErrorView) view.findViewById(C1086R.C1088id.error_view);
        this.progressBar = (ProgressBar) view.findViewById(C1086R.C1088id.progress_bar);
        this.swipeRefreshLayout = (C5189c) view.findViewById(C1086R.C1088id.refresh_layout);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.layoutManager = linearLayoutManager;
        this.bundlesList.setLayoutManager(linearLayoutManager);
        ArrayList arrayList = new ArrayList();
        ProgressBundle progressBundle = new ProgressBundle();
        ErrorHomeBundle errorHomeBundle = new ErrorHomeBundle();
        DecimalFormat decimalFormat = this.oneDecimalFormatter;
        C12871b<HomeEvent> bVar = this.uiEventsListener;
        BundlesAdapter bundlesAdapter = new BundlesAdapter(arrayList, progressBundle, errorHomeBundle, decimalFormat, bVar, new AdsBundlesViewHolderFactory(bVar, this.adClickedEvents, decimalFormat, this.marketName), this.captionBackgroundPainter, this.marketName, this.themeManager);
        this.adapter = bundlesAdapter;
        this.bundlesList.setAdapter(bundlesAdapter);
        attachPresenter(this.presenter);
    }

    public C5368e<Object> reachesBottom() {
        return C10685c.m36211a(this.bundlesList).mo18694j(new C2937c4(this)).mo18656b().mo18681d(C3154s3.f6080f).mo18638a(Object.class);
    }

    public C5368e<EditorialHomeEvent> reactionButtonLongPress() {
        return this.uiEventsListener.mo18681d(C2989g4.f5926f).mo18638a(EditorialHomeEvent.class);
    }

    public C5368e<ReactionsHomeEvent> reactionClicked() {
        return this.uiEventsListener.mo18681d(C2715a4.f5550f).mo18638a(ReactionsHomeEvent.class);
    }

    public C5368e<EditorialHomeEvent> reactionsButtonClicked() {
        return this.uiEventsListener.mo18681d(C3238z3.f6166f).mo18638a(EditorialHomeEvent.class);
    }

    public C5368e<Void> refreshes() {
        return C10677c.m36206a(this.swipeRefreshLayout);
    }

    public void removeLoadMoreError() {
        this.adapter.removeLoadMoreError();
    }

    public C5368e<Void> retryClicked() {
        return this.errorView.retryClick();
    }

    public void scrollToTop() {
        if (((LinearLayoutManager) this.bundlesList.getLayoutManager()).findLastVisibleItemPosition() > 10) {
            this.bundlesList.scrollToPosition(10);
        }
        this.bundlesList.smoothScrollToPosition(0);
    }

    public void sendDeeplinkToWalletAppView(String str) {
        Intent intent = new Intent(getContext(), DeepLinkIntentReceiver.class);
        intent.setData(Uri.parse(str));
        startActivity(intent);
    }

    public void setAdsTest(boolean z) {
    }

    public void setUserImage(String str) {
        ImageLoader.with(getContext()).loadWithShadowCircleTransformWithPlaceholder(str, this.userAvatar, C1086R.C1087drawable.ic_account_circle);
    }

    public void showBundles(List<HomeBundle> list) {
        this.adapter.update(list);
        if (this.listState != null) {
            this.bundlesList.getLayoutManager().onRestoreInstanceState(this.listState);
            this.listState = null;
        }
    }

    public void showBundlesSkeleton(HomeBundlesModel homeBundlesModel) {
        fireFirstBundleLoadedEvent(homeBundlesModel);
        this.adapter.update(homeBundlesModel.getList());
        if (this.listState != null) {
            this.bundlesList.getLayoutManager().onRestoreInstanceState(this.listState);
            this.listState = null;
        }
        hideLoading();
    }

    public void showConsentDialog() {
    }

    public void showGenericError() {
        this.errorView.setError(ErrorView.Error.GENERIC);
        this.errorView.setVisibility(0);
        this.bundlesList.setVisibility(8);
        this.progressBar.setVisibility(8);
        if (this.swipeRefreshLayout.isRefreshing()) {
            this.swipeRefreshLayout.setRefreshing(false);
        }
    }

    public void showGenericErrorToast() {
        Snackbar.m28076a(getView(), (CharSequence) getString(C1086R.string.error_occured), 0).mo31972k();
    }

    public void showLoadMore() {
        this.adapter.addLoadMore();
    }

    public void showLoadMoreError() {
        this.adapter.showLoadMoreError();
    }

    public void showLoading() {
        this.bundlesList.setVisibility(8);
        this.errorView.setVisibility(8);
        this.progressBar.setVisibility(0);
    }

    public void showLogInDialog() {
        ShowMessage.asSnack((Activity) getActivity(), (int) C1086R.string.editorial_reactions_login_short, (int) C1086R.string.login, (View.OnClickListener) new C3015i4(this), -1);
    }

    public void showMoreHomeBundles(List<HomeBundle> list) {
        this.adapter.add(list);
    }

    public void showNetworkError() {
        this.errorView.setError(ErrorView.Error.NO_NETWORK);
        this.errorView.setVisibility(0);
        this.bundlesList.setVisibility(8);
        this.progressBar.setVisibility(8);
        if (this.swipeRefreshLayout.isRefreshing()) {
            this.swipeRefreshLayout.setRefreshing(false);
        }
    }

    public void showNetworkErrorToast() {
        Snackbar.m28076a(getView(), (CharSequence) getString(C1086R.string.connection_error), 0).mo31972k();
    }

    public void showReactionsPopup(String str, String str2, int i) {
        EditorialBundleViewHolder viewHolderForAdapterPosition = getViewHolderForAdapterPosition(i);
        if (viewHolderForAdapterPosition != null) {
            viewHolderForAdapterPosition.showReactions(str, str2, i);
        }
    }

    public C5368e<Void> snackLogInClick() {
        return this.snackListener;
    }

    public void updateAppComingSoonStatus(AppComingSoonPromotionalBundle appComingSoonPromotionalBundle, boolean z) {
        this.adapter.updateAppComingSoonCard(appComingSoonPromotionalBundle, z);
    }

    public void updateEditorialCards() {
        this.adapter.updateEditorials();
        if (this.listState != null) {
            this.bundlesList.getLayoutManager().onRestoreInstanceState(this.listState);
            this.listState = null;
        }
    }

    public C5368e<HomeEvent> visibleBundles() {
        return C5368e.m10254b(C10685c.m36211a(this.bundlesList), (C5368e<C10681a>) this.firstBundleLoadListener.mo18681d(C3190v3.f6116f).mo18694j(C3067m4.f6009f)).mo18694j(new C2976f4(this)).mo18681d(C3214x3.f6142f).mo18681d(new C3002h4(this)).mo18656b().mo18694j(new C3226y3(this));
    }

    public C5368e<HomeEvent> walletOfferCardInstallWalletClick() {
        return this.uiEventsListener.mo18681d(C3028j4.f5968f);
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m5899a(HomeEvent homeEvent) {
        return Boolean.valueOf(homeEvent.getType().equals(HomeEvent.Type.APP) || homeEvent.getType().equals(HomeEvent.Type.REWARD_APP) || homeEvent.getType().equals(HomeEvent.Type.INSTALL_PROMOTIONAL) || homeEvent.getType().equals(HomeEvent.Type.ESKILLS));
    }

    /* renamed from: c */
    static /* synthetic */ Boolean m5904c(Integer num) {
        return Boolean.valueOf(num.intValue() != -1);
    }

    /* renamed from: b */
    public /* synthetic */ Boolean mo11681b(Integer num) {
        return Boolean.valueOf(this.adapter.getBundle(num.intValue()).getContent() != null);
    }

    /* renamed from: a */
    public /* synthetic */ Integer mo11679a(Object obj) {
        return Integer.valueOf(this.layoutManager.findFirstVisibleItemPosition());
    }

    /* renamed from: a */
    public /* synthetic */ HomeEvent mo11677a(Integer num) {
        return new HomeEvent(this.adapter.getBundle(num.intValue()), num.intValue(), (HomeEvent.Type) null);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11680a(View view) {
        this.snackListener.onNext(null);
    }
}
