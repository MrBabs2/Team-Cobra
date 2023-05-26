package p015cm.aptoide.p016pt.home.more.apps;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p215c0.p216c.C9102a;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, mo16641d2 = {"<anonymous>", "", "invoke"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.apps.ListAppsMorePresenter$url$2 */
/* compiled from: ListAppsMorePresenter.kt */
final class ListAppsMorePresenter$url$2 extends C10203k implements C9102a<String> {
    final /* synthetic */ ListAppsMorePresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ListAppsMorePresenter$url$2(ListAppsMorePresenter listAppsMorePresenter) {
        super(0);
        this.this$0 = listAppsMorePresenter;
    }

    public final String invoke() {
        String action = this.this$0.listAppsConfiguration.getAction();
        if (action == null) {
            return null;
        }
        String host = C2185V7.getHost(this.this$0.sharedPreferences);
        C10202j.m34174a((Object) host, "V7.getHost(sharedPreferences)");
        return C12130v.m40045a(action, host, "", false, 4, (Object) null);
    }
}
