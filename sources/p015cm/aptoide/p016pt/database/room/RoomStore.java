package p015cm.aptoide.p016pt.database.room;

/* renamed from: cm.aptoide.pt.database.room.RoomStore */
public class RoomStore {
    public static final String DOWNLOADS = "downloads";
    public static final String ICON_PATH = "iconPath";
    public static final String PASSWORD_SHA1 = "passwordSha1";
    public static final String STORE_ID = "storeId";
    public static final String STORE_NAME = "storeName";
    public static final String THEME = "theme";
    public static final String USERNAME = "username";
    private long downloads;
    private String iconPath;
    private String passwordSha1;
    private long storeId;
    private String storeName;
    private String theme;
    private String username;

    public RoomStore() {
    }

    public long getDownloads() {
        return this.downloads;
    }

    public String getIconPath() {
        return this.iconPath;
    }

    public String getPasswordSha1() {
        return this.passwordSha1;
    }

    public long getStoreId() {
        return this.storeId;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public String getTheme() {
        return this.theme;
    }

    public String getUsername() {
        return this.username;
    }

    public void setDownloads(long j) {
        this.downloads = j;
    }

    public void setIconPath(String str) {
        this.iconPath = str;
    }

    public void setPasswordSha1(String str) {
        this.passwordSha1 = str;
    }

    public void setStoreId(long j) {
        this.storeId = j;
    }

    public void setStoreName(String str) {
        this.storeName = str;
    }

    public void setTheme(String str) {
        this.theme = str;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    public RoomStore(long j, String str, String str2, long j2, String str3, String str4, String str5) {
        this.storeId = j;
        this.iconPath = str;
        this.theme = str2;
        this.downloads = j2;
        this.storeName = str3;
        this.username = str4;
        this.passwordSha1 = str5;
    }
}
