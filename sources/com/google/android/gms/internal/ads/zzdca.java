package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdha;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class zzdca<P> {

    /* renamed from: d */
    private static final Charset f21328d = Charset.forName("UTF-8");

    /* renamed from: a */
    private ConcurrentMap<String, List<zzdcb<P>>> f21329a = new ConcurrentHashMap();

    /* renamed from: b */
    private zzdcb<P> f21330b;

    /* renamed from: c */
    private final Class<P> f21331c;

    private zzdca(Class<P> cls) {
        this.f21331c = cls;
    }

    /* renamed from: a */
    public static <P> zzdca<P> m23281a(Class<P> cls) {
        return new zzdca<>(cls);
    }

    /* renamed from: b */
    public final zzdcb<P> mo28917b() {
        return this.f21330b;
    }

    /* renamed from: a */
    public final void mo28916a(zzdcb<P> zzdcb) {
        this.f21330b = zzdcb;
    }

    /* renamed from: a */
    public final zzdcb<P> mo28914a(P p, zzdha.zzb zzb) throws GeneralSecurityException {
        byte[] bArr;
        int i = C7332br.f14656a[zzb.mo29022j().ordinal()];
        if (i == 1 || i == 2) {
            bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(zzb.mo29026n()).array();
        } else if (i == 3) {
            bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(zzb.mo29026n()).array();
        } else if (i == 4) {
            bArr = zzdbm.f21321a;
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        zzdcb<P> zzdcb = new zzdcb<>(p, bArr, zzb.mo29025m(), zzb.mo29022j());
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzdcb);
        String str = new String(zzdcb.mo28920c(), f21328d);
        List list = (List) this.f21329a.put(str, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(zzdcb);
            this.f21329a.put(str, Collections.unmodifiableList(arrayList2));
        }
        return zzdcb;
    }

    /* renamed from: a */
    public final Class<P> mo28915a() {
        return this.f21331c;
    }
}
