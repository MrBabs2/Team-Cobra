package p015cm.aptoide.p016pt.presenter;

import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.presenter.f */
/* compiled from: lambda */
public final /* synthetic */ class C3625f implements C5378b {

    /* renamed from: f */
    public static final /* synthetic */ C3625f f6671f = new C3625f();

    private /* synthetic */ C3625f() {
    }

    public final void call(Object obj) {
        CrashReport.getInstance().log((Throwable) obj);
    }
}
