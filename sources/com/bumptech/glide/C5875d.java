package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.load.engine.C5969k;
import com.bumptech.glide.load.engine.p144a0.C5913a;
import com.bumptech.glide.load.engine.p144a0.C5923f;
import com.bumptech.glide.load.engine.p144a0.C5925g;
import com.bumptech.glide.load.engine.p144a0.C5926h;
import com.bumptech.glide.load.engine.p144a0.C5928i;
import com.bumptech.glide.load.engine.p145b0.C5936a;
import com.bumptech.glide.load.engine.p147z.C5999b;
import com.bumptech.glide.load.engine.p147z.C6004e;
import com.bumptech.glide.load.engine.p147z.C6005f;
import com.bumptech.glide.load.engine.p147z.C6010j;
import com.bumptech.glide.load.engine.p147z.C6013k;
import com.bumptech.glide.p159m.C6234d;
import com.bumptech.glide.p159m.C6237f;
import com.bumptech.glide.p159m.C6244l;
import com.bumptech.glide.p162p.C6272g;
import com.bumptech.glide.p162p.C6273h;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p050l.p066e.C4868a;

/* renamed from: com.bumptech.glide.d */
/* compiled from: GlideBuilder */
public final class C5875d {

    /* renamed from: a */
    private final Map<Class<?>, C5885j<?, ?>> f10618a = new C4868a();

    /* renamed from: b */
    private C5969k f10619b;

    /* renamed from: c */
    private C6004e f10620c;

    /* renamed from: d */
    private C5999b f10621d;

    /* renamed from: e */
    private C5926h f10622e;

    /* renamed from: f */
    private C5936a f10623f;

    /* renamed from: g */
    private C5936a f10624g;

    /* renamed from: h */
    private C5913a.C5914a f10625h;

    /* renamed from: i */
    private C5928i f10626i;

    /* renamed from: j */
    private C6234d f10627j;

    /* renamed from: k */
    private int f10628k = 4;

    /* renamed from: l */
    private C6273h f10629l = new C6273h();

    /* renamed from: m */
    private C6244l.C6246b f10630m;

    /* renamed from: n */
    private C5936a f10631n;

    /* renamed from: o */
    private boolean f10632o;

    /* renamed from: p */
    private List<C6272g<Object>> f10633p;

    /* renamed from: q */
    private boolean f10634q;

    /* renamed from: a */
    public C5875d mo19969a(C6004e eVar) {
        this.f10620c = eVar;
        return this;
    }

    /* renamed from: a */
    public C5875d mo19968a(C5926h hVar) {
        this.f10622e = hVar;
        return this;
    }

    /* renamed from: a */
    public C5875d mo19970a(C6273h hVar) {
        this.f10629l = hVar;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo19971a(C6244l.C6246b bVar) {
        this.f10630m = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5874c mo19967a(Context context) {
        if (this.f10623f == null) {
            this.f10623f = C5936a.m11749d();
        }
        if (this.f10624g == null) {
            this.f10624g = C5936a.m11748c();
        }
        if (this.f10631n == null) {
            this.f10631n = C5936a.m11746b();
        }
        if (this.f10626i == null) {
            this.f10626i = new C5928i.C5929a(context).mo20116a();
        }
        if (this.f10627j == null) {
            this.f10627j = new C6237f();
        }
        if (this.f10620c == null) {
            int b = this.f10626i.mo20114b();
            if (b > 0) {
                this.f10620c = new C6013k((long) b);
            } else {
                this.f10620c = new C6005f();
            }
        }
        if (this.f10621d == null) {
            this.f10621d = new C6010j(this.f10626i.mo20113a());
        }
        if (this.f10622e == null) {
            this.f10622e = new C5925g((long) this.f10626i.mo20115c());
        }
        if (this.f10625h == null) {
            this.f10625h = new C5923f(context);
        }
        if (this.f10619b == null) {
            this.f10619b = new C5969k(this.f10622e, this.f10625h, this.f10624g, this.f10623f, C5936a.m11750e(), C5936a.m11746b(), this.f10632o);
        }
        List<C6272g<Object>> list = this.f10633p;
        if (list == null) {
            this.f10633p = Collections.emptyList();
        } else {
            this.f10633p = Collections.unmodifiableList(list);
        }
        C6244l lVar = new C6244l(this.f10630m);
        C5969k kVar = this.f10619b;
        C5926h hVar = this.f10622e;
        C6004e eVar = this.f10620c;
        C5999b bVar = this.f10621d;
        C6234d dVar = this.f10627j;
        int i = this.f10628k;
        C6273h hVar2 = this.f10629l;
        hVar2.mo20633K();
        return new C5874c(context, kVar, hVar, eVar, bVar, lVar, dVar, i, hVar2, this.f10618a, this.f10633p, this.f10634q);
    }
}
