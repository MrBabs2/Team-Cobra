package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C0706j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.google.android.material.datepicker.k */
/* compiled from: SmoothCalendarLayoutManager */
class C8511k extends LinearLayoutManager {

    /* renamed from: com.google.android.material.datepicker.k$a */
    /* compiled from: SmoothCalendarLayoutManager */
    class C8512a extends C0706j {
        C8512a(C8511k kVar, Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    C8511k(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0662z zVar, int i) {
        C8512a aVar = new C8512a(this, recyclerView.getContext());
        aVar.setTargetPosition(i);
        startSmoothScroll(aVar);
    }
}
