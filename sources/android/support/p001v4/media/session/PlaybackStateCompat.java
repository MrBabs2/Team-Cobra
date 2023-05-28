package android.support.p001v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.media.session.C0039g;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0023a();

    /* renamed from: f */
    final int f51f;

    /* renamed from: g */
    final long f52g;

    /* renamed from: h */
    final long f53h;

    /* renamed from: i */
    final float f54i;

    /* renamed from: j */
    final long f55j;

    /* renamed from: k */
    final int f56k;

    /* renamed from: l */
    final CharSequence f57l;

    /* renamed from: m */
    final long f58m;

    /* renamed from: n */
    List<CustomAction> f59n;

    /* renamed from: o */
    final long f60o;

    /* renamed from: p */
    final Bundle f61p;

    /* renamed from: q */
    private Object f62q;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    static class C0023a implements Parcelable.Creator<PlaybackStateCompat> {
        C0023a() {
        }

        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f51f = i;
        this.f52g = j;
        this.f53h = j2;
        this.f54i = f;
        this.f55j = j3;
        this.f56k = i2;
        this.f57l = charSequence;
        this.f58m = j4;
        this.f59n = new ArrayList(list);
        this.f60o = j5;
        this.f61p = bundle;
    }

    /* renamed from: a */
    public static PlaybackStateCompat m61a(Object obj) {
        ArrayList arrayList;
        Object obj2 = obj;
        Bundle bundle = null;
        if (obj2 == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> d = C0039g.m126d(obj);
        if (d != null) {
            ArrayList arrayList2 = new ArrayList(d.size());
            for (Object a : d) {
                arrayList2.add(CustomAction.m62a(a));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = C0041h.m136a(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0039g.m131i(obj), C0039g.m130h(obj), C0039g.m125c(obj), C0039g.m129g(obj), C0039g.m123a(obj), 0, C0039g.m127e(obj), C0039g.m128f(obj), arrayList, C0039g.m124b(obj), bundle);
        playbackStateCompat.f62q = obj2;
        return playbackStateCompat;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f51f + ", position=" + this.f52g + ", buffered position=" + this.f53h + ", speed=" + this.f54i + ", updated=" + this.f58m + ", actions=" + this.f55j + ", error code=" + this.f56k + ", error message=" + this.f57l + ", custom actions=" + this.f59n + ", active item id=" + this.f60o + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f51f);
        parcel.writeLong(this.f52g);
        parcel.writeFloat(this.f54i);
        parcel.writeLong(this.f58m);
        parcel.writeLong(this.f53h);
        parcel.writeLong(this.f55j);
        TextUtils.writeToParcel(this.f57l, parcel, i);
        parcel.writeTypedList(this.f59n);
        parcel.writeLong(this.f60o);
        parcel.writeBundle(this.f61p);
        parcel.writeInt(this.f56k);
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0022a();

        /* renamed from: f */
        private final String f63f;

        /* renamed from: g */
        private final CharSequence f64g;

        /* renamed from: h */
        private final int f65h;

        /* renamed from: i */
        private final Bundle f66i;

        /* renamed from: j */
        private Object f67j;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        static class C0022a implements Parcelable.Creator<CustomAction> {
            C0022a() {
            }

            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f63f = str;
            this.f64g = charSequence;
            this.f65h = i;
            this.f66i = bundle;
        }

        /* renamed from: a */
        public static CustomAction m62a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(C0039g.C0040a.m132a(obj), C0039g.C0040a.m135d(obj), C0039g.C0040a.m134c(obj), C0039g.C0040a.m133b(obj));
            customAction.f67j = obj;
            return customAction;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f64g + ", mIcon=" + this.f65h + ", mExtras=" + this.f66i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f63f);
            TextUtils.writeToParcel(this.f64g, parcel, i);
            parcel.writeInt(this.f65h);
            parcel.writeBundle(this.f66i);
        }

        CustomAction(Parcel parcel) {
            this.f63f = parcel.readString();
            this.f64g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f65h = parcel.readInt();
            this.f66i = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f51f = parcel.readInt();
        this.f52g = parcel.readLong();
        this.f54i = parcel.readFloat();
        this.f58m = parcel.readLong();
        this.f53h = parcel.readLong();
        this.f55j = parcel.readLong();
        this.f57l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f59n = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f60o = parcel.readLong();
        this.f61p = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f56k = parcel.readInt();
    }
}
