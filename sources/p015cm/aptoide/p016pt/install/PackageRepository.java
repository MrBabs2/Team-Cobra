package p015cm.aptoide.p016pt.install;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.List;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.install.PackageRepository */
public class PackageRepository {
    private List<PackageInfo> memoryCache;
    private final PackageManager packageManager;

    public PackageRepository(PackageManager packageManager2) {
        this.packageManager = packageManager2;
    }

    /* renamed from: a */
    static /* synthetic */ Integer m6441a(PackageInfo packageInfo, PackageInfo packageInfo2) {
        long j = packageInfo.lastUpdateTime;
        long j2 = packageInfo2.lastUpdateTime;
        return Integer.valueOf(j < j2 ? 1 : j == j2 ? 0 : -1);
    }

    /* renamed from: b */
    static /* synthetic */ Iterable m6443b(List list) {
        return list;
    }

    /* renamed from: c */
    static /* synthetic */ Iterable m6445c(List list) {
        return list;
    }

    /* renamed from: e */
    static /* synthetic */ Iterable m6447e(List list) {
        return list;
    }

    private C5368e<List<PackageInfo>> getAdbInstalledPackages() {
        return C5368e.m10240a(new C3347k2(this));
    }

    private C5368e<List<PackageInfo>> getCachedInstalledPackages() {
        return C5368e.m10240a(new C3359n2(this));
    }

    private C5368e<List<PackageInfo>> getInstalledPackages() {
        return getCachedInstalledPackages().mo18672c(getPackageManagerInstalledPackages()).mo18672c(getAdbInstalledPackages().mo18662b(Schedulers.m10352io())).mo18664b(new C3351l2(this));
    }

    private C5368e<List<PackageInfo>> getPackageManagerInstalledPackages() {
        return C5368e.m10240a(new C3375r2(this));
    }

    private Single<Boolean> isPackageInstalled(String str) {
        return Single.m10121a(new C3363o2(this, str));
    }

    /* access modifiers changed from: private */
    /* renamed from: setCachedInstalledPackages */
    public void mo12812a(List<PackageInfo> list) {
        this.memoryCache = list;
    }

    /* renamed from: b */
    public /* synthetic */ List mo12813b() throws Exception {
        List<PackageInfo> list = this.memoryCache;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("No cached packages available!");
    }

    /* renamed from: c */
    public /* synthetic */ List mo12815c() throws Exception {
        return this.packageManager.getInstalledPackages(0);
    }

    public C5368e<String> getLatestInstalledPackages(int i) {
        return getInstalledPackages().mo18691h(C3387s2.f6354f).mo18653a(C3367p2.f6337f).mo18691h(C3355m2.f6320f).mo18657b(i).mo18694j(C3406w2.f6372f).mo18662b(Schedulers.m10352io());
    }

    public Single<String> getPackageLabel(String str) {
        return Single.m10121a(new C3371q2(this, str));
    }

    public Single<Integer> getPackageVersionCode(String str) {
        return Single.m10121a(new C3343j2(this, str));
    }

    public C5368e<String> getRandomInstalledPackages(int i) {
        return getInstalledPackages().mo18694j(C3414y2.f6383f).mo18691h(C3395u2.f6362f).mo18657b(i).mo18694j(C3391t2.f6358f).mo18662b(Schedulers.m10352io());
    }

    public boolean isAppInstalled(String str) {
        return ((Boolean) getInstalledPackages().mo18700m().mo18559a(new C3410x2(this, str)).mo18571f(C3399v2.f6366f).mo18562a().mo41082a()).booleanValue();
    }

    /* renamed from: c */
    public /* synthetic */ Single mo12816c(String str) throws Exception {
        try {
            boolean z = false;
            if (this.packageManager.getPackageInfo(str, 0) != null) {
                z = true;
            }
            return Single.m10119a(Boolean.valueOf(z));
        } catch (PackageManager.NameNotFoundException unused) {
            return Single.m10119a(Boolean.FALSE);
        } catch (Exception e) {
            return Single.m10120a((Throwable) e);
        }
    }

