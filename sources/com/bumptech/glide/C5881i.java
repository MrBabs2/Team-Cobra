package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bumptech.glide.load.engine.C5963j;
import com.bumptech.glide.load.p152o.p157g.C6209c;
import com.bumptech.glide.p159m.C6232c;
import com.bumptech.glide.p159m.C6234d;
import com.bumptech.glide.p159m.C6239h;
import com.bumptech.glide.p159m.C6240i;
import com.bumptech.glide.p159m.C6247m;
import com.bumptech.glide.p159m.C6248n;
import com.bumptech.glide.p159m.C6251p;
import com.bumptech.glide.p162p.C6265a;
import com.bumptech.glide.p162p.C6268d;
import com.bumptech.glide.p162p.C6272g;
import com.bumptech.glide.p162p.C6273h;
import com.bumptech.glide.p162p.p163l.C6287i;
import com.bumptech.glide.p162p.p163l.C6288j;
import com.bumptech.glide.p162p.p164m.C6296d;
import com.bumptech.glide.p166r.C6316k;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bumptech.glide.i */
/* compiled from: RequestManager */
public class C5881i implements C6240i {

    /* renamed from: q */
    private static final C6273h f10669q;

    /* renamed from: f */
    protected final C5874c f10670f;

    /* renamed from: g */
    protected final Context f10671g;

    /* renamed from: h */
    final C6239h f10672h;

    /* renamed from: i */
    private final C6248n f10673i;

    /* renamed from: j */
    private final C6247m f10674j;

    /* renamed from: k */
    private final C6251p f10675k;

    /* renamed from: l */
    private final Runnable f10676l;

    /* renamed from: m */
    private final Handler f10677m;

    /* renamed from: n */
    private final C6232c f10678n;

    /* renamed from: o */
    private final CopyOnWriteArrayList<C6272g<Object>> f10679o;

    /* renamed from: p */
    private C6273h f10680p;

    /* renamed from: com.bumptech.glide.i$a */
    /* compiled from: RequestManager */
    class C5882a implements Runnable {
        C5882a() {
        }

        public void run() {
            C5881i iVar = C5881i.this;
            iVar.f10672h.mo20558a(iVar);
        }
    }

    /* renamed from: com.bumptech.glide.i$b */
    /* compiled from: RequestManager */
    private static class C5883b extends C6288j<View, Object> {
        C5883b(View view) {
            super(view);
        }

        public void onResourceReady(Object obj, C6296d<? super Object> dVar) {
        }
    }

    /* renamed from: com.bumptech.glide.i$c */
    /* compiled from: RequestManager */
    private class C5884c implements C6232c.C6233a {

        /* renamed from: a */
        private final C6248n f10682a;

        C5884c(C6248n nVar) {
            this.f10682a = nVar;
        }

        /* renamed from: a */
        public void mo20016a(boolean z) {
            if (z) {
                synchronized (C5881i.this) {
                    this.f10682a.mo20589c();
                }
            }
        }
    }

    static {
        C6273h b = C6273h.m12847b((Class<?>) Bitmap.class);
        b.mo20633K();
        f10669q = b;
        C6273h b2 = C6273h.m12847b((Class<?>) C6209c.class);
        b2.mo20633K();
        C6273h hVar = b2;
        C6273h hVar2 = (C6273h) ((C6273h) C6273h.m12845b(C5963j.f10939b).mo20641a(C5878g.LOW)).mo20652a(true);
    }

    public C5881i(C5874c cVar, C6239h hVar, C6247m mVar, Context context) {
        this(cVar, hVar, mVar, new C6248n(), cVar.mo19959d(), context);
    }

