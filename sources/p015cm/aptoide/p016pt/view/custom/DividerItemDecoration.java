package p015cm.aptoide.p016pt.view.custom;

import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: cm.aptoide.pt.view.custom.DividerItemDecoration */
public class DividerItemDecoration extends RecyclerView.C0643n {
    public static final int ALL = 7;
    public static final int BOTTOM = 4;
    public static final int LEFT = 1;
    public static final int RIGHT = 2;
    private final int space;
    private final int spacingFlag;

    public DividerItemDecoration(Context context, float f) {
        this(context, f, 7);
    }

    private int getPixelsFromDips(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0662z zVar) {
        if ((this.spacingFlag & 1) == 1) {
            rect.left = this.space;
        }
        if ((this.spacingFlag & 2) == 2) {
            rect.right = this.space;
        }
        if ((this.spacingFlag & 4) == 4) {
            rect.bottom = this.space;
        }
        RecyclerView.C0644o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager.getOrientation() == 1 && linearLayoutManager.getPosition(view) == 0) {
                rect.top = this.space;
            }
        } else if (GridLayoutManager.class.isAssignableFrom(layoutManager.getClass())) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            if (gridLayoutManager.getOrientation() == 1 && recyclerView.getChildPosition(view) < gridLayoutManager.getSpanCount()) {
                rect.top = this.space;
            }
        } else if (recyclerView.getChildPosition(view) == 0) {
            rect.top = this.space;
        }
    }

    public DividerItemDecoration(Context context, float f, int i) {
        this.space = getPixelsFromDips(context, f);
        this.spacingFlag = i;
    }
}
