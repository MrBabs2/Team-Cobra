package p015cm.aptoide.p016pt.autoupdate;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p123rx.C5368e;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, mo16641d2 = {"<anonymous>", "Lrx/Observable;", "Lcm/aptoide/pt/autoupdate/AutoUpdateModel;", "kotlin.jvm.PlatformType", "it", "Lcm/aptoide/pt/autoupdate/AutoUpdateJsonResponse;", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.autoupdate.AutoUpdateService$loadAutoUpdateModel$4 */
/* compiled from: AutoUpdateService.kt */
final class AutoUpdateService$loadAutoUpdateModel$4<T, R> implements C5379n<T, C5368e<? extends R>> {
    final /* synthetic */ AutoUpdateService this$0;

    AutoUpdateService$loadAutoUpdateModel$4(AutoUpdateService autoUpdateService) {
        this.this$0 = autoUpdateService;
    }

    public final C5368e<AutoUpdateModel> call(AutoUpdateJsonResponse autoUpdateJsonResponse) {
        C10202j.m34174a((Object) autoUpdateJsonResponse, "it");
        int versioncode = autoUpdateJsonResponse.getVersioncode();
        String uri = autoUpdateJsonResponse.getUri();
        C10202j.m34174a((Object) uri, "it.uri");
        String md5 = autoUpdateJsonResponse.getMd5();
        C10202j.m34174a((Object) md5, "it.md5");
        String minSdk = autoUpdateJsonResponse.getMinSdk();
        C10202j.m34174a((Object) minSdk, "it.minSdk");
        return C5368e.m10257c(new AutoUpdateModel(versioncode, uri, md5, minSdk, this.this$0.packageName, false, (Status) null, false, 224, (DefaultConstructorMarker) null));
    }
}
