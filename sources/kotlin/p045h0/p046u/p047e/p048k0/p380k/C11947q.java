package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import kotlin.jvm.internal.C10202j;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

/* renamed from: kotlin.h0.u.e.k0.k.q */
/* compiled from: DisjointKeysUnionTypeSubstitution.kt */
public final class C11947q extends C11972x0 {

    /* renamed from: d */
    public static final C11948a f31648d = new C11948a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final C11972x0 f31649b;

    /* renamed from: c */
    private final C11972x0 f31650c;

    /* renamed from: kotlin.h0.u.e.k0.k.q$a */
    /* compiled from: DisjointKeysUnionTypeSubstitution.kt */
    public static final class C11948a {
        private C11948a() {
        }

        /* renamed from: a */
        public final C11972x0 mo38599a(C11972x0 x0Var, C11972x0 x0Var2) {
            C10202j.m34178b(x0Var, "first");
            C10202j.m34178b(x0Var2, "second");
            if (x0Var.mo34004d()) {
                return x0Var2;
            }
            if (x0Var2.mo34004d()) {
                return x0Var;
            }
            return new C11947q(x0Var, x0Var2, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ C11948a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C11947q(C11972x0 x0Var, C11972x0 x0Var2, DefaultConstructorMarker defaultConstructorMarker) {
        this(x0Var, x0Var2);
    }

    /* renamed from: a */
    public static final C11972x0 m39498a(C11972x0 x0Var, C11972x0 x0Var2) {
        return f31648d.mo38599a(x0Var, x0Var2);
    }

    /* renamed from: a */
    public C11965u0 mo34002a(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, RoomNotification.KEY);
        C11965u0 a = this.f31649b.mo34002a(b0Var);
        return a != null ? a : this.f31650c.mo34002a(b0Var);
    }

    /* renamed from: b */
    public boolean mo35234b() {
        return this.f31649b.mo35234b() || this.f31650c.mo35234b();
    }

    /* renamed from: d */
    public boolean mo34004d() {
        return false;
    }

    private C11947q(C11972x0 x0Var, C11972x0 x0Var2) {
        this.f31649b = x0Var;
        this.f31650c = x0Var2;
    }

    /* renamed from: a */
    public C11824b0 mo38593a(C11824b0 b0Var, C11838f1 f1Var) {
        C10202j.m34178b(b0Var, "topLevelType");
        C10202j.m34178b(f1Var, "position");
        return this.f31650c.mo38593a(this.f31649b.mo38593a(b0Var, f1Var), f1Var);
    }

    /* renamed from: a */
    public boolean mo38595a() {
        return this.f31649b.mo38595a() || this.f31650c.mo38595a();
    }

    /* renamed from: a */
    public C10249g mo38594a(C10249g gVar) {
        C10202j.m34178b(gVar, "annotations");
        return this.f31650c.mo38594a(this.f31649b.mo38594a(gVar));
    }
}
