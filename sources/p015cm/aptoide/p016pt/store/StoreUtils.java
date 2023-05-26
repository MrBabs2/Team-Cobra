package p015cm.aptoide.p016pt.store;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.database.room.RoomStore;
import p015cm.aptoide.p016pt.dataprovider.interfaces.ErrorRequestListener;
import p015cm.aptoide.p016pt.dataprovider.interfaces.SuccessRequestListener;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreMeta;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetHomeMetaRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetStoreMetaRequest;
import p015cm.aptoide.p016pt.dataprovider.util.HashMapNotNull;
import p015cm.aptoide.p016pt.logger.Logger;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.store.StoreUtils */
public class StoreUtils {
    private static final String PRIVATE_STORE_ERROR_CODE = "STORE-3";
    private static final String PRIVATE_STORE_WRONG_CREDENTIALS_ERROR_CODE = "STORE-4";
    private static final String STORE_DOESNT_EXIST_ERROR_CODE = "STORE-1";
    private static final String STORE_SUSPENDED_ERROR_CODE = "STORE-7";

    public static String formatRepoUri(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (lowerCase.contains("http//")) {
            lowerCase = lowerCase.replaceFirst("http//", "http://");
        }
        if (!(lowerCase.length() == 0 || lowerCase.charAt(lowerCase.length() - 1) == '/')) {
            lowerCase = lowerCase + '/';
            Logger.getInstance().mo12975d("Aptoide-ManageRepo", "repo uri: " + lowerCase);
        }
        if (lowerCase.startsWith("http://")) {
            return lowerCase;
        }
        String str2 = "http://" + lowerCase;
        Logger.getInstance().mo12975d("Aptoide-ManageRepo", "repo uri: " + str2);
        return str2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p015cm.aptoide.p016pt.store.StoreError getErrorType(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1166288347: goto L_0x0029;
                case -1166288346: goto L_0x000a;
                case -1166288345: goto L_0x001f;
                case -1166288344: goto L_0x0015;
                case -1166288343: goto L_0x000a;
                case -1166288342: goto L_0x000a;
                case -1166288341: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0033
        L_0x000b:
            java.lang.String r0 = "STORE-7"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 2
            goto L_0x0034
        L_0x0015:
            java.lang.String r0 = "STORE-4"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 0
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "STORE-3"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 1
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "STORE-1"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 3
            goto L_0x0034
        L_0x0033:
            r4 = -1
        L_0x0034:
            if (r4 == 0) goto L_0x0048
            if (r4 == r3) goto L_0x0045
            if (r4 == r2) goto L_0x0042
            if (r4 == r1) goto L_0x003f
            cm.aptoide.pt.store.StoreError r4 = p015cm.aptoide.p016pt.store.StoreError.GENERIC_ERROR
            goto L_0x004a
        L_0x003f:
            cm.aptoide.pt.store.StoreError r4 = p015cm.aptoide.p016pt.store.StoreError.STORE_DOESNT_EXIST
            goto L_0x004a
        L_0x0042:
            cm.aptoide.pt.store.StoreError r4 = p015cm.aptoide.p016pt.store.StoreError.STORE_SUSPENDED
            goto L_0x004a
        L_0x0045:
            cm.aptoide.pt.store.StoreError r4 = p015cm.aptoide.p016pt.store.StoreError.PRIVATE_STORE_ERROR
            goto L_0x004a
        L_0x0048:
            cm.aptoide.pt.store.StoreError r4 = p015cm.aptoide.p016pt.store.StoreError.PRIVATE_STORE_WRONG_CREDENTIALS
        L_0x004a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.store.StoreUtils.getErrorType(java.lang.String):cm.aptoide.pt.store.StoreError");
    }

    @Deprecated
    public static BaseRequestWithStore.StoreCredentials getStoreCredentials(long j, StoreCredentialsProvider storeCredentialsProvider) {
        return storeCredentialsProvider.get(j);
    }

    @Deprecated
    public static BaseRequestWithStore.StoreCredentials getStoreCredentialsFromUrl(String str, StoreCredentialsProvider storeCredentialsProvider) {
        return storeCredentialsProvider.fromUrl(str);
    }

    public static HashMapNotNull<String, List<String>> getSubscribedStoresAuthMap(RoomStoreRepository roomStoreRepository) {
        HashMapNotNull<String, List<String>> hashMapNotNull = new HashMapNotNull<>();
        for (RoomStore roomStore : roomStoreRepository.getAll().mo18695j().mo41034a()) {
            if (roomStore.getPasswordSha1() != null) {
                hashMapNotNull.put(roomStore.getStoreName(), new LinkedList(Arrays.asList(new String[]{roomStore.getUsername(), roomStore.getPasswordSha1()})));
            }
        }
        if (hashMapNotNull.size() > 0) {
            return hashMapNotNull;
        }
        return null;
    }

    public static List<Long> getSubscribedStoresIds(RoomStoreRepository roomStoreRepository) {
        LinkedList linkedList = new LinkedList();
        for (RoomStore storeId : roomStoreRepository.getAll().mo18695j().mo41034a()) {
            linkedList.add(Long.valueOf(storeId.getStoreId()));
        }
        return linkedList;
    }

    private static boolean isPrivateCredentialsSet(GetStoreMetaRequest getStoreMetaRequest) {
        return (((GetHomeMetaRequest.Body) getStoreMetaRequest.getBody()).getStoreUser() == null || ((GetHomeMetaRequest.Body) getStoreMetaRequest.getBody()).getStorePassSha1() == null) ? false : true;
    }

    public static Single<Boolean> isSubscribedStore(String str, RoomStoreRepository roomStoreRepository) {
        return roomStoreRepository.get(str).mo18569d(C4241c.f7331f);
    }

    private static C5328b saveStore(Store store, GetStoreMetaRequest getStoreMetaRequest, RoomStoreRepository roomStoreRepository) {
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
        return roomStoreRepository.save(roomStore);
    }

    public static ArrayList<String> split(List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (list != null) {
            for (String split : list) {
                arrayList.add(split(split));
            }
        }
        return arrayList;
    }

    @Deprecated
    public static C5368e<GetStoreMeta> subscribeStore(GetStoreMetaRequest getStoreMetaRequest, AptoideAccountManager aptoideAccountManager, String str, String str2, RoomStoreRepository roomStoreRepository) {
        return getStoreMetaRequest.observe().mo18687f(new C4240b(aptoideAccountManager, str, str2)).mo18687f(new C4245g(getStoreMetaRequest, roomStoreRepository));
    }

    public static void unSubscribeStore(String str, AptoideAccountManager aptoideAccountManager, StoreCredentialsProvider storeCredentialsProvider, RoomStoreRepository roomStoreRepository) {
        aptoideAccountManager.accountStatus().mo18694j(C4250l.f7346f).mo18669c().mo18664b(new C4246h(aptoideAccountManager, str, storeCredentialsProvider)).mo18689g(new C4243e(roomStoreRepository, str)).mo18693i();
    }

    @Deprecated
    public static BaseRequestWithStore.StoreCredentials getStoreCredentials(String str, StoreCredentialsProvider storeCredentialsProvider) {
        return storeCredentialsProvider.get(str);
    }

    public static String split(String str) {
        Logger instance = Logger.getInstance();
        instance.mo12975d("Aptoide-RepoUtils", "Splitting " + str);
        return formatRepoUri(str).split("http://")[1].split("\\.store")[0].split("\\.bazaarandroid.com")[0];
    }

    @Deprecated
    public static void subscribeStore(GetStoreMetaRequest getStoreMetaRequest, SuccessRequestListener<GetStoreMeta> successRequestListener, ErrorRequestListener errorRequestListener, AptoideAccountManager aptoideAccountManager, String str, String str2, RoomStoreRepository roomStoreRepository) {
        subscribeStore(getStoreMetaRequest, aptoideAccountManager, str, str2, roomStoreRepository).mo18644a(C5376a.m10346b()).mo18655a(new C4242d(successRequestListener), (C5378b<Throwable>) new C4244f(errorRequestListener));
    }

    /* renamed from: a */
    static /* synthetic */ C5368e m7271a(GetStoreMeta getStoreMeta, AptoideAccountManager aptoideAccountManager, String str, String str2, Account account) {
        if (!BaseV7Response.Info.Status.OK.equals(getStoreMeta.getInfo().getStatus())) {
            return C5368e.m10238a((Throwable) new Exception("Something went wrong while getting store meta"));
        }
        if (account.isLoggedIn()) {
            return aptoideAccountManager.subscribeStore(getStoreMeta.getData().getName(), str, str2).mo18593a(C5368e.m10257c(getStoreMeta));
        }
        return C5368e.m10257c(getStoreMeta);
    }

    /* renamed from: a */
    static /* synthetic */ void m7275a(SuccessRequestListener successRequestListener, GetStoreMeta getStoreMeta) {
        if (successRequestListener != null) {
            successRequestListener.call(getStoreMeta);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m7274a(ErrorRequestListener errorRequestListener, Throwable th) {
        if (errorRequestListener != null) {
            errorRequestListener.onError(th);
        }
        CrashReport.getInstance().log(th);
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m7268a(RoomStore roomStore) {
        return Boolean.valueOf(roomStore != null);
    }

    /* renamed from: a */
    static /* synthetic */ void m7273a(AptoideAccountManager aptoideAccountManager, String str, StoreCredentialsProvider storeCredentialsProvider, Boolean bool) {
        if (bool.booleanValue()) {
            aptoideAccountManager.unsubscribeStore(str, storeCredentialsProvider.get(str).getName(), storeCredentialsProvider.get(str).getPasswordSha1());
        }
    }
}
