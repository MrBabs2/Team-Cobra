package p015cm.aptoide.p016pt.app;

import java.util.ArrayList;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Obb;
import p015cm.aptoide.p016pt.promotions.Promotion;
import p015cm.aptoide.p016pt.promotions.WalletApp;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, mo16641d2 = {"Lcm/aptoide/pt/app/PromotionViewModel;", "", "walletApp", "Lcm/aptoide/pt/promotions/WalletApp;", "promotions", "", "Lcm/aptoide/pt/promotions/Promotion;", "appViewModel", "Lcm/aptoide/pt/app/AppViewModel;", "(Lcm/aptoide/pt/promotions/WalletApp;Ljava/util/List;Lcm/aptoide/pt/app/AppViewModel;)V", "getAppViewModel", "()Lcm/aptoide/pt/app/AppViewModel;", "setAppViewModel", "(Lcm/aptoide/pt/app/AppViewModel;)V", "getPromotions", "()Ljava/util/List;", "setPromotions", "(Ljava/util/List;)V", "getWalletApp", "()Lcm/aptoide/pt/promotions/WalletApp;", "setWalletApp", "(Lcm/aptoide/pt/promotions/WalletApp;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.app.PromotionViewModel */
/* compiled from: PromotionViewModel.kt */
public final class PromotionViewModel {
    private AppViewModel appViewModel;
    private List<Promotion> promotions;
    private WalletApp walletApp;

    public PromotionViewModel() {
        this((WalletApp) null, (List) null, (AppViewModel) null, 7, (DefaultConstructorMarker) null);
    }

    public PromotionViewModel(WalletApp walletApp2, List<Promotion> list, AppViewModel appViewModel2) {
        C10202j.m34178b(walletApp2, "walletApp");
        C10202j.m34178b(list, DeepLinkIntentReceiver.DeepLinksTargets.PROMOTIONS_DEEPLINK);
        this.walletApp = walletApp2;
        this.promotions = list;
        this.appViewModel = appViewModel2;
    }

    public static /* synthetic */ PromotionViewModel copy$default(PromotionViewModel promotionViewModel, WalletApp walletApp2, List<Promotion> list, AppViewModel appViewModel2, int i, Object obj) {
        if ((i & 1) != 0) {
            walletApp2 = promotionViewModel.walletApp;
        }
        if ((i & 2) != 0) {
            list = promotionViewModel.promotions;
        }
        if ((i & 4) != 0) {
            appViewModel2 = promotionViewModel.appViewModel;
        }
        return promotionViewModel.copy(walletApp2, list, appViewModel2);
    }

    public final WalletApp component1() {
        return this.walletApp;
    }

    public final List<Promotion> component2() {
        return this.promotions;
    }

    public final AppViewModel component3() {
        return this.appViewModel;
    }

    public final PromotionViewModel copy(WalletApp walletApp2, List<Promotion> list, AppViewModel appViewModel2) {
        C10202j.m34178b(walletApp2, "walletApp");
        C10202j.m34178b(list, DeepLinkIntentReceiver.DeepLinksTargets.PROMOTIONS_DEEPLINK);
        return new PromotionViewModel(walletApp2, list, appViewModel2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionViewModel)) {
            return false;
        }
        PromotionViewModel promotionViewModel = (PromotionViewModel) obj;
        return C10202j.m34176a((Object) this.walletApp, (Object) promotionViewModel.walletApp) && C10202j.m34176a((Object) this.promotions, (Object) promotionViewModel.promotions) && C10202j.m34176a((Object) this.appViewModel, (Object) promotionViewModel.appViewModel);
    }

    public final AppViewModel getAppViewModel() {
        return this.appViewModel;
    }

    public final List<Promotion> getPromotions() {
        return this.promotions;
    }

    public final WalletApp getWalletApp() {
        return this.walletApp;
    }

    public int hashCode() {
        WalletApp walletApp2 = this.walletApp;
        int i = 0;
        int hashCode = (walletApp2 != null ? walletApp2.hashCode() : 0) * 31;
        List<Promotion> list = this.promotions;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        AppViewModel appViewModel2 = this.appViewModel;
        if (appViewModel2 != null) {
            i = appViewModel2.hashCode();
        }
        return hashCode2 + i;
    }

    public final void setAppViewModel(AppViewModel appViewModel2) {
        this.appViewModel = appViewModel2;
    }

    public final void setPromotions(List<Promotion> list) {
        C10202j.m34178b(list, "<set-?>");
        this.promotions = list;
    }

    public final void setWalletApp(WalletApp walletApp2) {
        C10202j.m34178b(walletApp2, "<set-?>");
        this.walletApp = walletApp2;
    }

    public String toString() {
        return "PromotionViewModel(walletApp=" + this.walletApp + ", promotions=" + this.promotions + ", appViewModel=" + this.appViewModel + ")";
    }

    public /* synthetic */ PromotionViewModel(WalletApp walletApp2, List list, AppViewModel appViewModel2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        PromotionViewModel promotionViewModel;
        AppViewModel appViewModel3;
        WalletApp walletApp3 = (i & 1) != 0 ? new WalletApp((DownloadModel) null, false, (String) null, (String) null, 0, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (Obb) null, 0, (String) null, 0.0f, (List) null, (List) null, (String) null, (String) null, 524287, (DefaultConstructorMarker) null) : walletApp2;
        List arrayList = (i & 2) != 0 ? new ArrayList() : list;
        if ((i & 4) != 0) {
            appViewModel3 = null;
            promotionViewModel = this;
        } else {
            promotionViewModel = this;
            appViewModel3 = appViewModel2;
        }
        new PromotionViewModel(walletApp3, arrayList, appViewModel3);
    }
}
