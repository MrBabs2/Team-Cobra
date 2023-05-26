package p015cm.aptoide.p016pt.preferences;

import android.content.SharedPreferences;
import p015cm.aptoide.p016pt.preferences.Preferences;
import p123rx.p126m.C5377a;

/* renamed from: cm.aptoide.pt.preferences.d */
/* compiled from: lambda */
public final /* synthetic */ class C3584d implements C5377a {

    /* renamed from: f */
    private final /* synthetic */ Preferences.C35761 f6617f;

    /* renamed from: g */
    private final /* synthetic */ SharedPreferences.OnSharedPreferenceChangeListener f6618g;

    public /* synthetic */ C3584d(Preferences.C35761 r1, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f6617f = r1;
        this.f6618g = onSharedPreferenceChangeListener;
    }

    public final void call() {
        this.f6617f.mo13384a(this.f6618g);
    }
}
