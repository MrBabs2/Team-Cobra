package kotlinx.coroutines;

import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10203k;
import kotlin.p042a0.C9057a;
import kotlin.p042a0.C9058b;
import kotlin.p042a0.C9064d;
import kotlin.p042a0.C9065e;
import kotlin.p042a0.C9069g;
import kotlin.p215c0.p216c.C9113l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH&J\u001c\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0017J \u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\r\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\rJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0011\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000H\u0002J\u0014\u0010\u0014\u001a\u00020\u00052\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\rH\u0017J\b\u0010\u0015\u001a\u00020\u0016H\u0016¨\u0006\u0018"}, mo16641d2 = {"Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/ContinuationInterceptor;", "()V", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatchYield", "interceptContinuation", "Lkotlin/coroutines/Continuation;", "T", "continuation", "isDispatchNeeded", "", "plus", "other", "releaseInterceptedContinuation", "toString", "", "Key", "kotlinx-coroutines-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.y */
/* compiled from: CoroutineDispatcher.kt */
public abstract class C12324y extends C9057a implements C9065e {

    /* renamed from: f */
    public static final C12325a f32145f = new C12325a((DefaultConstructorMarker) null);

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo16641d2 = {"Lkotlinx/coroutines/CoroutineDispatcher$Key;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlinx/coroutines/CoroutineDispatcher;", "()V", "kotlinx-coroutines-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.y$a */
    /* compiled from: CoroutineDispatcher.kt */
    public static final class C12325a extends C9058b<C9065e, C12324y> {

        /* renamed from: kotlinx.coroutines.y$a$a */
        /* compiled from: CoroutineDispatcher.kt */
        static final class C12326a extends C10203k implements C9113l<C9069g.C9072b, C12324y> {

            /* renamed from: f */
            public static final C12326a f32146f = new C12326a();

            C12326a() {
                super(1);
            }

            /* renamed from: a */
            public final C12324y invoke(C9069g.C9072b bVar) {
                if (!(bVar instanceof C12324y)) {
                    bVar = null;
                }
                return (C12324y) bVar;
            }
        }

        public /* synthetic */ C12325a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C12325a() {
            super(C9065e.f25651b, C12326a.f32146f);
        }
    }

    public C12324y() {
        super(C9065e.f25651b);
    }

    /* renamed from: a */
    public void mo33454a(C9064d<?> dVar) {
        if (dVar != null) {
            C12247i<?> c = ((C12290o0) dVar).mo38994c();
            if (c != null) {
                c.mo38933c();
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<*>");
    }

    /* renamed from: a */
    public abstract void mo38845a(C9069g gVar, Runnable runnable);

    /* renamed from: b */
    public final <T> C9064d<T> mo33455b(C9064d<? super T> dVar) {
        return new C12290o0(this, dVar);
    }

    /* renamed from: b */
    public boolean mo38846b(C9069g gVar) {
        return true;
    }

    public <E extends C9069g.C9072b> E get(C9069g.C9074c<E> cVar) {
        return C9065e.C9066a.m29771a(this, cVar);
    }

    public C9069g minusKey(C9069g.C9074c<?> cVar) {
        return C9065e.C9066a.m29772b(this, cVar);
    }

    public String toString() {
        return C12256j0.m40409a((Object) this) + '@' + C12256j0.m40411b(this);
    }
}
