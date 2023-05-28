package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzdqw extends AbstractList<String> implements zzdot, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final zzdot f21613f;

    public zzdqw(zzdot zzdot) {
        this.f21613f = zzdot;
    }

    /* renamed from: a */
    public final void mo29152a(zzdmr zzdmr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final List<?> mo29154e() {
        return this.f21613f.mo29154e();
    }

    /* renamed from: g */
    public final Object mo29155g(int i) {
        return this.f21613f.mo29155g(i);
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f21613f.get(i);
    }

    public final Iterator<String> iterator() {
        return new C7559hx(this);
    }

    /* renamed from: l */
    public final zzdot mo29157l() {
        return this;
    }

    public final ListIterator<String> listIterator(int i) {
        return new C7522gx(this, i);
    }

    public final int size() {
        return this.f21613f.size();
    }
}
