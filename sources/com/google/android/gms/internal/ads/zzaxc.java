package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
public final class zzaxc implements zzaxb {

    /* renamed from: a */
    private final Object f18624a = new Object();

    /* renamed from: b */
    private boolean f18625b;

    /* renamed from: c */
    private final List<Runnable> f18626c = new ArrayList();

    /* renamed from: d */
    private zzbbh<?> f18627d;

    /* renamed from: e */
    private zzuu f18628e = null;

    /* renamed from: f */
    private SharedPreferences f18629f;

    /* renamed from: g */
    private SharedPreferences.Editor f18630g;

    /* renamed from: h */
    private boolean f18631h = true;

    /* renamed from: i */
    private String f18632i;

    /* renamed from: j */
    private String f18633j;

    /* renamed from: k */
    private boolean f18634k = false;

    /* renamed from: l */
    private String f18635l = "";

    /* renamed from: m */
    private long f18636m = 0;

    /* renamed from: n */
    private long f18637n = 0;

    /* renamed from: o */
    private long f18638o = 0;

    /* renamed from: p */
    private int f18639p = -1;

    /* renamed from: q */
    private int f18640q = 0;

    /* renamed from: r */
    private Set<String> f18641r = Collections.emptySet();

    /* renamed from: s */
    private JSONObject f18642s = new JSONObject();

    /* renamed from: t */
    private boolean f18643t = true;

    /* renamed from: u */
    private boolean f18644u = true;

    /* renamed from: v */
    private String f18645v = null;

    /* renamed from: o */
    private final void m20201o() {
        zzbbh<?> zzbbh = this.f18627d;
        if (zzbbh != null && !zzbbh.isDone()) {
            try {
                this.f18627d.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                zzbad.m20522c("Interrupted while waiting for preferences loaded.", e);
            } catch (CancellationException | ExecutionException | TimeoutException e2) {
                zzbad.m20520b("Fail to initialize AdSharedPreferenceManager.", e2);
            }
        }
    }

