package kotlin.p045h0.p046u.p047e.p390m0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9518e;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p390m0.C12033d;

/* renamed from: kotlin.h0.u.e.m0.h */
/* compiled from: ReflectJavaAnnotationArguments.kt */
public final class C12039h extends C12033d implements C9518e {

    /* renamed from: c */
    private final Object[] f31795c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12039h(C9939f fVar, Object[] objArr) {
        super(fVar);
        C10202j.m34178b(objArr, "values");
        this.f31795c = objArr;
    }

    /* renamed from: e */
    public List<C12033d> mo34030e() {
        Object[] objArr = this.f31795c;
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            C12033d.C12034a aVar = C12033d.f31792b;
            if (obj != null) {
                arrayList.add(aVar.mo38670a(obj, (C9939f) null));
                i++;
            } else {
                C10202j.m34172a();
                throw null;
            }
        }
        return arrayList;
    }
}
