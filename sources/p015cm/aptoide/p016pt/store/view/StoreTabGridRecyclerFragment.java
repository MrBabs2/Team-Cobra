package p015cm.aptoide.p016pt.store.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Layout;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p015cm.aptoide.p016pt.view.MainActivity;
import p015cm.aptoide.p016pt.view.Translator;
import p015cm.aptoide.p016pt.view.fragment.GridRecyclerSwipeFragment;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p123rx.C5368e;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.store.view.StoreTabGridRecyclerFragment */
public abstract class StoreTabGridRecyclerFragment extends GridRecyclerSwipeFragment {
    protected String action;
    protected HomeEvent.Type homeEventType;
    protected Layout layout;
    @Inject
    @Named
    String marketName;
    protected Event.Name name;
    protected StoreContext storeContext;
    @Inject
    RoomStoreRepository storeRepository;
    protected String storeTheme;
    protected String tag;
    protected String title;
    protected Event.Type type;

    /* renamed from: cm.aptoide.pt.store.view.StoreTabGridRecyclerFragment$BundleCons */
    public static class BundleCons {
        public static final String ACTION = "action";
        public static final String GROUP_ID = "group_id";
        public static final String HOME_EVENT_TYPE = "HomeEventType";
        public static final String LAYOUT = "layout";
        public static final String NAME = "name";
        public static String STORE_CONTEXT = "Store_context";
        public static final String STORE_NAME = "store_name";
        public static final String STORE_THEME = "storeTheme";
        public static final String TAG = "tag";
        public static final String TITLE = "title";
        public static final String TOOLBAR = "toolbar";
        public static final String TYPE = "type";
    }

    protected static Bundle buildBundle(Event event, HomeEvent.Type type2, String str, String str2, String str3, StoreContext storeContext2, boolean z) {
        Bundle bundle = new Bundle();
        if (type2 != null) {
            bundle.putString(BundleCons.HOME_EVENT_TYPE, type2.toString());
        }
        if (event.getType() != null) {
            bundle.putString("type", event.getType().toString());
        }
        if (event.getName() != null) {
            bundle.putString("name", event.getName().toString());
        }
        if (!(event.getData() == null || event.getData().getLayout() == null)) {
            bundle.putString("layout", event.getData().getLayout().toString());
        }
        if (storeContext2 != null) {
            bundle.putSerializable(BundleCons.STORE_CONTEXT, storeContext2);
        }
        bundle.putString("title", str);
        bundle.putString("action", event.getAction());
        bundle.putString("storeTheme", str2);
        bundle.putString(BundleCons.TAG, str3);
        bundle.putBoolean(BundleCons.TOOLBAR, z);
        return bundle;
    }

    public static Fragment newInstance(Event event, String str, String str2, StoreContext storeContext2, boolean z) {
        return newInstance(event, (String) null, str, str2, storeContext2, z);
    }

    /* access modifiers changed from: protected */
    public abstract C5368e<List<Displayable>> buildDisplayables(boolean z, String str, boolean z2);

    /* access modifiers changed from: protected */
    public boolean displayHomeUpAsEnabled() {
        return true;
    }

    public int getContentViewId() {
        if (this.title != null) {
            return C1086R.layout.recycler_swipe_fragment_with_toolbar;
        }
        return super.getContentViewId();
    }

    public ScreenTagHistory getHistoryTracker() {
        String simpleName = getClass().getSimpleName();
        String str = this.tag;
        StoreContext storeContext2 = this.storeContext;
        return ScreenTagHistory.Builder.build(simpleName, str, storeContext2 != null ? storeContext2.name() : null);
    }

    public void load(boolean z, boolean z2, Bundle bundle) {
        super.load(z, z2, bundle);
        if (z || z2 || !hasDisplayables()) {
            String str = this.action;
            String replace = str != null ? str.replace(C2185V7.getHost(((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences()), "") : null;
            if (StoreTabFragmentChooser.validateAcceptedName(this.name)) {
                C5368e<List<Displayable>> buildDisplayables = buildDisplayables(z2, replace, z2);
                if (buildDisplayables != null) {
                    buildDisplayables.mo18641a((C5368e.C5369c<? super List<Displayable>, ? extends R>) bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(new C4366s1(this), (C5378b<Throwable>) new C4352r1(this));
                    return;
                }
                return;
            }
            throw new RuntimeException("Invalid name(" + this.name + ") for event on " + getClass().getSimpleName() + "!");
        }
    }

    public void loadExtras(Bundle bundle) {
        if (bundle.containsKey(BundleCons.HOME_EVENT_TYPE)) {
            this.homeEventType = HomeEvent.Type.valueOf(bundle.getString(BundleCons.HOME_EVENT_TYPE));
        }
        if (bundle.containsKey("type")) {
            this.type = Event.Type.valueOf(bundle.getString("type"));
        }
        if (bundle.containsKey("name")) {
            this.name = Event.Name.valueOf(bundle.getString("name"));
        }
        if (bundle.containsKey("layout")) {
            this.layout = Layout.valueOf(bundle.getString("layout"));
        }
        if (bundle.containsKey(BundleCons.TAG)) {
            this.tag = bundle.getString(BundleCons.TAG);
        }
        if (bundle.containsKey(BundleCons.STORE_CONTEXT)) {
            this.storeContext = (StoreContext) bundle.getSerializable(BundleCons.STORE_CONTEXT);
        }
        this.title = bundle.getString(Translator.translate("title", getContext().getApplicationContext(), this.marketName));
        this.action = bundle.getString("action");
        this.storeTheme = bundle.getString("storeTheme");
    }

    public void onCreate(Bundle bundle) {
        ((MainActivity) getContext()).getActivityComponent().inject(this);
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C1086R.C1089menu.menu_empty, menu);
    }

    public android.view.View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getActivity().onBackPressed();
        return true;
    }

    public void setupToolbarDetails(Toolbar toolbar) {
        toolbar.setTitle((CharSequence) Translator.translate(this.title, getContext().getApplicationContext(), this.marketName));
        toolbar.setLogo((int) C1086R.C1087drawable.logo_toolbar);
    }

    public void setupViews() {
        super.setupViews();
        setupToolbar();
    }

    public static Fragment newInstance(Event event, String str, String str2, String str3, StoreContext storeContext2, boolean z) {
        return newInstance(event, HomeEvent.Type.NO_OP, str, str2, str3, storeContext2, z);
    }

    public static Fragment newInstance(Event event, HomeEvent.Type type2, String str, String str2, String str3, StoreContext storeContext2, boolean z) {
        Bundle buildBundle = buildBundle(event, type2, str, str2, str3, storeContext2, z);
        Fragment choose = StoreTabFragmentChooser.choose(event, type2);
        Bundle arguments = choose.getArguments();
        if (arguments != null) {
            buildBundle.putAll(arguments);
        }
        choose.setArguments(buildBundle);
        return choose;
    }

    /* renamed from: a */
    public /* synthetic */ void mo14750a(Throwable th) {
        CrashReport.getInstance().log(th);
        finishLoading(th);
    }
}
