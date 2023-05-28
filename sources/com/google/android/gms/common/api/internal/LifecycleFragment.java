package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public interface LifecycleFragment {
    @KeepForSdk
    /* renamed from: a */
    Activity mo25074a();

    @KeepForSdk
    /* renamed from: a */
    <T extends LifecycleCallback> T mo25075a(String str, Class<T> cls);

    @KeepForSdk
    /* renamed from: a */
    void mo25076a(String str, LifecycleCallback lifecycleCallback);

    @KeepForSdk
    void startActivityForResult(Intent intent, int i);
}
