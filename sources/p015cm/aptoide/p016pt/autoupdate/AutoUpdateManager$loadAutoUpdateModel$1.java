package p015cm.aptoide.p016pt.autoupdate;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p123rx.Single;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "Lrx/Single;", "Lcm/aptoide/pt/autoupdate/AutoUpdateModel;", "kotlin.jvm.PlatformType", "it", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.autoupdate.AutoUpdateManager$loadAutoUpdateModel$1 */
/* compiled from: AutoUpdateManager.kt */
final class AutoUpdateManager$loadAutoUpdateModel$1<T, R> implements C5379n<T, Single<? extends R>> {
    final /* synthetic */ AutoUpdateManager this$0;

    AutoUpdateManager$loadAutoUpdateModel$1(AutoUpdateManager autoUpdateManager) {
        this.this$0 = autoUpdateManager;
    }

    public final Single<AutoUpdateModel> call(AutoUpdateModel autoUpdateModel) {
        if (!autoUpdateModel.wasSuccess()) {
            Single.m10120a(new Throwable(autoUpdateModel.getStatus().toString()));
        }
        AutoUpdateManager autoUpdateManager = this.this$0;
        C10202j.m34174a((Object) autoUpdateModel, "it");
        if (autoUpdateManager.shouldUpdate(autoUpdateModel)) {
            autoUpdateModel = AutoUpdateModel.copy$default(autoUpdateModel, 0, (String) null, (String) null, (String) null, (String) null, true, (Status) null, false, 223, (Object) null);
        }
        return Single.m10119a(autoUpdateModel);
    }
}
