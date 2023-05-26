package com.bumptech.glide.load.p152o.p157g;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C5874c;
import com.bumptech.glide.C5879h;
import com.bumptech.glide.C5881i;
import com.bumptech.glide.load.C6022f;
import com.bumptech.glide.load.C6030l;
import com.bumptech.glide.load.engine.C5963j;
import com.bumptech.glide.load.engine.p147z.C6004e;
import com.bumptech.glide.p143l.C5895a;
import com.bumptech.glide.p162p.C6265a;
import com.bumptech.glide.p162p.C6273h;
import com.bumptech.glide.p162p.p163l.C6285g;
import com.bumptech.glide.p162p.p163l.C6287i;
import com.bumptech.glide.p162p.p164m.C6296d;
import com.bumptech.glide.p165q.C6301c;
import com.bumptech.glide.p166r.C6315j;
import com.bumptech.glide.p166r.C6316k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.o.g.g */
/* compiled from: GifFrameLoader */
class C6214g {

    /* renamed from: a */
    private final C5895a f11348a;

    /* renamed from: b */
    private final Handler f11349b;

    /* renamed from: c */
    private final List<C6216b> f11350c;

    /* renamed from: d */
    final C5881i f11351d;

    /* renamed from: e */
    private final C6004e f11352e;

    /* renamed from: f */
    private boolean f11353f;

    /* renamed from: g */
    private boolean f11354g;

    /* renamed from: h */
    private boolean f11355h;

    /* renamed from: i */
    private C5879h<Bitmap> f11356i;

    /* renamed from: j */
    private C6215a f11357j;

    /* renamed from: k */
    private boolean f11358k;

    /* renamed from: l */
    private C6215a f11359l;

    /* renamed from: m */
    private Bitmap f11360m;

    /* renamed from: n */
    private C6215a f11361n;

    /* renamed from: o */
    private C6218d f11362o;

    /* renamed from: com.bumptech.glide.load.o.g.g$a */
    /* compiled from: GifFrameLoader */
    static class C6215a extends C6285g<Bitmap> {

        /* renamed from: f */
        private final Handler f11363f;

        /* renamed from: g */
        final int f11364g;

        /* renamed from: h */
        private final long f11365h;

        /* renamed from: i */
        private Bitmap f11366i;

        C6215a(Handler handler, int i, long j) {
            this.f11363f = handler;
            this.f11364g = i;
            this.f11365h = j;
        }

