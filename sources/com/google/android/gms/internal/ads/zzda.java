package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import com.google.android.gms.internal.ads.zzbi;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class zzda {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final ConditionVariable f21276c = new ConditionVariable();

    /* renamed from: d */
    protected static volatile zzwo f21277d = null;

    /* renamed from: e */
    private static volatile Random f21278e = null;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public zzdy f21279a;

    /* renamed from: b */
    protected volatile Boolean f21280b;

    public zzda(zzdy zzdy) {
        this.f21279a = zzdy;
        zzdy.mo29244d().execute(new C7295ar(this));
    }

    /* renamed from: b */
    private static Random m23177b() {
        if (f21278e == null) {
            synchronized (zzda.class) {
                if (f21278e == null) {
                    f21278e = new Random();
                }
            }
        }
        return f21278e;
    }

    /* renamed from: a */
    public final void mo28868a(int i, int i2, long j) {
        mo28869a(i, i2, j, (Exception) null);
    }

    /* renamed from: a */
    public final void mo28869a(int i, int i2, long j, Exception exc) {
        try {
            f21276c.block();
            if (this.f21280b.booleanValue() && f21277d != null) {
                zzbi.zza.C12964zza j2 = zzbi.zza.m21087j();
                j2.mo28170a(this.f21279a.f21775a.getPackageName());
                j2.mo28169a(j);
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    zzdmb.m23746a((Throwable) exc, new PrintWriter(stringWriter));
                    j2.mo28171b(stringWriter.toString());
                    j2.mo28172c(exc.getClass().getName());
                }
                zzws a = f21277d.mo29860a(((zzbi.zza) ((zzdob) j2.mo29143t())).mo29065g());
                a.mo29863b(i);
                if (i2 != -1) {
                    a.mo29861a(i2);
                }
                a.mo29862a();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static int m23175a() {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return ThreadLocalRandom.current().nextInt();
            }
            return m23177b().nextInt();
        } catch (RuntimeException unused) {
            return m23177b().nextInt();
        }
    }
}
