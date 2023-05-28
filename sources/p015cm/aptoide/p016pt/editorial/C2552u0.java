package p015cm.aptoide.p016pt.editorial;

import p015cm.aptoide.p016pt.app.DownloadModel;
import p123rx.p126m.C5377a;

/* renamed from: cm.aptoide.pt.editorial.u0 */
/* compiled from: lambda */
public final /* synthetic */ class C2552u0 implements C5377a {

    /* renamed from: f */
    private final /* synthetic */ EditorialPresenter f5371f;

    /* renamed from: g */
    private final /* synthetic */ EditorialDownloadEvent f5372g;

    /* renamed from: h */
    private final /* synthetic */ DownloadModel.Action f5373h;

    /* renamed from: i */
    private final /* synthetic */ EditorialViewModel f5374i;

    public /* synthetic */ C2552u0(EditorialPresenter editorialPresenter, EditorialDownloadEvent editorialDownloadEvent, DownloadModel.Action action, EditorialViewModel editorialViewModel) {
        this.f5371f = editorialPresenter;
        this.f5372g = editorialDownloadEvent;
        this.f5373h = action;
        this.f5374i = editorialViewModel;
    }

    public final void call() {
        this.f5371f.mo11206e(this.f5372g, this.f5373h, this.f5374i);
    }
}
