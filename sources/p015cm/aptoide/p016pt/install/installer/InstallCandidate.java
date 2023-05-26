package p015cm.aptoide.p016pt.install.installer;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, mo16641d2 = {"Lcm/aptoide/pt/install/installer/InstallCandidate;", "", "md5", "", "forceDefaultInstall", "", "shouldSetPackageInstaller", "(Ljava/lang/String;ZZ)V", "getForceDefaultInstall", "()Z", "getMd5", "()Ljava/lang/String;", "getShouldSetPackageInstaller", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.install.installer.InstallCandidate */
/* compiled from: InstallCandidate.kt */
public final class InstallCandidate {
    private final boolean forceDefaultInstall;
    private final String md5;
    private final boolean shouldSetPackageInstaller;

    public InstallCandidate(String str, boolean z, boolean z2) {
        C10202j.m34178b(str, "md5");
        this.md5 = str;
        this.forceDefaultInstall = z;
        this.shouldSetPackageInstaller = z2;
    }

    public static /* synthetic */ InstallCandidate copy$default(InstallCandidate installCandidate, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = installCandidate.md5;
        }
        if ((i & 2) != 0) {
            z = installCandidate.forceDefaultInstall;
        }
        if ((i & 4) != 0) {
            z2 = installCandidate.shouldSetPackageInstaller;
        }
        return installCandidate.copy(str, z, z2);
    }

    public final String component1() {
        return this.md5;
    }

    public final boolean component2() {
        return this.forceDefaultInstall;
    }

    public final boolean component3() {
        return this.shouldSetPackageInstaller;
    }

    public final InstallCandidate copy(String str, boolean z, boolean z2) {
        C10202j.m34178b(str, "md5");
        return new InstallCandidate(str, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallCandidate)) {
            return false;
        }
        InstallCandidate installCandidate = (InstallCandidate) obj;
        return C10202j.m34176a((Object) this.md5, (Object) installCandidate.md5) && this.forceDefaultInstall == installCandidate.forceDefaultInstall && this.shouldSetPackageInstaller == installCandidate.shouldSetPackageInstaller;
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

    public int hashCode() {
        String str = this.md5;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.forceDefaultInstall;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.shouldSetPackageInstaller;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        return "InstallCandidate(md5=" + this.md5 + ", forceDefaultInstall=" + this.forceDefaultInstall + ", shouldSetPackageInstaller=" + this.shouldSetPackageInstaller + ")";
    }
}
