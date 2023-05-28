package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

/* renamed from: com.google.android.gms.common.api.internal.o */
final class C7194o implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: f */
    private final /* synthetic */ zaak f13817f;

    private C7194o(zaak zaak) {
        this.f13817f = zaak;
    }

    /* renamed from: a */
    public final void mo24960a(int i) {
    }

    /* renamed from: a */
    public final void mo24962a(ConnectionResult connectionResult) {
        this.f13817f.f13870b.lock();
        try {
            if (this.f13817f.m15650a(connectionResult)) {
                this.f13817f.m15665f();
                this.f13817f.m15661d();
            } else {
                this.f13817f.m15653b(connectionResult);
            }
        } finally {
            this.f13817f.f13870b.unlock();
        }
    }

    /* renamed from: d */
    public final void mo24961d(Bundle bundle) {
        if (this.f13817f.f13886r.mo25332k()) {
            this.f13817f.f13870b.lock();
            try {
                if (this.f13817f.f13879k != null) {
                    this.f13817f.f13879k.mo30684a(new C7190m(this.f13817f));
                    this.f13817f.f13870b.unlock();
                }
            } finally {
                this.f13817f.f13870b.unlock();
            }
        } else {
            this.f13817f.f13879k.mo30684a(new C7190m(this.f13817f));
        }
    }

    /* synthetic */ C7194o(zaak zaak, C7178g gVar) {
        this(zaak);
    }
}
