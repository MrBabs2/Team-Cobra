package kotlin.reflect.jvm.internal.impl.descriptors.p259b1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p391i0.C12079h;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b1.k */
/* compiled from: Annotations.kt */
public final class C10257k implements C10249g {

    /* renamed from: f */
    private final List<C10249g> f27920f;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b1.k$a */
    /* compiled from: Annotations.kt */
    static final class C10258a extends C10203k implements C9113l<C10249g, C10243c> {

        /* renamed from: f */
        final /* synthetic */ C9934b f27921f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10258a(C9934b bVar) {
            super(1);
            this.f27921f = bVar;
        }

        /* renamed from: a */
        public final C10243c invoke(C10249g gVar) {
            C10202j.m34178b(gVar, "it");
            return gVar.mo33885a(this.f27921f);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b1.k$b */
    /* compiled from: Annotations.kt */
    static final class C10259b extends C10203k implements C9113l<C10249g, C12079h<? extends C10243c>> {

        /* renamed from: f */
        public static final C10259b f27922f = new C10259b();

        C10259b() {
            super(1);
        }

        /* renamed from: a */
        public final C12079h<C10243c> invoke(C10249g gVar) {
            C10202j.m34178b(gVar, "it");
            return C10539w.m35782b(gVar);
        }
    }

    public C10257k(List<? extends C10249g> list) {
        C10202j.m34178b(list, "delegates");
        this.f27920f = list;
    }

    /* renamed from: a */
    public C10243c mo33885a(C9934b bVar) {
        C10202j.m34178b(bVar, "fqName");
        return (C10243c) C12090n.m39929f(C12090n.m39928e(C10539w.m35782b(this.f27920f), new C10258a(bVar)));
    }

    /* renamed from: b */
    public boolean mo33886b(C9934b bVar) {
        C10202j.m34178b(bVar, "fqName");
        for (T b : C10539w.m35782b(this.f27920f)) {
            if (b.mo33886b(bVar)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        List<C10249g> list = this.f27920f;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (C10249g isEmpty : list) {
            if (!isEmpty.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public Iterator<C10243c> iterator() {
        return C12090n.m39924c(C10539w.m35782b(this.f27920f), C10259b.f27922f).iterator();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C10257k(C10249g... gVarArr) {
        this((List<? extends C10249g>) C10519k.m35653k(gVarArr));
        C10202j.m34178b(gVarArr, "delegates");
    }
}
