package p015cm.aptoide.p016pt.donations;

import java.util.ArrayList;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9064d;
import kotlinx.coroutines.C12190d;
import kotlinx.coroutines.C12310t0;
import p015cm.aptoide.p016pt.donations.GetDonations;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, mo16641d2 = {"Lcm/aptoide/pt/donations/DonationsService;", "", "serviceV8", "Lcm/aptoide/pt/donations/DonationsService$ServiceV8;", "(Lcm/aptoide/pt/donations/DonationsService$ServiceV8;)V", "getDonations", "", "Lcm/aptoide/pt/donations/Donation;", "packageName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapToDonationsList", "donationsResponse", "Lcm/aptoide/pt/donations/GetDonations;", "ServiceV8", "appcoins"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.donations.DonationsService */
/* compiled from: DonationsService.kt */
public final class DonationsService {
    /* access modifiers changed from: private */
    public final ServiceV8 serviceV8;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, mo16641d2 = {"Lcm/aptoide/pt/donations/DonationsService$ServiceV8;", "", "getDonations", "Lretrofit2/Response;", "Lcm/aptoide/pt/donations/GetDonations;", "packageName", "", "limit", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "appcoins"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.donations.DonationsService$ServiceV8 */
    /* compiled from: DonationsService.kt */
    public interface ServiceV8 {
        @GET("broker/8.20181010/leaderboard/donations")
        Object getDonations(@Query("domain") String str, @Query("limit") int i, C9064d<? super Response<GetDonations>> dVar);
    }

    public DonationsService(ServiceV8 serviceV82) {
        C10202j.m34178b(serviceV82, "serviceV8");
        this.serviceV8 = serviceV82;
    }

    /* access modifiers changed from: private */
    public final List<Donation> mapToDonationsList(GetDonations getDonations) {
        ArrayList arrayList = new ArrayList();
        for (GetDonations.Donor next : getDonations.getItems()) {
            C10202j.m34174a((Object) next, "donor");
            String domain = next.getDomain();
            C10202j.m34174a((Object) domain, "donor.domain");
            String owner = next.getOwner();
            C10202j.m34174a((Object) owner, "donor.owner");
            String appc = next.getAppc();
            C10202j.m34174a((Object) appc, "donor.appc");
            arrayList.add(new Donation(domain, owner, Float.parseFloat(appc)));
        }
        return arrayList;
    }

    public final Object getDonations(String str, C9064d<? super List<Donation>> dVar) {
        return C12190d.m40228a(C12310t0.m40641b(), new DonationsService$getDonations$2(this, str, (C9064d) null), dVar);
    }
}
