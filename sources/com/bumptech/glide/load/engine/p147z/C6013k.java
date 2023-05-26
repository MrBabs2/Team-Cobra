package com.bumptech.glide.load.engine.p147z;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.engine.z.k */
/* compiled from: LruBitmapPool */
public class C6013k implements C6004e {

    /* renamed from: j */
    private static final Bitmap.Config f11074j = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    private final C6016l f11075a;

    /* renamed from: b */
    private final Set<Bitmap.Config> f11076b;

    /* renamed from: c */
    private final C6014a f11077c;

    /* renamed from: d */
    private long f11078d;

    /* renamed from: e */
    private long f11079e;

    /* renamed from: f */
    private int f11080f;

    /* renamed from: g */
    private int f11081g;

    /* renamed from: h */
    private int f11082h;

    /* renamed from: i */
    private int f11083i;

    /* renamed from: com.bumptech.glide.load.engine.z.k$a */
    /* compiled from: LruBitmapPool */
    private interface C6014a {
        /* renamed from: a */
        void mo20300a(Bitmap bitmap);

        /* renamed from: b */
        void mo20301b(Bitmap bitmap);
    }

    /* renamed from: com.bumptech.glide.load.engine.z.k$b */
    /* compiled from: LruBitmapPool */
    private static final class C6015b implements C6014a {
        C6015b() {
        }

        /* renamed from: a */
        public void mo20300a(Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo20301b(Bitmap bitmap) {
        }
    }

    C6013k(long j, C6016l lVar, Set<Bitmap.Config> set) {
        this.f11078d = j;
        this.f11075a = lVar;
        this.f11076b = set;
        this.f11077c = new C6015b();
    }

    /* renamed from: c */
    private static Bitmap m12022c(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = f11074j;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: d */
    private synchronized Bitmap m12025d(int i, int i2, Bitmap.Config config) {
        Bitmap a;
        m12020a(config);
        a = this.f11075a.mo20264a(i, i2, config != null ? config : f11074j);
        if (a == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f11075a.mo20267b(i, i2, config));
            }
            this.f11081g++;
        } else {
            this.f11080f++;
            this.f11079e -= (long) this.f11075a.mo20266b(a);
            this.f11077c.mo20300a(a);
            m12024c(a);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f11075a.mo20267b(i, i2, config));
        }
        m12023c();
        return a;
    }

    /* renamed from: e */
    private void m12027e() {
        m12019a(this.f11078d);
    }

    @TargetApi(26)
    /* renamed from: f */
    private static Set<Bitmap.Config> m12028f() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        if (Build.VERSION.SDK_INT >= 19) {
            hashSet.add((Object) null);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: g */
    private static C6016l m12029g() {
        if (Build.VERSION.SDK_INT >= 19) {
            return new C6018n();
        }
        return new C6000c();
    }

    /* renamed from: a */
    public synchronized void mo20283a(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.f11075a.mo20266b(bitmap)) <= this.f11078d) {
                        if (this.f11076b.contains(bitmap.getConfig())) {
                            int b = this.f11075a.mo20266b(bitmap);
                            this.f11075a.mo20265a(bitmap);
                            this.f11077c.mo20301b(bitmap);
                            this.f11082h++;
                            this.f11079e += (long) b;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f11075a.mo20268c(bitmap));
                            }
                            m12023c();
                            m12027e();
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f11075a.mo20268c(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f11076b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    /* renamed from: b */
    public long mo20299b() {
        return this.f11078d;
    }

    /* renamed from: c */
    private static void m12024c(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m12021b(bitmap);
    }

    /* renamed from: b */
    public Bitmap mo20284b(int i, int i2, Bitmap.Config config) {
        Bitmap d = m12025d(i, i2, config);
        return d == null ? m12022c(i, i2, config) : d;
    }

    @TargetApi(19)
    /* renamed from: b */
    private static void m12021b(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    /* renamed from: c */
    private void m12023c() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m12026d();
        }
    }

    public C6013k(long j) {
        this(j, m12029g(), m12028f());
    }

    /* renamed from: d */
    private void m12026d() {
        Log.v("LruBitmapPool", "Hits=" + this.f11080f + ", misses=" + this.f11081g + ", puts=" + this.f11082h + ", evictions=" + this.f11083i + ", currentSize=" + this.f11079e + ", maxSize=" + this.f11078d + "\nStrategy=" + this.f11075a);
    }

    /* renamed from: a */
    public Bitmap mo20280a(int i, int i2, Bitmap.Config config) {
        Bitmap d = m12025d(i, i2, config);
        if (d == null) {
            return m12022c(i, i2, config);
        }
        d.eraseColor(0);
        return d;
    }

    @TargetApi(26)
    /* renamed from: a */
    private static void m12020a(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    /* renamed from: a */
    public void mo20281a() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m12019a(0);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo20282a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40) {
            mo20281a();
        } else if (i >= 20 || i == 15) {
            m12019a(mo20299b() / 2);
        }
    }

    /* renamed from: a */
    private synchronized void m12019a(long j) {
        while (this.f11079e > j) {
            Bitmap removeLast = this.f11075a.removeLast();
            if (removeLast == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m12026d();
                }
                this.f11079e = 0;
                return;
            }
            this.f11077c.mo20300a(removeLast);
            this.f11079e -= (long) this.f11075a.mo20266b(removeLast);
            this.f11083i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f11075a.mo20268c(removeLast));
            }
            m12023c();
            removeLast.recycle();
        }
    }
}
