package kotlin.p042a0;

import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p215c0.p216c.C9117p;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J5\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00032\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00030\u0006H&¢\u0006\u0002\u0010\bJ(\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH¦\u0002¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u00020\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH&J\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0002¨\u0006\u0013"}, mo16641d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "plus", "context", "Element", "Key", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlin.a0.g */
/* compiled from: CoroutineContext.kt */
public interface C9069g {

    /* renamed from: kotlin.a0.g$a */
    /* compiled from: CoroutineContext.kt */
    public static final class C9070a {

        /* renamed from: kotlin.a0.g$a$a */
        /* compiled from: CoroutineContext.kt */
        static final class C9071a extends C10203k implements C9117p<C9069g, C9072b, C9069g> {

            /* renamed from: f */
            public static final C9071a f25653f = new C9071a();

            C9071a() {
                super(2);
            }

            /* renamed from: a */
            public final C9069g invoke(C9069g gVar, C9072b bVar) {
                C10202j.m34178b(gVar, "acc");
                C10202j.m34178b(bVar, "element");
                C9069g minusKey = gVar.minusKey(bVar.getKey());
                if (minusKey == C9075h.f25654f) {
                    return bVar;
                }
                C9065e eVar = (C9065e) minusKey.get(C9065e.f25651b);
                if (eVar == null) {
                    return new C9059c(minusKey, bVar);
                }
                C9069g minusKey2 = minusKey.minusKey(C9065e.f25651b);
                if (minusKey2 == C9075h.f25654f) {
                    return new C9059c(bVar, eVar);
                }
                return new C9059c(new C9059c(minusKey2, bVar), eVar);
            }
        }

        /* renamed from: a */
        public static C9069g m29774a(C9069g gVar, C9069g gVar2) {
            C10202j.m34178b(gVar2, "context");
            return gVar2 == C9075h.f25654f ? gVar : (C9069g) gVar2.fold(gVar, C9071a.f25653f);
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J5\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u0002H\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\u00070\nH\u0016¢\u0006\u0002\u0010\u000bJ(\u0010\f\u001a\u0004\u0018\u0001H\r\"\b\b\u0000\u0010\r*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\r0\u0003H\u0002¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016R\u0016\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, mo16641d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: kotlin.a0.g$b */
    /* compiled from: CoroutineContext.kt */
    public interface C9072b extends C9069g {

        /* renamed from: kotlin.a0.g$b$a */
        /* compiled from: CoroutineContext.kt */
        public static final class C9073a {
            /* renamed from: a */
            public static <E extends C9072b> E m29777a(C9072b bVar, C9074c<E> cVar) {
                C10202j.m34178b(cVar, RoomNotification.KEY);
                if (!C10202j.m34176a((Object) bVar.getKey(), (Object) cVar)) {
                    return null;
                }
                if (bVar != null) {
                    return bVar;
                }
                throw new TypeCastException("null cannot be cast to non-null type E");
            }

            /* renamed from: a */
            public static C9069g m29778a(C9072b bVar, C9069g gVar) {
                C10202j.m34178b(gVar, "context");
                return C9070a.m29774a(bVar, gVar);
            }

            /* renamed from: b */
            public static C9069g m29779b(C9072b bVar, C9074c<?> cVar) {
                C10202j.m34178b(cVar, RoomNotification.KEY);
                return C10202j.m34176a((Object) bVar.getKey(), (Object) cVar) ? C9075h.f25654f : bVar;
            }

            /* renamed from: a */
            public static <R> R m29776a(C9072b bVar, R r, C9117p<? super R, ? super C9072b, ? extends R> pVar) {
                C10202j.m34178b(pVar, "operation");
                return pVar.invoke(r, bVar);
            }
        }

        <E extends C9072b> E get(C9074c<E> cVar);

        C9074c<?> getKey();
    }

    /* renamed from: kotlin.a0.g$c */
    /* compiled from: CoroutineContext.kt */
    public interface C9074c<E extends C9072b> {
    }

    <R> R fold(R r, C9117p<? super R, ? super C9072b, ? extends R> pVar);

    <E extends C9072b> E get(C9074c<E> cVar);

    C9069g minusKey(C9074c<?> cVar);

    C9069g plus(C9069g gVar);
}
