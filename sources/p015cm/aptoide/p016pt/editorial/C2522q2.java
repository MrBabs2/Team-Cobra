package p015cm.aptoide.p016pt.editorial;

import p015cm.aptoide.p016pt.app.DownloadModel;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.editorial.q2 */
/* compiled from: lambda */
public final /* synthetic */ class C2522q2 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ EditorialPresenter f5331f;

    /* renamed from: g */
    private final /* synthetic */ EditorialDownloadEvent f5332g;

    /* renamed from: h */
    private final /* synthetic */ DownloadModel.Action f5333h;

    public /* synthetic */ C2522q2(EditorialPresenter editorialPresenter, EditorialDownloadEvent editorialDownloadEvent, DownloadModel.Action action) {
        this.f5331f = editorialPresenter;
        this.f5332g = editorialDownloadEvent;
        this.f5333h = action;
    }

    public final Object call(Object obj) {
        return this.f5331f.mo11178b(this.f5332g, this.f5333h, (EditorialViewModel) obj);
    }
}
