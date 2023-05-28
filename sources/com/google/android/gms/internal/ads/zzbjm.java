package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzbkw;
import java.util.concurrent.Executor;

public abstract class zzbjm implements zzblp {

    /* renamed from: a */
    private static zzbjm f19053a;

    /* renamed from: a */
    public static zzbjm m21207a(Context context, zzamp zzamp, int i) {
        zzbjm a = m21206a(context, i);
        a.mo28227d().mo28733a(zzamp);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract zzcvs mo28223a(zzcwx zzcwx);

    /* renamed from: a */
    public abstract Executor mo28224a();

    /* renamed from: b */
    public abstract zzbbl mo28225b();

    /* renamed from: c */
    public abstract zzbtb mo28226c();

    /* renamed from: d */
    public abstract zzclc mo28227d();

    /* renamed from: e */
    public abstract zzbkz mo28228e();

    /* renamed from: f */
    public abstract zzbod mo28229f();

    /* renamed from: g */
    public abstract zzbwt mo28230g();

    /* renamed from: h */
    public abstract zzbxp mo28231h();

    /* renamed from: i */
    public abstract zzcdg mo28232i();

    /* renamed from: j */
    public abstract zzcqp mo28233j();

    @Deprecated
    /* renamed from: a */
    public static zzbjm m21206a(Context context, int i) {
        synchronized (zzbjm.class) {
            if (f19053a == null) {
                return m21208a(new zzbai(15000000, i, true, false), context, (zzbkw.zza) new zzbkb());
            }
            zzbjm zzbjm = f19053a;
            return zzbjm;
        }
    }

    @Deprecated
    /* renamed from: a */
    private static zzbjm m21208a(zzbai zzbai, Context context, zzbkw.zza zza) {
        zzbjm zzbjm;
        synchronized (zzbjm.class) {
            if (f19053a == null) {
                zzbkn zzbkn = new zzbkn();
                zzbjn.zza zza2 = new zzbjn.zza();
                zza2.mo28239a(zzbai);
                zza2.mo28238a(context);
                zzbkn.mo28253a(new zzbjn(zza2));
                zzbkn.mo28254a(new zzbkw(zza));
                f19053a = zzbkn.mo28252a();
                zzacu.m18983a(context);
                zzk.zzlk().mo27732a(context, zzbai);
                zzk.zzlm().mo29844a(context);
                zzk.zzlg().mo27801a(context);
                zzk.zzlg().mo27806b(context);
                zzawx.m20165a(context);
                zzk.zzlj().mo29813a(context);
                zzk.zzmb().mo27870a(context);
                if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17911g3)).booleanValue()) {
                    new zzcjr(context, zzbai, new zzwj(new zzwo(context)), new zzcjc(new zzcja(context), f19053a.mo28225b())).mo28715a();
                }
            }
            zzbjm = f19053a;
        }
        return zzbjm;
    }

    /* renamed from: a */
    public final zzcvs mo28222a(zzarx zzarx) {
        return mo28223a(new zzcwx(zzarx));
    }
}
