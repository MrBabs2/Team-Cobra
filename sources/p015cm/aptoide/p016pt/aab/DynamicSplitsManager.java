package p015cm.aptoide.p016pt.aab;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9064d;
import kotlin.p042a0.C9069g;
import kotlinx.coroutines.p395i2.C12253d;
import p120q.p326a.C11496w;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo16641d2 = {"Lcm/aptoide/pt/aab/DynamicSplitsManager;", "", "dynamicSplitsService", "Lcm/aptoide/pt/aab/DynamicSplitsService;", "(Lcm/aptoide/pt/aab/DynamicSplitsService;)V", "getAppSplitsByMd5", "Lio/reactivex/Single;", "Lcm/aptoide/pt/aab/DynamicSplitsModel;", "apkMd5Sum", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.aab.DynamicSplitsManager */
/* compiled from: DynamicSplitsManager.kt */
public class DynamicSplitsManager {
    /* access modifiers changed from: private */
    public final DynamicSplitsService dynamicSplitsService;

    public DynamicSplitsManager(DynamicSplitsService dynamicSplitsService2) {
        C10202j.m34178b(dynamicSplitsService2, "dynamicSplitsService");
        this.dynamicSplitsService = dynamicSplitsService2;
    }

    public C11496w<DynamicSplitsModel> getAppSplitsByMd5(String str) {
        C10202j.m34178b(str, "apkMd5Sum");
        return C12253d.m40405a((C9069g) null, new DynamicSplitsManager$getAppSplitsByMd5$1(this, str, (C9064d) null), 1, (Object) null);
    }
}
