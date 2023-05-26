package p015cm.aptoide.p016pt.view.recycler;

import android.content.Context;
import android.content.res.Resources;
import android.view.WindowManager;
import androidx.recyclerview.widget.GridLayoutManager;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p015cm.aptoide.p016pt.view.recycler.widget.WidgetFactory;

/* renamed from: cm.aptoide.pt.view.recycler.BaseGridLayoutManager */
public class BaseGridLayoutManager extends GridLayoutManager {
    /* access modifiers changed from: private */
    public final Resources resources;
    /* access modifiers changed from: private */
    public final WindowManager windowManager;

    /* renamed from: cm.aptoide.pt.view.recycler.BaseGridLayoutManager$SpanSizeLookup */
    private class SpanSizeLookup extends GridLayoutManager.C0618c {
        private final BaseAdapter baseAdapter;

        public SpanSizeLookup(BaseAdapter baseAdapter2) {
            this.baseAdapter = baseAdapter2;
        }

        public int getSpanSize(int i) {
            Displayable displayable = this.baseAdapter.getDisplayable(i);
            if (displayable == null) {
                return 1;
            }
            if (displayable.getSpanSize(BaseGridLayoutManager.this.windowManager, BaseGridLayoutManager.this.resources) <= BaseGridLayoutManager.this.getSpanCount()) {
                return displayable.getSpanSize(BaseGridLayoutManager.this.windowManager, BaseGridLayoutManager.this.resources);
            }
            CrashReport instance = CrashReport.getInstance();
            instance.log(new IllegalArgumentException("Displayable " + displayable.getClass().getSimpleName() + " at position " + i + " spanSize > getSpanCount()! "));
            return BaseGridLayoutManager.this.getSpanCount();
        }
    }

    public BaseGridLayoutManager(Context context, BaseAdapter baseAdapter, Resources resources2, WindowManager windowManager2) {
        super(context, WidgetFactory.getColumnSize(resources2, windowManager2));
        this.resources = resources2;
        this.windowManager = windowManager2;
        setSpanSizeLookup(new SpanSizeLookup(baseAdapter));
    }
}
