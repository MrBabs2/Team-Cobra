package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10240b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10364o;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.x */
/* compiled from: PackageFragmentDescriptorImpl.kt */
public abstract class C10338x extends C10311k implements C10240b0 {

    /* renamed from: j */
    private final C9934b f28126j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10338x(C10393y yVar, C9934b bVar) {
        super(yVar, C10249g.f27910c.mo35429a(), bVar.mo35002f(), C10362n0.f28175a);
        C10202j.m34178b(yVar, "module");
        C10202j.m34178b(bVar, "fqName");
        this.f28126j = bVar;
    }

    /* renamed from: a */
    public <R, D> R mo35440a(C10364o<R, D> oVar, D d) {
        C10202j.m34178b(oVar, "visitor");
        return oVar.mo35120a((C10240b0) this, d);
    }

    /* renamed from: c */
    public final C9934b mo35425c() {
        return this.f28126j;
    }

    /* renamed from: p */
    public C10362n0 mo33773p() {
        C10362n0 n0Var = C10362n0.f28175a;
        C10202j.m34174a((Object) n0Var, "SourceElement.NO_SOURCE");
        return n0Var;
    }

    public String toString() {
        return "package " + this.f28126j;
    }

    /* renamed from: b */
    public C10393y m34838b() {
        C10359m b = super.mo33762b();
        if (b != null) {
            return (C10393y) b;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
    }
}
