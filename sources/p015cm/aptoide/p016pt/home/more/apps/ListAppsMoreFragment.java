package p015cm.aptoide.p016pt.home.more.apps;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9117p;
import p015cm.aptoide.aptoideviews.recyclerview.GridRecyclerView;
import p015cm.aptoide.p016pt.home.more.base.ListAppsFragment;
import p015cm.aptoide.p016pt.home.more.base.ListAppsView;
import p015cm.aptoide.p016pt.view.app.Application;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u001a\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\rH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u001b"}, mo16641d2 = {"Lcm/aptoide/pt/home/more/apps/ListAppsMoreFragment;", "Lcm/aptoide/pt/home/more/base/ListAppsFragment;", "Lcm/aptoide/pt/view/app/Application;", "Lcm/aptoide/pt/home/more/apps/ListAppsMoreViewHolder;", "Lcm/aptoide/pt/home/more/base/ListAppsView;", "()V", "presenter", "Lcm/aptoide/pt/home/more/apps/ListAppsMorePresenter;", "getPresenter", "()Lcm/aptoide/pt/home/more/apps/ListAppsMorePresenter;", "setPresenter", "(Lcm/aptoide/pt/home/more/apps/ListAppsMorePresenter;)V", "createViewHolder", "Lkotlin/Function2;", "Landroid/view/ViewGroup;", "", "getAdapterStrategy", "Lcm/aptoide/aptoideviews/recyclerview/GridRecyclerView$AdaptStrategy;", "getItemSizeHeight", "getItemSizeWidth", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.apps.ListAppsMoreFragment */
/* compiled from: ListAppsMoreFragment.kt */
public final class ListAppsMoreFragment extends ListAppsFragment<Application, ListAppsMoreViewHolder> implements ListAppsView<Application> {
    private HashMap _$_findViewCache;
    @Inject
    public ListAppsMorePresenter presenter;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public C9117p<ViewGroup, Integer, ListAppsMoreViewHolder> createViewHolder() {
        return ListAppsMoreFragment$createViewHolder$1.INSTANCE;
    }

    public GridRecyclerView.AdaptStrategy getAdapterStrategy() {
        return GridRecyclerView.AdaptStrategy.SCALE_KEEP_ASPECT_RATIO;
    }

    public int getItemSizeHeight() {
        return 158;
    }

    public int getItemSizeWidth() {
        return 104;
    }

    public final ListAppsMorePresenter getPresenter() {
        ListAppsMorePresenter listAppsMorePresenter = this.presenter;
        if (listAppsMorePresenter != null) {
            return listAppsMorePresenter;
        }
        C10202j.m34181d("presenter");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C10202j.m34178b(view, "view");
        super.onViewCreated(view, bundle);
        ListAppsMorePresenter listAppsMorePresenter = this.presenter;
        if (listAppsMorePresenter != null) {
            listAppsMorePresenter.present();
        } else {
            C10202j.m34181d("presenter");
            throw null;
        }
    }

    public final void setPresenter(ListAppsMorePresenter listAppsMorePresenter) {
        C10202j.m34178b(listAppsMorePresenter, "<set-?>");
        this.presenter = listAppsMorePresenter;
    }
}
