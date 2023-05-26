package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@zzard
public final class zzadi {
    @VisibleForTesting

    /* renamed from: a */
    boolean f18014a = true;

    /* renamed from: b */
    private final List<zzadg> f18015b = new LinkedList();

    /* renamed from: c */
    private final Map<String, String> f18016c = new LinkedHashMap();

    /* renamed from: d */
    private final Object f18017d = new Object();

    /* renamed from: e */
    private zzadi f18018e;

    public zzadi(boolean z, String str, String str2) {
        this.f18016c.put("action", str);
        this.f18016c.put("ad_format", str2);
    }

    /* renamed from: a */
    public final void mo27183a(zzadi zzadi) {
        synchronized (this.f18017d) {
            this.f18018e = zzadi;
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: b */
    public final Map<String, String> mo27186b() {
        synchronized (this.f18017d) {
            zzacy c = zzk.zzlk().mo27737c();
            if (c != null) {
                if (this.f18018e != null) {
                    Map<String, String> a = c.mo27172a(this.f18016c, this.f18018e.mo27186b());
                    return a;
                }
            }
            Map<String, String> map = this.f18016c;
            return map;
        }
    }

    /* renamed from: a */
    public final zzadg mo27181a(long j) {
        if (!this.f18014a) {
            return null;
        }
        return new zzadg(j, (String) null, (zzadg) null);
    }

    /* renamed from: a */
    public final boolean mo27185a(zzadg zzadg, long j, String... strArr) {
        synchronized (this.f18017d) {
            for (String zzadg2 : strArr) {
                this.f18015b.add(new zzadg(j, zzadg2, zzadg));
            }
        }
        return true;
    }

    /* renamed from: a */
    public final String mo27182a() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.f18017d) {
            for (zzadg next : this.f18015b) {
                long a = next.mo27175a();
                String b = next.mo27176b();
                zzadg c = next.mo27177c();
                if (c != null && a > 0) {
                    sb2.append(b);
                    sb2.append('.');
                    sb2.append(a - c.mo27175a());
                    sb2.append(',');
                }
            }
            this.f18015b.clear();
            if (!TextUtils.isEmpty((CharSequence) null)) {
                sb2.append((String) null);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb = sb2.toString();
        }
        return sb;
    }

    /* renamed from: a */
    public final void mo27184a(String str, String str2) {
        zzacy c;
        if (this.f18014a && !TextUtils.isEmpty(str2) && (c = zzk.zzlk().mo27737c()) != null) {
            synchronized (this.f18017d) {
                zzadc a = c.mo27171a(str);
                Map<String, String> map = this.f18016c;
                map.put(str, a.mo26636a(map.get(str), str2));
            }
        }
    }
}
