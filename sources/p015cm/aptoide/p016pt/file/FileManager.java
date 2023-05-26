package p015cm.aptoide.p016pt.file;

import p015cm.aptoide.p016pt.dataprovider.cache.L2Cache;
import p015cm.aptoide.p016pt.downloadmanager.AptoideDownloadManager;
import p015cm.aptoide.p016pt.utils.FileUtils;
import p123rx.C5368e;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.file.FileManager */
public class FileManager {
    private final String[] cacheFolders;
    private final CacheHelper cacheHelper;
    private final AptoideDownloadManager downloadManager;
    private final FileUtils fileUtils;
    private final L2Cache httpClientCache;

    public FileManager(CacheHelper cacheHelper2, FileUtils fileUtils2, String[] strArr, AptoideDownloadManager aptoideDownloadManager, L2Cache l2Cache) {
        this.cacheHelper = cacheHelper2;
        this.fileUtils = fileUtils2;
        this.cacheFolders = strArr;
        this.downloadManager = aptoideDownloadManager;
        this.httpClientCache = l2Cache;
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo11512a(boolean z, Long l) {
        if (l.longValue() <= 0 || !z) {
            return C5368e.m10257c(l);
        }
        return this.downloadManager.invalidateDatabase().mo18593a(C5368e.m10257c(l));
    }

    /* renamed from: b */
    public /* synthetic */ Single mo11514b(Long l) {
        return this.downloadManager.invalidateDatabase().mo18583a(Single.m10119a(l));
    }

    public C5368e<Long> deleteCache(boolean z) {
        return this.fileUtils.deleteFolder(this.cacheFolders).mo18687f(new C2701g(this, z)).mo18664b(new C2702h(this));
    }

    public Single<Long> purgeCache() {
        return this.cacheHelper.cleanCache().mo18700m().mo18559a(new C2700f(this));
    }

    /* renamed from: a */
    public /* synthetic */ void mo11513a(Long l) {
        this.httpClientCache.clean();
    }
}
