package p120q.p121b.p354i;

import java.io.InputStream;

/* renamed from: q.b.i.b */
/* compiled from: ContextClassLoaderResourceLoader */
public class C11513b implements C11516e {
    /* renamed from: a */
    public InputStream mo37632a(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = ClassLoader.getSystemClassLoader();
        }
        return contextClassLoader.getResourceAsStream(str);
    }
}
