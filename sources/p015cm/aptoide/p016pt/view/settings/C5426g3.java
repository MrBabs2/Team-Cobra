package p015cm.aptoide.p016pt.view.settings;

import androidx.preference.Preference;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.view.settings.g3 */
/* compiled from: lambda */
public final /* synthetic */ class C5426g3 implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ SettingsFragment f9688f;

    /* renamed from: g */
    private final /* synthetic */ Preference f9689g;

    /* renamed from: h */
    private final /* synthetic */ CharSequence[] f9690h;

    public /* synthetic */ C5426g3(SettingsFragment settingsFragment, Preference preference, CharSequence[] charSequenceArr) {
        this.f9688f = settingsFragment;
        this.f9689g = preference;
        this.f9690h = charSequenceArr;
    }

    public final void call(Object obj) {
        this.f9688f.mo18836a(this.f9689g, this.f9690h, (ThemeManager.ThemeOption) obj);
    }
}
