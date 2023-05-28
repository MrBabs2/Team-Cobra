package kotlin.p042a0.p211i;

import kotlin.C10225p;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10187b0;
import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9064d;
import kotlin.p042a0.C9069g;
import kotlin.p042a0.C9075h;
import kotlin.p042a0.p043j.p044a.C9082a;
import kotlin.p042a0.p043j.p044a.C9084c;
import kotlin.p042a0.p043j.p044a.C9087g;
import kotlin.p042a0.p043j.p044a.C9090i;
import kotlin.p215c0.p216c.C9117p;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aF\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00012\u001c\b\u0004\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\b¢\u0006\u0002\b\b\u001aD\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a]\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0003*#\b\u0001\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u0002H\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007\u001aA\u0010\u0011\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0003*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\bø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001aZ\u0010\u0011\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0003*#\b\u0001\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u0002H\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, mo16641d2 = {"createCoroutineFromSuspendFunction", "Lkotlin/coroutines/Continuation;", "", "T", "completion", "block", "Lkotlin/Function1;", "", "createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt", "createCoroutineUnintercepted", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "intercepted", "startCoroutineUninterceptedOrReturn", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, mo16642k = 5, mo16643mv = {1, 1, 16}, mo16645xi = 1, mo16646xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
/* renamed from: kotlin.a0.i.c */
/* compiled from: IntrinsicsJvm.kt */
class C9078c {

    /* renamed from: kotlin.a0.i.c$a */
    /* compiled from: IntrinsicsJvm.kt */
    public static final class C9079a extends C9090i {

        /* renamed from: f */
        private int f25657f;

        /* renamed from: g */
        final /* synthetic */ C9117p f25658g;

        /* renamed from: h */
        final /* synthetic */ Object f25659h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9079a(C9064d dVar, C9064d dVar2, C9117p pVar, Object obj) {
            super(dVar2);
            this.f25658g = pVar;
            this.f25659h = obj;
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i = this.f25657f;
            if (i == 0) {
                this.f25657f = 1;
                C10225p.m34214a(obj);
                C9117p pVar = this.f25658g;
                if (pVar != null) {
                    C10187b0.m34140a((Object) pVar, 2);
                    return pVar.invoke(this.f25659h, this);
                }
                throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } else if (i == 1) {
                this.f25657f = 2;
                C10225p.m34214a(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: kotlin.a0.i.c$b */
    /* compiled from: IntrinsicsJvm.kt */
    public static final class C9080b extends C9084c {

        /* renamed from: f */
        private int f25660f;

        /* renamed from: g */
        final /* synthetic */ C9117p f25661g;

        /* renamed from: h */
        final /* synthetic */ Object f25662h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9080b(C9064d dVar, C9069g gVar, C9064d dVar2, C9069g gVar2, C9117p pVar, Object obj) {
            super(dVar2, gVar2);
            this.f25661g = pVar;
            this.f25662h = obj;
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i = this.f25660f;
            if (i == 0) {
                this.f25660f = 1;
                C10225p.m34214a(obj);
                C9117p pVar = this.f25661g;
                if (pVar != null) {
                    C10187b0.m34140a((Object) pVar, 2);
                    return pVar.invoke(this.f25662h, this);
                }
                throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } else if (i == 1) {
                this.f25660f = 2;
                C10225p.m34214a(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: a */
    public static <R, T> C9064d<C10483v> m29784a(C9117p<? super R, ? super C9064d<? super T>, ? extends Object> pVar, R r, C9064d<? super T> dVar) {
        C10202j.m34178b(pVar, "$this$createCoroutineUnintercepted");
        C10202j.m34178b(dVar, "completion");
        C9087g.m29790a(dVar);
        if (pVar instanceof C9082a) {
            return ((C9082a) pVar).create(r, dVar);
        }
        C9069g context = dVar.getContext();
        if (context == C9075h.f25654f) {
            if (dVar != null) {
                return new C9079a(dVar, dVar, pVar, r);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        } else if (dVar != null) {
            return new C9080b(dVar, context, dVar, context, pVar, r);
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }
    }

    /* renamed from: a */
    public static <T> C9064d<T> m29783a(C9064d<? super T> dVar) {
        C9064d<Object> intercepted;
        C10202j.m34178b(dVar, "$this$intercepted");
        C9084c cVar = (C9084c) (!(dVar instanceof C9084c) ? null : dVar);
        return (cVar == null || (intercepted = cVar.intercepted()) == null) ? dVar : intercepted;
    }
}
