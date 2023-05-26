package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class AbsSavedState implements Parcelable {
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new C0442a();

    /* renamed from: g */
    public static final AbsSavedState f1904g = new AbsSavedState() {
    };

    /* renamed from: f */
    private final Parcelable f1905f;

    /* renamed from: androidx.customview.view.AbsSavedState$a */
    static class C0442a implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        C0442a() {
        }

        public AbsSavedState[] newArray(int i) {
            return new AbsSavedState[i];
        }

        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f1904g;
            }
            throw new IllegalStateException("superState must be null");
        }

        public AbsSavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }
    }

    /* renamed from: a */
    public final Parcelable mo2480a() {
        return this.f1905f;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1905f, i);
    }

    private AbsSavedState() {
        this.f1905f = null;
    }

    protected AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f1905f = parcelable == f1904g ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f1905f = readParcelable == null ? f1904g : readParcelable;
    }
}
