package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.w5 */
final class C8090w5 implements zzz {

    /* renamed from: a */
    private final /* synthetic */ String f17068a;

    /* renamed from: b */
    private final /* synthetic */ C8164y5 f17069b;

    C8090w5(zzayu zzayu, String str, C8164y5 y5Var) {
        this.f17068a = str;
        this.f17069b = y5Var;
    }

    /* renamed from: a */
    public final void mo25569a(zzaf zzaf) {
        String str = this.f17068a;
        String exc = zzaf.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(exc).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(exc);
        zzbad.m20523d(sb.toString());
        this.f17069b.mo26800a(null);
    }
}
