package p015cm.aptoide.p016pt.editorial;

import p015cm.aptoide.p016pt.app.DownloadModel;
import p123rx.p126m.C5377a;

/* renamed from: cm.aptoide.pt.editorial.f4 */
/* compiled from: lambda */
public final /* synthetic */ class C2436f4 implements C5377a {

    /* renamed from: f */
    private final /* synthetic */ EditorialPresenter f5207f;

    /* renamed from: g */
    private final /* synthetic */ EditorialDownloadEvent f5208g;

    /* renamed from: h */
    private final /* synthetic */ DownloadModel.Action f5209h;

    /* renamed from: i */
    private final /* synthetic */ EditorialViewModel f5210i;

    public /* synthetic */ C2436f4(EditorialPresenter editorialPresenter, EditorialDownloadEvent editorialDownloadEvent, DownloadModel.Action action, EditorialViewModel editorialViewModel) {
        this.f5207f = editorialPresenter;
        this.f5208g = editorialDownloadEvent;
        this.f5209h = action;
        this.f5210i = editorialViewModel;
    }

    public final void call() {
        this.f5207f.mo11191c(this.f5208g, this.f5209h, this.f5210i);
    }
}
