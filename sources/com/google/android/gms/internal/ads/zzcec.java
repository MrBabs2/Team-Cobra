package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

public final class zzcec extends FrameLayout {

    /* renamed from: f */
    private final zzayb f20051f;

    public zzcec(Context context, View view, zzayb zzayb) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f20051f = zzayb;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f20051f.mo27834a(motionEvent);
        return false;
    }

    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && (childAt instanceof zzbgz)) {
                arrayList.add((zzbgz) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((zzbgz) obj).destroy();
        }
    }
}
