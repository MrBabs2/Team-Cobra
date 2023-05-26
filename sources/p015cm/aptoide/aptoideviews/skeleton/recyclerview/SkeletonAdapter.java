package p015cm.aptoide.aptoideviews.skeleton.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/skeleton/recyclerview/SkeletonAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcm/aptoide/aptoideviews/skeleton/recyclerview/SkeletonViewHolder;", "listItemLayoutResId", "", "itemCount", "(II)V", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.skeleton.recyclerview.SkeletonAdapter */
/* compiled from: SkeletonAdapter.kt */
public final class SkeletonAdapter extends RecyclerView.C0633g<SkeletonViewHolder> {
    private final int itemCount;
    private final int listItemLayoutResId;

    public SkeletonAdapter(int i, int i2) {
        this.listItemLayoutResId = i;
        this.itemCount = i2;
    }

    public int getItemCount() {
        return this.itemCount;
    }

    public void onBindViewHolder(SkeletonViewHolder skeletonViewHolder, int i) {
        C10202j.m34178b(skeletonViewHolder, "holder");
    }

    public SkeletonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C10202j.m34178b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.listItemLayoutResId, viewGroup, false);
        C10202j.m34174a((Object) inflate, "LayoutInflater.from(pare…youtResId, parent, false)");
        return new SkeletonViewHolder(inflate);
    }
}
