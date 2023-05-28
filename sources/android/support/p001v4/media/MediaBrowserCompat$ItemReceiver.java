package android.support.p001v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.support.p001v4.p002os.ResultReceiver;

/* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
class MediaBrowserCompat$ItemReceiver extends ResultReceiver {

    /* renamed from: h */
    private final String f5h;

    /* renamed from: i */
    private final C0010b f6i;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3a(int i, Bundle bundle) {
        MediaSessionCompat.m55a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            this.f6i.mo37a(this.f5h);
            return;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
            this.f6i.mo36a((MediaBrowserCompat$MediaItem) parcelable);
        } else {
            this.f6i.mo37a(this.f5h);
        }
    }
}
