package p015cm.aptoide.p016pt.view.dialog;

import android.app.Activity;
import p015cm.aptoide.p016pt.dataprovider.interfaces.ErrorRequestListener;

/* renamed from: cm.aptoide.pt.view.dialog.l */
/* compiled from: lambda */
public final /* synthetic */ class C4612l implements ErrorRequestListener {

    /* renamed from: a */
    private final /* synthetic */ Activity f7855a;

    public /* synthetic */ C4612l(Activity activity) {
        this.f7855a = activity;
    }

    public final void onError(Throwable th) {
        DialogUtils.m7631a(this.f7855a, th);
    }
}
