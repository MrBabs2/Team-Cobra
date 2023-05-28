package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C0451a();

    /* renamed from: f */
    ArrayList<FragmentState> f1945f;

    /* renamed from: g */
    ArrayList<String> f1946g;

    /* renamed from: h */
    BackStackState[] f1947h;

    /* renamed from: i */
    String f1948i = null;

    /* renamed from: j */
    int f1949j;

    /* renamed from: androidx.fragment.app.FragmentManagerState$a */
    static class C0451a implements Parcelable.Creator<FragmentManagerState> {
        C0451a() {
        }

        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f1945f);
        parcel.writeStringList(this.f1946g);
        parcel.writeTypedArray(this.f1947h, i);
        parcel.writeString(this.f1948i);
        parcel.writeInt(this.f1949j);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f1945f = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f1946g = parcel.createStringArrayList();
        this.f1947h = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f1948i = parcel.readString();
        this.f1949j = parcel.readInt();
    }
}
