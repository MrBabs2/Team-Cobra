package com.airbnb.epoxy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.epoxy.C5607n;
import java.util.List;

/* renamed from: com.airbnb.epoxy.s */
/* compiled from: EpoxyModel */
public abstract class C5631s<T> {
    private static long idCounter = -1;
    boolean addedToAdapter;
    C5607n controllerToStageTo;
    /* access modifiers changed from: private */
    public boolean currentlyInInterceptors;
    private C5607n firstControllerAddedTo;
    private boolean hasDefaultId;
    /* access modifiers changed from: private */
    public int hashCodeWhenAdded;

    /* renamed from: id */
    private long f9929id;
    private int layout;
    private boolean shown;
    private C5634c spanSizeOverride;

    /* renamed from: com.airbnb.epoxy.s$a */
    /* compiled from: EpoxyModel */
    class C5632a implements C5607n.C5613f {
        C5632a() {
        }

        /* renamed from: a */
        public void mo19272a(C5607n nVar) {
            boolean unused = C5631s.this.currentlyInInterceptors = true;
        }

        /* renamed from: b */
        public void mo19273b(C5607n nVar) {
            C5631s sVar = C5631s.this;
            int unused = sVar.hashCodeWhenAdded = sVar.hashCode();
            boolean unused2 = C5631s.this.currentlyInInterceptors = false;
        }
    }

    /* renamed from: com.airbnb.epoxy.s$b */
    /* compiled from: EpoxyModel */
    public interface C5633b {
        /* renamed from: a */
        boolean mo19321a();
    }

    /* renamed from: com.airbnb.epoxy.s$c */
    /* compiled from: EpoxyModel */
    public interface C5634c {
        /* renamed from: a */
        int mo19322a(int i, int i2, int i3);
    }

    protected C5631s(long j) {
        this.shown = true;
        mo5327id(j);
    }

    private static int getPosition(C5607n nVar, C5631s<?> sVar) {
        if (nVar.isBuildingModels()) {
            return nVar.getFirstIndexOfModelInBuildingList(sVar);
        }
        return nVar.getAdapter().mo19274a(sVar);
    }

    public void addIf(boolean z, C5607n nVar) {
        if (z) {
            addTo(nVar);
            return;
        }
        C5607n nVar2 = this.controllerToStageTo;
        if (nVar2 != null) {
            nVar2.clearModelFromStaging(this);
            this.controllerToStageTo = null;
        }
    }

    public void addTo(C5607n nVar) {
        nVar.addInternal(this);
    }

    /* access modifiers changed from: protected */
    public final void addWithDebugValidation(C5607n nVar) {
        if (nVar == null) {
            throw new IllegalArgumentException("Controller cannot be null");
        } else if (nVar.isModelAddedMultipleTimes(this)) {
            throw new IllegalEpoxyUsage("This model was already added to the controller at position " + nVar.getFirstIndexOfModelInBuildingList(this));
        } else if (this.firstControllerAddedTo == null) {
            this.firstControllerAddedTo = nVar;
            this.hashCodeWhenAdded = hashCode();
            nVar.addAfterInterceptorCallback(new C5632a());
        }
    }

    public void bind(T t) {
    }

    public void bind(T t, List<Object> list) {
        bind(t);
    }

    /* access modifiers changed from: protected */
    public View buildView(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(getLayout(), viewGroup, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5631s)) {
            return false;
        }
        C5631s sVar = (C5631s) obj;
        if (this.f9929id == sVar.f9929id && getViewType() == sVar.getViewType() && this.shown == sVar.shown) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract int getDefaultLayout();

    public final int getLayout() {
        int i = this.layout;
        return i == 0 ? getDefaultLayout() : i;
    }

    public int getSpanSize(int i, int i2, int i3) {
        return 1;
    }

    /* access modifiers changed from: protected */
    public int getViewType() {
        return getLayout();
    }

    /* access modifiers changed from: package-private */
    public boolean hasDefaultId() {
        return this.hasDefaultId;
    }

    public int hashCode() {
        long j = this.f9929id;
        return (((((int) (j ^ (j >>> 32))) * 31) + getViewType()) * 31) + (this.shown ? 1 : 0);
    }

    public C5631s<T> hide() {
        return show(false);
    }

    /* renamed from: id */
    public long mo19311id() {
        return this.f9929id;
    }

    /* access modifiers changed from: package-private */
    public boolean isDebugValidationEnabled() {
        return this.firstControllerAddedTo != null;
    }

