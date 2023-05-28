package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@zzard
public final class zzawj {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Clock f18572a;

    /* renamed from: b */
    private final zzawu f18573b;

    /* renamed from: c */
    private final LinkedList<C8015u4> f18574c;

    /* renamed from: d */
    private final Object f18575d = new Object();

    /* renamed from: e */
    private final String f18576e;

    /* renamed from: f */
    private final String f18577f;

    /* renamed from: g */
    private long f18578g = -1;

    /* renamed from: h */
    private long f18579h = -1;

    /* renamed from: i */
    private long f18580i = -1;

    /* renamed from: j */
    private long f18581j = 0;

    /* renamed from: k */
    private long f18582k = -1;

    /* renamed from: l */
    private long f18583l = -1;

    zzawj(Clock clock, zzawu zzawu, String str, String str2) {
        this.f18572a = clock;
        this.f18573b = zzawu;
        this.f18576e = str;
        this.f18577f = str2;
        this.f18574c = new LinkedList<>();
    }

    /* renamed from: a */
    public final void mo27719a(zzxz zzxz) {
        synchronized (this.f18575d) {
            long c = this.f18572a.mo25499c();
            this.f18582k = c;
            this.f18573b.mo27758a(zzxz, c);
        }
    }

    /* renamed from: b */
    public final void mo27721b() {
        synchronized (this.f18575d) {
            if (this.f18583l != -1 && this.f18579h == -1) {
                this.f18579h = this.f18572a.mo25499c();
                this.f18573b.mo27757a(this);
            }
            this.f18573b.mo27756a();
        }
    }

    /* renamed from: c */
    public final void mo27722c() {
        synchronized (this.f18575d) {
            if (this.f18583l != -1) {
                C8015u4 u4Var = new C8015u4(this);
                u4Var.mo26652d();
                this.f18574c.add(u4Var);
                this.f18581j++;
                this.f18573b.mo27760b();
                this.f18573b.mo27757a(this);
            }
        }
    }

    /* renamed from: d */
    public final void mo27723d() {
        synchronized (this.f18575d) {
            if (this.f18583l != -1 && !this.f18574c.isEmpty()) {
                C8015u4 last = this.f18574c.getLast();
                if (last.mo26650b() == -1) {
                    last.mo26651c();
                    this.f18573b.mo27757a(this);
                }
            }
        }
    }

    /* renamed from: e */
    public final String mo27724e() {
        return this.f18576e;
    }

    /* renamed from: a */
    public final void mo27718a(long j) {
        synchronized (this.f18575d) {
            this.f18583l = j;
            if (j != -1) {
                this.f18573b.mo27757a(this);
            }
        }
    }

    /* renamed from: a */
    public final void mo27720a(boolean z) {
        synchronized (this.f18575d) {
            if (this.f18583l != -1) {
                this.f18580i = this.f18572a.mo25499c();
            }
        }
    }

    /* renamed from: a */
    public final Bundle mo27717a() {
        Bundle bundle;
        synchronized (this.f18575d) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f18576e);
            bundle.putString("slotid", this.f18577f);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.f18582k);
            bundle.putLong("tresponse", this.f18583l);
            bundle.putLong("timp", this.f18579h);
            bundle.putLong("tload", this.f18580i);
            bundle.putLong("pcc", this.f18581j);
            bundle.putLong("tfetch", this.f18578g);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f18574c.iterator();
            while (it.hasNext()) {
                arrayList.add(((C8015u4) it.next()).mo26649a());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }
}
