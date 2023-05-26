package p015cm.aptoide.p016pt.home;

import p015cm.aptoide.p016pt.appview.PreferencesPersister;
import p015cm.aptoide.p016pt.preferences.managed.ManagedKeys;

/* renamed from: cm.aptoide.pt.home.EskillsPreferencesManager */
public class EskillsPreferencesManager {
    private final PreferencesPersister preferencesPersister;

    public EskillsPreferencesManager(PreferencesPersister preferencesPersister2) {
        this.preferencesPersister = preferencesPersister2;
    }

    public void setEskillsDialogShown() {
        this.preferencesPersister.save(ManagedKeys.SHOW_ESKILLS_DIALOG, false);
    }

    public boolean shouldShowEskillsDialog() {
        return this.preferencesPersister.get(ManagedKeys.SHOW_ESKILLS_DIALOG, true);
    }
}
