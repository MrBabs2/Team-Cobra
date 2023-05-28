package kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b;

import java.util.Set;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

/* renamed from: kotlin.h0.u.e.k0.i.b.j */
/* compiled from: ClassDeserializer.kt */
public final class C11760j {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Set<C9933a> f31418c = C10528n0.m35731a(C9933a.m33260a(C9333g.f25907k.f25948c.mo35016h()));

    /* renamed from: d */
    public static final C11762b f31419d = new C11762b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C9113l<C11761a, C10342e> f31420a;

    /* renamed from: b */
    private final C11767l f31421b;

    /* renamed from: kotlin.h0.u.e.k0.i.b.j$a */
    /* compiled from: ClassDeserializer.kt */
    private static final class C11761a {

        /* renamed from: a */
        private final C9933a f31422a;

        /* renamed from: b */
        private final C11758h f31423b;

        public C11761a(C9933a aVar, C11758h hVar) {
            C10202j.m34178b(aVar, "classId");
            this.f31422a = aVar;
            this.f31423b = hVar;
        }

        /* renamed from: a */
        public final C11758h mo38343a() {
            return this.f31423b;
        }

        /* renamed from: b */
        public final C9933a mo38344b() {
            return this.f31422a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C11761a) && C10202j.m34176a((Object) this.f31422a, (Object) ((C11761a) obj).f31422a);
        }

