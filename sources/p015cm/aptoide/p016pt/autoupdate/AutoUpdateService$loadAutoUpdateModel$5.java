package p015cm.aptoide.p016pt.autoupdate;

import kotlin.C4789l;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "Lcm/aptoide/pt/autoupdate/AutoUpdateModel;", "it", "", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.autoupdate.AutoUpdateService$loadAutoUpdateModel$5 */
/* compiled from: AutoUpdateService.kt */
final class AutoUpdateService$loadAutoUpdateModel$5<T, R> implements C5379n<Throwable, AutoUpdateModel> {
    final /* synthetic */ AutoUpdateService this$0;

    AutoUpdateService$loadAutoUpdateModel$5(AutoUpdateService autoUpdateService) {
        this.this$0 = autoUpdateService;
    }

    public final AutoUpdateModel call(Throwable th) {
        return this.this$0.createErrorAutoUpdateModel(th);
    }
}
