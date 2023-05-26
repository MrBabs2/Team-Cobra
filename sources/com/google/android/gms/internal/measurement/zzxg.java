package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzxg extends AbstractList<String> implements zzve, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final zzve f23534f;

    public zzxg(zzve zzve) {
        this.f23534f = zzve;
    }

    /* renamed from: a */
    public final Object mo30446a(int i) {
        return this.f23534f.mo30446a(i);
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f23534f.get(i);
    }

    /* renamed from: i */
    public final zzve mo30449i() {
        return this;
    }

    public final Iterator<String> iterator() {
        return new C8363x2(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C8359w2(this, i);
    }

    /* renamed from: m */
    public final List<?> mo30450m() {
        return this.f23534f.mo30450m();
    }

    public final int size() {
        return this.f23534f.size();
    }
}
