package kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p378g0;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11814f;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11816h;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10243c;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.i.b.g0.b */
/* compiled from: DeserializedAnnotations.kt */
public class C11717b implements C10249g {

    /* renamed from: g */
    static final /* synthetic */ C9168l[] f31310g = {C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a(C11717b.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: f */
    private final C11814f f31311f;

    public C11717b(C11817i iVar, C9102a<? extends List<? extends C10243c>> aVar) {
        C10202j.m34178b(iVar, "storageManager");
        C10202j.m34178b(aVar, "compute");
        this.f31311f = iVar.mo38401a(aVar);
    }

    /* renamed from: a */
    private final List<C10243c> m38552a() {
        return (List) C11816h.m38876a(this.f31311f, (Object) this, (C9168l<?>) f31310g[0]);
    }

    /* renamed from: a */
    public C10243c mo33885a(C9934b bVar) {
        C10202j.m34178b(bVar, "fqName");
        return C10249g.C10252b.m34289a(this, bVar);
    }

    /* renamed from: b */
    public boolean mo33886b(C9934b bVar) {
        C10202j.m34178b(bVar, "fqName");
        return C10249g.C10252b.m34290b(this, bVar);
    }

    public boolean isEmpty() {
        return m38552a().isEmpty();
    }

    public Iterator<C10243c> iterator() {
        return m38552a().iterator();
    }
}
