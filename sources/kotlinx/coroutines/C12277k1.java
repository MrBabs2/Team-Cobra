package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.p042a0.C9069g;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p215c0.p216c.C9117p;
import kotlinx.coroutines.CoroutineExceptionHandler;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 (2\u00020\u0001:\u0001(J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H'J\b\u0010\u0013\u001a\u00020\u0014H\u0017J\u0014\u0010\u0013\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H'J\u001a\u0010\u0013\u001a\u00020\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018H&J\f\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H'JE\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072'\u0010\u001e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00140\u001fj\u0002`\"H'J1\u0010\u001a\u001a\u00020\u001b2'\u0010\u001e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00140\u001fj\u0002`\"H&J\u0011\u0010#\u001a\u00020\u0014H¦@ø\u0001\u0000¢\u0006\u0002\u0010$J\u0011\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0002J\b\u0010'\u001a\u00020\u0007H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0012\u0010\t\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, mo16641d2 = {"Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/CoroutineContext$Element;", "children", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "isActive", "", "()Z", "isCancelled", "isCompleted", "onJoin", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "attachChild", "Lkotlinx/coroutines/ChildHandle;", "child", "Lkotlinx/coroutines/ChildJob;", "cancel", "", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "getCancellationException", "invokeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "onCancelling", "invokeImmediately", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "join", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "plus", "other", "start", "Key", "kotlinx-coroutines-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.k1 */
/* compiled from: Job.kt */
public interface C12277k1 extends C9069g.C9072b {

    /* renamed from: e */
    public static final C12279b f32093e = C12279b.f32094a;

    /* renamed from: kotlinx.coroutines.k1$b */
    /* compiled from: Job.kt */
    public static final class C12279b implements C9069g.C9074c<C12277k1> {

        /* renamed from: a */
        static final /* synthetic */ C12279b f32094a = new C12279b();

        static {
            CoroutineExceptionHandler.C12173a aVar = CoroutineExceptionHandler.f31941d;
        }

        private C12279b() {
        }
    }

    /* renamed from: a */
    C12283m mo38980a(C12289o oVar);

    /* renamed from: a */
    C12313u0 mo38981a(boolean z, boolean z2, C9113l<? super Throwable, C10483v> lVar);

    /* renamed from: a */
    void mo38982a(CancellationException cancellationException);

    /* renamed from: b */
    boolean mo38813b();

    /* synthetic */ void cancel();

    /* renamed from: d */
    CancellationException mo38984d();

    boolean start();

    /* renamed from: kotlinx.coroutines.k1$a */
    /* compiled from: Job.kt */
    public static final class C12278a {
        /* renamed from: a */
        public static <R> R m40492a(C12277k1 k1Var, R r, C9117p<? super R, ? super C9069g.C9072b, ? extends R> pVar) {
            return C9069g.C9072b.C9073a.m29776a(k1Var, r, pVar);
        }

        /* renamed from: a */
        public static <E extends C9069g.C9072b> E m40493a(C12277k1 k1Var, C9069g.C9074c<E> cVar) {
            return C9069g.C9072b.C9073a.m29777a((C9069g.C9072b) k1Var, cVar);
        }

        /* renamed from: a */
        public static C9069g m40494a(C12277k1 k1Var, C9069g gVar) {
            return C9069g.C9072b.C9073a.m29778a((C9069g.C9072b) k1Var, gVar);
        }

        /* renamed from: a */
        public static /* synthetic */ void m40497a(C12277k1 k1Var, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                k1Var.mo38982a(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static C9069g m40498b(C12277k1 k1Var, C9069g.C9074c<?> cVar) {
            return C9069g.C9072b.C9073a.m29779b(k1Var, cVar);
        }

        /* renamed from: a */
        public static /* synthetic */ C12313u0 m40495a(C12277k1 k1Var, boolean z, boolean z2, C9113l lVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return k1Var.mo38981a(z, z2, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }
    }
}
