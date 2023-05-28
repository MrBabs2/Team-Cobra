package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.internal.ads.zzwl;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@zzard
public final class zzwj {

    /* renamed from: a */
    private final zzwo f22866a;

    /* renamed from: b */
    private final zzxn f22867b;

    /* renamed from: c */
    private final boolean f22868c;

    public zzwj(zzwo zzwo) {
        this.f22866a = zzwo;
        this.f22868c = ((Boolean) zzyt.m25670e().mo27163a(zzacu.f17952p2)).booleanValue();
        this.f22867b = new zzxn();
        m25466b();
    }

    /* renamed from: a */
    public static zzwj m25465a() {
        return new zzwj();
    }

    /* renamed from: b */
    private final synchronized void m25467b(zzwl.zza.zzb zzb) {
        this.f22867b.f22967d = m25469c();
        zzws a = this.f22866a.mo29860a(zzdrw.m24141a((zzdrw) this.f22867b));
        a.mo29863b(zzb.mo28259c());
        a.mo29862a();
        String valueOf = String.valueOf(Integer.toString(zzb.mo28259c(), 10));
        zzawz.m20167e(valueOf.length() != 0 ? "Logging Event with event code : ".concat(valueOf) : new String("Logging Event with event code : "));
    }

    /* renamed from: c */
    private final synchronized void m25468c(zzwl.zza.zzb zzb) {
        FileOutputStream fileOutputStream;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                try {
                    fileOutputStream.write(m25470d(zzb).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        zzawz.m20167e("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    zzawz.m20167e("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        zzawz.m20167e("Could not close Clearcut output stream.");
                    }
                }
            } catch (FileNotFoundException unused4) {
                zzawz.m20167e("Could not find file for Clearcut");
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused5) {
                    zzawz.m20167e("Could not close Clearcut output stream.");
                }
                throw th;
            }
        }
    }

    /* renamed from: d */
    private final synchronized String m25470d(zzwl.zza.zzb zzb) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", new Object[]{this.f22867b.f22966c, Long.valueOf(zzk.zzln().mo25499c()), Integer.valueOf(zzb.mo28259c()), Base64.encodeToString(zzdrw.m24141a((zzdrw) this.f22867b), 3)});
    }

    /* renamed from: a */
    public final synchronized void mo29859a(zzwl.zza.zzb zzb) {
        if (this.f22868c) {
            if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17956q2)).booleanValue()) {
                m25468c(zzb);
            } else {
                m25467b(zzb);
            }
        }
    }

    /* renamed from: b */
    private final synchronized void m25466b() {
        this.f22867b.f22969f = new zzxj();
        this.f22867b.f22969f.f22959d = new zzxk();
        this.f22867b.f22968e = new zzxl();
    }

    private zzwj() {
        this.f22868c = false;
        this.f22866a = new zzwo();
        this.f22867b = new zzxn();
        m25466b();
    }

    /* renamed from: a */
    public final synchronized void mo29858a(zzwk zzwk) {
        if (this.f22868c) {
            try {
                zzwk.mo25777a(this.f22867b);
            } catch (NullPointerException e) {
                zzk.zzlk().mo27734a((Throwable) e, "AdMobClearcutLogger.modify");
            }
        }
    }

    /* renamed from: c */
    private static long[] m25469c() {
        int i;
        List<String> b = zzacu.m18985b();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = b.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String[] split = it.next().split(",");
            int length = split.length;
            while (i < length) {
                try {
                    arrayList.add(Long.valueOf(split[i]));
                } catch (NumberFormatException unused) {
                    zzawz.m20167e("Experiment ID is not a number");
                }
                i++;
            }
        }
        long[] jArr = new long[arrayList.size()];
        int size = arrayList.size();
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jArr[i2] = ((Long) obj).longValue();
            i2++;
        }
        return jArr;
    }
}
