package kotlinx.coroutines;

import kotlinx.coroutines.p393g2.C12230o;

/* renamed from: kotlinx.coroutines.r1 */
/* compiled from: JobSupport.kt */
public final class C12305r1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C12230o f32125a = new C12230o("COMPLETING_ALREADY");

    /* renamed from: b */
    public static final C12230o f32126b = new C12230o("COMPLETING_WAITING_CHILDREN");
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C12230o f32127c = new C12230o("COMPLETING_RETRY");
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C12230o f32128d = new C12230o("TOO_LATE_TO_CANCEL");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C12230o f32129e = new C12230o("SEALED");
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C12319w0 f32130f = new C12319w0(false);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C12319w0 f32131g = new C12319w0(true);

    /* renamed from: a */
    public static final Object m40623a(Object obj) {
        return obj instanceof C12201f1 ? new C12205g1((C12201f1) obj) : obj;
    }

    /* renamed from: b */
    public static final Object m40625b(Object obj) {
        C12201f1 f1Var;
        C12205g1 g1Var = (C12205g1) (!(obj instanceof C12205g1) ? null : obj);
        return (g1Var == null || (f1Var = g1Var.f31969a) == null) ? obj : f1Var;
    }
}
