package p015cm.aptoide.p016pt.editorial;

import p015cm.aptoide.p016pt.editorial.EditorialEvent;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.editorial.h */
/* compiled from: lambda */
public final /* synthetic */ class C2447h implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C2447h f5222f = new C2447h();

    private /* synthetic */ C2447h() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((EditorialDownloadEvent) obj).getClickType().equals(EditorialEvent.Type.BUTTON));
    }
}
