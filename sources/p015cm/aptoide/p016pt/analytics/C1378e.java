package p015cm.aptoide.p016pt.analytics;

import android.content.SharedPreferences;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.analytics.e */
/* compiled from: lambda */
public final /* synthetic */ class C1378e implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ FirstLaunchAnalytics f3843f;

    /* renamed from: g */
    private final /* synthetic */ SharedPreferences f3844g;

    public /* synthetic */ C1378e(FirstLaunchAnalytics firstLaunchAnalytics, SharedPreferences sharedPreferences) {
        this.f3843f = firstLaunchAnalytics;
        this.f3844g = sharedPreferences;
    }

    public final void call(Object obj) {
        this.f3843f.mo6783a(this.f3844g, (String) obj);
    }
}
