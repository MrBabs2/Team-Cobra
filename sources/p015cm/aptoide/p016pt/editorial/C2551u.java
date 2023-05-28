package p015cm.aptoide.p016pt.editorial;

import p015cm.aptoide.p016pt.editorial.EditorialEvent;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.editorial.u */
/* compiled from: lambda */
public final /* synthetic */ class C2551u implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C2551u f5370f = new C2551u();

    private /* synthetic */ C2551u() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((EditorialDownloadEvent) obj).getClickType().equals(EditorialEvent.Type.CANCEL));
    }
}
