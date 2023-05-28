package kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11715g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p236y.C9641a;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9724o;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9748b;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9875c;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10029a;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10030a0;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10034d;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10036f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10037g;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10038h;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10042j;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10043k;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10047m;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10056r;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10061s;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10064v;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10066x;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10067y;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10068z;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10232a0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10376t;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10243c;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10245d;
import kotlin.reflect.jvm.internal.impl.utils.C12141a;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;

/* renamed from: kotlin.h0.u.e.k0.c.b.c */
/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
public final class C9701c extends C9679a<C10243c, C10037g<?>> {

    /* renamed from: d */
    private final C11715g f26664d;

    /* renamed from: e */
    private final C10393y f26665e;

    /* renamed from: f */
    private final C10232a0 f26666f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9701c(C10393y yVar, C10232a0 a0Var, C11817i iVar, C9719m mVar) {
        super(iVar, mVar);
        C10202j.m34178b(yVar, "module");
        C10202j.m34178b(a0Var, "notFoundClasses");
        C10202j.m34178b(iVar, "storageManager");
        C10202j.m34178b(mVar, "kotlinClassFinder");
        this.f26665e = yVar;
        this.f26666f = a0Var;
        this.f26664d = new C11715g(yVar, a0Var);
    }

    /* renamed from: kotlin.h0.u.e.k0.c.b.c$a */
    /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    public static final class C9702a implements C9724o.C9725a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final HashMap<C9939f, C10037g<?>> f26667a = new HashMap<>();

        /* renamed from: b */
        final /* synthetic */ C9701c f26668b;

        /* renamed from: c */
        final /* synthetic */ C10342e f26669c;

        /* renamed from: d */
        final /* synthetic */ List f26670d;

        /* renamed from: e */
        final /* synthetic */ C10362n0 f26671e;

