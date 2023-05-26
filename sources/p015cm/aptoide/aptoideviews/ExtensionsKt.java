package p015cm.aptoide.aptoideviews;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9117p;
import kotlin.p220g0.C9146c;
import kotlin.p262y.C10507e0;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\"\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a]\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\u0001*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0006\u001a\u0004\u0018\u0001H\u00042\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0004\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\bH\u0000¢\u0006\u0002\u0010\t\u001a\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u00020\rH\u0000¨\u0006\u000e"}, mo16641d2 = {"safeLet", "R", "T1", "", "T2", "p1", "p2", "block", "Lkotlin/Function2;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "childViews", "", "Landroid/view/View;", "Landroid/view/ViewGroup;", "aptoide-views_prodRelease"}, mo16642k = 2, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.ExtensionsKt */
/* compiled from: Extensions.kt */
public final class ExtensionsKt {
    public static final List<View> childViews(ViewGroup viewGroup) {
        C10202j.m34178b(viewGroup, "$this$childViews");
        C9146c d = C9150f.m29854d(0, viewGroup.getChildCount());
        ArrayList arrayList = new ArrayList(C10531p.m35750a(d, 10));
        Iterator it = d.iterator();
        while (it.hasNext()) {
            arrayList.add(viewGroup.getChildAt(((C10507e0) it).mo33492a()));
        }
        return arrayList;
    }

    public static final <T1, T2, R> R safeLet(T1 t1, T2 t2, C9117p<? super T1, ? super T2, ? extends R> pVar) {
        C10202j.m34178b(pVar, "block");
        if (t1 == null || t2 == null) {
            return null;
        }
        return pVar.invoke(t1, t2);
    }
}
