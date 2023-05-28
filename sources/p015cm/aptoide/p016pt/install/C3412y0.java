package p015cm.aptoide.p016pt.install;

import p015cm.aptoide.p016pt.database.room.RoomInstallation;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.install.y0 */
/* compiled from: lambda */
public final /* synthetic */ class C3412y0 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ String f6381f;

    public /* synthetic */ C3412y0(String str) {
        this.f6381f = str;
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(this.f6381f.equals(((RoomInstallation) obj).getPackageName()));
    }
}
