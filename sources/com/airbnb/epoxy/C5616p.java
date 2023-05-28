package com.airbnb.epoxy;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.airbnb.epoxy.p */
/* compiled from: EpoxyDiffLogger */
public class C5616p extends RecyclerView.C0635i {

    /* renamed from: a */
    private final String f9898a;

    public C5616p(String str) {
        this.f9898a = str;
    }

    public void onItemRangeChanged(int i, int i2) {
        String str = this.f9898a;
        Log.d(str, "Item range changed. Start: " + i + " Count: " + i2);
    }

    public void onItemRangeInserted(int i, int i2) {
        String str = this.f9898a;
        Log.d(str, "Item range inserted. Start: " + i + " Count: " + i2);
    }

    public void onItemRangeMoved(int i, int i2, int i3) {
        String str = this.f9898a;
        Log.d(str, "Item moved. From: " + i + " To: " + i2);
    }

    public void onItemRangeRemoved(int i, int i2) {
        String str = this.f9898a;
        Log.d(str, "Item range removed. Start: " + i + " Count: " + i2);
    }

    public void onItemRangeChanged(int i, int i2, Object obj) {
        if (obj == null) {
            onItemRangeChanged(i, i2);
            return;
        }
        String str = this.f9898a;
        Log.d(str, "Item range changed with payloads. Start: " + i + " Count: " + i2);
    }
}
