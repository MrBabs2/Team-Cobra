package kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;

/* renamed from: kotlin.h0.u.e.k0.c.b.u */
/* compiled from: methodSignatureBuilding.kt */
public final class C9737u {

    /* renamed from: a */
    public static final C9737u f26706a = new C9737u();

    /* renamed from: kotlin.h0.u.e.k0.c.b.u$a */
    /* compiled from: methodSignatureBuilding.kt */
    static final class C9738a extends C10203k implements C9113l<String, String> {

        /* renamed from: f */
        public static final C9738a f26707f = new C9738a();

        C9738a() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(String str) {
            C10202j.m34178b(str, "it");
            return C9737u.f26706a.m31402d(str);
        }
    }

    private C9737u() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final String m31402d(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }

    /* renamed from: b */
    public final String mo34340b(String str) {
        C10202j.m34178b(str, "name");
        return "java/lang/" + str;
    }

    /* renamed from: c */
    public final String mo34342c(String str) {
        C10202j.m34178b(str, "name");
        return "java/util/" + str;
    }

    /* renamed from: a */
    public final String mo34334a(String str) {
        C10202j.m34178b(str, "name");
        return "java/util/function/" + str;
    }

    /* renamed from: b */
    public final LinkedHashSet<String> mo34341b(String str, String... strArr) {
        C10202j.m34178b(str, "name");
        C10202j.m34178b(strArr, "signatures");
        return mo34338a(mo34340b(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: c */
    public final LinkedHashSet<String> mo34343c(String str, String... strArr) {
        C10202j.m34178b(str, "name");
        C10202j.m34178b(strArr, "signatures");
        return mo34338a(mo34342c(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: a */
    public final LinkedHashSet<String> mo34338a(String str, String... strArr) {
        C10202j.m34178b(str, "internalName");
        C10202j.m34178b(strArr, "signatures");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    /* renamed from: a */
    public final String mo34337a(C10342e eVar, String str) {
        C10202j.m34178b(eVar, "classDescriptor");
        C10202j.m34178b(str, "jvmDescriptor");
        return mo34335a(C9734s.m31393a(eVar), str);
    }

    /* renamed from: a */
    public final String mo34335a(String str, String str2) {
        C10202j.m34178b(str, "internalName");
        C10202j.m34178b(str2, "jvmDescriptor");
        return str + '.' + str2;
    }

    /* renamed from: a */
    public final String mo34336a(String str, List<String> list, String str2) {
        C10202j.m34178b(str, "name");
        C10202j.m34178b(list, "parameters");
        C10202j.m34178b(str2, "ret");
        return str + '(' + C10539w.m35773a(list, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C9738a.f26707f, 30, (Object) null) + ')' + m31402d(str2);
    }

    /* renamed from: a */
    public final String[] mo34339a(String... strArr) {
        C10202j.m34178b(strArr, "signatures");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
