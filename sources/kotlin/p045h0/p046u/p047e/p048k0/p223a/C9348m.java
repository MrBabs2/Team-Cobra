package kotlin.p045h0.p046u.p047e.p048k0.p223a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11821a1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10240b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;

/* renamed from: kotlin.h0.u.e.k0.a.m */
/* compiled from: UnsignedType.kt */
public final class C9348m {

    /* renamed from: a */
    private static final Set<C9939f> f26015a;

    /* renamed from: b */
    private static final HashMap<C9933a, C9933a> f26016b = new HashMap<>();

    /* renamed from: c */
    private static final HashMap<C9933a, C9933a> f26017c = new HashMap<>();

    /* renamed from: d */
    private static final Set<C9939f> f26018d;

    /* renamed from: e */
    public static final C9348m f26019e = new C9348m();

    static {
        C9347l[] values = C9347l.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (C9347l e : values) {
            arrayList.add(e.mo33741e());
        }
        f26015a = C10539w.m35818q(arrayList);
        C9347l[] values2 = C9347l.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C9347l a : values2) {
            linkedHashSet.add(a.mo33739a().mo34989f());
        }
        f26018d = linkedHashSet;
        for (C9347l lVar : C9347l.values()) {
            f26016b.put(lVar.mo33739a(), lVar.mo33740d());
            f26017c.put(lVar.mo33740d(), lVar.mo33739a());
        }
    }

    private C9348m() {
    }

    /* renamed from: a */
    public final boolean mo33743a(C9939f fVar) {
        C10202j.m34178b(fVar, "name");
        return f26018d.contains(fVar);
    }

    /* renamed from: a */
    public final C9933a mo33742a(C9933a aVar) {
        C10202j.m34178b(aVar, "arrayClassId");
        return f26016b.get(aVar);
    }

    /* renamed from: a */
    public final boolean mo33744a(C11824b0 b0Var) {
        C10349h b;
        C10202j.m34178b(b0Var, "type");
        if (C11821a1.m38920k(b0Var) || (b = b0Var.mo35227v0().mo33781b()) == null) {
            return false;
        }
        C10202j.m34174a((Object) b, "type.constructor.declara…escriptor ?: return false");
        return mo33745a((C10359m) b);
    }

    /* renamed from: a */
    public final boolean mo33745a(C10359m mVar) {
        C10202j.m34178b(mVar, "descriptor");
        C10359m b = mVar.mo33762b();
        return (b instanceof C10240b0) && C10202j.m34176a((Object) ((C10240b0) b).mo35425c(), (Object) C9333g.f25902f) && f26015a.contains(mVar.getName());
    }
}
