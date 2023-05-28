package p050l.p075h.p083k;

import android.os.Build;
import java.util.Arrays;

/* renamed from: l.h.k.c */
/* compiled from: ObjectsCompat */
public class C5003c {
    /* renamed from: a */
    public static boolean m8889a(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C4757h.m7801a(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static int m8888a(Object... objArr) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Arrays.hashCode(objArr);
        }
        return Arrays.hashCode(objArr);
    }
}
