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
import p015cm.aptoide.p016pt.home.apps.list.models.DownloadCardModel;
import p015cm.aptoide.p016pt.home.apps.model.DownloadApp;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.apps.list.models.DownloadCardModel_ */
public class DownloadCardModel_ extends DownloadCardModel implements C5637v<DownloadCardModel.CardHolder>, DownloadCardModelBuilder {
    private C5591f0<DownloadCardModel_, DownloadCardModel.CardHolder> onModelBoundListener_epoxyGeneratedModel;
    private C5596h0<DownloadCardModel_, DownloadCardModel.CardHolder> onModelUnboundListener_epoxyGeneratedModel;
    private C5598i0<DownloadCardModel_, DownloadCardModel.CardHolder> onModelVisibilityChangedListener_epoxyGeneratedModel;
    private C5600j0<DownloadCardModel_, DownloadCardModel.CardHolder> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

    public void addTo(C5607n nVar) {
        super.addTo(nVar);
        addWithDebugValidation(nVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DownloadCardModel_) || !super.equals(obj)) {
            return false;
        }
        DownloadCardModel_ downloadCardModel_ = (DownloadCardModel_) obj;
        if ((this.onModelBoundListener_epoxyGeneratedModel == null) != (downloadCardModel_.onModelBoundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelUnboundListener_epoxyGeneratedModel == null) != (downloadCardModel_.onModelUnboundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (downloadCardModel_.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (downloadCardModel_.onModelVisibilityChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if (getApplication() == null ? downloadCardModel_.getApplication() != null : !getApplication().equals(downloadCardModel_.getApplication())) {
            return false;
        }
        return (getEventSubject() == null) == (downloadCardModel_.getEventSubject() == null);
    }

    /* access modifiers changed from: protected */
    public int getDefaultLayout() {
        return C1086R.layout.apps_download_app_item;
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
        return "DownloadCardModel_{application=" + getApplication() + ", eventSubject=" + getEventSubject() + "}" + super.toString();
    }

    public DownloadCardModel_ application(DownloadApp downloadApp) {
        onMutation();
        super.setApplication(downloadApp);
        return this;
    }

    /* access modifiers changed from: protected */
    public DownloadCardModel.CardHolder createNewHolder() {
        return new DownloadCardModel.CardHolder();
    }

    public DownloadCardModel_ eventSubject(C12871b<AppClick> bVar) {
        onMutation();
        super.setEventSubject(bVar);
        return this;
    }

    public void handlePostBind(DownloadCardModel.CardHolder cardHolder, int i) {
        C5591f0<DownloadCardModel_, DownloadCardModel.CardHolder> f0Var = this.onModelBoundListener_epoxyGeneratedModel;
        if (f0Var != null) {
            f0Var.mo19220a(this, cardHolder, i);
        }
        validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", i);
    }

    public void handlePreBind(C5636u uVar, DownloadCardModel.CardHolder cardHolder, int i) {
        validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", i);
    }

    public DownloadCardModel_ hide() {
        super.hide();
        return this;
    }

    public DownloadCardModel_ onBind(C5591f0<DownloadCardModel_, DownloadCardModel.CardHolder> f0Var) {
        onMutation();
        this.onModelBoundListener_epoxyGeneratedModel = f0Var;
        return this;
    }

    public DownloadCardModel_ onUnbind(C5596h0<DownloadCardModel_, DownloadCardModel.CardHolder> h0Var) {
        onMutation();
        this.onModelUnboundListener_epoxyGeneratedModel = h0Var;
        return this;
    }

    public DownloadCardModel_ reset() {
        this.onModelBoundListener_epoxyGeneratedModel = null;
        this.onModelUnboundListener_epoxyGeneratedModel = null;
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = null;
        super.setApplication((DownloadApp) null);
        super.setEventSubject((C12871b<AppClick>) null);
        super.reset();
        return this;
    }

    public DownloadCardModel_ layout(int i) {
        super.layout(i);
        return this;
    }

    public DownloadCardModel_ show() {
        super.show();
        return this;
    }

    public DownloadCardModel_ spanSizeOverride(C5631s.C5634c cVar) {
        super.spanSizeOverride(cVar);
        return this;
    }

    public void unbind(DownloadCardModel.CardHolder cardHolder) {
        super.unbind(cardHolder);
        C5596h0<DownloadCardModel_, DownloadCardModel.CardHolder> h0Var = this.onModelUnboundListener_epoxyGeneratedModel;
        if (h0Var != null) {
            h0Var.mo19223a(this, cardHolder);
        }
    }

    public DownloadApp application() {
        return super.getApplication();
    }

    public C12871b<AppClick> eventSubject() {
        return super.getEventSubject();
    }

    public void onVisibilityChanged(float f, float f2, int i, int i2, DownloadCardModel.CardHolder cardHolder) {
        C5598i0<DownloadCardModel_, DownloadCardModel.CardHolder> i0Var = this.onModelVisibilityChangedListener_epoxyGeneratedModel;
        if (i0Var != null) {
            i0Var.mo19224a(this, cardHolder, f, f2, i, i2);
        }
        super.onVisibilityChanged(f, f2, i, i2, cardHolder);
    }

    public void onVisibilityStateChanged(int i, DownloadCardModel.CardHolder cardHolder) {
        C5600j0<DownloadCardModel_, DownloadCardModel.CardHolder> j0Var = this.onModelVisibilityStateChangedListener_epoxyGeneratedModel;
        if (j0Var != null) {
            j0Var.mo19225a(this, cardHolder, i);
        }
        super.onVisibilityStateChanged(i, cardHolder);
    }

    public DownloadCardModel_ show(boolean z) {
        super.show(z);
        return this;
    }

    public DownloadCardModel_ onVisibilityChanged(C5598i0<DownloadCardModel_, DownloadCardModel.CardHolder> i0Var) {
        onMutation();
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = i0Var;
        return this;
    }

    public DownloadCardModel_ onVisibilityStateChanged(C5600j0<DownloadCardModel_, DownloadCardModel.CardHolder> j0Var) {
        onMutation();
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = j0Var;
        return this;
    }

    /* renamed from: id */
    public DownloadCardModel_ m6224id(long j) {
        super.mo5327id(j);
        return this;
    }

    /* renamed from: id */
    public DownloadCardModel_ m6229id(Number... numberArr) {
        super.mo5332id(numberArr);
        return this;
    }

    /* renamed from: id */
    public DownloadCardModel_ m6225id(long j, long j2) {
        super.mo5328id(j, j2);
        return this;
    }

    /* renamed from: id */
    public DownloadCardModel_ m6226id(CharSequence charSequence) {
        super.mo5329id(charSequence);
        return this;
    }

    /* renamed from: id */
    public DownloadCardModel_ m6228id(CharSequence charSequence, CharSequence... charSequenceArr) {
        super.mo5331id(charSequence, charSequenceArr);
        return this;
    }

    /* renamed from: id */
    public DownloadCardModel_ m6227id(CharSequence charSequence, long j) {
        super.mo5330id(charSequence, j);
        return this;
    }
}
