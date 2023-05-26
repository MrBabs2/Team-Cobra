package p015cm.aptoide.p016pt.app.view;

import androidx.fragment.app.Fragment;
import java.util.LinkedList;
import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Layout;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListApps;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.App;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.Endless;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.store.view.GetStoreEndlessFragment;
import p015cm.aptoide.p016pt.store.view.featured.AppBrickListDisplayable;
import p015cm.aptoide.p016pt.store.view.top.TopAppListDisplayable;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.app.view.ListAppsFragment */
public class ListAppsFragment extends GetStoreEndlessFragment<ListApps> {

    /* renamed from: cm.aptoide.pt.app.view.ListAppsFragment$1 */
    static /* synthetic */ class C14371 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Layout;

        static {
            int[] iArr = new int[Layout.values().length];
            $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Layout = iArr;
            try {
                iArr[Layout.GRAPHIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static Fragment newInstance() {
        return new ListAppsFragment();
    }

    /* renamed from: a */
    public /* synthetic */ void mo7532a(ListApps listApps) {
        List<App> list = listApps.getDataList().getList();
        LinkedList linkedList = new LinkedList();
        if (this.homeEventType.equals(HomeEvent.Type.MORE_TOP)) {
            for (App app : list) {
                app.getStore().setAppearance(new Store.Appearance(this.storeTheme, (String) null));
                linkedList.add(new TopAppListDisplayable(app, this.tag, this.navigationTracker, this.storeContext));
            }
        } else {
            Layout layout = this.layout;
            if (layout == null) {
                for (App app2 : list) {
                    app2.getStore().setAppearance(new Store.Appearance(this.storeTheme, (String) null));
                    linkedList.add(new GridAppDisplayable(app2, this.tag, this.navigationTracker, this.storeContext));
                }
            } else if (C14371.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Layout[layout.ordinal()] != 1) {
                for (App app3 : list) {
                    app3.getStore().setAppearance(new Store.Appearance(this.storeTheme, (String) null));
                    linkedList.add(new GridAppDisplayable(app3, this.tag, this.navigationTracker, this.storeContext));
                }
            } else {
                for (App app4 : list) {
                    app4.getStore().setAppearance(new Store.Appearance(this.storeTheme, (String) null));
                    linkedList.add(new AppBrickListDisplayable(app4, this.tag, this.navigationTracker, this.storeContext));
                }
            }
        }
        addDisplayables(linkedList);
    }

    /* access modifiers changed from: protected */
    public C5378b<ListApps> buildAction() {
        return new C1641je(this);
    }

    /* access modifiers changed from: protected */
    public C2185V7<ListApps, ? extends Endless> buildRequest(boolean z, String str) {
        return this.requestFactoryCdnPool.newListAppsRequest(str);
    }
}
