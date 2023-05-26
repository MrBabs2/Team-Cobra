package p015cm.aptoide.p016pt.editorial;

import p015cm.aptoide.p016pt.app.DownloadModel;
import p123rx.p126m.C5377a;

/* renamed from: cm.aptoide.pt.editorial.x3 */
/* compiled from: lambda */
public final /* synthetic */ class C2579x3 implements C5377a {

    /* renamed from: f */
    private final /* synthetic */ EditorialPresenter f5402f;

    /* renamed from: g */
    private final /* synthetic */ EditorialDownloadEvent f5403g;

    /* renamed from: h */
    private final /* synthetic */ DownloadModel.Action f5404h;

    /* renamed from: i */
    private final /* synthetic */ EditorialViewModel f5405i;

    public /* synthetic */ C2579x3(EditorialPresenter editorialPresenter, EditorialDownloadEvent editorialDownloadEvent, DownloadModel.Action action, EditorialViewModel editorialViewModel) {
        this.f5402f = editorialPresenter;
        this.f5403g = editorialDownloadEvent;
        this.f5404h = action;
        this.f5405i = editorialViewModel;
    }

    public final void call() {
        this.f5402f.mo11168a(this.f5403g, this.f5404h, this.f5405i);
    }
}
