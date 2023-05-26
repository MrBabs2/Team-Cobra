package p015cm.aptoide.p016pt.home.apps;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.snackbar.Snackbar;
import java.util.List;
import javax.inject.Inject;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationActivity;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationItem;
import p015cm.aptoide.p016pt.home.apps.AppClick;
import p015cm.aptoide.p016pt.home.apps.list.AppsController;
import p015cm.aptoide.p016pt.home.apps.model.InstalledApp;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.utils.GenericDialogs;
import p015cm.aptoide.p016pt.view.fragment.NavigationTrackFragment;
import p015cm.aptoide.p016pt.view.p031rx.RxAlertDialog;
import p050l.p106r.p107a.C5189c;
import p112n.p118g.p301a.p303b.p306b.p307a.C10677c;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.home.apps.AppsFragment */
public class AppsFragment extends NavigationTrackFragment implements AppsFragmentView {
    private static final BottomNavigationItem BOTTOM_NAVIGATION_ITEM = BottomNavigationItem.APPS;
    private AppsController appsController;
    @Inject
    AppsPresenter appsPresenter;
    /* access modifiers changed from: private */
    public EpoxyRecyclerView appsRecyclerView;
    private BottomNavigationActivity bottomNavigationActivity;
    private RxAlertDialog ignoreUpdateDialog;
    private ProgressBar progressBar;
    private C5189c swipeRefreshLayout;
    @Inject
    ThemeManager themeManager;
    private ImageView userAvatar;

