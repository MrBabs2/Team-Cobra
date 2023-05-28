package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@KeepForSdk
public final class Objects {

    @KeepForSdk
    public static final class ToStringHelper {

        /* renamed from: a */
        private final List<String> f14137a;

        /* renamed from: b */
        private final Object f14138b;

        private ToStringHelper(Object obj) {
            Preconditions.m16037a(obj);
            this.f14138b = obj;
            this.f14137a = new ArrayList();
        }

        @KeepForSdk
        /* renamed from: a */
        public final ToStringHelper mo25372a(String str, Object obj) {
            List<String> list = this.f14137a;
            Preconditions.m16037a(str);
            String str2 = str;
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str2);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        @KeepForSdk
        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f14138b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f14137a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f14137a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private Objects() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    /* renamed from: a */
    public static boolean m16031a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @KeepForSdk
    /* renamed from: a */
    public static int m16029a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @KeepForSdk
    /* renamed from: a */
    public static ToStringHelper m16030a(Object obj) {
        return new ToStringHelper(obj);
    }
}
