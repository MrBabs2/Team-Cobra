package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzdos extends C8188yt<String> implements zzdot, RandomAccess {

    /* renamed from: h */
    private static final zzdos f21603h;

    /* renamed from: g */
    private final List<Object> f21604g;

    static {
        zzdos zzdos = new zzdos();
        f21603h = zzdos;
        zzdos.mo26836w();
    }

    public zzdos() {
        this(10);
    }

    /* renamed from: a */
    public final void mo29152a(zzdmr zzdmr) {
        mo26829a();
        this.f21604g.add(zzdmr);
        this.modCount++;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        mo26829a();
        this.f21604g.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: c */
    public final /* synthetic */ zzdoj mo25790c(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f21604g);
            return new zzdos((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final void clear() {
        mo26829a();
        this.f21604g.clear();
        this.modCount++;
    }

    /* renamed from: e */
    public final List<?> mo29154e() {
        return Collections.unmodifiableList(this.f21604g);
    }

    /* renamed from: g */
    public final Object mo29155g(int i) {
        return this.f21604g.get(i);
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f21604g.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzdmr) {
            zzdmr zzdmr = (zzdmr) obj;
            String b = zzdmr.mo29072b();
            if (zzdmr.mo26253c()) {
                this.f21604g.set(i, b);
            }
            return b;
        }
        byte[] bArr = (byte[]) obj;
        String c = zzdod.m24039c(bArr);
        if (zzdod.m24038b(bArr)) {
            this.f21604g.set(i, c);
        }
        return c;
    }

    /* renamed from: l */
    public final zzdot mo29157l() {
        return mo26833q() ? new zzdqw(this) : this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        mo26829a();
        return m24062a(this.f21604g.set(i, (String) obj));
    }

    public final int size() {
        return this.f21604g.size();
    }

    public zzdos(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo26829a();
        if (collection instanceof zzdot) {
            collection = ((zzdot) collection).mo29154e();
        }
        boolean addAll = this.f21604g.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final /* synthetic */ Object remove(int i) {
        mo26829a();
        Object remove = this.f21604g.remove(i);
        this.modCount++;
        return m24062a(remove);
    }

    private zzdos(ArrayList<Object> arrayList) {
        this.f21604g = arrayList;
    }

    /* renamed from: a */
    private static String m24062a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzdmr) {
            return ((zzdmr) obj).mo29072b();
        }
        return zzdod.m24039c((byte[]) obj);
    }
}
