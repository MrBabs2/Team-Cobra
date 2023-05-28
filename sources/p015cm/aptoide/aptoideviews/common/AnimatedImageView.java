package p015cm.aptoide.aptoideviews.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import java.util.HashMap;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.C1033R;
import p050l.p051a.p052k.p053a.C4800a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001aJ\u001a\u0010\u001c\u001a\u00020\u001a2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u0006\u0010\u001d\u001a\u00020\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010¨\u0006\u001e"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/common/AnimatedImageView;", "Landroid/widget/ImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animation", "Landroid/graphics/drawable/Animatable;", "getAnimation", "()Landroid/graphics/drawable/Animatable;", "setAnimation", "(Landroid/graphics/drawable/Animatable;)V", "isAnimationsEnabled", "", "()Z", "setAnimationsEnabled", "(Z)V", "reverse", "getReverse", "setReverse", "play", "", "playReverse", "retrievePreferences", "setReverseAsDefault", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.common.AnimatedImageView */
/* compiled from: AnimatedImageView.kt */
public final class AnimatedImageView extends ImageView {
    private HashMap _$_findViewCache;
    private Animatable animation;
    private boolean isAnimationsEnabled;
    private Animatable reverse;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnimatedImageView(Context context) {
        this(context, (AttributeSet) null);
        C10202j.m34178b(context, "context");
    }

    private final void retrievePreferences(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1033R.styleable.AnimatedImageView, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(C1033R.styleable.AnimatedImageView_animation, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(C1033R.styleable.AnimatedImageView_reverseAnimation, -1);
        if (resourceId != -1) {
            Drawable c = C4800a.m7936c(getContext(), resourceId);
            if (c != null) {
                this.animation = (Animatable) c;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.Animatable");
            }
        }
        if (resourceId2 != -1) {
            Drawable c2 = C4800a.m7936c(getContext(), resourceId2);
            if (c2 != null) {
                this.reverse = (Animatable) c2;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.Animatable");
            }
        }
        obtainStyledAttributes.recycle();
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final Animatable getAnimation() {
        return this.animation;
    }

    public final Animatable getReverse() {
        return this.reverse;
    }

    public final boolean isAnimationsEnabled() {
        return this.isAnimationsEnabled;
    }

    public final void play() {
        Animatable animatable = this.animation;
        if (animatable == null) {
            return;
        }
        if (animatable != null) {
            setImageDrawable((Drawable) animatable);
            if (this.isAnimationsEnabled) {
                animatable.start();
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.Drawable");
    }

    public final void playReverse() {
        Animatable animatable = this.reverse;
        if (animatable == null) {
            return;
        }
        if (animatable != null) {
            setImageDrawable((Drawable) animatable);
            if (this.isAnimationsEnabled) {
                animatable.start();
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.Drawable");
    }

    public final void setAnimation(Animatable animatable) {
        this.animation = animatable;
    }

    public final void setAnimationsEnabled(boolean z) {
        this.isAnimationsEnabled = z;
    }

    public final void setReverse(Animatable animatable) {
        this.reverse = animatable;
    }

    public final void setReverseAsDefault() {
        Animatable animatable = this.reverse;
        if (animatable != null) {
            setImageDrawable((Drawable) animatable);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.Drawable");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnimatedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C10202j.m34178b(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10202j.m34178b(context, "context");
        this.isAnimationsEnabled = true;
        retrievePreferences(attributeSet, i);
    }
}
