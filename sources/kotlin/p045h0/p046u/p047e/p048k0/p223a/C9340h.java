package kotlin.p045h0.p046u.p047e.p048k0.p223a;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;

/* renamed from: kotlin.h0.u.e.k0.a.h */
/* compiled from: PrimitiveType */
public enum C9340h {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");
    

    /* renamed from: r */
    public static final Set<C9340h> f25991r = null;

    /* renamed from: f */
    private final C9939f f25993f;

    /* renamed from: g */
    private final C9939f f25994g;

    /* renamed from: h */
    private C9934b f25995h;

    /* renamed from: i */
    private C9934b f25996i;

    static {
        C9340h hVar;
        C9340h hVar2;
        C9340h hVar3;
        C9340h hVar4;
        C9340h hVar5;
        C9340h hVar6;
        C9340h hVar7;
        f25991r = Collections.unmodifiableSet(EnumSet.of(hVar2, new C9340h[]{hVar3, hVar4, hVar5, hVar6, hVar7, hVar}));
    }

    private C9340h(String str) {
        this.f25995h = null;
        this.f25996i = null;
        this.f25993f = C9939f.m33302b(str);
        this.f25994g = C9939f.m33302b(str + "Array");
    }

    /* renamed from: a */
    public C9934b mo33732a() {
        C9934b bVar = this.f25996i;
        if (bVar == null) {
            C9934b a = C9333g.f25902f.mo34995a(this.f25994g);
            this.f25996i = a;
            if (a != null) {
                return a;
            }
            m30260a(5);
            throw null;
        } else if (bVar != null) {
            return bVar;
        } else {
            m30260a(4);
            throw null;
        }
    }

    /* renamed from: d */
    public C9939f mo33733d() {
        C9939f fVar = this.f25994g;
        if (fVar != null) {
            return fVar;
        }
        m30260a(3);
        throw null;
    }

    /* renamed from: e */
    public C9934b mo33734e() {
        C9934b bVar = this.f25995h;
        if (bVar == null) {
            C9934b a = C9333g.f25902f.mo34995a(this.f25993f);
            this.f25995h = a;
            if (a != null) {
                return a;
            }
            m30260a(2);
            throw null;
        } else if (bVar != null) {
            return bVar;
        } else {
            m30260a(1);
            throw null;
        }
    }

    /* renamed from: i */
    public C9939f mo33735i() {
        C9939f fVar = this.f25993f;
        if (fVar != null) {
            return fVar;
        }
        m30260a(0);
        throw null;
    }
}
