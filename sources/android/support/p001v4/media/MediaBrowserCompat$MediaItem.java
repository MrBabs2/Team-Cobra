package android.support.p001v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0004a();

    /* renamed from: f */
    private final int f7f;

    /* renamed from: g */
    private final MediaDescriptionCompat f8g;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
    static class C0004a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        C0004a() {
        }

        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        public MediaBrowserCompat$MediaItem[] newArray(int i) {
            return new MediaBrowserCompat$MediaItem[i];
        }
    }

    MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f7f = parcel.readInt();
        this.f8g = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{" + "mFlags=" + this.f7f + ", mDescription=" + this.f8g + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7f);
        this.f8g.writeToParcel(parcel, i);
    }
}
