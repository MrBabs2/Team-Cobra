package p015cm.aptoide.p016pt.view.wizard;

import androidx.fragment.app.C0462h;
import androidx.fragment.app.C0483k;
import androidx.fragment.app.Fragment;
import p015cm.aptoide.p016pt.NavigationTrackerPagerAdapterHelper;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;

/* renamed from: cm.aptoide.pt.view.wizard.WizardPagerAdapter */
public class WizardPagerAdapter extends C0483k implements NavigationTrackerPagerAdapterHelper {
    private final boolean isLoggedIn;
    private final WizardFragmentProvider wizardFragmentProvider;

    public WizardPagerAdapter(C0462h hVar, Boolean bool, WizardFragmentProvider wizardFragmentProvider2) {
        super(hVar);
        this.isLoggedIn = bool.booleanValue();
        this.wizardFragmentProvider = wizardFragmentProvider2;
    }

    public int getCount() {
        return this.wizardFragmentProvider.getCount(Boolean.valueOf(this.isLoggedIn));
    }

    public Fragment getItem(int i) {
        return this.wizardFragmentProvider.getItem(i);
    }

    public String getItemName(int i) {
        return getItem(i).getClass().getSimpleName();
    }

    public StoreContext getItemStore() {
        return StoreContext.home;
    }

    public String getItemTag(int i) {
        return String.valueOf(i);
    }

    public boolean isLoggedIn() {
        return this.isLoggedIn;
    }
}