        public int hashCode() {
            return this.f31422a.hashCode();
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.i.b.j$b */
    /* compiled from: ClassDeserializer.kt */
    public static final class C11762b {
        private C11762b() {
        }

        /* renamed from: a */
        public final Set<C9933a> mo38347a() {
            return C11760j.f31418c;
        }

        public /* synthetic */ C11762b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.i.b.j$c */
    /* compiled from: ClassDeserializer.kt */
    static final class C11763c extends C10203k implements C9113l<C11761a, C10342e> {

        /* renamed from: f */
        final /* synthetic */ C11760j f31424f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11763c(C11760j jVar) {
            super(1);
            this.f31424f = jVar;
        }

        /* renamed from: a */
        public final C10342e invoke(C11761a aVar) {
            C10202j.m34178b(aVar, RoomNotification.KEY);
            return this.f31424f.m38732a(aVar);
        }
    }

    public C11760j(C11767l lVar) {
        C10202j.m34178b(lVar, "components");
        this.f31421b = lVar;
        this.f31420a = lVar.mo38369q().mo38406b(new C11763c(this));
    }

    /* renamed from: a */
    public static /* synthetic */ C10342e m38733a(C11760j jVar, C9933a aVar, C11758h hVar, int i, Object obj) {
        if ((i & 2) != 0) {
            hVar = null;
        }
        return jVar.mo38342a(aVar, hVar);
    }

    /* renamed from: a */
    public final C10342e mo38342a(C9933a aVar, C11758h hVar) {
        C10202j.m34178b(aVar, "classId");
        return this.f31420a.invoke(new C11761a(aVar, hVar));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b9 A[EDGE_INSN: B:45:0x00b9->B:37:0x00b9 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.descriptors.C10342e m38732a(kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11760j.C11761a r13) {
        /*
            r12 = this;
            kotlin.h0.u.e.k0.e.a r0 = r13.mo38344b()
            kotlin.h0.u.e.k0.i.b.l r1 = r12.f31421b
            java.lang.Iterable r1 = r1.mo38361i()
            java.util.Iterator r1 = r1.iterator()
        L_0x000e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0021
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.c1.b r2 = (kotlin.reflect.jvm.internal.impl.descriptors.p260c1.C10268b) r2
            kotlin.reflect.jvm.internal.impl.descriptors.e r2 = r2.mo33747a((kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a) r0)
            if (r2 == 0) goto L_0x000e
            return r2
        L_0x0021:
            java.util.Set<kotlin.h0.u.e.k0.e.a> r1 = f31418c
            boolean r1 = r1.contains(r0)
            r2 = 0
            if (r1 == 0) goto L_0x002b
            return r2
        L_0x002b:
            kotlin.h0.u.e.k0.i.b.h r13 = r13.mo38343a()
            if (r13 == 0) goto L_0x0032
            goto L_0x003c
        L_0x0032:
            kotlin.h0.u.e.k0.i.b.l r13 = r12.f31421b
            kotlin.h0.u.e.k0.i.b.i r13 = r13.mo38355c()
            kotlin.h0.u.e.k0.i.b.h r13 = r13.mo34289a(r0)
        L_0x003c:
            if (r13 == 0) goto L_0x00f0
            kotlin.h0.u.e.k0.d.x0.c r1 = r13.mo38335a()
            kotlin.h0.u.e.k0.d.f r10 = r13.mo38336b()
            kotlin.h0.u.e.k0.d.x0.a r11 = r13.mo38337c()
            kotlin.reflect.jvm.internal.impl.descriptors.n0 r13 = r13.mo38338d()
            kotlin.h0.u.e.k0.e.a r3 = r0.mo34985c()
            java.lang.String r4 = "classId.shortClassName"
            if (r3 == 0) goto L_0x007a
            r5 = 2
            kotlin.reflect.jvm.internal.impl.descriptors.e r3 = m38733a(r12, r3, r2, r5, r2)
            boolean r5 = r3 instanceof kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p378g0.C11721e
            if (r5 != 0) goto L_0x0060
            r3 = r2
        L_0x0060:
            kotlin.h0.u.e.k0.i.b.g0.e r3 = (kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p378g0.C11721e) r3
            if (r3 == 0) goto L_0x0079
            kotlin.h0.u.e.k0.e.f r0 = r0.mo34989f()
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r0, (java.lang.String) r4)
            boolean r0 = r3.mo38304a((kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f) r0)
            if (r0 != 0) goto L_0x0072
            return r2
        L_0x0072:
            kotlin.h0.u.e.k0.i.b.n r0 = r3.mo38305r()
        L_0x0076:
            r4 = r0
            goto L_0x00e5
        L_0x0079:
            return r2
        L_0x007a:
            kotlin.h0.u.e.k0.i.b.l r3 = r12.f31421b
            kotlin.reflect.jvm.internal.impl.descriptors.c0 r3 = r3.mo38367o()
            kotlin.h0.u.e.k0.e.b r5 = r0.mo34986d()
            java.lang.String r6 = "classId.packageFqName"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r5, (java.lang.String) r6)
            java.util.List r3 = r3.mo33891a(r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x0091:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00b8
            java.lang.Object r5 = r3.next()
            r6 = r5
            kotlin.reflect.jvm.internal.impl.descriptors.b0 r6 = (kotlin.reflect.jvm.internal.impl.descriptors.C10240b0) r6
            boolean r7 = r6 instanceof kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11773p
            if (r7 == 0) goto L_0x00b4
            kotlin.h0.u.e.k0.i.b.p r6 = (kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11773p) r6
            kotlin.h0.u.e.k0.e.f r7 = r0.mo34989f()
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r7, (java.lang.String) r4)
            boolean r6 = r6.mo38385a((kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f) r7)
            if (r6 == 0) goto L_0x00b2
            goto L_0x00b4
        L_0x00b2:
            r6 = 0
            goto L_0x00b5
        L_0x00b4:
            r6 = 1
        L_0x00b5:
            if (r6 == 0) goto L_0x0091
            goto L_0x00b9
        L_0x00b8:
            r5 = r2
        L_0x00b9:
            r4 = r5
            kotlin.reflect.jvm.internal.impl.descriptors.b0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.C10240b0) r4
            if (r4 == 0) goto L_0x00f0
            kotlin.h0.u.e.k0.i.b.l r3 = r12.f31421b
            kotlin.h0.u.e.k0.d.x0.h r6 = new kotlin.h0.u.e.k0.d.x0.h
            kotlin.h0.u.e.k0.d.n0 r0 = r10.mo34461H()
            java.lang.String r2 = "classProto.typeTable"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r0, (java.lang.String) r2)
            r6.<init>(r0)
            kotlin.h0.u.e.k0.d.x0.k$a r0 = kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9886k.f27282c
            kotlin.h0.u.e.k0.d.t0 r2 = r10.mo34463J()
            java.lang.String r5 = "classProto.versionRequirementTable"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r2, (java.lang.String) r5)
            kotlin.h0.u.e.k0.d.x0.k r7 = r0.mo34869a(r2)
            r9 = 0
            r5 = r1
            r8 = r11
            kotlin.h0.u.e.k0.i.b.n r0 = r3.mo38351a(r4, r5, r6, r7, r8, r9)
            goto L_0x0076
        L_0x00e5:
            kotlin.h0.u.e.k0.i.b.g0.e r0 = new kotlin.h0.u.e.k0.i.b.g0.e
            r3 = r0
            r5 = r10
            r6 = r1
            r7 = r11
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            return r0
        L_0x00f0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11760j.m38732a(kotlin.h0.u.e.k0.i.b.j$a):kotlin.reflect.jvm.internal.impl.descriptors.e");
    }
}
