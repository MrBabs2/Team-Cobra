package p120q.p326a.p329d0.p345j;

import java.io.Serializable;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p331b.C10910b;

/* renamed from: q.a.d0.j.m */
/* compiled from: NotificationLite */
public enum C11439m {
    COMPLETE;

    /* renamed from: q.a.d0.j.m$a */
    /* compiled from: NotificationLite */
    static final class C11440a implements Serializable {

        /* renamed from: f */
        final C10842c f30626f;

        C11440a(C10842c cVar) {
            this.f30626f = cVar;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.f30626f + "]";
        }
    }

    /* renamed from: q.a.d0.j.m$b */
    /* compiled from: NotificationLite */
    static final class C11441b implements Serializable {

        /* renamed from: f */
        final Throwable f30627f;

        C11441b(Throwable th) {
            this.f30627f = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C11441b) {
                return C10910b.m36863a((Object) this.f30627f, (Object) ((C11441b) obj).f30627f);
            }
            return false;
        }

        public int hashCode() {
            return this.f30627f.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f30627f + "]";
        }
    }

    /* renamed from: a */
    public static Object m37474a() {
        return COMPLETE;
    }

    /* renamed from: b */
    public static <T> T m37479b(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static <T> boolean m37480b(Object obj, C11490u<? super T> uVar) {
        if (obj == COMPLETE) {
            uVar.onComplete();
            return true;
        } else if (obj instanceof C11441b) {
            uVar.onError(((C11441b) obj).f30627f);
            return true;
        } else if (obj instanceof C11440a) {
            uVar.onSubscribe(((C11440a) obj).f30626f);
            return false;
        } else {
            uVar.onNext(obj);
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m37481c(Object obj) {
        return obj == COMPLETE;
    }

    /* renamed from: d */
    public static boolean m37482d(Object obj) {
        return obj instanceof C11441b;
    }

    /* renamed from: e */
    public static <T> Object m37483e(T t) {
        return t;
    }

    public String toString() {
        return "NotificationLite.Complete";
    }

    /* renamed from: a */
    public static Object m37475a(Throwable th) {
        return new C11441b(th);
    }

    /* renamed from: a */
    public static Object m37476a(C10842c cVar) {
        return new C11440a(cVar);
    }

    /* renamed from: a */
    public static Throwable m37477a(Object obj) {
        return ((C11441b) obj).f30627f;
    }

    /* renamed from: a */
    public static <T> boolean m37478a(Object obj, C11490u<? super T> uVar) {
        if (obj == COMPLETE) {
            uVar.onComplete();
            return true;
        } else if (obj instanceof C11441b) {
            uVar.onError(((C11441b) obj).f30627f);
            return true;
        } else {
            uVar.onNext(obj);
            return false;
        }
    }
}
