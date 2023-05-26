package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a;

import java.util.Map;
import java.util.Set;
import kotlin.C10221n;
import kotlin.C10481t;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9405a;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.C9426k;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9554g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9555h;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;

/* renamed from: kotlin.h0.u.e.k0.c.a.b */
/* compiled from: AnnotationTypeQualifierResolver.kt */
public final class C9507b {

    /* renamed from: a */
    private static final C9934b f26355a = new C9934b("javax.annotation.meta.TypeQualifierNickname");

    /* renamed from: b */
    private static final C9934b f26356b = new C9934b("javax.annotation.meta.TypeQualifier");

    /* renamed from: c */
    private static final C9934b f26357c = new C9934b("javax.annotation.meta.TypeQualifierDefault");

    /* renamed from: d */
    private static final C9934b f26358d = new C9934b("kotlin.annotations.jvm.UnderMigration");

    /* renamed from: e */
    private static final Map<C9934b, C9426k> f26359e = C10518j0.m35604a((C10221n<? extends K, ? extends V>[]) new C10221n[]{C10481t.m35502a(new C9934b("javax.annotation.ParametersAreNullableByDefault"), new C9426k(new C9555h(C9554g.NULLABLE, false, 2, (DefaultConstructorMarker) null), C10527n.m35729a(C9405a.C9406a.VALUE_PARAMETER))), C10481t.m35502a(new C9934b("javax.annotation.ParametersAreNonnullByDefault"), new C9426k(new C9555h(C9554g.NOT_NULL, false, 2, (DefaultConstructorMarker) null), C10527n.m35729a(C9405a.C9406a.VALUE_PARAMETER)))});

    /* renamed from: f */
    private static final Set<C9934b> f26360f = C10530o0.m35749b(C9633t.m31062f(), C9633t.m31061e());

    /* renamed from: b */
    public static final C9934b m30813b() {
        return f26358d;
    }

    /* renamed from: c */
    public static final C9934b m30815c() {
        return f26357c;
    }

    /* renamed from: d */
    public static final C9934b m30816d() {
        return f26355a;
    }

    /* renamed from: a */
    public static final Map<C9934b, C9426k> m30811a() {
        return f26359e;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m30814b(C10342e eVar) {
        return f26360f.contains(C10071a.m33895c(eVar)) || eVar.getAnnotations().mo33886b(f26356b);
    }
}
