package p015cm.aptoide.p016pt.download.view.outofspace;

import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.install.InstallAppSizeValidator;
import p015cm.aptoide.p016pt.install.InstallManager;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eJ\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo16641d2 = {"Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceManager;", "", "installManager", "Lcm/aptoide/pt/install/InstallManager;", "appSize", "", "uninstalledEnoughApps", "Lrx/subjects/PublishSubject;", "Ljava/lang/Void;", "installAppSizeValidator", "Lcm/aptoide/pt/install/InstallAppSizeValidator;", "(Lcm/aptoide/pt/install/InstallManager;JLrx/subjects/PublishSubject;Lcm/aptoide/pt/install/InstallAppSizeValidator;)V", "requiredSpace", "getInstalledAppSize", "Lrx/Single;", "packageName", "", "getInstalledApps", "Lrx/Observable;", "", "Lcm/aptoide/pt/download/view/outofspace/InstalledApp;", "getRequiredStorageSize", "uninstallApp", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.outofspace.OutOfSpaceManager */
/* compiled from: OutOfSpaceManager.kt */
public final class OutOfSpaceManager {
    private final long appSize;
    private final InstallAppSizeValidator installAppSizeValidator;
    /* access modifiers changed from: private */
    public final InstallManager installManager;
    /* access modifiers changed from: private */
    public long requiredSpace;
    /* access modifiers changed from: private */
    public final C12871b<Void> uninstalledEnoughApps;

    public OutOfSpaceManager(InstallManager installManager2, long j, C12871b<Void> bVar, InstallAppSizeValidator installAppSizeValidator2) {
        C10202j.m34178b(installManager2, "installManager");
        C10202j.m34178b(bVar, "uninstalledEnoughApps");
        C10202j.m34178b(installAppSizeValidator2, "installAppSizeValidator");
        this.installManager = installManager2;
        this.appSize = j;
        this.uninstalledEnoughApps = bVar;
        this.installAppSizeValidator = installAppSizeValidator2;
        this.requiredSpace = j;
    }

    private final Single<Long> getInstalledAppSize(String str) {
        Single<Long> installedAppSize = this.installManager.getInstalledAppSize(str);
        C10202j.m34174a((Object) installedAppSize, "installManager.getInstalledAppSize(packageName)");
        return installedAppSize;
    }

    public final C5368e<List<InstalledApp>> getInstalledApps() {
        C5368e<R> f = this.installManager.fetchInstalledExceptSystem().mo18687f(OutOfSpaceManager$getInstalledApps$1.INSTANCE);
        C10202j.m34174a((Object) f, "installManager.fetchInst…      .toList()\n        }");
        return f;
    }

    public final Single<Long> getRequiredStorageSize() {
        Single<Long> b = Single.m10119a(Long.valueOf(this.appSize - this.installAppSizeValidator.getAvailableSpace())).mo18564b(new OutOfSpaceManager$getRequiredStorageSize$1(this));
        C10202j.m34174a((Object) b, "Single.just(appSize - in…ss { requiredSpace = it }");
        return b;
    }

    public final Single<Long> uninstallApp(String str) {
        Single<R> d = getInstalledAppSize(str).mo18559a(new OutOfSpaceManager$uninstallApp$1(this, str)).mo18569d(new OutOfSpaceManager$uninstallApp$2(this));
        C10202j.m34174a((Object) d, "getInstalledAppSize(pack…  }.map { requiredSpace }");
        return d;
    }

    public final C5368e<Void> uninstalledEnoughApps() {
        return this.uninstalledEnoughApps;
    }
}
