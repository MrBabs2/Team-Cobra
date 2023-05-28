package p015cm.aptoide.p016pt.presenter;

import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.presenter.h0 */
/* compiled from: lambda */
public final /* synthetic */ class C3636h0 implements C5378b {

    /* renamed from: f */
    public static final /* synthetic */ C3636h0 f6682f = new C3636h0();

    private /* synthetic */ C3636h0() {
    }

    public final void call(Object obj) {
        CrashReport.getInstance().log((Throwable) obj);
    }
}
