package kotlin.p045h0.p046u.p047e.p390m0;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9527n;
import kotlin.p045h0.p046u.p047e.p390m0.C12063w;

/* renamed from: kotlin.h0.u.e.m0.p */
/* compiled from: ReflectJavaField.kt */
public final class C12055p extends C12057r implements C9527n {

    /* renamed from: a */
    private final Field f31812a;

    public C12055p(Field field) {
        C10202j.m34178b(field, "member");
        this.f31812a = field;
    }

    /* renamed from: G */
    public boolean mo34052G() {
        return false;
    }

    /* renamed from: i */
    public Field m39823i() {
        return this.f31812a;
    }

    /* renamed from: y */
    public boolean mo34054y() {
        return m39823i().isEnumConstant();
    }

    public C12063w getType() {
        C12063w.C12064a aVar = C12063w.f31817a;
        Type genericType = m39823i().getGenericType();
        C10202j.m34174a((Object) genericType, "member.genericType");
        return aVar.mo38696a(genericType);
    }
}
