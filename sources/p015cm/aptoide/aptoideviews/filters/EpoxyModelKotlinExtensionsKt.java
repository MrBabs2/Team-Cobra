package p015cm.aptoide.aptoideviews.filters;

import com.airbnb.epoxy.C5607n;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9113l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006H\b\u001a&\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006H\b¨\u0006\t"}, mo16641d2 = {"clearFilters", "", "Lcom/airbnb/epoxy/EpoxyController;", "modelInitializer", "Lkotlin/Function1;", "Lcm/aptoide/aptoideviews/filters/ClearFiltersModelBuilder;", "Lkotlin/ExtensionFunctionType;", "filter", "Lcm/aptoide/aptoideviews/filters/FilterModelBuilder;", "aptoide-views_prodRelease"}, mo16642k = 2, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.filters.EpoxyModelKotlinExtensionsKt */
/* compiled from: EpoxyModelKotlinExtensions.kt */
public final class EpoxyModelKotlinExtensionsKt {
    public static final void clearFilters(C5607n nVar, C9113l<? super ClearFiltersModelBuilder, C10483v> lVar) {
        C10202j.m34178b(nVar, "$this$clearFilters");
        C10202j.m34178b(lVar, "modelInitializer");
        ClearFiltersModel_ clearFiltersModel_ = new ClearFiltersModel_();
        lVar.invoke(clearFiltersModel_);
        clearFiltersModel_.addTo(nVar);
    }

    public static final void filter(C5607n nVar, C9113l<? super FilterModelBuilder, C10483v> lVar) {
        C10202j.m34178b(nVar, "$this$filter");
        C10202j.m34178b(lVar, "modelInitializer");
        FilterModel_ filterModel_ = new FilterModel_();
        lVar.invoke(filterModel_);
        filterModel_.addTo(nVar);
    }
}
