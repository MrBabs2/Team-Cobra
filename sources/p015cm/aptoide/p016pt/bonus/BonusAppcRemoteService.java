package p015cm.aptoide.p016pt.bonus;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9064d;
import kotlinx.coroutines.C12190d;
import kotlinx.coroutines.C12310t0;
import p015cm.aptoide.p016pt.bonus.BonusAppcResponse;
import retrofit2.Response;
import retrofit2.http.GET;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, mo16641d2 = {"Lcm/aptoide/pt/bonus/BonusAppcRemoteService;", "Lcm/aptoide/pt/bonus/BonusAppcService;", "serviceApi", "Lcm/aptoide/pt/bonus/BonusAppcRemoteService$ServiceApi;", "(Lcm/aptoide/pt/bonus/BonusAppcRemoteService$ServiceApi;)V", "getBonusAppc", "Lcm/aptoide/pt/bonus/BonusAppcModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapErrorResponse", "mapResponse", "response", "Lcm/aptoide/pt/bonus/BonusAppcResponse;", "ServiceApi", "appcoins"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.bonus.BonusAppcRemoteService */
/* compiled from: BonusAppcRemoteService.kt */
public final class BonusAppcRemoteService implements BonusAppcService {
    /* access modifiers changed from: private */
    public final ServiceApi serviceApi;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, mo16641d2 = {"Lcm/aptoide/pt/bonus/BonusAppcRemoteService$ServiceApi;", "", "getAppcBonus", "Lretrofit2/Response;", "Lcm/aptoide/pt/bonus/BonusAppcResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "appcoins"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.bonus.BonusAppcRemoteService$ServiceApi */
    /* compiled from: BonusAppcRemoteService.kt */
    public interface ServiceApi {
        @GET("gamification/levels")
        Object getAppcBonus(C9064d<? super Response<BonusAppcResponse>> dVar);
    }

    public BonusAppcRemoteService(ServiceApi serviceApi2) {
        C10202j.m34178b(serviceApi2, "serviceApi");
        this.serviceApi = serviceApi2;
    }

    /* access modifiers changed from: private */
    public final BonusAppcModel mapErrorResponse() {
        return new BonusAppcModel(false, 0);
    }

    /* access modifiers changed from: private */
    public final BonusAppcModel mapResponse(BonusAppcResponse bonusAppcResponse) {
        if (!C12130v.m40054b(bonusAppcResponse.getStatus(), "ACTIVE", false, 2, (Object) null) || !(!bonusAppcResponse.getResult().isEmpty())) {
            return mapErrorResponse();
        }
        return new BonusAppcModel(true, ((BonusAppcResponse.Result) C10539w.m35805g(bonusAppcResponse.getResult())).getBonus());
    }

    public Object getBonusAppc(C9064d<? super BonusAppcModel> dVar) {
        return C12190d.m40228a(C12310t0.m40641b(), new BonusAppcRemoteService$getBonusAppc$2(this, (C9064d) null), dVar);
    }
}
