package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

public final class zzdtm<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, zzdtu<V>> f21759a;

    private zzdtm(int i) {
        this.f21759a = zzdtf.m24226c(i);
    }

    /* renamed from: a */
    public final zzdtm<K, V> mo29228a(K k, zzdtu<V> zzdtu) {
        LinkedHashMap<K, zzdtu<V>> linkedHashMap = this.f21759a;
        zzdto.m24236a(k, RoomNotification.KEY);
        zzdto.m24236a(zzdtu, "provider");
        linkedHashMap.put(k, zzdtu);
        return this;
    }

    /* renamed from: a */
    public final zzdtk<K, V> mo29227a() {
        return new zzdtk<>(this.f21759a);
    }
}
