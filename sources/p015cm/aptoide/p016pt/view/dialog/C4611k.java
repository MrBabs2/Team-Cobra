package p015cm.aptoide.p016pt.view.dialog;

import android.app.Activity;
import p015cm.aptoide.p016pt.dataprovider.interfaces.SuccessRequestListener;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p123rx.C12475j;

/* renamed from: cm.aptoide.pt.view.dialog.k */
/* compiled from: lambda */
public final /* synthetic */ class C4611k implements SuccessRequestListener {

    /* renamed from: f */
    private final /* synthetic */ DialogUtils f7852f;

    /* renamed from: g */
    private final /* synthetic */ Activity f7853g;

    /* renamed from: h */
    private final /* synthetic */ C12475j f7854h;

    public /* synthetic */ C4611k(DialogUtils dialogUtils, Activity activity, C12475j jVar) {
        this.f7852f = dialogUtils;
        this.f7853g = activity;
        this.f7854h = jVar;
    }

    public final void call(Object obj) {
        this.f7852f.mo15547a(this.f7853g, this.f7854h, (BaseV7Response) obj);
    }
}
