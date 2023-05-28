package p015cm.aptoide.p016pt.install.installer;

import p015cm.aptoide.p016pt.packageinstaller.InstallStatus;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.install.installer.t */
/* compiled from: lambda */
public final /* synthetic */ class C3332t implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ Installation f6283f;

    public /* synthetic */ C3332t(Installation installation) {
        this.f6283f = installation;
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(this.f6283f.getPackageName().equalsIgnoreCase(((InstallStatus) obj).getPackageName()));
    }
}
