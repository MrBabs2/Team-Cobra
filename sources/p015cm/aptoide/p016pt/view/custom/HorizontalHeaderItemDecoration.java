package p015cm.aptoide.p016pt.view.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: cm.aptoide.pt.view.custom.HorizontalHeaderItemDecoration */
public class HorizontalHeaderItemDecoration extends RecyclerView.C0643n {
    private static final float PARALLAX_RATIO = 0.3f;
    private static final int VERTICAL_OFFSET = 20;
    private int headerSize;
    private View layout;
    private int margin;

    public HorizontalHeaderItemDecoration(Context context, RecyclerView recyclerView, int i, int i2, int i3) {
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        View inflate = LayoutInflater.from(context).inflate(i, recyclerView, false);
        this.layout = inflate;
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.headerSize = i2;
        this.margin = i3;
        View view = this.layout;
        view.layout(0, 0, view.getMeasuredWidth(), this.layout.getMeasuredHeight());
    }

    private float getPercentage(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0662z zVar) {
        int i = this.margin;
        rect.set(i, i, 0, i);
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            rect.left = this.headerSize;
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0662z zVar) {
        float f;
        super.onDraw(canvas, recyclerView, zVar);
        float f2 = -(((float) this.layout.getMeasuredWidth()) / 2.0f);
        float measuredWidth = (((((float) this.headerSize) / 2.0f) - (((float) this.layout.getMeasuredWidth()) / 2.0f)) - (((float) this.margin) / 2.0f)) * PARALLAX_RATIO;
        boolean z = false;
        int i = 0;
        float f3 = 0.0f;
        while (true) {
            if (i >= recyclerView.getChildCount()) {
                f = 0.0f;
                break;
            }
            View childAt = recyclerView.getChildAt(i);
            if (f3 == 0.0f) {
                f3 = (((float) childAt.getTop()) + (((float) childAt.getMeasuredHeight()) / 2.0f)) - (((float) this.layout.getMeasuredWidth()) / 2.0f);
            }
            if (recyclerView.getChildAdapterPosition(childAt) == 0) {
                f = (((((float) childAt.getLeft()) - (((float) this.headerSize) / 2.0f)) - (((float) this.layout.getMeasuredWidth()) / 2.0f)) - (((float) this.margin) / 2.0f)) * PARALLAX_RATIO;
                if (f < f2) {
                    f = f2;
                }
                z = true;
            } else {
                i++;
            }
        }
        if (!z) {
            f = f2;
        }
        int max = Math.max((int) (getPercentage(f2, measuredWidth, f) * 255.0f), 1);
        canvas.save();
        canvas.saveLayerAlpha(new RectF(0.0f, 0.0f, (float) (this.headerSize - 2), (float) canvas.getHeight()), max, 31);
        canvas.translate(f, f3 - 20.0f);
        this.layout.draw(canvas);
        canvas.restore();
    }
}
