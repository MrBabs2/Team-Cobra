package kotlin;

import java.io.Serializable;

/* renamed from: kotlin.e */
/* compiled from: Lazy.kt */
public final class C9129e<T> implements C9134f<T>, Serializable {

    /* renamed from: f */
    private final T f25672f;

    public C9129e(T t) {
        this.f25672f = t;
    }

    public T getValue() {
        return this.f25672f;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