        /* renamed from: a */
        public void onResourceReady(Bitmap bitmap, C6296d<? super Bitmap> dVar) {
            this.f11366i = bitmap;
            this.f11363f.sendMessageAtTime(this.f11363f.obtainMessage(1, this), this.f11365h);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Bitmap mo20545b() {
            return this.f11366i;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.g.g$b */
    /* compiled from: GifFrameLoader */
    public interface C6216b {
        /* renamed from: a */
        void mo20507a();
    }

    /* renamed from: com.bumptech.glide.load.o.g.g$c */
    /* compiled from: GifFrameLoader */
    private class C6217c implements Handler.Callback {
        C6217c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C6214g.this.mo20533a((C6215a) message.obj);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                C6214g.this.f11351d.mo20002a((C6287i<?>) (C6215a) message.obj);
                return false;
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.o.g.g$d */
    /* compiled from: GifFrameLoader */
    interface C6218d {
        /* renamed from: a */
        void mo20547a();
    }

    C6214g(C5874c cVar, C5895a aVar, int i, int i2, C6030l<Bitmap> lVar, Bitmap bitmap) {
        this(cVar.mo19958c(), C5874c.m11490e(cVar.mo19960e()), aVar, (Handler) null, m12618a(C5874c.m11490e(cVar.mo19960e()), i, i2), lVar, bitmap);
    }

    /* renamed from: j */
    private static C6022f m12619j() {
        return new C6301c(Double.valueOf(Math.random()));
    }

    /* renamed from: k */
    private int m12620k() {
        return C6316k.m12986a(mo20537c().getWidth(), mo20537c().getHeight(), mo20537c().getConfig());
    }

    /* renamed from: l */
    private void m12621l() {
        if (this.f11353f && !this.f11354g) {
            if (this.f11355h) {
                C6315j.m12982a(this.f11361n == null, "Pending target must be null when starting from the first frame");
                this.f11348a.mo20046f();
                this.f11355h = false;
            }
            C6215a aVar = this.f11361n;
            if (aVar != null) {
                this.f11361n = null;
                mo20533a(aVar);
                return;
            }
            this.f11354g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f11348a.mo20044d());
            this.f11348a.mo20041b();
            this.f11359l = new C6215a(this.f11349b, this.f11348a.mo20047g(), uptimeMillis);
            C5879h<Bitmap> a = this.f11356i.m11535a((C6265a<?>) C6273h.m12846b(m12619j()));
            a.mo19987a((Object) this.f11348a);
            a.mo19989a(this.f11359l);
        }
    }

    /* renamed from: m */
    private void m12622m() {
        Bitmap bitmap = this.f11360m;
        if (bitmap != null) {
            this.f11352e.mo20283a(bitmap);
            this.f11360m = null;
        }
    }

    /* renamed from: n */
    private void m12623n() {
        if (!this.f11353f) {
            this.f11353f = true;
            this.f11358k = false;
            m12621l();
        }
    }

    /* renamed from: o */
    private void m12624o() {
        this.f11353f = false;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.bumptech.glide.load.l, com.bumptech.glide.load.l<android.graphics.Bitmap>, java.lang.Object] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20532a(com.bumptech.glide.load.C6030l<android.graphics.Bitmap> r2, android.graphics.Bitmap r3) {
        /*
            r1 = this;
            com.bumptech.glide.p166r.C6315j.m12978a(r2)
            r0 = r2
            com.bumptech.glide.load.l r0 = (com.bumptech.glide.load.C6030l) r0
            com.bumptech.glide.p166r.C6315j.m12978a(r3)
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            r1.f11360m = r3
            com.bumptech.glide.h<android.graphics.Bitmap> r3 = r1.f11356i
            com.bumptech.glide.p.h r0 = new com.bumptech.glide.p.h
            r0.<init>()
            com.bumptech.glide.p.a r2 = r0.mo20646a((com.bumptech.glide.load.C6030l<android.graphics.Bitmap>) r2)
            com.bumptech.glide.h r2 = r3.m11535a((com.bumptech.glide.p162p.C6265a<?>) r2)
            r1.f11356i = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p152o.p157g.C6214g.mo20532a(com.bumptech.glide.load.l, android.graphics.Bitmap):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo20536b(C6216b bVar) {
        this.f11350c.remove(bVar);
        if (this.f11350c.isEmpty()) {
            m12624o();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Bitmap mo20537c() {
        C6215a aVar = this.f11357j;
        return aVar != null ? aVar.mo20545b() : this.f11360m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo20538d() {
        C6215a aVar = this.f11357j;
        if (aVar != null) {
            return aVar.f11364g;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Bitmap mo20539e() {
        return this.f11360m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo20540f() {
        return this.f11348a.mo20042c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo20541g() {
        return mo20537c().getHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo20542h() {
        return this.f11348a.mo20048h() + m12620k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo20543i() {
        return mo20537c().getWidth();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20534a(C6216b bVar) {
        if (this.f11358k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f11350c.contains(bVar)) {
            boolean isEmpty = this.f11350c.isEmpty();
            this.f11350c.add(bVar);
            if (isEmpty) {
                m12623n();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ByteBuffer mo20535b() {
        return this.f11348a.mo20045e().asReadOnlyBuffer();
    }

    C6214g(C6004e eVar, C5881i iVar, C5895a aVar, Handler handler, C5879h<Bitmap> hVar, C6030l<Bitmap> lVar, Bitmap bitmap) {
        this.f11350c = new ArrayList();
        this.f11351d = iVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new C6217c()) : handler;
        this.f11352e = eVar;
        this.f11349b = handler;
        this.f11356i = hVar;
        this.f11348a = aVar;
        mo20532a(lVar, bitmap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20531a() {
        this.f11350c.clear();
        m12622m();
        m12624o();
        C6215a aVar = this.f11357j;
        if (aVar != null) {
            this.f11351d.mo20002a((C6287i<?>) aVar);
            this.f11357j = null;
        }
        C6215a aVar2 = this.f11359l;
        if (aVar2 != null) {
            this.f11351d.mo20002a((C6287i<?>) aVar2);
            this.f11359l = null;
        }
        C6215a aVar3 = this.f11361n;
        if (aVar3 != null) {
            this.f11351d.mo20002a((C6287i<?>) aVar3);
            this.f11361n = null;
        }
        this.f11348a.clear();
        this.f11358k = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20533a(C6215a aVar) {
        C6218d dVar = this.f11362o;
        if (dVar != null) {
            dVar.mo20547a();
        }
        this.f11354g = false;
        if (this.f11358k) {
            this.f11349b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f11353f) {
            this.f11361n = aVar;
        } else {
            if (aVar.mo20545b() != null) {
                m12622m();
                C6215a aVar2 = this.f11357j;
                this.f11357j = aVar;
                for (int size = this.f11350c.size() - 1; size >= 0; size--) {
                    this.f11350c.get(size).mo20507a();
                }
                if (aVar2 != null) {
                    this.f11349b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            m12621l();
        }
    }

    /* renamed from: a */
    private static C5879h<Bitmap> m12618a(C5881i iVar, int i, int i2) {
        return iVar.mo19995a().m11535a((C6265a<?>) ((C6273h) ((C6273h) C6273h.m12845b(C5963j.f10938a).mo20656b(true)).mo20652a(true)).mo20639a(i, i2));
    }
}
