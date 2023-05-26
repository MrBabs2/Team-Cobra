package p015cm.aptoide.p016pt.view.recycler.displayable;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.WindowManager;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.LifecycleSchim;
import p015cm.aptoide.p016pt.view.recycler.widget.WidgetFactory;
import p123rx.p128t.C5383b;

/* renamed from: cm.aptoide.pt.view.recycler.displayable.Displayable */
public abstract class Displayable implements LifecycleSchim {
    private int defaultPerLineCount;
    private boolean fixedPerLineCount;
    private boolean isVisible = false;
    private C5383b subscriptions = new C5383b();

    /* renamed from: cm.aptoide.pt.view.recycler.displayable.Displayable$Configs */
    public class Configs {
        private final int defaultPerLineCount;
        private final boolean fixedPerLineCount;

        public Configs(int i, boolean z) {
            this.defaultPerLineCount = i;
            this.fixedPerLineCount = z;
        }

        public int getDefaultPerLineCount() {
            return this.defaultPerLineCount;
        }

        public boolean isFixedPerLineCount() {
            return this.fixedPerLineCount;
        }
    }

    public Displayable() {
        Configs config = getConfig();
        this.fixedPerLineCount = config.isFixedPerLineCount();
        this.defaultPerLineCount = config.getDefaultPerLineCount();
    }

    /* access modifiers changed from: protected */
    public abstract Configs getConfig();

    public int getDefaultPerLineCount() {
        return this.defaultPerLineCount;
    }

    public int getPerLineCount(WindowManager windowManager, Resources resources) {
        int i;
        if (isFixedPerLineCount()) {
            i = getDefaultPerLineCount();
        } else {
            i = (int) ((AptoideUtils.ScreenU.getScreenWidthInDip(windowManager, resources) / 360.0f) * ((float) getDefaultPerLineCount()));
        }
        if (i != 0) {
            return i;
        }
        return 1;
    }

    public int getSpanSize(WindowManager windowManager, Resources resources) {
        return WidgetFactory.getColumnSize(resources, windowManager) / getPerLineCount(windowManager, resources);
    }

    public C5383b getSubscriptions() {
        return this.subscriptions;
    }

    public abstract int getViewLayout();

    public boolean isFixedPerLineCount() {
        return this.fixedPerLineCount;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public void onDestroyView() {
    }

    public void onPause() {
        this.isVisible = false;
    }

    public void onResume() {
        this.isVisible = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onViewCreated() {
    }

    public void onViewStateRestored(Bundle bundle) {
    }

    public Displayable setFullRow() {
        this.defaultPerLineCount = 1;
        this.fixedPerLineCount = true;
        return this;
    }

    public void setVisible(boolean z) {
        this.isVisible = z;
    }
}
