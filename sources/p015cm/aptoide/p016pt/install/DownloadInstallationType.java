package p015cm.aptoide.p016pt.install;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, mo16641d2 = {"Lcm/aptoide/pt/install/DownloadInstallationType;", "", "md5", "", "forceDefaultInstall", "", "shouldSetPackageInstaller", "(Ljava/lang/String;ZZ)V", "getForceDefaultInstall", "()Z", "getMd5", "()Ljava/lang/String;", "getShouldSetPackageInstaller", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.install.DownloadInstallationType */
/* compiled from: DownloadInstallationType.kt */
public final class DownloadInstallationType {
    private final boolean forceDefaultInstall;
    private final String md5;
    private final boolean shouldSetPackageInstaller;

    public DownloadInstallationType(String str, boolean z, boolean z2) {
        C10202j.m34178b(str, "md5");
        this.md5 = str;
        this.forceDefaultInstall = z;
        this.shouldSetPackageInstaller = z2;
    }

    public final boolean getForceDefaultInstall() {
        return this.forceDefaultInstall;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final boolean getShouldSetPackageInstaller() {
        return this.shouldSetPackageInstaller;
    }
}
