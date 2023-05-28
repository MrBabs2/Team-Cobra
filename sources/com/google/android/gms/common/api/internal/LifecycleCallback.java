package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@KeepForSdk
public class LifecycleCallback {
    @KeepForSdk

    /* renamed from: f */
    protected final LifecycleFragment f13761f;

    @KeepForSdk
    protected LifecycleCallback(LifecycleFragment lifecycleFragment) {
        this.f13761f = lifecycleFragment;
    }

    @KeepForSdk
    /* renamed from: a */
    protected static LifecycleFragment m15504a(LifecycleActivity lifecycleActivity) {
        if (lifecycleActivity.mo25063c()) {
            return zzc.m15902a(lifecycleActivity.mo25062b());
        }
        if (lifecycleActivity.mo25064d()) {
            return zza.m15896a(lifecycleActivity.mo25061a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static LifecycleFragment getChimeraLifecycleFragmentImpl(LifecycleActivity lifecycleActivity) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo25066a(int i, int i2, Intent intent) {
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo25067a(Bundle bundle) {
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo25068a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @KeepForSdk
    /* renamed from: b */
    public void mo25069b() {
    }

    @KeepForSdk
    /* renamed from: b */
    public void mo25070b(Bundle bundle) {
    }

    @KeepForSdk
    /* renamed from: c */
    public void mo25071c() {
    }

    @KeepForSdk
    /* renamed from: d */
    public void mo25072d() {
    }

    @KeepForSdk
    /* renamed from: e */
    public void mo25073e() {
    }

    @KeepForSdk
    /* renamed from: a */
    public Activity mo25065a() {
        return this.f13761f.mo25074a();
    }
}
