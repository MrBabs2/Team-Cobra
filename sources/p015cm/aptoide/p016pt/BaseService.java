package p015cm.aptoide.p016pt;

import android.app.Service;

/* renamed from: cm.aptoide.pt.BaseService */
public abstract class BaseService extends Service {
    public ApplicationComponent getApplicationComponent() {
        return ((AptoideApplication) getApplication()).getApplicationComponent();
    }
}
