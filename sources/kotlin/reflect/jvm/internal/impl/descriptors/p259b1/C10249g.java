package kotlin.reflect.jvm.internal.impl.descriptors.p259b1;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.p258c0.C10190a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b1.g */
/* compiled from: Annotations.kt */
public interface C10249g extends Iterable<C10243c>, C10190a {

    /* renamed from: c */
    public static final C10250a f27910c = C10250a.f27912b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b1.g$a */
    /* compiled from: Annotations.kt */
    public static final class C10250a {

        /* renamed from: a */
        private static final C10249g f27911a = new C10251a();

        /* renamed from: b */
        static final /* synthetic */ C10250a f27912b = new C10250a();

        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b1.g$a$a */
        /* compiled from: Annotations.kt */
        public static final class C10251a implements C10249g {
            C10251a() {
            }

            /* renamed from: a */
            public Void mo33885a(C9934b bVar) {
                C10202j.m34178b(bVar, "fqName");
                return null;
            }

            /* renamed from: b */
            public boolean mo33886b(C9934b bVar) {
                C10202j.m34178b(bVar, "fqName");
                return C10252b.m34290b(this, bVar);
            }

            public boolean isEmpty() {
                return true;
            }

            public Iterator<C10243c> iterator() {
                return C10529o.m35736a().iterator();
            }

            public String toString() {
                return "EMPTY";
            }
        }

        private C10250a() {
        }

        /* renamed from: a */
        public final C10249g mo35429a() {
            return f27911a;
        }

        /* renamed from: a */
        public final C10249g mo35430a(List<? extends C10243c> list) {
            C10202j.m34178b(list, "annotations");
            return list.isEmpty() ? f27911a : new C10253h(list);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b1.g$b */
    /* compiled from: Annotations.kt */
    public static final class C10252b {
        /* renamed from: a */
        public static C10243c m34289a(C10249g gVar, C9934b bVar) {
            Object obj;
            C10202j.m34178b(bVar, "fqName");
            Iterator it = gVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C10202j.m34176a((Object) ((C10243c) obj).mo33922c(), (Object) bVar)) {
                    break;
                }
            }
            return (C10243c) obj;
        }

        /* renamed from: b */
        public static boolean m34290b(C10249g gVar, C9934b bVar) {
            C10202j.m34178b(bVar, "fqName");
            return gVar.mo33885a(bVar) != null;
        }
    }

    /* renamed from: a */
    C10243c mo33885a(C9934b bVar);

    /* renamed from: b */
    boolean mo33886b(C9934b bVar);

    boolean isEmpty();
}
