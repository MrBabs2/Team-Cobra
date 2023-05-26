package p015cm.aptoide.aptoideviews.filters;

import com.airbnb.epoxy.C5591f0;
import com.airbnb.epoxy.C5596h0;
import com.airbnb.epoxy.C5598i0;
import com.airbnb.epoxy.C5600j0;
import com.airbnb.epoxy.C5607n;
import com.airbnb.epoxy.C5631s;
import com.airbnb.epoxy.C5636u;
import com.airbnb.epoxy.C5637v;
import p015cm.aptoide.aptoideviews.filters.ClearFiltersModel;

/* renamed from: cm.aptoide.aptoideviews.filters.ClearFiltersModel_ */
public class ClearFiltersModel_ extends ClearFiltersModel implements C5637v<ClearFiltersModel.CardHolder>, ClearFiltersModelBuilder {
    private C5591f0<ClearFiltersModel_, ClearFiltersModel.CardHolder> onModelBoundListener_epoxyGeneratedModel;
    private C5596h0<ClearFiltersModel_, ClearFiltersModel.CardHolder> onModelUnboundListener_epoxyGeneratedModel;
    private C5598i0<ClearFiltersModel_, ClearFiltersModel.CardHolder> onModelVisibilityChangedListener_epoxyGeneratedModel;
    private C5600j0<ClearFiltersModel_, ClearFiltersModel.CardHolder> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

