package kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C10483v;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p215c0.p216c.C9117p;
import kotlin.p220g0.C9143a;

/* renamed from: kotlin.h0.u.e.k0.d.y0.g.b */
/* compiled from: ClassMapperLite.kt */
public final class C9915b {

    /* renamed from: a */
    private static final Map<String, String> f27371a;

    /* renamed from: kotlin.h0.u.e.k0.d.y0.g.b$a */
    /* compiled from: ClassMapperLite.kt */
    static final class C9916a extends C10203k implements C9117p<String, String, C10483v> {

        /* renamed from: f */
        final /* synthetic */ Map f27372f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9916a(Map map) {
            super(2);
            this.f27372f = map;
        }

        /* renamed from: a */
        public final void mo34922a(String str, String str2) {
            C10202j.m34178b(str, "kotlinSimpleName");
            C10202j.m34178b(str2, "javaInternalName");
            this.f27372f.put("kotlin/" + str, 'L' + str2 + ';');
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo34922a((String) obj, (String) obj2);
            return C10483v.f28357a;
        }
    }

    static {
        new C9915b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List b = C10529o.m35741b((T[]) new String[]{"Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D"});
        C9143a a = C9150f.m29850a((C9143a) C10529o.m35737a((Collection<?>) b), 2);
        int first = a.getFirst();
        int last = a.getLast();
        int a2 = a.mo33483a();
        if (a2 < 0 ? first >= last : first <= last) {
            while (true) {
                int i = first + 1;
                linkedHashMap.put("kotlin/" + ((String) b.get(first)), b.get(i));
                linkedHashMap.put("kotlin/" + ((String) b.get(first)) + "Array", '[' + ((String) b.get(i)));
                if (first == last) {
                    break;
                }
                first += a2;
            }
        }
        linkedHashMap.put("kotlin/Unit", "V");
        C9916a aVar = new C9916a(linkedHashMap);
        aVar.mo34922a("Any", "java/lang/Object");
        aVar.mo34922a("Nothing", "java/lang/Void");
        aVar.mo34922a("Annotation", "java/lang/annotation/Annotation");
        for (String str : C10529o.m35741b((T[]) new String[]{"String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum"})) {
            aVar.mo34922a(str, "java/lang/" + str);
        }
        for (String str2 : C10529o.m35741b((T[]) new String[]{"Iterator", "Collection", "List", "Set", "Map", "ListIterator"})) {
            aVar.mo34922a("collections/" + str2, "java/util/" + str2);
            aVar.mo34922a("collections/Mutable" + str2, "java/util/" + str2);
        }
        aVar.mo34922a("collections/Iterable", "java/lang/Iterable");
        aVar.mo34922a("collections/MutableIterable", "java/lang/Iterable");
        aVar.mo34922a("collections/Map.Entry", "java/util/Map$Entry");
        aVar.mo34922a("collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i2 = 0; i2 <= 22; i2++) {
            aVar.mo34922a("Function" + i2, "kotlin/jvm/functions/Function" + i2);
            aVar.mo34922a("reflect/KFunction" + i2, "kotlin/reflect/KFunction");
        }
        for (String str3 : C10529o.m35741b((T[]) new String[]{"Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum"})) {
            aVar.mo34922a(str3 + ".Companion", "kotlin/jvm/internal/" + str3 + "CompanionObject");
        }
        f27371a = linkedHashMap;
    }

    private C9915b() {
    }

    /* renamed from: a */
    public static final String m33137a(String str) {
        C10202j.m34178b(str, "classId");
        String str2 = f27371a.get(str);
        if (str2 != null) {
            return str2;
        }
        return 'L' + C12130v.m40043a(str, '.', '$', false, 4, (Object) null) + ';';
    }
}