        /* renamed from: kotlin.h0.u.e.k0.c.b.c$a$a */
        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        public static final class C9703a implements C9724o.C9725a {

            /* renamed from: a */
            private final /* synthetic */ C9724o.C9725a f26672a;

            /* renamed from: b */
            final /* synthetic */ C9702a f26673b;

            /* renamed from: c */
            final /* synthetic */ C9724o.C9725a f26674c;

            /* renamed from: d */
            final /* synthetic */ C9939f f26675d;

            /* renamed from: e */
            final /* synthetic */ ArrayList f26676e;

            C9703a(C9702a aVar, C9724o.C9725a aVar2, C9939f fVar, ArrayList arrayList) {
                this.f26673b = aVar;
                this.f26674c = aVar2;
                this.f26675d = fVar;
                this.f26676e = arrayList;
                this.f26672a = aVar2;
            }

            /* renamed from: a */
            public C9724o.C9725a mo34275a(C9939f fVar, C9933a aVar) {
                C10202j.m34178b(fVar, "name");
                C10202j.m34178b(aVar, "classId");
                return this.f26672a.mo34275a(fVar, aVar);
            }

            /* renamed from: a */
            public C9724o.C9726b mo34276a(C9939f fVar) {
                C10202j.m34178b(fVar, "name");
                return this.f26672a.mo34276a(fVar);
            }

            /* renamed from: a */
            public void mo34277a() {
                this.f26674c.mo34277a();
                this.f26673b.f26667a.put(this.f26675d, new C10029a((C10243c) C10539w.m35809i(this.f26676e)));
            }

            /* renamed from: a */
            public void mo34278a(C9939f fVar, Object obj) {
                this.f26672a.mo34278a(fVar, obj);
            }

            /* renamed from: a */
            public void mo34279a(C9939f fVar, C9933a aVar, C9939f fVar2) {
                C10202j.m34178b(fVar, "name");
                C10202j.m34178b(aVar, "enumClassId");
                C10202j.m34178b(fVar2, "enumEntryName");
                this.f26672a.mo34279a(fVar, aVar, fVar2);
            }

            /* renamed from: a */
            public void mo34280a(C9939f fVar, C10036f fVar2) {
                C10202j.m34178b(fVar, "name");
                C10202j.m34178b(fVar2, DonationsAnalytics.VALUE);
                this.f26672a.mo34280a(fVar, fVar2);
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.c.b.c$a$b */
        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        public static final class C9704b implements C9724o.C9726b {

            /* renamed from: a */
            private final ArrayList<C10037g<?>> f26677a = new ArrayList<>();

            /* renamed from: b */
            final /* synthetic */ C9702a f26678b;

            /* renamed from: c */
            final /* synthetic */ C9939f f26679c;

            C9704b(C9702a aVar, C9939f fVar) {
                this.f26678b = aVar;
                this.f26679c = fVar;
            }

            /* renamed from: a */
            public void mo34271a(Object obj) {
                this.f26677a.add(this.f26678b.m31295b(this.f26679c, obj));
            }

            /* renamed from: a */
            public void mo34272a(C9933a aVar, C9939f fVar) {
                C10202j.m34178b(aVar, "enumClassId");
                C10202j.m34178b(fVar, "enumEntryName");
                this.f26677a.add(new C10042j(aVar, fVar));
            }

            /* renamed from: a */
            public void mo34273a(C10036f fVar) {
                C10202j.m34178b(fVar, DonationsAnalytics.VALUE);
                this.f26677a.add(new C10056r(fVar));
            }

            /* renamed from: a */
            public void mo34270a() {
                C10386v0 a = C9641a.m31095a(this.f26679c, this.f26678b.f26669c);
                if (a != null) {
                    HashMap a2 = this.f26678b.f26667a;
                    C9939f fVar = this.f26679c;
                    C10038h hVar = C10038h.f27626a;
                    List<T> a3 = C12141a.m40131a(this.f26677a);
                    C11824b0 type = a.getType();
                    C10202j.m34174a((Object) type, "parameter.type");
                    a2.put(fVar, hVar.mo35247a((List<? extends C10037g<?>>) a3, type));
                }
            }
        }

        C9702a(C9701c cVar, C10342e eVar, List list, C10362n0 n0Var) {
            this.f26668b = cVar;
            this.f26669c = eVar;
            this.f26670d = list;
            this.f26671e = n0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final C10037g<?> m31295b(C9939f fVar, Object obj) {
            C10037g<?> a = C10038h.f27626a.mo35248a(obj);
            if (a != null) {
                return a;
            }
            C10043k.C10044a aVar = C10043k.f27631b;
            return aVar.mo35252a("Unsupported annotation argument: " + fVar);
        }

        /* renamed from: a */
        public void mo34278a(C9939f fVar, Object obj) {
            if (fVar != null) {
                this.f26667a.put(fVar, m31295b(fVar, obj));
            }
        }

        /* renamed from: a */
        public void mo34280a(C9939f fVar, C10036f fVar2) {
            C10202j.m34178b(fVar, "name");
            C10202j.m34178b(fVar2, DonationsAnalytics.VALUE);
            this.f26667a.put(fVar, new C10056r(fVar2));
        }

        /* renamed from: a */
        public void mo34279a(C9939f fVar, C9933a aVar, C9939f fVar2) {
            C10202j.m34178b(fVar, "name");
            C10202j.m34178b(aVar, "enumClassId");
            C10202j.m34178b(fVar2, "enumEntryName");
            this.f26667a.put(fVar, new C10042j(aVar, fVar2));
        }

        /* renamed from: a */
        public C9724o.C9726b mo34276a(C9939f fVar) {
            C10202j.m34178b(fVar, "name");
            return new C9704b(this, fVar);
        }

        /* renamed from: a */
        public C9724o.C9725a mo34275a(C9939f fVar, C9933a aVar) {
            C10202j.m34178b(fVar, "name");
            C10202j.m34178b(aVar, "classId");
            ArrayList arrayList = new ArrayList();
            C9701c cVar = this.f26668b;
            C10362n0 n0Var = C10362n0.f28175a;
            C10202j.m34174a((Object) n0Var, "SourceElement.NO_SOURCE");
            C9724o.C9725a a = cVar.mo34246a(aVar, n0Var, arrayList);
            if (a != null) {
                return new C9703a(this, a, fVar, arrayList);
            }
            C10202j.m34172a();
            throw null;
        }

        /* renamed from: a */
        public void mo34277a() {
            this.f26670d.add(new C10245d(this.f26669c.mo35445o(), this.f26667a, this.f26671e));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10243c m31292a(C9748b bVar, C9875c cVar) {
        C10202j.m34178b(bVar, "proto");
        C10202j.m34178b(cVar, "nameResolver");
        return this.f26664d.mo38291a(bVar, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10037g<?> m31290a(String str, Object obj) {
        C10202j.m34178b(str, "desc");
        C10202j.m34178b(obj, "initializer");
        boolean z = false;
        if (C12131w.m40085a((CharSequence) "ZBCS", (CharSequence) str, false, 2, (Object) null)) {
            int intValue = ((Integer) obj).intValue();
            int hashCode = str.hashCode();
            if (hashCode != 66) {
                if (hashCode != 67) {
                    if (hashCode != 83) {
                        if (hashCode == 90 && str.equals("Z")) {
                            if (intValue != 0) {
                                z = true;
                            }
                            obj = Boolean.valueOf(z);
                        }
                    } else if (str.equals("S")) {
                        obj = Short.valueOf((short) intValue);
                    }
                } else if (str.equals("C")) {
                    obj = Character.valueOf((char) intValue);
                }
            } else if (str.equals("B")) {
                obj = Byte.valueOf((byte) intValue);
            }
            throw new AssertionError(str);
        }
        return C10038h.f27626a.mo35248a(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10037g<?> mo34235a(C10037g<?> gVar) {
        C10037g<?> zVar;
        C10202j.m34178b(gVar, "constant");
        if (gVar instanceof C10034d) {
            zVar = new C10066x(((Number) ((C10034d) gVar).mo35244a()).byteValue());
        } else if (gVar instanceof C10064v) {
            zVar = new C10030a0(((Number) ((C10064v) gVar).mo35244a()).shortValue());
        } else if (gVar instanceof C10047m) {
            zVar = new C10067y(((Number) ((C10047m) gVar).mo35244a()).intValue());
        } else if (!(gVar instanceof C10061s)) {
            return gVar;
        } else {
            zVar = new C10068z(((Number) ((C10061s) gVar).mo35244a()).longValue());
        }
        return zVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9724o.C9725a mo34246a(C9933a aVar, C10362n0 n0Var, List<C10243c> list) {
        C10202j.m34178b(aVar, "annotationClassId");
        C10202j.m34178b(n0Var, "source");
        C10202j.m34178b(list, "result");
        return new C9702a(this, m31285a(aVar), list, n0Var);
    }

    /* renamed from: a */
    private final C10342e m31285a(C9933a aVar) {
        return C10376t.m35017a(this.f26665e, aVar, this.f26666f);
    }
}
