package p015cm.aptoide.p016pt.store.view.p028my;

import android.os.Bundle;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.inject.Inject;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.interfaces.ErrorRequestListener;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Layout;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.ListStores;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.Endless;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.WSWidgetsUtils;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetMyStoreListRequest;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p015cm.aptoide.p016pt.store.StoreAnalytics;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.store.StoreUtilsProxy;
import p015cm.aptoide.p016pt.store.view.GetStoreEndlessFragment;
import p015cm.aptoide.p016pt.store.view.GridStoreDisplayable;
import p015cm.aptoide.p016pt.store.view.recommended.RecommendedStoreDisplayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.DisplayablesFactory;
import p123rx.p126m.C5378b;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.store.view.my.MyStoresSubscribedFragment */
public class MyStoresSubscribedFragment extends GetStoreEndlessFragment<ListStores> {
    private static final String USER_NOT_LOGGED_ERROR = "AUTH-5";
    private AptoideAccountManager accountManager;
    @Inject
    AnalyticsManager analyticsManager;
    private BodyInterceptor<BaseBody> bodyInterceptor;
    private Converter.Factory converterFactory;
    private OkHttpClient httpClient;
    @Inject
    NavigationTracker navigationTracker;
    private StoreAnalytics storeAnalytics;
    @Inject
    StoreCredentialsProvider storeCredentialsProvider;
    @Inject
    RoomStoreRepository storeRepository;
    @Inject
    StoreUtilsProxy storeUtilsProxy;
    private TokenInvalidator tokenInvalidator;
    private WSWidgetsUtils widgetsUtils;

    private ArrayList<Displayable> getStoresDisplayable(List<Store> list) {
        ArrayList<Displayable> arrayList = new ArrayList<>(list.size());
        Collections.sort(list, C4335x.f7434f);
        for (int i = 0; i < list.size(); i++) {
            if (i == 0 || list.get(i - 1).getId() != list.get(i).getId()) {
                if (this.layout == Layout.LIST) {
                    arrayList.add(new RecommendedStoreDisplayable(list.get(i), this.storeRepository, this.accountManager, this.storeUtilsProxy, this.storeCredentialsProvider));
                } else {
                    arrayList.add(new GridStoreDisplayable(list.get(i), "More Followed Stores", this.storeAnalytics));
                }
            }
        }
        return arrayList;
    }

    public static Fragment newInstance() {
        return new MyStoresSubscribedFragment();
    }

    /* renamed from: a */
    public /* synthetic */ void mo14795a(ListStores listStores) {
        addDisplayables(getStoresDisplayable(listStores.getDataList().getList()));
    }

    /* renamed from: b */
    public /* synthetic */ void mo14797b(Throwable th) {
        getRecyclerView().clearOnScrollListeners();
        LinkedList linkedList = new LinkedList();
        linkedList.add(USER_NOT_LOGGED_ERROR);
        if (this.widgetsUtils.shouldAddObjectView(linkedList, th)) {
            DisplayablesFactory.loadLocalSubscribedStores(this.storeRepository).mo18641a(bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(new C4308a0(this), (C5378b<Throwable>) C4337z.f7436f);
        } else {
            finishLoading(th);
        }
    }

    /* access modifiers changed from: protected */
    public C5378b<ListStores> buildAction() {
        return new C4336y(this);
    }

    /* access modifiers changed from: protected */
    public C2185V7<ListStores, ? extends Endless> buildRequest(boolean z, String str) {
        return GetMyStoreListRequest.m5364of(str, true, this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences(), getContext().getResources(), (WindowManager) getContext().getSystemService("window"));
    }

    /* access modifiers changed from: protected */
    public ErrorRequestListener getErrorRequestListener() {
        return new C4334w(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.tokenInvalidator = ((AptoideApplication) getContext().getApplicationContext()).getTokenInvalidator();
        this.accountManager = ((AptoideApplication) getContext().getApplicationContext()).getAccountManager();
        this.bodyInterceptor = ((AptoideApplication) getContext().getApplicationContext()).getAccountSettingsBodyInterceptorPoolV7();
        this.httpClient = ((AptoideApplication) getContext().getApplicationContext()).getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
        this.storeAnalytics = new StoreAnalytics(this.analyticsManager, this.navigationTracker);
        this.widgetsUtils = new WSWidgetsUtils();
    }

    /* renamed from: a */
    public /* synthetic */ void mo14796a(List list) {
        addDisplayables(getStoresDisplayable(list));
    }
}
