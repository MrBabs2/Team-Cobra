package com.google.gson.p191t;

import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* renamed from: com.google.gson.t.f */
/* compiled from: LazilyParsedNumber */
public final class C8718f extends Number {

    /* renamed from: f */
    private final String f24822f;

    public C8718f(String str) {
        this.f24822f = str;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.f24822f);
    }

    public double doubleValue() {
        return Double.parseDouble(this.f24822f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8718f)) {
            return false;
        }
        String str = this.f24822f;
        String str2 = ((C8718f) obj).f24822f;
        if (str == str2 || str.equals(str2)) {
            return true;
        }
        return false;
    }

    public float floatValue() {
        return Float.parseFloat(this.f24822f);
    }

    public int hashCode() {
        return this.f24822f.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.f24822f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return new java.math.BigDecimal(r2.f24822f).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f24822f     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.f24822f     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r1 = (int) r0
            return r1
        L_0x000f:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.f24822f
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p191t.C8718f.intValue():int");
    }

    public long longValue() {
        try {
            return Long.parseLong(this.f24822f);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f24822f).longValue();
        }
    }

    public String toString() {
        return this.f24822f;
    }
}
