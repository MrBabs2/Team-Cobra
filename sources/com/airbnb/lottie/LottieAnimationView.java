package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.JsonReader;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.p133s.C5726e;
import com.airbnb.lottie.p140w.C5832c;
import java.io.StringReader;
import java.util.HashSet;
import java.util.Set;

public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: s */
    private static final String f9935s = LottieAnimationView.class.getSimpleName();

    /* renamed from: h */
    private final C5668h<C5648d> f9936h = new C5643a();

    /* renamed from: i */
    private final C5668h<Throwable> f9937i = new C5644b();

    /* renamed from: j */
    private final C5656f f9938j = new C5656f();

    /* renamed from: k */
    private String f9939k;

    /* renamed from: l */
    private int f9940l;

    /* renamed from: m */
    private boolean f9941m = false;

    /* renamed from: n */
    private boolean f9942n = false;

    /* renamed from: o */
    private boolean f9943o = false;

    /* renamed from: p */
    private Set<C5669i> f9944p = new HashSet();

    /* renamed from: q */
    private C5672l<C5648d> f9945q;

    /* renamed from: r */
    private C5648d f9946r;

    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C5642a();

        /* renamed from: f */
        String f9947f;

        /* renamed from: g */
        int f9948g;

        /* renamed from: h */
        float f9949h;

        /* renamed from: i */
        boolean f9950i;

        /* renamed from: j */
        String f9951j;

        /* renamed from: k */
        int f9952k;

        /* renamed from: l */
        int f9953l;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$SavedState$a */
        static class C5642a implements Parcelable.Creator<SavedState> {
            C5642a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (C5643a) null);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, C5643a aVar) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f9947f);
            parcel.writeFloat(this.f9949h);
            parcel.writeInt(this.f9950i ? 1 : 0);
            parcel.writeString(this.f9951j);
            parcel.writeInt(this.f9952k);
            parcel.writeInt(this.f9953l);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f9947f = parcel.readString();
            this.f9949h = parcel.readFloat();
            this.f9950i = parcel.readInt() != 1 ? false : true;
            this.f9951j = parcel.readString();
            this.f9952k = parcel.readInt();
            this.f9953l = parcel.readInt();
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$a */
    class C5643a implements C5668h<C5648d> {
        C5643a() {
        }

        /* renamed from: a */
        public void mo19384a(C5648d dVar) {
            LottieAnimationView.this.setComposition(dVar);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$b */
    class C5644b implements C5668h<Throwable> {
        C5644b() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo19384a(Object obj) {
            mo19385a((Throwable) obj);
            throw null;
        }

        /* renamed from: a */
        public void mo19385a(Throwable th) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        m10733a((AttributeSet) null);
    }

    /* renamed from: a */
    private void m10733a(AttributeSet attributeSet) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5678n.LottieAnimationView);
        if (!isInEditMode()) {
            boolean hasValue = obtainStyledAttributes.hasValue(C5678n.LottieAnimationView_lottie_rawRes);
            boolean hasValue2 = obtainStyledAttributes.hasValue(C5678n.LottieAnimationView_lottie_fileName);
            boolean hasValue3 = obtainStyledAttributes.hasValue(C5678n.LottieAnimationView_lottie_url);
            if (hasValue && hasValue2) {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            } else if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(C5678n.LottieAnimationView_lottie_rawRes, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(C5678n.LottieAnimationView_lottie_fileName);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(C5678n.LottieAnimationView_lottie_url)) != null) {
                setAnimationFromUrl(string);
            }
        }
        if (obtainStyledAttributes.getBoolean(C5678n.LottieAnimationView_lottie_autoPlay, false)) {
            this.f9941m = true;
            this.f9942n = true;
        }
        if (obtainStyledAttributes.getBoolean(C5678n.LottieAnimationView_lottie_loop, false)) {
            this.f9938j.mo19434d(-1);
        }
        if (obtainStyledAttributes.hasValue(C5678n.LottieAnimationView_lottie_repeatMode)) {
            setRepeatMode(obtainStyledAttributes.getInt(C5678n.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (obtainStyledAttributes.hasValue(C5678n.LottieAnimationView_lottie_repeatCount)) {
            setRepeatCount(obtainStyledAttributes.getInt(C5678n.LottieAnimationView_lottie_repeatCount, -1));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(C5678n.LottieAnimationView_lottie_imageAssetsFolder));
        setProgress(obtainStyledAttributes.getFloat(C5678n.LottieAnimationView_lottie_progress, 0.0f));
        mo19336a(obtainStyledAttributes.getBoolean(C5678n.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        if (obtainStyledAttributes.hasValue(C5678n.LottieAnimationView_lottie_colorFilter)) {
            C5679o oVar = new C5679o(obtainStyledAttributes.getColor(C5678n.LottieAnimationView_lottie_colorFilter, 0));
            mo19334a(new C5726e("**"), C5670j.f10045x, new C5832c(oVar));
        }
        if (obtainStyledAttributes.hasValue(C5678n.LottieAnimationView_lottie_scale)) {
            this.f9938j.mo19433d(obtainStyledAttributes.getFloat(C5678n.LottieAnimationView_lottie_scale, 1.0f));
        }
        obtainStyledAttributes.recycle();
        m10736i();
    }

    /* renamed from: g */
    private void m10734g() {
        C5672l<C5648d> lVar = this.f9945q;
        if (lVar != null) {
            lVar.mo19481d(this.f9936h);
            this.f9945q.mo19480c(this.f9937i);
        }
    }

    /* renamed from: h */
    private void m10735h() {
        this.f9946r = null;
        this.f9938j.mo19424b();
    }

    /* renamed from: i */
    private void m10736i() {
        int i = 1;
        if (this.f9943o && this.f9938j.mo19457q()) {
            i = 2;
        }
        setLayerType(i, (Paint) null);
    }

    private void setCompositionTask(C5672l<C5648d> lVar) {
        m10735h();
        m10734g();
        lVar.mo19479b(this.f9936h);
        lVar.mo19478a(this.f9937i);
        this.f9945q = lVar;
    }

    @Deprecated
    /* renamed from: b */
    public void mo19337b(boolean z) {
        this.f9938j.mo19434d(z ? -1 : 0);
    }

    /* renamed from: c */
    public void mo19338c() {
        this.f9938j.mo19415a();
        m10736i();
    }

    /* renamed from: d */
    public boolean mo19339d() {
        return this.f9938j.mo19457q();
    }

    /* renamed from: e */
    public void mo19340e() {
        this.f9938j.mo19458r();
        m10736i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo19341f() {
        this.f9938j.mo19459s();
    }

    public C5648d getComposition() {
        return this.f9946r;
    }

    public long getDuration() {
        C5648d dVar = this.f9946r;
        if (dVar != null) {
            return (long) dVar.mo19396c();
        }
        return 0;
    }

    public int getFrame() {
        return this.f9938j.mo19439f();
    }

    public String getImageAssetsFolder() {
        return this.f9938j.mo19440g();
    }

    public float getMaxFrame() {
        return this.f9938j.mo19445h();
    }

    public float getMinFrame() {
        return this.f9938j.mo19446i();
    }

    public C5675m getPerformanceTracker() {
        return this.f9938j.mo19450j();
    }

    public float getProgress() {
        return this.f9938j.mo19451k();
    }

    public int getRepeatCount() {
        return this.f9938j.mo19452l();
    }

    public int getRepeatMode() {
        return this.f9938j.mo19453m();
    }

    public float getScale() {
        return this.f9938j.mo19454n();
    }

    public float getSpeed() {
        return this.f9938j.mo19455o();
    }

    public boolean getUseHardwareAcceleration() {
        return this.f9943o;
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C5656f fVar = this.f9938j;
        if (drawable2 == fVar) {
            super.invalidateDrawable(fVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9942n && this.f9941m) {
            mo19340e();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (mo19339d()) {
            mo19338c();
            this.f9941m = true;
        }
        mo19341f();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.f9947f;
        this.f9939k = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f9939k);
        }
        int i = savedState.f9948g;
        this.f9940l = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(savedState.f9949h);
        if (savedState.f9950i) {
            mo19340e();
        }
        this.f9938j.mo19427b(savedState.f9951j);
        setRepeatMode(savedState.f9952k);
        setRepeatCount(savedState.f9953l);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9947f = this.f9939k;
        savedState.f9948g = this.f9940l;
        savedState.f9949h = this.f9938j.mo19451k();
        savedState.f9950i = this.f9938j.mo19457q();
        savedState.f9951j = this.f9938j.mo19440g();
        savedState.f9952k = this.f9938j.mo19453m();
        savedState.f9953l = this.f9938j.mo19452l();
        return savedState;
    }

    public void setAnimation(int i) {
        this.f9940l = i;
        this.f9939k = null;
        setCompositionTask(C5649e.m10777a(getContext(), i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        mo19335a(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(C5649e.m10787c(getContext(), str));
    }

    public void setComposition(C5648d dVar) {
        if (C5647c.f9956a) {
            String str = f9935s;
            Log.v(str, "Set Composition \n" + dVar);
        }
        this.f9938j.setCallback(this);
        this.f9946r = dVar;
        boolean a = this.f9938j.mo19423a(dVar);
        m10736i();
        if (getDrawable() != this.f9938j || a) {
            setImageDrawable((Drawable) null);
            setImageDrawable(this.f9938j);
            requestLayout();
            for (C5669i a2 : this.f9944p) {
                a2.mo19473a(dVar);
            }
        }
    }

    public void setFontAssetDelegate(C5645a aVar) {
        this.f9938j.mo19418a(aVar);
    }

    public void setFrame(int i) {
        this.f9938j.mo19417a(i);
    }

    public void setImageAssetDelegate(C5646b bVar) {
        this.f9938j.mo19419a(bVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f9938j.mo19427b(str);
    }

    public void setImageBitmap(Bitmap bitmap) {
        mo19341f();
        m10734g();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        m10732a(drawable, true);
    }

    public void setImageResource(int i) {
        mo19341f();
        m10734g();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.f9938j.mo19426b(i);
    }

    public void setMaxProgress(float f) {
        this.f9938j.mo19416a(f);
    }

    public void setMinFrame(int i) {
        this.f9938j.mo19430c(i);
    }

    public void setMinProgress(float f) {
        this.f9938j.mo19425b(f);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f9938j.mo19428b(z);
    }

    public void setProgress(float f) {
        this.f9938j.mo19429c(f);
    }

    public void setRepeatCount(int i) {
        this.f9938j.mo19434d(i);
    }

    public void setRepeatMode(int i) {
        this.f9938j.mo19438e(i);
    }

    public void setScale(float f) {
        this.f9938j.mo19433d(f);
        if (getDrawable() == this.f9938j) {
            m10732a((Drawable) null, false);
            m10732a((Drawable) this.f9938j, false);
        }
    }

    public void setSpeed(float f) {
        this.f9938j.mo19437e(f);
    }

    public void setTextDelegate(C5680p pVar) {
        this.f9938j.mo19420a(pVar);
    }

    public void setAnimation(String str) {
        this.f9939k = str;
        this.f9940l = 0;
        setCompositionTask(C5649e.m10778a(getContext(), str));
    }

    /* renamed from: a */
    private void m10732a(Drawable drawable, boolean z) {
        if (z && drawable != this.f9938j) {
            mo19341f();
        }
        m10734g();
        super.setImageDrawable(drawable);
    }

    /* renamed from: a */
    public void mo19336a(boolean z) {
        this.f9938j.mo19422a(z);
    }

    /* renamed from: a */
    public void mo19335a(String str, String str2) {
        mo19333a(new JsonReader(new StringReader(str)), str2);
    }

    /* renamed from: a */
    public void mo19333a(JsonReader jsonReader, String str) {
        setCompositionTask(C5649e.m10779a(jsonReader, str));
    }

    /* renamed from: a */
    public <T> void mo19334a(C5726e eVar, T t, C5832c<T> cVar) {
        this.f9938j.mo19421a(eVar, t, cVar);
    }
}