    /* renamed from: c */
    private void m11541c(C6287i<?> iVar) {
        if (!mo20006b(iVar) && !this.f10670f.mo19955a(iVar) && iVar.getRequest() != null) {
            C6268d request = iVar.getRequest();
            iVar.setRequest((C6268d) null);
            request.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo20001a(C6273h hVar) {
        C6273h hVar2 = (C6273h) hVar.clone();
        hVar2.mo20654b();
        this.f10680p = hVar2;
    }

    /* renamed from: b */
    public C5879h<Drawable> mo20004b() {
        return mo19997a(Drawable.class);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized C6273h mo20008d() {
        return this.f10680p;
    }

    /* renamed from: e */
    public synchronized void mo20009e() {
        this.f10673i.mo20587b();
    }

    /* renamed from: f */
    public synchronized void mo20010f() {
        this.f10673i.mo20590d();
    }

    public synchronized void onDestroy() {
        this.f10675k.onDestroy();
        for (C6287i<?> a : this.f10675k.mo20600b()) {
            mo20002a(a);
        }
        this.f10675k.mo20598a();
        this.f10673i.mo20585a();
        this.f10672h.mo20560b(this);
        this.f10672h.mo20560b(this.f10678n);
        this.f10677m.removeCallbacks(this.f10676l);
        this.f10670f.mo19957b(this);
    }

    public synchronized void onStart() {
        mo20010f();
        this.f10675k.onStart();
    }

    public synchronized void onStop() {
        mo20009e();
        this.f10675k.onStop();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f10673i + ", treeNode=" + this.f10674j + "}";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized boolean mo20006b(C6287i<?> iVar) {
        C6268d request = iVar.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.f10673i.mo20586a(request)) {
            return false;
        }
        this.f10675k.mo20601b(iVar);
        iVar.setRequest((C6268d) null);
        return true;
    }

    /* renamed from: a */
    public C5879h<Bitmap> mo19995a() {
        return mo19997a(Bitmap.class).m11535a((C6265a<?>) f10669q);
    }

    C5881i(C5874c cVar, C6239h hVar, C6247m mVar, C6248n nVar, C6234d dVar, Context context) {
        this.f10675k = new C6251p();
        this.f10676l = new C5882a();
        this.f10677m = new Handler(Looper.getMainLooper());
        this.f10670f = cVar;
        this.f10672h = hVar;
        this.f10674j = mVar;
        this.f10673i = nVar;
        this.f10671g = context;
        this.f10678n = dVar.mo20562a(context.getApplicationContext(), new C5884c(nVar));
        if (C6316k.m13001c()) {
            this.f10677m.post(this.f10676l);
        } else {
            hVar.mo20558a(this);
        }
        hVar.mo20558a(this.f10678n);
        this.f10679o = new CopyOnWriteArrayList<>(cVar.mo19961f().mo19975b());
        mo20001a(cVar.mo19961f().mo19976c());
        cVar.mo19954a(this);
    }

    /* renamed from: a */
    public C5879h<Drawable> mo19999a(String str) {
        C5879h<Drawable> b = mo20004b();
        b.mo19988a(str);
        return b;
    }

    /* renamed from: a */
    public C5879h<Drawable> mo19996a(Uri uri) {
        C5879h<Drawable> b = mo20004b();
        b.mo19982a(uri);
        return b;
    }

    /* renamed from: a */
    public C5879h<Drawable> mo19998a(Integer num) {
        return mo20004b().mo19986a(num);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List<C6272g<Object>> mo20007c() {
        return this.f10679o;
    }

    /* renamed from: a */
    public <ResourceType> C5879h<ResourceType> mo19997a(Class<ResourceType> cls) {
        return new C5879h<>(this.f10670f, this, cls, this.f10671g);
    }

    /* renamed from: a */
    public void mo20000a(View view) {
        mo20002a((C6287i<?>) new C5883b(view));
    }

    /* renamed from: a */
    public synchronized void mo20002a(C6287i<?> iVar) {
        if (iVar != null) {
            m11541c(iVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public <T> C5885j<?, T> mo20005b(Class<T> cls) {
        return this.f10670f.mo19961f().mo19972a(cls);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo20003a(C6287i<?> iVar, C6268d dVar) {
        this.f10675k.mo20599a(iVar);
        this.f10673i.mo20588b(dVar);
    }
}
