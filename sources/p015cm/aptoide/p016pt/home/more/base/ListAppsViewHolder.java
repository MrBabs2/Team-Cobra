package p015cm.aptoide.p016pt.home.more.base;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.view.app.Application;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, mo16641d2 = {"Lcm/aptoide/pt/home/more/base/ListAppsViewHolder;", "T", "Lcm/aptoide/pt/view/app/Application;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "bindApp", "", "app", "(Lcm/aptoide/pt/view/app/Application;)V", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.base.ListAppsViewHolder */
/* compiled from: ListAppsViewHolder.kt */
public abstract class ListAppsViewHolder<T extends Application> extends RecyclerView.C0629c0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListAppsViewHolder(View view) {
        super(view);
        C10202j.m34178b(view, "v");
    }

    public abstract void bindApp(T t);
}
