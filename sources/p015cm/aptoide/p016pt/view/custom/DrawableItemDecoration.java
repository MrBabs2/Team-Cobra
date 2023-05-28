package p015cm.aptoide.p016pt.view.custom;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: cm.aptoide.pt.view.custom.DrawableItemDecoration */
class DrawableItemDecoration extends RecyclerView.C0643n {
    private final int customHorizontalPadding;
    private final Drawable dividerDrawable;

    DrawableItemDecoration(Drawable drawable, int i) {
        this.dividerDrawable = drawable;
        this.customHorizontalPadding = i;
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0662z zVar) {
        int i = this.customHorizontalPadding;
        int width = recyclerView.getWidth() - this.customHorizontalPadding;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount - 1; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            int bottom = childAt.getBottom() + ((RecyclerView.C0649p) childAt.getLayoutParams()).bottomMargin;
            this.dividerDrawable.setBounds(i, bottom, width, this.dividerDrawable.getIntrinsicHeight() + bottom);
            this.dividerDrawable.draw(canvas);
        }
    }
}
