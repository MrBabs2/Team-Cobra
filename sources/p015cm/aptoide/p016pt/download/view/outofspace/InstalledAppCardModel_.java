package p015cm.aptoide.p016pt.download.view.outofspace;

import com.airbnb.epoxy.C5591f0;
import com.airbnb.epoxy.C5596h0;
import com.airbnb.epoxy.C5598i0;
import com.airbnb.epoxy.C5600j0;
import com.airbnb.epoxy.C5607n;
import com.airbnb.epoxy.C5631s;
import com.airbnb.epoxy.C5636u;
import com.airbnb.epoxy.C5637v;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.download.view.outofspace.InstalledAppCardModel;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.download.view.outofspace.InstalledAppCardModel_ */
public class InstalledAppCardModel_ extends InstalledAppCardModel implements C5637v<InstalledAppCardModel.CardHolder>, InstalledAppCardModelBuilder {
    private C5591f0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> onModelBoundListener_epoxyGeneratedModel;
    private C5596h0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> onModelUnboundListener_epoxyGeneratedModel;
    private C5598i0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> onModelVisibilityChangedListener_epoxyGeneratedModel;
    private C5600j0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

    public void addTo(C5607n nVar) {
        super.addTo(nVar);
        addWithDebugValidation(nVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstalledAppCardModel_) || !super.equals(obj)) {
            return false;
        }
        InstalledAppCardModel_ installedAppCardModel_ = (InstalledAppCardModel_) obj;
        if ((this.onModelBoundListener_epoxyGeneratedModel == null) != (installedAppCardModel_.onModelBoundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelUnboundListener_epoxyGeneratedModel == null) != (installedAppCardModel_.onModelUnboundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (installedAppCardModel_.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (installedAppCardModel_.onModelVisibilityChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if (getApplication() == null ? installedAppCardModel_.getApplication() != null : !getApplication().equals(installedAppCardModel_.getApplication())) {
            return false;
        }
        return (getEventSubject() == null) == (installedAppCardModel_.getEventSubject() == null);
    }

    /* access modifiers changed from: protected */
    public int getDefaultLayout() {
        return C1086R.layout.out_of_space_installed_app_card;
    }

    public int hashCode() {
        int i = 1;
        int hashCode = ((((((((((super.hashCode() * 31) + (this.onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (getApplication() != null ? getApplication().hashCode() : 0)) * 31;
        if (getEventSubject() == null) {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "InstalledAppCardModel_{application=" + getApplication() + ", eventSubject=" + getEventSubject() + "}" + super.toString();
    }

    public InstalledAppCardModel_ application(InstalledApp installedApp) {
        onMutation();
        super.setApplication(installedApp);
        return this;
    }

    /* access modifiers changed from: protected */
    public InstalledAppCardModel.CardHolder createNewHolder() {
        return new InstalledAppCardModel.CardHolder();
    }

    public InstalledAppCardModel_ eventSubject(C12871b<String> bVar) {
        onMutation();
        super.setEventSubject(bVar);
        return this;
    }

    public void handlePostBind(InstalledAppCardModel.CardHolder cardHolder, int i) {
        C5591f0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> f0Var = this.onModelBoundListener_epoxyGeneratedModel;
        if (f0Var != null) {
            f0Var.mo19220a(this, cardHolder, i);
        }
        validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", i);
    }

    public void handlePreBind(C5636u uVar, InstalledAppCardModel.CardHolder cardHolder, int i) {
        validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", i);
    }

    public InstalledAppCardModel_ hide() {
        super.hide();
        return this;
    }

    public InstalledAppCardModel_ onBind(C5591f0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> f0Var) {
        onMutation();
        this.onModelBoundListener_epoxyGeneratedModel = f0Var;
        return this;
    }

    public InstalledAppCardModel_ onUnbind(C5596h0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> h0Var) {
        onMutation();
        this.onModelUnboundListener_epoxyGeneratedModel = h0Var;
        return this;
    }

    public InstalledAppCardModel_ reset() {
        this.onModelBoundListener_epoxyGeneratedModel = null;
        this.onModelUnboundListener_epoxyGeneratedModel = null;
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = null;
        super.setApplication((InstalledApp) null);
        super.setEventSubject((C12871b<String>) null);
        super.reset();
        return this;
    }

    public InstalledAppCardModel_ layout(int i) {
        super.layout(i);
        return this;
    }

    public InstalledAppCardModel_ show() {
        super.show();
        return this;
    }

    public InstalledAppCardModel_ spanSizeOverride(C5631s.C5634c cVar) {
        super.spanSizeOverride(cVar);
        return this;
    }

    public void unbind(InstalledAppCardModel.CardHolder cardHolder) {
        super.unbind(cardHolder);
        C5596h0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> h0Var = this.onModelUnboundListener_epoxyGeneratedModel;
        if (h0Var != null) {
            h0Var.mo19223a(this, cardHolder);
        }
    }

    public InstalledApp application() {
        return super.getApplication();
    }

    public C12871b<String> eventSubject() {
        return super.getEventSubject();
    }

    public void onVisibilityChanged(float f, float f2, int i, int i2, InstalledAppCardModel.CardHolder cardHolder) {
        C5598i0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> i0Var = this.onModelVisibilityChangedListener_epoxyGeneratedModel;
        if (i0Var != null) {
            i0Var.mo19224a(this, cardHolder, f, f2, i, i2);
        }
        super.onVisibilityChanged(f, f2, i, i2, cardHolder);
    }

    public void onVisibilityStateChanged(int i, InstalledAppCardModel.CardHolder cardHolder) {
        C5600j0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> j0Var = this.onModelVisibilityStateChangedListener_epoxyGeneratedModel;
        if (j0Var != null) {
            j0Var.mo19225a(this, cardHolder, i);
        }
        super.onVisibilityStateChanged(i, cardHolder);
    }

    public InstalledAppCardModel_ show(boolean z) {
        super.show(z);
        return this;
    }

    public InstalledAppCardModel_ onVisibilityChanged(C5598i0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> i0Var) {
        onMutation();
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = i0Var;
        return this;
    }

    public InstalledAppCardModel_ onVisibilityStateChanged(C5600j0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> j0Var) {
        onMutation();
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = j0Var;
        return this;
    }

    /* renamed from: id */
    public InstalledAppCardModel_ m5400id(long j) {
        super.mo5327id(j);
        return this;
    }

    /* renamed from: id */
    public InstalledAppCardModel_ m5405id(Number... numberArr) {
        super.mo5332id(numberArr);
        return this;
    }

    /* renamed from: id */
    public InstalledAppCardModel_ m5401id(long j, long j2) {
        super.mo5328id(j, j2);
        return this;
    }

    /* renamed from: id */
    public InstalledAppCardModel_ m5402id(CharSequence charSequence) {
        super.mo5329id(charSequence);
        return this;
    }

    /* renamed from: id */
    public InstalledAppCardModel_ m5404id(CharSequence charSequence, CharSequence... charSequenceArr) {
        super.mo5331id(charSequence, charSequenceArr);
        return this;
    }

    /* renamed from: id */
    public InstalledAppCardModel_ m5403id(CharSequence charSequence, long j) {
        super.mo5330id(charSequence, j);
        return this;
    }
}
