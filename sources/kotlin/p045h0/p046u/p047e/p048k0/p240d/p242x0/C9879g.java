package kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9775f;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9782g0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9795i0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9811l0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9831p0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9836r;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9930z;

/* renamed from: kotlin.h0.u.e.k0.d.x0.g */
/* compiled from: protoTypeTableUtil.kt */
public final class C9879g {
    /* renamed from: a */
    public static final List<C9782g0> m32875a(C9775f fVar, C9880h hVar) {
        C10202j.m34178b(fVar, "$this$supertypes");
        C10202j.m34178b(hVar, "typeTable");
        List<C9782g0> C = fVar.mo34456C();
        if (!(!C.isEmpty())) {
            C = null;
        }
        if (C == null) {
            List<Integer> B = fVar.mo34455B();
            C10202j.m34174a((Object) B, "supertypeIdList");
            C = new ArrayList<>(C10531p.m35750a(B, 10));
            for (Integer num : B) {
                C10202j.m34174a((Object) num, "it");
                C.add(hVar.mo34856a(num.intValue()));
            }
        }
        return C;
    }

    /* renamed from: b */
    public static final C9782g0 m32885b(C9782g0 g0Var, C9880h hVar) {
        C10202j.m34178b(g0Var, "$this$flexibleUpperBound");
        C10202j.m34178b(hVar, "typeTable");
        if (g0Var.mo34520H()) {
            return g0Var.mo34536s();
        }
        if (g0Var.mo34521I()) {
            return hVar.mo34856a(g0Var.mo34537t());
        }
        return null;
    }

    /* renamed from: c */
    public static final C9782g0 m32890c(C9782g0 g0Var, C9880h hVar) {
        C10202j.m34178b(g0Var, "$this$outerType");
        C10202j.m34178b(hVar, "typeTable");
        if (g0Var.mo34523K()) {
            return g0Var.mo34539v();
        }
        if (g0Var.mo34524L()) {
            return hVar.mo34856a(g0Var.mo34540w());
        }
        return null;
    }

    /* renamed from: b */
    public static final C9782g0 m32888b(C9836r rVar, C9880h hVar) {
        C10202j.m34178b(rVar, "$this$returnType");
        C10202j.m34178b(hVar, "typeTable");
        if (rVar.mo34733H()) {
            C9782g0 r = rVar.mo34744r();
            C10202j.m34174a((Object) r, "returnType");
            return r;
        } else if (rVar.mo34734I()) {
            return hVar.mo34856a(rVar.mo34745s());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
        }
    }

    /* renamed from: a */
    public static final C9782g0 m32877a(C9782g0.C9784b bVar, C9880h hVar) {
        C10202j.m34178b(bVar, "$this$type");
        C10202j.m34178b(hVar, "typeTable");
        if (bVar.mo34546m()) {
            return bVar.mo34543j();
        }
        if (bVar.mo34547n()) {
            return hVar.mo34856a(bVar.mo34544k());
        }
        return null;
    }

    /* renamed from: b */
    public static final C9782g0 m32889b(C9930z zVar, C9880h hVar) {
        C10202j.m34178b(zVar, "$this$returnType");
        C10202j.m34178b(hVar, "typeTable");
        if (zVar.mo34945G()) {
            C9782g0 r = zVar.mo34956r();
            C10202j.m34174a((Object) r, "returnType");
            return r;
        } else if (zVar.mo34946H()) {
            return hVar.mo34856a(zVar.mo34957s());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
        }
    }

    /* renamed from: a */
    public static final List<C9782g0> m32876a(C9811l0 l0Var, C9880h hVar) {
        C10202j.m34178b(l0Var, "$this$upperBounds");
        C10202j.m34178b(hVar, "typeTable");
        List<C9782g0> q = l0Var.mo34648q();
        if (!(!q.isEmpty())) {
            q = null;
        }
        if (q == null) {
            List<Integer> p = l0Var.mo34647p();
            C10202j.m34174a((Object) p, "upperBoundIdList");
            q = new ArrayList<>(C10531p.m35750a(p, 10));
            for (Integer num : p) {
                C10202j.m34174a((Object) num, "it");
                q.add(hVar.mo34856a(num.intValue()));
            }
        }
        return q;
    }

