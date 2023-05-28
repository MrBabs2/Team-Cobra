package androidx.room.p006t;

/* renamed from: androidx.room.t.f */
/* compiled from: StringUtil */
public class C0780f {
    /* renamed from: a */
    public static StringBuilder m3544a() {
        return new StringBuilder();
    }

    /* renamed from: a */
    public static void m3545a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }
}
