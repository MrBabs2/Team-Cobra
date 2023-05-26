package p015cm.aptoide.p016pt.view.dialog;

import android.app.Activity;
import p015cm.aptoide.p016pt.dataprovider.interfaces.ErrorRequestListener;
import p123rx.C12475j;

/* renamed from: cm.aptoide.pt.view.dialog.j */
/* compiled from: lambda */
public final /* synthetic */ class C4610j implements ErrorRequestListener {

    /* renamed from: a */
    private final /* synthetic */ Activity f7850a;

    /* renamed from: b */
    private final /* synthetic */ C12475j f7851b;

    public /* synthetic */ C4610j(Activity activity, C12475j jVar) {
        this.f7850a = activity;
        this.f7851b = jVar;
    }

    public final void onError(Throwable th) {
        DialogUtils.m7632a(this.f7850a, this.f7851b, th);
    }
}
