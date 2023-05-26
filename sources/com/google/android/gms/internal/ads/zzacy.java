package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

@zzard
public final class zzacy {
    @VisibleForTesting

    /* renamed from: a */
    private BlockingQueue<zzadi> f17997a = new ArrayBlockingQueue(100);
    @VisibleForTesting

    /* renamed from: b */
    private ExecutorService f17998b;
    @VisibleForTesting

    /* renamed from: c */
    private LinkedHashMap<String, String> f17999c = new LinkedHashMap<>();
    @VisibleForTesting

    /* renamed from: d */
    private Map<String, zzadc> f18000d = new HashMap();
    @VisibleForTesting

    /* renamed from: e */
    private String f18001e;
    @VisibleForTesting

    /* renamed from: f */
    private Context f18002f;
    @VisibleForTesting

    /* renamed from: g */
    private String f18003g;

    /* renamed from: h */
    private AtomicBoolean f18004h;

    /* renamed from: i */
    private File f18005i;

    /* renamed from: a */
    public final void mo27173a(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.f18002f = context;
        this.f18003g = str;
        this.f18001e = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f18004h = atomicBoolean;
        atomicBoolean.set(((Boolean) zzyt.m25670e().mo27163a(zzacu.f17833P)).booleanValue());
        if (this.f18004h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f18005i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry next : map.entrySet()) {
            this.f17999c.put((String) next.getKey(), (String) next.getValue());
        }
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f17998b = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new C7973t(this));
        this.f18000d.put("action", zzadc.f18007b);
        this.f18000d.put("ad_format", zzadc.f18007b);
        this.f18000d.put("e", zzadc.f18008c);
    }

    /* renamed from: a */
    public final boolean mo27174a(zzadi zzadi) {
        return this.f17997a.offer(zzadi);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009f A[SYNTHETIC, Splitter:B:32:0x009f] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac A[SYNTHETIC, Splitter:B:37:0x00ac] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0002 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m18992a() {
        /*
            r6 = this;
            java.lang.String r0 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
        L_0x0002:
            java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.zzadi> r1 = r6.f17997a     // Catch:{ InterruptedException -> 0x00c8 }
            java.lang.Object r1 = r1.take()     // Catch:{ InterruptedException -> 0x00c8 }
            com.google.android.gms.internal.ads.zzadi r1 = (com.google.android.gms.internal.ads.zzadi) r1     // Catch:{ InterruptedException -> 0x00c8 }
            java.lang.String r2 = r1.mo27182a()     // Catch:{ InterruptedException -> 0x00c8 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0002
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r3 = r6.f17999c
            java.util.Map r1 = r1.mo27186b()
            java.util.Map r1 = r6.mo27172a(r3, r1)
            java.lang.String r3 = r6.f18001e
            android.net.Uri r3 = android.net.Uri.parse(r3)
            android.net.Uri$Builder r3 = r3.buildUpon()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0030:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x004c
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r3.appendQueryParameter(r5, r4)
            goto L_0x0030
        L_0x004c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            android.net.Uri r3 = r3.build()
            java.lang.String r3 = r3.toString()
            r1.<init>(r3)
            java.lang.String r3 = "&it="
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.util.concurrent.atomic.AtomicBoolean r2 = r6.f18004h
            boolean r2 = r2.get()
            if (r2 == 0) goto L_0x00bc
            java.io.File r2 = r6.f18005i
            if (r2 == 0) goto L_0x00b5
            r3 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0097 }
            r5 = 1
            r4.<init>(r2, r5)     // Catch:{ IOException -> 0x0097 }
            byte[] r1 = r1.getBytes()     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r4.write(r1)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r1 = 10
            r4.write(r1)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r4.close()     // Catch:{ IOException -> 0x0089 }
            goto L_0x0002
        L_0x0089:
            r1 = move-exception
            com.google.android.gms.internal.ads.zzbad.m20522c(r0, r1)
            goto L_0x0002
        L_0x008f:
            r1 = move-exception
            r3 = r4
            goto L_0x00aa
        L_0x0092:
            r1 = move-exception
            r3 = r4
            goto L_0x0098
        L_0x0095:
            r1 = move-exception
            goto L_0x00aa
        L_0x0097:
            r1 = move-exception
        L_0x0098:
            java.lang.String r2 = "CsiReporter: Cannot write to file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.zzbad.m20522c(r2, r1)     // Catch:{ all -> 0x0095 }
            if (r3 == 0) goto L_0x0002
            r3.close()     // Catch:{ IOException -> 0x00a4 }
            goto L_0x0002
        L_0x00a4:
            r1 = move-exception
            com.google.android.gms.internal.ads.zzbad.m20522c(r0, r1)
            goto L_0x0002
        L_0x00aa:
            if (r3 == 0) goto L_0x00b4
            r3.close()     // Catch:{ IOException -> 0x00b0 }
            goto L_0x00b4
        L_0x00b0:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzbad.m20522c(r0, r2)
        L_0x00b4:
            throw r1
        L_0x00b5:
            java.lang.String r1 = "CsiReporter: File doesn't exists. Cannot write CSI data to file."
            com.google.android.gms.internal.ads.zzbad.m20523d(r1)
            goto L_0x0002
        L_0x00bc:
            com.google.android.gms.ads.internal.zzk.zzlg()
            android.content.Context r2 = r6.f18002f
            java.lang.String r3 = r6.f18003g
            com.google.android.gms.internal.ads.zzaxi.m20275a((android.content.Context) r2, (java.lang.String) r3, (java.lang.String) r1)
            goto L_0x0002
        L_0x00c8:
            r0 = move-exception
            java.lang.String r1 = "CsiReporter:reporter interrupted"
            com.google.android.gms.internal.ads.zzbad.m20522c(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacy.m18992a():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map<String, String> mo27172a(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Map.Entry next : map2.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, mo27171a(str).mo26636a(str2, (String) next.getValue()));
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final zzadc mo27171a(String str) {
        zzadc zzadc = this.f18000d.get(str);
        if (zzadc != null) {
            return zzadc;
        }
        return zzadc.f18006a;
    }
}