    public boolean isShown() {
        return this.shown;
    }

    public C5631s<T> layout(int i) {
        onMutation();
        this.layout = i;
        return this;
    }

    public boolean onFailedToRecycleView(T t) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onMutation() {
        if (!isDebugValidationEnabled() || this.currentlyInInterceptors) {
            C5607n nVar = this.controllerToStageTo;
            if (nVar != null) {
                nVar.setStagedModel(this);
                return;
            }
            return;
        }
        throw new C5641z(this, getPosition(this.firstControllerAddedTo, this));
    }

    public void onViewAttachedToWindow(T t) {
    }

    public void onViewDetachedFromWindow(T t) {
    }

    public void onVisibilityChanged(float f, float f2, int i, int i2, T t) {
    }

    public void onVisibilityStateChanged(int i, T t) {
    }

    public C5631s<T> reset() {
        onMutation();
        this.layout = 0;
        this.shown = true;
        return this;
    }

    public boolean shouldSaveViewState() {
        return false;
    }

    public C5631s<T> show() {
        return show(true);
    }

    public final int spanSize(int i, int i2, int i3) {
        C5634c cVar = this.spanSizeOverride;
        if (cVar != null) {
            return cVar.mo19322a(i, i2, i3);
        }
        return getSpanSize(i, i2, i3);
    }

    public C5631s<T> spanSizeOverride(C5634c cVar) {
        this.spanSizeOverride = cVar;
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + "{id=" + this.f9929id + ", viewType=" + getViewType() + ", shown=" + this.shown + ", addedToAdapter=" + this.addedToAdapter + '}';
    }

    public void unbind(T t) {
    }

    /* access modifiers changed from: protected */
    public final void validateStateHasNotChangedSinceAdded(String str, int i) {
        if (isDebugValidationEnabled() && !this.currentlyInInterceptors && this.hashCodeWhenAdded != hashCode()) {
            throw new C5641z(this, str, i);
        }
    }

    public void bind(T t, C5631s<?> sVar) {
        bind(t);
    }

    /* renamed from: id */
    public C5631s<T> mo5327id(long j) {
        if ((this.addedToAdapter || this.firstControllerAddedTo != null) && j != this.f9929id) {
            throw new IllegalEpoxyUsage("Cannot change a model's id after it has been added to the adapter.");
        }
        this.hasDefaultId = false;
        this.f9929id = j;
        return this;
    }

    public C5631s<T> show(boolean z) {
        onMutation();
        this.shown = z;
        return this;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5631s() {
        /*
            r4 = this;
            long r0 = idCounter
            r2 = 1
            long r2 = r0 - r2
            idCounter = r2
            r4.<init>(r0)
            r0 = 1
            r4.hasDefaultId = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.C5631s.<init>():void");
    }

    public void addIf(C5633b bVar, C5607n nVar) {
        addIf(bVar.mo19321a(), nVar);
    }

    /* renamed from: id */
    public C5631s<T> mo5332id(Number... numberArr) {
        long j;
        long j2 = 0;
        if (numberArr != null) {
            long j3 = 0;
            for (Number number : numberArr) {
                long j4 = j3 * 31;
                if (number == null) {
                    j = 0;
                } else {
                    j = (long) number.hashCode();
                }
                j3 = j4 + C5640y.m10729a(j);
            }
            j2 = j3;
        }
        return mo5327id(j2);
    }

    /* renamed from: id */
    public C5631s<T> mo5328id(long j, long j2) {
        return mo5327id((C5640y.m10729a(j) * 31) + C5640y.m10729a(j2));
    }

    /* renamed from: id */
    public C5631s<T> mo5329id(CharSequence charSequence) {
        mo5327id(C5640y.m10730a(charSequence));
        return this;
    }

    /* renamed from: id */
    public C5631s<T> mo5331id(CharSequence charSequence, CharSequence... charSequenceArr) {
        long a = C5640y.m10730a(charSequence);
        if (charSequenceArr != null) {
            for (CharSequence a2 : charSequenceArr) {
                a = (a * 31) + C5640y.m10730a(a2);
            }
        }
        return mo5327id(a);
    }

    /* renamed from: id */
    public C5631s<T> mo5330id(CharSequence charSequence, long j) {
        mo5327id((C5640y.m10730a(charSequence) * 31) + C5640y.m10729a(j));
        return this;
    }
}
