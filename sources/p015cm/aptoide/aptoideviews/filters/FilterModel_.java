package p015cm.aptoide.aptoideviews.filters;

import com.airbnb.epoxy.C5591f0;
import com.airbnb.epoxy.C5596h0;
import com.airbnb.epoxy.C5598i0;
import com.airbnb.epoxy.C5600j0;
import com.airbnb.epoxy.C5607n;
import com.airbnb.epoxy.C5631s;
import com.airbnb.epoxy.C5636u;
import com.airbnb.epoxy.C5637v;
import p015cm.aptoide.aptoideviews.filters.FilterModel;

/* renamed from: cm.aptoide.aptoideviews.filters.FilterModel_ */
public class FilterModel_ extends FilterModel implements C5637v<FilterModel.CardHolder>, FilterModelBuilder {
    private C5591f0<FilterModel_, FilterModel.CardHolder> onModelBoundListener_epoxyGeneratedModel;
    private C5596h0<FilterModel_, FilterModel.CardHolder> onModelUnboundListener_epoxyGeneratedModel;
    private C5598i0<FilterModel_, FilterModel.CardHolder> onModelVisibilityChangedListener_epoxyGeneratedModel;
    private C5600j0<FilterModel_, FilterModel.CardHolder> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

    public void addTo(C5607n nVar) {
        super.addTo(nVar);
        addWithDebugValidation(nVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FilterModel_) || !super.equals(obj)) {
            return false;
        }
        FilterModel_ filterModel_ = (FilterModel_) obj;
        if ((this.onModelBoundListener_epoxyGeneratedModel == null) != (filterModel_.onModelBoundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelUnboundListener_epoxyGeneratedModel == null) != (filterModel_.onModelUnboundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (filterModel_.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (filterModel_.onModelVisibilityChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if (getFilter() == null ? filterModel_.getFilter() != null : !getFilter().equals(filterModel_.getFilter())) {
            return false;
        }
        if ((getEventListener() == null) != (filterModel_.getEventListener() == null)) {
            return false;
        }
        if ((getTextColorStateList() == null) != (filterModel_.getTextColorStateList() == null)) {
            return false;
        }
        return (getBackgroundRes() == null) == (filterModel_.getBackgroundRes() == null);
    }

    public int hashCode() {
        int i = 1;
        int hashCode = ((((((((((((((super.hashCode() * 31) + (this.onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (getFilter() != null ? getFilter().hashCode() : 0)) * 31) + (getEventListener() != null ? 1 : 0)) * 31) + (getTextColorStateList() != null ? 1 : 0)) * 31;
        if (getBackgroundRes() == null) {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "FilterModel_{filter=" + getFilter() + ", eventListener=" + getEventListener() + ", textColorStateList=" + getTextColorStateList() + ", backgroundRes=" + getBackgroundRes() + "}" + super.toString();
    }

    public FilterModel_ backgroundRes(Integer num) {
        onMutation();
        super.setBackgroundRes(num);
        return this;
    }

    /* access modifiers changed from: protected */
    public FilterModel.CardHolder createNewHolder() {
        return new FilterModel.CardHolder();
    }

    public FilterModel_ eventListener(FilterEventListener filterEventListener) {
        onMutation();
        super.setEventListener(filterEventListener);
        return this;
    }

    public FilterModel_ filter(Filter filter) {
        onMutation();
        super.setFilter(filter);
        return this;
    }

    public void handlePostBind(FilterModel.CardHolder cardHolder, int i) {
        C5591f0<FilterModel_, FilterModel.CardHolder> f0Var = this.onModelBoundListener_epoxyGeneratedModel;
        if (f0Var != null) {
            f0Var.mo19220a(this, cardHolder, i);
        }
        validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", i);
    }

    public void handlePreBind(C5636u uVar, FilterModel.CardHolder cardHolder, int i) {
        validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", i);
    }

    public FilterModel_ hide() {
        super.hide();
        return this;
    }

    public FilterModel_ onBind(C5591f0<FilterModel_, FilterModel.CardHolder> f0Var) {
        onMutation();
        this.onModelBoundListener_epoxyGeneratedModel = f0Var;
        return this;
    }

    public FilterModel_ onUnbind(C5596h0<FilterModel_, FilterModel.CardHolder> h0Var) {
        onMutation();
        this.onModelUnboundListener_epoxyGeneratedModel = h0Var;
        return this;
    }

    public FilterModel_ reset() {
        this.onModelBoundListener_epoxyGeneratedModel = null;
        this.onModelUnboundListener_epoxyGeneratedModel = null;
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = null;
        super.setFilter((Filter) null);
        super.setEventListener((FilterEventListener) null);
        super.setTextColorStateList((Integer) null);
        super.setBackgroundRes((Integer) null);
        super.reset();
        return this;
    }

    public FilterModel_ textColorStateList(Integer num) {
        onMutation();
        super.setTextColorStateList(num);
        return this;
    }

    public FilterModel_ layout(int i) {
        super.layout(i);
        return this;
    }

    public FilterModel_ show() {
        super.show();
        return this;
    }

    public FilterModel_ spanSizeOverride(C5631s.C5634c cVar) {
        super.spanSizeOverride(cVar);
        return this;
    }

    public void unbind(FilterModel.CardHolder cardHolder) {
        super.unbind(cardHolder);
        C5596h0<FilterModel_, FilterModel.CardHolder> h0Var = this.onModelUnboundListener_epoxyGeneratedModel;
        if (h0Var != null) {
            h0Var.mo19223a(this, cardHolder);
        }
    }

    public Integer backgroundRes() {
        return super.getBackgroundRes();
    }

    public FilterEventListener eventListener() {
        return super.getEventListener();
    }

    public Filter filter() {
        return super.getFilter();
    }

    public void onVisibilityChanged(float f, float f2, int i, int i2, FilterModel.CardHolder cardHolder) {
        C5598i0<FilterModel_, FilterModel.CardHolder> i0Var = this.onModelVisibilityChangedListener_epoxyGeneratedModel;
        if (i0Var != null) {
            i0Var.mo19224a(this, cardHolder, f, f2, i, i2);
        }
        super.onVisibilityChanged(f, f2, i, i2, cardHolder);
    }

    public void onVisibilityStateChanged(int i, FilterModel.CardHolder cardHolder) {
        C5600j0<FilterModel_, FilterModel.CardHolder> j0Var = this.onModelVisibilityStateChangedListener_epoxyGeneratedModel;
        if (j0Var != null) {
            j0Var.mo19225a(this, cardHolder, i);
        }
        super.onVisibilityStateChanged(i, cardHolder);
    }

    public FilterModel_ show(boolean z) {
        super.show(z);
        return this;
    }

    public Integer textColorStateList() {
        return super.getTextColorStateList();
    }

    public FilterModel_ onVisibilityChanged(C5598i0<FilterModel_, FilterModel.CardHolder> i0Var) {
        onMutation();
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = i0Var;
        return this;
    }

    public FilterModel_ onVisibilityStateChanged(C5600j0<FilterModel_, FilterModel.CardHolder> j0Var) {
        onMutation();
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = j0Var;
        return this;
    }

    /* renamed from: id */
    public FilterModel_ m4239id(long j) {
        super.mo5327id(j);
        return this;
    }

    /* renamed from: id */
    public FilterModel_ m4244id(Number... numberArr) {
        super.mo5332id(numberArr);
        return this;
    }

    /* renamed from: id */
    public FilterModel_ m4240id(long j, long j2) {
        super.mo5328id(j, j2);
        return this;
    }

    /* renamed from: id */
    public FilterModel_ m4241id(CharSequence charSequence) {
        super.mo5329id(charSequence);
        return this;
    }

    /* renamed from: id */
    public FilterModel_ m4243id(CharSequence charSequence, CharSequence... charSequenceArr) {
        super.mo5331id(charSequence, charSequenceArr);
        return this;
    }

    /* renamed from: id */
    public FilterModel_ m4242id(CharSequence charSequence, long j) {
        super.mo5330id(charSequence, j);
        return this;
    }
}
