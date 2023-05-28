package p015cm.aptoide.p016pt.home.more.base;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9117p;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.home.more.base.ListAppsViewHolder;
import p015cm.aptoide.p016pt.view.app.Application;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\r\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00030\u0005B\u001f\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\u0010\nJ\u0014\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017J\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000fJ\b\u0010\u0019\u001a\u00020\tH\u0016J\u001d\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u001dJ\u001d\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\tH\u0016¢\u0006\u0002\u0010!J\u0014\u0010\"\u001a\u00020\u00152\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\fj\b\u0012\u0004\u0012\u00028\u0000`\rX\u000e¢\u0006\u0002\n\u0000RJ\u0010\u000e\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0011*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00100\u0010 \u0011*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0011*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00100\u0010\u0018\u00010\u000f0\u000fX\u000e¢\u0006\u0002\n\u0000R#\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, mo16641d2 = {"Lcm/aptoide/pt/home/more/base/ListAppsAdapter;", "T", "Lcm/aptoide/pt/view/app/Application;", "V", "Lcm/aptoide/pt/home/more/base/ListAppsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "viewHolderBuilder", "Lkotlin/Function2;", "Landroid/view/ViewGroup;", "", "(Lkotlin/jvm/functions/Function2;)V", "appList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "clickListener", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/home/more/base/ListAppsClickEvent;", "kotlin.jvm.PlatformType", "getViewHolderBuilder", "()Lkotlin/jvm/functions/Function2;", "addData", "", "apps", "", "getClickListener", "getItemCount", "onBindViewHolder", "holder", "position", "(Lcm/aptoide/pt/home/more/base/ListAppsViewHolder;I)V", "onCreateViewHolder", "parent", "viewType", "(Landroid/view/ViewGroup;I)Lcm/aptoide/pt/home/more/base/ListAppsViewHolder;", "setData", "objs", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.base.ListAppsAdapter */
/* compiled from: ListAppsAdapter.kt */
public final class ListAppsAdapter<T extends Application, V extends ListAppsViewHolder<? super T>> extends RecyclerView.C0633g<V> {
    /* access modifiers changed from: private */
    public ArrayList<T> appList = new ArrayList<>();
    /* access modifiers changed from: private */
    public C12871b<ListAppsClickEvent<T>> clickListener = C12871b.m41468p();
    private final C9117p<ViewGroup, Integer, V> viewHolderBuilder;

    public ListAppsAdapter(C9117p<? super ViewGroup, ? super Integer, ? extends V> pVar) {
        C10202j.m34178b(pVar, "viewHolderBuilder");
        this.viewHolderBuilder = pVar;
    }

    public final void addData(List<? extends T> list) {
        C10202j.m34178b(list, DeepLinkIntentReceiver.DeepLinksTargets.APPS);
        int size = this.appList.size();
        this.appList.addAll(list);
        notifyItemRangeInserted(size, list.size());
    }

    public final C12871b<ListAppsClickEvent<T>> getClickListener() {
        C12871b<ListAppsClickEvent<T>> bVar = this.clickListener;
        C10202j.m34174a((Object) bVar, "clickListener");
        return bVar;
    }

    public int getItemCount() {
        return this.appList.size();
    }

    public final C9117p<ViewGroup, Integer, V> getViewHolderBuilder() {
        return this.viewHolderBuilder;
    }

    public final void setData(List<? extends T> list) {
        C10202j.m34178b(list, "objs");
        this.appList = new ArrayList<>(list);
        notifyDataSetChanged();
    }

    public void onBindViewHolder(V v, int i) {
        C10202j.m34178b(v, "holder");
        T t = this.appList.get(i);
        C10202j.m34174a((Object) t, "appList[position]");
        v.bindApp((Application) t);
    }

    public V onCreateViewHolder(ViewGroup viewGroup, int i) {
        C10202j.m34178b(viewGroup, "parent");
        V v = (ListAppsViewHolder) this.viewHolderBuilder.invoke(viewGroup, Integer.valueOf(i));
        v.itemView.setOnClickListener(new ListAppsAdapter$onCreateViewHolder$1(this, v));
        return v;
    }
}
