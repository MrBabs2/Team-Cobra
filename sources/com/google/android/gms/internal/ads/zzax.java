package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;

public class zzax extends zzr<String> {

    /* renamed from: s */
    private final Object f18622s = new Object();

    /* renamed from: t */
    private zzaa<String> f18623t;

    public zzax(int i, String str, zzaa<String> zzaa, zzz zzz) {
        super(i, str, zzz);
        this.f18623t = zzaa;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final zzy<String> mo27762a(zzp zzp) {
        String str;
        try {
            byte[] bArr = zzp.f22437b;
            String str2 = "ISO-8859-1";
            String str3 = zzp.f22438c.get("Content-Type");
            if (str3 != null) {
                String[] split = str3.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str2 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzp.f22437b);
        }
        return zzy.m25640a(str, zzaq.m19828a(zzp));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo26762a(String str) {
        zzaa<String> zzaa;
        synchronized (this.f18622s) {
            zzaa = this.f18623t;
        }
        if (zzaa != null) {
            zzaa.mo26800a(str);
        }
    }
}
