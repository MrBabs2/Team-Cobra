package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import kotlin.C10485x;
import kotlin.jvm.internal.C10202j;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

/* renamed from: kotlin.h0.u.e.k0.k.z */
/* compiled from: TypeSubstitution.kt */
public final class C11977z extends C11972x0 {

    /* renamed from: b */
    private final C10375s0[] f31681b;

    /* renamed from: c */
    private final C11965u0[] f31682c;

    /* renamed from: d */
    private final boolean f31683d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11977z(C10375s0[] s0VarArr, C11965u0[] u0VarArr, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(s0VarArr, u0VarArr, (i & 4) != 0 ? false : z);
    }

    /* renamed from: a */
    public C11965u0 mo34002a(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, RoomNotification.KEY);
        C10349h b = b0Var.mo35227v0().mo33781b();
        if (!(b instanceof C10375s0)) {
            b = null;
        }
        C10375s0 s0Var = (C10375s0) b;
        if (s0Var != null) {
            int e = s0Var.mo35442e();
            C10375s0[] s0VarArr = this.f31681b;
            if (e < s0VarArr.length && C10202j.m34176a((Object) s0VarArr[e].mo33766h(), (Object) s0Var.mo33766h())) {
                return this.f31682c[e];
            }
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo35234b() {
        return this.f31683d;
    }

    /* renamed from: d */
    public boolean mo34004d() {
        return this.f31682c.length == 0;
    }

    /* renamed from: e */
    public final C11965u0[] mo38615e() {
        return this.f31682c;
    }

    /* renamed from: f */
    public final C10375s0[] mo38616f() {
        return this.f31681b;
    }

    public C11977z(C10375s0[] s0VarArr, C11965u0[] u0VarArr, boolean z) {
        C10202j.m34178b(s0VarArr, "parameters");
        C10202j.m34178b(u0VarArr, "arguments");
        this.f31681b = s0VarArr;
        this.f31682c = u0VarArr;
        this.f31683d = z;
        boolean z2 = s0VarArr.length <= u0VarArr.length;
        if (C10485x.f28360a && !z2) {
            throw new AssertionError("Number of arguments should not be less then number of parameters, but: parameters=" + this.f31681b.length + ", args=" + this.f31682c.length);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11977z(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.C10375s0> r9, java.util.List<? extends kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0> r10) {
        /*
            r8 = this;
            java.lang.String r0 = "parameters"
            kotlin.jvm.internal.C10202j.m34178b(r9, r0)
            java.lang.String r0 = "argumentsList"
            kotlin.jvm.internal.C10202j.m34178b(r10, r0)
            r0 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.s0[] r1 = new kotlin.reflect.jvm.internal.impl.descriptors.C10375s0[r0]
            java.lang.Object[] r9 = r9.toArray(r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            if (r9 == 0) goto L_0x0031
            r3 = r9
            kotlin.reflect.jvm.internal.impl.descriptors.s0[] r3 = (kotlin.reflect.jvm.internal.impl.descriptors.C10375s0[]) r3
            kotlin.h0.u.e.k0.k.u0[] r9 = new kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0[r0]
            java.lang.Object[] r9 = r10.toArray(r9)
            if (r9 == 0) goto L_0x002b
            r4 = r9
            kotlin.h0.u.e.k0.k.u0[] r4 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0[]) r4
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return
        L_0x002b:
            kotlin.TypeCastException r9 = new kotlin.TypeCastException
            r9.<init>(r1)
            throw r9
        L_0x0031:
            kotlin.TypeCastException r9 = new kotlin.TypeCastException
            r9.<init>(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p380k.C11977z.<init>(java.util.List, java.util.List):void");
    }
}
