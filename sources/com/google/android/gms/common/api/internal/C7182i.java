package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GoogleApiAvailabilityCache;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.i */
final class C7182i extends C7196p {

    /* renamed from: g */
    private final Map<Api.Client, C7180h> f13800g;

    /* renamed from: h */
    final /* synthetic */ zaak f13801h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7182i(zaak zaak, Map<Api.Client, C7180h> map) {
        super(zaak, (C7178g) null);
        this.f13801h = zaak;
        this.f13800g = map;
    }

    /* renamed from: a */
    public final void mo25106a() {
        GoogleApiAvailabilityCache googleApiAvailabilityCache = new GoogleApiAvailabilityCache(this.f13801h.f13872d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Api.Client next : this.f13800g.keySet()) {
            if (!next.requiresGooglePlayServices() || this.f13800g.get(next).f13797c) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        int i = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                i = googleApiAvailabilityCache.mo25362a(this.f13801h.f13871c, (Api.Client) obj);
                if (i != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                i = googleApiAvailabilityCache.mo25362a(this.f13801h.f13871c, (Api.Client) obj2);
                if (i == 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            this.f13801h.f13869a.mo25168a((C7210w) new C7184j(this, this.f13801h, new ConnectionResult(i, (PendingIntent) null)));
            return;
        }
        if (this.f13801h.f13881m && this.f13801h.f13879k != null) {
            this.f13801h.f13879k.mo30682a();
        }
        for (Api.Client next2 : this.f13800g.keySet()) {
            BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks = this.f13800g.get(next2);
            if (!next2.requiresGooglePlayServices() || googleApiAvailabilityCache.mo25362a(this.f13801h.f13871c, next2) == 0) {
                next2.connect(connectionProgressReportCallbacks);
            } else {
                this.f13801h.f13869a.mo25168a((C7210w) new C7186k(this, this.f13801h, connectionProgressReportCallbacks));
            }
        }
    }
}
