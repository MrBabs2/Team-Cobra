package kotlin.p045h0.p046u.p047e.p048k0.p223a.p225o;

import java.util.List;
import kotlin.C10485x;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11814f;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11816h;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import kotlin.reflect.jvm.internal.impl.descriptors.p260c1.C10266a;
import kotlin.reflect.jvm.internal.impl.descriptors.p260c1.C10268b;
import kotlin.reflect.jvm.internal.impl.descriptors.p260c1.C10269c;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10334v;

/* renamed from: kotlin.h0.u.e.k0.a.o.e */
/* compiled from: JvmBuiltIns.kt */
public final class C9373e extends C9333g {

    /* renamed from: p */
    static final /* synthetic */ C9168l[] f26079p = {C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a(C9373e.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsSettings;"))};
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C10393y f26080m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f26081n = true;

    /* renamed from: o */
    private final C11814f f26082o;

    /* renamed from: kotlin.h0.u.e.k0.a.o.e$a */
    /* compiled from: JvmBuiltIns.kt */
    public enum C9374a {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    /* renamed from: kotlin.h0.u.e.k0.a.o.e$b */
    /* compiled from: JvmBuiltIns.kt */
    static final class C9375b extends C10203k implements C9102a<C9380h> {

        /* renamed from: f */
        final /* synthetic */ C9373e f26087f;

        /* renamed from: g */
        final /* synthetic */ C11817i f26088g;

        /* renamed from: kotlin.h0.u.e.k0.a.o.e$b$a */
        /* compiled from: JvmBuiltIns.kt */
        static final class C9376a extends C10203k implements C9102a<C10393y> {

            /* renamed from: f */
            final /* synthetic */ C9375b f26089f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9376a(C9375b bVar) {
                super(0);
                this.f26089f = bVar;
            }

            public final C10393y invoke() {
                C10393y a = this.f26089f.f26087f.f26080m;
                if (a != null) {
                    return a;
                }
                throw new AssertionError("JvmBuiltins has not been initialized properly");
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.a.o.e$b$b */
        /* compiled from: JvmBuiltIns.kt */
        static final class C9377b extends C10203k implements C9102a<Boolean> {

            /* renamed from: f */
            final /* synthetic */ C9375b f26090f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9377b(C9375b bVar) {
                super(0);
                this.f26090f = bVar;
            }

            public final boolean invoke() {
                if (this.f26090f.f26087f.f26080m != null) {
                    return this.f26090f.f26087f.f26081n;
                }
                throw new AssertionError("JvmBuiltins has not been initialized properly");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9375b(C9373e eVar, C11817i iVar) {
            super(0);
            this.f26087f = eVar;
            this.f26088g = iVar;
        }

        public final C9380h invoke() {
            C10334v f = this.f26087f.mo33710f();
            C10202j.m34174a((Object) f, "builtInsModule");
            return new C9380h(f, this.f26088g, new C9376a(this), new C9377b(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9373e(C11817i iVar, C9374a aVar) {
        super(iVar);
        C10202j.m34178b(iVar, "storageManager");
        C10202j.m34178b(aVar, "kind");
        this.f26082o = iVar.mo38401a(new C9375b(this, iVar));
        int i = C9378f.f26091a[aVar.ordinal()];
        if (i == 2) {
            mo33703a(false);
        } else if (i == 3) {
            mo33703a(true);
        }
    }

    /* renamed from: G */
    public final C9380h mo33822G() {
        return (C9380h) C11816h.m38876a(this.f26082o, (Object) this, (C9168l<?>) f26079p[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public C10269c mo33729y() {
        return mo33822G();
    }

    /* renamed from: a */
    public final void mo33823a(C10393y yVar, boolean z) {
        C10202j.m34178b(yVar, "moduleDescriptor");
        boolean z2 = this.f26080m == null;
        if (!C10485x.f28360a || z2) {
            this.f26080m = yVar;
            this.f26081n = z;
            return;
        }
        throw new AssertionError("JvmBuiltins repeated initialization");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public List<C10268b> m30395j() {
        Iterable<C10268b> j = super.mo33714j();
        C10202j.m34174a((Object) j, "super.getClassDescriptorFactories()");
        C11817i A = mo33691A();
        C10202j.m34174a((Object) A, "storageManager");
        C10334v f = mo33710f();
        C10202j.m34174a((Object) f, "builtInsModule");
        return C10539w.m35794d(j, new C9369d(A, f, (C9113l) null, 4, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10266a mo33699a() {
        return mo33822G();
    }
}
