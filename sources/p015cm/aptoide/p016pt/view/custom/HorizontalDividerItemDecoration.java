package p015cm.aptoide.p016pt.view.custom;

import android.content.Context;
import android.graphics.Canvas;
import androidx.core.content.C0394a;
import androidx.recyclerview.widget.RecyclerView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.themes.ThemeManager;

/* renamed from: cm.aptoide.pt.view.custom.HorizontalDividerItemDecoration */
public class HorizontalDividerItemDecoration extends DrawableItemDecoration {
    public HorizontalDividerItemDecoration(Context context, ThemeManager themeManager) {
        this(context, 0, themeManager);
    }

    public /* bridge */ /* synthetic */ void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0662z zVar) {
        super.onDrawOver(canvas, recyclerView, zVar);
    }

    public HorizontalDividerItemDecoration(Context context, int i, ThemeManager themeManager) {
        super(C0394a.m1917c(context, themeManager.getAttributeForTheme(C1086R.attr.backgroundSecondary).resourceId), i);
    }
}
