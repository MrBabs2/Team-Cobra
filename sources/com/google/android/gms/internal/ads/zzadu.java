package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

@zzard
public final class zzadu extends RelativeLayout {

    /* renamed from: g */
    private static final float[] f18035g = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: f */
    private AnimationDrawable f18036f;

    public zzadu(Context context, zzadt zzadt, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        Preconditions.m16037a(zzadt);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f18035g, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(zzadt.mo27195p1());
        setLayoutParams(layoutParams);
        zzk.zzli().mo27817a((View) this, (Drawable) shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zzadt.mo27194M())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zzadt.mo27194M());
            textView.setTextColor(zzadt.mo27196q1());
            textView.setTextSize((float) zzadt.mo27197r1());
            zzyt.m25666a();
            int b = zzazt.m20475b(context, 4);
            zzyt.m25666a();
            textView.setPadding(b, 0, zzazt.m20475b(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<zzadw> s1 = zzadt.mo27198s1();
        if (s1 != null && s1.size() > 1) {
            this.f18036f = new AnimationDrawable();
            for (zzadw D0 : s1) {
                try {
                    this.f18036f.addFrame((Drawable) ObjectWrapper.m16390H(D0.mo27203D0()), zzadt.mo27199t1());
                } catch (Exception e) {
                    zzbad.m20520b("Error while getting drawable.", e);
                }
            }
            zzk.zzli().mo27817a((View) imageView, (Drawable) this.f18036f);
        } else if (s1.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) ObjectWrapper.m16390H(s1.get(0).mo27203D0()));
            } catch (Exception e2) {
                zzbad.m20520b("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f18036f;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
