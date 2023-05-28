package p015cm.aptoide.p016pt.view;

import android.os.Bundle;
import com.trello.rxlifecycle.p034h.p035a.C4751a;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.FlavourActivityModule;
import p015cm.aptoide.p016pt.presenter.View;

/* renamed from: cm.aptoide.pt.view.BaseActivity */
public abstract class BaseActivity extends C4751a {
    private ActivityComponent activityComponent;
    private boolean firstCreated;

    public ActivityComponent getActivityComponent() {
        if (this.activityComponent == null) {
            AptoideApplication aptoideApplication = (AptoideApplication) getApplication();
            this.activityComponent = aptoideApplication.getApplicationComponent().plus(aptoideApplication.getActivityModule(this, getIntent(), aptoideApplication.getNotificationSyncScheduler(), (View) this, this.firstCreated, "cm.aptoide.pt.provider"), new FlavourActivityModule());
        }
        return this.activityComponent;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.firstCreated = bundle == null;
        getActivityComponent().inject(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.activityComponent = null;
        super.onDestroy();
    }
}
