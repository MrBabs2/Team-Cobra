package p015cm.aptoide.p016pt.updates;

import android.content.SharedPreferences;
import android.util.Pair;
import java.util.Collections;
import java.util.List;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p015cm.aptoide.p016pt.database.room.RoomUpdate;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.App;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.ListAppsUpdates;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.listapps.ListAppsUpdatesRequest;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.networking.IdsRepository;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p126m.C5377a;
import p123rx.schedulers.Schedulers;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.updates.UpdateRepository */
public class UpdateRepository {
    private static final long SYNC_MIN_INTERVAL_MS = 82800000;
    private static final String TAG = "cm.aptoide.pt.updates.UpdateRepository";
    private final AppBundlesVisibilityManager appBundlesVisibilityManager;
    private final AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    private final Converter.Factory converterFactory;
    private final OkHttpClient httpClient;
    private final IdsRepository idsRepository;
    private long lastSyncTimestamp = 0;
    private final SharedPreferences sharedPreferences;
    private final RoomStoreRepository storeRepository;
    private final TokenInvalidator tokenInvalidator;
    private final UpdateMapper updateMapper;
    private final UpdatePersistence updatePersistence;

    public UpdateRepository(UpdatePersistence updatePersistence2, RoomStoreRepository roomStoreRepository, IdsRepository idsRepository2, BodyInterceptor<BaseBody> bodyInterceptor2, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator2, SharedPreferences sharedPreferences2, AppBundlesVisibilityManager appBundlesVisibilityManager2, UpdateMapper updateMapper2, AptoideInstalledAppsRepository aptoideInstalledAppsRepository2) {
        this.updatePersistence = updatePersistence2;
        this.storeRepository = roomStoreRepository;
        this.idsRepository = idsRepository2;
        this.bodyInterceptor = bodyInterceptor2;
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.tokenInvalidator = tokenInvalidator2;
        this.sharedPreferences = sharedPreferences2;
        this.appBundlesVisibilityManager = appBundlesVisibilityManager2;
        this.updateMapper = updateMapper2;
        this.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository2;
    }

    /* renamed from: a */
    static /* synthetic */ RoomUpdate m7421a(RoomUpdate roomUpdate, Boolean bool) {
        return roomUpdate;
    }

    /* renamed from: d */
    static /* synthetic */ Iterable m7427d(List list) {
        return list;
    }

    private Single<List<ListAppsUpdatesRequest.ApksData>> getInstalledApks() {
        return this.aptoideInstalledAppsRepository.getAllSyncedInstalled().mo18567c().mo18691h(C4418i.f7588f).mo18694j(C4415f.f7583f).mo18698l().mo18700m();
    }

    /* access modifiers changed from: private */
    /* renamed from: getNetworkUpdates */
    public C5368e<List<App>> mo14975a(List<Long> list, boolean z, boolean z2) {
        Logger.getInstance().mo12975d(TAG, String.format("getNetworkUpdates() -> using %d stores", new Object[]{Integer.valueOf(list.size())}));
        return Single.m10124a(getInstalledApks(), this.idsRepository.getUniqueIdentifier(), C4410a.f7575f).mo18568c(new C4412c(this, list, z, z2)).mo18662b(Schedulers.m10352io()).mo18694j(C4414e.f7582f);
    }

    private C5328b saveNewUpdates(List<App> list) {
        return saveNonExcludedUpdates(this.updateMapper.mapAppUpdateList(list));
    }

    private C5328b saveNonExcludedUpdates(List<RoomUpdate> list) {
        return C5368e.m10234a(list).mo18687f(new C4424o(this)).mo18698l().mo18700m().mo18566b(new C4416g(this));
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo14978b(List list) {
        if (list == null || list.isEmpty()) {
            return C5328b.m10170f();
        }
        return this.updatePersistence.saveAll(list);
    }

    /* renamed from: c */
    public /* synthetic */ C5328b mo14979c(List list) {
        return removeAllNonExcluded().mo18587a(saveNewUpdates(list));
    }

    public Single<Boolean> contains(String str, boolean z) {
        return this.updatePersistence.contains(str, z);
    }

    public Single<RoomUpdate> get(String str) {
        return this.updatePersistence.get(str);
    }

    public C5368e<List<RoomUpdate>> getAll(boolean z) {
        return this.updatePersistence.getAllSorted(z);
    }

    public C5328b remove(List<RoomUpdate> list) {
        return this.updatePersistence.removeAll(list);
    }

    /* renamed from: removeAll */
    public C5328b mo14972a(List<RoomUpdate> list) {
        return this.updatePersistence.removeAll(list);
    }

    public C5328b removeAllNonExcluded() {
        return this.updatePersistence.getAll(false).mo18566b(new C4425p(this));
    }

    public C5328b setExcluded(String str) {
        return this.updatePersistence.get(str).mo18559a(C4422m.f7592f).mo18566b(new C4420k(this));
    }

    public C5328b sync(boolean z, boolean z2, boolean z3) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.lastSyncTimestamp;
        if (z3 || j >= SYNC_MIN_INTERVAL_MS) {
            return this.storeRepository.getAll().mo18669c().mo18644a(Schedulers.m10352io()).mo18687f(C4413d.f7581f).mo18687f(new C4417h(this, z, z2)).mo18700m().mo18566b(new C4421l(this)).mo18589a((C5377a) new C4423n(this, currentTimeMillis));
        }
        return C5328b.m10170f();
    }

    public C5328b remove(RoomUpdate roomUpdate) {
        return this.updatePersistence.remove(roomUpdate.getPackageName());
    }

    /* renamed from: a */
    public /* synthetic */ void mo14976a(long j) {
        this.lastSyncTimestamp = j;
    }

    public C5328b remove(String str) {
        return this.updatePersistence.remove(str);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo14974a(List list, boolean z, boolean z2, Pair pair) {
        return ListAppsUpdatesRequest.m5353of((List) pair.first, list, (String) pair.second, this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, this.appBundlesVisibilityManager).observe(z, z2);
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo14977b(RoomUpdate roomUpdate) {
        return this.updatePersistence.save(roomUpdate);
    }

    /* renamed from: a */
    static /* synthetic */ List m7425a(ListAppsUpdates listAppsUpdates) {
        if (listAppsUpdates == null || !listAppsUpdates.isOk()) {
            return Collections.emptyList();
        }
        return listAppsUpdates.getList();
    }

    /* renamed from: a */
    static /* synthetic */ ListAppsUpdatesRequest.ApksData m7422a(RoomInstalled roomInstalled) {
        return new ListAppsUpdatesRequest.ApksData(roomInstalled.getPackageName(), roomInstalled.getVersionCode(), roomInstalled.getSignature(), roomInstalled.isEnabled());
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo14973a(RoomUpdate roomUpdate) {
        return this.updatePersistence.isExcluded(roomUpdate.getPackageName()).mo18567c().mo18681d(C4419j.f7589f).mo18694j(new C4411b(roomUpdate));
    }
}
