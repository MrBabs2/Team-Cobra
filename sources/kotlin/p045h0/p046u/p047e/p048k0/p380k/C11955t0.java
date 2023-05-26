package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C10202j;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

/* renamed from: kotlin.h0.u.e.k0.k.t0 */
/* compiled from: TypeSubstitution.kt */
public abstract class C11955t0 extends C11972x0 {

    /* renamed from: b */
    public static final C11956a f31657b = new C11956a((DefaultConstructorMarker) null);

    /* renamed from: kotlin.h0.u.e.k0.k.t0$a */
    /* compiled from: TypeSubstitution.kt */
    public static final class C11956a {

        /* renamed from: kotlin.h0.u.e.k0.k.t0$a$a */
        /* compiled from: TypeSubstitution.kt */
        public static final class C11957a extends C11955t0 {

            /* renamed from: c */
            final /* synthetic */ Map f31658c;

            /* renamed from: d */
            final /* synthetic */ boolean f31659d;

            C11957a(Map map, boolean z) {
                this.f31658c = map;
                this.f31659d = z;
            }

            /* renamed from: a */
            public C11965u0 mo38586a(C11953s0 s0Var) {
                C10202j.m34178b(s0Var, RoomNotification.KEY);
                return (C11965u0) this.f31658c.get(s0Var);
            }

            /* renamed from: d */
            public boolean mo34004d() {
                return this.f31658c.isEmpty();
            }

            /* renamed from: a */
            public boolean mo38595a() {
                return this.f31659d;
            }
        }

        private C11956a() {
        }

        /* renamed from: a */
        public static /* synthetic */ C11955t0 m39537a(C11956a aVar, Map map, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.mo38600a((Map<C11953s0, ? extends C11965u0>) map, z);
        }

        public /* synthetic */ C11956a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C11955t0 mo38600a(Map<C11953s0, ? extends C11965u0> map, boolean z) {
            C10202j.m34178b(map, "map");
            return new C11957a(map, z);
        }

        /* renamed from: a */
        public final C11972x0 mo38601a(C11824b0 b0Var) {
            C10202j.m34178b(b0Var, "kotlinType");
            return mo38602a(b0Var.mo35227v0(), (List<? extends C11965u0>) b0Var.mo35226u0());
        }

        /* renamed from: a */
        public final C11972x0 mo38602a(C11953s0 s0Var, List<? extends C11965u0> list) {
            C10202j.m34178b(s0Var, "typeConstructor");
            C10202j.m34178b(list, "arguments");
            List<C10375s0> parameters = s0Var.getParameters();
            C10202j.m34174a((Object) parameters, "typeConstructor.parameters");
            C10375s0 s0Var2 = (C10375s0) C10539w.m35807h(parameters);
            if (!(s0Var2 != null ? s0Var2.mo35441d0() : false)) {
                return new C11977z(parameters, list);
            }
            List<C10375s0> parameters2 = s0Var.getParameters();
            C10202j.m34174a((Object) parameters2, "typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C10531p.m35750a(parameters2, 10));
            for (C10375s0 s0Var3 : parameters2) {
                C10202j.m34174a((Object) s0Var3, "it");
                arrayList.add(s0Var3.mo33766h());
            }
            return m39537a(this, C10518j0.m35602a(C10539w.m35800e(arrayList, list)), false, 2, (Object) null);
        }
    }

    /* renamed from: a */
    public static final C11955t0 m39533a(Map<C11953s0, ? extends C11965u0> map) {
        return C11956a.m39537a(f31657b, map, false, 2, (Object) null);
    }

    /* renamed from: a */
    public static final C11972x0 m39534a(C11953s0 s0Var, List<? extends C11965u0> list) {
        return f31657b.mo38602a(s0Var, list);
    }

    /* renamed from: a */
    public C11965u0 mo34002a(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, RoomNotification.KEY);
        return mo38586a(b0Var.mo35227v0());
    }

    /* renamed from: a */
    public abstract C11965u0 mo38586a(C11953s0 s0Var);
}
