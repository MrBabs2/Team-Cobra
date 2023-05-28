package android.support.p001v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.session.C0024a;
import android.support.p001v4.media.session.C0034e;
import android.support.p001v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
/* compiled from: MediaControllerCompat */
public abstract class C0029c implements IBinder.DeathRecipient {

    /* renamed from: a */
    final Object f69a;

    /* renamed from: b */
    C0030a f70b;

    /* renamed from: c */
    C0024a f71c;

    /* renamed from: android.support.v4.media.session.c$a */
    /* compiled from: MediaControllerCompat */
    private class C0030a extends Handler {
    }

    public C0029c() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f69a = C0034e.m109a(new C0031b(this));
        } else {
            this.f71c = new C0032c(this);
        }
    }

    /* renamed from: a */
    public void mo91a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo92a(int i, Object obj, Bundle bundle) {
        C0030a aVar = this.f70b;
        if (aVar != null) {
            Message obtainMessage = aVar.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    /* renamed from: a */
    public void mo93a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo94a(MediaMetadataCompat mediaMetadataCompat) {
    }

    /* renamed from: a */
    public void mo95a(PlaybackStateCompat playbackStateCompat) {
    }

    /* renamed from: a */
    public void mo96a(C0033d dVar) {
    }

    /* renamed from: a */
    public void mo97a(CharSequence charSequence) {
    }

    /* renamed from: a */
    public void mo98a(String str, Bundle bundle) {
    }

    /* renamed from: a */
    public void mo99a(List<MediaSessionCompat.QueueItem> list) {
    }

    public void binderDied() {
        mo92a(8, (Object) null, (Bundle) null);
    }

    /* renamed from: android.support.v4.media.session.c$c */
    /* compiled from: MediaControllerCompat */
    private static class C0032c extends C0024a.C0025a {

        /* renamed from: f */
        private final WeakReference<C0029c> f73f;

        C0032c(C0029c cVar) {
            this.f73f = new WeakReference<>(cVar);
        }

        /* renamed from: W */
        public void mo80W() throws RemoteException {
            C0029c cVar = (C0029c) this.f73f.get();
            if (cVar != null) {
                cVar.mo92a(13, (Object) null, (Bundle) null);
            }
        }

        /* renamed from: a */
        public void mo81a(PlaybackStateCompat playbackStateCompat) throws RemoteException {
            C0029c cVar = (C0029c) this.f73f.get();
            if (cVar != null) {
                cVar.mo92a(2, playbackStateCompat, (Bundle) null);
            }
        }

        /* renamed from: c */
        public void mo82c(String str, Bundle bundle) throws RemoteException {
            C0029c cVar = (C0029c) this.f73f.get();
            if (cVar != null) {
                cVar.mo92a(1, str, bundle);
            }
        }

        /* renamed from: e */
        public void mo46e(Bundle bundle) throws RemoteException {
            C0029c cVar = (C0029c) this.f73f.get();
            if (cVar != null) {
                cVar.mo92a(7, bundle, (Bundle) null);
            }
        }

        /* renamed from: j */
        public void mo83j(boolean z) throws RemoteException {
            C0029c cVar = (C0029c) this.f73f.get();
            if (cVar != null) {
                cVar.mo92a(11, Boolean.valueOf(z), (Bundle) null);
            }
        }

        /* renamed from: k */
        public void mo84k(boolean z) throws RemoteException {
        }

        /* renamed from: n */
        public void mo85n(int i) throws RemoteException {
            C0029c cVar = (C0029c) this.f73f.get();
            if (cVar != null) {
                cVar.mo92a(9, Integer.valueOf(i), (Bundle) null);
            }
        }

        /* renamed from: p */
        public void mo86p(int i) throws RemoteException {
            C0029c cVar = (C0029c) this.f73f.get();
            if (cVar != null) {
                cVar.mo92a(12, Integer.valueOf(i), (Bundle) null);
            }
        }

        /* renamed from: z */
        public void mo47z() throws RemoteException {
            C0029c cVar = (C0029c) this.f73f.get();
            if (cVar != null) {
                cVar.mo92a(8, (Object) null, (Bundle) null);
            }
        }

        /* renamed from: a */
        public void mo42a(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            C0029c cVar = (C0029c) this.f73f.get();
            if (cVar != null) {
                cVar.mo92a(3, mediaMetadataCompat, (Bundle) null);
            }
        }

        /* renamed from: a */
        public void mo45a(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            C0029c cVar = (C0029c) this.f73f.get();
            if (cVar != null) {
                cVar.mo92a(5, list, (Bundle) null);
            }
        }

        /* renamed from: a */
        public void mo44a(CharSequence charSequence) throws RemoteException {
            C0029c cVar = (C0029c) this.f73f.get();
            if (cVar != null) {
                cVar.mo92a(6, charSequence, (Bundle) null);
            }
        }

        /* renamed from: a */
        public void mo43a(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            C0029c cVar = (C0029c) this.f73f.get();
            if (cVar != null) {
                cVar.mo92a(4, parcelableVolumeInfo != null ? new C0033d(parcelableVolumeInfo.f46f, parcelableVolumeInfo.f47g, parcelableVolumeInfo.f48h, parcelableVolumeInfo.f49i, parcelableVolumeInfo.f50j) : null, (Bundle) null);
            }
        }
    }

    /* renamed from: android.support.v4.media.session.c$b */
    /* compiled from: MediaControllerCompat */
    private static class C0031b implements C0034e.C0035a {

        /* renamed from: a */
        private final WeakReference<C0029c> f72a;

        C0031b(C0029c cVar) {
            this.f72a = new WeakReference<>(cVar);
        }

        /* renamed from: a */
        public void mo104a(String str, Bundle bundle) {
            C0029c cVar = (C0029c) this.f72a.get();
            if (cVar == null) {
                return;
            }
            if (cVar.f71c == null || Build.VERSION.SDK_INT >= 23) {
                cVar.mo98a(str, bundle);
            }
        }

        /* renamed from: b */
        public void mo106b(Object obj) {
            C0029c cVar = (C0029c) this.f72a.get();
            if (cVar != null && cVar.f71c == null) {
                cVar.mo95a(PlaybackStateCompat.m61a(obj));
            }
        }

        /* renamed from: e */
        public void mo107e(Bundle bundle) {
            C0029c cVar = (C0029c) this.f72a.get();
            if (cVar != null) {
                cVar.mo93a(bundle);
            }
        }

        /* renamed from: z */
        public void mo108z() {
            C0029c cVar = (C0029c) this.f72a.get();
            if (cVar != null) {
                cVar.mo91a();
            }
        }

        /* renamed from: a */
        public void mo103a(Object obj) {
            C0029c cVar = (C0029c) this.f72a.get();
            if (cVar != null) {
                cVar.mo94a(MediaMetadataCompat.m19a(obj));
            }
        }

        /* renamed from: a */
        public void mo105a(List<?> list) {
            C0029c cVar = (C0029c) this.f72a.get();
            if (cVar != null) {
                cVar.mo99a(MediaSessionCompat.QueueItem.m57a(list));
            }
        }

        /* renamed from: a */
        public void mo102a(CharSequence charSequence) {
            C0029c cVar = (C0029c) this.f72a.get();
            if (cVar != null) {
                cVar.mo97a(charSequence);
            }
        }

        /* renamed from: a */
        public void mo101a(int i, int i2, int i3, int i4, int i5) {
            C0029c cVar = (C0029c) this.f72a.get();
            if (cVar != null) {
                cVar.mo96a(new C0033d(i, i2, i3, i4, i5));
            }
        }
    }
}
