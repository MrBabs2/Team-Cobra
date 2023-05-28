package p015cm.aptoide.p016pt.promotions;

import p015cm.aptoide.p016pt.appview.PreferencesPersister;
import p015cm.aptoide.p016pt.preferences.managed.ManagedKeys;

/* renamed from: cm.aptoide.pt.promotions.PromotionsPreferencesManager */
public class PromotionsPreferencesManager {
    private PreferencesPersister preferencesPersister;

    public PromotionsPreferencesManager(PreferencesPersister preferencesPersister2) {
        this.preferencesPersister = preferencesPersister2;
    }

    public void setPromotionsDialogShown() {
        this.preferencesPersister.save(ManagedKeys.SHOW_PROMOTIONS_DIALOG, false);
    }

    public boolean shouldShowPromotionsDialog() {
        return this.preferencesPersister.get(ManagedKeys.SHOW_PROMOTIONS_DIALOG, true);
    }
}
