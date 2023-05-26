package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;

public class GoogleApiAvailabilityCache {

    /* renamed from: a */
    private final SparseIntArray f14133a;

    /* renamed from: b */
    private GoogleApiAvailabilityLight f14134b;

    public GoogleApiAvailabilityCache() {
        this(GoogleApiAvailability.m15256a());
    }

    /* renamed from: a */
    public int mo25362a(Context context, Api.Client client) {
        Preconditions.m16037a(context);
        Preconditions.m16037a(client);
        int i = 0;
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        int i2 = this.f14133a.get(minApkVersion, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.f14133a.size()) {
                i = i2;
                break;
            }
            int keyAt = this.f14133a.keyAt(i3);
            if (keyAt > minApkVersion && this.f14133a.get(keyAt) == 0) {
                break;
            }
            i3++;
        }
        if (i == -1) {
            i = this.f14134b.mo24858a(context, minApkVersion);
        }
        this.f14133a.put(minApkVersion, i);
        return i;
    }

    public GoogleApiAvailabilityCache(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.f14133a = new SparseIntArray();
        Preconditions.m16037a(googleApiAvailabilityLight);
        this.f14134b = googleApiAvailabilityLight;
    }

    /* renamed from: a */
    public void mo25363a() {
        this.f14133a.clear();
    }
}
