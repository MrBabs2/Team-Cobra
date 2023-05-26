package p015cm.aptoide.p016pt.install;

import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.install.Install;
import p015cm.aptoide.p016pt.install.installer.InstallationState;
import p123rx.p126m.C12497p;

/* renamed from: cm.aptoide.pt.install.o0 */
/* compiled from: lambda */
public final /* synthetic */ class C3361o0 implements C12497p {

    /* renamed from: a */
    private final /* synthetic */ InstallManager f6327a;

    /* renamed from: b */
    private final /* synthetic */ String f6328b;

    /* renamed from: c */
    private final /* synthetic */ String f6329c;

    /* renamed from: d */
    private final /* synthetic */ int f6330d;

    public /* synthetic */ C3361o0(InstallManager installManager, String str, String str2, int i) {
        this.f6327a = installManager;
        this.f6328b = str;
        this.f6329c = str2;
        this.f6330d = i;
    }

    public final Object call(Object obj, Object obj2, Object obj3) {
        return this.f6327a.mo12736a(this.f6328b, this.f6329c, this.f6330d, (RoomDownload) obj, (InstallationState) obj2, (Install.InstallationType) obj3);
    }
}
