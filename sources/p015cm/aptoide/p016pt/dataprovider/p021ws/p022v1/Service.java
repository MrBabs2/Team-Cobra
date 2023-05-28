package p015cm.aptoide.p016pt.dataprovider.p021ws.p022v1;

import java.util.List;
import java.util.Map;
import p015cm.aptoide.p016pt.dataprovider.model.p017v1.GetPullNotificationsResponse;
import p123rx.C5368e;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v1.Service */
public interface Service {
    @GET("notifications/{id}/campaigns")
    C5368e<List<GetPullNotificationsResponse>> getPullCampaignNotifications(@Path("id") String str, @QueryMap Map<String, String> map, @Header("X-Bypass-Cache") boolean z);
}
