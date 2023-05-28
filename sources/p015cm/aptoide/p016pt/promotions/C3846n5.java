package p015cm.aptoide.p016pt.promotions;

import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceNavigatorWrapper;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.promotions.n5 */
/* compiled from: lambda */
public final /* synthetic */ class C3846n5 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ OutOfSpaceNavigatorWrapper f6916f;

    public /* synthetic */ C3846n5(OutOfSpaceNavigatorWrapper outOfSpaceNavigatorWrapper) {
        this.f6916f = outOfSpaceNavigatorWrapper;
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((PromotionApp) obj).getPackageName().equals(this.f6916f.getPackageName()));
    }
}
