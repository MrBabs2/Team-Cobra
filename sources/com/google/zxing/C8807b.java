package com.google.zxing;

/* renamed from: com.google.zxing.b */
/* compiled from: Dimension */
public final class C8807b {

    /* renamed from: a */
    private final int f25002a;

    /* renamed from: b */
    private final int f25003b;

    /* renamed from: a */
    public int mo32535a() {
        return this.f25003b;
    }

    /* renamed from: b */
    public int mo32536b() {
        return this.f25002a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8807b) {
            C8807b bVar = (C8807b) obj;
            if (this.f25002a == bVar.f25002a && this.f25003b == bVar.f25003b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (this.f25002a * 32713) + this.f25003b;
    }

    public String toString() {
        return this.f25002a + "x" + this.f25003b;
    }
}
