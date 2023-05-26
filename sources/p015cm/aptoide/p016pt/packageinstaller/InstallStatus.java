package p015cm.aptoide.p016pt.packageinstaller;

/* renamed from: cm.aptoide.pt.packageinstaller.InstallStatus */
public final class InstallStatus {
    private final String message;
    private final String packageName;
    private final Status status;

    /* renamed from: cm.aptoide.pt.packageinstaller.InstallStatus$Status */
    public enum Status {
        INSTALLING,
        SUCCESS,
        FAIL,
        CANCELED,
        UNKNOWN_ERROR,
        WAITING_INSTALL_FEEDBACK
    }

    InstallStatus(Status status2, String str, String str2) {
        this.message = str;
        this.status = status2;
        this.packageName = str2;
    }

    public String getMessage() {
        return this.message;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public Status getStatus() {
        return this.status;
    }
}
