package p015cm.aptoide.p016pt.home.apps.list.models;

import com.airbnb.epoxy.C5591f0;
import com.airbnb.epoxy.C5596h0;
import com.airbnb.epoxy.C5598i0;
import com.airbnb.epoxy.C5600j0;
import com.airbnb.epoxy.C5607n;
import com.airbnb.epoxy.C5631s;
import com.airbnb.epoxy.C5636u;
import com.airbnb.epoxy.C5637v;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.home.apps.list.models.TitleModel;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.apps.list.models.TitleModel_ */
public class TitleModel_ extends TitleModel implements C5637v<TitleModel.Holder>, TitleModelBuilder {
    private C5591f0<TitleModel_, TitleModel.Holder> onModelBoundListener_epoxyGeneratedModel;
    private C5596h0<TitleModel_, TitleModel.Holder> onModelUnboundListener_epoxyGeneratedModel;
    private C5598i0<TitleModel_, TitleModel.Holder> onModelVisibilityChangedListener_epoxyGeneratedModel;
    private C5600j0<TitleModel_, TitleModel.Holder> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

    public void addTo(C5607n nVar) {
        super.addTo(nVar);
        addWithDebugValidation(nVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TitleModel_) || !super.equals(obj)) {
            return false;
        }
        TitleModel_ titleModel_ = (TitleModel_) obj;
        if ((this.onModelBoundListener_epoxyGeneratedModel == null) != (titleModel_.onModelBoundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelUnboundListener_epoxyGeneratedModel == null) != (titleModel_.onModelUnboundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (titleModel_.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (titleModel_.onModelVisibilityChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if (getTitle() == null ? titleModel_.getTitle() != null : !getTitle().equals(titleModel_.getTitle())) {
            return false;
        }
        if (getShouldShowButton() != titleModel_.getShouldShowButton()) {
            return false;
        }
        return (getEventSubject() == null) == (titleModel_.getEventSubject() == null);
    }

    /* access modifiers changed from: protected */
    public int getDefaultLayout() {
        return C1086R.layout.apps_header_item;
    }

    public int hashCode() {
        int i = 1;
        int hashCode = ((((((((((((super.hashCode() * 31) + (this.onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (getTitle() != null ? getTitle().hashCode() : 0)) * 31) + (getShouldShowButton() ? 1 : 0)) * 31;
        if (getEventSubject() == null) {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "TitleModel_{title=" + getTitle() + ", shouldShowButton=" + getShouldShowButton() + ", eventSubject=" + getEventSubject() + "}" + super.toString();
    }

    /* access modifiers changed from: protected */
    public TitleModel.Holder createNewHolder() {
        return new TitleModel.Holder();
    }

    public TitleModel_ eventSubject(C12871b<Void> bVar) {
        onMutation();
        super.setEventSubject(bVar);
        return this;
    }

    public void handlePostBind(TitleModel.Holder holder, int i) {
        C5591f0<TitleModel_, TitleModel.Holder> f0Var = this.onModelBoundListener_epoxyGeneratedModel;
        if (f0Var != null) {
            f0Var.mo19220a(this, holder, i);
        }
        validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", i);
    }

    public void handlePreBind(C5636u uVar, TitleModel.Holder holder, int i) {
        validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", i);
    }

    public TitleModel_ hide() {
        super.hide();
        return this;
    }

    public TitleModel_ onBind(C5591f0<TitleModel_, TitleModel.Holder> f0Var) {
        onMutation();
        this.onModelBoundListener_epoxyGeneratedModel = f0Var;
        return this;
    }

    public TitleModel_ onUnbind(C5596h0<TitleModel_, TitleModel.Holder> h0Var) {
        onMutation();
        this.onModelUnboundListener_epoxyGeneratedModel = h0Var;
        return this;
    }

    public TitleModel_ reset() {
        this.onModelBoundListener_epoxyGeneratedModel = null;
        this.onModelUnboundListener_epoxyGeneratedModel = null;
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = null;
        super.setTitle((Integer) null);
        super.setShouldShowButton(false);
        super.setEventSubject((C12871b<Void>) null);
        super.reset();
        return this;
    }

    public TitleModel_ shouldShowButton(boolean z) {
        onMutation();
        super.setShouldShowButton(z);
        return this;
    }

    public TitleModel_ title(Integer num) {
        onMutation();
        super.setTitle(num);
        return this;
    }

    public TitleModel_ layout(int i) {
        super.layout(i);
        return this;
    }

    public TitleModel_ show() {
        super.show();
        return this;
    }

    public TitleModel_ spanSizeOverride(C5631s.C5634c cVar) {
        super.spanSizeOverride(cVar);
        return this;
    }

    public void unbind(TitleModel.Holder holder) {
        super.unbind(holder);
        C5596h0<TitleModel_, TitleModel.Holder> h0Var = this.onModelUnboundListener_epoxyGeneratedModel;
        if (h0Var != null) {
            h0Var.mo19223a(this, holder);
        }
    }

    public C12871b<Void> eventSubject() {
        return super.getEventSubject();
    }

    public void onVisibilityChanged(float f, float f2, int i, int i2, TitleModel.Holder holder) {
        C5598i0<TitleModel_, TitleModel.Holder> i0Var = this.onModelVisibilityChangedListener_epoxyGeneratedModel;
        if (i0Var != null) {
            i0Var.mo19224a(this, holder, f, f2, i, i2);
        }
        super.onVisibilityChanged(f, f2, i, i2, holder);
    }

    public void onVisibilityStateChanged(int i, TitleModel.Holder holder) {
        C5600j0<TitleModel_, TitleModel.Holder> j0Var = this.onModelVisibilityStateChangedListener_epoxyGeneratedModel;
        if (j0Var != null) {
            j0Var.mo19225a(this, holder, i);
        }
        super.onVisibilityStateChanged(i, holder);
    }

    public boolean shouldShowButton() {
        return super.getShouldShowButton();
    }

    public TitleModel_ show(boolean z) {
        super.show(z);
        return this;
    }

    public Integer title() {
        return super.getTitle();
    }

    public TitleModel_ onVisibilityChanged(C5598i0<TitleModel_, TitleModel.Holder> i0Var) {
        onMutation();
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = i0Var;
        return this;
    }

    public TitleModel_ onVisibilityStateChanged(C5600j0<TitleModel_, TitleModel.Holder> j0Var) {
        onMutation();
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = j0Var;
        return this;
    }

    /* renamed from: id */
    public TitleModel_ m6272id(long j) {
        super.mo5327id(j);
        return this;
    }

    /* renamed from: id */
    public TitleModel_ m6277id(Number... numberArr) {
        super.mo5332id(numberArr);
        return this;
    }

    /* renamed from: id */
    public TitleModel_ m6273id(long j, long j2) {
        super.mo5328id(j, j2);
        return this;
    }

    /* renamed from: id */
    public TitleModel_ m6274id(CharSequence charSequence) {
        super.mo5329id(charSequence);
        return this;
    }

    /* renamed from: id */
    public TitleModel_ m6276id(CharSequence charSequence, CharSequence... charSequenceArr) {
        super.mo5331id(charSequence, charSequenceArr);
        return this;
    }

    /* renamed from: id */
    public TitleModel_ m6275id(CharSequence charSequence, long j) {
        super.mo5330id(charSequence, j);
        return this;
    }
}
