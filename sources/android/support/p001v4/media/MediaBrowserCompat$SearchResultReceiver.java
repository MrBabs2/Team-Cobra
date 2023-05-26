package android.support.p001v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.support.p001v4.p002os.ResultReceiver;
import java.util.ArrayList;

/* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
class MediaBrowserCompat$SearchResultReceiver extends ResultReceiver {

    /* renamed from: h */
    private final String f9h;

    /* renamed from: i */
    private final Bundle f10i;

    /* renamed from: j */
    private final C0011c f11j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3a(int i, Bundle bundle) {
        MediaSessionCompat.m55a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
            this.f11j.mo38a(this.f9h, this.f10i);
            return;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        ArrayList arrayList = null;
        if (parcelableArray != null) {
            arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
            }
        }
        this.f11j.mo39a(this.f9h, this.f10i, arrayList);
    }
}
