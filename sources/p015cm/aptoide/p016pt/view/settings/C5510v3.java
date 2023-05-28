package p015cm.aptoide.p016pt.view.settings;

import android.content.DialogInterface;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.view.settings.v3 */
/* compiled from: lambda */
public final /* synthetic */ class C5510v3 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ SettingsFragment f9775f;

    /* renamed from: g */
    private final /* synthetic */ ThemeManager.ThemeOption[] f9776g;

    public /* synthetic */ C5510v3(SettingsFragment settingsFragment, ThemeManager.ThemeOption[] themeOptionArr) {
        this.f9775f = settingsFragment;
        this.f9776g = themeOptionArr;
    }

    public final Object call(Object obj) {
        return this.f9775f.mo18830a(this.f9776g, (DialogInterface) obj);
    }
}
