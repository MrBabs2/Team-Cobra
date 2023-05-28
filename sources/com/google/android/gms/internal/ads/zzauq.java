package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
public final class zzauq implements zzavb {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static List<Future<Void>> f18530n = Collections.synchronizedList(new ArrayList());

    /* renamed from: o */
    private static ScheduledExecutorService f18531o = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzdsj f18532a;

    /* renamed from: b */
    private final LinkedHashMap<String, zzdsp> f18533b;

    /* renamed from: c */
    private final List<String> f18534c = new ArrayList();

    /* renamed from: d */
    private final List<String> f18535d = new ArrayList();

    /* renamed from: e */
    private final Context f18536e;

    /* renamed from: f */
    private final zzavd f18537f;

    /* renamed from: g */
    private boolean f18538g;

    /* renamed from: h */
    private final zzauy f18539h;

    /* renamed from: i */
    private final C7346c4 f18540i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Object f18541j = new Object();

    /* renamed from: k */
    private HashSet<String> f18542k = new HashSet<>();

    /* renamed from: l */
    private boolean f18543l = false;

    /* renamed from: m */
    private boolean f18544m = false;

    public zzauq(Context context, zzbai zzbai, zzauy zzauy, String str, zzavd zzavd) {
        Preconditions.m16038a(zzauy, (Object) "SafeBrowsing config is not present.");
        this.f18536e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f18533b = new LinkedHashMap<>();
        this.f18537f = zzavd;
        this.f18539h = zzauy;
        for (String lowerCase : zzauy.f18549j) {
            this.f18542k.add(lowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.f18542k.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzdsj zzdsj = new zzdsj();
        zzdsj.f21688c = 8;
        zzdsj.f21689d = str;
        zzdsj.f21690e = str;
        zzdsk zzdsk = new zzdsk();
        zzdsj.f21691f = zzdsk;
        zzdsk.f21699c = this.f18539h.f18545f;
        zzdsq zzdsq = new zzdsq();
        zzdsq.f21714c = zzbai.f18742f;
        zzdsq.f21716e = Boolean.valueOf(Wrappers.m16317a(this.f18536e).mo25508a());
        long b = (long) GoogleApiAvailabilityLight.m15275a().mo24878b(this.f18536e);
        if (b > 0) {
            zzdsq.f21715d = Long.valueOf(b);
        }
        zzdsj.f21696k = zzdsq;
        this.f18532a = zzdsj;
        this.f18540i = new C7346c4(this.f18536e, this.f18539h.f18552m, this);
    }

    /* renamed from: e */
    private final zzbbh<Void> m20035e() {
        zzbbh<Void> a;
        if (!((this.f18538g && this.f18539h.f18551l) || (this.f18544m && this.f18539h.f18550k) || (!this.f18538g && this.f18539h.f18548i))) {
            return zzbar.m20539a(null);
        }
        synchronized (this.f18541j) {
            this.f18532a.f21692g = new zzdsp[this.f18533b.size()];
            this.f18533b.values().toArray(this.f18532a.f21692g);
            this.f18532a.f21697l = (String[]) this.f18534c.toArray(new String[0]);
            this.f18532a.f21698m = (String[]) this.f18535d.toArray(new String[0]);
            if (zzava.m20053a()) {
                String str = this.f18532a.f21689d;
                String str2 = this.f18532a.f21693h;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 53 + String.valueOf(str2).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(str);
                sb.append("\n  clickUrl: ");
                sb.append(str2);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (zzdsp zzdsp : this.f18532a.f21692g) {
                    sb2.append("    [");
                    sb2.append(zzdsp.f21713h.length);
                    sb2.append("] ");
                    sb2.append(zzdsp.f21709d);
                }
                zzava.m20052a(sb2.toString());
            }
            zzbbh<String> a2 = new zzayu(this.f18536e).mo27860a(1, this.f18539h.f18546g, (Map<String, String>) null, zzdrw.m24141a((zzdrw) this.f18532a));
            if (zzava.m20053a()) {
                a2.mo25573b(new C7309b4(this), zzaxg.f18648a);
            }
            a = zzbar.m20543a(a2, C8162y3.f17264a, zzbbm.f18749b);
        }
        return a;
    }

    /* renamed from: e */
    static final /* synthetic */ Void m20036e(String str) {
        return null;
    }

    /* renamed from: a */
    public final void mo27671a(String str) {
        synchronized (this.f18541j) {
            this.f18532a.f21693h = str;
        }
    }

    /* renamed from: b */
    public final void mo27674b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo27675b(String str) {
        synchronized (this.f18541j) {
            this.f18534c.add(str);
        }
    }

    /* renamed from: c */
    public final boolean mo27677c() {
        return PlatformVersion.m16290f() && this.f18539h.f18547h && !this.f18543l;
    }

    /* renamed from: d */
    public final zzauy mo27678d() {
        return this.f18539h;
    }

    /* renamed from: d */
    private final zzdsp m20034d(String str) {
        zzdsp zzdsp;
        synchronized (this.f18541j) {
            zzdsp = this.f18533b.get(str);
        }
        return zzdsp;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo27676c(String str) {
        synchronized (this.f18541j) {
            this.f18535d.add(str);
        }
    }

    /* renamed from: a */
    public final void mo27670a(View view) {
        if (this.f18539h.f18547h && !this.f18543l) {
            zzk.zzlg();
            Bitmap b = zzaxi.m20282b(view);
            if (b == null) {
                zzava.m20052a("Failed to capture the webview bitmap.");
                return;
            }
            this.f18543l = true;
            zzaxi.m20277a((Runnable) new C8199z3(this, b));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27672a(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, int r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f18541j
            monitor-enter(r0)
            r1 = 3
            if (r9 != r1) goto L_0x0009
            r2 = 1
            r6.f18544m = r2     // Catch:{ all -> 0x00c6 }
        L_0x0009:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.zzdsp> r2 = r6.f18533b     // Catch:{ all -> 0x00c6 }
            boolean r2 = r2.containsKey(r7)     // Catch:{ all -> 0x00c6 }
            if (r2 == 0) goto L_0x0023
            if (r9 != r1) goto L_0x0021
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.zzdsp> r8 = r6.f18533b     // Catch:{ all -> 0x00c6 }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzdsp r7 = (com.google.android.gms.internal.ads.zzdsp) r7     // Catch:{ all -> 0x00c6 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00c6 }
            r7.f21712g = r8     // Catch:{ all -> 0x00c6 }
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            return
        L_0x0023:
            com.google.android.gms.internal.ads.zzdsp r1 = new com.google.android.gms.internal.ads.zzdsp     // Catch:{ all -> 0x00c6 }
            r1.<init>()     // Catch:{ all -> 0x00c6 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00c6 }
            r1.f21712g = r9     // Catch:{ all -> 0x00c6 }
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.zzdsp> r9 = r6.f18533b     // Catch:{ all -> 0x00c6 }
            int r9 = r9.size()     // Catch:{ all -> 0x00c6 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00c6 }
            r1.f21708c = r9     // Catch:{ all -> 0x00c6 }
            r1.f21709d = r7     // Catch:{ all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzdsm r9 = new com.google.android.gms.internal.ads.zzdsm     // Catch:{ all -> 0x00c6 }
            r9.<init>()     // Catch:{ all -> 0x00c6 }
            r1.f21710e = r9     // Catch:{ all -> 0x00c6 }
            java.util.HashSet<java.lang.String> r9 = r6.f18542k     // Catch:{ all -> 0x00c6 }
            int r9 = r9.size()     // Catch:{ all -> 0x00c6 }
            if (r9 <= 0) goto L_0x00bf
            if (r8 == 0) goto L_0x00bf
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x00c6 }
            r9.<init>()     // Catch:{ all -> 0x00c6 }
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x00c6 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00c6 }
        L_0x005a:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x00c6 }
            if (r2 == 0) goto L_0x00b2
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x00c6 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00c6 }
            java.lang.Object r3 = r2.getKey()     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            if (r3 == 0) goto L_0x0073
            java.lang.Object r3 = r2.getKey()     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            goto L_0x0075
        L_0x0073:
            java.lang.String r3 = ""
        L_0x0075:
            java.lang.Object r4 = r2.getValue()     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            if (r4 == 0) goto L_0x0082
            java.lang.Object r2 = r2.getValue()     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            goto L_0x0084
        L_0x0082:
            java.lang.String r2 = ""
        L_0x0084:
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            java.lang.String r4 = r3.toLowerCase(r4)     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            java.util.HashSet<java.lang.String> r5 = r6.f18542k     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            boolean r4 = r5.contains(r4)     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            if (r4 != 0) goto L_0x0093
            goto L_0x005a
        L_0x0093:
            com.google.android.gms.internal.ads.zzdsl r4 = new com.google.android.gms.internal.ads.zzdsl     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            r4.<init>()     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            java.lang.String r5 = "UTF-8"
            byte[] r3 = r3.getBytes(r5)     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            r4.f21701c = r3     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            java.lang.String r3 = "UTF-8"
            byte[] r2 = r2.getBytes(r3)     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            r4.f21702d = r2     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            r9.add(r4)     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            goto L_0x005a
        L_0x00ac:
            java.lang.String r2 = "Cannot convert string to bytes, skip header."
            com.google.android.gms.internal.ads.zzava.m20052a(r2)     // Catch:{ all -> 0x00c6 }
            goto L_0x005a
        L_0x00b2:
            int r8 = r9.size()     // Catch:{ all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzdsl[] r8 = new com.google.android.gms.internal.ads.zzdsl[r8]     // Catch:{ all -> 0x00c6 }
            r9.toArray(r8)     // Catch:{ all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzdsm r9 = r1.f21710e     // Catch:{ all -> 0x00c6 }
            r9.f21703c = r8     // Catch:{ all -> 0x00c6 }
        L_0x00bf:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.zzdsp> r8 = r6.f18533b     // Catch:{ all -> 0x00c6 }
            r8.put(r7, r1)     // Catch:{ all -> 0x00c6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            return
        L_0x00c6:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            goto L_0x00ca
        L_0x00c9:
            throw r7
        L_0x00ca:
            goto L_0x00c9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzauq.mo27672a(java.lang.String, java.util.Map, int):void");
    }

    /* renamed from: a */
    public final String[] mo27673a(String[] strArr) {
        return (String[]) this.f18540i.mo25762a(strArr).toArray(new String[0]);
    }

    /* renamed from: a */
    public final void mo27669a() {
        synchronized (this.f18541j) {
            zzbbh<B> a = zzbar.m20542a(this.f18537f.mo27679a(this.f18536e, this.f18533b.keySet()), new C8125x3(this), zzbbm.f18749b);
            zzbbh<V> a2 = zzbar.m20541a(a, 10, TimeUnit.SECONDS, f18531o);
            zzbar.m20546a(a, new C7272a4(this, a2), zzbbm.f18749b);
            f18530n.add(a2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzbbh mo27668a(Map map) throws Exception {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.f18541j) {
                            int length = optJSONArray.length();
                            zzdsp d = m20034d(str);
                            if (d == null) {
                                String valueOf = String.valueOf(str);
                                zzava.m20052a(valueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(valueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                d.f21713h = new String[length];
                                boolean z = false;
                                for (int i = 0; i < length; i++) {
                                    d.f21713h[i] = optJSONArray.getJSONObject(i).getString("threat_type");
                                }
                                boolean z2 = this.f18538g;
                                if (length > 0) {
                                    z = true;
                                }
                                this.f18538g = z | z2;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17839Q1)).booleanValue()) {
                    zzbad.m20517a("Failed to get SafeBrowsing metadata", e);
                }
                return zzbar.m20538a((Throwable) new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f18538g) {
            synchronized (this.f18541j) {
                this.f18532a.f21688c = 9;
            }
        }
        return m20035e();
    }
}
