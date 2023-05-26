package p015cm.aptoide.p016pt.reactions.util;

import android.content.res.Resources;

/* renamed from: cm.aptoide.pt.reactions.util.DisplayUtil */
public class DisplayUtil {
    public static int dpToPx(int i) {
        return i * (Resources.getSystem().getDisplayMetrics().densityDpi / 160);
    }
}
