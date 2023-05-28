package kotlinx.coroutines;

import kotlin.p042a0.C9064d;
import kotlin.p042a0.C9069g;
import kotlin.p215c0.p216c.C9117p;

/* renamed from: kotlinx.coroutines.a */
/* compiled from: AbstractCoroutine.kt */
public abstract class C12174a<T> extends C12299q1 implements C12277k1, C9064d<T>, C12191d0 {

    /* renamed from: g */
    private final C9069g f31945g;

    /* renamed from: h */
    protected final C9069g f31946h;

    public C12174a(C9069g gVar, boolean z) {
        super(z);
        this.f31946h = gVar;
        this.f31945g = gVar.plus(this);
    }

    /* renamed from: a */
    public C9069g mo38810a() {
        return this.f31945g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo38811a(Throwable th, boolean z) {
    }

    /* renamed from: b */
    public boolean mo38813b() {
        return super.mo38813b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo38814c() {
        return C12256j0.m40409a((Object) this) + " was cancelled";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo38815d(Object obj) {
        if (obj instanceof C12303r) {
            C12303r rVar = (C12303r) obj;
            mo38811a(rVar.f32123a, rVar.mo39028a());
            return;
        }
        mo38818f(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo38817e(Object obj) {
        mo38900a(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo38818f(T t) {
    }

    public final C9069g getContext() {
        return this.f31945g;
    }

    /* renamed from: k */
    public String mo38819k() {
        String a = C12321x.m40652a(this.f31945g);
        if (a == null) {
            return super.mo38819k();
        }
        return '\"' + a + "\":" + super.mo38819k();
    }

    /* renamed from: m */
    public final void mo38820m() {
        mo38822p();
    }

    /* renamed from: o */
    public final void mo38821o() {
        mo39004a((C12277k1) this.f31946h.get(C12277k1.f32093e));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo38822p() {
    }

    public final void resumeWith(Object obj) {
        Object c = mo39009c(C12306s.m40631a(obj));
        if (c != C12305r1.f32126b) {
            mo38817e(c);
        }
    }

    /* renamed from: a */
    public final <R> void mo38812a(C12204g0 g0Var, R r, C9117p<? super R, ? super C9064d<? super T>, ? extends Object> pVar) {
        mo38821o();
        g0Var.mo38854a(pVar, r, this);
    }

    /* renamed from: d */
    public final void mo38816d(Throwable th) {
        C12175a0.m40204a(this.f31945g, th);
    }
}
