package p015cm.aptoide.p016pt.app.appsflyer;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p123rx.p126m.C5379n;
import retrofit2.Response;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo16641d2 = {"<anonymous>", "", "response", "Lretrofit2/Response;", "Lcm/aptoide/pt/app/appsflyer/AppsFlyerResponse;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.app.appsflyer.AppsFlyerRepository$registerImpression$1 */
/* compiled from: AppsFlyerRepository.kt */
final class AppsFlyerRepository$registerImpression$1<T, R> implements C5379n<T, R> {
    public static final AppsFlyerRepository$registerImpression$1 INSTANCE = new AppsFlyerRepository$registerImpression$1();

    AppsFlyerRepository$registerImpression$1() {
    }

    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return Boolean.valueOf(call((Response<AppsFlyerResponse>) (Response) obj));
    }

    public final boolean call(Response<AppsFlyerResponse> response) {
        C10202j.m34174a((Object) response, "response");
        return response.isSuccessful();
    }
}