    /* renamed from: a */
    static /* synthetic */ Boolean m6092a(AppClick appClick) {
        return Boolean.valueOf(appClick.getClickType() == AppClick.ClickType.CANCEL_CLICK);
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m6094b(AppClick appClick) {
        return Boolean.valueOf(appClick.getClickType() == AppClick.ClickType.CARD_CLICK);
    }

    private void buildIgnoreUpdatesDialog() {
        this.ignoreUpdateDialog = new RxAlertDialog.Builder(getContext(), this.themeManager).setTitle(C1086R.string.apps_title_ignore_updates).setPositiveButton(C1086R.string.apps_button_ignore_updates_yes).setNegativeButton(C1086R.string.apps_button_ignore_updates_no).build();
    }

    /* renamed from: c */
    static /* synthetic */ Boolean m6095c(AppClick appClick) {
        return Boolean.valueOf(appClick.getClickType() == AppClick.ClickType.INSTALL_CLICK);
    }

    /* renamed from: d */
    static /* synthetic */ Boolean m6096d(AppClick appClick) {
        return Boolean.valueOf(appClick.getClickType() == AppClick.ClickType.PAUSE_CLICK);
    }

    /* renamed from: e */
    static /* synthetic */ Boolean m6097e(AppClick appClick) {
        return Boolean.valueOf(appClick.getClickType() == AppClick.ClickType.RESUME_CLICK);
    }

    /* renamed from: f */
    static /* synthetic */ Boolean m6098f(AppClick appClick) {
        return Boolean.valueOf(appClick.getClickType() == AppClick.ClickType.DOWNLOAD_ACTION_CLICK);
    }

    /* renamed from: g */
    static /* synthetic */ Boolean m6099g(AppClick appClick) {
        return Boolean.valueOf(appClick.getClickType() == AppClick.ClickType.CARD_LONG_CLICK);
    }

    private void hideLoadingProgressBar() {
        this.progressBar.setVisibility(8);
    }

    public static AppsFragment newInstance() {
        return new AppsFragment();
    }

    private void setupRecyclerView() {
        AppsController appsController2 = new AppsController(this.themeManager);
        this.appsController = appsController2;
        this.appsRecyclerView.setController(appsController2);
        this.appsController.getAdapter().registerAdapterDataObserver(new RecyclerView.C0635i() {
            public void onItemRangeInserted(int i, int i2) {
                if (i == 0) {
                    AppsFragment.this.appsRecyclerView.scrollToPosition(0);
                }
            }
        });
    }

    public C5368e<App> cancelDownload() {
        return this.appsController.getAppEventListener().mo18681d(C2753f.f5589f).mo18694j(C2838v3.f5689f);
    }

    public C5368e<App> cardClick() {
        return this.appsController.getAppEventListener().mo18681d(C2778k.f5617f).mo18694j(C2838v3.f5689f);
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(AppsFragment.class.getSimpleName());
    }

    public void hidePullToRefresh() {
        if (this.swipeRefreshLayout.isRefreshing()) {
            this.swipeRefreshLayout.setRefreshing(false);
        }
    }

    public C5368e<Void> imageClick() {
        return C10695a.m36221a(this.userAvatar);
    }

    public C5368e<App> installApp() {
        return this.appsController.getAppEventListener().mo18681d(C2748e.f5584f).mo18694j(C2838v3.f5689f);
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
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(C1086R.layout.fragment_apps, viewGroup, false);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.progressBar = null;
        this.swipeRefreshLayout = null;
        this.ignoreUpdateDialog = null;
        this.appsRecyclerView = null;
        this.userAvatar = null;
    }

    public void onDetach() {
        this.bottomNavigationActivity = null;
        super.onDetach();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AppsController appsController2 = this.appsController;
        if (appsController2 != null) {
            appsController2.onSaveInstanceState(bundle);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        BottomNavigationActivity bottomNavigationActivity2 = this.bottomNavigationActivity;
        if (bottomNavigationActivity2 != null) {
            bottomNavigationActivity2.requestFocus(BOTTOM_NAVIGATION_ITEM);
        }
        this.appsRecyclerView = (EpoxyRecyclerView) view.findViewById(C1086R.C1088id.fragment_apps_recycler_view);
        setupRecyclerView();
        this.swipeRefreshLayout = (C5189c) view.findViewById(C1086R.C1088id.fragment_apps_swipe_container);
        ProgressBar progressBar2 = (ProgressBar) view.findViewById(C1086R.C1088id.progress_bar);
        this.progressBar = progressBar2;
        progressBar2.setVisibility(0);
        buildIgnoreUpdatesDialog();
        this.userAvatar = (ImageView) view.findViewById(C1086R.C1088id.user_actionbar_icon);
        attachPresenter(this.appsPresenter);
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        AppsController appsController2 = this.appsController;
        if (appsController2 != null) {
            appsController2.onRestoreInstanceState(bundle);
        }
    }

    public C5368e<App> pauseDownload() {
        return this.appsController.getAppEventListener().mo18681d(C2758g.f5594f).mo18694j(C2838v3.f5689f);
    }

    public C5368e<Void> refreshApps() {
        return C10677c.m36206a(this.swipeRefreshLayout);
    }

    public C5368e<App> resumeDownload() {
        return this.appsController.getAppEventListener().mo18681d(C2743d.f5578f).mo18694j(C2838v3.f5689f);
    }

    public void scrollToTop() {
        if (((LinearLayoutManager) this.appsRecyclerView.getLayoutManager()).findLastVisibleItemPosition() > 10) {
            this.appsRecyclerView.scrollToPosition(10);
        }
        this.appsRecyclerView.smoothScrollToPosition(0);
    }

    public void setDefaultUserImage() {
        ImageLoader.with(getContext()).loadUsingCircleTransform((int) C1086R.C1087drawable.ic_account_circle, this.userAvatar);
    }

    public void setUserImage(String str) {
        ImageLoader.with(getContext()).loadWithShadowCircleTransformWithPlaceholder(str, this.userAvatar, C1086R.C1087drawable.ic_account_circle);
    }

    public void showAvatar() {
        this.userAvatar.setVisibility(0);
    }

    public Single<RxAlertDialog.Result> showIgnoreUpdateDialog() {
        return this.ignoreUpdateDialog.showWithResult();
    }

    public void showModel(AppsModel appsModel) {
        hideLoadingProgressBar();
        this.appsController.setData(appsModel.getUpdates(), (List<? extends InstalledApp>) appsModel.getInstalled(), appsModel.getDownloads());
    }

    public C5368e<Boolean> showRootWarning() {
        return GenericDialogs.createGenericYesNoCancelMessage(getContext(), "", AptoideUtils.StringU.getFormattedString(C1086R.string.root_access_dialog, getResources(), new Object[0]), this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId).mo18694j(C2773j.f5612f);
    }

    public void showUnknownErrorMessage() {
        Snackbar.m28075a(getView(), (int) C1086R.string.unknown_error, -1).mo31972k();
    }

    public C5368e<App> startDownload() {
        return this.appsController.getAppEventListener().mo18681d(C2768i.f5606f).mo18694j(C2838v3.f5689f);
    }

    public C5368e<Void> updateAll() {
        return this.appsController.getUpdateAllEvent();
    }

    public C5368e<App> updateLongClick() {
        return this.appsController.getAppEventListener().mo18681d(C2763h.f5600f).mo18694j(C2838v3.f5689f);
    }
}
