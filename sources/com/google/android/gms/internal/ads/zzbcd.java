package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.google.android.gms.ads.internal.zzk;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@TargetApi(14)
@zzard
public final class zzbcd extends zzbco implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {

    /* renamed from: v */
    private static final Map<Integer, String> f18760v = new HashMap();

    /* renamed from: h */
    private final zzbdg f18761h;

    /* renamed from: i */
    private final boolean f18762i;

    /* renamed from: j */
    private int f18763j = 0;

    /* renamed from: k */
    private int f18764k = 0;

    /* renamed from: l */
    private MediaPlayer f18765l;

    /* renamed from: m */
    private Uri f18766m;

    /* renamed from: n */
    private int f18767n;

    /* renamed from: o */
    private int f18768o;

    /* renamed from: p */
    private int f18769p;

    /* renamed from: q */
    private int f18770q;

    /* renamed from: r */
    private zzbdd f18771r;

    /* renamed from: s */
    private boolean f18772s;

    /* renamed from: t */
    private int f18773t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public zzbcn f18774u;

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            f18760v.put(-1004, "MEDIA_ERROR_IO");
            f18760v.put(-1007, "MEDIA_ERROR_MALFORMED");
            f18760v.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            f18760v.put(-110, "MEDIA_ERROR_TIMED_OUT");
            f18760v.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        f18760v.put(100, "MEDIA_ERROR_SERVER_DIED");
        f18760v.put(1, "MEDIA_ERROR_UNKNOWN");
        f18760v.put(1, "MEDIA_INFO_UNKNOWN");
        f18760v.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        f18760v.put(701, "MEDIA_INFO_BUFFERING_START");
        f18760v.put(702, "MEDIA_INFO_BUFFERING_END");
        f18760v.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        f18760v.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        f18760v.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (Build.VERSION.SDK_INT >= 19) {
            f18760v.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            f18760v.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public zzbcd(Context context, boolean z, boolean z2, zzbde zzbde, zzbdg zzbdg) {
        super(context);
        setSurfaceTextureListener(this);
        this.f18761h = zzbdg;
        this.f18772s = z;
        this.f18762i = z2;
        zzbdg.mo27980a(this);
    }

    /* renamed from: f */
    private final void m20583f() {
        zzawz.m20167e("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f18766m != null && surfaceTexture != null) {
            m20582a(false);
            try {
                zzk.zzlw();
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.f18765l = mediaPlayer;
                mediaPlayer.setOnBufferingUpdateListener(this);
                this.f18765l.setOnCompletionListener(this);
                this.f18765l.setOnErrorListener(this);
                this.f18765l.setOnInfoListener(this);
                this.f18765l.setOnPreparedListener(this);
                this.f18765l.setOnVideoSizeChangedListener(this);
                if (this.f18772s) {
                    zzbdd zzbdd = new zzbdd(getContext());
                    this.f18771r = zzbdd;
                    zzbdd.mo27972a(surfaceTexture, getWidth(), getHeight());
                    this.f18771r.start();
                    SurfaceTexture c = this.f18771r.mo27974c();
                    if (c != null) {
                        surfaceTexture = c;
                    } else {
                        this.f18771r.mo27973b();
                        this.f18771r = null;
                    }
                }
                this.f18765l.setDataSource(getContext(), this.f18766m);
                zzk.zzlx();
                this.f18765l.setSurface(new Surface(surfaceTexture));
                this.f18765l.setAudioStreamType(3);
                this.f18765l.setScreenOnWhilePlaying(true);
                this.f18765l.prepareAsync();
                m20586i(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException e) {
                String valueOf = String.valueOf(this.f18766m);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Failed to initialize MediaPlayer at ");
                sb.append(valueOf);
                zzbad.m20522c(sb.toString(), e);
                onError(this.f18765l, 1, 0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034 A[LOOP:0: B:10:0x0034->B:15:0x004f, LOOP_START] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m20584g() {
        /*
            r8 = this;
            boolean r0 = r8.f18762i
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r8.m20585h()
            if (r0 == 0) goto L_0x0059
            android.media.MediaPlayer r0 = r8.f18765l
            int r0 = r0.getCurrentPosition()
            if (r0 <= 0) goto L_0x0059
            int r0 = r8.f18764k
            r1 = 3
            if (r0 == r1) goto L_0x0059
            java.lang.String r0 = "AdMediaPlayerView nudging MediaPlayer"
            com.google.android.gms.internal.ads.zzawz.m20167e(r0)
            r0 = 0
            r8.m20581a((float) r0)
            android.media.MediaPlayer r0 = r8.f18765l
            r0.start()
            android.media.MediaPlayer r0 = r8.f18765l
            int r0 = r0.getCurrentPosition()
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzk.zzln()
            long r1 = r1.mo25498b()
        L_0x0034:
            boolean r3 = r8.m20585h()
            if (r3 == 0) goto L_0x0051
            android.media.MediaPlayer r3 = r8.f18765l
            int r3 = r3.getCurrentPosition()
            if (r3 != r0) goto L_0x0051
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzk.zzln()
            long r3 = r3.mo25498b()
            long r3 = r3 - r1
            r5 = 250(0xfa, double:1.235E-321)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0034
        L_0x0051:
            android.media.MediaPlayer r0 = r8.f18765l
            r0.pause()
            r8.mo16504a()
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbcd.m20584g():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f18763j;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m20585h() {
        /*
            r2 = this;
            android.media.MediaPlayer r0 = r2.f18765l
            if (r0 == 0) goto L_0x000f
            int r0 = r2.f18763j
            r1 = -1
            if (r0 == r1) goto L_0x000f
            if (r0 == 0) goto L_0x000f
            r1 = 1
            if (r0 == r1) goto L_0x000f
            return r1
        L_0x000f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbcd.m20585h():boolean");
    }

    /* renamed from: i */
    private final void m20586i(int i) {
        if (i == 3) {
            this.f18761h.mo27983c();
            this.f8025g.mo27988b();
        } else if (this.f18763j == 3) {
            this.f18761h.mo27984d();
            this.f8025g.mo27989c();
        }
        this.f18763j = i;
    }

    /* renamed from: a */
    public final void mo16506a(zzbcn zzbcn) {
        this.f18774u = zzbcn;
    }

    /* renamed from: b */
    public final void mo16508b() {
        zzawz.m20167e("AdMediaPlayerView pause");
        if (m20585h() && this.f18765l.isPlaying()) {
            this.f18765l.pause();
            m20586i(4);
            zzaxi.f18651h.post(new C8055v7(this));
        }
        this.f18764k = 4;
    }

    /* renamed from: c */
    public final void mo16510c() {
        zzawz.m20167e("AdMediaPlayerView play");
        if (m20585h()) {
            this.f18765l.start();
            m20586i(3);
            this.f8024f.mo27965a();
            zzaxi.f18651h.post(new C8018u7(this));
        }
        this.f18764k = 3;
    }

    /* renamed from: d */
    public final void mo16512d() {
        zzawz.m20167e("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f18765l;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f18765l.release();
            this.f18765l = null;
            m20586i(0);
            this.f18764k = 0;
        }
        this.f18761h.mo27979a();
    }

    /* renamed from: e */
    public final String mo16514e() {
        String str = this.f18772s ? " spherical" : "";
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    public final int getCurrentPosition() {
        if (m20585h()) {
            return this.f18765l.getCurrentPosition();
        }
        return 0;
    }

    public final int getDuration() {
        if (m20585h()) {
            return this.f18765l.getDuration();
        }
        return -1;
    }

    public final int getVideoHeight() {
        MediaPlayer mediaPlayer = this.f18765l;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    public final int getVideoWidth() {
        MediaPlayer mediaPlayer = this.f18765l;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        zzawz.m20167e("AdMediaPlayerView completion");
        m20586i(5);
        this.f18764k = 5;
        zzaxi.f18651h.post(new C7833p7(this));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = f18760v.get(Integer.valueOf(i));
        String str2 = f18760v.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zzbad.m20523d(sb.toString());
        m20586i(-1);
        this.f18764k = -1;
        zzaxi.f18651h.post(new C7870q7(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = f18760v.get(Integer.valueOf(i));
        String str2 = f18760v.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zzawz.m20167e(sb.toString());
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int defaultSize = TextureView.getDefaultSize(this.f18767n, i);
        int defaultSize2 = TextureView.getDefaultSize(this.f18768o, i2);
        if (this.f18767n > 0 && this.f18768o > 0 && this.f18771r == null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                int i5 = this.f18767n;
                int i6 = i5 * size2;
                int i7 = this.f18768o;
                if (i6 < size * i7) {
                    defaultSize = (i5 * size2) / i7;
                    defaultSize2 = size2;
                } else {
                    if (i5 * size2 > size * i7) {
                        i4 = (i7 * size) / i5;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                }
            } else if (mode == 1073741824) {
                int i8 = (this.f18768o * size) / this.f18767n;
                if (mode2 != Integer.MIN_VALUE || i8 <= size2) {
                    i4 = i8;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else if (mode2 == 1073741824) {
                int i9 = (this.f18767n * size2) / this.f18768o;
                if (mode != Integer.MIN_VALUE || i9 <= size) {
                    defaultSize = i9;
                    defaultSize2 = size2;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                int i10 = this.f18767n;
                int i11 = this.f18768o;
                if (mode2 != Integer.MIN_VALUE || i11 <= size2) {
                    defaultSize2 = i11;
                } else {
                    i10 = (i10 * size2) / i11;
                    defaultSize2 = size2;
                }
                if (mode != Integer.MIN_VALUE || i10 <= size) {
                    defaultSize = i10;
                } else {
                    i4 = (this.f18768o * size) / this.f18767n;
                }
            }
            defaultSize = size;
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        zzbdd zzbdd = this.f18771r;
        if (zzbdd != null) {
            zzbdd.mo27971a(defaultSize, defaultSize2);
        }
        if (Build.VERSION.SDK_INT == 16) {
            int i12 = this.f18769p;
            if ((i12 > 0 && i12 != defaultSize) || ((i3 = this.f18770q) > 0 && i3 != defaultSize2)) {
                m20584g();
            }
            this.f18769p = defaultSize;
            this.f18770q = defaultSize2;
        }
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        zzawz.m20167e("AdMediaPlayerView prepared");
        m20586i(2);
        this.f18761h.mo27981b();
        zzaxi.f18651h.post(new C7796o7(this));
        this.f18767n = mediaPlayer.getVideoWidth();
        this.f18768o = mediaPlayer.getVideoHeight();
        int i = this.f18773t;
        if (i != 0) {
            mo16509b(i);
        }
        m20584g();
        int i2 = this.f18767n;
        int i3 = this.f18768o;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        zzbad.m20521c(sb.toString());
        if (this.f18764k == 3) {
            mo16510c();
        }
        mo16504a();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzawz.m20167e("AdMediaPlayerView surface created");
        m20583f();
        zzaxi.f18651h.post(new C7907r7(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzawz.m20167e("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f18765l;
        if (mediaPlayer != null && this.f18773t == 0) {
            this.f18773t = mediaPlayer.getCurrentPosition();
        }
        zzbdd zzbdd = this.f18771r;
        if (zzbdd != null) {
            zzbdd.mo27973b();
        }
        zzaxi.f18651h.post(new C7981t7(this));
        m20582a(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzawz.m20167e("AdMediaPlayerView surface changed");
        boolean z = true;
        boolean z2 = this.f18764k == 3;
        if (!(this.f18767n == i && this.f18768o == i2)) {
            z = false;
        }
        if (this.f18765l != null && z2 && z) {
            int i3 = this.f18773t;
            if (i3 != 0) {
                mo16509b(i3);
            }
            mo16510c();
        }
        zzbdd zzbdd = this.f18771r;
        if (zzbdd != null) {
            zzbdd.mo27971a(i, i2);
        }
        zzaxi.f18651h.post(new C7944s7(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f18761h.mo27982b(this);
        this.f8024f.mo27966a(surfaceTexture, this.f18774u);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        zzawz.m20167e(sb.toString());
        this.f18767n = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f18768o = videoHeight;
        if (this.f18767n != 0 && videoHeight != 0) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        zzawz.m20167e(sb.toString());
        zzaxi.f18651h.post(new C7759n7(this, i));
        super.onWindowVisibilityChanged(i);
    }

    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        zzvv a = zzvv.m25450a(parse);
        if (a == null || a.f22854f != null) {
            if (a != null) {
                parse = Uri.parse(a.f22854f);
            }
            this.f18766m = parse;
            this.f18773t = 0;
            m20583f();
            requestLayout();
            invalidate();
        }
    }

    public final String toString() {
        String name = zzbcd.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    /* renamed from: a */
    private final void m20582a(boolean z) {
        zzawz.m20167e("AdMediaPlayerView release");
        zzbdd zzbdd = this.f18771r;
        if (zzbdd != null) {
            zzbdd.mo27973b();
            this.f18771r = null;
        }
        MediaPlayer mediaPlayer = this.f18765l;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f18765l.release();
            this.f18765l = null;
            m20586i(0);
            if (z) {
                this.f18764k = 0;
                this.f18764k = 0;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo27913h(int i) {
        zzbcn zzbcn = this.f18774u;
        if (zzbcn != null) {
            zzbcn.onWindowVisibilityChanged(i);
        }
    }

    /* renamed from: b */
    public final void mo16509b(int i) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        zzawz.m20167e(sb.toString());
        if (m20585h()) {
            this.f18765l.seekTo(i);
            this.f18773t = 0;
            return;
        }
        this.f18773t = i;
    }

    /* renamed from: a */
    public final void mo16505a(float f, float f2) {
        zzbdd zzbdd = this.f18771r;
        if (zzbdd != null) {
            zzbdd.mo27970a(f, f2);
        }
    }

    /* renamed from: a */
    public final void mo16504a() {
        m20581a(this.f8025g.mo27985a());
    }

    /* renamed from: a */
    private final void m20581a(float f) {
        MediaPlayer mediaPlayer = this.f18765l;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        } else {
            zzbad.m20523d("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }
}
