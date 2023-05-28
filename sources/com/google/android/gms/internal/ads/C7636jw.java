package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.jw */
final class C7636jw<E> extends C8188yt<E> {

    /* renamed from: h */
    private static final C7636jw<Object> f15778h;

    /* renamed from: g */
    private final List<E> f15779g;

    static {
        C7636jw<Object> jwVar = new C7636jw<>(new ArrayList(0));
        f15778h = jwVar;
        jwVar.mo26836w();
    }

    private C7636jw(List<E> list) {
        this.f15779g = list;
    }

    /* renamed from: b */
    public static <E> C7636jw<E> m17355b() {
        return f15778h;
    }

    public final void add(int i, E e) {
        mo26829a();
        this.f15779g.add(i, e);
        this.modCount++;
    }

    /* renamed from: c */
    public final /* synthetic */ zzdoj mo25790c(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f15779g);
            return new C7636jw(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final E get(int i) {
        return this.f15779g.get(i);
    }

    public final E remove(int i) {
        mo26829a();
        E remove = this.f15779g.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e) {
        mo26829a();
        E e2 = this.f15779g.set(i, e);
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f15779g.size();
    }
}
