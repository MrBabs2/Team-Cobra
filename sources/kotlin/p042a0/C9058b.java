package kotlin.p042a0;

import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9069g;
import kotlin.p042a0.C9069g.C9072b;
import kotlin.p215c0.p216c.C9113l;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

/* renamed from: kotlin.a0.b */
/* compiled from: CoroutineContextImpl.kt */
public abstract class C9058b<B extends C9069g.C9072b, E extends B> implements C9069g.C9074c<E> {

    /* renamed from: a */
    private final C9069g.C9074c<?> f25643a;

    /* renamed from: b */
    private final C9113l<C9069g.C9072b, E> f25644b;

    public C9058b(C9069g.C9074c<B> cVar, C9113l<? super C9069g.C9072b, ? extends E> lVar) {
        C10202j.m34178b(cVar, "baseKey");
        C10202j.m34178b(lVar, "safeCast");
        this.f25644b = lVar;
        this.f25643a = cVar instanceof C9058b ? ((C9058b) cVar).f25643a : cVar;
    }

    /* renamed from: a */
    public final E mo33445a(C9069g.C9072b bVar) {
        C10202j.m34178b(bVar, "element");
        return (C9069g.C9072b) this.f25644b.invoke(bVar);
    }

    /* renamed from: a */
    public final boolean mo33446a(C9069g.C9074c<?> cVar) {
        C10202j.m34178b(cVar, RoomNotification.KEY);
        return cVar == this || this.f25643a == cVar;
    }
}