    public void addTo(C5607n nVar) {
        super.addTo(nVar);
        addWithDebugValidation(nVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClearFiltersModel_) || !super.equals(obj)) {
            return false;
        }
        ClearFiltersModel_ clearFiltersModel_ = (ClearFiltersModel_) obj;
        if ((this.onModelBoundListener_epoxyGeneratedModel == null) != (clearFiltersModel_.onModelBoundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelUnboundListener_epoxyGeneratedModel == null) != (clearFiltersModel_.onModelUnboundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (clearFiltersModel_.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (clearFiltersModel_.onModelVisibilityChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((getEventListener() == null) != (clearFiltersModel_.getEventListener() == null)) {
            return false;
        }
        return (getTextColorStateList() == null) == (clearFiltersModel_.getTextColorStateList() == null);
    }

    public int hashCode() {
        int i = 1;
        int hashCode = ((((((((((super.hashCode() * 31) + (this.onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (getEventListener() != null ? 1 : 0)) * 31;
        if (getTextColorStateList() == null) {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "ClearFiltersModel_{eventListener=" + getEventListener() + ", textColorStateList=" + getTextColorStateList() + "}" + super.toString();
    }

    /* access modifiers changed from: protected */
    public ClearFiltersModel.CardHolder createNewHolder() {
        return new ClearFiltersModel.CardHolder();
    }

    public ClearFiltersModel_ eventListener(FilterEventListener filterEventListener) {
        onMutation();
        super.setEventListener(filterEventListener);
        return this;
    }

    public void handlePostBind(ClearFiltersModel.CardHolder cardHolder, int i) {
        C5591f0<ClearFiltersModel_, ClearFiltersModel.CardHolder> f0Var = this.onModelBoundListener_epoxyGeneratedModel;
        if (f0Var != null) {
            f0Var.mo19220a(this, cardHolder, i);
        }
        validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", i);
    }

    public void handlePreBind(C5636u uVar, ClearFiltersModel.CardHolder cardHolder, int i) {
        validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", i);
    }

    public ClearFiltersModel_ hide() {
        super.hide();
        return this;
    }

    public ClearFiltersModel_ onBind(C5591f0<ClearFiltersModel_, ClearFiltersModel.CardHolder> f0Var) {
        onMutation();
        this.onModelBoundListener_epoxyGeneratedModel = f0Var;
        return this;
    }

    public ClearFiltersModel_ onUnbind(C5596h0<ClearFiltersModel_, ClearFiltersModel.CardHolder> h0Var) {
        onMutation();
        this.onModelUnboundListener_epoxyGeneratedModel = h0Var;
        return this;
    }

    public ClearFiltersModel_ reset() {
        this.onModelBoundListener_epoxyGeneratedModel = null;
        this.onModelUnboundListener_epoxyGeneratedModel = null;
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = null;
        super.setEventListener((FilterEventListener) null);
        super.setTextColorStateList((Integer) null);
        super.reset();
        return this;
    }

    public ClearFiltersModel_ textColorStateList(Integer num) {
        onMutation();
        super.setTextColorStateList(num);
        return this;
    }

    public ClearFiltersModel_ layout(int i) {
        super.layout(i);
        return this;
    }

    public ClearFiltersModel_ show() {
        super.show();
        return this;
    }

    public ClearFiltersModel_ spanSizeOverride(C5631s.C5634c cVar) {
        super.spanSizeOverride(cVar);
        return this;
    }

    public void unbind(ClearFiltersModel.CardHolder cardHolder) {
        super.unbind(cardHolder);
        C5596h0<ClearFiltersModel_, ClearFiltersModel.CardHolder> h0Var = this.onModelUnboundListener_epoxyGeneratedModel;
        if (h0Var != null) {
            h0Var.mo19223a(this, cardHolder);
        }
    }

    public FilterEventListener eventListener() {
        return super.getEventListener();
    }

    public void onVisibilityChanged(float f, float f2, int i, int i2, ClearFiltersModel.CardHolder cardHolder) {
        C5598i0<ClearFiltersModel_, ClearFiltersModel.CardHolder> i0Var = this.onModelVisibilityChangedListener_epoxyGeneratedModel;
        if (i0Var != null) {
            i0Var.mo19224a(this, cardHolder, f, f2, i, i2);
        }
        super.onVisibilityChanged(f, f2, i, i2, cardHolder);
    }

    public void onVisibilityStateChanged(int i, ClearFiltersModel.CardHolder cardHolder) {
        C5600j0<ClearFiltersModel_, ClearFiltersModel.CardHolder> j0Var = this.onModelVisibilityStateChangedListener_epoxyGeneratedModel;
        if (j0Var != null) {
            j0Var.mo19225a(this, cardHolder, i);
        }
        super.onVisibilityStateChanged(i, cardHolder);
    }

    public ClearFiltersModel_ show(boolean z) {
        super.show(z);
        return this;
    }

    public Integer textColorStateList() {
        return super.getTextColorStateList();
    }

    public ClearFiltersModel_ onVisibilityChanged(C5598i0<ClearFiltersModel_, ClearFiltersModel.CardHolder> i0Var) {
        onMutation();
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = i0Var;
        return this;
    }

    public ClearFiltersModel_ onVisibilityStateChanged(C5600j0<ClearFiltersModel_, ClearFiltersModel.CardHolder> j0Var) {
        onMutation();
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = j0Var;
        return this;
    }

    /* renamed from: id */
    public ClearFiltersModel_ m4215id(long j) {
        super.mo5327id(j);
        return this;
    }

    /* renamed from: id */
    public ClearFiltersModel_ m4220id(Number... numberArr) {
        super.mo5332id(numberArr);
        return this;
    }

    /* renamed from: id */
    public ClearFiltersModel_ m4216id(long j, long j2) {
        super.mo5328id(j, j2);
        return this;
    }

    /* renamed from: id */
    public ClearFiltersModel_ m4217id(CharSequence charSequence) {
        super.mo5329id(charSequence);
        return this;
    }

    /* renamed from: id */
    public ClearFiltersModel_ m4219id(CharSequence charSequence, CharSequence... charSequenceArr) {
        super.mo5331id(charSequence, charSequenceArr);
        return this;
    }

    /* renamed from: id */
    public ClearFiltersModel_ m4218id(CharSequence charSequence, long j) {
        super.mo5330id(charSequence, j);
        return this;
    }
}
