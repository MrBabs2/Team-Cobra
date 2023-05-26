package p015cm.aptoide.p016pt.analytics;

import android.content.SharedPreferences;
import p015cm.aptoide.p016pt.preferences.secure.SecurePreferences;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.analytics.b */
/* compiled from: lambda */
public final /* synthetic */ class C1375b implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ SharedPreferences f3840f;

    public /* synthetic */ C1375b(SharedPreferences sharedPreferences) {
        this.f3840f = sharedPreferences;
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(SecurePreferences.isFirstRun(this.f3840f));
    }
}
