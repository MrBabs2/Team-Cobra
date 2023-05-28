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
import p015cm.aptoide.p016pt.home.apps.AppClick;
import p015cm.aptoide.p016pt.home.apps.list.models.UpdateCardModel;
import p015cm.aptoide.p016pt.home.apps.model.UpdateApp;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.apps.list.models.UpdateCardModel_ */
public class UpdateCardModel_ extends UpdateCardModel implements C5637v<UpdateCardModel.CardHolder>, UpdateCardModelBuilder {
    private C5591f0<UpdateCardModel_, UpdateCardModel.CardHolder> onModelBoundListener_epoxyGeneratedModel;
    private C5596h0<UpdateCardModel_, UpdateCardModel.CardHolder> onModelUnboundListener_epoxyGeneratedModel;
    private C5598i0<UpdateCardModel_, UpdateCardModel.CardHolder> onModelVisibilityChangedListener_epoxyGeneratedModel;
    private C5600j0<UpdateCardModel_, UpdateCardModel.CardHolder> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

    public void addTo(C5607n nVar) {
        super.addTo(nVar);
        addWithDebugValidation(nVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateCardModel_) || !super.equals(obj)) {
            return false;
        }
        UpdateCardModel_ updateCardModel_ = (UpdateCardModel_) obj;
        if ((this.onModelBoundListener_epoxyGeneratedModel == null) != (updateCardModel_.onModelBoundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelUnboundListener_epoxyGeneratedModel == null) != (updateCardModel_.onModelUnboundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (updateCardModel_.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (updateCardModel_.onModelVisibilityChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if (getApplication() == null ? updateCardModel_.getApplication() != null : !getApplication().equals(updateCardModel_.getApplication())) {
            return false;
        }
        if ((getEventSubject() == null) != (updateCardModel_.getEventSubject() == null)) {
            return false;
        }
        return (getThemeManager() == null) == (updateCardModel_.getThemeManager() == null);
    }

    /* access modifiers changed from: protected */
    public int getDefaultLayout() {
        return C1086R.layout.apps_update_app_item;
    }

    public int hashCode() {
        int i = 1;
        int hashCode = ((((((((((((super.hashCode() * 31) + (this.onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (getApplication() != null ? getApplication().hashCode() : 0)) * 31) + (getEventSubject() != null ? 1 : 0)) * 31;
        if (getThemeManager() == null) {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "UpdateCardModel_{application=" + getApplication() + ", eventSubject=" + getEventSubject() + ", themeManager=" + getThemeManager() + "}" + super.toString();
    }

    public UpdateCardModel_ application(UpdateApp updateApp) {
        onMutation();
        super.setApplication(updateApp);
        return this;
    }

    /* access modifiers changed from: protected */
    public UpdateCardModel.CardHolder createNewHolder() {
        return new UpdateCardModel.CardHolder();
    }

    public UpdateCardModel_ eventSubject(C12871b<AppClick> bVar) {
        onMutation();
        super.setEventSubject(bVar);
        return this;
    }

    public void handlePostBind(UpdateCardModel.CardHolder cardHolder, int i) {
        C5591f0<UpdateCardModel_, UpdateCardModel.CardHolder> f0Var = this.onModelBoundListener_epoxyGeneratedModel;
        if (f0Var != null) {
            f0Var.mo19220a(this, cardHolder, i);
        }
        validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", i);
    }

    public void handlePreBind(C5636u uVar, UpdateCardModel.CardHolder cardHolder, int i) {
        validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", i);
    }

    public UpdateCardModel_ hide() {
        super.hide();
        return this;
    }

    public UpdateCardModel_ onBind(C5591f0<UpdateCardModel_, UpdateCardModel.CardHolder> f0Var) {
        onMutation();
        this.onModelBoundListener_epoxyGeneratedModel = f0Var;
        return this;
    }

    public UpdateCardModel_ onUnbind(C5596h0<UpdateCardModel_, UpdateCardModel.CardHolder> h0Var) {
        onMutation();
        this.onModelUnboundListener_epoxyGeneratedModel = h0Var;
        return this;
    }

    public UpdateCardModel_ reset() {
        this.onModelBoundListener_epoxyGeneratedModel = null;
        this.onModelUnboundListener_epoxyGeneratedModel = null;
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = null;
        super.setApplication((UpdateApp) null);
        super.setEventSubject((C12871b<AppClick>) null);
        super.setThemeManager((ThemeManager) null);
        super.reset();
        return this;
    }

    public UpdateCardModel_ themeManager(ThemeManager themeManager) {
        onMutation();
        super.setThemeManager(themeManager);
        return this;
    }

    public UpdateCardModel_ layout(int i) {
        super.layout(i);
        return this;
    }

    public UpdateCardModel_ show() {
        super.show();
        return this;
    }

    public UpdateCardModel_ spanSizeOverride(C5631s.C5634c cVar) {
        super.spanSizeOverride(cVar);
        return this;
    }

    public void unbind(UpdateCardModel.CardHolder cardHolder) {
        super.unbind(cardHolder);
        C5596h0<UpdateCardModel_, UpdateCardModel.CardHolder> h0Var = this.onModelUnboundListener_epoxyGeneratedModel;
        if (h0Var != null) {
            h0Var.mo19223a(this, cardHolder);
        }
    }

    public UpdateApp application() {
        return super.getApplication();
    }

    public C12871b<AppClick> eventSubject() {
        return super.getEventSubject();
    }

    public void onVisibilityChanged(float f, float f2, int i, int i2, UpdateCardModel.CardHolder cardHolder) {
        C5598i0<UpdateCardModel_, UpdateCardModel.CardHolder> i0Var = this.onModelVisibilityChangedListener_epoxyGeneratedModel;
        if (i0Var != null) {
            i0Var.mo19224a(this, cardHolder, f, f2, i, i2);
        }
        super.onVisibilityChanged(f, f2, i, i2, cardHolder);
    }

    public void onVisibilityStateChanged(int i, UpdateCardModel.CardHolder cardHolder) {
        C5600j0<UpdateCardModel_, UpdateCardModel.CardHolder> j0Var = this.onModelVisibilityStateChangedListener_epoxyGeneratedModel;
        if (j0Var != null) {
            j0Var.mo19225a(this, cardHolder, i);
        }
        super.onVisibilityStateChanged(i, cardHolder);
    }

    public UpdateCardModel_ show(boolean z) {
        super.show(z);
        return this;
    }

    public ThemeManager themeManager() {
        return super.getThemeManager();
    }

    public UpdateCardModel_ onVisibilityChanged(C5598i0<UpdateCardModel_, UpdateCardModel.CardHolder> i0Var) {
        onMutation();
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = i0Var;
        return this;
    }

    public UpdateCardModel_ onVisibilityStateChanged(C5600j0<UpdateCardModel_, UpdateCardModel.CardHolder> j0Var) {
        onMutation();
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = j0Var;
        return this;
    }

    /* renamed from: id */
    public UpdateCardModel_ m6296id(long j) {
        super.mo5327id(j);
        return this;
    }

    /* renamed from: id */
    public UpdateCardModel_ m6301id(Number... numberArr) {
        super.mo5332id(numberArr);
        return this;
    }

    /* renamed from: id */
    public UpdateCardModel_ m6297id(long j, long j2) {
        super.mo5328id(j, j2);
        return this;
    }

    /* renamed from: id */
    public UpdateCardModel_ m6298id(CharSequence charSequence) {
        super.mo5329id(charSequence);
        return this;
    }

    /* renamed from: id */
    public UpdateCardModel_ m6300id(CharSequence charSequence, CharSequence... charSequenceArr) {
        super.mo5331id(charSequence, charSequenceArr);
        return this;
    }

    /* renamed from: id */
    public UpdateCardModel_ m6299id(CharSequence charSequence, long j) {
        super.mo5330id(charSequence, j);
        return this;
    }
}
