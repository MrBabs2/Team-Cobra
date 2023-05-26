package p015cm.aptoide.aptoideviews.filters;

import com.airbnb.epoxy.C5591f0;
import com.airbnb.epoxy.C5596h0;
import com.airbnb.epoxy.C5598i0;
import com.airbnb.epoxy.C5600j0;
import com.airbnb.epoxy.C5631s;
import p015cm.aptoide.aptoideviews.filters.ClearFiltersModel;

/* renamed from: cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder */
public interface ClearFiltersModelBuilder {
    ClearFiltersModelBuilder eventListener(FilterEventListener filterEventListener);

    /* renamed from: id */
    ClearFiltersModelBuilder mo5327id(long j);

    /* renamed from: id */
    ClearFiltersModelBuilder mo5328id(long j, long j2);

    /* renamed from: id */
    ClearFiltersModelBuilder mo5329id(CharSequence charSequence);

    /* renamed from: id */
    ClearFiltersModelBuilder mo5330id(CharSequence charSequence, long j);

    /* renamed from: id */
    ClearFiltersModelBuilder mo5331id(CharSequence charSequence, CharSequence... charSequenceArr);

    /* renamed from: id */
    ClearFiltersModelBuilder mo5332id(Number... numberArr);

    ClearFiltersModelBuilder layout(int i);

    ClearFiltersModelBuilder onBind(C5591f0<ClearFiltersModel_, ClearFiltersModel.CardHolder> f0Var);

    ClearFiltersModelBuilder onUnbind(C5596h0<ClearFiltersModel_, ClearFiltersModel.CardHolder> h0Var);

    ClearFiltersModelBuilder onVisibilityChanged(C5598i0<ClearFiltersModel_, ClearFiltersModel.CardHolder> i0Var);

    ClearFiltersModelBuilder onVisibilityStateChanged(C5600j0<ClearFiltersModel_, ClearFiltersModel.CardHolder> j0Var);

    ClearFiltersModelBuilder spanSizeOverride(C5631s.C5634c cVar);

    ClearFiltersModelBuilder textColorStateList(Integer num);
}