    /* renamed from: b */
    public static final C9782g0 m32887b(C9831p0 p0Var, C9880h hVar) {
        C10202j.m34178b(p0Var, "$this$varargElementType");
        C10202j.m34178b(hVar, "typeTable");
        if (p0Var.mo34713v()) {
            return p0Var.mo34707p();
        }
        if (p0Var.mo34714w()) {
            return hVar.mo34856a(p0Var.mo34708q());
        }
        return null;
    }

    /* renamed from: b */
    public static final C9782g0 m32886b(C9795i0 i0Var, C9880h hVar) {
        C10202j.m34178b(i0Var, "$this$underlyingType");
        C10202j.m34178b(hVar, "typeTable");
        if (i0Var.mo34587C()) {
            C9782g0 t = i0Var.mo34599t();
            C10202j.m34174a((Object) t, "underlyingType");
            return t;
        } else if (i0Var.mo34588D()) {
            return hVar.mo34856a(i0Var.mo34600u());
        } else {
            throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
        }
    }

    /* renamed from: a */
    public static final boolean m32883a(C9836r rVar) {
        C10202j.m34178b(rVar, "$this$hasReceiver");
        return rVar.mo34731F() || rVar.mo34732G();
    }

    /* renamed from: a */
    public static final C9782g0 m32881a(C9836r rVar, C9880h hVar) {
        C10202j.m34178b(rVar, "$this$receiverType");
        C10202j.m34178b(hVar, "typeTable");
        if (rVar.mo34731F()) {
            return rVar.mo34742p();
        }
        if (rVar.mo34732G()) {
            return hVar.mo34856a(rVar.mo34743q());
        }
        return null;
    }

    /* renamed from: a */
    public static final boolean m32884a(C9930z zVar) {
        C10202j.m34178b(zVar, "$this$hasReceiver");
        return zVar.mo34943E() || zVar.mo34944F();
    }

    /* renamed from: a */
    public static final C9782g0 m32882a(C9930z zVar, C9880h hVar) {
        C10202j.m34178b(zVar, "$this$receiverType");
        C10202j.m34178b(hVar, "typeTable");
        if (zVar.mo34943E()) {
            return zVar.mo34954p();
        }
        if (zVar.mo34944F()) {
            return hVar.mo34856a(zVar.mo34955q());
        }
        return null;
    }

    /* renamed from: a */
    public static final C9782g0 m32880a(C9831p0 p0Var, C9880h hVar) {
        C10202j.m34178b(p0Var, "$this$type");
        C10202j.m34178b(hVar, "typeTable");
        if (p0Var.mo34711t()) {
            C9782g0 n = p0Var.mo34705n();
            C10202j.m34174a((Object) n, "type");
            return n;
        } else if (p0Var.mo34712u()) {
            return hVar.mo34856a(p0Var.mo34706o());
        } else {
            throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
        }
    }

    /* renamed from: a */
    public static final C9782g0 m32878a(C9782g0 g0Var, C9880h hVar) {
        C10202j.m34178b(g0Var, "$this$abbreviatedType");
        C10202j.m34178b(hVar, "typeTable");
        if (g0Var.mo34515C()) {
            return g0Var.mo34529l();
        }
        if (g0Var.mo34516D()) {
            return hVar.mo34856a(g0Var.mo34530m());
        }
        return null;
    }

    /* renamed from: a */
    public static final C9782g0 m32879a(C9795i0 i0Var, C9880h hVar) {
        C10202j.m34178b(i0Var, "$this$expandedType");
        C10202j.m34178b(hVar, "typeTable");
        if (i0Var.mo34602w()) {
            C9782g0 n = i0Var.mo34593n();
            C10202j.m34174a((Object) n, "expandedType");
            return n;
        } else if (i0Var.mo34603z()) {
            return hVar.mo34856a(i0Var.mo34594o());
        } else {
            throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
        }
    }
}
