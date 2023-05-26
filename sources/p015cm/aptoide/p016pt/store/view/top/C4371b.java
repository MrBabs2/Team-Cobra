package p015cm.aptoide.p016pt.store.view.top;

import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.store.view.top.b */
/* compiled from: lambda */
public final /* synthetic */ class C4371b implements C5378b {

    /* renamed from: f */
    public static final /* synthetic */ C4371b f7505f = new C4371b();

    private /* synthetic */ C4371b() {
    }

    public final void call(Object obj) {
        CrashReport.getInstance().log((Throwable) obj);
    }
}
