package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0137f;
import androidx.appcompat.view.menu.C0138g;
import androidx.appcompat.view.menu.C0142i;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.f0 */
/* compiled from: MenuPopupWindow */
public class C0243f0 extends C0232d0 implements C0241e0 {

    /* renamed from: O */
    private static Method f1060O;

    /* renamed from: N */
    private C0241e0 f1061N;

    /* renamed from: androidx.appcompat.widget.f0$a */
    /* compiled from: MenuPopupWindow */
    public static class C0244a extends C0302z {

        /* renamed from: t */
        final int f1062t;

        /* renamed from: u */
        final int f1063u;

        /* renamed from: v */
        private C0241e0 f1064v;

        /* renamed from: w */
        private MenuItem f1065w;

        public C0244a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f1062t = 22;
                this.f1063u = 21;
                return;
            }
            this.f1062t = 21;
            this.f1063u = 22;
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            C0137f fVar;
            int pointToPosition;
            int i2;
            if (this.f1064v != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    fVar = (C0137f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    fVar = (C0137f) adapter;
                }
                C0142i iVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < fVar.getCount()) {
                    iVar = fVar.getItem(i2);
                }
                MenuItem menuItem = this.f1065w;
                if (menuItem != iVar) {
                    C0138g b = fVar.mo603b();
                    if (menuItem != null) {
                        this.f1064v.mo587b(b, menuItem);
                    }
                    this.f1065w = iVar;
                    if (iVar != null) {
                        this.f1064v.mo586a(b, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1062t) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f1063u) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0137f) getAdapter()).mo603b().mo623a(false);
                return true;
            }
        }

        public void setHoverListener(C0241e0 e0Var) {
            this.f1064v = e0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1060O = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0243f0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0302z mo1485a(Context context, boolean z) {
        C0244a aVar = new C0244a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    /* renamed from: b */
    public void mo1538b(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1026J.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: c */
    public void mo1539c(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1060O;
            if (method != null) {
                try {
                    method.invoke(this.f1026J, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f1026J.setTouchModal(z);
        }
    }

    /* renamed from: a */
    public void mo1537a(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1026J.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: b */
    public void mo587b(C0138g gVar, MenuItem menuItem) {
        C0241e0 e0Var = this.f1061N;
        if (e0Var != null) {
            e0Var.mo587b(gVar, menuItem);
        }
    }

    /* renamed from: a */
    public void mo1536a(C0241e0 e0Var) {
        this.f1061N = e0Var;
    }

    /* renamed from: a */
    public void mo586a(C0138g gVar, MenuItem menuItem) {
        C0241e0 e0Var = this.f1061N;
        if (e0Var != null) {
            e0Var.mo586a(gVar, menuItem);
        }
    }
}
