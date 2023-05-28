package p015cm.aptoide.p016pt.promotions;

/* renamed from: cm.aptoide.pt.promotions.ClaimDialogResultWrapper */
public class ClaimDialogResultWrapper {
    private String packageName;
    private boolean status;

    public ClaimDialogResultWrapper(String str, boolean z) {
        this.packageName = str;
        this.status = z;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public boolean isOk() {
        return this.status && !this.packageName.equals("");
    }
}
