package p015cm.aptoide.p016pt.analytics.view;

import android.os.Bundle;
import javax.inject.Inject;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.p016pt.analytics.FirstLaunchAnalytics;
import p015cm.aptoide.p016pt.permission.PermissionProviderActivity;

/* renamed from: cm.aptoide.pt.analytics.view.AnalyticsActivity */
public abstract class AnalyticsActivity extends PermissionProviderActivity {
    private boolean _resumed = false;
    @Inject
    AnalyticsManager analyticsManager;
    @Inject
    FirstLaunchAnalytics firstLaunchAnalytics;

    public boolean is_resumed() {
        return this._resumed;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getActivityComponent().inject(this);
        this.firstLaunchAnalytics.setGmsPresent();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this._resumed = false;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this._resumed = true;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.analyticsManager.startSession();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.analyticsManager.endSession();
    }
}
