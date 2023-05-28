package p015cm.aptoide.p016pt;

import android.content.Context;
import p015cm.aptoide.p016pt.ads.GooglePlayServicesAvailabilityChecker;
import p015cm.aptoide.p016pt.dataprovider.ads.AdNetworkUtils;

/* renamed from: cm.aptoide.pt.g0 */
/* compiled from: lambda */
public final /* synthetic */ class C2704g0 implements GooglePlayServicesAvailabilityChecker {

    /* renamed from: a */
    public static final /* synthetic */ C2704g0 f5542a = new C2704g0();

    private /* synthetic */ C2704g0() {
    }

    public final boolean isAvailable(Context context) {
        return AdNetworkUtils.isGooglePlayServicesAvailable(context);
    }
}
