package p015cm.aptoide.p016pt.donations;

import java.util.ArrayList;
import java.util.List;
import kotlin.C10225p;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9064d;
import kotlin.p042a0.p043j.p044a.C4782e;
import kotlin.p042a0.p043j.p044a.C9091j;
import kotlin.p215c0.p216c.C9117p;
import kotlinx.coroutines.C12191d0;
import p015cm.aptoide.p016pt.donations.DonationsService;
import retrofit2.Response;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, mo16641d2 = {"<anonymous>", "", "Lcm/aptoide/pt/donations/Donation;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo16642k = 3, mo16643mv = {1, 1, 16})
@C4782e(mo16621c = "cm.aptoide.pt.donations.DonationsService$getDonations$2", mo16622f = "DonationsService.kt", mo16623l = {14}, mo16624m = "invokeSuspend")
/* renamed from: cm.aptoide.pt.donations.DonationsService$getDonations$2 */
/* compiled from: DonationsService.kt */
final class DonationsService$getDonations$2 extends C9091j implements C9117p<C12191d0, C9064d<? super List<? extends Donation>>, Object> {
    final /* synthetic */ String $packageName;
    Object L$0;
    int label;

    /* renamed from: p$ */
    private C12191d0 f4981p$;
    final /* synthetic */ DonationsService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DonationsService$getDonations$2(DonationsService donationsService, String str, C9064d dVar) {
        super(2, dVar);
        this.this$0 = donationsService;
        this.$packageName = str;
    }

    public final C9064d<C10483v> create(Object obj, C9064d<?> dVar) {
        C10202j.m34178b(dVar, "completion");
        DonationsService$getDonations$2 donationsService$getDonations$2 = new DonationsService$getDonations$2(this.this$0, this.$packageName, dVar);
        donationsService$getDonations$2.f4981p$ = (C12191d0) obj;
        return donationsService$getDonations$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((DonationsService$getDonations$2) create(obj, (C9064d) obj2)).invokeSuspend(C10483v.f28357a);
    }

    public final Object invokeSuspend(Object obj) {
        Object a = C9081d.m29785a();
        int i = this.label;
        if (i == 0) {
            C10225p.m34214a(obj);
            C12191d0 d0Var = this.f4981p$;
            DonationsService.ServiceV8 access$getServiceV8$p = this.this$0.serviceV8;
            String str = this.$packageName;
            this.L$0 = d0Var;
            this.label = 1;
            obj = access$getServiceV8$p.getDonations(str, 5, this);
            if (obj == a) {
                return a;
            }
        } else if (i == 1) {
            C12191d0 d0Var2 = (C12191d0) this.L$0;
            C10225p.m34214a(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Response response = (Response) obj;
        GetDonations getDonations = (GetDonations) response.body();
        if (!response.isSuccessful() || getDonations == null) {
            return new ArrayList();
        }
        return this.this$0.mapToDonationsList(getDonations);
    }
}
