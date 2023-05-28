package kotlin.reflect.jvm.internal.impl.descriptors.p259b1;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b1.h */
/* compiled from: AnnotationsImpl.kt */
public final class C10253h implements C10249g {

    /* renamed from: f */
    private final List<C10243c> f27913f;

    public C10253h(List<? extends C10243c> list) {
        C10202j.m34178b(list, "annotations");
        this.f27913f = list;
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
        return this.f27913f.isEmpty();
    }

    public Iterator<C10243c> iterator() {
        return this.f27913f.iterator();
    }

    public String toString() {
        return this.f27913f.toString();
    }
}
