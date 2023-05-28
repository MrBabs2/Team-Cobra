package com.bumptech.glide.load.p152o.p157g;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.C5902b;
import com.bumptech.glide.load.C5905e;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.C6028j;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.p147z.C5999b;
import com.bumptech.glide.load.engine.p147z.C6004e;
import com.bumptech.glide.load.p152o.C6144b;
import com.bumptech.glide.p143l.C5895a;
import com.bumptech.glide.p143l.C5898c;
import com.bumptech.glide.p143l.C5899d;
import com.bumptech.glide.p143l.C5900e;
import com.bumptech.glide.p166r.C6311f;
import com.bumptech.glide.p166r.C6316k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.o.g.a */
/* compiled from: ByteBufferGifDecoder */
public class C6205a implements C6028j<ByteBuffer, C6209c> {

    /* renamed from: f */
    private static final C6206a f11325f = new C6206a();

    /* renamed from: g */
    private static final C6207b f11326g = new C6207b();

    /* renamed from: a */
    private final Context f11327a;

    /* renamed from: b */
    private final List<ImageHeaderParser> f11328b;

    /* renamed from: c */
    private final C6207b f11329c;

    /* renamed from: d */
    private final C6206a f11330d;

    /* renamed from: e */
    private final C6208b f11331e;

    /* renamed from: com.bumptech.glide.load.o.g.a$a */
    /* compiled from: ByteBufferGifDecoder */
    static class C6206a {
        C6206a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C5895a mo20504a(C5895a.C5896a aVar, C5898c cVar, ByteBuffer byteBuffer, int i) {
            return new C5900e(aVar, cVar, byteBuffer, i);
        }
    }

    public C6205a(Context context, List<ImageHeaderParser> list, C6004e eVar, C5999b bVar) {
        this(context, list, eVar, bVar, f11326g, f11325f);
    }

    C6205a(Context context, List<ImageHeaderParser> list, C6004e eVar, C5999b bVar, C6207b bVar2, C6206a aVar) {
        this.f11327a = context.getApplicationContext();
        this.f11328b = list;
        this.f11330d = aVar;
        this.f11331e = new C6208b(eVar, bVar);
        this.f11329c = bVar2;
    }

    /* renamed from: com.bumptech.glide.load.o.g.a$b */
    /* compiled from: ByteBufferGifDecoder */
    static class C6207b {

        /* renamed from: a */
        private final Queue<C5899d> f11332a = C6316k.m12994a(0);

        C6207b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized C5899d mo20505a(ByteBuffer byteBuffer) {
            C5899d poll;
            poll = this.f11332a.poll();
            if (poll == null) {
                poll = new C5899d();
            }
            poll.mo20059a(byteBuffer);
            return poll;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo20506a(C5899d dVar) {
            dVar.mo20060a();
            this.f11332a.offer(dVar);
        }
    }

    /* renamed from: a */
    public boolean mo20320a(ByteBuffer byteBuffer, C6027i iVar) throws IOException {
        return !((Boolean) iVar.mo20316a(C6220i.f11370b)).booleanValue() && C5905e.m11674a(this.f11328b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    /* renamed from: a */
    public C6212e mo20319a(ByteBuffer byteBuffer, int i, int i2, C6027i iVar) {
        C5899d a = this.f11329c.mo20505a(byteBuffer);
        try {
            return m12582a(byteBuffer, i, i2, a, iVar);
        } finally {
            this.f11329c.mo20506a(a);
        }
    }

    /* renamed from: a */
    private C6212e m12582a(ByteBuffer byteBuffer, int i, int i2, C5899d dVar, C6027i iVar) {
        long a = C6311f.m12965a();
        try {
            C5898c b = dVar.mo20061b();
            if (b.mo20056b() > 0) {
                if (b.mo20057c() == 0) {
                    Bitmap.Config config = iVar.mo20316a(C6220i.f11369a) == C5902b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                    C5895a a2 = this.f11330d.mo20504a(this.f11331e, b, byteBuffer, m12581a(b, i, i2));
                    a2.mo20040a(config);
                    a2.mo20041b();
                    Bitmap a3 = a2.mo20039a();
                    if (a3 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C6311f.m12964a(a));
                        }
                        return null;
                    }
                    C6212e eVar = new C6212e(new C6209c(this.f11327a, a2, C6144b.m12385a(), i, i2, a3));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C6311f.m12964a(a));
                    }
                    return eVar;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C6311f.m12964a(a));
            }
        }
    }

    /* renamed from: a */
    private static int m12581a(C5898c cVar, int i, int i2) {
        int i3;
        int min = Math.min(cVar.mo20055a() / i2, cVar.mo20058d() / i);
        if (min == 0) {
            i3 = 0;
        } else {
            i3 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i3);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + cVar.mo20058d() + "x" + cVar.mo20055a() + "]");
        }
        return max;
    }
}
