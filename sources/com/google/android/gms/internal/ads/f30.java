package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;

final class f30 {

    /* renamed from: a */
    private final zznn[] f15180a;

    /* renamed from: b */
    private final zznp f15181b;

    /* renamed from: c */
    private zznn f15182c;

    public f30(zznn[] zznnArr, zznp zznp) {
        this.f15180a = zznnArr;
        this.f15181b = zznp;
    }

    /* renamed from: a */
    public final zznn mo25909a(zzno zzno, Uri uri) throws IOException, InterruptedException {
        zznn zznn = this.f15182c;
        if (zznn != null) {
            return zznn;
        }
        zznn[] zznnArr = this.f15180a;
        int length = zznnArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            zznn zznn2 = zznnArr[i];
            try {
                if (zznn2.mo29586a(zzno)) {
                    this.f15182c = zznn2;
                    zzno.mo29572a();
                    break;
                }
                i++;
            } catch (EOFException unused) {
            } finally {
                zzno.mo29572a();
            }
        }
        zznn zznn3 = this.f15182c;
        if (zznn3 != null) {
            zznn3.mo29585a(this.f15181b);
            return this.f15182c;
        }
        String a = zzsy.m25285a((Object[]) this.f15180a);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 58);
        sb.append("None of the available extractors (");
        sb.append(a);
        sb.append(") could read the stream.");
        throw new zzrc(sb.toString(), uri);
    }

    /* renamed from: a */
    public final void mo25910a() {
        zznn zznn = this.f15182c;
        if (zznn != null) {
            zznn.mo29583a();
            this.f15182c = null;
        }
    }
}
