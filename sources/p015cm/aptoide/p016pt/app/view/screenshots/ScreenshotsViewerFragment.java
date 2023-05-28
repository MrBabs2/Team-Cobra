package p015cm.aptoide.p016pt.app.view.screenshots;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.view.NotBottomNavigationView;
import p015cm.aptoide.p016pt.view.custom.AptoideViewPager;
import p015cm.aptoide.p016pt.view.fragment.UIComponentFragment;

/* renamed from: cm.aptoide.pt.app.view.screenshots.ScreenshotsViewerFragment */
public class ScreenshotsViewerFragment extends UIComponentFragment implements NotBottomNavigationView {
    private View btnCloseViewer;
    private int currentItem;
    private AptoideViewPager screenshots;
    private ArrayList<String> uris;

    /* renamed from: cm.aptoide.pt.app.view.screenshots.ScreenshotsViewerFragment$BundleArgs */
    private enum BundleArgs {
        POSITION,
        URIs
    }

    private void hideSystemUI() {
        this.screenshots.setSystemUiVisibility(3846);
    }

    public static ScreenshotsViewerFragment newInstance(ArrayList<String> arrayList, int i) {
        ScreenshotsViewerFragment screenshotsViewerFragment = new ScreenshotsViewerFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(BundleArgs.URIs.name(), arrayList);
        bundle.putInt(BundleArgs.POSITION.name(), i);
        screenshotsViewerFragment.setArguments(bundle);
        return screenshotsViewerFragment;
    }

    private void showSystemUI() {
        this.screenshots.setSystemUiVisibility(1792);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7715a(View view) {
        getActivity().onBackPressed();
    }

    public void bindViews(View view) {
        this.screenshots = (AptoideViewPager) view.findViewById(C1086R.C1088id.screen_shots_pager);
        this.btnCloseViewer = view.findViewById(C1086R.C1088id.btn_close_screenshots_window);
    }

    public int getContentViewId() {
        return C1086R.layout.fragment_screenshots_viewer;
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(ScreenshotsViewerFragment.class.getSimpleName());
    }

    public void loadExtras(Bundle bundle) {
        if (bundle == null) {
            this.currentItem = getActivity().getIntent().getIntExtra(BundleArgs.POSITION.name(), 0);
        } else {
            this.currentItem = bundle.getInt(BundleArgs.POSITION.name(), 0);
        }
        if (bundle == null) {
            this.uris = getActivity().getIntent().getStringArrayListExtra(BundleArgs.URIs.name());
        } else {
            this.uris = bundle.getStringArrayList(BundleArgs.URIs.name());
        }
    }

    public void onPause() {
        super.onPause();
        showSystemUI();
    }

    public void onResume() {
        super.onResume();
        hideSystemUI();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(BundleArgs.POSITION.name(), this.currentItem);
        bundle.putStringArrayList(BundleArgs.URIs.name(), this.uris);
    }

    public void setupViews() {
        this.screenshots.setTrackingEnabled(false);
        ArrayList<String> arrayList = this.uris;
        if (arrayList != null && arrayList.size() > 0) {
            this.screenshots.setAdapter(new ViewPagerAdapterScreenshots(this.uris));
            this.screenshots.setCurrentItem(this.currentItem);
        }
        this.btnCloseViewer.setOnClickListener(new C1804c(this));
    }
}
