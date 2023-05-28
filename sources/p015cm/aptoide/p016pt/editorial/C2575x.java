package p015cm.aptoide.p016pt.editorial;

import p015cm.aptoide.p016pt.editorial.EditorialEvent;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.editorial.x */
/* compiled from: lambda */
public final /* synthetic */ class C2575x implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C2575x f5398f = new C2575x();

    private /* synthetic */ C2575x() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((EditorialDownloadEvent) obj).getClickType().equals(EditorialEvent.Type.RESUME));
    }
}
