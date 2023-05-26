package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.GmsClientEventManager;

/* renamed from: com.google.android.gms.common.api.internal.q */
final class C7198q implements GmsClientEventManager.GmsClientEventState {

    /* renamed from: a */
    private final /* synthetic */ zaaw f13823a;

    C7198q(zaaw zaaw) {
        this.f13823a = zaaw;
    }

    public final Bundle getConnectionHint() {
        return null;
    }

    public final boolean isConnected() {
        return this.f13823a.mo25161j();
    }
}
