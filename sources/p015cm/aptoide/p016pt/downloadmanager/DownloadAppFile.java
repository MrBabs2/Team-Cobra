package p015cm.aptoide.p016pt.downloadmanager;

/* renamed from: cm.aptoide.pt.downloadmanager.DownloadAppFile */
public class DownloadAppFile {
    private String alternativeDownloadPath;
    private String downloadMd5;
    private String fileName;
    private FileType fileType;
    private String mainDownloadPath;
    private String packageName;
    private int versionCode;

    /* renamed from: cm.aptoide.pt.downloadmanager.DownloadAppFile$FileType */
    public enum FileType {
        APK(0),
        OBB(1),
        GENERIC(2),
        SPLIT(3);
        
        private final int type;

        private FileType(int i) {
            this.type = i;
        }

        public int getType() {
            return this.type;
        }
    }

    public DownloadAppFile(String str, String str2, String str3, int i, String str4, String str5, FileType fileType2) {
        this.mainDownloadPath = str;
        this.alternativeDownloadPath = str2;
        this.downloadMd5 = str3;
        this.versionCode = i;
        this.packageName = str4;
        this.fileName = str5;
        this.fileType = fileType2;
    }

    public String getAlternativeDownloadPath() {
        return this.alternativeDownloadPath;
    }

    public String getDownloadMd5() {
        return this.downloadMd5;
    }

    public String getFileName() {
        return this.fileName;
    }

    public int getFileType() {
        return this.fileType.getType();
    }

    public String getMainDownloadPath() {
        return this.mainDownloadPath;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getVersionCode() {
        return this.versionCode;
    }
}
