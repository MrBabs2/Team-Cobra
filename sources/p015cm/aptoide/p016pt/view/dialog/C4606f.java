package p015cm.aptoide.p016pt.view.dialog;

import android.app.Activity;
import p015cm.aptoide.p016pt.dataprovider.interfaces.SuccessRequestListener;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p123rx.p126m.C5377a;

/* renamed from: cm.aptoide.pt.view.dialog.f */
/* compiled from: lambda */
public final /* synthetic */ class C4606f implements SuccessRequestListener {

    /* renamed from: f */
    private final /* synthetic */ DialogUtils f7844f;

    /* renamed from: g */
    private final /* synthetic */ Activity f7845g;

    /* renamed from: h */
    private final /* synthetic */ C5377a f7846h;

    public /* synthetic */ C4606f(DialogUtils dialogUtils, Activity activity, C5377a aVar) {
        this.f7844f = dialogUtils;
        this.f7845g = activity;
        this.f7846h = aVar;
    }

    public final void call(Object obj) {
        this.f7844f.mo15548a(this.f7845g, this.f7846h, (BaseV7Response) obj);
    }
}
