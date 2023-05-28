package p015cm.aptoide.p016pt.dataprovider;

import p015cm.aptoide.p016pt.dataprovider.interfaces.ErrorRequestListener;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.dataprovider.b */
/* compiled from: lambda */
public final /* synthetic */ class C2172b implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ ErrorRequestListener f4832f;

    public /* synthetic */ C2172b(ErrorRequestListener errorRequestListener) {
        this.f4832f = errorRequestListener;
    }

    public final void call(Object obj) {
        this.f4832f.onError((Throwable) obj);
    }
}
