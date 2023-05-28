package p015cm.aptoide.p016pt.account.view.store;

import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.account.view.store.e */
/* compiled from: lambda */
public final /* synthetic */ class C1219e implements C5378b {

    /* renamed from: f */
    public static final /* synthetic */ C1219e f3640f = new C1219e();

    private /* synthetic */ C1219e() {
    }

    public final void call(Object obj) {
        CrashReport.getInstance().log((Throwable) obj);
    }
}
