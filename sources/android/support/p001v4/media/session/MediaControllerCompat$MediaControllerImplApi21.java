package android.support.p001v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.session.C0026b;
import android.support.p001v4.media.session.C0029c;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.core.app.C0367e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a */
    final Object f34a;

    /* renamed from: b */
    private final List<C0029c> f35b;

    /* renamed from: c */
    private HashMap<C0029c, C0017a> f36c;

    /* renamed from: d */
    final MediaSessionCompat.Token f37d;

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: f */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f38f;

        /* access modifiers changed from: protected */
        public void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = (MediaControllerCompat$MediaControllerImplApi21) this.f38f.get();
            if (mediaControllerCompat$MediaControllerImplApi21 != null && bundle != null) {
                synchronized (mediaControllerCompat$MediaControllerImplApi21.f34a) {
                    mediaControllerCompat$MediaControllerImplApi21.f37d.mo59a(C0026b.C0027a.m77a(C0367e.m1796a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerCompat$MediaControllerImplApi21.f37d.mo58a(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                    mediaControllerCompat$MediaControllerImplApi21.mo40a();
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
    private static class C0017a extends C0029c.C0032c {
        C0017a(C0029c cVar) {
            super(cVar);
        }

        /* renamed from: a */
        public void mo42a(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            throw new AssertionError();
        }

        /* renamed from: e */
        public void mo46e(Bundle bundle) throws RemoteException {
            throw new AssertionError();
        }

        /* renamed from: z */
        public void mo47z() throws RemoteException {
            throw new AssertionError();
        }

        /* renamed from: a */
        public void mo45a(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            throw new AssertionError();
        }

        /* renamed from: a */
        public void mo44a(CharSequence charSequence) throws RemoteException {
            throw new AssertionError();
        }

        /* renamed from: a */
        public void mo43a(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo40a() {
        if (this.f37d.mo57a() != null) {
            for (C0029c next : this.f35b) {
                C0017a aVar = new C0017a(next);
                this.f36c.put(next, aVar);
                next.f71c = aVar;
                try {
                    this.f37d.mo57a().mo89a(aVar);
                    next.mo92a(13, (Object) null, (Bundle) null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            }
            this.f35b.clear();
        }
    }
}
