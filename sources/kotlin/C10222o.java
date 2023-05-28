package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b@\u0018\u0000 \u001e*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u001e\u001fB\u0016\b\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00018\u0000H\b¢\u0006\u0004\b\u0017\u0010\u0007J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u000f\u0010\u001a\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0000X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, mo16641d2 = {"Lkotlin/Result;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "value", "", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "isFailure", "", "isFailure-impl", "(Ljava/lang/Object;)Z", "isSuccess", "isSuccess-impl", "value$annotations", "()V", "equals", "other", "exceptionOrNull", "", "exceptionOrNull-impl", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "getOrNull", "getOrNull-impl", "hashCode", "", "toString", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "Companion", "Failure", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlin.o */
/* compiled from: Result.kt */
public final class C10222o<T> implements Serializable {

    /* renamed from: f */
    public static final C10223a f27863f = new C10223a((DefaultConstructorMarker) null);

    /* renamed from: kotlin.o$a */
    /* compiled from: Result.kt */
    public static final class C10223a {
        private C10223a() {
        }

        public /* synthetic */ C10223a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlin.o$b */
    /* compiled from: Result.kt */
    public static final class C10224b implements Serializable {

        /* renamed from: f */
        public final Throwable f27864f;

        public C10224b(Throwable th) {
            C10202j.m34178b(th, "exception");
            this.f27864f = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C10224b) && C10202j.m34176a((Object) this.f27864f, (Object) ((C10224b) obj).f27864f);
        }

        public int hashCode() {
            return this.f27864f.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f27864f + ')';
        }
    }

    /* renamed from: a */
    public static Object m34210a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static final Throwable m34211b(Object obj) {
        if (obj instanceof C10224b) {
            return ((C10224b) obj).f27864f;
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m34212c(Object obj) {
        return obj instanceof C10224b;
    }
}
