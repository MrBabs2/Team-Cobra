package kotlin.reflect.jvm.internal.impl.descriptors.p259b1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.C10221n;
import kotlin.C10481t;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b1.n */
/* compiled from: KotlinTarget.kt */
public enum C10262n {
    CLASS("class", false, 2, (boolean) null),
    ANNOTATION_CLASS("annotation class", false, 2, (boolean) null),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2, (boolean) null),
    FIELD("field", false, 2, (boolean) null),
    LOCAL_VARIABLE("local variable", false, 2, (boolean) null),
    VALUE_PARAMETER("value parameter", false, 2, (boolean) null),
    CONSTRUCTOR("constructor", false, 2, (boolean) null),
    FUNCTION("function", false, 2, (boolean) null),
    PROPERTY_GETTER("getter", false, 2, (boolean) null),
    PROPERTY_SETTER("setter", false, 2, (boolean) null),
    TYPE("type usage", false),
    FILE("file", false);
    

    /* renamed from: u */
    private static final HashMap<String, C10262n> f27943u = null;

    /* renamed from: f */
    private final boolean f27944f;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b1.n$a */
    /* compiled from: KotlinTarget.kt */
    public static final class C10263a {
        private C10263a() {
        }

        public /* synthetic */ C10263a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C10263a((DefaultConstructorMarker) null);
        f27943u = new HashMap<>();
        for (C10262n nVar : values()) {
            f27943u.put(nVar.name(), nVar);
        }
        C10262n[] values = values();
        ArrayList arrayList = new ArrayList();
        for (C10262n nVar2 : values) {
            if (nVar2.f27944f) {
                arrayList.add(nVar2);
            }
        }
        Set<T> unused = C10539w.m35818q(arrayList);
        Set<T> unused2 = C10519k.m35655m(values());
        Map<K, V> unused3 = C10518j0.m35604a((C10221n<? extends K, ? extends V>[]) new C10221n[]{C10481t.m35502a(C10246e.CONSTRUCTOR_PARAMETER, VALUE_PARAMETER), C10481t.m35502a(C10246e.FIELD, FIELD), C10481t.m35502a(C10246e.PROPERTY, PROPERTY), C10481t.m35502a(C10246e.FILE, FILE), C10481t.m35502a(C10246e.PROPERTY_GETTER, PROPERTY_GETTER), C10481t.m35502a(C10246e.PROPERTY_SETTER, PROPERTY_SETTER), C10481t.m35502a(C10246e.RECEIVER, VALUE_PARAMETER), C10481t.m35502a(C10246e.SETTER_PARAMETER, VALUE_PARAMETER), C10481t.m35502a(C10246e.PROPERTY_DELEGATE_FIELD, FIELD)});
    }

    private C10262n(String str, boolean z) {
        this.f27944f = z;
    }
}
