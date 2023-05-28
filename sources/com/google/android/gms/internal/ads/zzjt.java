package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;

public final class zzjt implements zzkf {

    /* renamed from: a */
    private final zzkf f22132a;

    /* renamed from: b */
    private final zzkf f22133b;

    /* renamed from: c */
    private final zzkf f22134c;

    /* renamed from: d */
    private zzkf f22135d;

    public zzjt(Context context, String str) {
        this(context, (zzke) null, str, false);
    }

    /* renamed from: a */
    public final long mo25635a(zzjq zzjq) throws IOException {
        zzkh.m24659b(this.f22135d == null);
        String scheme = zzjq.f22106a.getScheme();
        if ("http".equals(scheme) || BuildConfig.APTOIDE_WEB_SERVICES_SCHEME.equals(scheme)) {
            this.f22135d = this.f22132a;
        } else if ("file".equals(scheme)) {
            if (zzjq.f22106a.getPath().startsWith("/android_asset/")) {
                this.f22135d = this.f22134c;
            } else {
                this.f22135d = this.f22133b;
            }
        } else if ("asset".equals(scheme)) {
            this.f22135d = this.f22134c;
        } else {
            throw new zzju(scheme);
        }
        return this.f22135d.mo25635a(zzjq);
    }

    public final void close() throws IOException {
        zzkf zzkf = this.f22135d;
        if (zzkf != null) {
            try {
                zzkf.close();
            } finally {
                this.f22135d = null;
            }
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f22135d.read(bArr, i, i2);
    }

    private zzjt(Context context, zzke zzke, String str, boolean z) {
        this(context, (zzke) null, new zzjs(str, (zzkn<String>) null, (zzke) null, 8000, 8000, false));
    }

    private zzjt(Context context, zzke zzke, zzkf zzkf) {
        zzkh.m24656a(zzkf);
        this.f22132a = zzkf;
        this.f22133b = new zzjv((zzke) null);
        this.f22134c = new zzjm(context, (zzke) null);
    }
}
