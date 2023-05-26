package kotlin.p042a0;

import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9069g;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ(\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0002¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\bH&J\u0014\u0010\u000b\u001a\u00020\f2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¨\u0006\u0010"}, mo16641d2 = {"Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlin/coroutines/CoroutineContext$Element;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "interceptContinuation", "Lkotlin/coroutines/Continuation;", "T", "continuation", "minusKey", "Lkotlin/coroutines/CoroutineContext;", "releaseInterceptedContinuation", "", "Key", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlin.a0.e */
/* compiled from: ContinuationInterceptor.kt */
public interface C9065e extends C9069g.C9072b {

    /* renamed from: b */
    public static final C9067b f25651b = C9067b.f25652a;

    /* renamed from: kotlin.a0.e$a */
    /* compiled from: ContinuationInterceptor.kt */
    public static final class C9066a {
        /* renamed from: a */
        public static <E extends C9069g.C9072b> E m29771a(C9065e eVar, C9069g.C9074c<E> cVar) {
            C10202j.m34178b(cVar, RoomNotification.KEY);
            if (cVar instanceof C9058b) {
                C9058b bVar = (C9058b) cVar;
                if (!bVar.mo33446a(eVar.getKey())) {
                    return null;
                }
                E a = bVar.mo33445a((C9069g.C9072b) eVar);
                if (!(a instanceof C9069g.C9072b)) {
                    return null;
                }
                return a;
            } else if (C9065e.f25651b != cVar) {
                return null;
            } else {
                if (eVar != null) {
                    return eVar;
                }
                throw new TypeCastException("null cannot be cast to non-null type E");
            }
        }

        /* renamed from: b */
        public static C9069g m29772b(C9065e eVar, C9069g.C9074c<?> cVar) {
            C10202j.m34178b(cVar, RoomNotification.KEY);
            if (!(cVar instanceof C9058b)) {
                return C9065e.f25651b == cVar ? C9075h.f25654f : eVar;
            }
            C9058b bVar = (C9058b) cVar;
            return (!bVar.mo33446a(eVar.getKey()) || bVar.mo33445a((C9069g.C9072b) eVar) == null) ? eVar : C9075h.f25654f;
        }
    }

    /* renamed from: kotlin.a0.e$b */
    /* compiled from: ContinuationInterceptor.kt */
    public static final class C9067b implements C9069g.C9074c<C9065e> {

        /* renamed from: a */
        static final /* synthetic */ C9067b f25652a = new C9067b();

        private C9067b() {
        }
    }

    /* renamed from: a */
    void mo33454a(C9064d<?> dVar);

    /* renamed from: b */
    <T> C9064d<T> mo33455b(C9064d<? super T> dVar);
}
