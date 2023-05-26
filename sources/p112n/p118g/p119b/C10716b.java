package p112n.p118g.p119b;

import java.io.Serializable;
import p123rx.C5372f;

/* renamed from: n.g.b.b */
/* compiled from: NotificationLite */
final class C10716b {

    /* renamed from: a */
    private static final Object f28738a = new C10717a();

    /* renamed from: n.g.b.b$a */
    /* compiled from: NotificationLite */
    static class C10717a implements Serializable {
        C10717a() {
        }

        public String toString() {
            return "Notification=>NULL";
        }
    }

    /* renamed from: a */
    public static <T> Object m36236a(T t) {
        return t == null ? f28738a : t;
    }

    /* renamed from: a */
    public static <T> boolean m36237a(C5372f<? super T> fVar, Object obj) {
        if (obj == f28738a) {
            fVar.onNext(null);
            return false;
        } else if (obj != null) {
            fVar.onNext(obj);
            return false;
        } else {
            throw new IllegalArgumentException("The lite notification can not be null");
        }
    }
}
