package p015cm.aptoide.p016pt.view.fragment;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.view.LifecycleSchim;
import p015cm.aptoide.p016pt.view.recycler.BaseAdapter;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;

/* renamed from: cm.aptoide.pt.view.fragment.BaseRecyclerViewFragment */
public abstract class BaseRecyclerViewFragment<T extends BaseAdapter> extends BaseLoaderToolbarFragment implements LifecycleSchim, DisplayableManager {
    private T adapter;
    private ArrayList<Displayable> displayables = new ArrayList<>();
    private RecyclerView.C0644o layoutManager;
    private RecyclerView recyclerView;

    public BaseRecyclerViewFragment addDisplayableWithAnimation(int i, Displayable displayable) {
        this.adapter.addDisplayableWithAnimation(i, displayable);
        this.displayables.add(i, displayable);
        return this;
    }

    public void bindViews(View view) {
        super.bindViews(view);
        this.recyclerView = (RecyclerView) view.findViewById(C1086R.C1088id.recycler_view);
    }

    public boolean contains(Displayable displayable) {
        ArrayList<Displayable> arrayList = this.displayables;
        return arrayList != null && arrayList.contains(displayable);
    }

    /* access modifiers changed from: protected */
    public abstract T createAdapter();

    /* access modifiers changed from: protected */
    public abstract RecyclerView.C0644o createLayoutManager();

    public T getAdapter() {
        return this.adapter;
    }

    public int getContentViewId() {
        return C1086R.layout.recycler_fragment;
    }

    public int getDisplayablesSize() {
        return this.displayables.size();
    }

    public RecyclerView.C0644o getLayoutManager() {
        return this.layoutManager;
    }

    public RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    public boolean hasDisplayables() {
        ArrayList<Displayable> arrayList = this.displayables;
        return arrayList != null && arrayList.size() > 0;
    }

    public void load(boolean z, boolean z2, Bundle bundle) {
        if (z || z2) {
            clearDisplayables();
            return;
        }
        LinkedList linkedList = new LinkedList(this.displayables);
        this.displayables.clear();
        this.adapter.clearDisplayables();
        this.displayables.addAll(linkedList);
        this.adapter.addDisplayables(linkedList);
        finishLoading();
    }

    public void loadExtras(Bundle bundle) {
        super.loadExtras(bundle);
    }

    public void onDestroyView() {
        super.onDestroyView();
        T t = this.adapter;
        if (t != null) {
            t.onDestroyView();
        }
        this.layoutManager = null;
        this.recyclerView.clearOnScrollListeners();
        this.recyclerView.setAdapter((RecyclerView.C0633g) null);
        this.recyclerView = null;
        this.adapter = null;
    }

    public void onPause() {
        super.onPause();
        T t = this.adapter;
        if (t != null) {
            t.onPause();
        }
    }

    public void onResume() {
        super.onResume();
        T t = this.adapter;
        if (t != null) {
            t.onResume();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        T t = this.adapter;
        if (t != null) {
            t.onSaveInstanceState(bundle);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (this.adapter == null) {
            this.adapter = createAdapter();
        }
        super.onViewCreated(view, bundle);
        onViewCreated();
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        T t = this.adapter;
        if (t != null) {
            t.onViewStateRestored(bundle);
        }
    }

    public void removeDisplayables(int i, int i2) {
        Iterator<Displayable> it = this.displayables.iterator();
        while (true) {
            int i3 = i - 1;
            if (i > 0 && it.hasNext()) {
                i2--;
                it.next();
                i = i3;
            }
        }
        while (true) {
            int i4 = i2 - 1;
            if (i2 < 0 || !it.hasNext()) {
                this.adapter.clearDisplayables();
                this.adapter.addDisplayables(this.displayables);
            } else {
                it.next();
                it.remove();
                i2 = i4;
            }
        }
        this.adapter.clearDisplayables();
        this.adapter.addDisplayables(this.displayables);
    }

    public void setupViews() {
        super.setupViews();
        this.recyclerView.setAdapter(this.adapter);
        RecyclerView.C0644o createLayoutManager = createLayoutManager();
        this.layoutManager = createLayoutManager;
        this.recyclerView.setLayoutManager(createLayoutManager);
        this.recyclerView.setSaveEnabled(true);
    }

    public BaseRecyclerViewFragment clearDisplayables() {
        this.adapter.clearDisplayables();
        this.displayables.clear();
        return this;
    }

    @Deprecated
    public void addDisplayable(Displayable displayable) {
        addDisplayable(displayable, true);
    }

    @Deprecated
    public void addDisplayables(List<? extends Displayable> list) {
        addDisplayables(list, true);
    }

    public BaseRecyclerViewFragment addDisplayable(int i, Displayable displayable, boolean z) {
        this.adapter.addDisplayable(i, displayable);
        this.displayables.add(i, displayable);
        if (z) {
            finishLoading();
        }
        return this;
    }

    public BaseRecyclerViewFragment addDisplayables(List<? extends Displayable> list, boolean z) {
        this.adapter.addDisplayables(list);
        this.displayables.addAll(list);
        if (z) {
            finishLoading();
        }
        return this;
    }

    public void onViewCreated() {
        T t = this.adapter;
        if (t != null) {
            t.onViewCreated();
        }
    }

    public BaseRecyclerViewFragment addDisplayable(Displayable displayable, boolean z) {
        this.adapter.addDisplayable(displayable);
        this.displayables.add(displayable);
        if (z) {
            finishLoading();
        }
        return this;
    }

    public BaseRecyclerViewFragment addDisplayables(int i, List<? extends Displayable> list, boolean z) {
        this.adapter.addDisplayables(i, list);
        this.displayables.addAll(i, list);
        if (z) {
            finishLoading();
        }
        return this;
    }
}
