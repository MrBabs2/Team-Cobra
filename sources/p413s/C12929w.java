package p413s;

import kotlin.C10483v;
import kotlin.jvm.internal.C10202j;

/* renamed from: s.w */
/* compiled from: SegmentPool.kt */
public final class C12929w {

    /* renamed from: a */
    public static C12927v f33200a;

    /* renamed from: b */
    public static long f33201b;

    /* renamed from: c */
    public static final C12929w f33202c = new C12929w();

    private C12929w() {
    }

    /* renamed from: a */
    public static final C12927v m41738a() {
        synchronized (f33202c) {
            C12927v vVar = f33200a;
            if (vVar == null) {
                return new C12927v();
            }
            f33200a = vVar.f33198f;
            vVar.f33198f = null;
            f33201b -= (long) 8192;
            return vVar;
        }
    }

    /* renamed from: a */
    public static final void m41739a(C12927v vVar) {
        C10202j.m34178b(vVar, "segment");
        if (!(vVar.f33198f == null && vVar.f33199g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!vVar.f33196d) {
            synchronized (f33202c) {
                long j = (long) 8192;
                if (f33201b + j <= 65536) {
                    f33201b += j;
                    vVar.f33198f = f33200a;
                    vVar.f33195c = 0;
                    vVar.f33194b = 0;
                    f33200a = vVar;
                    C10483v vVar2 = C10483v.f28357a;
                }
            }
        }
    }
}
