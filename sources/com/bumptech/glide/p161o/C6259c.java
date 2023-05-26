package com.bumptech.glide.p161o;

import com.bumptech.glide.load.engine.C5961i;
import com.bumptech.glide.load.engine.C5989s;
import com.bumptech.glide.load.p152o.p158h.C6229g;
import com.bumptech.glide.p166r.C6314i;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p050l.p066e.C4868a;
import p050l.p075h.p083k.C5005e;

/* renamed from: com.bumptech.glide.o.c */
/* compiled from: LoadPathCache */
public class C6259c {

    /* renamed from: c */
    private static final C5989s<?, ?, ?> f11423c = new C5989s(Object.class, Object.class, Object.class, Collections.singletonList(new C5961i(Object.class, Object.class, Object.class, Collections.emptyList(), new C6229g(), (C5005e<List<Throwable>>) null)), (C5005e<List<Throwable>>) null);

    /* renamed from: a */
    private final C4868a<C6314i, C5989s<?, ?, ?>> f11424a = new C4868a<>();

    /* renamed from: b */
    private final AtomicReference<C6314i> f11425b = new AtomicReference<>();

    /* renamed from: b */
    private C6314i m12735b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C6314i andSet = this.f11425b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new C6314i();
        }
        andSet.mo20768a(cls, cls2, cls3);
        return andSet;
    }

    /* renamed from: a */
    public boolean mo20613a(C5989s<?, ?, ?> sVar) {
        return f11423c.equals(sVar);
    }

    /* renamed from: a */
    public <Data, TResource, Transcode> C5989s<Data, TResource, Transcode> mo20611a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C5989s<Data, TResource, Transcode> sVar;
        C6314i b = m12735b(cls, cls2, cls3);
        synchronized (this.f11424a) {
            sVar = this.f11424a.get(b);
        }
        this.f11425b.set(b);
        return sVar;
    }

    /* renamed from: a */
    public void mo20612a(Class<?> cls, Class<?> cls2, Class<?> cls3, C5989s<?, ?, ?> sVar) {
        synchronized (this.f11424a) {
            C4868a<C6314i, C5989s<?, ?, ?>> aVar = this.f11424a;
            C6314i iVar = new C6314i(cls, cls2, cls3);
            if (sVar == null) {
                sVar = f11423c;
            }
            aVar.put(iVar, sVar);
        }
    }
}
