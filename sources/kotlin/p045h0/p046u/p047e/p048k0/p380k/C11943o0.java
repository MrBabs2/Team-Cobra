package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10351i;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

/* renamed from: kotlin.h0.u.e.k0.k.o0 */
/* compiled from: StarProjectionImpl.kt */
public final class C11943o0 {

    /* renamed from: kotlin.h0.u.e.k0.k.o0$a */
    /* compiled from: StarProjectionImpl.kt */
    public static final class C11944a extends C11955t0 {

        /* renamed from: c */
        final /* synthetic */ List f31647c;

        C11944a(List list) {
            this.f31647c = list;
        }

        /* renamed from: a */
        public C11965u0 mo38586a(C11953s0 s0Var) {
            C10202j.m34178b(s0Var, RoomNotification.KEY);
            if (!this.f31647c.contains(s0Var)) {
                return null;
            }
            C10349h b = s0Var.mo33781b();
            if (b != null) {
                return C11821a1.m38905a((C10375s0) b);
            }
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        }
    }

    /* renamed from: a */
    public static final C11824b0 m39490a(C10375s0 s0Var) {
        C10202j.m34178b(s0Var, "$this$starProjectionType");
        C10359m b = s0Var.mo33762b();
        if (b != null) {
            C11953s0 h = ((C10351i) b).mo33766h();
            C10202j.m34174a((Object) h, "classDescriptor.typeConstructor");
            List<C10375s0> parameters = h.getParameters();
            C10202j.m34174a((Object) parameters, "classDescriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C10531p.m35750a(parameters, 10));
            for (C10375s0 s0Var2 : parameters) {
                C10202j.m34174a((Object) s0Var2, "it");
                arrayList.add(s0Var2.mo33766h());
            }
            C11978z0 a = C11978z0.m39663a((C11972x0) new C11944a(arrayList));
            List<C11824b0> upperBounds = s0Var.getUpperBounds();
            C10202j.m34174a((Object) upperBounds, "this.upperBounds");
            C11824b0 b2 = a.mo38620b((C11824b0) C10539w.m35799e(upperBounds), C11838f1.OUT_VARIANCE);
            if (b2 != null) {
                return b2;
            }
            C11901j0 m = C10071a.m33892b((C10359m) s0Var).mo33717m();
            C10202j.m34174a((Object) m, "builtIns.defaultBound");
            return m;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassifierDescriptorWithTypeParameters");
    }
}
