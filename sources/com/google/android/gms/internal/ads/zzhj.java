package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzhj {

    /* renamed from: a */
    public final String f21946a;

    /* renamed from: b */
    private final int f21947b;

    /* renamed from: c */
    public final long f21948c;

    /* renamed from: d */
    public final int f21949d;

    /* renamed from: e */
    public final int f21950e;

    /* renamed from: f */
    public final float f21951f;

    /* renamed from: g */
    private final int f21952g;

    /* renamed from: h */
    private final int f21953h;

    /* renamed from: i */
    public final List<byte[]> f21954i;

    /* renamed from: j */
    private int f21955j;

    /* renamed from: k */
    private int f21956k;

    /* renamed from: l */
    private int f21957l;

    /* renamed from: m */
    private MediaFormat f21958m;

    @TargetApi(16)
    private zzhj(MediaFormat mediaFormat) {
        this.f21958m = mediaFormat;
        this.f21946a = mediaFormat.getString("mime");
        this.f21947b = m24475a(mediaFormat, "max-input-size");
        this.f21949d = m24475a(mediaFormat, "width");
        this.f21950e = m24475a(mediaFormat, "height");
        this.f21952g = m24475a(mediaFormat, "channel-count");
        this.f21953h = m24475a(mediaFormat, "sample-rate");
        this.f21951f = mediaFormat.containsKey("com.google.android.videos.pixelWidthHeightRatio") ? mediaFormat.getFloat("com.google.android.videos.pixelWidthHeightRatio") : -1.0f;
        this.f21954i = new ArrayList();
        int i = 0;
        while (true) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            if (!mediaFormat.containsKey(sb.toString())) {
                break;
            }
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("csd-");
            sb2.append(i);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(sb2.toString());
            byte[] bArr = new byte[byteBuffer.limit()];
            byteBuffer.get(bArr);
            this.f21954i.add(bArr);
            byteBuffer.flip();
            i++;
        }
        this.f21948c = mediaFormat.containsKey("durationUs") ? mediaFormat.getLong("durationUs") : -1;
        this.f21955j = -1;
        this.f21956k = -1;
    }

    @TargetApi(16)
    /* renamed from: a */
    public static zzhj m24476a(MediaFormat mediaFormat) {
        return new zzhj(mediaFormat);
    }

    /* renamed from: b */
    public static zzhj m24482b(String str, int i, long j, int i2, int i3, List<byte[]> list) {
        return new zzhj(str, i, j, -1, -1, -1.0f, i2, i3, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhj.class == obj.getClass()) {
            zzhj zzhj = (zzhj) obj;
            if (this.f21947b == zzhj.f21947b && this.f21949d == zzhj.f21949d && this.f21950e == zzhj.f21950e && this.f21951f == zzhj.f21951f && this.f21955j == zzhj.f21955j && this.f21956k == zzhj.f21956k && this.f21952g == zzhj.f21952g && this.f21953h == zzhj.f21953h && zzkq.m24690a((Object) this.f21946a, (Object) zzhj.f21946a) && this.f21954i.size() == zzhj.f21954i.size()) {
                for (int i = 0; i < this.f21954i.size(); i++) {
                    if (!Arrays.equals(this.f21954i.get(i), zzhj.f21954i.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f21957l == 0) {
            String str = this.f21946a;
            int hashCode = (((((((((((((((((((str == null ? 0 : str.hashCode()) + 527) * 31) + this.f21947b) * 31) + this.f21949d) * 31) + this.f21950e) * 31) + Float.floatToRawIntBits(this.f21951f)) * 31) + ((int) this.f21948c)) * 31) + this.f21955j) * 31) + this.f21956k) * 31) + this.f21952g) * 31) + this.f21953h;
            for (int i = 0; i < this.f21954i.size(); i++) {
                hashCode = (hashCode * 31) + Arrays.hashCode(this.f21954i.get(i));
            }
            this.f21957l = hashCode;
        }
        return this.f21957l;
    }

    public final String toString() {
        String str = this.f21946a;
        int i = this.f21947b;
        int i2 = this.f21949d;
        int i3 = this.f21950e;
        float f = this.f21951f;
        int i4 = this.f21952g;
        int i5 = this.f21953h;
        long j = this.f21948c;
        int i6 = this.f21955j;
        int i7 = this.f21956k;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 143);
        sb.append("MediaFormat(");
        sb.append(str);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(i6);
        sb.append(", ");
        sb.append(i7);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public static zzhj m24479a(String str, int i, long j, int i2, int i3, List<byte[]> list) {
        return m24478a(str, -1, j, i2, i3, 1.0f, list);
    }

    /* renamed from: b */
    public static zzhj m24481b() {
        return new zzhj("application/ttml+xml", -1, -1, -1, -1, -1.0f, -1, -1, (List<byte[]>) null);
    }

    /* renamed from: a */
    public static zzhj m24478a(String str, int i, long j, int i2, int i3, float f, List<byte[]> list) {
        return new zzhj(str, -1, j, i2, i3, f, -1, -1, list);
    }

    /* renamed from: a */
    public static zzhj m24477a(String str, int i, int i2, int i3, List<byte[]> list) {
        return m24482b(str, -1, -1, i2, i3, list);
    }

    @TargetApi(16)
    /* renamed from: a */
    public final MediaFormat mo29334a() {
        if (this.f21958m == null) {
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", this.f21946a);
            m24480a(mediaFormat, "max-input-size", this.f21947b);
            m24480a(mediaFormat, "width", this.f21949d);
            m24480a(mediaFormat, "height", this.f21950e);
            m24480a(mediaFormat, "channel-count", this.f21952g);
            m24480a(mediaFormat, "sample-rate", this.f21953h);
            float f = this.f21951f;
            if (f != -1.0f) {
                mediaFormat.setFloat("com.google.android.videos.pixelWidthHeightRatio", f);
            }
            for (int i = 0; i < this.f21954i.size(); i++) {
                StringBuilder sb = new StringBuilder(15);
                sb.append("csd-");
                sb.append(i);
                mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(this.f21954i.get(i)));
            }
            long j = this.f21948c;
            if (j != -1) {
                mediaFormat.setLong("durationUs", j);
            }
            m24480a(mediaFormat, "max-width", this.f21955j);
            m24480a(mediaFormat, "max-height", this.f21956k);
            this.f21958m = mediaFormat;
        }
        return this.f21958m;
    }

    private zzhj(String str, int i, long j, int i2, int i3, float f, int i4, int i5, List<byte[]> list) {
        this.f21946a = str;
        this.f21947b = i;
        this.f21948c = j;
        this.f21949d = i2;
        this.f21950e = i3;
        this.f21951f = f;
        this.f21952g = i4;
        this.f21953h = i5;
        this.f21954i = list == null ? Collections.emptyList() : list;
        this.f21955j = -1;
        this.f21956k = -1;
    }

    @TargetApi(16)
    /* renamed from: a */
    private static final void m24480a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    private static final int m24475a(MediaFormat mediaFormat, String str) {
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getInteger(str);
        }
        return -1;
    }
}
