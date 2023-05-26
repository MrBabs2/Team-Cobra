package p123rx.p401n.p402a;

import java.io.Serializable;
import p123rx.C5372f;

/* renamed from: rx.n.a.h */
/* compiled from: NotificationLite */
public final class C12558h {

    /* renamed from: a */
    private static final Object f32381a = new C12559a();

    /* renamed from: b */
    private static final Object f32382b = new C12560b();

    /* renamed from: rx.n.a.h$a */
    /* compiled from: NotificationLite */
    static class C12559a implements Serializable {
        C12559a() {
        }

        public String toString() {
            return "Notification=>Completed";
        }
    }

    /* renamed from: rx.n.a.h$b */
    /* compiled from: NotificationLite */
    static class C12560b implements Serializable {
        C12560b() {
        }

        public String toString() {
            return "Notification=>NULL";
        }
    }

    /* renamed from: rx.n.a.h$c */
    /* compiled from: NotificationLite */
    static final class C12561c implements Serializable {

        /* renamed from: f */
        final Throwable f32383f;

        public C12561c(Throwable th) {
            this.f32383f = th;
        }

        public String toString() {
            return "Notification=>Error:" + this.f32383f;
        }
    }

    /* renamed from: a */
    public static Object m41014a() {
        return f32381a;
    }

    /* renamed from: b */
    public static <T> T m41018b(Object obj) {
        if (obj == f32382b) {
            return null;
        }
        return obj;
    }

    /* renamed from: c */
    public static boolean m41019c(Object obj) {
        return obj == f32381a;
    }

    /* renamed from: d */
    public static <T> Object m41020d(T t) {
        return t == null ? f32382b : t;
    }

    /* renamed from: a */
    public static Object m41015a(Throwable th) {
        return new C12561c(th);
    }

    /* renamed from: a */
    public static <T> boolean m41017a(C5372f<? super T> fVar, Object obj) {
        if (obj == f32381a) {
            fVar.onCompleted();
            return true;
        } else if (obj == f32382b) {
            fVar.onNext(null);
            return false;
        } else if (obj == null) {
            throw new IllegalArgumentException("The lite notification can not be null");
        } else if (obj.getClass() == C12561c.class) {
            fVar.onError(((C12561c) obj).f32383f);
            return true;
        } else {
            fVar.onNext(obj);
            return false;
        }
    }

    /* renamed from: a */
    public static Throwable m41016a(Object obj) {
        return ((C12561c) obj).f32383f;
    }
}
