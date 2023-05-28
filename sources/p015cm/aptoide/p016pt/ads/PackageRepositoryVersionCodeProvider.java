package p015cm.aptoide.p016pt.ads;

import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords.AdsApplicationVersionCodeProvider;
import p015cm.aptoide.p016pt.install.PackageRepository;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.ads.PackageRepositoryVersionCodeProvider */
public class PackageRepositoryVersionCodeProvider implements AdsApplicationVersionCodeProvider {
    private final String packageName;
    private final PackageRepository packageRepository;

    public PackageRepositoryVersionCodeProvider(PackageRepository packageRepository2, String str) {
        this.packageName = str;
        this.packageRepository = packageRepository2;
    }

    /* renamed from: a */
    static /* synthetic */ Integer m4537a(Throwable th) {
        return -1;
    }

    public Single<Integer> getApplicationVersionCode() {
        return this.packageRepository.getPackageVersionCode(this.packageName).mo18571f(C1351g0.f3795f);
    }
}
