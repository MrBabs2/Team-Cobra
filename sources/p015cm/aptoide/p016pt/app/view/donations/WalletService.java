package p015cm.aptoide.p016pt.app.view.donations;

import p015cm.aptoide.p016pt.app.view.donations.data.GetWalletAddressResponse;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* renamed from: cm.aptoide.pt.app.view.donations.WalletService */
public class WalletService {
    private ServiceV7 service;
    private C5373h viewScheduler;

    /* renamed from: cm.aptoide.pt.app.view.donations.WalletService$ServiceV7 */
    public interface ServiceV7 {
        @GET("bds/apks/package/getOwnerWallet")
        C5368e<GetWalletAddressResponse> getWallet(@Query("package_name") String str);
    }

    public WalletService(ServiceV7 serviceV7, C5373h hVar) {
        this.service = serviceV7;
        this.viewScheduler = hVar;
    }

    public Single<String> getWalletAddress(String str) {
        return this.service.getWallet(str).mo18694j(C1514a.f4031f).mo18700m().mo18563b(this.viewScheduler);
    }
}
