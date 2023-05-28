package p015cm.aptoide.p016pt.home.more.base;

import android.view.View;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.view.app.Application;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00052\u000e\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\t"}, mo16641d2 = {"<anonymous>", "", "T", "Lcm/aptoide/pt/view/app/Application;", "V", "Lcm/aptoide/pt/home/more/base/ListAppsViewHolder;", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.base.ListAppsAdapter$onCreateViewHolder$1 */
/* compiled from: ListAppsAdapter.kt */
final class ListAppsAdapter$onCreateViewHolder$1 implements View.OnClickListener {
    final /* synthetic */ ListAppsViewHolder $vh;
    final /* synthetic */ ListAppsAdapter this$0;

    ListAppsAdapter$onCreateViewHolder$1(ListAppsAdapter listAppsAdapter, ListAppsViewHolder listAppsViewHolder) {
        this.this$0 = listAppsAdapter;
        this.$vh = listAppsViewHolder;
    }

    public final void onClick(View view) {
        C12871b access$getClickListener$p = this.this$0.clickListener;
        Object obj = this.this$0.appList.get(this.$vh.getAdapterPosition());
        C10202j.m34174a(obj, "appList[vh.adapterPosition]");
        access$getClickListener$p.onNext(new ListAppsClickEvent((Application) obj, this.$vh.getAdapterPosition()));
    }
}
