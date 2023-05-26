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
import p015cm.aptoide.p016pt.home.apps.list.models.InstalledCardModel;
import p015cm.aptoide.p016pt.home.apps.model.InstalledApp;

/* renamed from: cm.aptoide.pt.home.apps.list.models.InstalledCardModel_ */
public class InstalledCardModel_ extends InstalledCardModel implements C5637v<InstalledCardModel.CardHolder>, InstalledCardModelBuilder {
    private C5591f0<InstalledCardModel_, InstalledCardModel.CardHolder> onModelBoundListener_epoxyGeneratedModel;
    private C5596h0<InstalledCardModel_, InstalledCardModel.CardHolder> onModelUnboundListener_epoxyGeneratedModel;
    private C5598i0<InstalledCardModel_, InstalledCardModel.CardHolder> onModelVisibilityChangedListener_epoxyGeneratedModel;
    private C5600j0<InstalledCardModel_, InstalledCardModel.CardHolder> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

    public void addTo(C5607n nVar) {
        super.addTo(nVar);
        addWithDebugValidation(nVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstalledCardModel_) || !super.equals(obj)) {
            return false;
        }
        InstalledCardModel_ installedCardModel_ = (InstalledCardModel_) obj;
        if ((this.onModelBoundListener_epoxyGeneratedModel == null) != (installedCardModel_.onModelBoundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelUnboundListener_epoxyGeneratedModel == null) != (installedCardModel_.onModelUnboundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (installedCardModel_.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (installedCardModel_.onModelVisibilityChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        return getApplication() == null ? installedCardModel_.getApplication() == null : getApplication().equals(installedCardModel_.getApplication());
    }

    /* access modifiers changed from: protected */
    public int getDefaultLayout() {
        return C1086R.layout.apps_installed_app_item;
    }

    public int hashCode() {
        int i = 1;
        int i2 = 0;
        int hashCode = ((((((super.hashCode() * 31) + (this.onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31;
        if (this.onModelVisibilityChangedListener_epoxyGeneratedModel == null) {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        if (getApplication() != null) {
            i2 = getApplication().hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return "InstalledCardModel_{application=" + getApplication() + "}" + super.toString();
    }

    public InstalledCardModel_ application(InstalledApp installedApp) {
        onMutation();
        super.setApplication(installedApp);
        return this;
    }

    /* access modifiers changed from: protected */
    public InstalledCardModel.CardHolder createNewHolder() {
        return new InstalledCardModel.CardHolder();
    }

    public void handlePostBind(InstalledCardModel.CardHolder cardHolder, int i) {
        C5591f0<InstalledCardModel_, InstalledCardModel.CardHolder> f0Var = this.onModelBoundListener_epoxyGeneratedModel;
        if (f0Var != null) {
            f0Var.mo19220a(this, cardHolder, i);
        }
        validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", i);
    }

    public void handlePreBind(C5636u uVar, InstalledCardModel.CardHolder cardHolder, int i) {
        validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", i);
    }

    public InstalledCardModel_ hide() {
        super.hide();
        return this;
    }

    public InstalledCardModel_ onBind(C5591f0<InstalledCardModel_, InstalledCardModel.CardHolder> f0Var) {
        onMutation();
        this.onModelBoundListener_epoxyGeneratedModel = f0Var;
        return this;
    }

    public InstalledCardModel_ onUnbind(C5596h0<InstalledCardModel_, InstalledCardModel.CardHolder> h0Var) {
        onMutation();
        this.onModelUnboundListener_epoxyGeneratedModel = h0Var;
        return this;
    }

    public InstalledCardModel_ reset() {
        this.onModelBoundListener_epoxyGeneratedModel = null;
        this.onModelUnboundListener_epoxyGeneratedModel = null;
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = null;
        super.setApplication((InstalledApp) null);
        super.reset();
        return this;
    }

    public InstalledCardModel_ layout(int i) {
        super.layout(i);
        return this;
    }

    public InstalledCardModel_ show() {
        super.show();
        return this;
    }

    public InstalledCardModel_ spanSizeOverride(C5631s.C5634c cVar) {
        super.spanSizeOverride(cVar);
        return this;
    }

    public void unbind(InstalledCardModel.CardHolder cardHolder) {
        super.unbind(cardHolder);
        C5596h0<InstalledCardModel_, InstalledCardModel.CardHolder> h0Var = this.onModelUnboundListener_epoxyGeneratedModel;
        if (h0Var != null) {
            h0Var.mo19223a(this, cardHolder);
        }
    }

    public InstalledApp application() {
        return super.getApplication();
    }

    public void onVisibilityChanged(float f, float f2, int i, int i2, InstalledCardModel.CardHolder cardHolder) {
        C5598i0<InstalledCardModel_, InstalledCardModel.CardHolder> i0Var = this.onModelVisibilityChangedListener_epoxyGeneratedModel;
        if (i0Var != null) {
            i0Var.mo19224a(this, cardHolder, f, f2, i, i2);
        }
        super.onVisibilityChanged(f, f2, i, i2, cardHolder);
    }

    public void onVisibilityStateChanged(int i, InstalledCardModel.CardHolder cardHolder) {
        C5600j0<InstalledCardModel_, InstalledCardModel.CardHolder> j0Var = this.onModelVisibilityStateChangedListener_epoxyGeneratedModel;
        if (j0Var != null) {
            j0Var.mo19225a(this, cardHolder, i);
        }
        super.onVisibilityStateChanged(i, cardHolder);
    }

    public InstalledCardModel_ show(boolean z) {
        super.show(z);
        return this;
    }

    public InstalledCardModel_ onVisibilityChanged(C5598i0<InstalledCardModel_, InstalledCardModel.CardHolder> i0Var) {
        onMutation();
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = i0Var;
        return this;
    }

    public InstalledCardModel_ onVisibilityStateChanged(C5600j0<InstalledCardModel_, InstalledCardModel.CardHolder> j0Var) {
        onMutation();
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = j0Var;
        return this;
    }

    /* renamed from: id */
    public InstalledCardModel_ m6248id(long j) {
        super.mo5327id(j);
        return this;
    }

    /* renamed from: id */
    public InstalledCardModel_ m6253id(Number... numberArr) {
        super.mo5332id(numberArr);
        return this;
    }

    /* renamed from: id */
    public InstalledCardModel_ m6249id(long j, long j2) {
        super.mo5328id(j, j2);
        return this;
    }

    /* renamed from: id */
    public InstalledCardModel_ m6250id(CharSequence charSequence) {
        super.mo5329id(charSequence);
        return this;
    }

    /* renamed from: id */
    public InstalledCardModel_ m6252id(CharSequence charSequence, CharSequence... charSequenceArr) {
        super.mo5331id(charSequence, charSequenceArr);
        return this;
    }

    /* renamed from: id */
    public InstalledCardModel_ m6251id(CharSequence charSequence, long j) {
        super.mo5330id(charSequence, j);
        return this;
    }
}
