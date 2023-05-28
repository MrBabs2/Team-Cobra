package p015cm.aptoide.p016pt.store.view;

import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.store.view.v1 */
/* compiled from: lambda */
public final /* synthetic */ class C4377v1 implements C5378b {

    /* renamed from: f */
    public static final /* synthetic */ C4377v1 f7523f = new C4377v1();

    private /* synthetic */ C4377v1() {
    }

    public final void call(Object obj) {
        CrashReport.getInstance().log((Throwable) obj);
    }
}
