package p015cm.aptoide.p016pt.home.apps.list.models;

import com.airbnb.epoxy.C5607n;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9113l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006H\b\u001a&\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006H\b\u001a&\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006H\b\u001a&\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006H\b¨\u0006\r"}, mo16641d2 = {"downloadCard", "", "Lcom/airbnb/epoxy/EpoxyController;", "modelInitializer", "Lkotlin/Function1;", "Lcm/aptoide/pt/home/apps/list/models/DownloadCardModelBuilder;", "Lkotlin/ExtensionFunctionType;", "installedCard", "Lcm/aptoide/pt/home/apps/list/models/InstalledCardModelBuilder;", "title", "Lcm/aptoide/pt/home/apps/list/models/TitleModelBuilder;", "updateCard", "Lcm/aptoide/pt/home/apps/list/models/UpdateCardModelBuilder;", "app_vanillaProdRelease"}, mo16642k = 2, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.apps.list.models.EpoxyModelKotlinExtensionsKt */
/* compiled from: EpoxyModelKotlinExtensions.kt */
public final class EpoxyModelKotlinExtensionsKt {
    public static final void downloadCard(C5607n nVar, C9113l<? super DownloadCardModelBuilder, C10483v> lVar) {
        C10202j.m34178b(nVar, "$this$downloadCard");
        C10202j.m34178b(lVar, "modelInitializer");
        DownloadCardModel_ downloadCardModel_ = new DownloadCardModel_();
        lVar.invoke(downloadCardModel_);
        downloadCardModel_.addTo(nVar);
    }

    public static final void installedCard(C5607n nVar, C9113l<? super InstalledCardModelBuilder, C10483v> lVar) {
        C10202j.m34178b(nVar, "$this$installedCard");
        C10202j.m34178b(lVar, "modelInitializer");
        InstalledCardModel_ installedCardModel_ = new InstalledCardModel_();
        lVar.invoke(installedCardModel_);
        installedCardModel_.addTo(nVar);
    }

    public static final void title(C5607n nVar, C9113l<? super TitleModelBuilder, C10483v> lVar) {
        C10202j.m34178b(nVar, "$this$title");
        C10202j.m34178b(lVar, "modelInitializer");
        TitleModel_ titleModel_ = new TitleModel_();
        lVar.invoke(titleModel_);
        titleModel_.addTo(nVar);
    }

    public static final void updateCard(C5607n nVar, C9113l<? super UpdateCardModelBuilder, C10483v> lVar) {
        C10202j.m34178b(nVar, "$this$updateCard");
        C10202j.m34178b(lVar, "modelInitializer");
        UpdateCardModel_ updateCardModel_ = new UpdateCardModel_();
        lVar.invoke(updateCardModel_);
        updateCardModel_.addTo(nVar);
    }
}
