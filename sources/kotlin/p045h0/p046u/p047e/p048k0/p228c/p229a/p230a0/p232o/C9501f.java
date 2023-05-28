package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.p232o;

import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.C10221n;
import kotlin.C10481t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p236y.C9664l;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11827c0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11830d0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11958u;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11970w0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11972x0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11975y;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

/* renamed from: kotlin.h0.u.e.k0.c.a.a0.o.f */
/* compiled from: RawType.kt */
public final class C9501f extends C11972x0 {

    /* renamed from: b */
    private static final C9491a f26348b = C9498d.m30788a(C9664l.COMMON, false, (C10375s0) null, 3, (Object) null).mo33990a(C9492b.FLEXIBLE_LOWER_BOUND);

    /* renamed from: c */
    private static final C9491a f26349c = C9498d.m30788a(C9664l.COMMON, false, (C10375s0) null, 3, (Object) null).mo33990a(C9492b.FLEXIBLE_UPPER_BOUND);

    /* renamed from: d */
    public static final C9501f f26350d = new C9501f();

    private C9501f() {
    }

    /* renamed from: b */
    private final C11824b0 m30795b(C11824b0 b0Var) {
        C10349h b = b0Var.mo35227v0().mo33781b();
        if (b instanceof C10375s0) {
            return m30795b(C9498d.m30791a((C10375s0) b, (C10375s0) null, (C9102a) null, 3, (Object) null));
        }
        if (b instanceof C10342e) {
            C10342e eVar = (C10342e) b;
            C10221n<C11901j0, Boolean> a = m30794a(C11975y.m39645c(b0Var), eVar, f26348b);
            C11901j0 a2 = a.mo35389a();
            boolean booleanValue = a.mo35390b().booleanValue();
            C10221n<C11901j0, Boolean> a3 = m30794a(C11975y.m39646d(b0Var), eVar, f26349c);
            C11901j0 a4 = a3.mo35389a();
            boolean booleanValue2 = a3.mo35390b().booleanValue();
            if (booleanValue || booleanValue2) {
                return new C9502g(a2, a4);
            }
            return C11827c0.m38946a(a2, a4);
        }
        throw new IllegalStateException(("Unexpected declaration kind: " + b).toString());
    }

    /* renamed from: d */
    public boolean mo34004d() {
        return false;
    }

    /* renamed from: a */
    public C11970w0 m30798a(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, RoomNotification.KEY);
        return new C11970w0(m30795b(b0Var));
    }

    /* renamed from: a */
    private final C10221n<C11901j0, Boolean> m30794a(C11901j0 j0Var, C10342e eVar, C9491a aVar) {
        if (j0Var.mo35227v0().getParameters().isEmpty()) {
            return C10481t.m35502a(j0Var, false);
        }
        if (C9333g.m30181c((C11824b0) j0Var)) {
            C11965u0 u0Var = j0Var.mo35226u0().get(0);
            C11838f1 a = u0Var.mo38596a();
            C11824b0 type = u0Var.getType();
            C10202j.m34174a((Object) type, "componentTypeProjection.type");
            return C10481t.m35502a(C11827c0.m38948a(j0Var.getAnnotations(), j0Var.mo35227v0(), C10527n.m35729a(new C11970w0(a, m30795b(type))), j0Var.mo34094w0()), false);
        } else if (C11830d0.m38958a(j0Var)) {
            return C10481t.m35502a(C11958u.m39559c("Raw error type: " + j0Var.mo35227v0()), false);
        } else {
            C10249g annotations = j0Var.getAnnotations();
            C11953s0 v0 = j0Var.mo35227v0();
            List<C10375s0> parameters = j0Var.mo35227v0().getParameters();
            C10202j.m34174a((Object) parameters, "type.constructor.parameters");
            ArrayList arrayList = new ArrayList(C10531p.m35750a(parameters, 10));
            for (C10375s0 s0Var : parameters) {
                C9501f fVar = f26350d;
                C10202j.m34174a((Object) s0Var, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                arrayList.add(m30793a(fVar, s0Var, aVar, (C11824b0) null, 4, (Object) null));
            }
            boolean w0 = j0Var.mo34094w0();
            C10096h a2 = eVar.mo35451a(f26350d);
            C10202j.m34174a((Object) a2, "declaration.getMemberScope(RawSubstitution)");
            return C10481t.m35502a(C11827c0.m38949a(annotations, v0, arrayList, w0, a2), true);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ C11965u0 m30793a(C9501f fVar, C10375s0 s0Var, C9491a aVar, C11824b0 b0Var, int i, Object obj) {
        if ((i & 4) != 0) {
            b0Var = C9498d.m30791a(s0Var, (C10375s0) null, (C9102a) null, 3, (Object) null);
        }
        return fVar.mo34003a(s0Var, aVar, b0Var);
    }

    /* renamed from: a */
    public final C11965u0 mo34003a(C10375s0 s0Var, C9491a aVar, C11824b0 b0Var) {
        C11965u0 u0Var;
        C10202j.m34178b(s0Var, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
        C10202j.m34178b(aVar, "attr");
        C10202j.m34178b(b0Var, "erasedUpperBound");
        int i = C9500e.f26347a[aVar.mo33992a().ordinal()];
        if (i == 1) {
            return new C11970w0(C11838f1.INVARIANT, b0Var);
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        } else if (!s0Var.mo35439G().mo38455a()) {
            return new C11970w0(C11838f1.INVARIANT, C10071a.m33892b((C10359m) s0Var).mo33724t());
        } else {
            List<C10375s0> parameters = b0Var.mo35227v0().getParameters();
            C10202j.m34174a((Object) parameters, "erasedUpperBound.constructor.parameters");
            if (!parameters.isEmpty()) {
                u0Var = new C11970w0(C11838f1.OUT_VARIANCE, b0Var);
            } else {
                u0Var = C9498d.m30792a(s0Var, aVar);
            }
            return u0Var;
        }
    }
}
