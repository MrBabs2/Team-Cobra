package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

public class zzcoj extends zzamw {

    /* renamed from: f */
    private final zzbri f20690f;

    /* renamed from: g */
    private final zzbrt f20691g;

    /* renamed from: h */
    private final zzbse f20692h;

    /* renamed from: i */
    private final zzbso f20693i;

    /* renamed from: j */
    private final zzbtp f20694j;

    /* renamed from: k */
    private final zzbsv f20695k;

    /* renamed from: l */
    private final zzbvq f20696l;

    public zzcoj(zzbri zzbri, zzbrt zzbrt, zzbse zzbse, zzbso zzbso, zzbtp zzbtp, zzbsv zzbsv, zzbvq zzbvq) {
        this.f20690f = zzbri;
        this.f20691g = zzbrt;
        this.f20692h = zzbse;
        this.f20693i = zzbso;
        this.f20694j = zzbtp;
        this.f20695k = zzbsv;
        this.f20696l = zzbvq;
    }

    /* renamed from: J */
    public void mo27432J() {
        this.f20696l.mo28459E();
    }

    /* renamed from: a */
    public final void mo27433a(zzafe zzafe, String str) {
    }

    /* renamed from: a */
    public final void mo27434a(zzamy zzamy) {
    }

    /* renamed from: a */
    public void mo27435a(zzato zzato) {
    }

    /* renamed from: a */
    public void mo27436a(zzatq zzatq) throws RemoteException {
    }

    /* renamed from: c */
    public void mo27437c(int i) throws RemoteException {
    }

    /* renamed from: i */
    public final void mo27438i(String str) {
    }

    /* renamed from: j1 */
    public void mo27439j1() throws RemoteException {
    }

    public final void onAdClicked() {
        this.f20690f.onAdClicked();
    }

    public final void onAdClosed() {
        this.f20695k.zzsz();
    }

    public final void onAdFailedToLoad(int i) {
    }

    public final void onAdImpression() {
        this.f20691g.mo28408w();
    }

    public final void onAdLeftApplication() {
        this.f20692h.mo28418y();
    }

    public final void onAdLoaded() {
        this.f20693i.onAdLoaded();
    }

    public final void onAdOpened() {
        this.f20695k.zzta();
    }

    public final void onAppEvent(String str, String str2) {
        this.f20694j.onAppEvent(str, str2);
    }

    public final void onVideoPause() {
        this.f20696l.mo28461y();
    }

    public final void onVideoPlay() throws RemoteException {
        this.f20696l.mo28458D();
    }

    /* renamed from: x */
    public void mo27450x() {
        this.f20696l.mo28460w();
    }

    public void zzb(Bundle bundle) throws RemoteException {
    }
}
