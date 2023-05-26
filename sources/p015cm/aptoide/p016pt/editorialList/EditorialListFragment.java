package p015cm.aptoide.p016pt.editorialList;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.aptoideviews.errors.ErrorView;
import p015cm.aptoide.aptoideviews.skeleton.Skeleton;
import p015cm.aptoide.aptoideviews.skeleton.SkeletonUtils;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.bonus.BonusAppcModel;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationActivity;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationItem;
import p015cm.aptoide.p016pt.editorial.CaptionBackgroundPainter;
import p015cm.aptoide.p016pt.editorial.EditorialFragment;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.home.bundles.editorial.EditorialBundleViewHolder;
import p015cm.aptoide.p016pt.home.bundles.editorial.EditorialHomeEvent;
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
import p123rx.p124l.p125c.C5376a;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.editorialList.EditorialListFragment */
public class EditorialListFragment extends NavigationTrackFragment implements EditorialListView {
    private static final BottomNavigationItem BOTTOM_NAVIGATION_ITEM = BottomNavigationItem.CURATION;
    private static final String TAG = EditorialFragment.class.getName();
    private static final int VISIBLE_THRESHOLD = 1;
    private EditorialListAdapter adapter;
    private BottomNavigationActivity bottomNavigationActivity;
    @Inject
    CaptionBackgroundPainter captionBackgroundPainter;
    private RecyclerView editorialList;
    private ErrorView errorView;
    private ScrollControlLinearLayoutManager layoutManager;
    @Inject
    public EditorialListPresenter presenter;
    private ProgressBar progressBar;
    private Skeleton skeleton;
    private C12871b<Void> snackListener;
    private C5189c swipeRefreshLayout;
    @Inject
    ThemeManager themeAttributeProvider;
    private C12871b<HomeEvent> uiEventsListener;
    private ImageView userAvatar;

    /* renamed from: a */
    static /* synthetic */ Boolean m5688a(Boolean bool) {
        return bool;
    }

    private EditorialBundleViewHolder getViewHolderForAdapterPosition(int i) {
        if (i == -1) {
            return null;
        }
        EditorialBundleViewHolder editorialBundleViewHolder = (EditorialBundleViewHolder) this.editorialList.findViewHolderForAdapterPosition(i);
        if (editorialBundleViewHolder == null) {
            Log.e(TAG, "Unable to find editorialBundleViewHolder");
        }
        return editorialBundleViewHolder;
    }

    private boolean isEndReached() {
        return this.layoutManager.getItemCount() - this.layoutManager.findLastVisibleItemPosition() <= 1;
    }

    /* renamed from: b */
    public /* synthetic */ Integer mo11378b(C10681a aVar) {
        return Integer.valueOf(this.layoutManager.findFirstVisibleItemPosition());
    }

    public C5368e<EditorialHomeEvent> editorialCardClicked() {
        return this.uiEventsListener.mo18681d(C2637k.f5468f).mo18638a(EditorialHomeEvent.class);
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(EditorialListFragment.class.getSimpleName());
    }

    public void hideLoadMore() {
        EditorialListAdapter editorialListAdapter = this.adapter;
        if (editorialListAdapter != null) {
            editorialListAdapter.removeLoadMore();
        }
    }

    public void hideLoading() {
        this.errorView.setVisibility(8);
        this.skeleton.showOriginal();
        this.swipeRefreshLayout.setVisibility(0);
    }

    public void hideRefresh() {
        this.swipeRefreshLayout.setRefreshing(false);
    }

    public C5368e<Void> imageClick() {
        return C10695a.m36221a(this.userAvatar);
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
        this.snackListener = C12871b.m41468p();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(C1086R.layout.fragment_editorial_list, viewGroup, false);
    }

    public void onDestroy() {
        this.uiEventsListener = null;
        this.snackListener = null;
        super.onDestroy();
    }

    public void onDestroyView() {
        this.editorialList = null;
        this.adapter = null;
        this.layoutManager = null;
        this.progressBar = null;
        this.errorView = null;
        this.userAvatar = null;
        this.swipeRefreshLayout = null;
        super.onDestroyView();
    }

    public void onDetach() {
        this.bottomNavigationActivity = null;
        super.onDetach();
    }

