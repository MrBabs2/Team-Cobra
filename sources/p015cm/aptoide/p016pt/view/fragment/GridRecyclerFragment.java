package p015cm.aptoide.p016pt.view.fragment;

import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.view.recycler.BaseAdapter;
import p015cm.aptoide.p016pt.view.recycler.BaseGridLayoutManager;

/* renamed from: cm.aptoide.pt.view.fragment.GridRecyclerFragment */
public abstract class GridRecyclerFragment<T extends BaseAdapter> extends BaseRecyclerViewFragment<T> {
    private final Class<? extends BaseAdapter> adapterClass;

    public GridRecyclerFragment() {
        this.adapterClass = BaseAdapter.class;
    }

    /* access modifiers changed from: protected */
    public T createAdapter() {
        try {
            return (BaseAdapter) this.adapterClass.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
            CrashReport.getInstance().log(e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public RecyclerView.C0644o createLayoutManager() {
        return new BaseGridLayoutManager(getActivity(), getAdapter(), getContext().getResources(), (WindowManager) getContext().getSystemService("window"));
    }

    /* access modifiers changed from: protected */
    public int getViewToShowAfterLoadingId() {
        return C1086R.C1088id.recycler_view;
    }

    /* access modifiers changed from: protected */
    public int[] getViewsToShowAfterLoadingId() {
        return new int[0];
    }

    public GridRecyclerFragment(Class<T> cls) {
        this.adapterClass = cls;
    }
}
