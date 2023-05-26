package kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.C4788a;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11689a0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9748b;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9782g0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9790h;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9811l0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9818n;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9831p0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9836r;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9930z;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9875c;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9878f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10037g;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10232a0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10243c;
import kotlin.reflect.jvm.internal.impl.protobuf.C10449o;

/* renamed from: kotlin.h0.u.e.k0.i.b.e */
/* compiled from: AnnotationAndConstantLoaderImpl.kt */
public final class C11698e implements C11694c<C10243c, C10037g<?>> {

    /* renamed from: a */
    private final C11715g f31283a;

    /* renamed from: b */
    private final C4788a f31284b;

    public C11698e(C10393y yVar, C10232a0 a0Var, C4788a aVar) {
        C10202j.m34178b(yVar, "module");
        C10202j.m34178b(a0Var, "notFoundClasses");
        C10202j.m34178b(aVar, "protocol");
        this.f31284b = aVar;
        this.f31283a = new C11715g(yVar, a0Var);
    }

    /* renamed from: b */
    public List<C10243c> mo34249b(C11689a0 a0Var, C10449o oVar, C11692b bVar) {
        List<C9748b> list;
        C10202j.m34178b(a0Var, "container");
        C10202j.m34178b(oVar, "proto");
        C10202j.m34178b(bVar, "kind");
        if (oVar instanceof C9790h) {
            list = (List) ((C9790h) oVar).mo35765a(this.f31284b.mo16629c());
        } else if (oVar instanceof C9836r) {
            list = (List) ((C9836r) oVar).mo35765a(this.f31284b.mo16632f());
        } else if (oVar instanceof C9930z) {
            int i = C11696d.f31281a[bVar.ordinal()];
            if (i == 1) {
                list = (List) ((C9930z) oVar).mo35765a(this.f31284b.mo16634h());
            } else if (i == 2) {
                list = (List) ((C9930z) oVar).mo35765a(this.f31284b.mo16635i());
            } else if (i == 3) {
                list = (List) ((C9930z) oVar).mo35765a(this.f31284b.mo16636j());
            } else {
                throw new IllegalStateException("Unsupported callable kind with property proto".toString());
            }
        } else {
            throw new IllegalStateException(("Unknown message: " + oVar).toString());
        }
        if (list == null) {
            list = C10529o.m35736a();
        }
        ArrayList arrayList = new ArrayList(C10531p.m35750a(list, 10));
        for (C9748b a : list) {
            arrayList.add(this.f31283a.mo38291a(a, a0Var.mo38257b()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<C10243c> mo34241a(C11689a0.C11690a aVar) {
        C10202j.m34178b(aVar, "container");
        List<C9748b> list = (List) aVar.mo38262f().mo35765a(this.f31284b.mo16627a());
        if (list == null) {
            list = C10529o.m35736a();
        }
        ArrayList arrayList = new ArrayList(C10531p.m35750a(list, 10));
        for (C9748b a : list) {
            arrayList.add(this.f31283a.mo38291a(a, aVar.mo38257b()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<C10243c> mo34243a(C11689a0 a0Var, C9930z zVar) {
        C10202j.m34178b(a0Var, "container");
        C10202j.m34178b(zVar, "proto");
        return C10529o.m35736a();
    }

    /* renamed from: a */
    public List<C10243c> mo34242a(C11689a0 a0Var, C9818n nVar) {
        C10202j.m34178b(a0Var, "container");
        C10202j.m34178b(nVar, "proto");
        List<C9748b> list = (List) nVar.mo35765a(this.f31284b.mo16630d());
        if (list == null) {
            list = C10529o.m35736a();
        }
        ArrayList arrayList = new ArrayList(C10531p.m35750a(list, 10));
        for (C9748b a : list) {
            arrayList.add(this.f31283a.mo38291a(a, a0Var.mo38257b()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<C10243c> mo34245a(C11689a0 a0Var, C10449o oVar, C11692b bVar, int i, C9831p0 p0Var) {
        C10202j.m34178b(a0Var, "container");
        C10202j.m34178b(oVar, "callableProto");
        C10202j.m34178b(bVar, "kind");
        C10202j.m34178b(p0Var, "proto");
        List<C9748b> list = (List) p0Var.mo35765a(this.f31284b.mo16633g());
        if (list == null) {
            list = C10529o.m35736a();
        }
        ArrayList arrayList = new ArrayList(C10531p.m35750a(list, 10));
        for (C9748b a : list) {
            arrayList.add(this.f31283a.mo38291a(a, a0Var.mo38257b()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public List<C10243c> mo34248b(C11689a0 a0Var, C9930z zVar) {
        C10202j.m34178b(a0Var, "container");
        C10202j.m34178b(zVar, "proto");
        return C10529o.m35736a();
    }

    /* renamed from: a */
    public List<C10243c> mo34244a(C11689a0 a0Var, C10449o oVar, C11692b bVar) {
        C10202j.m34178b(a0Var, "container");
        C10202j.m34178b(oVar, "proto");
        C10202j.m34178b(bVar, "kind");
        return C10529o.m35736a();
    }

    /* renamed from: a */
    public List<C10243c> mo34239a(C9782g0 g0Var, C9875c cVar) {
        C10202j.m34178b(g0Var, "proto");
        C10202j.m34178b(cVar, "nameResolver");
        List<C9748b> list = (List) g0Var.mo35765a(this.f31284b.mo16637k());
        if (list == null) {
            list = C10529o.m35736a();
        }
        ArrayList arrayList = new ArrayList(C10531p.m35750a(list, 10));
        for (C9748b a : list) {
            arrayList.add(this.f31283a.mo38291a(a, cVar));
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<C10243c> mo34240a(C9811l0 l0Var, C9875c cVar) {
        C10202j.m34178b(l0Var, "proto");
        C10202j.m34178b(cVar, "nameResolver");
        List<C9748b> list = (List) l0Var.mo35765a(this.f31284b.mo16638l());
        if (list == null) {
            list = C10529o.m35736a();
        }
        ArrayList arrayList = new ArrayList(C10531p.m35750a(list, 10));
        for (C9748b a : list) {
            arrayList.add(this.f31283a.mo38291a(a, cVar));
        }
        return arrayList;
    }

    /* renamed from: a */
    public C10037g<?> m38510a(C11689a0 a0Var, C9930z zVar, C11824b0 b0Var) {
        C10202j.m34178b(a0Var, "container");
        C10202j.m34178b(zVar, "proto");
        C10202j.m34178b(b0Var, "expectedType");
        C9748b.C9750b.C9753c cVar = (C9748b.C9750b.C9753c) C9878f.m32873a(zVar, this.f31284b.mo16628b());
        if (cVar != null) {
            return this.f31283a.mo38290a(b0Var, cVar, a0Var.mo38257b());
        }
        return null;
    }
}
