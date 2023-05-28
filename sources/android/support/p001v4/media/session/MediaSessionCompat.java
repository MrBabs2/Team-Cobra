package android.support.p001v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.p001v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0019a();

        /* renamed from: f */
        ResultReceiver f42f;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        static class C0019a implements Parcelable.Creator<ResultReceiverWrapper> {
            C0019a() {
            }

            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f42f = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f42f.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0020a();

        /* renamed from: f */
        private final Object f43f;

        /* renamed from: g */
        private C0026b f44g;

        /* renamed from: h */
        private Bundle f45h;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        static class C0020a implements Parcelable.Creator<Token> {
            C0020a() {
            }

            public Token createFromParcel(Parcel parcel) {
                Object obj;
                if (Build.VERSION.SDK_INT >= 21) {
                    obj = parcel.readParcelable((ClassLoader) null);
                } else {
                    obj = parcel.readStrongBinder();
                }
                return new Token(obj);
            }

            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        Token(Object obj) {
            this(obj, (C0026b) null, (Bundle) null);
        }

        /* renamed from: a */
        public C0026b mo57a() {
            return this.f44g;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f43f;
            if (obj2 != null) {
                Object obj3 = token.f43f;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            } else if (token.f43f == null) {
                return true;
            } else {
                return false;
            }
        }

        public int hashCode() {
            Object obj = this.f43f;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f43f, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f43f);
            }
        }

        Token(Object obj, C0026b bVar, Bundle bundle) {
            this.f43f = obj;
            this.f44g = bVar;
            this.f45h = bundle;
        }

        /* renamed from: a */
        public void mo59a(C0026b bVar) {
            this.f44g = bVar;
        }

        /* renamed from: a */
        public void mo58a(Bundle bundle) {
            this.f45h = bundle;
        }
    }

    /* renamed from: a */
    public static void m55a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0018a();

        /* renamed from: f */
        private final MediaDescriptionCompat f39f;

        /* renamed from: g */
        private final long f40g;

        /* renamed from: h */
        private Object f41h;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        static class C0018a implements Parcelable.Creator<QueueItem> {
            C0018a() {
            }

            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j != -1) {
                this.f39f = mediaDescriptionCompat;
                this.f40g = j;
                this.f41h = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        /* renamed from: a */
        public static QueueItem m56a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new QueueItem(obj, MediaDescriptionCompat.m8a(C0038f.m121a(obj)), C0038f.m122b(obj));
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f39f + ", Id=" + this.f40g + " }";
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f39f.writeToParcel(parcel, i);
            parcel.writeLong(this.f40g);
        }

        /* renamed from: a */
        public static List<QueueItem> m57a(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object a : list) {
                arrayList.add(m56a((Object) a));
            }
            return arrayList;
        }

        QueueItem(Parcel parcel) {
            this.f39f = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f40g = parcel.readLong();
        }
    }
}
