package kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q;

import java.util.ArrayList;
import java.util.List;
import kotlin.C10485x;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9398b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9997b;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11814f;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11816h;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10345f;
import kotlin.reflect.jvm.internal.impl.descriptors.C10360m0;

/* renamed from: kotlin.h0.u.e.k0.h.q.k */
/* compiled from: StaticScopeForKotlinEnum.kt */
public final class C10103k extends C10100i {

    /* renamed from: d */
    static final /* synthetic */ C9168l[] f27723d = {C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a(C10103k.class), "functions", "getFunctions()Ljava/util/List;"))};

    /* renamed from: b */
    private final C11814f f27724b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C10342e f27725c;

    /* renamed from: kotlin.h0.u.e.k0.h.q.k$a */
    /* compiled from: StaticScopeForKotlinEnum.kt */
    static final class C10104a extends C10203k implements C9102a<List<? extends C10360m0>> {

        /* renamed from: f */
        final /* synthetic */ C10103k f27726f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10104a(C10103k kVar) {
            super(0);
            this.f27726f = kVar;
        }

        public final List<C10360m0> invoke() {
            return C10529o.m35741b((T[]) new C10360m0[]{C9997b.m33650a(this.f27726f.f27725c), C9997b.m33653b(this.f27726f.f27725c)});
        }
    }

    public C10103k(C11817i iVar, C10342e eVar) {
        C10202j.m34178b(iVar, "storageManager");
        C10202j.m34178b(eVar, "containingClass");
        this.f27725c = eVar;
        boolean z = eVar.mo33763g() == C10345f.ENUM_CLASS;
        if (!C10485x.f28360a || z) {
            this.f27724b = iVar.mo38401a(new C10104a(this));
            return;
        }
        throw new AssertionError("Class should be an enum: " + this.f27725c);
    }

    /* renamed from: c */
    private final List<C10360m0> m34012c() {
        return (List) C11816h.m38876a(this.f27724b, (Object) this, (C9168l<?>) f27723d[0]);
    }

    /* renamed from: b */
    public Void mo33917b(C9939f fVar, C9398b bVar) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVar, "location");
        return null;
    }

    /* renamed from: a */
    public List<C10360m0> m34016a(C10088d dVar, C9113l<? super C9939f, Boolean> lVar) {
        C10202j.m34178b(dVar, "kindFilter");
        C10202j.m34178b(lVar, "nameFilter");
        return m34012c();
    }

    /* renamed from: a */
    public ArrayList<C10360m0> m34014a(C9939f fVar, C9398b bVar) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVar, "location");
        List<C10360m0> c = m34012c();
        ArrayList<C10360m0> arrayList = new ArrayList<>(1);
        for (T next : c) {
            if (C10202j.m34176a((Object) ((C10360m0) next).getName(), (Object) fVar)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
