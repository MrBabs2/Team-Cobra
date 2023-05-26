package com.bumptech.glide.load.p152o.p153c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.C5902b;
import com.bumptech.glide.load.C5905e;
import com.bumptech.glide.load.C6024h;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.C5992u;
import com.bumptech.glide.load.engine.p147z.C5999b;
import com.bumptech.glide.load.engine.p147z.C6004e;
import com.bumptech.glide.load.p152o.p153c.C6159k;
import com.bumptech.glide.p166r.C6311f;
import com.bumptech.glide.p166r.C6315j;
import com.bumptech.glide.p166r.C6316k;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.o.c.l */
/* compiled from: Downsampler */
public final class C6167l {

    /* renamed from: f */
    public static final C6024h<C5902b> f11270f = C6024h.m12062a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", C5902b.f10779h);

    /* renamed from: g */
    public static final C6024h<Boolean> f11271g = C6024h.m12062a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false);

    /* renamed from: h */
    public static final C6024h<Boolean> f11272h = C6024h.m12062a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false);

    /* renamed from: i */
    private static final Set<String> f11273i = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: j */
    private static final C6169b f11274j = new C6168a();

    /* renamed from: k */
    private static final Set<ImageHeaderParser.ImageType> f11275k = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));

    /* renamed from: l */
    private static final Queue<BitmapFactory.Options> f11276l = C6316k.m12994a(0);

    /* renamed from: a */
    private final C6004e f11277a;

    /* renamed from: b */
    private final DisplayMetrics f11278b;

    /* renamed from: c */
    private final C5999b f11279c;

    /* renamed from: d */
    private final List<ImageHeaderParser> f11280d;

    /* renamed from: e */
    private final C6175q f11281e = C6175q.m12480a();

    /* renamed from: com.bumptech.glide.load.o.c.l$a */
    /* compiled from: Downsampler */
    class C6168a implements C6169b {
        C6168a() {
        }

        /* renamed from: a */
        public void mo20460a() {
        }

        /* renamed from: a */
        public void mo20461a(C6004e eVar, Bitmap bitmap) {
        }
    }

    /* renamed from: com.bumptech.glide.load.o.c.l$b */
    /* compiled from: Downsampler */
    public interface C6169b {
        /* renamed from: a */
        void mo20460a();

        /* renamed from: a */
        void mo20461a(C6004e eVar, Bitmap bitmap) throws IOException;
    }

    static {
        C6024h<C6159k> hVar = C6159k.f11266f;
    }

    public C6167l(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, C6004e eVar, C5999b bVar) {
        this.f11280d = list;
        C6315j.m12978a(displayMetrics);
        this.f11278b = displayMetrics;
        C6315j.m12978a(eVar);
        this.f11277a = eVar;
        C6315j.m12978a(bVar);
        this.f11279c = bVar;
    }

    /* renamed from: b */
    private static int m12458b(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: c */
    private static int m12461c(double d) {
        return (int) (d + 0.5d);
    }

    /* renamed from: c */
    private static void m12462c(BitmapFactory.Options options) {
        m12463d(options);
        synchronized (f11276l) {
            f11276l.offer(options);
        }
    }

    /* renamed from: d */
    private static void m12463d(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: a */
    public C5992u<Bitmap> mo20456a(InputStream inputStream, int i, int i2, C6027i iVar) throws IOException {
        return mo20457a(inputStream, i, i2, iVar, f11274j);
    }

    /* renamed from: a */
    public boolean mo20458a(InputStream inputStream) {
        return true;
    }

    /* renamed from: a */
    public boolean mo20459a(ByteBuffer byteBuffer) {
        return true;
    }

    /* renamed from: b */
    private static int[] m12460b(InputStream inputStream, BitmapFactory.Options options, C6169b bVar, C6004e eVar) throws IOException {
        options.inJustDecodeBounds = true;
        m12448a(inputStream, options, bVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: a */
    public C5992u<Bitmap> mo20457a(InputStream inputStream, int i, int i2, C6027i iVar, C6169b bVar) throws IOException {
        C6027i iVar2 = iVar;
        C6315j.m12982a(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        byte[] bArr = (byte[]) this.f11279c.mo20263b(65536, byte[].class);
        BitmapFactory.Options a = m12449a();
        a.inTempStorage = bArr;
        C5902b bVar2 = (C5902b) iVar2.mo20316a(f11270f);
        try {
            return C6148d.m12395a(m12447a(inputStream, a, (C6159k) iVar2.mo20316a(C6159k.f11266f), bVar2, iVar2.mo20316a(f11272h) != null && ((Boolean) iVar2.mo20316a(f11272h)).booleanValue(), i, i2, ((Boolean) iVar2.mo20316a(f11271g)).booleanValue(), bVar), this.f11277a);
        } finally {
            m12462c(a);
            this.f11279c.mo20262a(bArr);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.inDensity;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m12459b(android.graphics.BitmapFactory.Options r1) {
        /*
            int r0 = r1.inTargetDensity
            if (r0 <= 0) goto L_0x000c
            int r1 = r1.inDensity
            if (r1 <= 0) goto L_0x000c
            if (r0 == r1) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p152o.p153c.C6167l.m12459b(android.graphics.BitmapFactory$Options):boolean");
    }

    /* renamed from: a */
    private Bitmap m12447a(InputStream inputStream, BitmapFactory.Options options, C6159k kVar, C5902b bVar, boolean z, int i, int i2, boolean z2, C6169b bVar2) throws IOException {
        C6167l lVar;
        int i3;
        int i4;
        int i5;
        InputStream inputStream2 = inputStream;
        BitmapFactory.Options options2 = options;
        C6169b bVar3 = bVar2;
        long a = C6311f.m12965a();
        int[] b = m12460b(inputStream2, options2, bVar3, this.f11277a);
        boolean z3 = false;
        int i6 = b[0];
        int i7 = b[1];
        String str = options2.outMimeType;
        boolean z4 = (i6 == -1 || i7 == -1) ? false : z;
        int a2 = C5905e.m11673a(this.f11280d, inputStream2, this.f11279c);
        int a3 = C6183w.m12502a(a2);
        boolean b2 = C6183w.m12515b(a2);
        int i8 = i;
        int i9 = i2;
        int i10 = i8 == Integer.MIN_VALUE ? i6 : i8;
        int i11 = i9 == Integer.MIN_VALUE ? i7 : i9;
        ImageHeaderParser.ImageType b3 = C5905e.m11675b(this.f11280d, inputStream2, this.f11279c);
        C6004e eVar = this.f11277a;
        ImageHeaderParser.ImageType imageType = b3;
        m12455a(b3, inputStream, bVar2, eVar, kVar, a3, i6, i7, i10, i11, options);
        int i12 = a2;
        String str2 = str;
        int i13 = i7;
        int i14 = i6;
        C6169b bVar4 = bVar3;
        BitmapFactory.Options options3 = options2;
        m12456a(inputStream, bVar, z4, b2, options, i10, i11);
        if (Build.VERSION.SDK_INT >= 19) {
            z3 = true;
        }
        if (options3.inSampleSize == 1 || z3) {
            lVar = this;
            if (lVar.m12457a(imageType)) {
                if (i14 < 0 || i13 < 0 || !z2 || !z3) {
                    float f = m12459b(options) ? ((float) options3.inTargetDensity) / ((float) options3.inDensity) : 1.0f;
                    int i15 = options3.inSampleSize;
                    float f2 = (float) i15;
                    i5 = Math.round(((float) ((int) Math.ceil((double) (((float) i14) / f2)))) * f);
                    i4 = Math.round(((float) ((int) Math.ceil((double) (((float) i13) / f2)))) * f);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + i5 + "x" + i4 + "] for source [" + i14 + "x" + i13 + "], sampleSize: " + i15 + ", targetDensity: " + options3.inTargetDensity + ", density: " + options3.inDensity + ", density multiplier: " + f);
                    }
                } else {
                    i5 = i10;
                    i4 = i11;
                }
                if (i5 > 0 && i4 > 0) {
                    m12454a(options3, lVar.f11277a, i5, i4);
                }
            }
        } else {
            lVar = this;
        }
        Bitmap a4 = m12448a(inputStream, options3, bVar4, lVar.f11277a);
        bVar4.mo20461a(lVar.f11277a, a4);
        if (Log.isLoggable("Downsampler", 2)) {
            i3 = i12;
            m12453a(i14, i13, str2, options, a4, i, i2, a);
        } else {
            i3 = i12;
        }
        Bitmap bitmap = null;
        if (a4 != null) {
            a4.setDensity(lVar.f11278b.densityDpi);
            bitmap = C6183w.m12505a(lVar.f11277a, a4, i3);
            if (!a4.equals(bitmap)) {
                lVar.f11277a.mo20283a(a4);
            }
        }
        return bitmap;
    }

    /* renamed from: a */
    private static void m12455a(ImageHeaderParser.ImageType imageType, InputStream inputStream, C6169b bVar, C6004e eVar, C6159k kVar, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) throws IOException {
        float f;
        int i6;
        int i7;
        int i8;
        int i9;
        double d;
        ImageHeaderParser.ImageType imageType2 = imageType;
        C6159k kVar2 = kVar;
        int i10 = i;
        int i11 = i2;
        int i12 = i3;
        int i13 = i4;
        int i14 = i5;
        BitmapFactory.Options options2 = options;
        if (i11 <= 0 || i12 <= 0) {
            String str = "Downsampler";
            String str2 = "x";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to determine dimensions for: " + imageType2 + " with target [" + i13 + str2 + i14 + "]");
                return;
            }
            return;
        }
        if (i10 == 90 || i10 == 270) {
            f = kVar2.mo20455b(i12, i11, i13, i14);
        } else {
            f = kVar2.mo20455b(i11, i12, i13, i14);
        }
        if (f > 0.0f) {
            C6159k.C6166g a = kVar2.mo20454a(i11, i12, i13, i14);
            if (a != null) {
                float f2 = (float) i11;
                float f3 = (float) i12;
                String str3 = "Downsampler";
                String str4 = "x";
                int c = i11 / m12461c((double) (f * f2));
                int c2 = i12 / m12461c((double) (f * f3));
                if (a == C6159k.C6166g.MEMORY) {
                    i6 = Math.max(c, c2);
                } else {
                    i6 = Math.min(c, c2);
                }
                if (Build.VERSION.SDK_INT > 23 || !f11273i.contains(options2.outMimeType)) {
                    i7 = Math.max(1, Integer.highestOneBit(i6));
                    if (a == C6159k.C6166g.MEMORY && ((float) i7) < 1.0f / f) {
                        i7 <<= 1;
                    }
                } else {
                    i7 = 1;
                }
                options2.inSampleSize = i7;
                if (imageType2 == ImageHeaderParser.ImageType.JPEG) {
                    float min = (float) Math.min(i7, 8);
                    i8 = (int) Math.ceil((double) (f2 / min));
                    i9 = (int) Math.ceil((double) (f3 / min));
                    int i15 = i7 / 8;
                    if (i15 > 0) {
                        i8 /= i15;
                        i9 /= i15;
                    }
                } else {
                    if (imageType2 == ImageHeaderParser.ImageType.PNG || imageType2 == ImageHeaderParser.ImageType.PNG_A) {
                        float f4 = (float) i7;
                        i8 = (int) Math.floor((double) (f2 / f4));
                        d = Math.floor((double) (f3 / f4));
                    } else if (imageType2 == ImageHeaderParser.ImageType.WEBP || imageType2 == ImageHeaderParser.ImageType.WEBP_A) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            float f5 = (float) i7;
                            i8 = Math.round(f2 / f5);
                            i9 = Math.round(f3 / f5);
                        } else {
                            float f6 = (float) i7;
                            i8 = (int) Math.floor((double) (f2 / f6));
                            d = Math.floor((double) (f3 / f6));
                        }
                    } else if (i11 % i7 == 0 && i12 % i7 == 0) {
                        i8 = i11 / i7;
                        i9 = i12 / i7;
                    } else {
                        int[] b = m12460b(inputStream, options2, bVar, eVar);
                        int i16 = b[0];
                        i9 = b[1];
                        i8 = i16;
                    }
                    i9 = (int) d;
                }
                double b2 = (double) kVar2.mo20455b(i8, i9, i13, i14);
                if (Build.VERSION.SDK_INT >= 19) {
                    options2.inTargetDensity = m12446a(b2);
                    options2.inDensity = m12458b(b2);
                }
                if (m12459b(options)) {
                    options2.inScaled = true;
                } else {
                    options2.inTargetDensity = 0;
                    options2.inDensity = 0;
                }
                String str5 = str3;
                if (Log.isLoggable(str5, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calculate scaling, source: [");
                    sb.append(i11);
                    String str6 = str4;
                    sb.append(str6);
                    sb.append(i12);
                    sb.append("], target: [");
                    sb.append(i13);
                    sb.append(str6);
                    sb.append(i14);
                    sb.append("], power of two scaled: [");
                    sb.append(i8);
                    sb.append(str6);
                    sb.append(i9);
                    sb.append("], exact scale factor: ");
                    sb.append(f);
                    sb.append(", power of 2 sample size: ");
                    sb.append(i7);
                    sb.append(", adjusted scale factor: ");
                    sb.append(b2);
                    sb.append(", target density: ");
                    sb.append(options2.inTargetDensity);
                    sb.append(", density: ");
                    sb.append(options2.inDensity);
                    Log.v(str5, sb.toString());
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        String str7 = "x";
        throw new IllegalArgumentException("Cannot scale with factor: " + f + " from: " + kVar2 + ", source: [" + i11 + str7 + i12 + "], target: [" + i13 + str7 + i14 + "]");
    }

    /* renamed from: a */
    private static int m12446a(double d) {
        int b = m12458b(d);
        double d2 = (double) b;
        Double.isNaN(d2);
        int c = m12461c(d2 * d);
        double d3 = (double) (((float) c) / ((float) b));
        Double.isNaN(d3);
        double d4 = (double) c;
        Double.isNaN(d4);
        return m12461c((d / d3) * d4);
    }

    /* renamed from: a */
    private boolean m12457a(ImageHeaderParser.ImageType imageType) {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return f11275k.contains(imageType);
    }

    /* renamed from: a */
    private void m12456a(InputStream inputStream, C5902b bVar, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        if (!this.f11281e.mo20463a(i, i2, options, bVar, z, z2)) {
            if (bVar == C5902b.PREFER_ARGB_8888 || Build.VERSION.SDK_INT == 16) {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                return;
            }
            boolean z3 = false;
            try {
                z3 = C5905e.m11675b(this.f11280d, inputStream, this.f11279c).hasAlpha();
            } catch (IOException e) {
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e);
                }
            }
            Bitmap.Config config = z3 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            options.inPreferredConfig = config;
            if (config == Bitmap.Config.RGB_565) {
                options.inDither = true;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m12448a(java.io.InputStream r6, android.graphics.BitmapFactory.Options r7, com.bumptech.glide.load.p152o.p153c.C6167l.C6169b r8, com.bumptech.glide.load.engine.p147z.C6004e r9) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r7.inJustDecodeBounds
            if (r1 == 0) goto L_0x000c
            r1 = 10485760(0xa00000, float:1.469368E-38)
            r6.mark(r1)
            goto L_0x000f
        L_0x000c:
            r8.mo20460a()
        L_0x000f:
            int r1 = r7.outWidth
            int r2 = r7.outHeight
            java.lang.String r3 = r7.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.p152o.p153c.C6183w.m12507a()
            r4.lock()
            r4 = 0
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r6, r4, r7)     // Catch:{ IllegalArgumentException -> 0x0032 }
            java.util.concurrent.locks.Lock r9 = com.bumptech.glide.load.p152o.p153c.C6183w.m12507a()
            r9.unlock()
            boolean r7 = r7.inJustDecodeBounds
            if (r7 == 0) goto L_0x002f
            r6.reset()
        L_0x002f:
            return r8
        L_0x0030:
            r6 = move-exception
            goto L_0x005f
        L_0x0032:
            r5 = move-exception
            java.io.IOException r1 = m12450a((java.lang.IllegalArgumentException) r5, (int) r1, (int) r2, (java.lang.String) r3, (android.graphics.BitmapFactory.Options) r7)     // Catch:{ all -> 0x0030 }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x0030 }
        L_0x0043:
            android.graphics.Bitmap r0 = r7.inBitmap     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x005e
            r6.reset()     // Catch:{ IOException -> 0x005d }
            android.graphics.Bitmap r0 = r7.inBitmap     // Catch:{ IOException -> 0x005d }
            r9.mo20283a((android.graphics.Bitmap) r0)     // Catch:{ IOException -> 0x005d }
            r7.inBitmap = r4     // Catch:{ IOException -> 0x005d }
            android.graphics.Bitmap r6 = m12448a((java.io.InputStream) r6, (android.graphics.BitmapFactory.Options) r7, (com.bumptech.glide.load.p152o.p153c.C6167l.C6169b) r8, (com.bumptech.glide.load.engine.p147z.C6004e) r9)     // Catch:{ IOException -> 0x005d }
            java.util.concurrent.locks.Lock r7 = com.bumptech.glide.load.p152o.p153c.C6183w.m12507a()
            r7.unlock()
            return r6
        L_0x005d:
            throw r1     // Catch:{ all -> 0x0030 }
        L_0x005e:
            throw r1     // Catch:{ all -> 0x0030 }
        L_0x005f:
            java.util.concurrent.locks.Lock r7 = com.bumptech.glide.load.p152o.p153c.C6183w.m12507a()
            r7.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p152o.p153c.C6167l.m12448a(java.io.InputStream, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.o.c.l$b, com.bumptech.glide.load.engine.z.e):android.graphics.Bitmap");
    }

    /* renamed from: a */
    private static void m12453a(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        Log.v("Downsampler", "Decoded " + m12451a(bitmap) + " from [" + i + "x" + i2 + "] " + str + " with inBitmap " + m12452a(options) + " for [" + i3 + "x" + i4 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + C6311f.m12964a(j));
    }

    /* renamed from: a */
    private static String m12452a(BitmapFactory.Options options) {
        return m12451a(options.inBitmap);
    }

    @TargetApi(19)
    /* renamed from: a */
    private static String m12451a(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            str = " (" + bitmap.getAllocationByteCount() + ")";
        } else {
            str = "";
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + str;
    }

    /* renamed from: a */
    private static IOException m12450a(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m12452a(options), illegalArgumentException);
    }

    @TargetApi(26)
    /* renamed from: a */
    private static void m12454a(BitmapFactory.Options options, C6004e eVar, int i, int i2) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = eVar.mo20284b(i, i2, config);
    }

    /* renamed from: a */
    private static synchronized BitmapFactory.Options m12449a() {
        BitmapFactory.Options poll;
        synchronized (C6167l.class) {
            synchronized (f11276l) {
                poll = f11276l.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                m12463d(poll);
            }
        }
        return poll;
    }
}
