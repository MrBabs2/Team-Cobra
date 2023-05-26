package kotlin.reflect.full;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.C9154c;
import kotlin.p045h0.C9157f;
import kotlin.p045h0.C9173n;
import kotlin.p045h0.p046u.p047e.C9206e;
import kotlin.p045h0.p046u.p047e.C9220g;
import kotlin.p045h0.p046u.p047e.C9301j;
import kotlin.reflect.jvm.internal.impl.descriptors.C10357l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;

/* renamed from: kotlin.reflect.full.a */
/* compiled from: KClasses.kt */
public final class C10229a {
    /* renamed from: a */
    public static final <T> Collection<C9173n<T, ?>> m34217a(C9154c<T> cVar) {
        C10202j.m34178b(cVar, "$this$memberProperties");
        Collection<C9206e<?>> b = ((C9220g) cVar).mo33595o().mo35358a().mo33600b();
        ArrayList arrayList = new ArrayList();
        for (T next : b) {
            C9206e eVar = (C9206e) next;
            if (m34220b((C9206e<?>) eVar) && (eVar instanceof C9173n)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final <T> C9157f<T> m34219b(C9154c<T> cVar) {
        Object obj;
        C10202j.m34178b(cVar, "$this$primaryConstructor");
        Iterator it = ((C9220g) cVar).mo33594j().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C9157f fVar = (C9157f) obj;
            if (fVar != null) {
                C10382u o = ((C9301j) fVar).mo33587o();
                if (o != null) {
                    if (((C10357l) o).mo35472w()) {
                        break;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
            }
        }
        return (C9157f) obj;
    }

    /* renamed from: a */
    private static final boolean m34218a(C9206e<?> eVar) {
        return eVar.mo33587o().mo35405b0() != null;
    }

    /* renamed from: b */
    private static final boolean m34220b(C9206e<?> eVar) {
        return !m34218a(eVar);
    }
}
