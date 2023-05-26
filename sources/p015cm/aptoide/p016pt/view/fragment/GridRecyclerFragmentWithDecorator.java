package p015cm.aptoide.p016pt.view.fragment;

import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.C0456c;
import androidx.recyclerview.widget.RecyclerView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.view.recycler.BaseAdapter;

/* renamed from: cm.aptoide.pt.view.fragment.GridRecyclerFragmentWithDecorator */
public abstract class GridRecyclerFragmentWithDecorator<T extends BaseAdapter> extends AptoideBaseFragment<T> {
    /* access modifiers changed from: protected */
    public RecyclerView.C0643n getItemDecoration() {
        return new RecyclerView.C0643n() {
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0662z zVar) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                C0456c activity = GridRecyclerFragmentWithDecorator.this.getActivity();
                int i6 = 0;
                if (activity != null) {
                    i = (int) TypedValue.applyDimension(1, 5.0f, activity.getResources().getDisplayMetrics());
                    i5 = i;
                    i4 = i5;
                    i3 = i4;
                    i2 = i3;
                } else {
                    i = 0;
                    i5 = 0;
                    i4 = 0;
                    i3 = 0;
                    i2 = 0;
                }
                if (view.getId() == C1086R.C1088id.brick_app_item) {
                    i5 = i / 2;
                    i4 = i5;
                    i3 = i4;
                    i2 = i3;
                }
                if (view.getId() == C1086R.C1088id.message_white_bg) {
                    i4 = i;
                    i2 = i4;
                } else {
                    i6 = i5;
                    i = i3;
                }
                rect.set(i, i6, i2, i4);
            }
        };
    }

    public void setupViews() {
        super.setupViews();
        RecyclerView.C0643n itemDecoration = getItemDecoration();
        if (itemDecoration != null) {
            getRecyclerView().addItemDecoration(itemDecoration);
        }
    }
}
