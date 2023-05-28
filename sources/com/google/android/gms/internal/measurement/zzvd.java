package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzvd extends C8276e0<String> implements zzve, RandomAccess {

    /* renamed from: h */
    private static final zzvd f23526h;

    /* renamed from: g */
    private final List<Object> f23527g;

    static {
        zzvd zzvd = new zzvd();
        f23526h = zzvd;
        zzvd.mo30101s();
    }

    public zzvd() {
        this(10);
    }

    /* renamed from: a */
    public final Object mo30446a(int i) {
        return this.f23527g.get(i);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        mo30095a();
        this.f23527g.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: b */
    public final /* synthetic */ zzuu mo30071b(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f23527g);
            return new zzvd((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final void clear() {
        mo30095a();
        this.f23527g.clear();
        this.modCount++;
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f23527g.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzte) {
            zzte zzte = (zzte) obj;
            String a = zzte.mo30375a();
            if (zzte.mo30207b()) {
                this.f23527g.set(i, a);
            }
            return a;
        }
        byte[] bArr = (byte[]) obj;
        String c = zzuq.m26682c(bArr);
        if (zzuq.m26681b(bArr)) {
            this.f23527g.set(i, c);
        }
        return c;
    }

    /* renamed from: i */
    public final zzve mo30449i() {
        return mo30094H() ? new zzxg(this) : this;
    }

    /* renamed from: m */
    public final List<?> mo30450m() {
        return Collections.unmodifiableList(this.f23527g);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        mo30095a();
        return m26696a(this.f23527g.set(i, (String) obj));
    }

    public final int size() {
        return this.f23527g.size();
    }

    public zzvd(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    /* renamed from: a */
    private static String m26696a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzte) {
            return ((zzte) obj).mo30375a();
        }
        return zzuq.m26682c((byte[]) obj);
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo30095a();
        if (collection instanceof zzve) {
            collection = ((zzve) collection).mo30450m();
        }
        boolean addAll = this.f23527g.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final /* synthetic */ Object remove(int i) {
        mo30095a();
        Object remove = this.f23527g.remove(i);
        this.modCount++;
        return m26696a(remove);
    }

    private zzvd(ArrayList<Object> arrayList) {
        this.f23527g = arrayList;
    }
}
