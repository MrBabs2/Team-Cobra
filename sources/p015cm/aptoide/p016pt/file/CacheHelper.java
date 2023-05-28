package p015cm.aptoide.p016pt.file;

import java.io.File;
import java.util.List;
import p015cm.aptoide.p016pt.downloadmanager.CacheManager;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.utils.FileUtils;
import p123rx.C5368e;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.file.CacheHelper */
public class CacheHelper implements CacheManager {
    public static String TAG = "CacheHelper";
    public static final int VALUE_TO_CONVERT_MB_TO_BYTES = 1048576;
    private final FileUtils fileUtils;
    private final List<FolderToManage> foldersToCleanPath;
    private long maxCacheSize;

    /* renamed from: cm.aptoide.pt.file.CacheHelper$FolderToManage */
    public static class FolderToManage {
        final long cacheTime;
        final File folder;

        public FolderToManage(File file, long j) {
            this.folder = file;
            this.cacheTime = j;
        }

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof FolderToManage;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FolderToManage)) {
                return false;
            }
            FolderToManage folderToManage = (FolderToManage) obj;
            if (!folderToManage.canEqual(this)) {
                return false;
            }
            File folder2 = getFolder();
            File folder3 = folderToManage.getFolder();
            if (folder2 != null ? folder2.equals(folder3) : folder3 == null) {
                return getCacheTime() == folderToManage.getCacheTime();
            }
            return false;
        }

        public long getCacheTime() {
            return this.cacheTime;
        }

        public File getFolder() {
            return this.folder;
        }

        public int hashCode() {
            int i;
            File folder2 = getFolder();
            if (folder2 == null) {
                i = 43;
            } else {
                i = folder2.hashCode();
            }
            long cacheTime2 = getCacheTime();
            return ((i + 59) * 59) + ((int) (cacheTime2 ^ (cacheTime2 >>> 32)));
        }

        public String toString() {
            return "CacheHelper.FolderToManage(folder=" + getFolder() + ", cacheTime=" + getCacheTime() + ")";
        }
    }

    public CacheHelper(long j, List<FolderToManage> list, FileUtils fileUtils2) {
        this.foldersToCleanPath = list;
        this.maxCacheSize = j * 1048576;
        this.fileUtils = fileUtils2;
    }

    /* renamed from: b */
    static /* synthetic */ Iterable m5774b(List list) {
        return list;
    }

    /* renamed from: c */
    static /* synthetic */ Long m5775c(List list) {
        long j = 0;
        for (int i = 0; i < list.size(); i++) {
            j += ((Long) list.get(i)).longValue();
        }
        Logger instance = Logger.getInstance();
        String str = TAG;
        instance.mo12975d(str, "Cache cleaned: " + AptoideUtils.StringU.formatBytes(j, false));
        return Long.valueOf(j);
    }

    private boolean checkIfInFoldersToClean(List<FolderToManage> list, File file) {
        for (FolderToManage folder : list) {
            if (folder.getFolder().getAbsolutePath().equals(file.getAbsolutePath())) {
                return true;
            }
        }
        return false;
    }

    private long removeFile(long j, long j2, File file) {
        if (j2 - file.lastModified() > j) {
            long length = file.length();
            Logger instance = Logger.getInstance();
            String str = TAG;
            instance.mo12975d(str, "removeFile: " + file.getAbsolutePath());
            if (file.delete()) {
                return length;
            }
        }
        return 0;
    }

    private long removeFilesFromDir(long j, long j2, long j3, File file) {
        long removeOldFiles = removeOldFiles(file, j, j2);
        File[] listFiles = file.listFiles();
        return ((listFiles == null || listFiles.length <= 0) && file.delete()) ? j3 + removeOldFiles : j3;
    }

    private long removeOldFiles(File file, long j, long j2) {
        long j3;
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0;
        }
        long j4 = 0;
        for (File file2 : listFiles) {
            if (!checkIfInFoldersToClean(this.foldersToCleanPath, file2)) {
                if (file2.isDirectory()) {
                    j3 = removeFilesFromDir(j, j2, j4, file2);
                } else {
                    j3 = removeFile(j, j2, file2);
                }
                j4 += j3;
            }
        }
        return j4;
    }

    private boolean shouldClean(List<FolderToManage> list, long j) {
        long j2 = 0;
        for (int i = 0; i < list.size(); i++) {
            j2 += this.fileUtils.dirSize(this.foldersToCleanPath.get(i).getFolder());
        }
        if (j2 > j) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo11504a(List list) {
        return Boolean.valueOf(shouldClean(list, this.maxCacheSize));
    }

    public C5368e<Long> cleanCache() {
        return C5368e.m10257c(this.foldersToCleanPath).mo18681d(new C2695a(this)).mo18691h(C2699e.f5536f).mo18681d(C2696b.f5532f).mo18694j(new C2698d(this, System.currentTimeMillis())).mo18698l().mo18694j(C2697c.f5533f).mo18662b(Schedulers.m10352io());
    }

    /* renamed from: a */
    public /* synthetic */ Long mo11505a(long j, FolderToManage folderToManage) {
        return Long.valueOf(removeOldFiles(folderToManage.getFolder(), folderToManage.getCacheTime(), j));
    }
}
