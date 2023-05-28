package p015cm.aptoide.p016pt.install.installer;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, mo16641d2 = {"Lcm/aptoide/pt/install/installer/InstallationCandidate;", "", "installation", "Lcm/aptoide/pt/install/installer/Installation;", "forceDefaultInstall", "", "shouldSetPackageInstaller", "(Lcm/aptoide/pt/install/installer/Installation;ZZ)V", "getForceDefaultInstall", "()Z", "getInstallation", "()Lcm/aptoide/pt/install/installer/Installation;", "getShouldSetPackageInstaller", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.install.installer.InstallationCandidate */
/* compiled from: InstallationCandidate.kt */
public final class InstallationCandidate {
    private final boolean forceDefaultInstall;
    private final Installation installation;
    private final boolean shouldSetPackageInstaller;

    public InstallationCandidate(Installation installation2, boolean z, boolean z2) {
        C10202j.m34178b(installation2, "installation");
        this.installation = installation2;
        this.forceDefaultInstall = z;
        this.shouldSetPackageInstaller = z2;
    }

    public static /* synthetic */ InstallationCandidate copy$default(InstallationCandidate installationCandidate, Installation installation2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            installation2 = installationCandidate.installation;
        }
        if ((i & 2) != 0) {
            z = installationCandidate.forceDefaultInstall;
        }
        if ((i & 4) != 0) {
            z2 = installationCandidate.shouldSetPackageInstaller;
        }
        return installationCandidate.copy(installation2, z, z2);
    }

    public final Installation component1() {
        return this.installation;
    }

    public final boolean component2() {
        return this.forceDefaultInstall;
    }

    public final boolean component3() {
        return this.shouldSetPackageInstaller;
    }

    public final InstallationCandidate copy(Installation installation2, boolean z, boolean z2) {
        C10202j.m34178b(installation2, "installation");
        return new InstallationCandidate(installation2, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallationCandidate)) {
            return false;
        }
        InstallationCandidate installationCandidate = (InstallationCandidate) obj;
        return C10202j.m34176a((Object) this.installation, (Object) installationCandidate.installation) && this.forceDefaultInstall == installationCandidate.forceDefaultInstall && this.shouldSetPackageInstaller == installationCandidate.shouldSetPackageInstaller;
    }

    public final boolean getForceDefaultInstall() {
        return this.forceDefaultInstall;
    }

    public final Installation getInstallation() {
        return this.installation;
    }

    public final boolean getShouldSetPackageInstaller() {
        return this.shouldSetPackageInstaller;
    }

    public int hashCode() {
        Installation installation2 = this.installation;
        int hashCode = (installation2 != null ? installation2.hashCode() : 0) * 31;
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
        return "InstallationCandidate(installation=" + this.installation + ", forceDefaultInstall=" + this.forceDefaultInstall + ", shouldSetPackageInstaller=" + this.shouldSetPackageInstaller + ")";
    }
}
