package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.UUID;

@TargetApi(16)
@Deprecated
public final class zzgl implements zzhn {

    /* renamed from: a */
    private final Context f21879a;

    /* renamed from: b */
    private final Uri f21880b;

    /* renamed from: c */
    private MediaExtractor f21881c;

    /* renamed from: d */
    private zzho[] f21882d;

    /* renamed from: e */
    private boolean f21883e;

    /* renamed from: f */
    private int f21884f;

    /* renamed from: g */
    private int[] f21885g;

    /* renamed from: h */
    private boolean[] f21886h;

    /* renamed from: i */
    private long f21887i;

    public zzgl(Context context, Uri uri, Map<String, String> map, int i) {
        zzkh.m24659b(zzkq.f22154a >= 16);
        this.f21884f = 2;
        zzkh.m24656a(context);
        this.f21879a = context;
        zzkh.m24656a(uri);
        this.f21880b = uri;
    }

    /* renamed from: a */
    public final int mo29296a(int i, long j, zzhk zzhk, zzhm zzhm, boolean z) {
        Map<UUID, byte[]> psshInfo;
        zzkh.m24659b(this.f21883e);
        zzkh.m24659b(this.f21885g[i] != 0);
        boolean[] zArr = this.f21886h;
        if (zArr[i]) {
            zArr[i] = false;
            return -5;
        } else if (z) {
            return -2;
        } else {
            if (this.f21885g[i] != 2) {
                zzhk.f21959a = zzhj.m24476a(this.f21881c.getTrackFormat(i));
                zzhx zzhx = null;
                if (zzkq.f22154a >= 18 && (psshInfo = this.f21881c.getPsshInfo()) != null && !psshInfo.isEmpty()) {
                    zzhx = new zzhx("video/mp4");
                    zzhx.mo29359a(psshInfo);
                }
                zzhk.f21960b = zzhx;
                this.f21885g[i] = 2;
                return -4;
            }
            int sampleTrackIndex = this.f21881c.getSampleTrackIndex();
            if (sampleTrackIndex == i) {
                ByteBuffer byteBuffer = zzhm.f21962b;
                if (byteBuffer != null) {
                    int position = byteBuffer.position();
                    int readSampleData = this.f21881c.readSampleData(zzhm.f21962b, position);
                    zzhm.f21963c = readSampleData;
                    zzhm.f21962b.position(position + readSampleData);
                } else {
                    zzhm.f21963c = 0;
                }
                zzhm.f21965e = this.f21881c.getSampleTime();
                zzhm.f21964d = this.f21881c.getSampleFlags() & 3;
                if (zzhm.mo29338a()) {
                    zzhm.f21961a.mo29294a(this.f21881c);
                }
                this.f21887i = -1;
                this.f21881c.advance();
                return -3;
            } else if (sampleTrackIndex < 0) {
                return -1;
            } else {
                return -2;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo29301b(long j) throws IOException {
        if (!this.f21883e) {
            MediaExtractor mediaExtractor = new MediaExtractor();
            this.f21881c = mediaExtractor;
            Context context = this.f21879a;
            if (context != null) {
                mediaExtractor.setDataSource(context, this.f21880b, (Map) null);
            } else {
                mediaExtractor.setDataSource((FileDescriptor) null, 0, 0);
            }
            int[] iArr = new int[this.f21881c.getTrackCount()];
            this.f21885g = iArr;
            this.f21886h = new boolean[iArr.length];
            this.f21882d = new zzho[iArr.length];
            for (int i = 0; i < this.f21885g.length; i++) {
                MediaFormat trackFormat = this.f21881c.getTrackFormat(i);
                this.f21882d[i] = new zzho(trackFormat.getString("mime"), trackFormat.containsKey("durationUs") ? trackFormat.getLong("durationUs") : -1);
            }
            this.f21883e = true;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo29302c(int i) {
        zzkh.m24659b(this.f21883e);
        zzkh.m24659b(this.f21885g[i] != 0);
        this.f21881c.unselectTrack(i);
        this.f21886h[i] = false;
        this.f21885g[i] = 0;
    }

    /* renamed from: c */
    public final boolean mo29303c(long j) {
        return true;
    }

    /* renamed from: d */
    public final int mo29304d() {
        zzkh.m24659b(this.f21883e);
        return this.f21885g.length;
    }

    /* renamed from: e */
    public final void mo29305e(int i, long j) {
        zzkh.m24659b(this.f21883e);
        boolean z = false;
        zzkh.m24659b(this.f21885g[i] == 0);
        this.f21885g[i] = 1;
        this.f21881c.selectTrack(i);
        if (j != 0) {
            z = true;
        }
        m24385a(j, z);
    }

    /* renamed from: b */
    public final zzho mo29300b(int i) {
        zzkh.m24659b(this.f21883e);
        return this.f21882d[i];
    }

    /* renamed from: b */
    public final long mo29299b() {
        zzkh.m24659b(this.f21883e);
        long cachedDuration = this.f21881c.getCachedDuration();
        if (cachedDuration == -1) {
            return -1;
        }
        long sampleTime = this.f21881c.getSampleTime();
        if (sampleTime == -1) {
            return -3;
        }
        return sampleTime + cachedDuration;
    }

    /* renamed from: a */
    public final void mo29298a(long j) {
        zzkh.m24659b(this.f21883e);
        m24385a(j, false);
    }

    /* renamed from: a */
    public final void mo29297a() {
        MediaExtractor mediaExtractor;
        zzkh.m24659b(this.f21884f > 0);
        int i = this.f21884f - 1;
        this.f21884f = i;
        if (i == 0 && (mediaExtractor = this.f21881c) != null) {
            mediaExtractor.release();
            this.f21881c = null;
        }
    }

    /* renamed from: a */
    private final void m24385a(long j, boolean z) {
        if (z || this.f21887i != j) {
            this.f21887i = j;
            int i = 0;
            this.f21881c.seekTo(j, 0);
            while (true) {
                int[] iArr = this.f21885g;
                if (i < iArr.length) {
                    if (iArr[i] != 0) {
                        this.f21886h[i] = true;
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
