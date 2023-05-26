package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

public class zzbqy {

    /* renamed from: a */
    private final Context f19431a;

    /* renamed from: b */
    private final zzcxv f19432b;

    /* renamed from: c */
    private final String f19433c;

    /* renamed from: d */
    private Bundle f19434d;

    public static class zza {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Context f19435a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public zzcxv f19436b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Bundle f19437c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f19438d;

        /* renamed from: a */
        public final zza mo28402a(Context context) {
            this.f19435a = context;
            return this;
        }

        /* renamed from: a */
        public final zza mo28404a(zzcxv zzcxv) {
            this.f19436b = zzcxv;
            return this;
        }

        /* renamed from: a */
        public final zza mo28403a(Bundle bundle) {
            this.f19437c = bundle;
            return this;
        }

        /* renamed from: a */
        public final zza mo28405a(String str) {
            this.f19438d = str;
            return this;
        }

        /* renamed from: a */
        public final zzbqy mo28406a() {
            return new zzbqy(this);
        }
    }

    private zzbqy(zza zza2) {
        this.f19431a = zza2.f19435a;
        this.f19432b = zza2.f19436b;
        this.f19434d = zza2.f19437c;
        this.f19433c = zza2.f19438d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zza mo28398a() {
        zza zza2 = new zza();
        zza2.mo28402a(this.f19431a);
        zza2.mo28404a(this.f19432b);
        zza2.mo28405a(this.f19433c);
        zza2.mo28403a(this.f19434d);
        return zza2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final zzcxv mo28399b() {
        return this.f19432b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Bundle mo28400c() {
        return this.f19434d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo28401d() {
        return this.f19433c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo28397a(Context context) {
        if (this.f19433c != null) {
            return context;
        }
        return this.f19431a;
    }
}
