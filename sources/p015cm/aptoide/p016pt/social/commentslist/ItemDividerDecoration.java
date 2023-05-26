package p015cm.aptoide.p016pt.social.commentslist;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: cm.aptoide.pt.social.commentslist.ItemDividerDecoration */
class ItemDividerDecoration extends RecyclerView.C0643n {
    private final DisplayMetrics displayMetrics;

    public ItemDividerDecoration(DisplayMetrics displayMetrics2) {
        this.displayMetrics = displayMetrics2;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0662z zVar) {
        int i;
        int i2;
        int i3;
        DisplayMetrics displayMetrics2 = this.displayMetrics;
        int i4 = 0;
        if (displayMetrics2 != null) {
            i4 = (int) TypedValue.applyDimension(1, 0.5f, displayMetrics2);
            i2 = i4;
            i = i2;
            i3 = i;
        } else {
            i2 = 0;
            i = 0;
            i3 = 0;
        }
        rect.set(i4, i2, i, i3);
    }
}
