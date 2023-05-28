package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.p */
/* compiled from: ScrollbarHelper */
class C0716p {
    /* renamed from: a */
    static int m3401a(RecyclerView.C0662z zVar, C0711n nVar, View view, View view2, RecyclerView.C0644o oVar, boolean z, boolean z2) {
        int i;
        if (oVar.getChildCount() == 0 || zVar.mo4041a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(oVar.getPosition(view), oVar.getPosition(view2));
        int max = Math.max(oVar.getPosition(view), oVar.getPosition(view2));
        if (z2) {
            i = Math.max(0, (zVar.mo4041a() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(nVar.mo4250a(view2) - nVar.mo4257d(view))) / ((float) (Math.abs(oVar.getPosition(view) - oVar.getPosition(view2)) + 1)))) + ((float) (nVar.mo4260f() - nVar.mo4257d(view))));
    }

    /* renamed from: b */
    static int m3402b(RecyclerView.C0662z zVar, C0711n nVar, View view, View view2, RecyclerView.C0644o oVar, boolean z) {
        if (oVar.getChildCount() == 0 || zVar.mo4041a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return zVar.mo4041a();
        }
        return (int) ((((float) (nVar.mo4250a(view2) - nVar.mo4257d(view))) / ((float) (Math.abs(oVar.getPosition(view) - oVar.getPosition(view2)) + 1))) * ((float) zVar.mo4041a()));
    }

    /* renamed from: a */
    static int m3400a(RecyclerView.C0662z zVar, C0711n nVar, View view, View view2, RecyclerView.C0644o oVar, boolean z) {
        if (oVar.getChildCount() == 0 || zVar.mo4041a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.getPosition(view) - oVar.getPosition(view2)) + 1;
        }
        return Math.min(nVar.mo4262g(), nVar.mo4250a(view2) - nVar.mo4257d(view));
    }
}
