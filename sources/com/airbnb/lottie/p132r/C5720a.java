package com.airbnb.lottie.p132r;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.C5645a;
import com.airbnb.lottie.p133s.C5729h;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.airbnb.lottie.r.a */
/* compiled from: FontAssetManager */
public class C5720a {

    /* renamed from: a */
    private final C5729h<String> f10212a = new C5729h<>();

    /* renamed from: b */
    private final Map<C5729h<String>, Typeface> f10213b = new HashMap();

    /* renamed from: c */
    private final Map<String, Typeface> f10214c = new HashMap();

    /* renamed from: d */
    private final AssetManager f10215d;

    /* renamed from: e */
    private C5645a f10216e;

    /* renamed from: f */
    private String f10217f = ".ttf";

    public C5720a(Drawable.Callback callback, C5645a aVar) {
        this.f10216e = aVar;
        if (!(callback instanceof View)) {
            Log.w("LOTTIE", "LottieDrawable must be inside of a view for images to work.");
            this.f10215d = null;
            return;
        }
        this.f10215d = ((View) callback).getContext().getAssets();
    }

    /* renamed from: a */
    public void mo19530a(C5645a aVar) {
        this.f10216e = aVar;
    }

    /* renamed from: a */
    public Typeface mo19529a(String str, String str2) {
        this.f10212a.mo19558a(str, str2);
        Typeface typeface = this.f10213b.get(this.f10212a);
        if (typeface != null) {
            return typeface;
        }
        Typeface a = m11017a(m11018a(str), str2);
        this.f10213b.put(this.f10212a, a);
        return a;
    }

    /* renamed from: a */
    private Typeface m11018a(String str) {
        Typeface typeface = this.f10214c.get(str);
        if (typeface != null) {
            return typeface;
        }
        C5645a aVar = this.f10216e;
        if (aVar != null) {
            aVar.mo19386a(str);
            throw null;
        } else if (aVar != null) {
            aVar.mo19387b(str);
            throw null;
        } else {
            Typeface createFromAsset = Typeface.createFromAsset(this.f10215d, "fonts/" + str + this.f10217f);
            this.f10214c.put(str, createFromAsset);
            return createFromAsset;
        }
    }

    /* renamed from: a */
    private Typeface m11017a(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i = (!contains || !contains2) ? contains ? 2 : contains2 ? 1 : 0 : 3;
        if (typeface.getStyle() == i) {
            return typeface;
        }
        return Typeface.create(typeface, i);
    }
}
