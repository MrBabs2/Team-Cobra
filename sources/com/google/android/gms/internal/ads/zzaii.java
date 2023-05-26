package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.zzk;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@zzard
public final class zzaii implements zzm {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile zzahz f18136a;

    /* renamed from: b */
    private final Context f18137b;

    public zzaii(Context context) {
        this.f18137b = context;
    }

    /* renamed from: a */
    public final zzp mo27317a(zzr<?> zzr) throws zzaf {
        zzaia a = zzaia.m19260a(zzr);
        long c = zzk.zzln().mo25499c();
        try {
            zzbbr zzbbr = new zzbbr();
            this.f18136a = new zzahz(this.f18137b, zzk.zzlu().mo27864b(), new C7937s0(this, zzbbr), new C7974t0(this, zzbbr));
            this.f18136a.checkAvailabilityAndConnect();
            zzbbh a2 = zzbar.m20541a(zzbar.m20542a(zzbbr, new C7826p0(this, a), (Executor) zzaxg.f18648a), (long) ((Integer) zzyt.m25670e().mo27163a(zzacu.f17885b2)).intValue(), TimeUnit.MILLISECONDS, zzaxg.f18650c);
            a2.mo25573b(new C7900r0(this), zzaxg.f18648a);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) a2.get();
            long c2 = zzk.zzln().mo25499c() - c;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(c2);
            sb.append("ms");
            zzawz.m20167e(sb.toString());
            zzaic zzaic = (zzaic) new zzaru(parcelFileDescriptor).mo27593a(zzaic.CREATOR);
            if (zzaic == null) {
                return null;
            }
            if (zzaic.f18128f) {
                throw new zzaf(zzaic.f18129g);
            } else if (zzaic.f18132j.length != zzaic.f18133k.length) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                int i = 0;
                while (true) {
                    String[] strArr = zzaic.f18132j;
                    if (i >= strArr.length) {
                        return new zzp(zzaic.f18130h, zzaic.f18131i, (Map<String, String>) hashMap, zzaic.f18134l, zzaic.f18135m);
                    }
                    hashMap.put(strArr[i], zzaic.f18133k[i]);
                    i++;
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(zzk.zzln().mo25499c() - c);
            sb2.append("ms");
            zzawz.m20167e(sb2.toString());
            return null;
        } catch (Throwable th) {
            long c3 = zzk.zzln().mo25499c() - c;
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(c3);
            sb3.append("ms");
            zzawz.m20167e(sb3.toString());
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m19264a() {
        if (this.f18136a != null) {
            this.f18136a.disconnect();
            Binder.flushPendingCommands();
        }
    }
}
