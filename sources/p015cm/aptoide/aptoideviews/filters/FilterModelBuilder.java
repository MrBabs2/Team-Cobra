package p015cm.aptoide.aptoideviews.filters;

import com.airbnb.epoxy.C5591f0;
import com.airbnb.epoxy.C5596h0;
import com.airbnb.epoxy.C5598i0;
import com.airbnb.epoxy.C5600j0;
import com.airbnb.epoxy.C5631s;
import p015cm.aptoide.aptoideviews.filters.FilterModel;

/* renamed from: cm.aptoide.aptoideviews.filters.FilterModelBuilder */
public interface FilterModelBuilder {
    FilterModelBuilder backgroundRes(Integer num);

    FilterModelBuilder eventListener(FilterEventListener filterEventListener);

    FilterModelBuilder filter(Filter filter);

    /* renamed from: id */
    FilterModelBuilder mo5399id(long j);

    /* renamed from: id */
    FilterModelBuilder mo5400id(long j, long j2);

    /* renamed from: id */
    FilterModelBuilder mo5401id(CharSequence charSequence);

    /* renamed from: id */
    FilterModelBuilder mo5402id(CharSequence charSequence, long j);

    /* renamed from: id */
    FilterModelBuilder mo5403id(CharSequence charSequence, CharSequence... charSequenceArr);

    /* renamed from: id */
    FilterModelBuilder mo5404id(Number... numberArr);

    FilterModelBuilder layout(int i);

    FilterModelBuilder onBind(C5591f0<FilterModel_, FilterModel.CardHolder> f0Var);

    FilterModelBuilder onUnbind(C5596h0<FilterModel_, FilterModel.CardHolder> h0Var);

    FilterModelBuilder onVisibilityChanged(C5598i0<FilterModel_, FilterModel.CardHolder> i0Var);

    FilterModelBuilder onVisibilityStateChanged(C5600j0<FilterModel_, FilterModel.CardHolder> j0Var);

    FilterModelBuilder spanSizeOverride(C5631s.C5634c cVar);

    FilterModelBuilder textColorStateList(Integer num);
}
