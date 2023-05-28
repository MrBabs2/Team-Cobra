package p015cm.aptoide.p016pt.notification.policies;

import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p120q.p326a.C10838a0;
import p120q.p326a.C11496w;
import p120q.p326a.p328c0.C10861o;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012(\u0010\u0004\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u00060\u00070\u0005H\n¢\u0006\u0002\b\b"}, mo16641d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "kotlin.jvm.PlatformType", "it", "", "", "", "apply"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.notification.policies.CampaignPolicy$shouldShow$3 */
/* compiled from: CampaignPolicy.kt */
final class CampaignPolicy$shouldShow$3<T, R> implements C10861o<T, C10838a0<? extends R>> {
    public static final CampaignPolicy$shouldShow$3 INSTANCE = new CampaignPolicy$shouldShow$3();

    CampaignPolicy$shouldShow$3() {
    }

    public final C11496w<Boolean> apply(List<String> list) {
        C10202j.m34178b(list, "it");
        return C11496w.m37603a(Boolean.valueOf(!list.isEmpty()));
    }
}
