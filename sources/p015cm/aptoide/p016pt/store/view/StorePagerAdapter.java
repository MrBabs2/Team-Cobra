package p015cm.aptoide.p016pt.store.view;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.C0462h;
import androidx.fragment.app.C0484l;
import androidx.fragment.app.Fragment;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.NavigationTrackerPagerAdapterHelper;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreTabs;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.view.Translator;
import p015cm.aptoide.p016pt.view.fragment.NavigationTrackFragment;

/* renamed from: cm.aptoide.pt.store.view.StorePagerAdapter */
public class StorePagerAdapter extends C0484l implements NavigationTrackerPagerAdapterHelper {
    private final EnumMap<Event.Name, Integer> availableEventsMap = new EnumMap<>(Event.Name.class);
    private Context context;
    private final String marketName;
    private final StoreContext storeContext;
    private Long storeId;
    private String storeTheme;
    private final List<GetStoreTabs.Tab> tabs;

    /* renamed from: cm.aptoide.pt.store.view.StorePagerAdapter$1 */
    static /* synthetic */ class C42611 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        static {
            /*
                cm.aptoide.pt.dataprovider.model.v7.Event$Name[] r0 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name = r0
                r1 = 1
                cm.aptoide.pt.dataprovider.model.v7.Event$Name r2 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.myStores     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.dataprovider.model.v7.Event$Name r3 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.getReviews     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                cm.aptoide.pt.dataprovider.model.v7.Event$Type[] r2 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Type.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Type = r2
                cm.aptoide.pt.dataprovider.model.v7.Event$Type r3 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Type.API     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Type     // Catch:{ NoSuchFieldError -> 0x0038 }
                cm.aptoide.pt.dataprovider.model.v7.Event$Type r2 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Type.CLIENT     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Type     // Catch:{ NoSuchFieldError -> 0x0043 }
                cm.aptoide.pt.dataprovider.model.v7.Event$Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Type.v3     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.store.view.StorePagerAdapter.C42611.<clinit>():void");
        }
    }

    public StorePagerAdapter(C0462h hVar, List<GetStoreTabs.Tab> list, StoreContext storeContext2, Long l, String str, Context context2, String str2) {
        super(hVar);
        this.storeId = l;
        if (!(l == null || l.longValue() == 15)) {
            this.storeTheme = str;
        }
        this.tabs = list;
        this.storeContext = storeContext2;
        this.context = context2;
        this.marketName = str2;
        translateTabs(list);
        validateGetStore();
        fillAvailableEventsMap(list);
    }

    private Fragment caseAPI(GetStoreTabs.Tab tab, boolean z) {
        return AptoideApplication.getFragmentProvider().newStoreTabGridRecyclerFragment(tab.getEvent(), this.storeTheme, tab.getTag(), this.storeContext, z, false);
    }

    private Fragment caseClient(Event event, GetStoreTabs.Tab tab) {
        if (C42611.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[event.getName().ordinal()] == 1) {
            return AptoideApplication.getFragmentProvider().newSubscribedStoresFragment(event, this.storeTheme, tab.getTag(), this.storeContext);
        }
        throw new RuntimeException("Fragment type not implemented!");
    }

    private Fragment caseV3(Event event) {
        if (C42611.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[event.getName().ordinal()] == 2) {
            return AptoideApplication.getFragmentProvider().newLatestReviewsFragment(this.storeId.longValue(), this.storeContext);
        }
        throw new RuntimeException("Fragment type not implemented!");
    }

    private void fillAvailableEventsMap(List<GetStoreTabs.Tab> list) {
        for (int i = 0; i < list.size(); i++) {
            Event event = list.get(i).getEvent();
            if (!containsEventName(event.getName())) {
                this.availableEventsMap.put(event.getName(), Integer.valueOf(i));
            }
        }
    }

    private boolean isHomeFragment(int i) {
        return i == 0;
    }

    private Fragment setFragmentLogFlag(Fragment fragment) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBoolean(NavigationTrackFragment.SHOULD_REGISTER_VIEW, false);
        fragment.setArguments(arguments);
        return fragment;
    }

    private void translateTabs(List<GetStoreTabs.Tab> list) {
        for (GetStoreTabs.Tab next : list) {
            next.setLabel(Translator.translate(next.getLabel(), this.context, this.marketName));
        }
    }

    private void validateGetStore() {
        Iterator<GetStoreTabs.Tab> it = this.tabs.iterator();
        while (it.hasNext()) {
            GetStoreTabs.Tab next = it.next();
            if (next.getEvent().getName() == null || next.getEvent().getType() == null) {
                it.remove();
            }
        }
    }

    public boolean containsEventName(Event.Name name) {
        return this.availableEventsMap.containsKey(name);
    }

    public int getCount() {
        return this.tabs.size();
    }

    public int getEventNamePosition(Event.Name name) {
        Integer num = this.availableEventsMap.get(name);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public Fragment getItem(int i) {
        Fragment fragment;
        GetStoreTabs.Tab tab = this.tabs.get(i);
        Event event = tab.getEvent();
        int i2 = C42611.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Type[event.getType().ordinal()];
        if (i2 == 1) {
            fragment = caseAPI(tab, isHomeFragment(i));
        } else if (i2 == 2) {
            fragment = caseClient(event, tab);
        } else if (i2 == 3) {
            fragment = caseV3(event);
        } else {
            throw new RuntimeException("Fragment type not implemented!");
        }
        return setFragmentLogFlag(fragment);
    }

    public String getItemName(int i) {
        return getItem(i).getClass().getSimpleName();
    }

    public StoreContext getItemStore() {
        return this.storeContext;
    }

    public String getItemTag(int i) {
        return this.tabs.get(i).getLabel();
    }

    public CharSequence getPageTitle(int i) {
        return this.tabs.get(i).getLabel();
    }
}
