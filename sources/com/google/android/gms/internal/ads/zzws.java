package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class zzws {

    /* renamed from: a */
    private final byte[] f22911a;

    /* renamed from: b */
    private int f22912b;

    /* renamed from: c */
    private int f22913c;

    /* renamed from: d */
    private final /* synthetic */ zzwo f22914d;

    private zzws(zzwo zzwo, byte[] bArr) {
        this.f22914d = zzwo;
        this.f22911a = bArr;
    }

    /* renamed from: a */
    public final synchronized void mo29862a() {
        try {
            if (this.f22914d.f22910b) {
                this.f22914d.f22909a.mo29286a(this.f22911a);
                this.f22914d.f22909a.mo29290l(this.f22912b);
                this.f22914d.f22909a.mo29289f(this.f22913c);
                this.f22914d.f22909a.mo29287a((int[]) null);
                this.f22914d.f22909a.mo29288b1();
            }
        } catch (RemoteException e) {
            zzbad.m20517a("Clearcut log failed", e);
        }
    }

    /* renamed from: b */
    public final zzws mo29863b(int i) {
        this.f22913c = i;
        return this;
    }

    /* renamed from: a */
    public final zzws mo29861a(int i) {
        this.f22912b = i;
        return this;
    }
}
