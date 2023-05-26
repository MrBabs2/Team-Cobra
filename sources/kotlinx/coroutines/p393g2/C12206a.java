package kotlinx.coroutines.p393g2;

import kotlin.TypeCastException;

/* renamed from: kotlinx.coroutines.g2.a */
/* compiled from: ArrayQueue.kt */
public class C12206a<T> {

    /* renamed from: a */
    private Object[] f31970a = new Object[16];

    /* renamed from: b */
    private int f31971b;

    /* renamed from: c */
    private int f31972c;

    /* renamed from: c */
    private final void m40246c() {
        Object[] objArr = this.f31970a;
        int length = objArr.length;
        Object[] objArr2 = new Object[(length << 1)];
        Object[] objArr3 = objArr2;
        Object[] unused = C10516j.m35595a(objArr, objArr3, 0, this.f31971b, 0, 10, (Object) null);
        Object[] objArr4 = this.f31970a;
        int length2 = objArr4.length;
        int i = this.f31971b;
        Object[] unused2 = C10516j.m35595a(objArr4, objArr2, length2 - i, 0, i, 4, (Object) null);
        this.f31970a = objArr3;
        this.f31971b = 0;
        this.f31972c = length;
    }

    /* renamed from: a */
    public final boolean mo38857a() {
        return this.f31971b == this.f31972c;
    }

    /* renamed from: b */
    public final T mo38858b() {
        int i = this.f31971b;
        if (i == this.f31972c) {
            return null;
        }
        T[] tArr = this.f31970a;
        T t = tArr[i];
        tArr[i] = null;
        this.f31971b = (i + 1) & (tArr.length - 1);
        if (t != null) {
            return t;
        }
        throw new TypeCastException("null cannot be cast to non-null type T");
    }

    /* renamed from: a */
    public final void mo38856a(T t) {
        Object[] objArr = this.f31970a;
        int i = this.f31972c;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.f31972c = length;
        if (length == this.f31971b) {
            m40246c();
        }
    }
}
