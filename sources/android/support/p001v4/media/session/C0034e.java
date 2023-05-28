package android.support.p001v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.e */
/* compiled from: MediaControllerCompatApi21 */
class C0034e {

    /* renamed from: android.support.v4.media.session.e$a */
    /* compiled from: MediaControllerCompatApi21 */
    public interface C0035a {
        /* renamed from: a */
        void mo101a(int i, int i2, int i3, int i4, int i5);

        /* renamed from: a */
        void mo102a(CharSequence charSequence);

        /* renamed from: a */
        void mo103a(Object obj);

        /* renamed from: a */
        void mo104a(String str, Bundle bundle);

        /* renamed from: a */
        void mo105a(List<?> list);

        /* renamed from: b */
        void mo106b(Object obj);

        /* renamed from: e */
        void mo107e(Bundle bundle);

        /* renamed from: z */
        void mo108z();
    }

    /* renamed from: android.support.v4.media.session.e$b */
    /* compiled from: MediaControllerCompatApi21 */
    static class C0036b<T extends C0035a> extends MediaController.Callback {

        /* renamed from: a */
        protected final T f74a;

        public C0036b(T t) {
            this.f74a = t;
        }

        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f74a.mo101a(playbackInfo.getPlaybackType(), C0037c.m120b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m55a(bundle);
            this.f74a.mo107e(bundle);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f74a.mo103a((Object) mediaMetadata);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f74a.mo106b(playbackState);
        }

        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f74a.mo105a((List<?>) list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f74a.mo102a(charSequence);
        }

        public void onSessionDestroyed() {
            this.f74a.mo108z();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m55a(bundle);
            this.f74a.mo104a(str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.e$c */
    /* compiled from: MediaControllerCompatApi21 */
    public static class C0037c {
        /* renamed from: a */
        public static AudioAttributes m119a(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m120b(Object obj) {
            return m118a(m119a(obj));
        }

        /* renamed from: a */
        private static int m118a(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            int usage = audioAttributes.getUsage();
            if (usage == 13) {
                return 1;
            }
            switch (usage) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
    }

    /* renamed from: a */
    public static Object m109a(C0035a aVar) {
        return new C0036b(aVar);
    }
}
