package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

@zzard
public final class zzayl extends zzak {

    /* renamed from: d */
    private final Context f18679d;

    private zzayl(Context context, zzas zzas) {
        super(zzas);
        this.f18679d = context;
    }

    /* renamed from: a */
    public static zzv m20406a(Context context) {
        zzv zzv = new zzv(new zzan(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzayl(context, new zzat()));
        zzv.mo29829a();
        return zzv;
    }

    /* renamed from: a */
    public final zzp mo27317a(zzr<?> zzr) throws zzaf {
        if (zzr.mo29663q() && zzr.mo29657d() == 0) {
            if (Pattern.matches((String) zzyt.m25670e().mo27163a(zzacu.f17880a2), zzr.mo29658e())) {
                zzyt.m25666a();
                if (zzazt.m20482c(this.f18679d, 13400000)) {
                    zzp a = new zzaii(this.f18679d).mo27317a(zzr);
                    if (a != null) {
                        String valueOf = String.valueOf(zzr.mo29658e());
                        zzawz.m20167e(valueOf.length() != 0 ? "Got gmscore asset response: ".concat(valueOf) : new String("Got gmscore asset response: "));
                        return a;
                    }
                    String valueOf2 = String.valueOf(zzr.mo29658e());
                    zzawz.m20167e(valueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(valueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.mo27317a(zzr);
    }
}
