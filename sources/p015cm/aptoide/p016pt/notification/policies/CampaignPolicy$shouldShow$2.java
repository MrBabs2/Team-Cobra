package p015cm.aptoide.p016pt.notification.policies;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p120q.p326a.C11478j;
import p120q.p326a.C11480l;
import p120q.p326a.p328c0.C10861o;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, mo16641d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "", "installed", "apply"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.notification.policies.CampaignPolicy$shouldShow$2 */
/* compiled from: CampaignPolicy.kt */
final class CampaignPolicy$shouldShow$2<T, R> implements C10861o<T, C11480l<? extends R>> {
    final /* synthetic */ CampaignPolicy this$0;

    CampaignPolicy$shouldShow$2(CampaignPolicy campaignPolicy) {
        this.this$0 = campaignPolicy;
    }

    public final C11478j<String> apply(String str) {
        C10202j.m34178b(str, "installed");
        return this.this$0.getCommonPackages(str);
    }
}
