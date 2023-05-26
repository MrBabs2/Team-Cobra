package p015cm.aptoide.p016pt.editorial;

import p015cm.aptoide.p016pt.app.DownloadModel;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.editorial.t4 */
/* compiled from: lambda */
public final /* synthetic */ class C2548t4 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ EditorialPresenter f5364f;

    /* renamed from: g */
    private final /* synthetic */ EditorialDownloadEvent f5365g;

    /* renamed from: h */
    private final /* synthetic */ DownloadModel.Action f5366h;

    public /* synthetic */ C2548t4(EditorialPresenter editorialPresenter, EditorialDownloadEvent editorialDownloadEvent, DownloadModel.Action action) {
        this.f5364f = editorialPresenter;
        this.f5365g = editorialDownloadEvent;
        this.f5366h = action;
    }

    public final Object call(Object obj) {
        return this.f5364f.mo11210f(this.f5365g, this.f5366h, (EditorialViewModel) obj);
    }
}
