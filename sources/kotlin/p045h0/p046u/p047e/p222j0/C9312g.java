package kotlin.p045h0.p046u.p047e.p222j0;

import java.io.InputStream;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p377f0.C11709a;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9520g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9719m;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;

/* renamed from: kotlin.h0.u.e.j0.g */
/* compiled from: ReflectKotlinClassFinder.kt */
public final class C9312g implements C9719m {

    /* renamed from: a */
    private final ClassLoader f25880a;

    public C9312g(ClassLoader classLoader) {
        C10202j.m34178b(classLoader, "classLoader");
        this.f25880a = classLoader;
    }

    /* renamed from: a */
    private final C9719m.C9720a m30119a(String str) {
        C9310f a;
        Class<?> a2 = C9309e.m30112a(this.f25880a, str);
        if (a2 == null || (a = C9310f.f25877c.mo33670a(a2)) == null) {
            return null;
        }
        return new C9719m.C9720a.C9722b(a);
    }

    /* renamed from: a */
    public C9719m.C9720a mo33673a(C9933a aVar) {
        C10202j.m34178b(aVar, "classId");
        return m30119a(C9313h.m30124b(aVar));
    }

    /* renamed from: a */
    public C9719m.C9720a mo33672a(C9520g gVar) {
        String a;
        C10202j.m34178b(gVar, "javaClass");
        C9934b c = gVar.mo34036c();
        if (c == null || (a = c.mo34994a()) == null) {
            return null;
        }
        return m30119a(a);
    }

    /* renamed from: a */
    public InputStream mo33671a(C9934b bVar) {
        C10202j.m34178b(bVar, "packageFqName");
        if (!bVar.mo34997b(C9333g.f25901e)) {
            return null;
        }
        return this.f25880a.getResourceAsStream(C11709a.f31305m.mo38285b(bVar));
    }
}
