package p015cm.aptoide.p016pt.view.settings;

import androidx.preference.Preference;

/* renamed from: cm.aptoide.pt.view.settings.j3 */
/* compiled from: lambda */
public final /* synthetic */ class C5444j3 implements Preference.C0564d {

    /* renamed from: a */
    private final /* synthetic */ SettingsFragment f9708a;

    /* renamed from: b */
    private final /* synthetic */ String f9709b;

    public /* synthetic */ C5444j3(SettingsFragment settingsFragment, String str) {
        this.f9708a = settingsFragment;
        this.f9709b = str;
    }

    public final boolean onPreferenceClick(Preference preference) {
        return this.f9708a.mo18842a(this.f9709b, preference);
    }
}
