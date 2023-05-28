package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.AdChoicesView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.internal.cache.DiskLruCache;

public final class zzbzl {

    /* renamed from: a */
    private final Context f19784a;

    /* renamed from: b */
    private final zzaxb f19785b;

    /* renamed from: c */
    private final zzcxv f19786c;

    /* renamed from: d */
    private final zzbyx f19787d;

    /* renamed from: e */
    private final zzbyt f19788e;

    /* renamed from: f */
    private final zzbzt f19789f;

    /* renamed from: g */
    private final Executor f19790g;

    /* renamed from: h */
    private final Executor f19791h;

    /* renamed from: i */
    private final zzady f19792i;

    public zzbzl(Context context, zzaxb zzaxb, zzcxv zzcxv, zzbyx zzbyx, zzbyt zzbyt, zzbzt zzbzt, Executor executor, Executor executor2) {
        this.f19784a = context;
        this.f19785b = zzaxb;
        this.f19786c = zzcxv;
        this.f19792i = zzcxv.f21172i;
        this.f19787d = zzbyx;
        this.f19788e = zzbyt;
        this.f19789f = zzbzt;
        this.f19790g = executor;
        this.f19791h = executor2;
    }

    /* renamed from: a */
    public final void mo28599a(zzcab zzcab) {
        this.f19790g.execute(new C8211zf(this, zzcab));
    }

    /* renamed from: b */
    public final void mo28602b(zzcab zzcab) {
        if (zzcab != null && this.f19789f != null && zzcab.mo28587m0() != null) {
            try {
                zzcab.mo28587m0().addView(this.f19789f.mo28608a());
            } catch (zzbhj e) {
                zzawz.m20168e("web view can not be obtained", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo28603c(zzcab zzcab) {
        ViewGroup viewGroup;
        View view;
        ViewGroup viewGroup2;
        Drawable drawable;
        zzaei zzaei = null;
        if (this.f19787d.mo28562c() || this.f19787d.mo28561b()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW};
            int i = 0;
            while (true) {
                if (i < 2) {
                    View m = zzcab.mo28586m(strArr[i]);
                    if (m != null && (m instanceof ViewGroup)) {
                        viewGroup = (ViewGroup) m;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        viewGroup = null;
        boolean z = viewGroup != null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (this.f19788e.mo28548o() != null) {
            view = this.f19788e.mo28548o();
            zzady zzady = this.f19792i;
            if (zzady != null && !z) {
                m22225a(layoutParams, zzady.f18046j);
                view.setLayoutParams(layoutParams);
            }
        } else if (!(this.f19788e.mo28557x() instanceof zzadt)) {
            view = null;
        } else {
            zzadt zzadt = (zzadt) this.f19788e.mo28557x();
            if (!z) {
                m22225a(layoutParams, zzadt.mo27200u1());
            }
            zzadu zzadu = new zzadu(this.f19784a, zzadt, layoutParams);
            zzadu.setContentDescription((CharSequence) zzyt.m25670e().mo27163a(zzacu.f17799G1));
            view = zzadu;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (z) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                AdChoicesView adChoicesView = new AdChoicesView(zzcab.mo28585h0().getContext());
                adChoicesView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                adChoicesView.addView(view);
                FrameLayout m0 = zzcab.mo28587m0();
                if (m0 != null) {
                    m0.addView(adChoicesView);
                }
            }
            zzcab.mo28584a(zzcab.mo28583U0(), view, true);
        }
        if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17901e3)).booleanValue()) {
            mo28602b(zzcab);
        }
        String[] strArr2 = zzbzj.f19774o;
        int length = strArr2.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                viewGroup2 = null;
                break;
            }
            View m2 = zzcab.mo28586m(strArr2[i2]);
            if (m2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) m2;
                break;
            }
            i2++;
        }
        this.f19791h.execute(new C7284ag(this, viewGroup2));
        if (viewGroup2 == null) {
            return;
        }
        if (!mo28600a(viewGroup2)) {
            viewGroup2.removeAllViews();
            View h0 = zzcab.mo28585h0();
            Context context = h0 != null ? h0.getContext() : null;
            if (context != null && this.f19788e.mo28541h() != null && !this.f19788e.mo28541h().isEmpty()) {
                zzadw zzadw = this.f19788e.mo28541h().get(0);
                if (zzadw instanceof IBinder) {
                    zzaei = zzaej.m19049a(zzadw);
                }
                if (zzaei != null) {
                    try {
                        IObjectWrapper D0 = zzaei.mo27203D0();
                        if (D0 != null && (drawable = (Drawable) ObjectWrapper.m16390H(D0)) != null) {
                            ImageView imageView = new ImageView(context);
                            imageView.setImageDrawable(drawable);
                            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            viewGroup2.addView(imageView);
                        }
                    } catch (RemoteException unused) {
                        zzbad.m20523d("Could not get drawable from image");
                    }
                }
            }
        } else if (this.f19788e.mo28551r() != null) {
            this.f19788e.mo28551r().mo25656a((zzadx) new C7321bg(this, zzcab, viewGroup2));
        }
    }

    /* renamed from: a */
    private static void m22225a(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo28601b(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        if (this.f19788e.mo28550q() == null) {
            return;
        }
        if (2 == this.f19788e.mo28547n() || 1 == this.f19788e.mo28547n()) {
            this.f19785b.mo27770a(this.f19786c.f21169f, String.valueOf(this.f19788e.mo28547n()), z);
        } else if (6 == this.f19788e.mo28547n()) {
            this.f19785b.mo27770a(this.f19786c.f21169f, "2", z);
            this.f19785b.mo27770a(this.f19786c.f21169f, DiskLruCache.VERSION_1, z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static boolean m22227a(zzcab zzcab, String[] strArr) {
        Map<String, WeakReference<View>> u0 = zzcab.mo28593u0();
        if (u0 == null) {
            return false;
        }
        for (String str : strArr) {
            if (u0.get(str) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo28600a(ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        View q = this.f19788e.mo28550q();
        if (q == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (q.getParent() instanceof ViewGroup) {
            ((ViewGroup) q.getParent()).removeView(q);
        }
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17807I1)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(q, layoutParams);
        return true;
    }
}
