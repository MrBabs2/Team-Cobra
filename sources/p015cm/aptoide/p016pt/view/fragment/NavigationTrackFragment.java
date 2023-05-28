package p015cm.aptoide.p016pt.view.fragment;

import android.os.Bundle;
import android.view.View;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.PageViewsAnalytics;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.AptoideApplication;

/* renamed from: cm.aptoide.pt.view.fragment.NavigationTrackFragment */
public abstract class NavigationTrackFragment extends FragmentView {
    public static final String SHOULD_REGISTER_VIEW = "should_register_view";
    private AnalyticsManager analyticsManager;
    /* access modifiers changed from: protected */
    public NavigationTracker navigationTracker;
    protected PageViewsAnalytics pageViewsAnalytics;
    protected boolean shouldRegister = true;

    private void getFragmentExtras() {
        if (getArguments() != null && getArguments().containsKey(SHOULD_REGISTER_VIEW)) {
            this.shouldRegister = getArguments().getBoolean(SHOULD_REGISTER_VIEW);
        }
    }

    public ScreenTagHistory getHistoryTracker() {
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.navigationTracker == null) {
            this.navigationTracker = ((AptoideApplication) getContext().getApplicationContext()).getNavigationTracker();
        }
        if (this.analyticsManager == null) {
            this.analyticsManager = ((AptoideApplication) getContext().getApplicationContext()).getAnalyticsManager();
        }
        this.pageViewsAnalytics = new PageViewsAnalytics(this.analyticsManager);
        getFragmentExtras();
    }

    public void onResume() {
        super.onResume();
        ScreenTagHistory historyTracker = getHistoryTracker();
        if (!this.shouldRegister) {
            return;
        }
        if (historyTracker != null) {
            this.navigationTracker.registerScreen(historyTracker);
            return;
        }
        throw new RuntimeException("If " + getClass().getSimpleName() + " should be logged to screen history, it has to return a value on method NavigationTrackFragment#getHistoryTracker");
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    /* access modifiers changed from: protected */
    public void setRegisterFragment(boolean z) {
        this.shouldRegister = z;
    }
}
