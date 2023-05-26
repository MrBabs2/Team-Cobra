package p015cm.aptoide.p016pt.editorialList;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: cm.aptoide.pt.editorialList.ScrollControlLinearLayoutManager */
public class ScrollControlLinearLayoutManager extends LinearLayoutManager {
    private boolean isScrollEnabled = true;

    public ScrollControlLinearLayoutManager(Context context) {
        super(context);
    }

    public boolean canScrollVertically() {
        return this.isScrollEnabled && super.canScrollVertically();
    }

    public void setScrollEnabled(boolean z) {
        this.isScrollEnabled = z;
    }
}
