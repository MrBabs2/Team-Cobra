package p015cm.aptoide.p016pt.store;

import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.store.j */
/* compiled from: lambda */
public final /* synthetic */ class C4248j implements C5378b {

    /* renamed from: f */
    public static final /* synthetic */ C4248j f7343f = new C4248j();

    private /* synthetic */ C4248j() {
    }

    public final void call(Object obj) {
        CrashReport.getInstance().log((Throwable) obj);
    }
}
