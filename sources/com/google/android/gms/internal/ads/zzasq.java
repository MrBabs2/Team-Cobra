package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.ads.internal.zzk;
import java.lang.ref.WeakReference;

@zzard
public final class zzasq extends ContextWrapper {

    /* renamed from: a */
    private Context f18504a;

    /* renamed from: b */
    private WeakReference<Activity> f18505b = new WeakReference<>((Object) null);

    private zzasq(Context context) {
        super(context);
    }

    /* renamed from: b */
    private final synchronized void m19918b(Intent intent) {
        Activity activity = (Activity) this.f18505b.get();
        if (activity == null) {
            intent.addFlags(268435456);
            super.startActivity(intent);
            return;
        }
        try {
            Intent intent2 = (Intent) intent.clone();
            intent2.setFlags(intent.getFlags() & -268435457);
            activity.startActivity(intent2);
        } catch (Throwable th) {
            zzk.zzlk().mo27734a(th, "");
            intent.addFlags(268435456);
            super.startActivity(intent);
        }
    }

    /* renamed from: c */
    public static Context m19919c(Context context) {
        if (context instanceof zzasq) {
            return ((zzasq) context).getBaseContext();
        }
        return m19915a(context);
    }

    /* renamed from: a */
    public final synchronized void mo27619a(String str) throws PackageManager.NameNotFoundException {
        this.f18504a = super.createPackageContext(str, 0);
    }

    public final Context getApplicationContext() {
        return this;
    }

    public final synchronized ApplicationInfo getApplicationInfo() {
        if (this.f18504a != null) {
            return this.f18504a.getApplicationInfo();
        }
        return super.getApplicationInfo();
    }

    public final synchronized String getPackageName() {
        if (this.f18504a != null) {
            return this.f18504a.getPackageName();
        }
        return super.getPackageName();
    }

    public final synchronized String getPackageResourcePath() {
        if (this.f18504a != null) {
            return this.f18504a.getPackageResourcePath();
        }
        return super.getPackageResourcePath();
    }

    public final synchronized void startActivity(Intent intent) {
        m19918b(m19916a(intent));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        return r3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized android.content.Intent m19916a(android.content.Intent r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f18504a     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0037
            android.content.ComponentName r0 = r3.getComponent()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0037
            android.content.ComponentName r0 = r3.getComponent()     // Catch:{ all -> 0x0039 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ all -> 0x0039 }
            android.content.Context r1 = r2.f18504a     // Catch:{ all -> 0x0039 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ all -> 0x0039 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0039 }
            if (r0 != 0) goto L_0x0020
            goto L_0x0037
        L_0x0020:
            java.lang.Object r0 = r3.clone()     // Catch:{ all -> 0x0039 }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ all -> 0x0039 }
            java.lang.String r1 = super.getPackageName()     // Catch:{ all -> 0x0039 }
            android.content.ComponentName r3 = r3.getComponent()     // Catch:{ all -> 0x0039 }
            java.lang.String r3 = r3.getClassName()     // Catch:{ all -> 0x0039 }
            r0.setClassName(r1, r3)     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)
            return r0
        L_0x0037:
            monitor-exit(r2)
            return r3
        L_0x0039:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzasq.m19916a(android.content.Intent):android.content.Intent");
    }

    /* renamed from: a */
    private static Context m19915a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* renamed from: b */
    public static zzasq m19917b(Context context) {
        return new zzasq(m19915a(context));
    }
}
