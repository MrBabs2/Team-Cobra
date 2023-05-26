package kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11812d;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10240b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10265c0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;

/* renamed from: kotlin.h0.u.e.k0.i.b.a */
/* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
public abstract class C11687a implements C10265c0 {

    /* renamed from: a */
    protected C11767l f31251a;

    /* renamed from: b */
    private final C11812d<C9934b, C10240b0> f31252b;

    /* renamed from: c */
    private final C11817i f31253c;

    /* renamed from: d */
    private final C11782u f31254d;

    /* renamed from: e */
    private final C10393y f31255e;

    /* renamed from: kotlin.h0.u.e.k0.i.b.a$a */
    /* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
    static final class C11688a extends C10203k implements C9113l<C9934b, C11773p> {

        /* renamed from: f */
        final /* synthetic */ C11687a f31256f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11688a(C11687a aVar) {
            super(1);
            this.f31256f = aVar;
        }

        /* renamed from: a */
        public final C11773p invoke(C9934b bVar) {
            C10202j.m34178b(bVar, "fqName");
            C11773p b = this.f31256f.mo33824b(bVar);
            if (b == null) {
                return null;
            }
            b.mo38384a(this.f31256f.mo38250a());
            return b;
        }
    }

    public C11687a(C11817i iVar, C11782u uVar, C10393y yVar) {
        C10202j.m34178b(iVar, "storageManager");
        C10202j.m34178b(uVar, "finder");
        C10202j.m34178b(yVar, "moduleDescriptor");
        this.f31253c = iVar;
        this.f31254d = uVar;
        this.f31255e = yVar;
        this.f31252b = iVar.mo38406b(new C11688a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C11767l mo38250a() {
        C11767l lVar = this.f31251a;
        if (lVar != null) {
            return lVar;
        }
        C10202j.m34181d("components");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C11773p mo33824b(C9934b bVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C11782u mo38252b() {
        return this.f31254d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C10393y mo38253c() {
        return this.f31255e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C11817i mo38254d() {
        return this.f31253c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo38251a(C11767l lVar) {
        C10202j.m34178b(lVar, "<set-?>");
        this.f31251a = lVar;
    }

    /* renamed from: a */
    public List<C10240b0> mo33891a(C9934b bVar) {
        C10202j.m34178b(bVar, "fqName");
        return C10529o.m35739b(this.f31252b.invoke(bVar));
    }

    /* renamed from: a */
    public Collection<C9934b> mo33890a(C9934b bVar, C9113l<? super C9939f, Boolean> lVar) {
        C10202j.m34178b(bVar, "fqName");
        C10202j.m34178b(lVar, "nameFilter");
        return C10530o0.m35747a();
    }
}
