package com.google.android.gms.internal.ads;

import java.io.IOException;

public abstract class zzks implements zzlo, zzlp {

    /* renamed from: a */
    private final int f22155a;

    /* renamed from: b */
    private zzlq f22156b;

    /* renamed from: c */
    private int f22157c;

    /* renamed from: d */
    private int f22158d;

    /* renamed from: e */
    private zzqw f22159e;

    /* renamed from: f */
    private long f22160f;

    /* renamed from: g */
    private boolean f22161g = true;

    /* renamed from: h */
    private boolean f22162h;

    public zzks(int i) {
        this.f22155a = i;
    }

    /* renamed from: a */
    public int mo29432a() throws zzku {
        return 0;
    }

    /* renamed from: a */
    public final void mo29434a(int i) {
        this.f22157c = i;
    }

    /* renamed from: a */
    public void mo29435a(int i, Object obj) throws zzku {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29437a(long j, boolean z) throws zzku {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29439a(boolean z) throws zzku {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29440a(zzlh[] zzlhArr, long j) throws zzku {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo29442b(long j) {
        this.f22159e.mo25953a(j - this.f22160f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo29443d() {
        return this.f22157c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo29444e() throws zzku {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo29445f() throws zzku {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo29446g() {
    }

    public final int getState() {
        return this.f22158d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final zzlq mo29448h() {
        return this.f22156b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo29449i() {
        return this.f22161g ? this.f22162h : this.f22159e.mo25954m();
    }

    /* renamed from: o */
    public final int mo29450o() {
        return this.f22155a;
    }

    /* renamed from: p */
    public final zzlp mo29451p() {
        return this;
    }

    /* renamed from: q */
    public zzso mo29452q() {
        return null;
    }

    /* renamed from: r */
    public final void mo29453r() throws IOException {
        this.f22159e.mo25952a();
    }

    /* renamed from: s */
    public final void mo29454s() {
        this.f22162h = true;
    }

    public final void start() throws zzku {
        boolean z = true;
        if (this.f22158d != 1) {
            z = false;
        }
        zzsk.m25218b(z);
        this.f22158d = 2;
        mo29444e();
    }

    public final void stop() throws zzku {
        zzsk.m25218b(this.f22158d == 2);
        this.f22158d = 1;
        mo29445f();
    }

    /* renamed from: t */
    public final boolean mo29457t() {
        return this.f22162h;
    }

    /* renamed from: u */
    public final void mo29458u() {
        boolean z = true;
        if (this.f22158d != 1) {
            z = false;
        }
        zzsk.m25218b(z);
        this.f22158d = 0;
        this.f22159e = null;
        this.f22162h = false;
        mo29446g();
    }

    /* renamed from: v */
    public final zzqw mo29459v() {
        return this.f22159e;
    }

    /* renamed from: w */
    public final boolean mo29460w() {
        return this.f22161g;
    }

    /* renamed from: a */
    public final void mo29438a(zzlq zzlq, zzlh[] zzlhArr, zzqw zzqw, long j, boolean z, long j2) throws zzku {
        zzsk.m25218b(this.f22158d == 0);
        this.f22156b = zzlq;
        this.f22158d = 1;
        mo29439a(z);
        mo29441a(zzlhArr, zzqw, j2);
        mo29437a(j, z);
    }

    /* renamed from: a */
    public final void mo29441a(zzlh[] zzlhArr, zzqw zzqw, long j) throws zzku {
        zzsk.m25218b(!this.f22162h);
        this.f22159e = zzqw;
        this.f22161g = false;
        this.f22160f = j;
        mo29440a(zzlhArr, j);
    }

    /* renamed from: a */
    public final void mo29436a(long j) throws zzku {
        this.f22162h = false;
        this.f22161g = false;
        mo29437a(j, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo29433a(zzlj zzlj, zznd zznd, boolean z) {
        int a = this.f22159e.mo25951a(zzlj, zznd, z);
        if (a == -4) {
            if (zznd.mo29544c()) {
                this.f22161g = true;
                if (this.f22162h) {
                    return -4;
                }
                return -3;
            }
            zznd.f22334d += this.f22160f;
        } else if (a == -5) {
            zzlh zzlh = zzlj.f22205a;
            long j = zzlh.f22179B;
            if (j != Long.MAX_VALUE) {
                zzlj.f22205a = zzlh.mo29469a(j + this.f22160f);
            }
        }
        return a;
    }
}
