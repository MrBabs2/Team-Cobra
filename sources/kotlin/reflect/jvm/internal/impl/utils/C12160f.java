package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.reflect.jvm.internal.impl.utils.f */
/* compiled from: numbers.kt */
public final class C12160f {

    /* renamed from: a */
    private final String f31922a;

    /* renamed from: b */
    private final int f31923b;

    public C12160f(String str, int i) {
        C10202j.m34178b(str, "number");
        this.f31922a = str;
        this.f31923b = i;
    }

    /* renamed from: a */
    public final String mo38764a() {
        return this.f31922a;
    }

    /* renamed from: b */
    public final int mo38765b() {
        return this.f31923b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C12160f) {
                C12160f fVar = (C12160f) obj;
                if (C10202j.m34176a((Object) this.f31922a, (Object) fVar.f31922a)) {
                    if (this.f31923b == fVar.f31923b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f31922a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f31923b;
    }

    public String toString() {
        return "NumberWithRadix(number=" + this.f31922a + ", radix=" + this.f31923b + ")";
    }
}
