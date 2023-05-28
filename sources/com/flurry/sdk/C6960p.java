package com.flurry.sdk;

import android.os.Bundle;

/* renamed from: com.flurry.sdk.p */
public final class C6960p {

    /* renamed from: a */
    public final C6961a f13059a;

    /* renamed from: b */
    public final Bundle f13060b;

    /* renamed from: com.flurry.sdk.p$a */
    public enum C6961a {
        CREATED,
        STARTED,
        RESUMED,
        PAUSED,
        STOPPED,
        DESTROYED,
        SAVE_STATE,
        APP_ORIENTATION_CHANGE,
        APP_BACKGROUND,
        TRIM_MEMORY
    }

    public C6960p(C6961a aVar, Bundle bundle) {
        this.f13059a = aVar;
        this.f13060b = bundle;
    }
}
