package p015cm.aptoide.p016pt.bottomNavigation;

import p015cm.aptoide.p016pt.C1086R;

/* renamed from: cm.aptoide.pt.bottomNavigation.BottomNavigationMapper */
public class BottomNavigationMapper {
    public static final int APPS_POSITION = 4;
    static final int CURATION_POSITION = 1;
    static final int HOME_POSITION = 0;
    static final int SEARCH_POSITION = 2;
    static final int STORES_POSITION = 3;

    /* renamed from: cm.aptoide.pt.bottomNavigation.BottomNavigationMapper$1 */
    static /* synthetic */ class C19521 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$bottomNavigation$BottomNavigationItem;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                cm.aptoide.pt.bottomNavigation.BottomNavigationItem[] r0 = p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationItem.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$bottomNavigation$BottomNavigationItem = r0
                cm.aptoide.pt.bottomNavigation.BottomNavigationItem r1 = p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationItem.HOME     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$cm$aptoide$pt$bottomNavigation$BottomNavigationItem     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.bottomNavigation.BottomNavigationItem r1 = p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationItem.CURATION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$cm$aptoide$pt$bottomNavigation$BottomNavigationItem     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.bottomNavigation.BottomNavigationItem r1 = p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationItem.SEARCH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$cm$aptoide$pt$bottomNavigation$BottomNavigationItem     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.bottomNavigation.BottomNavigationItem r1 = p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationItem.STORES     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$cm$aptoide$pt$bottomNavigation$BottomNavigationItem     // Catch:{ NoSuchFieldError -> 0x003e }
                cm.aptoide.pt.bottomNavigation.BottomNavigationItem r1 = p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationItem.APPS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationMapper.C19521.<clinit>():void");
        }
    }

    public BottomNavigationItem mapItemClicked(Integer num) {
        switch (num.intValue()) {
            case C1086R.C1088id.action_apps:
                return BottomNavigationItem.APPS;
            case C1086R.C1088id.action_curation:
                return BottomNavigationItem.CURATION;
            case C1086R.C1088id.action_home:
                return BottomNavigationItem.HOME;
            case C1086R.C1088id.action_search:
                return BottomNavigationItem.SEARCH;
            case C1086R.C1088id.action_stores:
                return BottomNavigationItem.STORES;
            default:
                throw new IllegalStateException("The selected menuItem is not supported");
        }
    }

    public int mapToBottomNavigationPosition(BottomNavigationItem bottomNavigationItem) {
        int i = C19521.$SwitchMap$cm$aptoide$pt$bottomNavigation$BottomNavigationItem[bottomNavigationItem.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        throw new IllegalStateException("The selected bottomNavigationItem is not supported");
    }

    public int mapToBottomNavigationPosition(Integer num) {
        switch (num.intValue()) {
            case C1086R.C1088id.action_apps:
                return 4;
            case C1086R.C1088id.action_curation:
                return 1;
            case C1086R.C1088id.action_home:
                return 0;
            case C1086R.C1088id.action_search:
                return 2;
            case C1086R.C1088id.action_stores:
                return 3;
            default:
                throw new IllegalStateException("The selected menuItem is not supported");
        }
    }
}
