package kotlinx.coroutines.p395i2;

import kotlin.C4789l;
import kotlin.p042a0.C9064d;
import kotlin.p042a0.C9069g;
import kotlin.p042a0.C9075h;
import kotlin.p215c0.p216c.C9117p;
import kotlinx.coroutines.C12191d0;
import kotlinx.coroutines.C12192d1;
import kotlinx.coroutines.C12204g0;
import kotlinx.coroutines.C12277k1;
import kotlinx.coroutines.C12321x;
import p120q.p326a.C11496w;
import p120q.p326a.C11497x;
import p120q.p326a.C11499z;
import p120q.p326a.p328c0.C10852f;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aQ\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\u0002\b\nø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001aY\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\u0002\b\nH\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001aW\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, mo16641d2 = {"rxSingle", "Lio/reactivex/Single;", "T", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Single;", "rxSingleInternal", "scope", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Single;", "kotlinx-coroutines-rx2"}, mo16642k = 2, mo16643mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.i2.d */
/* compiled from: RxSingle.kt */
public final class C12253d {

    /* renamed from: kotlinx.coroutines.i2.d$a */
    /* compiled from: RxSingle.kt */
    static final class C12254a<T> implements C11499z<T> {

        /* renamed from: a */
        final /* synthetic */ C12191d0 f32032a;

        /* renamed from: b */
        final /* synthetic */ C9069g f32033b;

        /* renamed from: c */
        final /* synthetic */ C9117p f32034c;

        C12254a(C12191d0 d0Var, C9069g gVar, C9117p pVar) {
            this.f32032a = d0Var;
            this.f32033b = gVar;
            this.f32034c = pVar;
        }

        /* renamed from: a */
        public final void mo4441a(C11497x<T> xVar) {
            C12252c cVar = new C12252c(C12321x.m40653a(this.f32032a, this.f32033b), xVar);
            xVar.mo37081a((C10852f) new C12250a(cVar));
            cVar.mo38812a(C12204g0.DEFAULT, cVar, this.f32034c);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ C11496w m40405a(C9069g gVar, C9117p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C9075h.f25654f;
        }
        return m40404a(gVar, pVar);
    }

    /* renamed from: a */
    public static final <T> C11496w<T> m40404a(C9069g gVar, C9117p<? super C12191d0, ? super C9064d<? super T>, ? extends Object> pVar) {
        if (gVar.get(C12277k1.f32093e) == null) {
            return m40406a(C12192d1.f31958f, gVar, pVar);
        }
        throw new IllegalArgumentException(("Single context cannot contain job in it." + "Its lifecycle should be managed via Disposable handle. Had " + gVar).toString());
    }

    /* renamed from: a */
    private static final <T> C11496w<T> m40406a(C12191d0 d0Var, C9069g gVar, C9117p<? super C12191d0, ? super C9064d<? super T>, ? extends Object> pVar) {
        return C11496w.m37608a(new C12254a(d0Var, gVar, pVar));
    }
}
