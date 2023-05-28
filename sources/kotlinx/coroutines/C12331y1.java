package kotlinx.coroutines;

import kotlin.C4789l;
import kotlin.p042a0.C9069g;
import kotlin.p215c0.p216c.C9117p;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, mo16641d2 = {"Lkotlinx/coroutines/ThreadContextElement;", "S", "Lkotlin/coroutines/CoroutineContext$Element;", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "updateThreadContext", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.y1 */
/* compiled from: ThreadContextElement.kt */
public interface C12331y1<S> extends C9069g.C9072b {

    /* renamed from: kotlinx.coroutines.y1$a */
    /* compiled from: ThreadContextElement.kt */
    public static final class C12332a {
        /* renamed from: a */
        public static <S, R> R m40696a(C12331y1<S> y1Var, R r, C9117p<? super R, ? super C9069g.C9072b, ? extends R> pVar) {
            return C9069g.C9072b.C9073a.m29776a(y1Var, r, pVar);
        }

        /* renamed from: a */
        public static <S, E extends C9069g.C9072b> E m40697a(C12331y1<S> y1Var, C9069g.C9074c<E> cVar) {
            return C9069g.C9072b.C9073a.m29777a((C9069g.C9072b) y1Var, cVar);
        }

        /* renamed from: a */
        public static <S> C9069g m40698a(C12331y1<S> y1Var, C9069g gVar) {
            return C9069g.C9072b.C9073a.m29778a((C9069g.C9072b) y1Var, gVar);
        }

        /* renamed from: b */
        public static <S> C9069g m40699b(C12331y1<S> y1Var, C9069g.C9074c<?> cVar) {
            return C9069g.C9072b.C9073a.m29779b(y1Var, cVar);
        }
    }

    /* renamed from: a */
    S mo38832a(C9069g gVar);

    /* renamed from: a */
    void mo38833a(C9069g gVar, S s);
}
