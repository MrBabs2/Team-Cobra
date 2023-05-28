package p015cm.aptoide.aptoideviews.skeleton;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.skeleton.recyclerview.SkeletonRecyclerViewWrapper;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006H\u0007¨\u0006\n"}, mo16641d2 = {"applySkeleton", "Lcm/aptoide/aptoideviews/skeleton/Skeleton;", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "skeletonLayoutResId", "", "Landroidx/recyclerview/widget/RecyclerView;", "listItemLayoutResId", "itemCount", "aptoide-views_prodRelease"}, mo16642k = 2, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.skeleton.SkeletonUtils */
/* compiled from: SkeletonExtensions.kt */
public final class SkeletonUtils {
    public static final Skeleton applySkeleton(RecyclerView recyclerView, int i) {
        return applySkeleton$default(recyclerView, i, 0, 2, (Object) null);
    }

    public static final Skeleton applySkeleton(RecyclerView recyclerView, int i, int i2) {
        C10202j.m34178b(recyclerView, "$this$applySkeleton");
        return new SkeletonRecyclerViewWrapper(recyclerView, i, i2);
    }

    public static /* synthetic */ Skeleton applySkeleton$default(RecyclerView recyclerView, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 9;
        }
        return applySkeleton(recyclerView, i, i2);
    }

    public static final Skeleton applySkeleton(View view, ViewGroup viewGroup, int i) {
        C10202j.m34178b(view, "$this$applySkeleton");
        C10202j.m34178b(viewGroup, "parent");
        return new SkeletonViewWrapper(view, viewGroup, i);
    }
}
