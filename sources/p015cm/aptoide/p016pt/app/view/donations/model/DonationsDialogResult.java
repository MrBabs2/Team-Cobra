package p015cm.aptoide.p016pt.app.view.donations.model;

/* renamed from: cm.aptoide.pt.app.view.donations.model.DonationsDialogResult */
public class DonationsDialogResult {
    private String nickname;
    private String packageName;
    private float value;

    public DonationsDialogResult(String str, String str2, float f) {
        this.packageName = str;
        this.nickname = str2;
        this.value = f;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public float getValue() {
        return this.value;
    }
}
