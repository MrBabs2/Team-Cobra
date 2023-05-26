package android.support.p001v4.media;

import android.os.Bundle;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.support.p001v4.p002os.ResultReceiver;
import android.util.Log;

/* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
class MediaBrowserCompat$CustomActionResultReceiver extends ResultReceiver {

    /* renamed from: h */
    private final String f2h;

    /* renamed from: i */
    private final Bundle f3i;

    /* renamed from: j */
    private final C0009a f4j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3a(int i, Bundle bundle) {
        if (this.f4j != null) {
            MediaSessionCompat.m55a(bundle);
            if (i == -1) {
                this.f4j.mo33a(this.f2h, this.f3i, bundle);
            } else if (i == 0) {
                this.f4j.mo35c(this.f2h, this.f3i, bundle);
            } else if (i != 1) {
                Log.w("MediaBrowserCompat", "Unknown result code: " + i + " (extras=" + this.f3i + ", resultData=" + bundle + ")");
            } else {
                this.f4j.mo34b(this.f2h, this.f3i, bundle);
            }
        }
    }
}
