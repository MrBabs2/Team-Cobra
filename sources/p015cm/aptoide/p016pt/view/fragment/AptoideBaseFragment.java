package p015cm.aptoide.p016pt.view.fragment;

import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.WindowManager;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.ads.AdNetworkUtils;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p015cm.aptoide.p016pt.repository.request.RequestFactory;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.view.recycler.BaseAdapter;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.view.fragment.AptoideBaseFragment */
public abstract class AptoideBaseFragment<T extends BaseAdapter> extends GridRecyclerFragment<T> {
    protected RequestFactory requestFactoryCdnPool;
    protected RequestFactory requestFactoryCdnWeb;

    public void onCreate(Bundle bundle) {
        BodyInterceptor<BaseBody> accountSettingsBodyInterceptorPoolV7 = ((AptoideApplication) getContext().getApplicationContext()).getAccountSettingsBodyInterceptorPoolV7();
        OkHttpClient defaultClient = ((AptoideApplication) getContext().getApplicationContext()).getDefaultClient();
        Converter.Factory defaultConverter = WebService.getDefaultConverter();
        AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
        AptoideAccountManager accountManager = aptoideApplication.getAccountManager();
        StoreCredentialsProvider storeCredentials = ((AptoideApplication) getContext().getApplicationContext()).getStoreCredentials();
        String str = "window";
        String str2 = str;
        RequestFactory requestFactory = r2;
        RequestFactory requestFactory2 = new RequestFactory(storeCredentials, accountSettingsBodyInterceptorPoolV7, defaultClient, defaultConverter, ((AptoideApplication) getContext().getApplicationContext()).getTokenInvalidator(), ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences(), getContext().getResources(), (WindowManager) getContext().getSystemService("window"), aptoideApplication.getIdsRepository().getUniqueIdentifier().mo18562a().mo41082a(), aptoideApplication.getPartnerId(), accountManager, aptoideApplication.getQManager().getFilters(ManagerPreferences.getHWSpecsFilter(((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences())), (ConnectivityManager) getContext().getSystemService("connectivity"), aptoideApplication.getVersionCodeProvider(), AdNetworkUtils.isGooglePlayServicesAvailable(getContext()), aptoideApplication.getAppCoinsManager());
        this.requestFactoryCdnPool = requestFactory;
        this.requestFactoryCdnWeb = new RequestFactory(storeCredentials, ((AptoideApplication) getContext().getApplicationContext()).getAccountSettingsBodyInterceptorWebV7(), defaultClient, defaultConverter, ((AptoideApplication) getContext().getApplicationContext()).getTokenInvalidator(), ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences(), getContext().getResources(), (WindowManager) getContext().getSystemService(str), aptoideApplication.getIdsRepository().getUniqueIdentifier().mo18562a().mo41082a(), aptoideApplication.getPartnerId(), accountManager, aptoideApplication.getQManager().getFilters(ManagerPreferences.getHWSpecsFilter(((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences())), (ConnectivityManager) getContext().getSystemService("connectivity"), aptoideApplication.getVersionCodeProvider(), AdNetworkUtils.isGooglePlayServicesAvailable(getContext()), aptoideApplication.getAppCoinsManager());
        super.onCreate(bundle);
    }
}
