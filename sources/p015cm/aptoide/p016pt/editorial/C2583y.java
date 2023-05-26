package p015cm.aptoide.p016pt.editorial;

import p015cm.aptoide.p016pt.editorial.EditorialEvent;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.editorial.y */
/* compiled from: lambda */
public final /* synthetic */ class C2583y implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C2583y f5409f = new C2583y();

    private /* synthetic */ C2583y() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((EditorialDownloadEvent) obj).getClickType().equals(EditorialEvent.Type.PAUSE));
    }
}
