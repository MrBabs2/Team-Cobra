package com.google.android.material.appbar;

import android.view.View;
import p050l.p075h.p084l.C5071v;

/* renamed from: com.google.android.material.appbar.d */
/* compiled from: ViewOffsetHelper */
class C8425d {

    /* renamed from: a */
    private final View f23812a;

    /* renamed from: b */
    private int f23813b;

    /* renamed from: c */
    private int f23814c;

    /* renamed from: d */
    private int f23815d;

    /* renamed from: e */
    private int f23816e;

    /* renamed from: f */
    private boolean f23817f = true;

    /* renamed from: g */
    private boolean f23818g = true;

    public C8425d(View view) {
        this.f23812a = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30877a() {
        View view = this.f23812a;
        C5071v.m9189e(view, this.f23815d - (view.getTop() - this.f23813b));
        View view2 = this.f23812a;
        C5071v.m9187d(view2, this.f23816e - (view2.getLeft() - this.f23814c));
    }

    /* renamed from: b */
    public boolean mo30880b(int i) {
        if (!this.f23817f || this.f23815d == i) {
            return false;
        }
        this.f23815d = i;
        mo30877a();
        return true;
    }

    /* renamed from: c */
    public int mo30881c() {
        return this.f23815d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo30882d() {
        this.f23813b = this.f23812a.getTop();
        this.f23814c = this.f23812a.getLeft();
    }

    /* renamed from: a */
    public boolean mo30878a(int i) {
        if (!this.f23818g || this.f23816e == i) {
            return false;
        }
        this.f23816e = i;
        mo30877a();
        return true;
    }

    /* renamed from: b */
    public int mo30879b() {
        return this.f23813b;
    }
}
