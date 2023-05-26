package p015cm.aptoide.accountmanager;

/* renamed from: cm.aptoide.accountmanager.Store */
public class Store {
    private final String avatar;
    private final long downloadCount;

    /* renamed from: id */
    private final long f3367id;
    private final String name;
    private final String password;
    private final boolean publicAccess;
    private final String theme;
    private final String username;

    public Store(long j, String str, long j2, String str2, String str3, String str4, String str5, boolean z) {
        this.downloadCount = j;
        this.avatar = str;
        this.f3367id = j2;
        this.name = str2;
        this.theme = str3;
        this.username = str4;
        this.password = str5;
        this.publicAccess = z;
    }

    public static Store emptyStore() {
        return new Store();
    }

    public String getAvatar() {
        return this.avatar;
    }

    public long getDownloadCount() {
        return this.downloadCount;
    }

    public long getId() {
        return this.f3367id;
    }

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public String getTheme() {
        return this.theme;
    }

    public String getUsername() {
        return this.username;
    }

    public boolean hasPublicAccess() {
        return this.publicAccess;
    }

    private Store() {
        this.downloadCount = 0;
        this.avatar = "";
        this.f3367id = 0;
        this.name = "";
        this.theme = "DEFAULT";
        this.username = "";
        this.password = "";
        this.publicAccess = true;
    }
}
