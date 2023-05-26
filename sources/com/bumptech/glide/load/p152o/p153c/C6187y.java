package com.bumptech.glide.load.p152o.p153c;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C6024h;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.C6028j;
import com.bumptech.glide.load.engine.C5992u;
import com.bumptech.glide.load.engine.p147z.C6004e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.o.c.y */
/* compiled from: VideoDecoder */
public class C6187y<T> implements C6028j<T, Bitmap> {

    /* renamed from: d */
    public static final C6024h<Long> f11312d = C6024h.m12063a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C6188a());

    /* renamed from: e */
    public static final C6024h<Integer> f11313e = C6024h.m12063a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C6189b());

    /* renamed from: f */
    private static final C6191d f11314f = new C6191d();

    /* renamed from: a */
    private final C6192e<T> f11315a;

    /* renamed from: b */
    private final C6004e f11316b;

    /* renamed from: c */
    private final C6191d f11317c;

    /* renamed from: com.bumptech.glide.load.o.c.y$a */
    /* compiled from: VideoDecoder */
    class C6188a implements C6024h.C6026b<Long> {

        /* renamed from: a */
        private final ByteBuffer f11318a = ByteBuffer.allocate(8);

        C6188a() {
        }

        /* renamed from: a */
        public void mo20314a(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f11318a) {
                this.f11318a.position(0);
                messageDigest.update(this.f11318a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.o.c.y$b */
    /* compiled from: VideoDecoder */
    class C6189b implements C6024h.C6026b<Integer> {

        /* renamed from: a */
        private final ByteBuffer f11319a = ByteBuffer.allocate(4);

        C6189b() {
        }

        /* renamed from: a */
        public void mo20314a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f11319a) {
                    this.f11319a.position(0);
                    messageDigest.update(this.f11319a.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.o.c.y$c */
    /* compiled from: VideoDecoder */
    private static final class C6190c implements C6192e<AssetFileDescriptor> {
        private C6190c() {
        }

        /* synthetic */ C6190c(C6188a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo20489a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* renamed from: com.bumptech.glide.load.o.c.y$d */
    /* compiled from: VideoDecoder */
    static class C6191d {
        C6191d() {
        }

        /* renamed from: a */
        public MediaMetadataRetriever mo20490a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: com.bumptech.glide.load.o.c.y$e */
    /* compiled from: VideoDecoder */
    interface C6192e<T> {
        /* renamed from: a */
        void mo20489a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* renamed from: com.bumptech.glide.load.o.c.y$f */
    /* compiled from: VideoDecoder */
    static final class C6193f implements C6192e<ParcelFileDescriptor> {
        C6193f() {
        }

        /* renamed from: a */
        public void mo20489a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    C6187y(C6004e eVar, C6192e<T> eVar2) {
        this(eVar, eVar2, f11314f);
    }

    /* renamed from: a */
    public static C6028j<AssetFileDescriptor, Bitmap> m12527a(C6004e eVar) {
        return new C6187y(eVar, new C6190c((C6188a) null));
    }

    /* renamed from: b */
    public static C6028j<ParcelFileDescriptor, Bitmap> m12529b(C6004e eVar) {
        return new C6187y(eVar, new C6193f());
    }

    /* renamed from: a */
    public boolean mo20320a(T t, C6027i iVar) {
        return true;
    }

    C6187y(C6004e eVar, C6192e<T> eVar2, C6191d dVar) {
        this.f11316b = eVar;
        this.f11315a = eVar2;
        this.f11317c = dVar;
    }

    @TargetApi(27)
    /* renamed from: b */
    private static Bitmap m12528b(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, C6159k kVar) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i4 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i4;
            }
            float b = kVar.mo20455b(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * b), Math.round(b * ((float) parseInt2)));
        } catch (Throwable th) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode frame on oreo+", th);
            return null;
        }
    }

    /* renamed from: a */
    public C5992u<Bitmap> mo20319a(T t, int i, int i2, C6027i iVar) throws IOException {
        long longValue = ((Long) iVar.mo20316a(f11312d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) iVar.mo20316a(f11313e);
            if (num == null) {
                num = 2;
            }
            C6159k kVar = (C6159k) iVar.mo20316a(C6159k.f11266f);
            if (kVar == null) {
                kVar = C6159k.f11265e;
            }
            C6159k kVar2 = kVar;
            MediaMetadataRetriever a = this.f11317c.mo20490a();
            try {
                this.f11315a.mo20489a(a, t);
                Bitmap a2 = m12526a(a, longValue, num.intValue(), i, i2, kVar2);
                a.release();
                return C6148d.m12395a(a2, this.f11316b);
            } catch (RuntimeException e) {
                throw new IOException(e);
            } catch (Throwable th) {
                a.release();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }

    /* renamed from: a */
    private static Bitmap m12526a(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, C6159k kVar) {
        Bitmap b = (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || kVar == C6159k.f11264d) ? null : m12528b(mediaMetadataRetriever, j, i, i2, i3, kVar);
        return b == null ? m12525a(mediaMetadataRetriever, j, i) : b;
    }

    /* renamed from: a */
    private static Bitmap m12525a(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }
}
