package com.google.gson;

import com.google.gson.p191t.C8695a;
import com.google.gson.p191t.C8718f;
import java.math.BigInteger;

/* renamed from: com.google.gson.m */
/* compiled from: JsonPrimitive */
public final class C8682m extends C8679j {

    /* renamed from: b */
    private static final Class<?>[] f24747b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: a */
    private Object f24748a;

    public C8682m(Boolean bool) {
        mo32342a((Object) bool);
    }

    /* renamed from: b */
    private static boolean m28352b(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> isAssignableFrom : f24747b) {
            if (isAssignableFrom.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32342a(Object obj) {
        if (obj instanceof Character) {
            this.f24748a = String.valueOf(((Character) obj).charValue());
            return;
        }
        C8695a.m28434a((obj instanceof Number) || m28352b(obj));
        this.f24748a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8682m.class != obj.getClass()) {
            return false;
        }
        C8682m mVar = (C8682m) obj;
        if (this.f24748a == null) {
            if (mVar.f24748a == null) {
                return true;
            }
            return false;
        } else if (!m28351a(this) || !m28351a(mVar)) {
            if (!(this.f24748a instanceof Number) || !(mVar.f24748a instanceof Number)) {
                return this.f24748a.equals(mVar.f24748a);
            }
            double doubleValue = mo32350t().doubleValue();
            double doubleValue2 = mVar.mo32350t().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (!Double.isNaN(doubleValue) || !Double.isNaN(doubleValue2)) {
                return false;
            }
            return true;
        } else if (mo32350t().longValue() == mVar.mo32350t().longValue()) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f24748a == null) {
            return 31;
        }
        if (m28351a(this)) {
            doubleToLongBits = mo32350t().longValue();
        } else {
            Object obj = this.f24748a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(mo32350t().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: j */
    public boolean mo32345j() {
        if (mo32352v()) {
            return mo32346k().booleanValue();
        }
        return Boolean.parseBoolean(mo32351u());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Boolean mo32346k() {
        return (Boolean) this.f24748a;
    }

    /* renamed from: n */
    public double mo32347n() {
        return mo32353x() ? mo32350t().doubleValue() : Double.parseDouble(mo32351u());
    }

    /* renamed from: o */
    public int mo32348o() {
        return mo32353x() ? mo32350t().intValue() : Integer.parseInt(mo32351u());
    }

    /* renamed from: p */
    public long mo32349p() {
        return mo32353x() ? mo32350t().longValue() : Long.parseLong(mo32351u());
    }

    /* renamed from: t */
    public Number mo32350t() {
        Object obj = this.f24748a;
        return obj instanceof String ? new C8718f((String) this.f24748a) : (Number) obj;
    }

    /* renamed from: u */
    public String mo32351u() {
        if (mo32353x()) {
            return mo32350t().toString();
        }
        if (mo32352v()) {
            return mo32346k().toString();
        }
        return (String) this.f24748a;
    }

    /* renamed from: v */
    public boolean mo32352v() {
        return this.f24748a instanceof Boolean;
    }

    /* renamed from: x */
    public boolean mo32353x() {
        return this.f24748a instanceof Number;
    }

    /* renamed from: y */
    public boolean mo32354y() {
        return this.f24748a instanceof String;
    }

    public C8682m(Number number) {
        mo32342a((Object) number);
    }

    public C8682m(String str) {
        mo32342a((Object) str);
    }

    /* renamed from: a */
    private static boolean m28351a(C8682m mVar) {
        Object obj = mVar.f24748a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }
}
