package p015cm.aptoide.p016pt.store;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.database.room.RoomStore;
import p015cm.aptoide.p016pt.dataprovider.interfaces.ErrorRequestListener;
import p015cm.aptoide.p016pt.dataprovider.interfaces.SuccessRequestListener;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreMeta;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetHomeMetaRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetStoreMetaRequest;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.p126m.C5378b;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.store.StoreUtilsProxy */
public class StoreUtilsProxy {
    private final AptoideAccountManager accountManager;
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    private final Converter.Factory converterFactory;
    private final OkHttpClient httpClient;
    private final SharedPreferences sharedPreferences;
    private final StoreCredentialsProvider storeCredentialsProvider;
    private final RoomStoreRepository storeRepository;
    private TokenInvalidator tokenInvalidator;

    public StoreUtilsProxy(AptoideAccountManager aptoideAccountManager, BodyInterceptor<BaseBody> bodyInterceptor2, StoreCredentialsProvider storeCredentialsProvider2, RoomStoreRepository roomStoreRepository, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator2, SharedPreferences sharedPreferences2) {
        this.accountManager = aptoideAccountManager;
        this.bodyInterceptor = bodyInterceptor2;
        this.storeCredentialsProvider = storeCredentialsProvider2;
        this.storeRepository = roomStoreRepository;
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.tokenInvalidator = tokenInvalidator2;
        this.sharedPreferences = sharedPreferences2;
    }

    /* renamed from: a */
    static /* synthetic */ C5368e m7276a(AptoideAccountManager aptoideAccountManager, BaseRequestWithStore.StoreCredentials storeCredentials, GetStoreMeta getStoreMeta) {
        if (!BaseV7Response.Info.Status.OK.equals(getStoreMeta.getInfo().getStatus())) {
            return C5368e.m10238a((Throwable) new Exception("Something went wrong while getting store meta"));
        }
        if (aptoideAccountManager.isLoggedIn()) {
            return aptoideAccountManager.subscribeStore(getStoreMeta.getData().getName(), storeCredentials.getUsername(), storeCredentials.getPasswordSha1()).mo18593a(C5368e.m10257c(getStoreMeta));
        }
        return C5368e.m10257c(getStoreMeta);
    }

    private boolean isPrivateCredentialsSet(GetStoreMetaRequest getStoreMetaRequest) {
        return (((GetHomeMetaRequest.Body) getStoreMetaRequest.getBody()).getStoreUser() == null || ((GetHomeMetaRequest.Body) getStoreMetaRequest.getBody()).getStorePassSha1() == null) ? false : true;
    }

    private C5328b saveStore(Store store, GetStoreMetaRequest getStoreMetaRequest) {
        RoomStore roomStore = new RoomStore();
        roomStore.setStoreId(store.getId());
        roomStore.setStoreName(store.getName());
        roomStore.setDownloads(store.getStats().getDownloads());
        roomStore.setIconPath(store.getAvatar());
        roomStore.setTheme(store.getAppearance().getTheme());
        if (isPrivateCredentialsSet(getStoreMetaRequest)) {
            roomStore.setUsername(((GetHomeMetaRequest.Body) getStoreMetaRequest.getBody()).getStoreUser());
            roomStore.setPasswordSha1(((GetHomeMetaRequest.Body) getStoreMetaRequest.getBody()).getStorePassSha1());
        }
        return this.storeRepository.save(roomStore);
    }

    public C5328b addDefaultStore(GetStoreMetaRequest getStoreMetaRequest, AptoideAccountManager aptoideAccountManager, BaseRequestWithStore.StoreCredentials storeCredentials) {
        return getStoreMetaRequest.observe().mo18687f(new C4247i(aptoideAccountManager, storeCredentials)).mo18689g(new C4249k(this, getStoreMetaRequest)).mo18649a((C5378b<? super Throwable>) C4248j.f7343f).mo18696k();
    }

    public void subscribeStore(String str) {
        subscribeStore(GetStoreMetaRequest.m5366of(StoreUtils.getStoreCredentials(str, this.storeCredentialsProvider), this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences), (SuccessRequestListener<GetStoreMeta>) null, (ErrorRequestListener) null, str, this.accountManager);
    }

    public C5368e<GetStoreMeta> subscribeStoreObservable(String str) {
        return StoreUtils.subscribeStore(GetStoreMetaRequest.m5366of(StoreUtils.getStoreCredentials(str, this.storeCredentialsProvider), this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences), this.accountManager, (String) null, (String) null, this.storeRepository);
    }

    public void unSubscribeStore(String str) {
        StoreUtils.unSubscribeStore(str, this.accountManager, this.storeCredentialsProvider, this.storeRepository);
    }

    public void subscribeStore(GetStoreMetaRequest getStoreMetaRequest, SuccessRequestListener<GetStoreMeta> successRequestListener, ErrorRequestListener errorRequestListener, String str, AptoideAccountManager aptoideAccountManager) {
        subscribeStore(getStoreMetaRequest, successRequestListener, errorRequestListener, str, aptoideAccountManager, (String) null, (String) null);
    }

    public void subscribeStore(GetStoreMetaRequest getStoreMetaRequest, SuccessRequestListener<GetStoreMeta> successRequestListener, ErrorRequestListener errorRequestListener, String str, AptoideAccountManager aptoideAccountManager, String str2, String str3) {
        StoreUtils.subscribeStore(getStoreMetaRequest, successRequestListener, errorRequestListener, aptoideAccountManager, str2, str3, this.storeRepository);
    }

    public void subscribeStore(String str, SuccessRequestListener<GetStoreMeta> successRequestListener, ErrorRequestListener errorRequestListener, AptoideAccountManager aptoideAccountManager) {
        subscribeStore(GetStoreMetaRequest.m5366of(StoreUtils.getStoreCredentials(str, this.storeCredentialsProvider), this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences), successRequestListener, errorRequestListener, str, aptoideAccountManager);
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo14595a(GetStoreMetaRequest getStoreMetaRequest, GetStoreMeta getStoreMeta) {
        return saveStore(getStoreMeta.getData(), getStoreMetaRequest);
    }
}
