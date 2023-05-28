package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

@TargetApi(14)
@zzard
public abstract class zzbco extends TextureView implements C4740g8 {

    /* renamed from: f */
    protected final zzbcy f8024f = new zzbcy();

    /* renamed from: g */
    protected final zzbdi f8025g;

    public zzbco(Context context) {
        super(context);
        this.f8025g = new zzbdi(context, this);
    }

    /* renamed from: a */
    public abstract void mo16504a();

    /* renamed from: a */
    public abstract void mo16505a(float f, float f2);

    /* renamed from: a */
    public abstract void mo16506a(zzbcn zzbcn);

    /* renamed from: a */
    public void mo16507a(String str, String[] strArr) {
        setVideoPath(str);
    }

    /* renamed from: b */
    public abstract void mo16508b();

    /* renamed from: b */
    public abstract void mo16509b(int i);

    /* renamed from: c */
    public abstract void mo16510c();

    /* renamed from: c */
    public void mo16511c(int i) {
    }

    /* renamed from: d */
    public abstract void mo16512d();

    /* renamed from: d */
    public void mo16513d(int i) {
    }

    /* renamed from: e */
    public abstract String mo16514e();

    /* renamed from: e */
    public void mo16515e(int i) {
    }

    /* renamed from: f */
    public void mo16516f(int i) {
    }

    /* renamed from: g */
    public void mo16517g(int i) {
    }

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void setVideoPath(String str);
}
