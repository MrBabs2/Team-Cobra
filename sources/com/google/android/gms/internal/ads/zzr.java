package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzag;
import java.util.Collections;
import java.util.Map;

public abstract class zzr<T> implements Comparable<zzr<T>> {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final zzag.C8232a f22558f;

    /* renamed from: g */
    private final int f22559g;

    /* renamed from: h */
    private final String f22560h;

    /* renamed from: i */
    private final int f22561i;

    /* renamed from: j */
    private final Object f22562j;

    /* renamed from: k */
    private zzz f22563k;

    /* renamed from: l */
    private Integer f22564l;

    /* renamed from: m */
    private zzv f22565m;

    /* renamed from: n */
    private boolean f22566n;

    /* renamed from: o */
    private boolean f22567o;

    /* renamed from: p */
    private zzac f22568p;

    /* renamed from: q */
    private zzc f22569q;

    /* renamed from: r */
    private q30 f22570r;

    public zzr(int i, String str, zzz zzz) {
        Uri parse;
        String host;
        this.f22558f = zzag.C8232a.f18076c ? new zzag.C8232a() : null;
        this.f22562j = new Object();
        this.f22566n = true;
        int i2 = 0;
        this.f22567o = false;
        this.f22569q = null;
        this.f22559g = i;
        this.f22560h = str;
        this.f22563k = zzz;
        this.f22568p = new zzh();
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i2 = host.hashCode();
        }
        this.f22561i = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract zzy<T> mo27762a(zzp zzp);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo26762a(T t);

    /* renamed from: a */
    public final void mo29653a(String str) {
        if (zzag.C8232a.f18076c) {
            this.f22558f.mo27268a(str, Thread.currentThread().getId());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo29655b(String str) {
        zzv zzv = this.f22565m;
        if (zzv != null) {
            zzv.mo29831b(this);
        }
        if (zzag.C8232a.f18076c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new n30(this, str, id));
                return;
            }
            this.f22558f.mo27268a(str, id);
            this.f22558f.mo27267a(toString());
        }
    }

    public /* synthetic */ int compareTo(Object obj) {
        zzr zzr = (zzr) obj;
        zzu zzu = zzu.NORMAL;
        return zzu == zzu ? this.f22564l.intValue() - zzr.f22564l.intValue() : zzu.ordinal() - zzu.ordinal();
    }

    /* renamed from: d */
    public final int mo29657d() {
        return this.f22559g;
    }

    /* renamed from: e */
    public final String mo29658e() {
        return this.f22560h;
    }

    /* renamed from: i */
    public final boolean mo29659i() {
        synchronized (this.f22562j) {
        }
        return false;
    }

    /* renamed from: l */
    public final int mo29660l() {
        return this.f22561i;
    }

    /* renamed from: m */
    public final String mo29661m() {
        String str = this.f22560h;
        int i = this.f22559g;
        if (i == 0 || i == -1) {
            return str;
        }
        String num = Integer.toString(i);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length());
        sb.append(num);
        sb.append('-');
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: o */
    public final zzc mo29662o() {
        return this.f22569q;
    }

    /* renamed from: p */
    public byte[] mo26764p() throws zza {
        return null;
    }

    /* renamed from: q */
    public final boolean mo29663q() {
        return this.f22566n;
    }

    /* renamed from: r */
    public final int mo29664r() {
        return this.f22568p.mo27140D();
    }

    /* renamed from: s */
    public final zzac mo29665s() {
        return this.f22568p;
    }

    /* renamed from: t */
    public final void mo29666t() {
        synchronized (this.f22562j) {
            this.f22567o = true;
        }
    }

    public String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.f22561i));
        String concat = valueOf.length() != 0 ? "0x".concat(valueOf) : new String("0x");
        mo29659i();
        String str = this.f22560h;
        String valueOf2 = String.valueOf(zzu.NORMAL);
        String valueOf3 = String.valueOf(this.f22564l);
        StringBuilder sb = new StringBuilder("[ ] ".length() + 3 + String.valueOf(str).length() + String.valueOf(concat).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(concat);
        sb.append(" ");
        sb.append(valueOf2);
        sb.append(" ");
        sb.append(valueOf3);
        return sb.toString();
    }

    /* renamed from: v */
    public final boolean mo29668v() {
        boolean z;
        synchronized (this.f22562j) {
            z = this.f22567o;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo29669w() {
        q30 q30;
        synchronized (this.f22562j) {
            q30 = this.f22570r;
        }
        if (q30 != null) {
            q30.mo26465a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29649a(int i) {
        zzv zzv = this.f22565m;
        if (zzv != null) {
            zzv.mo29830a(this, i);
        }
    }

    /* renamed from: a */
    public final zzr<?> mo29648a(zzv zzv) {
        this.f22565m = zzv;
        return this;
    }

    /* renamed from: a */
    public final zzr<?> mo29647a(zzc zzc) {
        this.f22569q = zzc;
        return this;
    }

    /* renamed from: a */
    public Map<String, String> mo26761a() throws zza {
        return Collections.emptyMap();
    }

    /* renamed from: a */
    public final void mo29651a(zzaf zzaf) {
        zzz zzz;
        synchronized (this.f22562j) {
            zzz = this.f22563k;
        }
        if (zzz != null) {
            zzz.mo25569a(zzaf);
        }
    }

    /* renamed from: b */
    public final zzr<?> mo29654b(int i) {
        this.f22564l = Integer.valueOf(i);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29650a(q30 q30) {
        synchronized (this.f22562j) {
            this.f22570r = q30;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29652a(zzy<?> zzy) {
        q30 q30;
        synchronized (this.f22562j) {
            q30 = this.f22570r;
        }
        if (q30 != null) {
            q30.mo26466a(this, zzy);
        }
    }
}
