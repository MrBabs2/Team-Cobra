package com.airbnb.epoxy;

import com.airbnb.epoxy.C5607n;
import java.util.List;

/* renamed from: com.airbnb.epoxy.f */
/* compiled from: ControllerHelper */
public abstract class C5590f<T extends C5607n> {
    public abstract void resetAutoModels();

    /* access modifiers changed from: protected */
    public void setControllerToStageTo(C5631s<?> sVar, T t) {
        sVar.controllerToStageTo = t;
    }

    /* access modifiers changed from: protected */
    public void validateModelHashCodesHaveNotChanged(T t) {
        List<C5631s<?>> g = t.getAdapter().mo19279g();
        for (int i = 0; i < g.size(); i++) {
            g.get(i).validateStateHasNotChangedSinceAdded("Model has changed since it was added to the controller.", i);
        }
    }
}
