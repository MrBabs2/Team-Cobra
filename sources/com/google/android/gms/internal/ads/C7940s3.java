package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.s3 */
final class C7940s3 implements Callable<zzase> {

    /* renamed from: f */
    private final /* synthetic */ Context f16822f;

    /* renamed from: g */
    private final /* synthetic */ zzasg f16823g;

    C7940s3(zzasg zzasg, Context context) {
        this.f16823g = zzasg;
        this.f16822f = context;
    }

    public final /* synthetic */ Object call() throws Exception {
        zzase zzase;
        C7977t3 t3Var = (C7977t3) this.f16823g.f18496a.get(this.f16822f);
        if (t3Var != null) {
            if (!(t3Var.f16880a + ((Long) zzyt.m25670e().mo27163a(zzacu.f17874Z0)).longValue() < zzk.zzln().mo25498b())) {
                zzase = new zzasf(this.f16822f, t3Var.f16881b).mo27610a();
                this.f16823g.f18496a.put(this.f16822f, new C7977t3(this.f16823g, zzase));
                return zzase;
            }
        }
        zzase = new zzasf(this.f16822f).mo27610a();
        this.f16823g.f18496a.put(this.f16822f, new C7977t3(this.f16823g, zzase));
        return zzase;
    }
}
