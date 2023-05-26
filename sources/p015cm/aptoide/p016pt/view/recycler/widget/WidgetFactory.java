package p015cm.aptoide.p016pt.view.recycler.widget;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.List;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;

/* renamed from: cm.aptoide.pt.view.recycler.widget.WidgetFactory */
public class WidgetFactory {
    private static final String TAG = "cm.aptoide.pt.view.recycler.widget.WidgetFactory";
    private static int columnSize = -1;
    private static int orientation = -1;

    private WidgetFactory() {
    }

    private static void computeColumnSize(Resources resources, WindowManager windowManager) {
        if (orientation != AptoideUtils.ScreenU.getCurrentOrientation(resources) || columnSize == -1 || orientation == -1) {
            columnSize = AptoideUtils.MathU.leastCommonMultiple(getDisplayablesSizes(windowManager, resources));
            orientation = AptoideUtils.ScreenU.getCurrentOrientation(resources);
        }
    }

    public static int getColumnSize(Resources resources, WindowManager windowManager) {
        computeColumnSize(resources, windowManager);
        return columnSize;
    }

    private static int[] getDisplayablesSizes(WindowManager windowManager, Resources resources) {
        List<Displayable> cachedDisplayables = AptoideApplication.getDisplayableWidgetMapping().getCachedDisplayables();
        int[] iArr = new int[cachedDisplayables.size()];
        int i = 0;
        for (Displayable perLineCount : cachedDisplayables) {
            iArr[i] = perLineCount.getPerLineCount(windowManager, resources);
            i++;
        }
        return iArr;
    }

    public static Widget newBaseViewHolder(ViewGroup viewGroup, int i) {
        return AptoideApplication.getDisplayableWidgetMapping().newWidget(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false), i);
    }
}
