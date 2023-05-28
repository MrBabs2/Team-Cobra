package kotlin.p045h0.p046u.p047e.p048k0.p248h.p249l.p250a;

import java.util.ArrayList;
import java.util.List;
import kotlin.C10221n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11795b;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11833e0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11937m;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11970w0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11972x0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11977z;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

/* renamed from: kotlin.h0.u.e.k0.h.l.a.d */
/* compiled from: CapturedTypeConstructor.kt */
public final class C10026d {

    /* renamed from: kotlin.h0.u.e.k0.h.l.a.d$a */
    /* compiled from: CapturedTypeConstructor.kt */
    static final class C10027a extends C10203k implements C9102a<C11824b0> {

        /* renamed from: f */
        final /* synthetic */ C11965u0 f27620f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10027a(C11965u0 u0Var) {
            super(0);
            this.f27620f = u0Var;
        }

        public final C11824b0 invoke() {
            C11824b0 type = this.f27620f.getType();
            C10202j.m34174a((Object) type, "this@createCapturedIfNeeded.type");
            return type;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.l.a.d$b */
    /* compiled from: CapturedTypeConstructor.kt */
    public static final class C10028b extends C11937m {

        /* renamed from: c */
        final /* synthetic */ boolean f27621c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10028b(C11972x0 x0Var, boolean z, C11972x0 x0Var2) {
            super(x0Var2);
            this.f27621c = z;
        }

        /* renamed from: a */
        public C11965u0 mo34002a(C11824b0 b0Var) {
            C10202j.m34178b(b0Var, RoomNotification.KEY);
            C11965u0 a = super.mo34002a(b0Var);
            C10375s0 s0Var = null;
            if (a == null) {
                return null;
            }
            C10349h b = b0Var.mo35227v0().mo33781b();
            if (b instanceof C10375s0) {
                s0Var = b;
            }
            return C10026d.m33801b(a, s0Var);
        }

        /* renamed from: b */
        public boolean mo35234b() {
            return this.f27621c;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C11965u0 m33801b(C11965u0 u0Var, C10375s0 s0Var) {
        if (s0Var == null || u0Var.mo38596a() == C11838f1.INVARIANT) {
            return u0Var;
        }
        if (s0Var.mo35439G() != u0Var.mo38596a()) {
            return new C11970w0(m33796a(u0Var));
        }
        if (!u0Var.mo38597b()) {
            return new C11970w0(u0Var.getType());
        }
        C11817i iVar = C11795b.f31497e;
        C10202j.m34174a((Object) iVar, "LockBasedStorageManager.NO_LOCKS");
        return new C11970w0(new C11833e0(iVar, new C10027a(u0Var)));
    }

    /* renamed from: a */
    public static final C11824b0 m33796a(C11965u0 u0Var) {
        C10202j.m34178b(u0Var, "typeProjection");
        return new C10023a(u0Var, (C10024b) null, false, (C10249g) null, 14, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public static final boolean m33800a(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$isCaptured");
        return b0Var.mo35227v0() instanceof C10024b;
    }

    /* renamed from: a */
    public static /* synthetic */ C11972x0 m33799a(C11972x0 x0Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return m33798a(x0Var, z);
    }

    /* renamed from: a */
    public static final C11972x0 m33798a(C11972x0 x0Var, boolean z) {
        C10202j.m34178b(x0Var, "$this$wrapWithCapturingSubstitution");
        if (!(x0Var instanceof C11977z)) {
            return new C10028b(x0Var, z, x0Var);
        }
        C11977z zVar = (C11977z) x0Var;
        C10375s0[] f = zVar.mo38616f();
        List<C10221n> a = C10519k.m35622a((T[]) zVar.mo38615e(), (R[]) zVar.mo38616f());
        ArrayList arrayList = new ArrayList(C10531p.m35750a(a, 10));
        for (C10221n nVar : a) {
            arrayList.add(m33801b((C11965u0) nVar.mo35391c(), (C10375s0) nVar.mo35392d()));
        }
        Object[] array = arrayList.toArray(new C11965u0[0]);
        if (array != null) {
            return new C11977z(f, (C11965u0[]) array, z);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
