package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import java.lang.ref.WeakReference;

public class zzbjn {

    /* renamed from: a */
    private final zzbai f19054a;

    /* renamed from: b */
    private final Context f19055b;

    /* renamed from: c */
    private final WeakReference<Context> f19056c;

    public static class zza {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public zzbai f19057a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Context f19058b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public WeakReference<Context> f19059c;

        /* renamed from: a */
        public final zza mo28239a(zzbai zzbai) {
            this.f19057a = zzbai;
            return this;
        }

        /* renamed from: a */
        public final zza mo28238a(Context context) {
            this.f19059c = new WeakReference<>(context);
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f19058b = context;
            return this;
        }
    }

    private zzbjn(zza zza2) {
        this.f19054a = zza2.f19057a;
        this.f19055b = zza2.f19058b;
        this.f19056c = zza2.f19059c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo28234a() {
        return this.f19055b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Context mo28235b() {
        if (this.f19056c.get() != null) {
            return (Context) this.f19056c.get();
        }
        return this.f19055b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final zzbai mo28236c() {
        return this.f19054a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo28237d() {
        return zzk.zzlg().mo27794a(this.f19055b, this.f19054a.f18742f);
    }
}
