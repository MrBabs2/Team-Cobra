package kotlin.p045h0.p046u.p047e.p048k0.p248h.p254p;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9340h;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;

/* renamed from: kotlin.h0.u.e.k0.h.p.d */
/* compiled from: JvmPrimitiveType */
public enum C10081d {
    BOOLEAN(C9340h.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(C9340h.CHAR, "char", "C", "java.lang.Character"),
    BYTE(C9340h.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(C9340h.SHORT, "short", "S", "java.lang.Short"),
    INT(C9340h.INT, "int", "I", "java.lang.Integer"),
    FLOAT(C9340h.FLOAT, "float", "F", "java.lang.Float"),
    LONG(C9340h.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(C9340h.DOUBLE, "double", "D", "java.lang.Double");
    

    /* renamed from: r */
    private static final Set<C9934b> f27672r = null;

    /* renamed from: s */
    private static final Map<String, C10081d> f27673s = null;

    /* renamed from: t */
    private static final Map<C9340h, C10081d> f27674t = null;

    /* renamed from: u */
    private static final Map<String, C10081d> f27675u = null;

    /* renamed from: f */
    private final C9340h f27677f;

    /* renamed from: g */
    private final String f27678g;

    /* renamed from: h */
    private final String f27679h;

    /* renamed from: i */
    private final C9934b f27680i;

    static {
        int i;
        f27672r = new HashSet();
        f27673s = new HashMap();
        f27674t = new EnumMap(C9340h.class);
        f27675u = new HashMap();
        for (C10081d dVar : values()) {
            f27672r.add(dVar.mo35290i());
            f27673s.put(dVar.mo35288d(), dVar);
            f27674t.put(dVar.mo35289e(), dVar);
            f27675u.put(dVar.mo35287a(), dVar);
        }
    }

    private C10081d(C9340h hVar, String str, String str2, String str3) {
        if (hVar == null) {
            m33930a(6);
            throw null;
        } else if (str == null) {
            m33930a(7);
            throw null;
        } else if (str2 == null) {
            m33930a(8);
            throw null;
        } else if (str3 != null) {
            this.f27677f = hVar;
            this.f27678g = str;
            this.f27679h = str2;
            this.f27680i = new C9934b(str3);
        } else {
            m33930a(9);
            throw null;
        }
    }

    /* renamed from: a */
    public static C10081d m33928a(String str) {
        if (str != null) {
            C10081d dVar = f27673s.get(str);
            if (dVar == null) {
                throw new AssertionError("Non-primitive type name passed: " + str);
            } else if (dVar != null) {
                return dVar;
            } else {
                m33930a(2);
                throw null;
            }
        } else {
            m33930a(1);
            throw null;
        }
    }

    /* renamed from: d */
    public String mo35288d() {
        String str = this.f27678g;
        if (str != null) {
            return str;
        }
        m33930a(11);
        throw null;
    }

    /* renamed from: e */
    public C9340h mo35289e() {
        C9340h hVar = this.f27677f;
        if (hVar != null) {
            return hVar;
        }
        m33930a(10);
        throw null;
    }

    /* renamed from: i */
    public C9934b mo35290i() {
        C9934b bVar = this.f27680i;
        if (bVar != null) {
            return bVar;
        }
        m33930a(13);
        throw null;
    }

    /* renamed from: a */
    public static C10081d m33929a(C9340h hVar) {
        if (hVar != null) {
            C10081d dVar = f27674t.get(hVar);
            if (dVar != null) {
                return dVar;
            }
            m33930a(4);
            throw null;
        }
        m33930a(3);
        throw null;
    }

    /* renamed from: a */
    public String mo35287a() {
        String str = this.f27679h;
        if (str != null) {
            return str;
        }
        m33930a(12);
        throw null;
    }
}