    public C5368e<EditorialHomeEvent> onPopupDismiss() {
        return this.uiEventsListener.mo18681d(C2629i.f5459f).mo18638a(EditorialHomeEvent.class);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        BottomNavigationActivity bottomNavigationActivity2 = this.bottomNavigationActivity;
        if (bottomNavigationActivity2 != null) {
            bottomNavigationActivity2.requestFocus(BOTTOM_NAVIGATION_ITEM);
        }
        this.userAvatar = (ImageView) view.findViewById(C1086R.C1088id.user_actionbar_icon);
        this.layoutManager = new ScrollControlLinearLayoutManager(getContext());
        this.adapter = new EditorialListAdapter(new ArrayList(), new ProgressCard(), this.uiEventsListener, this.captionBackgroundPainter, this.themeAttributeProvider);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C1086R.C1088id.editorial_list);
        this.editorialList = recyclerView;
        recyclerView.setLayoutManager(this.layoutManager);
        this.editorialList.setAdapter(this.adapter);
        this.editorialList.getItemAnimator().setChangeDuration(0);
        this.swipeRefreshLayout = (C5189c) view.findViewById(C1086R.C1088id.refresh_layout);
        this.errorView = (ErrorView) view.findViewById(C1086R.C1088id.error_view);
        this.progressBar = (ProgressBar) view.findViewById(C1086R.C1088id.progress_bar);
        this.skeleton = SkeletonUtils.applySkeleton(this.editorialList, (int) C1086R.layout.editorial_list_action_item_skeleton, 4);
        attachPresenter(this.presenter);
    }

    public void populateView(List<CurationCard> list, BonusAppcModel bonusAppcModel) {
        this.editorialList.setVisibility(0);
        this.adapter.add(list, bonusAppcModel);
    }

    public C5368e<Object> reachesBottom() {
        return C10685c.m36211a(this.editorialList).mo18694j(new C2653o(this)).mo18656b().mo18681d(C2633j.f5463f).mo18638a(Object.class);
    }

    public C5368e<EditorialHomeEvent> reactionButtonLongPress() {
        return this.uiEventsListener.mo18681d(C2641l.f5473f).mo18638a(EditorialHomeEvent.class).mo18694j(new C2661q(this));
    }

    public C5368e<ReactionsHomeEvent> reactionClicked() {
        return this.uiEventsListener.mo18681d(C2672t.f5505f).mo18638a(ReactionsHomeEvent.class);
    }

    public C5368e<EditorialHomeEvent> reactionsButtonClicked() {
        return this.uiEventsListener.mo18681d(C2665r.f5498f).mo18638a(EditorialHomeEvent.class);
    }

    public C5368e<Void> refreshes() {
        return C10677c.m36206a(this.swipeRefreshLayout);
    }

    public C5368e<Void> retryClicked() {
        return this.errorView.retryClick();
    }

    public void setDefaultUserImage() {
        ImageLoader.with(getContext()).loadUsingCircleTransform((int) C1086R.C1087drawable.ic_account_circle, this.userAvatar);
    }

    public void setScrollEnabled(Boolean bool) {
        this.layoutManager.setScrollEnabled(bool.booleanValue());
    }

    public void setUserImage(String str) {
        ImageLoader.with(getContext()).loadWithShadowCircleTransformWithPlaceholder(str, this.userAvatar, C1086R.C1087drawable.ic_account_circle);
    }

    public void showAvatar() {
        this.userAvatar.setVisibility(0);
    }

    public void showGenericError() {
        this.errorView.setError(ErrorView.Error.GENERIC);
        this.errorView.setVisibility(0);
        this.editorialList.setVisibility(8);
        this.progressBar.setVisibility(8);
        if (this.swipeRefreshLayout.isRefreshing()) {
            this.swipeRefreshLayout.setRefreshing(false);
        }
    }

    public void showGenericErrorToast() {
        Snackbar.m28076a(getView(), (CharSequence) getString(C1086R.string.error_occured), 0).mo31972k();
    }

    public void showLoadMore() {
        EditorialListAdapter editorialListAdapter = this.adapter;
        if (editorialListAdapter != null) {
            editorialListAdapter.addLoadMore();
        }
    }

    public void showLoading() {
        this.errorView.setVisibility(8);
        this.skeleton.showSkeleton();
    }

    public void showLogInDialog() {
        ShowMessage.asSnack((Activity) getActivity(), (int) C1086R.string.editorial_reactions_login_short, (int) C1086R.string.login, (View.OnClickListener) new C2657p(this), -1);
    }

    public void showNetworkError() {
        this.errorView.setError(ErrorView.Error.NO_NETWORK);
        this.errorView.setVisibility(0);
        this.editorialList.setVisibility(8);
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

    public void update(List<CurationCard> list) {
        this.editorialList.setVisibility(0);
        EditorialListAdapter editorialListAdapter = this.adapter;
        if (editorialListAdapter != null) {
            editorialListAdapter.update(list);
        }
    }

    public void updateEditorialCard(CurationCard curationCard) {
        this.adapter.updateEditorialCard(curationCard);
    }

    public C5368e<EditorialListEvent> visibleCards() {
        return C10685c.m36211a(this.editorialList).mo18662b(C5376a.m10346b()).mo18694j(new C2669s(this)).mo18681d(C2649n.f5481f).mo18656b().mo18694j(new C2645m(this));
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m5690b(Integer num) {
        return Boolean.valueOf(num.intValue() != -1);
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo11376a(C10681a aVar) {
        return Boolean.valueOf(isEndReached());
    }

    /* renamed from: a */
    public /* synthetic */ EditorialListEvent mo11374a(Integer num) {
        return new EditorialListEvent(this.adapter.getCard(num.intValue()).getId(), num.intValue());
    }

    /* renamed from: a */
    public /* synthetic */ EditorialHomeEvent mo11375a(EditorialHomeEvent editorialHomeEvent) {
        setScrollEnabled(false);
        return editorialHomeEvent;
    }

    /* renamed from: a */
    public /* synthetic */ void mo11377a(View view) {
        this.snackListener.onNext(null);
    }
}
