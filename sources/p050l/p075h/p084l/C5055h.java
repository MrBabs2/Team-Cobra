package p050l.p075h.p084l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p050l.p075h.p077f.p078a.C4966b;

/* renamed from: l.h.l.h */
/* compiled from: MenuItemCompat */
public final class C5055h {

    /* renamed from: l.h.l.h$a */
    /* compiled from: MenuItemCompat */
    class C5056a implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        final /* synthetic */ C5057b f8921a;

        C5056a(C5057b bVar) {
            this.f8921a = bVar;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f8921a.onMenuItemActionCollapse(menuItem);
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f8921a.onMenuItemActionExpand(menuItem);
        }
    }

    @Deprecated
    /* renamed from: l.h.l.h$b */
    /* compiled from: MenuItemCompat */
    public interface C5057b {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    /* renamed from: a */
    public static MenuItem m9092a(MenuItem menuItem, C5013b bVar) {
        if (menuItem instanceof C4966b) {
            return ((C4966b) menuItem).mo487a(bVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static void m9099b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C4966b) {
            ((C4966b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }

    @Deprecated
    /* renamed from: a */
    public static MenuItem m9093a(MenuItem menuItem, C5057b bVar) {
        return menuItem.setOnActionExpandListener(new C5056a(bVar));
    }

    /* renamed from: a */
    public static void m9097a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C4966b) {
            ((C4966b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: b */
    public static void m9098b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C4966b) {
            ((C4966b) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    /* renamed from: a */
    public static void m9094a(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C4966b) {
            ((C4966b) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    /* renamed from: a */
    public static void m9095a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C4966b) {
            ((C4966b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m9096a(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof C4966b) {
            ((C4966b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }
}
