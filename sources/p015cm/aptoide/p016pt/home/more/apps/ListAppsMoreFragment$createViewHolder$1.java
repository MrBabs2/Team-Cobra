package p015cm.aptoide.p016pt.home.more.apps;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.text.DecimalFormat;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p215c0.p216c.C9117p;
import p015cm.aptoide.p016pt.C1086R;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo16641d2 = {"<anonymous>", "Lcm/aptoide/pt/home/more/apps/ListAppsMoreViewHolder;", "parent", "Landroid/view/ViewGroup;", "<anonymous parameter 1>", "", "invoke"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.apps.ListAppsMoreFragment$createViewHolder$1 */
/* compiled from: ListAppsMoreFragment.kt */
final class ListAppsMoreFragment$createViewHolder$1 extends C10203k implements C9117p<ViewGroup, Integer, ListAppsMoreViewHolder> {
    public static final ListAppsMoreFragment$createViewHolder$1 INSTANCE = new ListAppsMoreFragment$createViewHolder$1();

    ListAppsMoreFragment$createViewHolder$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((ViewGroup) obj, ((Number) obj2).intValue());
    }

    public final ListAppsMoreViewHolder invoke(ViewGroup viewGroup, int i) {
        C10202j.m34178b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.app_home_item, viewGroup, false);
        C10202j.m34174a((Object) inflate, "LayoutInflater.from(pare…ent,\n              false)");
        return new ListAppsMoreViewHolder(inflate, new DecimalFormat("0.0"));
    }
}
