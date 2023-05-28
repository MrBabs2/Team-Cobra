package kotlin.p042a0;

import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9069g;
import kotlin.p215c0.p216c.C9117p;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

/* renamed from: kotlin.a0.a */
/* compiled from: CoroutineContextImpl.kt */
public abstract class C9057a implements C9069g.C9072b {
    private final C9069g.C9074c<?> key;

    public C9057a(C9069g.C9074c<?> cVar) {
        C10202j.m34178b(cVar, RoomNotification.KEY);
        this.key = cVar;
    }

    public <R> R fold(R r, C9117p<? super R, ? super C9069g.C9072b, ? extends R> pVar) {
        C10202j.m34178b(pVar, "operation");
        return C9069g.C9072b.C9073a.m29776a(this, r, pVar);
    }

    public <E extends C9069g.C9072b> E get(C9069g.C9074c<E> cVar) {
        C10202j.m34178b(cVar, RoomNotification.KEY);
        return C9069g.C9072b.C9073a.m29777a((C9069g.C9072b) this, cVar);
    }

    public C9069g.C9074c<?> getKey() {
        return this.key;
    }

    public C9069g minusKey(C9069g.C9074c<?> cVar) {
        C10202j.m34178b(cVar, RoomNotification.KEY);
        return C9069g.C9072b.C9073a.m29779b(this, cVar);
    }

    public C9069g plus(C9069g gVar) {
        C10202j.m34178b(gVar, "context");
        return C9069g.C9072b.C9073a.m29778a((C9069g.C9072b) this, gVar);
    }
}
