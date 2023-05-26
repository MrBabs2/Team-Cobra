package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.tw */
final class C8006tw extends C8228zw {

    /* renamed from: g */
    private final /* synthetic */ C7895qw f16919g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C8006tw(C7895qw qwVar) {
        super(qwVar, (C7932rw) null);
        this.f16919g = qwVar;
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C7969sw(this.f16919g, (C7932rw) null);
    }

    /* synthetic */ C8006tw(C7895qw qwVar, C7932rw rwVar) {
        this(qwVar);
    }
}
