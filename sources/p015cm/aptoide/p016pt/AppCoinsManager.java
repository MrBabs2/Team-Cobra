package p015cm.aptoide.p016pt;

import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9064d;
import kotlin.p042a0.C9069g;
import kotlinx.coroutines.p395i2.C12253d;
import p015cm.aptoide.p016pt.bonus.BonusAppcModel;
import p015cm.aptoide.p016pt.bonus.BonusAppcService;
import p015cm.aptoide.p016pt.donations.Donation;
import p015cm.aptoide.p016pt.donations.DonationsService;
import p120q.p326a.C11496w;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\b2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo16641d2 = {"Lcm/aptoide/pt/AppCoinsManager;", "", "donationsService", "Lcm/aptoide/pt/donations/DonationsService;", "bonusAppcService", "Lcm/aptoide/pt/bonus/BonusAppcService;", "(Lcm/aptoide/pt/donations/DonationsService;Lcm/aptoide/pt/bonus/BonusAppcService;)V", "getBonusAppc", "Lio/reactivex/Single;", "Lcm/aptoide/pt/bonus/BonusAppcModel;", "getDonationsList", "", "Lcm/aptoide/pt/donations/Donation;", "packageName", "", "appcoins"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.AppCoinsManager */
/* compiled from: AppCoinsManager.kt */
public class AppCoinsManager {
    /* access modifiers changed from: private */
    public final BonusAppcService bonusAppcService;
    /* access modifiers changed from: private */
    public final DonationsService donationsService;

    public AppCoinsManager(DonationsService donationsService2, BonusAppcService bonusAppcService2) {
        C10202j.m34178b(donationsService2, "donationsService");
        C10202j.m34178b(bonusAppcService2, "bonusAppcService");
        this.donationsService = donationsService2;
        this.bonusAppcService = bonusAppcService2;
    }

    public final C11496w<BonusAppcModel> getBonusAppc() {
        return C12253d.m40405a((C9069g) null, new AppCoinsManager$getBonusAppc$1(this, (C9064d) null), 1, (Object) null);
    }

    public final C11496w<List<Donation>> getDonationsList(String str) {
        C10202j.m34178b(str, "packageName");
        return C12253d.m40405a((C9069g) null, new AppCoinsManager$getDonationsList$1(this, str, (C9064d) null), 1, (Object) null);
    }
}
