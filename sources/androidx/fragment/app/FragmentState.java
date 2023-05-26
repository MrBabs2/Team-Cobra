package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.C0514f;

@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C0452a();

    /* renamed from: f */
    final String f1950f;

    /* renamed from: g */
    final String f1951g;

    /* renamed from: h */
    final boolean f1952h;

    /* renamed from: i */
    final int f1953i;

    /* renamed from: j */
    final int f1954j;

    /* renamed from: k */
    final String f1955k;

    /* renamed from: l */
    final boolean f1956l;

    /* renamed from: m */
    final boolean f1957m;

    /* renamed from: n */
    final boolean f1958n;

    /* renamed from: o */
    final Bundle f1959o;

    /* renamed from: p */
    final boolean f1960p;

    /* renamed from: q */
    final int f1961q;

    /* renamed from: r */
    Bundle f1962r;

    /* renamed from: s */
    Fragment f1963s;

    /* renamed from: androidx.fragment.app.FragmentState$a */
    static class C0452a implements Parcelable.Creator<FragmentState> {
        C0452a() {
        }

        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    FragmentState(Fragment fragment) {
        this.f1950f = fragment.getClass().getName();
        this.f1951g = fragment.mWho;
        this.f1952h = fragment.mFromLayout;
        this.f1953i = fragment.mFragmentId;
        this.f1954j = fragment.mContainerId;
        this.f1955k = fragment.mTag;
        this.f1956l = fragment.mRetainInstance;
        this.f1957m = fragment.mRemoving;
        this.f1958n = fragment.mDetached;
        this.f1959o = fragment.mArguments;
        this.f1960p = fragment.mHidden;
        this.f1961q = fragment.mMaxState.ordinal();
    }

    /* renamed from: a */
    public Fragment mo2669a(ClassLoader classLoader, C0460f fVar) {
        if (this.f1963s == null) {
            Bundle bundle = this.f1959o;
            if (bundle != null) {
                bundle.setClassLoader(classLoader);
            }
            Fragment a = fVar.mo2785a(classLoader, this.f1950f);
            this.f1963s = a;
            a.setArguments(this.f1959o);
            Bundle bundle2 = this.f1962r;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
                this.f1963s.mSavedFragmentState = this.f1962r;
            } else {
                this.f1963s.mSavedFragmentState = new Bundle();
            }
            Fragment fragment = this.f1963s;
            fragment.mWho = this.f1951g;
            fragment.mFromLayout = this.f1952h;
            fragment.mRestored = true;
            fragment.mFragmentId = this.f1953i;
            fragment.mContainerId = this.f1954j;
            fragment.mTag = this.f1955k;
            fragment.mRetainInstance = this.f1956l;
            fragment.mRemoving = this.f1957m;
            fragment.mDetached = this.f1958n;
            fragment.mHidden = this.f1960p;
            fragment.mMaxState = C0514f.C0516b.values()[this.f1961q];
            if (C0466i.f1978M) {
                Log.v("FragmentManager", "Instantiated fragment " + this.f1963s);
            }
        }
        return this.f1963s;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1950f);
        sb.append(" (");
        sb.append(this.f1951g);
        sb.append(")}:");
        if (this.f1952h) {
            sb.append(" fromLayout");
        }
        if (this.f1954j != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1954j));
        }
        String str = this.f1955k;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f1955k);
        }
        if (this.f1956l) {
            sb.append(" retainInstance");
        }
        if (this.f1957m) {
            sb.append(" removing");
        }
        if (this.f1958n) {
            sb.append(" detached");
        }
        if (this.f1960p) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1950f);
        parcel.writeString(this.f1951g);
        parcel.writeInt(this.f1952h ? 1 : 0);
        parcel.writeInt(this.f1953i);
        parcel.writeInt(this.f1954j);
        parcel.writeString(this.f1955k);
        parcel.writeInt(this.f1956l ? 1 : 0);
        parcel.writeInt(this.f1957m ? 1 : 0);
        parcel.writeInt(this.f1958n ? 1 : 0);
        parcel.writeBundle(this.f1959o);
        parcel.writeInt(this.f1960p ? 1 : 0);
        parcel.writeBundle(this.f1962r);
        parcel.writeInt(this.f1961q);
    }

    FragmentState(Parcel parcel) {
        this.f1950f = parcel.readString();
        this.f1951g = parcel.readString();
        boolean z = true;
        this.f1952h = parcel.readInt() != 0;
        this.f1953i = parcel.readInt();
        this.f1954j = parcel.readInt();
        this.f1955k = parcel.readString();
        this.f1956l = parcel.readInt() != 0;
        this.f1957m = parcel.readInt() != 0;
        this.f1958n = parcel.readInt() != 0;
        this.f1959o = parcel.readBundle();
        this.f1960p = parcel.readInt() == 0 ? false : z;
        this.f1962r = parcel.readBundle();
        this.f1961q = parcel.readInt();
    }
}
