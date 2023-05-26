package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.zzk;

public final class zzcsd implements zzcva<zzcsc> {

    /* renamed from: a */
    private final zzbbl f20892a;

    /* renamed from: b */
    private final Context f20893b;

    public zzcsd(zzbbl zzbbl, Context context) {
        this.f20892a = zzbbl;
        this.f20893b = context;
    }

    /* renamed from: a */
    public final zzbbh<zzcsc> mo25785a() {
        return this.f20892a.mo27892a(new C8182yn(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ zzcsc mo28785b() throws Exception {
        AudioManager audioManager = (AudioManager) this.f20893b.getSystemService("audio");
        return new zzcsc(audioManager.getMode(), audioManager.isMusicActive(), audioManager.isSpeakerphoneOn(), audioManager.getStreamVolume(3), audioManager.getRingerMode(), audioManager.getStreamVolume(2), zzk.zzll().mo27828a(), zzk.zzll().mo27831b());
    }
}
