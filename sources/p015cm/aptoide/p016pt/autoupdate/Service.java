package p015cm.aptoide.p016pt.autoupdate;

import kotlin.C4789l;
import p123rx.C5368e;
import retrofit2.http.GET;
import retrofit2.http.Path;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'¨\u0006\t"}, mo16641d2 = {"Lcm/aptoide/pt/autoupdate/Service;", "", "getAutoUpdateResponse", "Lrx/Observable;", "Lcm/aptoide/pt/autoupdate/AutoUpdateJsonResponse;", "packageName", "", "clientSdkVersion", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.autoupdate.Service */
/* compiled from: AutoUpdateService.kt */
public interface Service {
    @GET("apks/package/autoupdate/get/package_name={package_name}/sdk={client_sdk_version}")
    C5368e<AutoUpdateJsonResponse> getAutoUpdateResponse(@Path("package_name") String str, @Path("client_sdk_version") int i);
}
