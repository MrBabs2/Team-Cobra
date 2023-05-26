package p015cm.aptoide.p016pt.view.recycler;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.LifecycleSchim;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayables;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;
import p015cm.aptoide.p016pt.view.recycler.widget.WidgetFactory;

/* renamed from: cm.aptoide.pt.view.recycler.BaseAdapter */
public class BaseAdapter extends RecyclerView.C0633g<Widget> implements LifecycleSchim {
    private final Displayables displayables;

    public BaseAdapter(List<Displayable> list) {
        this();
        this.displayables.add((List<? extends Displayable>) list);
    }

    /* renamed from: a */
    public /* synthetic */ void mo15633a(int i, Displayable displayable) {
        this.displayables.add(i, displayable);
        notifyDataSetChanged();
    }

    public void addDisplayable(int i, Displayable displayable) {
        AptoideUtils.ThreadU.runOnUiThread(new C4659b(this, i, displayable));
    }

    public void addDisplayableWithAnimation(int i, Displayable displayable) {
        this.displayables.add(i, displayable);
        notifyItemInserted(i);
    }

    public void addDisplayables(List<? extends Displayable> list) {
        AptoideUtils.ThreadU.runOnUiThread(new C4667e(this, list));
    }

    public void clearDisplayables() {
        AptoideUtils.ThreadU.runOnUiThread(new C4668f(this));
    }

    public Displayable getDisplayable(int i) {
        return this.displayables.get(Integer.valueOf(i));
    }

    public int getItemCount() {
        return this.displayables.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        return this.displayables.get(Integer.valueOf(i)).getViewLayout();
    }

    public void onDestroyView() {
        this.displayables.onDestroyView();
    }

    public void onPause() {
        this.displayables.onPause();
    }

    public void onResume() {
        this.displayables.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.displayables.onSaveInstanceState(bundle);
    }

    public void onViewCreated() {
        this.displayables.onViewCreated();
    }

    public void onViewStateRestored(Bundle bundle) {
        this.displayables.onViewStateRestored(bundle);
    }

    public Displayable popDisplayable() {
        Displayable pop = this.displayables.pop();
        notifyItemRemoved(this.displayables.size());
        return pop;
    }

    public void removeDisplayable(int i) {
        AptoideUtils.ThreadU.runOnUiThread(new C4658a(this, i));
    }

    public void removeDisplayables(int i, int i2) {
        AptoideUtils.ThreadU.runOnUiThread(new C4661d(this, i, i2));
    }

    public void addDisplayable(Displayable displayable) {
        AptoideUtils.ThreadU.runOnUiThread(new C4669g(this, displayable));
    }

    public void addDisplayables(int i, List<? extends Displayable> list) {
        AptoideUtils.ThreadU.runOnUiThread(new C4660c(this, i, list));
    }

    public void onBindViewHolder(Widget widget, int i) {
        widget.internalBindView(this.displayables.get(Integer.valueOf(i)), i);
    }

    public Widget onCreateViewHolder(ViewGroup viewGroup, int i) {
        return WidgetFactory.newBaseViewHolder(viewGroup, i);
    }

    public void onViewRecycled(Widget widget) {
        widget.unbindView();
        super.onViewRecycled(widget);
    }

    public void removeDisplayable(Displayable displayable) {
        this.displayables.remove(displayable);
        notifyItemRemoved(this.displayables.getPosition(displayable));
    }

    public BaseAdapter() {
        this.displayables = new Displayables();
    }

    /* renamed from: a */
    public /* synthetic */ void mo15635a(Displayable displayable) {
        this.displayables.add(displayable);
        notifyItemInserted(this.displayables.size() - 1);
    }

    /* renamed from: a */
    public /* synthetic */ void mo15636a(List list) {
        this.displayables.add((List<? extends Displayable>) list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public /* synthetic */ void mo15634a(int i, List list) {
        this.displayables.add(i, (List<? extends Displayable>) list);
        notifyItemRangeInserted(i, list.size());
    }

    /* renamed from: a */
    public /* synthetic */ void mo15632a(int i, int i2) {
        notifyItemRangeRemoved(i, this.displayables.remove(i, i2));
    }

    /* renamed from: a */
    public /* synthetic */ void mo15631a(int i) {
        this.displayables.remove(i);
        notifyItemRemoved(i);
    }

    /* renamed from: a */
    public /* synthetic */ void mo15630a() {
        this.displayables.clear();
        notifyDataSetChanged();
    }
}
