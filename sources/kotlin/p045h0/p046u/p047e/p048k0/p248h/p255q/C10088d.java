package kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9113l;

/* renamed from: kotlin.h0.u.e.k0.h.q.d */
/* compiled from: MemberScope.kt */
public final class C10088d {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static int f27687c = 1;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final int f27688d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final int f27689e = f27705u.m33967i();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final int f27690f = f27705u.m33967i();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final int f27691g = f27705u.m33967i();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final int f27692h = f27705u.m33967i();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final int f27693i = f27705u.m33967i();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final int f27694j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final int f27695k;

    /* renamed from: l */
    private static final int f27696l;

    /* renamed from: m */
    private static final int f27697m;

    /* renamed from: n */
    public static final C10088d f27698n;

    /* renamed from: o */
    public static final C10088d f27699o = new C10088d(f27697m, (List) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: p */
    public static final C10088d f27700p = new C10088d(f27695k, (List) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: q */
    public static final C10088d f27701q = new C10088d(f27692h, (List) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: r */
    public static final C10088d f27702r = new C10088d(f27693i, (List) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: s */
    private static final List<C10089a.C10090a> f27703s;

    /* renamed from: t */
    private static final List<C10089a.C10090a> f27704t;

    /* renamed from: u */
    public static final C10089a f27705u;

    /* renamed from: a */
    private final int f27706a;

    /* renamed from: b */
    private final List<C10085c> f27707b;

    /* renamed from: kotlin.h0.u.e.k0.h.q.d$a */
    /* compiled from: MemberScope.kt */
    public static final class C10089a {

        /* renamed from: kotlin.h0.u.e.k0.h.q.d$a$a */
        /* compiled from: MemberScope.kt */
        private static final class C10090a {

            /* renamed from: a */
            private final int f27708a;

            /* renamed from: b */
            private final String f27709b;

            public C10090a(int i, String str) {
                C10202j.m34178b(str, "name");
                this.f27708a = i;
                this.f27709b = str;
            }

            /* renamed from: a */
            public final int mo35309a() {
                return this.f27708a;
            }

            /* renamed from: b */
            public final String mo35310b() {
                return this.f27709b;
            }
        }

        private C10089a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public final int m33967i() {
            int g = C10088d.f27687c;
            C10088d.f27687c = C10088d.f27687c << 1;
            return g;
        }

        /* renamed from: b */
        public final int mo35302b() {
            return C10088d.f27695k;
        }

        /* renamed from: c */
        public final int mo35303c() {
            return C10088d.f27692h;
        }

        /* renamed from: d */
        public final int mo35304d() {
            return C10088d.f27688d;
        }

        /* renamed from: e */
        public final int mo35305e() {
            return C10088d.f27691g;
        }

        /* renamed from: f */
        public final int mo35306f() {
            return C10088d.f27689e;
        }

        /* renamed from: g */
        public final int mo35307g() {
            return C10088d.f27690f;
        }

        /* renamed from: h */
        public final int mo35308h() {
            return C10088d.f27693i;
        }

        public /* synthetic */ C10089a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo35301a() {
            return C10088d.f27694j;
        }
    }

    static {
        C10089a.C10090a aVar;
        C10089a.C10090a aVar2;
        Class<C10088d> cls = C10088d.class;
        C10089a aVar3 = new C10089a((DefaultConstructorMarker) null);
        f27705u = aVar3;
        f27688d = aVar3.m33967i();
        int a = f27705u.m33967i() - 1;
        f27694j = a;
        int i = f27688d;
        int i2 = f27689e;
        f27695k = i | i2 | f27690f;
        int i3 = f27692h;
        int i4 = f27693i;
        f27696l = i2 | i3 | i4;
        f27697m = i3 | i4;
        f27698n = new C10088d(a, (List) null, 2, (DefaultConstructorMarker) null);
        new C10088d(f27688d, (List) null, 2, (DefaultConstructorMarker) null);
        new C10088d(f27689e, (List) null, 2, (DefaultConstructorMarker) null);
        new C10088d(f27690f, (List) null, 2, (DefaultConstructorMarker) null);
        new C10088d(f27691g, (List) null, 2, (DefaultConstructorMarker) null);
        new C10088d(f27696l, (List) null, 2, (DefaultConstructorMarker) null);
        Field[] fields = cls.getFields();
        C10202j.m34174a((Object) fields, "T::class.java.fields");
        ArrayList<Field> arrayList = new ArrayList<>();
        for (Field field : fields) {
            C10202j.m34174a((Object) field, "it");
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get((Object) null);
            if (!(obj instanceof C10088d)) {
                obj = null;
            }
            C10088d dVar = (C10088d) obj;
            if (dVar != null) {
                int i5 = dVar.f27706a;
                C10202j.m34174a((Object) field2, "field");
                String name = field2.getName();
                C10202j.m34174a((Object) name, "field.name");
                aVar2 = new C10089a.C10090a(i5, name);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                arrayList2.add(aVar2);
            }
        }
        f27703s = C10539w.m35815n(arrayList2);
        Field[] fields2 = cls.getFields();
        C10202j.m34174a((Object) fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            C10202j.m34174a((Object) field3, "it");
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList<>();
        for (Object next : arrayList3) {
            Field field4 = (Field) next;
            C10202j.m34174a((Object) field4, "it");
            if (C10202j.m34176a((Object) field4.getType(), (Object) Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field5 : arrayList4) {
            Object obj2 = field5.get((Object) null);
            if (obj2 != null) {
                int intValue = ((Integer) obj2).intValue();
                if (intValue == ((-intValue) & intValue)) {
                    C10202j.m34174a((Object) field5, "field");
                    String name2 = field5.getName();
                    C10202j.m34174a((Object) name2, "field.name");
                    aVar = new C10089a.C10090a(intValue, name2);
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    arrayList5.add(aVar);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
        }
        f27704t = C10539w.m35815n(arrayList5);
    }

    public C10088d(int i, List<? extends C10085c> list) {
        C10202j.m34178b(list, "excludes");
        this.f27707b = list;
        for (C10085c a : list) {
            i &= a.mo35294a() ^ -1;
        }
        this.f27706a = i;
    }

    /* renamed from: a */
    public final List<C10085c> mo35296a() {
        return this.f27707b;
    }

    /* renamed from: b */
    public final int mo35298b() {
        return this.f27706a;
    }

    public String toString() {
        T t;
        boolean z;
        Iterator<T> it = f27703s.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C10089a.C10090a) t).mo35309a() == this.f27706a) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C10089a.C10090a aVar = (C10089a.C10090a) t;
        String b = aVar != null ? aVar.mo35310b() : null;
        if (b == null) {
            List<C10089a.C10090a> list = f27704t;
            ArrayList arrayList = new ArrayList();
            for (C10089a.C10090a aVar2 : list) {
                String b2 = mo35297a(aVar2.mo35309a()) ? aVar2.mo35310b() : null;
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
            b = C10539w.m35773a(arrayList, " | ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C9113l) null, 62, (Object) null);
        }
        return "DescriptorKindFilter(" + b + ", " + this.f27707b + ')';
    }

    /* renamed from: a */
    public final boolean mo35297a(int i) {
        return (i & this.f27706a) != 0;
    }

    /* renamed from: b */
    public final C10088d mo35299b(int i) {
        int i2 = i & this.f27706a;
        if (i2 == 0) {
            return null;
        }
        return new C10088d(i2, this.f27707b);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10088d(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? C10529o.m35736a() : list);
    }
}
