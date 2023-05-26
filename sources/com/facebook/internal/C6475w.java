package com.facebook.internal;

import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: com.facebook.internal.w */
/* compiled from: SmartLoginOption */
public enum C6475w {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    

    /* renamed from: j */
    public static final EnumSet<C6475w> f11918j = null;

    /* renamed from: f */
    private final long f11920f;

    static {
        f11918j = EnumSet.allOf(C6475w.class);
    }

    private C6475w(long j) {
        this.f11920f = j;
    }

    /* renamed from: a */
    public static EnumSet<C6475w> m13476a(long j) {
        EnumSet<C6475w> noneOf = EnumSet.noneOf(C6475w.class);
        Iterator it = f11918j.iterator();
        while (it.hasNext()) {
            C6475w wVar = (C6475w) it.next();
            if ((wVar.mo21029a() & j) != 0) {
                noneOf.add(wVar);
            }
        }
        return noneOf;
    }

    /* renamed from: a */
    public long mo21029a() {
        return this.f11920f;
    }
}
