package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.C0485m;
import androidx.lifecycle.C0514f;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C0443a();

    /* renamed from: f */
    final int[] f1906f;

    /* renamed from: g */
    final ArrayList<String> f1907g;

    /* renamed from: h */
    final int[] f1908h;

    /* renamed from: i */
    final int[] f1909i;

    /* renamed from: j */
    final int f1910j;

    /* renamed from: k */
    final int f1911k;

    /* renamed from: l */
    final String f1912l;

    /* renamed from: m */
    final int f1913m;

    /* renamed from: n */
    final int f1914n;

    /* renamed from: o */
    final CharSequence f1915o;

    /* renamed from: p */
    final int f1916p;

    /* renamed from: q */
    final CharSequence f1917q;

    /* renamed from: r */
    final ArrayList<String> f1918r;

    /* renamed from: s */
    final ArrayList<String> f1919s;

    /* renamed from: t */
    final boolean f1920t;

    /* renamed from: androidx.fragment.app.BackStackState$a */
    static class C0443a implements Parcelable.Creator<BackStackState> {
        C0443a() {
        }

        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(C0453a aVar) {
        int size = aVar.f2050a.size();
        this.f1906f = new int[(size * 5)];
        if (aVar.f2057h) {
            this.f1907g = new ArrayList<>(size);
            this.f1908h = new int[size];
            this.f1909i = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C0485m.C0486a aVar2 = aVar.f2050a.get(i);
                int i3 = i2 + 1;
                this.f1906f[i2] = aVar2.f2068a;
                ArrayList<String> arrayList = this.f1907g;
                Fragment fragment = aVar2.f2069b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f1906f;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f2070c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f2071d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f2072e;
                iArr[i6] = aVar2.f2073f;
                this.f1908h[i] = aVar2.f2074g.ordinal();
                this.f1909i[i] = aVar2.f2075h.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.f1910j = aVar.f2055f;
            this.f1911k = aVar.f2056g;
            this.f1912l = aVar.f2059j;
            this.f1913m = aVar.f1966u;
            this.f1914n = aVar.f2060k;
            this.f1915o = aVar.f2061l;
            this.f1916p = aVar.f2062m;
            this.f1917q = aVar.f2063n;
            this.f1918r = aVar.f2064o;
            this.f1919s = aVar.f2065p;
            this.f1920t = aVar.f2066q;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public C0453a mo2485a(C0466i iVar) {
        C0453a aVar = new C0453a(iVar);
        int i = 0;
        int i2 = 0;
        while (i < this.f1906f.length) {
            C0485m.C0486a aVar2 = new C0485m.C0486a();
            int i3 = i + 1;
            aVar2.f2068a = this.f1906f[i];
            if (C0466i.f1978M) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.f1906f[i3]);
            }
            String str = this.f1907g.get(i2);
            if (str != null) {
                aVar2.f2069b = iVar.f1997l.get(str);
            } else {
                aVar2.f2069b = null;
            }
            aVar2.f2074g = C0514f.C0516b.values()[this.f1908h[i2]];
            aVar2.f2075h = C0514f.C0516b.values()[this.f1909i[i2]];
            int[] iArr = this.f1906f;
            int i4 = i3 + 1;
            int i5 = iArr[i3];
            aVar2.f2070c = i5;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            aVar2.f2071d = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            aVar2.f2072e = i9;
            int i10 = iArr[i8];
            aVar2.f2073f = i10;
            aVar.f2051b = i5;
            aVar.f2052c = i7;
            aVar.f2053d = i9;
            aVar.f2054e = i10;
            aVar.mo2949a(aVar2);
            i2++;
            i = i8 + 1;
        }
        aVar.f2055f = this.f1910j;
        aVar.f2056g = this.f1911k;
        aVar.f2059j = this.f1912l;
        aVar.f1966u = this.f1913m;
        aVar.f2057h = true;
        aVar.f2060k = this.f1914n;
        aVar.f2061l = this.f1915o;
        aVar.f2062m = this.f1916p;
        aVar.f2063n = this.f1917q;
        aVar.f2064o = this.f1918r;
        aVar.f2065p = this.f1919s;
        aVar.f2066q = this.f1920t;
        aVar.mo2679a(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1906f);
        parcel.writeStringList(this.f1907g);
        parcel.writeIntArray(this.f1908h);
        parcel.writeIntArray(this.f1909i);
        parcel.writeInt(this.f1910j);
        parcel.writeInt(this.f1911k);
        parcel.writeString(this.f1912l);
        parcel.writeInt(this.f1913m);
        parcel.writeInt(this.f1914n);
        TextUtils.writeToParcel(this.f1915o, parcel, 0);
        parcel.writeInt(this.f1916p);
        TextUtils.writeToParcel(this.f1917q, parcel, 0);
        parcel.writeStringList(this.f1918r);
        parcel.writeStringList(this.f1919s);
        parcel.writeInt(this.f1920t ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.f1906f = parcel.createIntArray();
        this.f1907g = parcel.createStringArrayList();
        this.f1908h = parcel.createIntArray();
        this.f1909i = parcel.createIntArray();
        this.f1910j = parcel.readInt();
        this.f1911k = parcel.readInt();
        this.f1912l = parcel.readString();
        this.f1913m = parcel.readInt();
        this.f1914n = parcel.readInt();
        this.f1915o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1916p = parcel.readInt();
        this.f1917q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1918r = parcel.createStringArrayList();
        this.f1919s = parcel.createStringArrayList();
        this.f1920t = parcel.readInt() != 0;
    }
}
