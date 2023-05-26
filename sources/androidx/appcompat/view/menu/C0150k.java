package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: androidx.appcompat.view.menu.k */
/* compiled from: MenuPopup */
abstract class C0150k implements C0158p, C0153m, AdapterView.OnItemClickListener {

    /* renamed from: f */
    private Rect f595f;

    C0150k() {
    }

    /* renamed from: b */
    protected static boolean m709b(C0138g gVar) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract void mo565a(int i);

    /* renamed from: a */
    public void mo547a(Context context, C0138g gVar) {
    }

    /* renamed from: a */
    public void mo816a(Rect rect) {
        this.f595f = rect;
    }

    /* renamed from: a */
    public abstract void mo567a(View view);

    /* renamed from: a */
    public abstract void mo568a(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: a */
    public abstract void mo569a(C0138g gVar);

    /* renamed from: a */
    public boolean mo555a(C0138g gVar, C0142i iVar) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo571b(int i);

    /* renamed from: b */
    public abstract void mo572b(boolean z);

    /* renamed from: b */
    public boolean mo558b(C0138g gVar, C0142i iVar) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo575c(int i);

    /* renamed from: c */
    public abstract void mo576c(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo577d() {
        return true;
    }

    /* renamed from: f */
    public Rect mo817f() {
        return this.f595f;
    }

    public int getId() {
        return 0;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m708a(listAdapter).f516f.mo625a((MenuItem) listAdapter.getItem(i), (C0153m) this, mo577d() ? 0 : 4);
    }

    /* renamed from: a */
    protected static int m707a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: a */
    protected static C0137f m708a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0137f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0137f) listAdapter;
    }
}
