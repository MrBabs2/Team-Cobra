package p015cm.aptoide.p016pt.permissions;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cm.aptoide.pt.permissions.ApkPermission */
public class ApkPermission implements Parcelable {
    public static final Parcelable.Creator<ApkPermission> CREATOR = new Parcelable.Creator<ApkPermission>() {
        public ApkPermission createFromParcel(Parcel parcel) {
            return new ApkPermission(parcel);
        }

        public ApkPermission[] newArray(int i) {
            return new ApkPermission[i];
        }
    };
    private String description;
    private String name;

    public ApkPermission(String str, String str2) {
        this.name = str;
        this.description = str2;
    }

    public int describeContents() {
        return 0;
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.description);
    }

    protected ApkPermission(Parcel parcel) {
        this.name = parcel.readString();
        this.description = parcel.readString();
    }
}
