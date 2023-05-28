package p036io.rakam.api;

import java.util.HashMap;
import java.util.Map;

/* renamed from: io.rakam.api.f */
/* compiled from: Rakam */
public class C4759f {

    /* renamed from: a */
    static final Map<String, C4760h> f8054a = new HashMap();

    /* renamed from: a */
    public static C4760h m7803a() {
        return m7804a((String) null);
    }

    /* renamed from: a */
    public static synchronized C4760h m7804a(String str) {
        C4760h hVar;
        synchronized (C4759f.class) {
            String b = C9028k.m29696b(str);
            hVar = f8054a.get(b);
            if (hVar == null) {
                hVar = new C4760h(b);
                f8054a.put(b, hVar);
            }
        }
        return hVar;
    }
}
