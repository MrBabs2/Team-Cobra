package p120q.p121b.p362m;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: q.b.m.a */
/* compiled from: Frame */
public final class C11569a {

    /* renamed from: a */
    private Method f30901a;

    /* renamed from: b */
    private final C11570a[] f30902b;

    /* renamed from: q.b.m.a$a */
    /* compiled from: Frame */
    public static final class C11570a {
        /* renamed from: a */
        public String mo37801a() {
            throw null;
        }
    }

    /* renamed from: a */
    public Map<String, Object> mo37798a() {
        C11570a[] aVarArr = this.f30902b;
        if (aVarArr == null || aVarArr.length == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        C11570a[] aVarArr2 = this.f30902b;
        int length = aVarArr2.length;
        int i = 0;
        while (i < length) {
            C11570a aVar = aVarArr2[i];
            if (aVar == null) {
                i++;
            } else {
                aVar.mo37801a();
                throw null;
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public Method mo37799b() {
        return this.f30901a;
    }

    public String toString() {
        return "Frame{, locals=" + Arrays.toString(this.f30902b) + '}';
    }
}
