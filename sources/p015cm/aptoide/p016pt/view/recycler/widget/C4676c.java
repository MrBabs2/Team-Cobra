package p015cm.aptoide.p016pt.view.recycler.widget;

import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.view.recycler.widget.c */
/* compiled from: lambda */
public final /* synthetic */ class C4676c implements C5378b {

    /* renamed from: f */
    public static final /* synthetic */ C4676c f7952f = new C4676c();

    private /* synthetic */ C4676c() {
    }

    public final void call(Object obj) {
        CrashReport.getInstance().log((Throwable) obj);
    }
}
