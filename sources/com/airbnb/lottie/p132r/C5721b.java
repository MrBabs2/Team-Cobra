package com.airbnb.lottie.p132r;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.C5646b;
import com.airbnb.lottie.C5667g;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.airbnb.lottie.r.b */
/* compiled from: ImageAssetManager */
public class C5721b {

    /* renamed from: e */
    private static final Object f10218e = new Object();

    /* renamed from: a */
    private final Context f10219a;

    /* renamed from: b */
    private String f10220b;

    /* renamed from: c */
    private C5646b f10221c;

    /* renamed from: d */
    private final Map<String, C5667g> f10222d;

    public C5721b(Drawable.Callback callback, String str, C5646b bVar, Map<String, C5667g> map) {
        this.f10220b = str;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f10220b;
            if (str2.charAt(str2.length() - 1) != '/') {
                this.f10220b += '/';
            }
        }
        if (!(callback instanceof View)) {
            Log.w("LOTTIE", "LottieDrawable must be inside of a view for images to work.");
            this.f10222d = new HashMap();
            this.f10219a = null;
            return;
        }
        this.f10219a = ((View) callback).getContext();
        this.f10222d = map;
        mo19533a(bVar);
    }

    /* renamed from: a */
    public void mo19533a(C5646b bVar) {
        this.f10221c = bVar;
    }

    /* renamed from: a */
    public Bitmap mo19531a(String str) {
        C5667g gVar = this.f10222d.get(str);
        if (gVar == null) {
            return null;
        }
        Bitmap a = gVar.mo19469a();
        if (a != null) {
            return a;
        }
        C5646b bVar = this.f10221c;
        if (bVar != null) {
            Bitmap a2 = bVar.mo19388a(gVar);
            if (a2 != null) {
                m11021a(str, a2);
            }
            return a2;
        }
        String b = gVar.mo19471b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!b.startsWith("data:") || b.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(this.f10220b)) {
                    AssetManager assets = this.f10219a.getAssets();
                    Bitmap decodeStream = BitmapFactory.decodeStream(assets.open(this.f10220b + b), (Rect) null, options);
                    m11021a(str, decodeStream);
                    return decodeStream;
                }
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            } catch (IOException e) {
                Log.w("LOTTIE", "Unable to open asset.", e);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(b.substring(b.indexOf(44) + 1), 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                m11021a(str, decodeByteArray);
                return decodeByteArray;
            } catch (IllegalArgumentException e2) {
                Log.w("LOTTIE", "data URL did not have correct base64 format.", e2);
                return null;
            }
        }
    }

    /* renamed from: a */
    public void mo19532a() {
        synchronized (f10218e) {
            for (Map.Entry<String, C5667g> value : this.f10222d.entrySet()) {
                C5667g gVar = (C5667g) value.getValue();
                Bitmap a = gVar.mo19469a();
                if (a != null) {
                    a.recycle();
                    gVar.mo19470a((Bitmap) null);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo19534a(Context context) {
        return (context == null && this.f10219a == null) || this.f10219a.equals(context);
    }

    /* renamed from: a */
    private Bitmap m11021a(String str, Bitmap bitmap) {
        synchronized (f10218e) {
            this.f10222d.get(str).mo19470a(bitmap);
        }
        return bitmap;
    }
}