    /* renamed from: p */
    private final Bundle m20202p() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("listener_registration_bundle", true);
        synchronized (this.f18624a) {
            bundle.putBoolean("use_https", this.f18631h);
            bundle.putBoolean("content_url_opted_out", this.f18643t);
            bundle.putBoolean("content_vertical_opted_out", this.f18644u);
            bundle.putBoolean("auto_collect_location", this.f18634k);
            bundle.putInt("version_code", this.f18640q);
            bundle.putStringArray("never_pool_slots", (String[]) this.f18641r.toArray(new String[0]));
            bundle.putString("app_settings_json", this.f18635l);
            bundle.putLong("app_settings_last_update_ms", this.f18636m);
            bundle.putLong("app_last_background_time_ms", this.f18637n);
            bundle.putInt("request_in_session_count", this.f18639p);
            bundle.putLong("first_ad_req_time_ms", this.f18638o);
            bundle.putString("native_advanced_settings", this.f18642s.toString());
            bundle.putString("display_cutout", this.f18645v);
            if (this.f18632i != null) {
                bundle.putString("content_url_hashes", this.f18632i);
            }
            if (this.f18633j != null) {
                bundle.putString("content_vertical_hashes", this.f18633j);
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo27793a(Context context, String str, boolean z) {
        String str2;
        if (str == null) {
            str2 = "admob";
        } else {
            String valueOf = String.valueOf(str);
            str2 = valueOf.length() != 0 ? "admob__".concat(valueOf) : new String("admob__");
        }
        this.f18627d = zzaxg.m20259a((Runnable) new C7310b5(this, context, str2));
        this.f18625b = z;
    }

    /* renamed from: b */
    public final void mo27776b(boolean z) {
        m20201o();
        synchronized (this.f18624a) {
            if (this.f18634k != z) {
                this.f18634k = z;
                if (this.f18630g != null) {
                    this.f18630g.putBoolean("auto_collect_location", z);
                    this.f18630g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("auto_collect_location", z);
                m20200a(bundle);
            }
        }
    }

    /* renamed from: c */
    public final void mo27779c(boolean z) {
        m20201o();
        synchronized (this.f18624a) {
            if (this.f18643t != z) {
                this.f18643t = z;
                if (this.f18630g != null) {
                    this.f18630g.putBoolean("content_url_opted_out", z);
                    this.f18630g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.f18643t);
                bundle.putBoolean("content_vertical_opted_out", this.f18644u);
                m20200a(bundle);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo27781d() {
        boolean z;
        m20201o();
        synchronized (this.f18624a) {
            z = this.f18644u;
        }
        return z;
    }

    /* renamed from: e */
    public final long mo27782e() {
        long j;
        m20201o();
        synchronized (this.f18624a) {
            j = this.f18638o;
        }
        return j;
    }

    /* renamed from: f */
    public final int mo27783f() {
        int i;
        m20201o();
        synchronized (this.f18624a) {
            i = this.f18639p;
        }
        return i;
    }

    /* renamed from: g */
    public final boolean mo27784g() {
        boolean z;
        m20201o();
        synchronized (this.f18624a) {
            z = this.f18643t;
        }
        return z;
    }

    /* renamed from: h */
    public final long mo27785h() {
        long j;
        m20201o();
        synchronized (this.f18624a) {
            j = this.f18637n;
        }
        return j;
    }

    /* renamed from: i */
    public final zzuu mo27786i() {
        if (!this.f18625b || !PlatformVersion.m16285a()) {
            return null;
        }
        if (mo27784g() && mo27781d()) {
            return null;
        }
        if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17837Q)).booleanValue()) {
            return null;
        }
        synchronized (this.f18624a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.f18628e == null) {
                this.f18628e = new zzuu();
            }
            this.f18628e.mo29819b();
            zzbad.m20521c("start fetching content...");
            zzuu zzuu = this.f18628e;
            return zzuu;
        }
    }

    /* renamed from: j */
    public final zzawl mo27787j() {
        zzawl zzawl;
        m20201o();
        synchronized (this.f18624a) {
            zzawl = new zzawl(this.f18635l, this.f18636m);
        }
        return zzawl;
    }

    /* renamed from: k */
    public final int mo27788k() {
        int i;
        m20201o();
        synchronized (this.f18624a) {
            i = this.f18640q;
        }
        return i;
    }

    /* renamed from: l */
    public final boolean mo27789l() {
        boolean z;
        m20201o();
        synchronized (this.f18624a) {
            z = this.f18634k;
        }
        return z;
    }

    /* renamed from: m */
    public final void mo27790m() {
        m20201o();
        synchronized (this.f18624a) {
            this.f18642s = new JSONObject();
            if (this.f18630g != null) {
                this.f18630g.remove("native_advanced_settings");
                this.f18630g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", "{}");
            m20200a(bundle);
        }
    }

    /* renamed from: n */
    public final String mo27791n() {
        String str;
        m20201o();
        synchronized (this.f18624a) {
            str = this.f18633j;
        }
        return str;
    }

    /* renamed from: a */
    private final void m20200a(Bundle bundle) {
        zzaxg.f18648a.execute(new C7347c5(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27780d(java.lang.String r4) {
        /*
            r3 = this;
            r3.m20201o()
            java.lang.Object r0 = r3.f18624a
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0032
            java.lang.String r1 = r3.f18633j     // Catch:{ all -> 0x0034 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0032
        L_0x0011:
            r3.f18633j = r4     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r3.f18630g     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0023
            android.content.SharedPreferences$Editor r1 = r3.f18630g     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "content_vertical_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r3.f18630g     // Catch:{ all -> 0x0034 }
            r1.apply()     // Catch:{ all -> 0x0034 }
        L_0x0023:
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0034 }
            r1.<init>()     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "content_vertical_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0034 }
            r3.m20200a((android.os.Bundle) r1)     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxc.mo27780d(java.lang.String):void");
    }

    /* renamed from: a */
    public final String mo27765a() {
        String str;
        m20201o();
        synchronized (this.f18624a) {
            str = this.f18632i;
        }
        return str;
    }

    /* renamed from: a */
    public final void mo27771a(boolean z) {
        m20201o();
        synchronized (this.f18624a) {
            if (this.f18644u != z) {
                this.f18644u = z;
                if (this.f18630g != null) {
                    this.f18630g.putBoolean("content_vertical_opted_out", z);
                    this.f18630g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.f18643t);
                bundle.putBoolean("content_vertical_opted_out", this.f18644u);
                m20200a(bundle);
            }
        }
    }

    /* renamed from: b */
    public final void mo27773b(int i) {
        m20201o();
        synchronized (this.f18624a) {
            if (this.f18639p != i) {
                this.f18639p = i;
                if (this.f18630g != null) {
                    this.f18630g.putInt("request_in_session_count", i);
                    this.f18630g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("request_in_session_count", i);
                m20200a(bundle);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27778c(java.lang.String r4) {
        /*
            r3 = this;
            r3.m20201o()
            java.lang.Object r0 = r3.f18624a
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0032
            java.lang.String r1 = r3.f18632i     // Catch:{ all -> 0x0034 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0032
        L_0x0011:
            r3.f18632i = r4     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r3.f18630g     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0023
            android.content.SharedPreferences$Editor r1 = r3.f18630g     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "content_url_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r3.f18630g     // Catch:{ all -> 0x0034 }
            r1.apply()     // Catch:{ all -> 0x0034 }
        L_0x0023:
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0034 }
            r1.<init>()     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "content_url_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0034 }
            r3.m20200a((android.os.Bundle) r1)     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxc.mo27778c(java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo27766a(int i) {
        m20201o();
        synchronized (this.f18624a) {
            if (this.f18640q != i) {
                this.f18640q = i;
                if (this.f18630g != null) {
                    this.f18630g.putInt("version_code", i);
                    this.f18630g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("version_code", i);
                m20200a(bundle);
            }
        }
    }

    /* renamed from: b */
    public final void mo27774b(long j) {
        m20201o();
        synchronized (this.f18624a) {
            if (this.f18638o != j) {
                this.f18638o = j;
                if (this.f18630g != null) {
                    this.f18630g.putLong("first_ad_req_time_ms", j);
                    this.f18630g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("first_ad_req_time_ms", j);
                m20200a(bundle);
            }
        }
    }

    /* renamed from: c */
    public final JSONObject mo27777c() {
        JSONObject jSONObject;
        m20201o();
        synchronized (this.f18624a) {
            jSONObject = this.f18642s;
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27769a(java.lang.String r6) {
        /*
            r5 = this;
            r5.m20201o()
            java.lang.Object r0 = r5.f18624a
            monitor-enter(r0)
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzk.zzln()     // Catch:{ all -> 0x0060 }
            long r1 = r1.mo25498b()     // Catch:{ all -> 0x0060 }
            r5.f18636m = r1     // Catch:{ all -> 0x0060 }
            if (r6 == 0) goto L_0x005e
            java.lang.String r3 = r5.f18635l     // Catch:{ all -> 0x0060 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0060 }
            if (r3 == 0) goto L_0x001b
            goto L_0x005e
        L_0x001b:
            r5.f18635l = r6     // Catch:{ all -> 0x0060 }
            android.content.SharedPreferences$Editor r3 = r5.f18630g     // Catch:{ all -> 0x0060 }
            if (r3 == 0) goto L_0x0034
            android.content.SharedPreferences$Editor r3 = r5.f18630g     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "app_settings_json"
            r3.putString(r4, r6)     // Catch:{ all -> 0x0060 }
            android.content.SharedPreferences$Editor r3 = r5.f18630g     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "app_settings_last_update_ms"
            r3.putLong(r4, r1)     // Catch:{ all -> 0x0060 }
            android.content.SharedPreferences$Editor r3 = r5.f18630g     // Catch:{ all -> 0x0060 }
            r3.apply()     // Catch:{ all -> 0x0060 }
        L_0x0034:
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x0060 }
            r3.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "app_settings_json"
            r3.putString(r4, r6)     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = "app_settings_last_update_ms"
            r3.putLong(r6, r1)     // Catch:{ all -> 0x0060 }
            r5.m20200a((android.os.Bundle) r3)     // Catch:{ all -> 0x0060 }
            java.util.List<java.lang.Runnable> r6 = r5.f18626c     // Catch:{ all -> 0x0060 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0060 }
        L_0x004c:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x005c
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x0060 }
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ all -> 0x0060 }
            r1.run()     // Catch:{ all -> 0x0060 }
            goto L_0x004c
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return
        L_0x005e:
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return
        L_0x0060:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            goto L_0x0064
        L_0x0063:
            throw r6
        L_0x0064:
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxc.mo27769a(java.lang.String):void");
    }

    /* renamed from: b */
    public final String mo27772b() {
        String str;
        m20201o();
        synchronized (this.f18624a) {
            str = this.f18645v;
        }
        return str;
    }

    /* renamed from: b */
    public final void mo27775b(String str) {
        m20201o();
        synchronized (this.f18624a) {
            if (!TextUtils.equals(this.f18645v, str)) {
                this.f18645v = str;
                if (this.f18630g != null) {
                    this.f18630g.putString("display_cutout", str);
                    this.f18630g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putString("display_cutout", str);
                m20200a(bundle);
            }
        }
    }

    /* renamed from: a */
    public final void mo27768a(Runnable runnable) {
        this.f18626c.add(runnable);
    }

    /* renamed from: a */
    public final void mo27767a(long j) {
        m20201o();
        synchronized (this.f18624a) {
            if (this.f18637n != j) {
                this.f18637n = j;
                if (this.f18630g != null) {
                    this.f18630g.putLong("app_last_background_time_ms", j);
                    this.f18630g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("app_last_background_time_ms", j);
                m20200a(bundle);
            }
        }
    }

    /* renamed from: a */
    public final void mo27770a(String str, String str2, boolean z) {
        m20201o();
        synchronized (this.f18624a) {
            JSONArray optJSONArray = this.f18642s.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i = 0;
            while (true) {
                if (i < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        if (!str2.equals(optJSONObject.optString("template_id"))) {
                            i++;
                        } else if (!z || !optJSONObject.optBoolean("uses_media_view", false)) {
                            length = i;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", zzk.zzln().mo25498b());
                optJSONArray.put(length, jSONObject);
                this.f18642s.put(str, optJSONArray);
            } catch (JSONException e) {
                zzbad.m20522c("Could not update native advanced settings", e);
            }
            if (this.f18630g != null) {
                this.f18630g.putString("native_advanced_settings", this.f18642s.toString());
                this.f18630g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", this.f18642s.toString());
            m20200a(bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo27792a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.f18624a) {
            this.f18629f = sharedPreferences;
            this.f18630g = edit;
            if (PlatformVersion.m16293i()) {
                boolean isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            this.f18631h = this.f18629f.getBoolean("use_https", this.f18631h);
            this.f18643t = this.f18629f.getBoolean("content_url_opted_out", this.f18643t);
            this.f18632i = this.f18629f.getString("content_url_hashes", this.f18632i);
            this.f18634k = this.f18629f.getBoolean("auto_collect_location", this.f18634k);
            this.f18644u = this.f18629f.getBoolean("content_vertical_opted_out", this.f18644u);
            this.f18633j = this.f18629f.getString("content_vertical_hashes", this.f18633j);
            this.f18640q = this.f18629f.getInt("version_code", this.f18640q);
            this.f18635l = this.f18629f.getString("app_settings_json", this.f18635l);
            this.f18636m = this.f18629f.getLong("app_settings_last_update_ms", this.f18636m);
            this.f18637n = this.f18629f.getLong("app_last_background_time_ms", this.f18637n);
            this.f18639p = this.f18629f.getInt("request_in_session_count", this.f18639p);
            this.f18638o = this.f18629f.getLong("first_ad_req_time_ms", this.f18638o);
            this.f18641r = this.f18629f.getStringSet("never_pool_slots", this.f18641r);
            this.f18645v = this.f18629f.getString("display_cutout", this.f18645v);
            try {
                this.f18642s = new JSONObject(this.f18629f.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                zzbad.m20522c("Could not convert native advanced settings to json object", e);
            }
            m20200a(m20202p());
        }
    }
}
