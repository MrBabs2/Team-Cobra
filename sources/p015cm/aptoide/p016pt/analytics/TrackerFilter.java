package p015cm.aptoide.p016pt.analytics;

import p015cm.aptoide.analytics.implementation.navigation.ViewNameFilter;
import p015cm.aptoide.p016pt.account.view.LoginSignUpCredentialsFragment;
import p015cm.aptoide.p016pt.store.view.StoreFragment;
import p015cm.aptoide.p016pt.view.wizard.WizardFragment;

/* renamed from: cm.aptoide.pt.analytics.TrackerFilter */
public class TrackerFilter implements ViewNameFilter {
    public boolean filter(String str) {
        if (!str.equals(WizardFragment.class.getSimpleName()) && !str.equals(LoginSignUpCredentialsFragment.class.getSimpleName()) && !str.equals(StoreFragment.class.getSimpleName())) {
            return true;
        }
        return false;
    }
}
