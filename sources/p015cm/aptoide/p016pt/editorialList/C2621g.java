package p015cm.aptoide.p016pt.editorialList;

import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.EditorialListResponse;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.editorialList.g */
/* compiled from: lambda */
public final /* synthetic */ class C2621g implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ EditorialCardListService f5451f;

    public /* synthetic */ C2621g(EditorialCardListService editorialCardListService) {
        this.f5451f = editorialCardListService;
    }

    public final Object call(Object obj) {
        return this.f5451f.mapEditorialCardList((EditorialListResponse) obj);
    }
}
