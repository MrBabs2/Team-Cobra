package androidx.lifecycle;

/* renamed from: androidx.lifecycle.w */
/* compiled from: ViewModelProvider */
public class C0543w {

    /* renamed from: a */
    private final C0544a f2206a;

    /* renamed from: b */
    private final C0546x f2207b;

    /* renamed from: androidx.lifecycle.w$a */
    /* compiled from: ViewModelProvider */
    public interface C0544a {
        /* renamed from: a */
        <T extends C0542v> T mo2931a(Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.w$b */
    /* compiled from: ViewModelProvider */
    static abstract class C0545b implements C0544a {
        C0545b() {
        }

        /* renamed from: a */
        public <T extends C0542v> T mo2931a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        /* renamed from: a */
        public abstract <T extends C0542v> T mo3096a(String str, Class<T> cls);
    }

    public C0543w(C0546x xVar, C0544a aVar) {
        this.f2206a = aVar;
        this.f2207b = xVar;
    }

    /* renamed from: a */
    public <T extends C0542v> T mo3094a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo3095a("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: a */
    public <T extends C0542v> T mo3095a(String str, Class<T> cls) {
        T t;
        T a = this.f2207b.mo3097a(str);
        if (cls.isInstance(a)) {
            return a;
        }
        C0544a aVar = this.f2206a;
        if (aVar instanceof C0545b) {
            t = ((C0545b) aVar).mo3096a(str, cls);
        } else {
            t = aVar.mo2931a(cls);
        }
        this.f2207b.mo3099a(str, t);
        return t;
    }
}
