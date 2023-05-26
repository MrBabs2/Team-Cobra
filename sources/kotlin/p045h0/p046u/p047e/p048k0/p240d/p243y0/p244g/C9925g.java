package kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9875c;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a;
import kotlin.p262y.C10494b0;

/* renamed from: kotlin.h0.u.e.k0.d.y0.g.g */
/* compiled from: JvmNameResolver.kt */
public final class C9925g implements C9875c {

    /* renamed from: e */
    private static final List<String> f27382e;

    /* renamed from: a */
    private final Set<Integer> f27383a;

    /* renamed from: b */
    private final List<C9890a.C9901e.C9904c> f27384b;

    /* renamed from: c */
    private final C9890a.C9901e f27385c;

    /* renamed from: d */
    private final String[] f27386d;

    /* renamed from: kotlin.h0.u.e.k0.d.y0.g.g$a */
    /* compiled from: JvmNameResolver.kt */
    public static final class C9926a {
        private C9926a() {
        }

        public /* synthetic */ C9926a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C9926a((DefaultConstructorMarker) null);
        List<String> b = C10529o.m35741b((T[]) new String[]{"kotlin/Any", "kotlin/Nothing", "kotlin/Unit", "kotlin/Throwable", "kotlin/Number", "kotlin/Byte", "kotlin/Double", "kotlin/Float", "kotlin/Int", "kotlin/Long", "kotlin/Short", "kotlin/Boolean", "kotlin/Char", "kotlin/CharSequence", "kotlin/String", "kotlin/Comparable", "kotlin/Enum", "kotlin/Array", "kotlin/ByteArray", "kotlin/DoubleArray", "kotlin/FloatArray", "kotlin/IntArray", "kotlin/LongArray", "kotlin/ShortArray", "kotlin/BooleanArray", "kotlin/CharArray", "kotlin/Cloneable", "kotlin/Annotation", "kotlin/collections/Iterable", "kotlin/collections/MutableIterable", "kotlin/collections/Collection", "kotlin/collections/MutableCollection", "kotlin/collections/List", "kotlin/collections/MutableList", "kotlin/collections/Set", "kotlin/collections/MutableSet", "kotlin/collections/Map", "kotlin/collections/MutableMap", "kotlin/collections/Map.Entry", "kotlin/collections/MutableMap.MutableEntry", "kotlin/collections/Iterator", "kotlin/collections/MutableIterator", "kotlin/collections/ListIterator", "kotlin/collections/MutableListIterator"});
        f27382e = b;
        Iterable<C10494b0<T>> r = C10539w.m35819r(b);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C9150f.m29847a(C10515i0.m35582a(C10531p.m35750a(r, 10)), 16));
        for (C10494b0 next : r) {
            linkedHashMap.put((String) next.mo35961d(), Integer.valueOf(next.mo35960c()));
        }
    }

    public C9925g(C9890a.C9901e eVar, String[] strArr) {
        C10202j.m34178b(eVar, "types");
        C10202j.m34178b(strArr, "strings");
        this.f27385c = eVar;
        this.f27386d = strArr;
        List<Integer> i = eVar.mo34900i();
        this.f27383a = i.isEmpty() ? C10530o0.m35747a() : C10539w.m35818q(i);
        ArrayList arrayList = new ArrayList();
        List<C9890a.C9901e.C9904c> j = this.f27385c.mo34901j();
        arrayList.ensureCapacity(j.size());
        for (C9890a.C9901e.C9904c next : j) {
            C10202j.m34174a((Object) next, "record");
            int k = next.mo34906k();
            for (int i2 = 0; i2 < k; i2++) {
                arrayList.add(next);
            }
        }
        arrayList.trimToSize();
        this.f27384b = arrayList;
    }

    /* renamed from: a */
    public String mo34853a(int i) {
        return getString(i);
    }

    /* renamed from: b */
    public boolean mo34854b(int i) {
        return this.f27383a.contains(Integer.valueOf(i));
    }

    public String getString(int i) {
        String str;
        int i2 = i;
        C9890a.C9901e.C9904c cVar = this.f27384b.get(i2);
        if (cVar.mo34916u()) {
            str = cVar.mo34909n();
        } else {
            if (cVar.mo34914s()) {
                int size = f27382e.size();
                int j = cVar.mo34905j();
                if (j >= 0 && size > j) {
                    str = f27382e.get(cVar.mo34905j());
                }
            }
            str = this.f27386d[i2];
        }
        if (cVar.mo34911p() >= 2) {
            List<Integer> q = cVar.mo34912q();
            Integer num = q.get(0);
            Integer num2 = q.get(1);
            C10202j.m34174a((Object) num, "begin");
            if (C10202j.m34168a(0, num.intValue()) <= 0) {
                int intValue = num.intValue();
                C10202j.m34174a((Object) num2, "end");
                if (C10202j.m34168a(intValue, num2.intValue()) <= 0 && C10202j.m34168a(num2.intValue(), str.length()) <= 0) {
                    C10202j.m34174a((Object) str, "string");
                    int intValue2 = num.intValue();
                    int intValue3 = num2.intValue();
                    if (str != null) {
                        str = str.substring(intValue2, intValue3);
                        C10202j.m34174a((Object) str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
        }
        String str2 = str;
        if (cVar.mo34907l() >= 2) {
            List<Integer> m = cVar.mo34908m();
            C10202j.m34174a((Object) str2, "string");
            str2 = C12130v.m40043a(str2, (char) m.get(0).intValue(), (char) m.get(1).intValue(), false, 4, (Object) null);
        }
        String str3 = str2;
        C9890a.C9901e.C9904c.C9907c i3 = cVar.mo34904i();
        if (i3 == null) {
            i3 = C9890a.C9901e.C9904c.C9907c.NONE;
        }
        int i4 = C9927h.f27387a[i3.ordinal()];
        if (i4 == 2) {
            C10202j.m34174a((Object) str3, "string");
            str3 = C12130v.m40043a(str3, '$', '.', false, 4, (Object) null);
        } else if (i4 == 3) {
            if (str3.length() >= 2) {
                C10202j.m34174a((Object) str3, "string");
                int length = str3.length() - 1;
                if (str3 != null) {
                    str3 = str3.substring(1, length);
                    C10202j.m34174a((Object) str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
            String str4 = str3;
            C10202j.m34174a((Object) str4, "string");
            str3 = C12130v.m40043a(str4, '$', '.', false, 4, (Object) null);
        }
        C10202j.m34174a((Object) str3, "string");
        return str3;
    }
}
