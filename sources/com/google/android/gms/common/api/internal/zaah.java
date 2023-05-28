package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.SimpleClientAdapter;

public final class zaah implements zabd {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zabe f13867a;

    /* renamed from: b */
    private boolean f13868b = false;

    public zaah(zabe zabe) {
        this.f13867a = zabe;
    }

    /* renamed from: a */
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo25151a(T t) {
        try {
            this.f13867a.f13929s.f13914y.mo25183a(t);
            zaaw zaaw = this.f13867a.f13929s;
            Api.Client client = zaaw.f13905p.get(t.mo25011h());
            Preconditions.m16038a(client, (Object) "Appropriate Api was not requested.");
            if (client.isConnected() || !this.f13867a.f13922l.containsKey(t.mo25011h())) {
                boolean z = client instanceof SimpleClientAdapter;
                Api.AnyClient anyClient = client;
                if (z) {
                    anyClient = ((SimpleClientAdapter) client).mo25391d();
                }
                t.mo25007b(anyClient);
                return t;
            }
            t.mo25009c(new Status(17));
            return t;
        } catch (DeadObjectException unused) {
            this.f13867a.mo25168a((C7210w) new C7174e(this, this));
        }
    }

    /* renamed from: a */
    public final void mo25154a(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    /* renamed from: b */
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T mo25155b(T t) {
        mo25151a(t);
        return t;
    }

    /* renamed from: b */
    public final void mo25156b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo25157c() {
        if (this.f13868b) {
            this.f13868b = false;
            this.f13867a.f13929s.f13914y.mo25182a();
            disconnect();
        }
    }

    /* renamed from: d */
    public final void mo25158d(Bundle bundle) {
    }

    public final boolean disconnect() {
        if (this.f13868b) {
            return false;
        }
        if (this.f13867a.f13929s.mo25164m()) {
            this.f13868b = true;
            for (zacm a : this.f13867a.f13929s.f13913x) {
                a.mo25181a();
            }
            return false;
        }
        this.f13867a.mo25167a((ConnectionResult) null);
        return true;
    }

    /* renamed from: a */
    public final void mo25152a() {
        if (this.f13868b) {
            this.f13868b = false;
            this.f13867a.mo25168a((C7210w) new C7176f(this, this));
        }
    }

    /* renamed from: a */
    public final void mo25153a(int i) {
        this.f13867a.mo25167a((ConnectionResult) null);
        this.f13867a.f13930t.mo25134a(i, this.f13868b);
    }
}
