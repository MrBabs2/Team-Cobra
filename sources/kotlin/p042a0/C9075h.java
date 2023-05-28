package kotlin.p042a0;

import java.io.Serializable;
import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9069g;
import kotlin.p215c0.p216c.C9117p;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

/* renamed from: kotlin.a0.h */
/* compiled from: CoroutineContextImpl.kt */
public final class C9075h implements C9069g, Serializable {

    /* renamed from: f */
    public static final C9075h f25654f = new C9075h();

    private C9075h() {
    }

    private final Object readResolve() {
        return f25654f;
    }

    public <R> R fold(R r, C9117p<? super R, ? super C9069g.C9072b, ? extends R> pVar) {
        C10202j.m34178b(pVar, "operation");
        return r;
    }

    public <E extends C9069g.C9072b> E get(C9069g.C9074c<E> cVar) {
        C10202j.m34178b(cVar, RoomNotification.KEY);
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public C9069g minusKey(C9069g.C9074c<?> cVar) {
        C10202j.m34178b(cVar, RoomNotification.KEY);
        return this;
    }

    public C9069g plus(C9069g gVar) {
        C10202j.m34178b(gVar, "context");
        return gVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
