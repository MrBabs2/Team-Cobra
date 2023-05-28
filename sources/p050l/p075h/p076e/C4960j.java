package p050l.p075h.p076e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.p003c.C0398c;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import p050l.p075h.p081i.C4971b;

/* renamed from: l.h.e.j */
/* compiled from: TypefaceCompatBaseImpl */
class C4960j {

    /* renamed from: a */
    private ConcurrentHashMap<Long, C0398c.C0400b> f8772a = new ConcurrentHashMap<>();

    /* renamed from: l.h.e.j$a */
    /* compiled from: TypefaceCompatBaseImpl */
    class C4961a implements C4963c<C4971b.C4977f> {
        C4961a(C4960j jVar) {
        }

        /* renamed from: a */
        public int mo17378a(C4971b.C4977f fVar) {
            return fVar.mo17402d();
        }

        /* renamed from: b */
        public boolean mo17380b(C4971b.C4977f fVar) {
            return fVar.mo17403e();
        }
    }

    /* renamed from: l.h.e.j$b */
    /* compiled from: TypefaceCompatBaseImpl */
    class C4962b implements C4963c<C0398c.C0401c> {
        C4962b(C4960j jVar) {
        }

        /* renamed from: a */
        public int mo17378a(C0398c.C0401c cVar) {
            return cVar.mo2310e();
        }

        /* renamed from: b */
        public boolean mo17380b(C0398c.C0401c cVar) {
            return cVar.mo2311f();
        }
    }

    /* renamed from: l.h.e.j$c */
    /* compiled from: TypefaceCompatBaseImpl */
    private interface C4963c<T> {
        /* renamed from: a */
        int mo17378a(T t);

        /* renamed from: b */
        boolean mo17380b(T t);
    }

    C4960j() {
    }

    /* renamed from: a */
    private static <T> T m8772a(T[] tArr, int i, C4963c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.mo17378a(t2) - i2) * 2) + (cVar.mo17380b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: b */
    private static long m8774b(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0;
        } catch (IllegalAccessException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4971b.C4977f mo17376a(C4971b.C4977f[] fVarArr, int i) {
        return (C4971b.C4977f) m8772a(fVarArr, i, new C4961a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo17375a(Context context, InputStream inputStream) {
        File a = C4964k.m8791a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C4964k.m8797a(a, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* renamed from: a */
    public Typeface mo17364a(Context context, CancellationSignal cancellationSignal, C4971b.C4977f[] fVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (fVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo17376a(fVarArr, i).mo17401c());
            try {
                Typeface a = mo17375a(context, inputStream);
                C4964k.m8795a((Closeable) inputStream);
                return a;
            } catch (IOException unused) {
                C4964k.m8795a((Closeable) inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C4964k.m8795a((Closeable) inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C4964k.m8795a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C4964k.m8795a((Closeable) inputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    private C0398c.C0401c m8771a(C0398c.C0400b bVar, int i) {
        return (C0398c.C0401c) m8772a(bVar.mo2305a(), i, new C4962b(this));
    }

    /* renamed from: a */
    public Typeface mo17365a(Context context, C0398c.C0400b bVar, Resources resources, int i) {
        C0398c.C0401c a = m8771a(bVar, i);
        if (a == null) {
            return null;
        }
        Typeface a2 = C4954d.m8727a(context, resources, a.mo2307b(), a.mo2306a(), i);
        m8773a(a2, bVar);
        return a2;
    }

    /* renamed from: a */
    public Typeface mo17366a(Context context, Resources resources, int i, String str, int i2) {
        File a = C4964k.m8791a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C4964k.m8796a(a, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0398c.C0400b mo17377a(Typeface typeface) {
        long b = m8774b(typeface);
        if (b == 0) {
            return null;
        }
        return this.f8772a.get(Long.valueOf(b));
    }

    /* renamed from: a */
    private void m8773a(Typeface typeface, C0398c.C0400b bVar) {
        long b = m8774b(typeface);
        if (b != 0) {
            this.f8772a.put(Long.valueOf(b), bVar);
        }
    }
}
