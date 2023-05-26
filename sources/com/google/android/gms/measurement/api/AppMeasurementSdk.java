package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzea;
import com.google.android.gms.measurement.internal.zzcx;
import com.google.android.gms.measurement.internal.zzcy;
import java.util.List;
import java.util.Map;

@KeepForSdk
public class AppMeasurementSdk {

    /* renamed from: a */
    private final zzea f23655a;

    @KeepForSdk
    public static final class ConditionalUserProperty {
        private ConditionalUserProperty() {
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public interface EventInterceptor extends zzcx {
    }

    @ShowFirstParty
    @KeepForSdk
    public interface OnEventListener extends zzcy {
    }

    public AppMeasurementSdk(zzea zzea) {
        this.f23655a = zzea;
    }

    @KeepForSdk
    /* renamed from: a */
    public static AppMeasurementSdk m26833a(Context context, String str, String str2, String str3, Bundle bundle) {
        return zzea.m26458a(context, str, str2, str3, bundle).mo30348f();
    }

    @KeepForSdk
    /* renamed from: b */
    public void mo30642b(String str, String str2, Bundle bundle) {
        this.f23655a.mo30343b(str, str2, bundle);
    }

    @KeepForSdk
    /* renamed from: c */
    public void mo30645c(Bundle bundle) {
        this.f23655a.mo30337a(bundle);
    }

    @KeepForSdk
    /* renamed from: d */
    public String mo30646d() {
        return this.f23655a.mo30345c();
    }

    @KeepForSdk
    /* renamed from: e */
    public String mo30647e() {
        return this.f23655a.mo30346d();
    }

    @KeepForSdk
    /* renamed from: f */
    public String mo30648f() {
        return this.f23655a.mo30347e();
    }

    @KeepForSdk
    /* renamed from: b */
    public void mo30641b(String str) {
        this.f23655a.mo30342b(str);
    }

    @KeepForSdk
    /* renamed from: c */
    public String mo30644c() {
        return this.f23655a.mo30349g();
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo30638a(String str, String str2, Object obj) {
        this.f23655a.mo30340a(str, str2, obj, true);
    }

    @KeepForSdk
    /* renamed from: b */
    public Bundle mo30639b(Bundle bundle) {
        return this.f23655a.mo30331a(bundle, true);
    }

    @KeepForSdk
    /* renamed from: c */
    public int mo30643c(String str) {
        return this.f23655a.mo30344c(str);
    }

    @KeepForSdk
    /* renamed from: b */
    public String mo30640b() {
        return this.f23655a.mo30341b();
    }

    @KeepForSdk
    /* renamed from: a */
    public Map<String, Object> mo30633a(String str, String str2, boolean z) {
        return this.f23655a.mo30334a(str, str2, z);
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo30637a(String str, String str2, Bundle bundle) {
        this.f23655a.mo30339a(str, str2, bundle);
    }

    @KeepForSdk
    /* renamed from: a */
    public List<Bundle> mo30632a(String str, String str2) {
        return this.f23655a.mo30333a(str, str2);
    }

    @KeepForSdk
    /* renamed from: a */
    public long mo30631a() {
        return this.f23655a.mo30330a();
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo30636a(String str) {
        this.f23655a.mo30338a(str);
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo30635a(Bundle bundle) {
        this.f23655a.mo30331a(bundle, false);
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo30634a(Activity activity, String str, String str2) {
        this.f23655a.mo30336a(activity, str, str2);
    }
}
