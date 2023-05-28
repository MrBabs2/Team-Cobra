package com.airbnb.epoxy;

import com.airbnb.epoxy.C5629q;
import java.util.List;

/* renamed from: com.airbnb.epoxy.t */
/* compiled from: EpoxyModelWithHolder */
public abstract class C5635t<T extends C5629q> extends C5631s<T> {
    public C5635t() {
    }

    /* access modifiers changed from: protected */
    public abstract T createNewHolder();

    public C5635t(long j) {
        super(j);
    }

    public boolean onFailedToRecycleView(T t) {
        return super.onFailedToRecycleView(t);
    }

    public void onViewAttachedToWindow(T t) {
        super.onViewAttachedToWindow(t);
    }

    public void onViewDetachedFromWindow(T t) {
        super.onViewDetachedFromWindow(t);
    }

    public void onVisibilityChanged(float f, float f2, int i, int i2, T t) {
        super.onVisibilityChanged(f, f2, i, i2, t);
    }

    public void onVisibilityStateChanged(int i, T t) {
        super.onVisibilityStateChanged(i, t);
    }

    public void unbind(T t) {
        super.unbind(t);
    }

    public void bind(T t) {
        super.bind(t);
    }

    public void bind(T t, List<Object> list) {
        super.bind(t, list);
    }

    public void bind(T t, C5631s<?> sVar) {
        super.bind(t, sVar);
    }
}
