package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;
import p050l.p108s.C5247m;
import p050l.p108s.C5264s;

/* renamed from: com.google.android.material.internal.i */
/* compiled from: TextScale */
public class C8564i extends C5247m {

    /* renamed from: com.google.android.material.internal.i$a */
    /* compiled from: TextScale */
    class C8565a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ TextView f24516a;

        C8565a(C8564i iVar, TextView textView) {
            this.f24516a = textView;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f24516a.setScaleX(floatValue);
            this.f24516a.setScaleY(floatValue);
        }
    }

    /* renamed from: d */
    private void m27986d(C5264s sVar) {
        View view = sVar.f9368b;
        if (view instanceof TextView) {
            sVar.f9367a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    /* renamed from: a */
    public void mo17995a(C5264s sVar) {
        m27986d(sVar);
    }

    /* renamed from: c */
    public void mo17996c(C5264s sVar) {
        m27986d(sVar);
    }

    /* renamed from: a */
    public Animator mo17994a(ViewGroup viewGroup, C5264s sVar, C5264s sVar2) {
        if (sVar == null || sVar2 == null || !(sVar.f9368b instanceof TextView)) {
            return null;
        }
        View view = sVar2.f9368b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = sVar.f9367a;
        Map<String, Object> map2 = sVar2.f9367a;
        float f = 1.0f;
        float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        if (map2.get("android:textscale:scale") != null) {
            f = ((Float) map2.get("android:textscale:scale")).floatValue();
        }
        if (floatValue == f) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{floatValue, f});
        ofFloat.addUpdateListener(new C8565a(this, textView));
        return ofFloat;
    }
}
