package p015cm.aptoide.p016pt.home.more.base;

import android.view.View;
import androidx.constraintlayout.widget.Group;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, mo16641d2 = {"setAllOnClickListener", "", "Landroidx/constraintlayout/widget/Group;", "listener", "Landroid/view/View$OnClickListener;", "app_vanillaProdRelease"}, mo16642k = 2, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.base.ListAppsFragmentKt */
/* compiled from: ListAppsFragment.kt */
public final class ListAppsFragmentKt {
    public static final void setAllOnClickListener(Group group, View.OnClickListener onClickListener) {
        C10202j.m34178b(group, "$this$setAllOnClickListener");
        int[] referencedIds = group.getReferencedIds();
        C10202j.m34174a((Object) referencedIds, "referencedIds");
        for (int findViewById : referencedIds) {
            group.getRootView().findViewById(findViewById).setOnClickListener(onClickListener);
        }
    }
}
