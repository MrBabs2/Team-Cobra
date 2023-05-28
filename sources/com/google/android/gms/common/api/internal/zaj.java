package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class zaj extends zal {

    /* renamed from: k */
    private final SparseArray<C7217a> f13973k = new SparseArray<>();

    /* renamed from: com.google.android.gms.common.api.internal.zaj$a */
    private class C7217a implements GoogleApiClient.OnConnectionFailedListener {

        /* renamed from: f */
        public final int f13974f;

        /* renamed from: g */
        public final GoogleApiClient f13975g;

        /* renamed from: h */
        public final GoogleApiClient.OnConnectionFailedListener f13976h;

        public C7217a(int i, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            this.f13974f = i;
            this.f13975g = googleApiClient;
            this.f13976h = onConnectionFailedListener;
            googleApiClient.mo24941a((GoogleApiClient.OnConnectionFailedListener) this);
        }

        /* renamed from: a */
        public final void mo24962a(ConnectionResult connectionResult) {
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("beginFailureResolution for ");
            sb.append(valueOf);
            Log.d("AutoManageHelper", sb.toString());
            zaj.this.mo25193b(connectionResult, this.f13974f);
        }
    }

    private zaj(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.f13761f.mo25076a("AutoManageHelper", (LifecycleCallback) this);
    }

    /* renamed from: b */
    public static zaj m15830b(LifecycleActivity lifecycleActivity) {
        LifecycleFragment a = LifecycleCallback.m15504a(lifecycleActivity);
        zaj zaj = (zaj) a.mo25075a("AutoManageHelper", zaj.class);
        if (zaj != null) {
            return zaj;
        }
        return new zaj(a);
    }

    /* renamed from: a */
    public final void mo25189a(int i, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.m16038a(googleApiClient, (Object) "GoogleApiClient instance cannot be null");
        boolean z = this.f13973k.indexOfKey(i) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        Preconditions.m16048b(z, sb.toString());
        C7193n0 n0Var = this.f13984h.get();
        boolean z2 = this.f13983g;
        String valueOf = String.valueOf(n0Var);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i);
        sb2.append(" ");
        sb2.append(z2);
        sb2.append(" ");
        sb2.append(valueOf);
        Log.d("AutoManageHelper", sb2.toString());
        this.f13973k.put(i, new C7217a(i, googleApiClient, onConnectionFailedListener));
        if (this.f13983g && n0Var == null) {
            String valueOf2 = String.valueOf(googleApiClient);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 11);
            sb3.append("connecting ");
            sb3.append(valueOf2);
            Log.d("AutoManageHelper", sb3.toString());
            googleApiClient.mo24948c();
        }
    }

    /* renamed from: d */
    public void mo25072d() {
        super.mo25072d();
        boolean z = this.f13983g;
        String valueOf = String.valueOf(this.f13973k);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        Log.d("AutoManageHelper", sb.toString());
        if (this.f13984h.get() == null) {
            for (int i = 0; i < this.f13973k.size(); i++) {
                C7217a b = m15829b(i);
                if (b != null) {
                    b.f13975g.mo24948c();
                }
            }
        }
    }

    /* renamed from: e */
    public void mo25073e() {
        super.mo25073e();
        for (int i = 0; i < this.f13973k.size(); i++) {
            C7217a b = m15829b(i);
            if (b != null) {
                b.f13975g.mo24949d();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo25149f() {
        for (int i = 0; i < this.f13973k.size(); i++) {
            C7217a b = m15829b(i);
            if (b != null) {
                b.f13975g.mo24948c();
            }
        }
    }

    /* renamed from: b */
    private final C7217a m15829b(int i) {
        if (this.f13973k.size() <= i) {
            return null;
        }
        SparseArray<C7217a> sparseArray = this.f13973k;
        return sparseArray.get(sparseArray.keyAt(i));
    }

    /* renamed from: a */
    public final void mo25188a(int i) {
        C7217a aVar = this.f13973k.get(i);
        this.f13973k.remove(i);
        if (aVar != null) {
            aVar.f13975g.mo24947b((GoogleApiClient.OnConnectionFailedListener) aVar);
            aVar.f13975g.mo24949d();
        }
    }

    /* renamed from: a */
    public void mo25068a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f13973k.size(); i++) {
            C7217a b = m15829b(i);
            if (b != null) {
                printWriter.append(str).append("GoogleApiClient #").print(b.f13974f);
                printWriter.println(":");
                b.f13975g.mo24943a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25148a(ConnectionResult connectionResult, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        C7217a aVar = this.f13973k.get(i);
        if (aVar != null) {
            mo25188a(i);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = aVar.f13976h;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.mo24962a(connectionResult);
            }
        }
    }
}
