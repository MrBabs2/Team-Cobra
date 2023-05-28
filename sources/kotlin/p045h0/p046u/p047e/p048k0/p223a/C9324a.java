package kotlin.p045h0.p046u.p047e.p048k0.p223a;

import java.util.ServiceLoader;
import kotlin.C10219k;
import kotlin.C9134f;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10265c0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import kotlin.reflect.jvm.internal.impl.descriptors.p260c1.C10266a;
import kotlin.reflect.jvm.internal.impl.descriptors.p260c1.C10268b;
import kotlin.reflect.jvm.internal.impl.descriptors.p260c1.C10269c;

/* renamed from: kotlin.h0.u.e.k0.a.a */
/* compiled from: BuiltInsLoader.kt */
public interface C9324a {

    /* renamed from: a */
    public static final C9325a f25892a = C9325a.f25895c;

    /* renamed from: kotlin.h0.u.e.k0.a.a$a */
    /* compiled from: BuiltInsLoader.kt */
    public static final class C9325a {

        /* renamed from: a */
        static final /* synthetic */ C9168l[] f25893a = {C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a(C9325a.class), "Instance", "getInstance()Lorg/jetbrains/kotlin/builtins/BuiltInsLoader;"))};

        /* renamed from: b */
        private static final C9134f f25894b = C10181i.m34135a(C10219k.PUBLICATION, C9326a.f25896f);

        /* renamed from: c */
        static final /* synthetic */ C9325a f25895c = new C9325a();

        /* renamed from: kotlin.h0.u.e.k0.a.a$a$a */
        /* compiled from: BuiltInsLoader.kt */
        static final class C9326a extends C10203k implements C9102a<C9324a> {

            /* renamed from: f */
            public static final C9326a f25896f = new C9326a();

            C9326a() {
                super(0);
            }

            public final C9324a invoke() {
                Class<C9324a> cls = C9324a.class;
                ServiceLoader<S> load = ServiceLoader.load(cls, cls.getClassLoader());
                C10202j.m34174a((Object) load, "implementations");
                C9324a aVar = (C9324a) C10539w.m35802f(load);
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        }

        private C9325a() {
        }

        /* renamed from: a */
        public final C9324a mo33688a() {
            C9134f fVar = f25894b;
            C9168l lVar = f25893a[0];
            return (C9324a) fVar.getValue();
        }
    }

    /* renamed from: a */
    C10265c0 mo33687a(C11817i iVar, C10393y yVar, Iterable<? extends C10268b> iterable, C10269c cVar, C10266a aVar, boolean z);
}
