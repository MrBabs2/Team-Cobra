package p015cm.aptoide.p016pt.view.custom;

import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: cm.aptoide.pt.view.custom.SimpleDividerItemDecoration */
public class SimpleDividerItemDecoration extends RecyclerView.C0643n {
    private final int space;

    public SimpleDividerItemDecoration(Context context, int i) {
        this.space = getPixelsFromDips(context, i);
    }

    private int getPixelsFromDips(Context context, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0662z zVar) {
        int i = this.space;
        rect.right = i;
        rect.left = i;
        rect.bottom = i;
        rect.top = i;
    }
}
