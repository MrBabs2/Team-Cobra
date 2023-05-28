package p015cm.aptoide.p016pt.store.view;

import androidx.fragment.app.Fragment;
import p015cm.aptoide.p016pt.app.view.ListAppsFragment;
import p015cm.aptoide.p016pt.app.view.MoreBundleFragment;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Layout;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.home.more.appcoins.EarnAppcListFragment;
import p015cm.aptoide.p016pt.home.more.apps.ListAppsMoreFragment;
import p015cm.aptoide.p016pt.store.view.p028my.MyStoresFragment;
import p015cm.aptoide.p016pt.store.view.p028my.MyStoresSubscribedFragment;
import p015cm.aptoide.p016pt.store.view.recommended.RecommendedStoresFragment;

/* renamed from: cm.aptoide.pt.store.view.StoreTabFragmentChooser */
public class StoreTabFragmentChooser {

    /* renamed from: cm.aptoide.pt.store.view.StoreTabFragmentChooser$1 */
    static /* synthetic */ class C42621 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                cm.aptoide.pt.dataprovider.model.v7.Event$Name[] r0 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name = r0
                cm.aptoide.pt.dataprovider.model.v7.Event$Name r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.eSkills     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.dataprovider.model.v7.Event$Name r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.listApps     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.dataprovider.model.v7.Event$Name r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.getStore     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.dataprovider.model.v7.Event$Name r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.getUser     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name     // Catch:{ NoSuchFieldError -> 0x003e }
                cm.aptoide.pt.dataprovider.model.v7.Event$Name r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.getStoresRecommended     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name     // Catch:{ NoSuchFieldError -> 0x0049 }
                cm.aptoide.pt.dataprovider.model.v7.Event$Name r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.getMyStoresSubscribed     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name     // Catch:{ NoSuchFieldError -> 0x0054 }
                cm.aptoide.pt.dataprovider.model.v7.Event$Name r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.myStores     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name     // Catch:{ NoSuchFieldError -> 0x0060 }
                cm.aptoide.pt.dataprovider.model.v7.Event$Name r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.getStoreWidgets     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name     // Catch:{ NoSuchFieldError -> 0x006c }
                cm.aptoide.pt.dataprovider.model.v7.Event$Name r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.getMoreBundle     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name     // Catch:{ NoSuchFieldError -> 0x0078 }
                cm.aptoide.pt.dataprovider.model.v7.Event$Name r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.getAds     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name     // Catch:{ NoSuchFieldError -> 0x0084 }
                cm.aptoide.pt.dataprovider.model.v7.Event$Name r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.getAppCoinsAds     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name     // Catch:{ NoSuchFieldError -> 0x0090 }
                cm.aptoide.pt.dataprovider.model.v7.Event$Name r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.listStores     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name     // Catch:{ NoSuchFieldError -> 0x009c }
                cm.aptoide.pt.dataprovider.model.v7.Event$Name r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.getReviews     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name     // Catch:{ NoSuchFieldError -> 0x00a8 }
                cm.aptoide.pt.dataprovider.model.v7.Event$Name r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.listComments     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name     // Catch:{ NoSuchFieldError -> 0x00b4 }
                cm.aptoide.pt.dataprovider.model.v7.Event$Name r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.listReviews     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.store.view.StoreTabFragmentChooser.C42621.<clinit>():void");
        }
    }

    public static Fragment choose(Event event, HomeEvent.Type type) {
        switch (C42621.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[event.getName().ordinal()]) {
            case 1:
            case 2:
                if ((event.getData() == null || !event.getData().getLayout().equals(Layout.GRAPHIC)) && !type.equals(HomeEvent.Type.MORE_TOP)) {
                    return new ListAppsMoreFragment();
                }
                return ListAppsFragment.newInstance();
            case 3:
            case 4:
                return GetStoreFragment.newInstance();
            case 5:
                return RecommendedStoresFragment.newInstance();
            case 6:
                return MyStoresSubscribedFragment.newInstance();
            case 7:
                return MyStoresFragment.newInstance();
            case 8:
                return GetStoreWidgetsFragment.newInstance();
            case 9:
                return new MoreBundleFragment();
            case 10:
                return new ListAppsMoreFragment();
            case 11:
                return new EarnAppcListFragment();
            case 12:
                return ListStoresFragment.newInstance();
            default:
                throw new RuntimeException("Fragment " + event.getName() + " not implemented!");
        }
    }

    public static boolean validateAcceptedName(Event.Name name) {
        if (name == null) {
            return false;
        }
        switch (C42621.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[name.ordinal()]) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            default:
                return false;
        }
    }
}
