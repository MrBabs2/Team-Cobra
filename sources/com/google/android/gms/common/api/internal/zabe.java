package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class zabe implements zabs, zar {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Lock f13916f;

    /* renamed from: g */
    private final Condition f13917g;

    /* renamed from: h */
    private final Context f13918h;

    /* renamed from: i */
    private final GoogleApiAvailabilityLight f13919i;

    /* renamed from: j */
    private final C7212x f13920j;

    /* renamed from: k */
    final Map<Api.AnyClientKey<?>, Api.Client> f13921k;

    /* renamed from: l */
    final Map<Api.AnyClientKey<?>, ConnectionResult> f13922l = new HashMap();

    /* renamed from: m */
    private final ClientSettings f13923m;

    /* renamed from: n */
    private final Map<Api<?>, Boolean> f13924n;

    /* renamed from: o */
    private final Api.AbstractClientBuilder<? extends zad, SignInOptions> f13925o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public volatile zabd f13926p;

    /* renamed from: q */
    private ConnectionResult f13927q = null;

    /* renamed from: r */
    int f13928r;

    /* renamed from: s */
    final zaaw f13929s;

    /* renamed from: t */
    final zabt f13930t;

    public zabe(Context context, zaaw zaaw, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, ArrayList<zaq> arrayList, zabt zabt) {
        this.f13918h = context;
        this.f13916f = lock;
        this.f13919i = googleApiAvailabilityLight;
        this.f13921k = map;
        this.f13923m = clientSettings;
        this.f13924n = map2;
        this.f13925o = abstractClientBuilder;
        this.f13929s = zaaw;
        this.f13930t = zabt;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            zaq zaq = arrayList.get(i);
            i++;
            zaq.mo25196a((zar) this);
        }
        this.f13920j = new C7212x(this, looper);
        this.f13917g = lock.newCondition();
        this.f13926p = new zaav(this);
    }

    /* renamed from: a */
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo25122a(T t) {
        t.mo25019f();
        return this.f13926p.mo25151a(t);
    }

    /* renamed from: a */
    public final boolean mo25124a(SignInConnectionListener signInConnectionListener) {
        return false;
    }

    /* renamed from: b */
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T mo25125b(T t) {
        t.mo25019f();
        return this.f13926p.mo25155b(t);
    }

    /* renamed from: c */
    public final void mo25127c() {
    }

    /* renamed from: d */
    public final ConnectionResult mo25128d() {
        mo25123a();
        while (mo25170e()) {
            try {
                this.f13917g.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, (PendingIntent) null);
            }
        }
        if (isConnected()) {
            return ConnectionResult.f13608j;
        }
        ConnectionResult connectionResult = this.f13927q;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, (PendingIntent) null);
    }

    public final void disconnect() {
        if (this.f13926p.disconnect()) {
            this.f13922l.clear();
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.f13926p);
        for (Api next : this.f13924n.keySet()) {
            printWriter.append(str).append(next.mo24889b()).println(":");
            this.f13921k.get(next.mo24888a()).dump(concat, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: e */
    public final boolean mo25170e() {
        return this.f13926p instanceof zaak;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo25171f() {
        this.f13916f.lock();
        try {
            this.f13926p = new zaak(this, this.f13923m, this.f13924n, this.f13919i, this.f13925o, this.f13916f, this.f13918h);
            this.f13926p.mo25156b();
            this.f13917g.signalAll();
        } finally {
            this.f13916f.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo25172g() {
        this.f13916f.lock();
        try {
            this.f13929s.mo25163l();
            this.f13926p = new zaah(this);
            this.f13926p.mo25156b();
            this.f13917g.signalAll();
        } finally {
            this.f13916f.unlock();
        }
    }

    public final boolean isConnected() {
        return this.f13926p instanceof zaah;
    }

    /* renamed from: a */
    public final void mo25123a() {
        this.f13926p.mo25152a();
    }

    /* renamed from: b */
    public final void mo25126b() {
        if (isConnected()) {
            ((zaah) this.f13926p).mo25157c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo25167a(ConnectionResult connectionResult) {
        this.f13916f.lock();
        try {
            this.f13927q = connectionResult;
            this.f13926p = new zaav(this);
            this.f13926p.mo25156b();
            this.f13917g.signalAll();
        } finally {
            this.f13916f.unlock();
        }
    }

    /* renamed from: d */
    public final void mo24961d(Bundle bundle) {
        this.f13916f.lock();
        try {
            this.f13926p.mo25158d(bundle);
        } finally {
            this.f13916f.unlock();
        }
    }

    /* renamed from: a */
    public final void mo25042a(ConnectionResult connectionResult, Api<?> api, boolean z) {
        this.f13916f.lock();
        try {
            this.f13926p.mo25154a(connectionResult, api, z);
        } finally {
            this.f13916f.unlock();
        }
    }

    /* renamed from: a */
    public final void mo24960a(int i) {
        this.f13916f.lock();
        try {
            this.f13926p.mo25153a(i);
        } finally {
            this.f13916f.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo25168a(C7210w wVar) {
        this.f13920j.sendMessage(this.f13920j.obtainMessage(1, wVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo25169a(RuntimeException runtimeException) {
        this.f13920j.sendMessage(this.f13920j.obtainMessage(2, runtimeException));
    }
}
