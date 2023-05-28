package com.bumptech.glide.load.p152o.p153c;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.p147z.C5999b;
import com.bumptech.glide.p166r.C6315j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import okhttp3.internal.http2.Settings;

/* renamed from: com.bumptech.glide.load.o.c.j */
/* compiled from: DefaultImageHeaderParser */
public final class C6154j implements ImageHeaderParser {

    /* renamed from: a */
    static final byte[] f11256a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    private static final int[] f11257b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: com.bumptech.glide.load.o.c.j$a */
    /* compiled from: DefaultImageHeaderParser */
    private static final class C6155a implements C6157c {

        /* renamed from: a */
        private final ByteBuffer f11258a;

        C6155a(ByteBuffer byteBuffer) {
            this.f11258a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo20445a() {
            return ((mo20448c() << 8) & 65280) | (mo20448c() & 255);
        }

        /* renamed from: b */
        public short mo20447b() {
            return (short) (mo20448c() & 255);
        }

        /* renamed from: c */
        public int mo20448c() {
            if (this.f11258a.remaining() < 1) {
                return -1;
            }
            return this.f11258a.get();
        }

        public long skip(long j) {
            int min = (int) Math.min((long) this.f11258a.remaining(), j);
            ByteBuffer byteBuffer = this.f11258a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }

        /* renamed from: a */
        public int mo20446a(byte[] bArr, int i) {
            int min = Math.min(i, this.f11258a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f11258a.get(bArr, 0, min);
            return min;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.c.j$b */
    /* compiled from: DefaultImageHeaderParser */
    private static final class C6156b {

        /* renamed from: a */
        private final ByteBuffer f11259a;

        C6156b(byte[] bArr, int i) {
            this.f11259a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo20452a(ByteOrder byteOrder) {
            this.f11259a.order(byteOrder);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo20453b(int i) {
            if (m12419a(i, 4)) {
                return this.f11259a.getInt(i);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo20450a() {
            return this.f11259a.remaining();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public short mo20451a(int i) {
            if (m12419a(i, 2)) {
                return this.f11259a.getShort(i);
            }
            return -1;
        }

        /* renamed from: a */
        private boolean m12419a(int i, int i2) {
            return this.f11259a.remaining() - i >= i2;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.c.j$c */
    /* compiled from: DefaultImageHeaderParser */
    private interface C6157c {
        /* renamed from: a */
        int mo20445a() throws IOException;

        /* renamed from: a */
        int mo20446a(byte[] bArr, int i) throws IOException;

        /* renamed from: b */
        short mo20447b() throws IOException;

        /* renamed from: c */
        int mo20448c() throws IOException;

        long skip(long j) throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.o.c.j$d */
    /* compiled from: DefaultImageHeaderParser */
    private static final class C6158d implements C6157c {

        /* renamed from: a */
        private final InputStream f11260a;

        C6158d(InputStream inputStream) {
            this.f11260a = inputStream;
        }

        /* renamed from: a */
        public int mo20445a() throws IOException {
            return ((this.f11260a.read() << 8) & 65280) | (this.f11260a.read() & 255);
        }

        /* renamed from: b */
        public short mo20447b() throws IOException {
            return (short) (this.f11260a.read() & 255);
        }

        /* renamed from: c */
        public int mo20448c() throws IOException {
            return this.f11260a.read();
        }

        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f11260a.skip(j2);
                if (skip <= 0) {
                    if (this.f11260a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }

        /* renamed from: a */
        public int mo20446a(byte[] bArr, int i) throws IOException {
            int i2 = i;
            while (i2 > 0) {
                int read = this.f11260a.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }
    }

    /* renamed from: a */
    private static int m12404a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: a */
    private static boolean m12409a(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: b */
    private int m12411b(C6157c cVar) throws IOException {
        short b;
        int a;
        long j;
        long skip;
        do {
            short b2 = cVar.mo20447b();
            if (b2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + b2);
                }
                return -1;
            }
            b = cVar.mo20447b();
            if (b == 218) {
                return -1;
            }
            if (b == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a = cVar.mo20445a() - 2;
            if (b == 225) {
                return a;
            }
            j = (long) a;
            skip = cVar.skip(j);
        } while (skip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + b + ", wanted to skip: " + a + ", but actually skipped: " + skip);
        }
        return -1;
    }

    /* renamed from: a */
    public ImageHeaderParser.ImageType mo20065a(InputStream inputStream) throws IOException {
        C6315j.m12978a(inputStream);
        return m12408a((C6157c) new C6158d(inputStream));
    }

    /* renamed from: a */
    public ImageHeaderParser.ImageType mo20066a(ByteBuffer byteBuffer) throws IOException {
        C6315j.m12978a(byteBuffer);
        return m12408a((C6157c) new C6155a(byteBuffer));
    }

    /* renamed from: a */
    public int mo20064a(InputStream inputStream, C5999b bVar) throws IOException {
        C6315j.m12978a(inputStream);
        C6158d dVar = new C6158d(inputStream);
        C6315j.m12978a(bVar);
        return m12406a((C6157c) dVar, bVar);
    }

    /* renamed from: a */
    private ImageHeaderParser.ImageType m12408a(C6157c cVar) throws IOException {
        int a = cVar.mo20445a();
        if (a == 65496) {
            return ImageHeaderParser.ImageType.JPEG;
        }
        int a2 = ((a << 16) & -65536) | (cVar.mo20445a() & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        if (a2 == -1991225785) {
            cVar.skip(21);
            return cVar.mo20448c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
        } else if ((a2 >> 8) == 4671814) {
            return ImageHeaderParser.ImageType.GIF;
        } else {
            if (a2 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            cVar.skip(4);
            if ((((cVar.mo20445a() << 16) & -65536) | (cVar.mo20445a() & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int a3 = ((cVar.mo20445a() << 16) & -65536) | (cVar.mo20445a() & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            if ((a3 & -256) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i = a3 & 255;
            if (i == 88) {
                cVar.skip(4);
                return (cVar.mo20448c() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            } else if (i != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            } else {
                cVar.skip(4);
                return (cVar.mo20448c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
        }
    }

    /* renamed from: a */
    private int m12406a(C6157c cVar, C5999b bVar) throws IOException {
        int a = cVar.mo20445a();
        if (!m12409a(a)) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + a);
            }
            return -1;
        }
        int b = m12411b(cVar);
        if (b == -1) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
            }
            return -1;
        }
        byte[] bArr = (byte[]) bVar.mo20263b(b, byte[].class);
        try {
            return m12407a(cVar, bArr, b);
        } finally {
            bVar.mo20262a(bArr);
        }
    }

    /* renamed from: a */
    private int m12407a(C6157c cVar, byte[] bArr, int i) throws IOException {
        int a = cVar.mo20446a(bArr, i);
        if (a != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + a);
            }
            return -1;
        } else if (m12410a(bArr, i)) {
            return m12405a(new C6156b(bArr, i));
        } else {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    /* renamed from: a */
    private boolean m12410a(byte[] bArr, int i) {
        boolean z = bArr != null && i > f11256a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f11256a;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    private static int m12405a(C6156b bVar) {
        ByteOrder byteOrder;
        short a = bVar.mo20451a(6);
        if (a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a != 19789) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + a);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.mo20452a(byteOrder);
        int b = bVar.mo20453b(10) + 6;
        short a2 = bVar.mo20451a(b);
        for (int i = 0; i < a2; i++) {
            int a3 = m12404a(b, i);
            short a4 = bVar.mo20451a(a3);
            if (a4 == 274) {
                short a5 = bVar.mo20451a(a3 + 2);
                if (a5 >= 1 && a5 <= 12) {
                    int b2 = bVar.mo20453b(a3 + 4);
                    if (b2 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i + " tagType=" + a4 + " formatCode=" + a5 + " componentCount=" + b2);
                        }
                        int i2 = b2 + f11257b[a5];
                        if (i2 <= 4) {
                            int i3 = a3 + 8;
                            if (i3 < 0 || i3 > bVar.mo20450a()) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i3 + " tagType=" + a4);
                                }
                            } else if (i2 >= 0 && i2 + i3 <= bVar.mo20450a()) {
                                return bVar.mo20451a(i3);
                            } else {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + a4);
                                }
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + a5);
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + a5);
                }
            }
        }
        return -1;
    }
}
