package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzbp;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class zzdy {

    /* renamed from: s */
    private static final String f21774s = "zzdy";

    /* renamed from: a */
    protected Context f21775a;

    /* renamed from: b */
    private ExecutorService f21776b;

    /* renamed from: c */
    private DexClassLoader f21777c;

    /* renamed from: d */
    private zzdj f21778d;

    /* renamed from: e */
    private byte[] f21779e;

    /* renamed from: f */
    private volatile AdvertisingIdClient f21780f = null;

    /* renamed from: g */
    private volatile boolean f21781g;

    /* renamed from: h */
    private Future f21782h;

    /* renamed from: i */
    private boolean f21783i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public volatile zzbp.zza f21784j;

    /* renamed from: k */
    private Future f21785k;

    /* renamed from: l */
    private zzda f21786l;

    /* renamed from: m */
    protected boolean f21787m;

    /* renamed from: n */
    private boolean f21788n;

    /* renamed from: o */
    private Map<Pair<String, String>, zzfi> f21789o;

    /* renamed from: p */
    private boolean f21790p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f21791q;

    /* renamed from: r */
    private boolean f21792r;

    /* renamed from: com.google.android.gms.internal.ads.zzdy$a */
    final class C8242a extends BroadcastReceiver {
        private C8242a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                boolean unused = zzdy.this.f21791q = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = zzdy.this.f21791q = false;
            }
        }

        /* synthetic */ C8242a(zzdy zzdy, C7786ny nyVar) {
            this();
        }
    }

    private zzdy(Context context) {
        boolean z = false;
        this.f21781g = false;
        this.f21782h = null;
        this.f21784j = null;
        this.f21785k = null;
        this.f21787m = false;
        this.f21788n = false;
        this.f21790p = false;
        this.f21791q = true;
        this.f21792r = false;
        Context applicationContext = context.getApplicationContext();
        z = applicationContext != null ? true : z;
        this.f21783i = z;
        this.f21775a = z ? applicationContext : context;
        this.f21789o = new HashMap();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(33:0|1|2|(1:4)|5|6|7|8|(1:10)(1:11)|12|(1:14)(1:15)|16|17|18|(2:20|(1:22)(2:23|24))|25|26|27|28|29|(2:31|(1:33)(2:34|35))|36|(1:38)|39|40|41|42|43|44|45|(1:47)|48|69) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004d */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056 A[Catch:{ zzdk -> 0x014e, zzdv -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087 A[Catch:{ all -> 0x011d, FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2 A[Catch:{ all -> 0x011d, FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f8 A[Catch:{ zzdk -> 0x014e, zzdv -> 0x0155 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzdy m24255a(android.content.Context r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.String r0 = "%s/%s.dex"
            com.google.android.gms.internal.ads.zzdy r1 = new com.google.android.gms.internal.ads.zzdy
            r1.<init>(r9)
            com.google.android.gms.internal.ads.ny r9 = new com.google.android.gms.internal.ads.ny     // Catch:{ zzdv -> 0x0155 }
            r9.<init>()     // Catch:{ zzdv -> 0x0155 }
            java.util.concurrent.ExecutorService r9 = java.util.concurrent.Executors.newCachedThreadPool(r9)     // Catch:{ zzdv -> 0x0155 }
            r1.f21776b = r9     // Catch:{ zzdv -> 0x0155 }
            r1.f21781g = r12     // Catch:{ zzdv -> 0x0155 }
            if (r12 == 0) goto L_0x0023
            java.util.concurrent.ExecutorService r9 = r1.f21776b     // Catch:{ zzdv -> 0x0155 }
            com.google.android.gms.internal.ads.py r12 = new com.google.android.gms.internal.ads.py     // Catch:{ zzdv -> 0x0155 }
            r12.<init>(r1)     // Catch:{ zzdv -> 0x0155 }
            java.util.concurrent.Future r9 = r9.submit(r12)     // Catch:{ zzdv -> 0x0155 }
            r1.f21782h = r9     // Catch:{ zzdv -> 0x0155 }
        L_0x0023:
            java.util.concurrent.ExecutorService r9 = r1.f21776b     // Catch:{ zzdv -> 0x0155 }
            com.google.android.gms.internal.ads.ry r12 = new com.google.android.gms.internal.ads.ry     // Catch:{ zzdv -> 0x0155 }
            r12.<init>(r1)     // Catch:{ zzdv -> 0x0155 }
            r9.execute(r12)     // Catch:{ zzdv -> 0x0155 }
            r9 = 1
            r12 = 0
            com.google.android.gms.common.GoogleApiAvailabilityLight r2 = com.google.android.gms.common.GoogleApiAvailabilityLight.m15275a()     // Catch:{ all -> 0x004d }
            android.content.Context r3 = r1.f21775a     // Catch:{ all -> 0x004d }
            int r3 = r2.mo24878b((android.content.Context) r3)     // Catch:{ all -> 0x004d }
            if (r3 <= 0) goto L_0x003d
            r3 = 1
            goto L_0x003e
        L_0x003d:
            r3 = 0
        L_0x003e:
            r1.f21787m = r3     // Catch:{ all -> 0x004d }
            android.content.Context r3 = r1.f21775a     // Catch:{ all -> 0x004d }
            int r2 = r2.mo24869c((android.content.Context) r3)     // Catch:{ all -> 0x004d }
            if (r2 != 0) goto L_0x004a
            r2 = 1
            goto L_0x004b
        L_0x004a:
            r2 = 0
        L_0x004b:
            r1.f21788n = r2     // Catch:{ all -> 0x004d }
        L_0x004d:
            r1.mo29239a((int) r12, (boolean) r9)     // Catch:{ zzdv -> 0x0155 }
            boolean r2 = com.google.android.gms.internal.ads.zzef.m24290a()     // Catch:{ zzdv -> 0x0155 }
            if (r2 == 0) goto L_0x0071
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.zzacu.f17971u1     // Catch:{ zzdv -> 0x0155 }
            com.google.android.gms.internal.ads.zzacr r3 = com.google.android.gms.internal.ads.zzyt.m25670e()     // Catch:{ zzdv -> 0x0155 }
            java.lang.Object r2 = r3.mo27163a(r2)     // Catch:{ zzdv -> 0x0155 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ zzdv -> 0x0155 }
            boolean r2 = r2.booleanValue()     // Catch:{ zzdv -> 0x0155 }
            if (r2 != 0) goto L_0x0069
            goto L_0x0071
        L_0x0069:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ zzdv -> 0x0155 }
            java.lang.String r10 = "Task Context initialization must not be called from the UI thread."
            r9.<init>(r10)     // Catch:{ zzdv -> 0x0155 }
            throw r9     // Catch:{ zzdv -> 0x0155 }
        L_0x0071:
            com.google.android.gms.internal.ads.zzdj r2 = new com.google.android.gms.internal.ads.zzdj     // Catch:{ zzdv -> 0x0155 }
            r3 = 0
            r2.<init>(r3)     // Catch:{ zzdv -> 0x0155 }
            r1.f21778d = r2     // Catch:{ zzdv -> 0x0155 }
            byte[] r10 = r2.mo29052a(r10)     // Catch:{ zzdk -> 0x014e }
            r1.f21779e = r10     // Catch:{ zzdk -> 0x014e }
            android.content.Context r10 = r1.f21775a     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            java.io.File r10 = r10.getCacheDir()     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            if (r10 != 0) goto L_0x0098
            android.content.Context r10 = r1.f21775a     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            java.lang.String r2 = "dex"
            java.io.File r10 = r10.getDir(r2, r12)     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            if (r10 == 0) goto L_0x0092
            goto L_0x0098
        L_0x0092:
            com.google.android.gms.internal.ads.zzdv r9 = new com.google.android.gms.internal.ads.zzdv     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            r9.<init>()     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            throw r9     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
        L_0x0098:
            java.lang.String r2 = "1542658731108"
            java.io.File r4 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            java.lang.String r5 = "%s/%s.jar"
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            r7[r12] = r10     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            r7[r9] = r2     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            java.lang.String r5 = java.lang.String.format(r5, r7)     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            boolean r5 = r4.exists()     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            if (r5 != 0) goto L_0x00c9
            com.google.android.gms.internal.ads.zzdj r5 = r1.f21778d     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            byte[] r7 = r1.f21779e     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            byte[] r11 = r5.mo29053a((byte[]) r7, (java.lang.String) r11)     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            r4.createNewFile()     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            r5.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            int r7 = r11.length     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            r5.write(r11, r12, r7)     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            r5.close()     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
        L_0x00c9:
            r1.m24263b((java.io.File) r10, (java.lang.String) r2)     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            dalvik.system.DexClassLoader r11 = new dalvik.system.DexClassLoader     // Catch:{ all -> 0x011d }
            java.lang.String r5 = r4.getAbsolutePath()     // Catch:{ all -> 0x011d }
            java.lang.String r7 = r10.getAbsolutePath()     // Catch:{ all -> 0x011d }
            android.content.Context r8 = r1.f21775a     // Catch:{ all -> 0x011d }
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch:{ all -> 0x011d }
            r11.<init>(r5, r7, r3, r8)     // Catch:{ all -> 0x011d }
            r1.f21777c = r11     // Catch:{ all -> 0x011d }
            m24257a((java.io.File) r4)     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            r1.m24258a((java.io.File) r10, (java.lang.String) r2)     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            r11[r12] = r10     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            r11[r9] = r2     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            java.lang.String r10 = java.lang.String.format(r0, r11)     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            m24259a((java.lang.String) r10)     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            boolean r10 = r1.f21792r     // Catch:{ zzdv -> 0x0155 }
            if (r10 != 0) goto L_0x0113
            android.content.IntentFilter r10 = new android.content.IntentFilter     // Catch:{ zzdv -> 0x0155 }
            r10.<init>()     // Catch:{ zzdv -> 0x0155 }
            java.lang.String r11 = "android.intent.action.USER_PRESENT"
            r10.addAction(r11)     // Catch:{ zzdv -> 0x0155 }
            java.lang.String r11 = "android.intent.action.SCREEN_OFF"
            r10.addAction(r11)     // Catch:{ zzdv -> 0x0155 }
            android.content.Context r11 = r1.f21775a     // Catch:{ zzdv -> 0x0155 }
            com.google.android.gms.internal.ads.zzdy$a r12 = new com.google.android.gms.internal.ads.zzdy$a     // Catch:{ zzdv -> 0x0155 }
            r12.<init>(r1, r3)     // Catch:{ zzdv -> 0x0155 }
            r11.registerReceiver(r12, r10)     // Catch:{ zzdv -> 0x0155 }
            r1.f21792r = r9     // Catch:{ zzdv -> 0x0155 }
        L_0x0113:
            com.google.android.gms.internal.ads.zzda r10 = new com.google.android.gms.internal.ads.zzda     // Catch:{ zzdv -> 0x0155 }
            r10.<init>(r1)     // Catch:{ zzdv -> 0x0155 }
            r1.f21786l = r10     // Catch:{ zzdv -> 0x0155 }
            r1.f21790p = r9     // Catch:{ zzdv -> 0x0155 }
            goto L_0x0155
        L_0x011d:
            r11 = move-exception
            m24257a((java.io.File) r4)     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            r1.m24258a((java.io.File) r10, (java.lang.String) r2)     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            r3[r12] = r10     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            r3[r9] = r2     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            java.lang.String r9 = java.lang.String.format(r0, r3)     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            m24259a((java.lang.String) r9)     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
            throw r11     // Catch:{ FileNotFoundException -> 0x0147, IOException -> 0x0140, zzdk -> 0x0139, NullPointerException -> 0x0132 }
        L_0x0132:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzdv r10 = new com.google.android.gms.internal.ads.zzdv     // Catch:{ zzdv -> 0x0155 }
            r10.<init>(r9)     // Catch:{ zzdv -> 0x0155 }
            throw r10     // Catch:{ zzdv -> 0x0155 }
        L_0x0139:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzdv r10 = new com.google.android.gms.internal.ads.zzdv     // Catch:{ zzdv -> 0x0155 }
            r10.<init>(r9)     // Catch:{ zzdv -> 0x0155 }
            throw r10     // Catch:{ zzdv -> 0x0155 }
        L_0x0140:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzdv r10 = new com.google.android.gms.internal.ads.zzdv     // Catch:{ zzdv -> 0x0155 }
            r10.<init>(r9)     // Catch:{ zzdv -> 0x0155 }
            throw r10     // Catch:{ zzdv -> 0x0155 }
        L_0x0147:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzdv r10 = new com.google.android.gms.internal.ads.zzdv     // Catch:{ zzdv -> 0x0155 }
            r10.<init>(r9)     // Catch:{ zzdv -> 0x0155 }
            throw r10     // Catch:{ zzdv -> 0x0155 }
        L_0x014e:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzdv r10 = new com.google.android.gms.internal.ads.zzdv     // Catch:{ zzdv -> 0x0155 }
            r10.<init>(r9)     // Catch:{ zzdv -> 0x0155 }
            throw r10     // Catch:{ zzdv -> 0x0155 }
        L_0x0155:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdy.m24255a(android.content.Context, java.lang.String, java.lang.String, boolean):com.google.android.gms.internal.ads.zzdy");
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m24264o() {
        try {
            if (this.f21780f == null && this.f21783i) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.f21775a);
                advertisingIdClient.start();
                this.f21780f = advertisingIdClient;
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            this.f21780f = null;
        }
    }

    /* renamed from: p */
    private final zzbp.zza m24265p() {
        try {
            return zzdal.m23205a(this.f21775a, this.f21775a.getPackageName(), Integer.toString(this.f21775a.getPackageManager().getPackageInfo(this.f21775a.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final boolean mo29242b() {
        return this.f21790p;
    }

    /* renamed from: c */
    public final int mo29243c() {
        if (this.f21786l != null) {
            return zzda.m23175a();
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: d */
    public final ExecutorService mo29244d() {
        return this.f21776b;
    }

    /* renamed from: e */
    public final DexClassLoader mo29245e() {
        return this.f21777c;
    }

    /* renamed from: f */
    public final zzdj mo29246f() {
        return this.f21778d;
    }

    /* renamed from: g */
    public final byte[] mo29247g() {
        return this.f21779e;
    }

    /* renamed from: h */
    public final boolean mo29248h() {
        return this.f21787m;
    }

    /* renamed from: i */
    public final zzda mo29249i() {
        return this.f21786l;
    }

    /* renamed from: j */
    public final boolean mo29250j() {
        return this.f21788n;
    }

    /* renamed from: k */
    public final boolean mo29251k() {
        return this.f21791q;
    }

    /* renamed from: l */
    public final zzbp.zza mo29252l() {
        return this.f21784j;
    }

    /* renamed from: m */
    public final Future mo29253m() {
        return this.f21785k;
    }

    /* renamed from: n */
    public final AdvertisingIdClient mo29254n() {
        if (!this.f21781g) {
            return null;
        }
        if (this.f21780f != null) {
            return this.f21780f;
        }
        Future future = this.f21782h;
        if (future != null) {
            try {
                future.get(2000, TimeUnit.MILLISECONDS);
                this.f21782h = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.f21782h.cancel(true);
            }
        }
        return this.f21780f;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00cc */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e4 A[SYNTHETIC, Splitter:B:55:0x00e4] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00eb A[SYNTHETIC, Splitter:B:59:0x00eb] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f2 A[SYNTHETIC, Splitter:B:66:0x00f2] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00f9 A[SYNTHETIC, Splitter:B:70:0x00f9] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m24263b(java.io.File r10, java.lang.String r11) {
        /*
            r9 = this;
            java.io.File r0 = new java.io.File
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r10
            r4 = 1
            r2[r4] = r11
            java.lang.String r5 = "%s/%s.tmp"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L_0x001b
            return r3
        L_0x001b:
            java.io.File r2 = new java.io.File
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r10
            r1[r4] = r11
            java.lang.String r10 = "%s/%s.dex"
            java.lang.String r10 = java.lang.String.format(r10, r1)
            r2.<init>(r10)
            boolean r10 = r2.exists()
            if (r10 == 0) goto L_0x0033
            return r3
        L_0x0033:
            r10 = 0
            long r5 = r0.length()     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ef, all -> 0x00e0 }
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0042
            m24257a((java.io.File) r0)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ef, all -> 0x00e0 }
            return r3
        L_0x0042:
            int r1 = (int) r5     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ef, all -> 0x00e0 }
            byte[] r1 = new byte[r1]     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ef, all -> 0x00e0 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ef, all -> 0x00e0 }
            r5.<init>(r0)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ef, all -> 0x00e0 }
            int r6 = r5.read(r1)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            if (r6 > 0) goto L_0x005e
            java.lang.String r11 = f21774s     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            java.lang.String r1 = "Cannot read the cache data."
            android.util.Log.d(r11, r1)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            m24257a((java.io.File) r0)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            r5.close()     // Catch:{ IOException -> 0x005d }
        L_0x005d:
            return r3
        L_0x005e:
            com.google.android.gms.internal.ads.zzdno r6 = com.google.android.gms.internal.ads.zzdno.m23986d()     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzbp$zzd r1 = com.google.android.gms.internal.ads.zzbp.zzd.m21701a((byte[]) r1, (com.google.android.gms.internal.ads.zzdno) r6)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            java.lang.String r6 = new java.lang.String     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzdmr r7 = r1.mo28372l()     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            byte[] r7 = r7.mo29071a()     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            r6.<init>(r7)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            boolean r11 = r11.equals(r6)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            if (r11 == 0) goto L_0x00d2
            com.google.android.gms.internal.ads.zzdmr r11 = r1.mo28371k()     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            byte[] r11 = r11.mo29071a()     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzdmr r6 = r1.mo28370j()     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            byte[] r6 = r6.mo29071a()     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            byte[] r6 = com.google.android.gms.internal.ads.C7582ij.m17184a((byte[]) r6)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            boolean r11 = java.util.Arrays.equals(r11, r6)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            if (r11 == 0) goto L_0x00d2
            com.google.android.gms.internal.ads.zzdmr r11 = r1.mo28373m()     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            byte[] r11 = r11.mo29071a()     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            byte[] r6 = r6.getBytes()     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            boolean r11 = java.util.Arrays.equals(r11, r6)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            if (r11 != 0) goto L_0x00a8
            goto L_0x00d2
        L_0x00a8:
            com.google.android.gms.internal.ads.zzdj r11 = r9.f21778d     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            byte[] r0 = r9.f21779e     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            java.lang.String r6 = new java.lang.String     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzdmr r1 = r1.mo28370j()     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            byte[] r1 = r1.mo29071a()     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            r6.<init>(r1)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            byte[] r11 = r11.mo29053a((byte[]) r0, (java.lang.String) r6)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            r2.createNewFile()     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            r0.<init>(r2)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            int r10 = r11.length     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00d0 }
            r0.write(r11, r3, r10)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00d0 }
            r5.close()     // Catch:{ IOException -> 0x00cc }
        L_0x00cc:
            r0.close()     // Catch:{ IOException -> 0x00cf }
        L_0x00cf:
            return r4
        L_0x00d0:
            r11 = move-exception
            goto L_0x00db
        L_0x00d2:
            m24257a((java.io.File) r0)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00dd, all -> 0x00d9 }
            r5.close()     // Catch:{ IOException -> 0x00d8 }
        L_0x00d8:
            return r3
        L_0x00d9:
            r11 = move-exception
            r0 = r10
        L_0x00db:
            r10 = r5
            goto L_0x00e2
        L_0x00dd:
            r0 = r10
        L_0x00de:
            r10 = r5
            goto L_0x00f0
        L_0x00e0:
            r11 = move-exception
            r0 = r10
        L_0x00e2:
            if (r10 == 0) goto L_0x00e9
            r10.close()     // Catch:{ IOException -> 0x00e8 }
            goto L_0x00e9
        L_0x00e8:
        L_0x00e9:
            if (r0 == 0) goto L_0x00ee
            r0.close()     // Catch:{ IOException -> 0x00ee }
        L_0x00ee:
            throw r11
        L_0x00ef:
            r0 = r10
        L_0x00f0:
            if (r10 == 0) goto L_0x00f7
            r10.close()     // Catch:{ IOException -> 0x00f6 }
            goto L_0x00f7
        L_0x00f6:
        L_0x00f7:
            if (r0 == 0) goto L_0x00fc
            r0.close()     // Catch:{ IOException -> 0x00fc }
        L_0x00fc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdy.m24263b(java.io.File, java.lang.String):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final zzbp.zza mo29241b(int i, boolean z) {
        if (i > 0 && z) {
            try {
                Thread.sleep((long) (i * 1000));
            } catch (InterruptedException unused) {
            }
        }
        return m24265p();
    }

    /* renamed from: a */
    public final Context mo29237a() {
        return this.f21775a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00bd */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d1 A[SYNTHETIC, Splitter:B:42:0x00d1] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d8 A[SYNTHETIC, Splitter:B:46:0x00d8] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e2 A[SYNTHETIC, Splitter:B:54:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e9 A[SYNTHETIC, Splitter:B:58:0x00e9] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m24258a(java.io.File r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "test"
            java.io.File r1 = new java.io.File
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r10
            r5 = 1
            r3[r5] = r11
            java.lang.String r6 = "%s/%s.tmp"
            java.lang.String r3 = java.lang.String.format(r6, r3)
            r1.<init>(r3)
            boolean r3 = r1.exists()
            if (r3 == 0) goto L_0x001d
            return
        L_0x001d:
            java.io.File r3 = new java.io.File
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r10
            r2[r5] = r11
            java.lang.String r10 = "%s/%s.dex"
            java.lang.String r10 = java.lang.String.format(r10, r2)
            r3.<init>(r10)
            boolean r10 = r3.exists()
            if (r10 != 0) goto L_0x0035
            return
        L_0x0035:
            long r5 = r3.length()
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 > 0) goto L_0x0040
            return
        L_0x0040:
            int r10 = (int) r5
            byte[] r10 = new byte[r10]
            r2 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cd }
            r5.<init>(r3)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cd }
            int r6 = r5.read(r10)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            if (r6 > 0) goto L_0x0056
            r5.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            m24257a((java.io.File) r3)
            return
        L_0x0056:
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            r6.print(r0)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            r6.print(r0)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            r6.print(r0)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzbp$zzd$zza r0 = com.google.android.gms.internal.ads.zzbp.zzd.m21710n()     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            byte[] r6 = r6.getBytes()     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzdmr r6 = com.google.android.gms.internal.ads.zzdmr.m23767b((byte[]) r6)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            r0.mo28377d(r6)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            byte[] r11 = r11.getBytes()     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzdmr r11 = com.google.android.gms.internal.ads.zzdmr.m23767b((byte[]) r11)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            r0.mo28376c(r11)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzdj r11 = r9.f21778d     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            byte[] r6 = r9.f21779e     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            java.lang.String r10 = r11.mo29051a((byte[]) r6, (byte[]) r10)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            byte[] r10 = r10.getBytes()     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzdmr r11 = com.google.android.gms.internal.ads.zzdmr.m23767b((byte[]) r10)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            r0.mo28374a(r11)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            byte[] r10 = com.google.android.gms.internal.ads.C7582ij.m17184a((byte[]) r10)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzdmr r10 = com.google.android.gms.internal.ads.zzdmr.m23767b((byte[]) r10)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            r0.mo28375b(r10)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            r1.createNewFile()     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            r10.<init>(r1)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzdpk r11 = r0.mo29143t()     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c4 }
            com.google.android.gms.internal.ads.zzdob r11 = (com.google.android.gms.internal.ads.zzdob) r11     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c4 }
            com.google.android.gms.internal.ads.zzbp$zzd r11 = (com.google.android.gms.internal.ads.zzbp.zzd) r11     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c4 }
            byte[] r11 = r11.mo29065g()     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c4 }
            int r0 = r11.length     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c4 }
            r10.write(r11, r4, r0)     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c4 }
            r10.close()     // Catch:{ zzdk | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c4 }
            r5.close()     // Catch:{ IOException -> 0x00bd }
        L_0x00bd:
            r10.close()     // Catch:{ IOException -> 0x00c0 }
        L_0x00c0:
            m24257a((java.io.File) r3)
            return
        L_0x00c4:
            r11 = move-exception
            goto L_0x00c8
        L_0x00c6:
            r11 = move-exception
            r10 = r2
        L_0x00c8:
            r2 = r5
            goto L_0x00cf
        L_0x00ca:
            r10 = r2
        L_0x00cb:
            r2 = r5
            goto L_0x00e0
        L_0x00cd:
            r11 = move-exception
            r10 = r2
        L_0x00cf:
            if (r2 == 0) goto L_0x00d6
            r2.close()     // Catch:{ IOException -> 0x00d5 }
            goto L_0x00d6
        L_0x00d5:
        L_0x00d6:
            if (r10 == 0) goto L_0x00db
            r10.close()     // Catch:{ IOException -> 0x00db }
        L_0x00db:
            m24257a((java.io.File) r3)
            throw r11
        L_0x00df:
            r10 = r2
        L_0x00e0:
            if (r2 == 0) goto L_0x00e7
            r2.close()     // Catch:{ IOException -> 0x00e6 }
            goto L_0x00e7
        L_0x00e6:
        L_0x00e7:
            if (r10 == 0) goto L_0x00ec
            r10.close()     // Catch:{ IOException -> 0x00ec }
        L_0x00ec:
            m24257a((java.io.File) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdy.m24258a(java.io.File, java.lang.String):void");
    }

    /* renamed from: a */
    private static void m24259a(String str) {
        m24257a(new File(str));
    }

    /* renamed from: a */
    private static void m24257a(File file) {
        if (!file.exists()) {
            Log.d(f21774s, String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
            return;
        }
        file.delete();
    }

    /* renamed from: a */
    public final boolean mo29240a(String str, String str2, Class<?>... clsArr) {
        if (this.f21789o.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.f21789o.put(new Pair(str, str2), new zzfi(this, str, str2, clsArr));
        return true;
    }

    /* renamed from: a */
    public final Method mo29238a(String str, String str2) {
        zzfi zzfi = this.f21789o.get(new Pair(str, str2));
        if (zzfi == null) {
            return null;
        }
        return zzfi.mo29275a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29239a(int i, boolean z) {
        if (this.f21788n) {
            Future<?> submit = this.f21776b.submit(new C7897qy(this, i, z));
            if (i == 0) {
                this.f21785k = submit;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static boolean m24260a(int i, zzbp.zza zza) {
        if (i >= 4) {
            return false;
        }
        if (zza != null && zza.mo28290k() && !zza.mo28289j().equals("0000000000000000000000000000000000000000000000000000000000000000") && zza.mo28291l() && zza.mo28292m().mo28378j() && zza.mo28292m().mo28379k() != -2) {
            return false;
        }
        return true;
    }
}
