package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.v */
/* compiled from: ViewModel */
public abstract class C0542v {

    /* renamed from: a */
    private final Map<String, Object> f2205a = new HashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3093a() {
        Map<String, Object> map = this.f2205a;
        if (map != null) {
            synchronized (map) {
                for (Object a : this.f2205a.values()) {
                    m2630a(a);
                }
            }
        }
        mo2920b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2920b() {
    }

    /* renamed from: a */
    private static void m2630a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
