package kotlin.p392j0;

import kotlin.jvm.internal.C10202j;
import kotlin.p220g0.C9146c;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;

/* renamed from: kotlin.j0.e */
/* compiled from: Regex.kt */
public final class C12103e {

    /* renamed from: a */
    private final String f31880a;

    /* renamed from: b */
    private final C9146c f31881b;

    public C12103e(String str, C9146c cVar) {
        C10202j.m34178b(str, DonationsAnalytics.VALUE);
        C10202j.m34178b(cVar, "range");
        this.f31880a = str;
        this.f31881b = cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12103e)) {
            return false;
        }
        C12103e eVar = (C12103e) obj;
        return C10202j.m34176a((Object) this.f31880a, (Object) eVar.f31880a) && C10202j.m34176a((Object) this.f31881b, (Object) eVar.f31881b);
    }

    public int hashCode() {
        String str = this.f31880a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C9146c cVar = this.f31881b;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "MatchGroup(value=" + this.f31880a + ", range=" + this.f31881b + ")";
    }
}
