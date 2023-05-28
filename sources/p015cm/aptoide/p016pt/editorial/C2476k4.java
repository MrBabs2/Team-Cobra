package p015cm.aptoide.p016pt.editorial;

import p015cm.aptoide.p016pt.app.DownloadModel;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.editorial.k4 */
/* compiled from: lambda */
public final /* synthetic */ class C2476k4 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ EditorialPresenter f5272f;

    /* renamed from: g */
    private final /* synthetic */ EditorialDownloadEvent f5273g;

    /* renamed from: h */
    private final /* synthetic */ DownloadModel.Action f5274h;

    public /* synthetic */ C2476k4(EditorialPresenter editorialPresenter, EditorialDownloadEvent editorialDownloadEvent, DownloadModel.Action action) {
        this.f5272f = editorialPresenter;
        this.f5273g = editorialDownloadEvent;
        this.f5274h = action;
    }

    public final Object call(Object obj) {
        return this.f5272f.mo11197d(this.f5273g, this.f5274h, (EditorialViewModel) obj);
    }
}
