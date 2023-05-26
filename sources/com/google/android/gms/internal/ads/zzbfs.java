package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@zzard
public final class zzbfs implements Iterable<zzbfq> {

    /* renamed from: f */
    private final List<zzbfq> f18928f = new ArrayList();

    /* renamed from: a */
    public static boolean m20813a(zzbdf zzbdf) {
        zzbfq b = m20814b(zzbdf);
        if (b == null) {
            return false;
        }
        b.f18925b.mo28080b();
        return true;
    }

    /* renamed from: b */
    static zzbfq m20814b(zzbdf zzbdf) {
        Iterator<zzbfq> it = zzk.zzmc().iterator();
        while (it.hasNext()) {
            zzbfq next = it.next();
            if (next.f18924a == zzbdf) {
                return next;
            }
        }
        return null;
    }

    public final Iterator<zzbfq> iterator() {
        return this.f18928f.iterator();
    }

    /* renamed from: a */
    public final void mo28067a(zzbfq zzbfq) {
        this.f18928f.add(zzbfq);
    }

    /* renamed from: b */
    public final void mo28068b(zzbfq zzbfq) {
        this.f18928f.remove(zzbfq);
    }
}
