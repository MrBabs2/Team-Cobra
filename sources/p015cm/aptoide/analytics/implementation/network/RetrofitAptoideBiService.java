package p015cm.aptoide.analytics.implementation.network;

import java.text.DateFormat;
import java.util.Date;
import p015cm.aptoide.analytics.implementation.AptoideBiEventService;
import p015cm.aptoide.analytics.implementation.data.Event;
import p123rx.C5328b;
import p123rx.C5368e;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* renamed from: cm.aptoide.analytics.implementation.network.RetrofitAptoideBiService */
public class RetrofitAptoideBiService implements AptoideBiEventService {
    private final AnalyticsBodyInterceptor analyticsBodyInterceptor;
    private DateFormat dateFormat;
    private final ServiceV7 serviceV7;

    /* renamed from: cm.aptoide.analytics.implementation.network.RetrofitAptoideBiService$ServiceV7 */
    public interface ServiceV7 {
        @POST("user/addEvent/name={name}/action={action}/context={context}")
        C5368e<Response<Void>> sendEvent(@Path("name") String str, @Path("action") String str2, @Path("context") String str3, @Body AnalyticsEventRequestBody analyticsEventRequestBody);
    }

    public RetrofitAptoideBiService(DateFormat dateFormat2, ServiceV7 serviceV72, AnalyticsBodyInterceptor analyticsBodyInterceptor2) {
        this.dateFormat = dateFormat2;
        this.serviceV7 = serviceV72;
        this.analyticsBodyInterceptor = analyticsBodyInterceptor2;
    }

    /* renamed from: a */
    public /* synthetic */ Object mo5199a(Event event, Object obj) {
        return this.serviceV7.sendEvent(event.getEventName(), event.getAction().name(), event.getContext(), (AnalyticsEventRequestBody) obj).mo18697k(C1027a.f3415f).mo18696k();
    }

    public C5328b send(Event event) {
        return this.analyticsBodyInterceptor.intercept(new AnalyticsEventRequestBody(event.getData(), this.dateFormat.format(new Date(event.getTimeStamp())))).mo18566b(new C1028b(this, event));
    }

    /* renamed from: a */
    static /* synthetic */ C5368e m4201a(Throwable th) {
        if (th instanceof IllegalStateException) {
            return C5368e.m10238a(th);
        }
        return C5368e.m10265n();
    }
}