    /* renamed from: b */
    public /* synthetic */ Single mo12814b(String str) throws Exception {
        try {
            return Single.m10119a(Integer.valueOf(this.packageManager.getPackageInfo(str, 0).versionCode));
        } catch (Exception e) {
            return Single.m10120a((Throwable) e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b A[SYNTHETIC, Splitter:B:22:0x005b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ java.util.List mo12809a() throws java.lang.Exception {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ NameNotFoundException -> 0x0052, InterruptedException -> 0x0050, IOException -> 0x004e }
            java.lang.String r3 = "pm list packages"
            java.lang.Process r2 = r2.exec(r3)     // Catch:{ NameNotFoundException -> 0x0052, InterruptedException -> 0x0050, IOException -> 0x004e }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ NameNotFoundException -> 0x0052, InterruptedException -> 0x0050, IOException -> 0x004e }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ NameNotFoundException -> 0x0052, InterruptedException -> 0x0050, IOException -> 0x004e }
            java.io.InputStream r5 = r2.getInputStream()     // Catch:{ NameNotFoundException -> 0x0052, InterruptedException -> 0x0050, IOException -> 0x004e }
            r4.<init>(r5)     // Catch:{ NameNotFoundException -> 0x0052, InterruptedException -> 0x0050, IOException -> 0x004e }
            r3.<init>(r4)     // Catch:{ NameNotFoundException -> 0x0052, InterruptedException -> 0x0050, IOException -> 0x004e }
        L_0x001e:
            java.lang.String r1 = r3.readLine()     // Catch:{ NameNotFoundException -> 0x0049, InterruptedException -> 0x0047, IOException -> 0x0045, all -> 0x0042 }
            if (r1 == 0) goto L_0x003b
            r4 = 58
            int r4 = r1.indexOf(r4)     // Catch:{ NameNotFoundException -> 0x0049, InterruptedException -> 0x0047, IOException -> 0x0045, all -> 0x0042 }
            int r4 = r4 + 1
            java.lang.String r1 = r1.substring(r4)     // Catch:{ NameNotFoundException -> 0x0049, InterruptedException -> 0x0047, IOException -> 0x0045, all -> 0x0042 }
            android.content.pm.PackageManager r4 = r6.packageManager     // Catch:{ NameNotFoundException -> 0x0049, InterruptedException -> 0x0047, IOException -> 0x0045, all -> 0x0042 }
            r5 = 0
            android.content.pm.PackageInfo r1 = r4.getPackageInfo(r1, r5)     // Catch:{ NameNotFoundException -> 0x0049, InterruptedException -> 0x0047, IOException -> 0x0045, all -> 0x0042 }
            r0.add(r1)     // Catch:{ NameNotFoundException -> 0x0049, InterruptedException -> 0x0047, IOException -> 0x0045, all -> 0x0042 }
            goto L_0x001e
        L_0x003b:
            r2.waitFor()     // Catch:{ NameNotFoundException -> 0x0049, InterruptedException -> 0x0047, IOException -> 0x0045, all -> 0x0042 }
            r3.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            return r0
        L_0x0042:
            r0 = move-exception
            r1 = r3
            goto L_0x0059
        L_0x0045:
            r0 = move-exception
            goto L_0x004a
        L_0x0047:
            r0 = move-exception
            goto L_0x004a
        L_0x0049:
            r0 = move-exception
        L_0x004a:
            r1 = r3
            goto L_0x0053
        L_0x004c:
            r0 = move-exception
            goto L_0x0059
        L_0x004e:
            r0 = move-exception
            goto L_0x0053
        L_0x0050:
            r0 = move-exception
            goto L_0x0053
        L_0x0052:
            r0 = move-exception
        L_0x0053:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x004c }
            r2.<init>(r0)     // Catch:{ all -> 0x004c }
            throw r2     // Catch:{ all -> 0x004c }
        L_0x0059:
            if (r1 == 0) goto L_0x005e
            r1.close()     // Catch:{ IOException -> 0x005e }
        L_0x005e:
            goto L_0x0060
        L_0x005f:
            throw r0
        L_0x0060:
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.install.PackageRepository.mo12809a():java.util.List");
    }

    /* renamed from: a */
    public /* synthetic */ Single mo12810a(String str) throws Exception {
        try {
            return Single.m10119a(this.packageManager.getApplicationLabel(this.packageManager.getApplicationInfo(str, 0)).toString());
        } catch (Exception e) {
            return Single.m10120a((Throwable) e);
        }
    }

    /* renamed from: a */
    public /* synthetic */ Single mo12811a(String str, List list) {
        return isPackageInstalled(str);
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m6440a(Throwable th) {
        return false;
    }
}
