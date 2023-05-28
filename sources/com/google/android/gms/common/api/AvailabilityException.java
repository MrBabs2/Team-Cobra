package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import p050l.p066e.C4868a;

public class AvailabilityException extends Exception {

    /* renamed from: f */
    private final C4868a<zai<?>, ConnectionResult> f13639f;

    public AvailabilityException(C4868a<zai<?>, ConnectionResult> aVar) {
        this.f13639f = aVar;
    }

    /* renamed from: a */
    public ConnectionResult mo24911a(GoogleApi<? extends Api.ApiOptions> googleApi) {
        zai<? extends Api.ApiOptions> g = googleApi.mo24931g();
        Preconditions.m16044a(this.f13639f.get(g) != null, (Object) "The given API was not part of the availability request.");
        return this.f13639f.get(g);
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (zai next : this.f13639f.keySet()) {
            ConnectionResult connectionResult = this.f13639f.get(next);
            if (connectionResult.mo24846t()) {
                z = false;
            }
            String a = next.mo25185a();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2 + String.valueOf(valueOf).length());
            sb.append(a);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    /* renamed from: a */
    public final C4868a<zai<?>, ConnectionResult> mo24912a() {
        return this.f13639f;
    }
}
