package com.bumptech.glide.load.p152o.p153c;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.engine.p147z.C6004e;
import com.bumptech.glide.p166r.C6315j;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bumptech.glide.load.o.c.w */
/* compiled from: TransformationUtils */
public final class C6183w {

    /* renamed from: a */
    private static final Paint f11306a = new Paint(6);

    /* renamed from: b */
    private static final Paint f11307b = new Paint(7);

    /* renamed from: c */
    private static final Paint f11308c;

    /* renamed from: d */
    private static final Set<String> f11309d;

    /* renamed from: e */
    private static final Lock f11310e;

    /* renamed from: com.bumptech.glide.load.o.c.w$a */
    /* compiled from: TransformationUtils */
    private static final class C6184a implements Lock {
        C6184a() {
        }

        public void lock() {
        }

        public void lockInterruptibly() throws InterruptedException {
        }

        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public boolean tryLock() {
            return true;
        }

        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        public void unlock() {
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));
        f11309d = hashSet;
        f11310e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new C6184a();
        Paint paint = new Paint(7);
        f11308c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    public static int m12502a(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static Lock m12507a() {
        return f11310e;
    }

    /* renamed from: b */
    public static Bitmap m12514b(C6004e eVar, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return m12517d(eVar, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    /* renamed from: b */
    public static boolean m12515b(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public static Bitmap m12516c(C6004e eVar, Bitmap bitmap, int i, int i2) {
        int min = Math.min(i, i2);
        float f = (float) min;
        float f2 = f / 2.0f;
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        float max = Math.max(f / width, f / height);
        float f3 = width * max;
        float f4 = max * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap a = m12504a(eVar, bitmap);
        Bitmap a2 = eVar.mo20280a(min, min, m12503a(bitmap));
        a2.setHasAlpha(true);
        f11310e.lock();
        try {
            Canvas canvas = new Canvas(a2);
            canvas.drawCircle(f2, f2, f2, f11307b);
            canvas.drawBitmap(a, (Rect) null, rectF, f11308c);
            m12511a(canvas);
            f11310e.unlock();
            if (!a.equals(bitmap)) {
                eVar.mo20283a(a);
            }
            return a2;
        } catch (Throwable th) {
            f11310e.unlock();
            throw th;
        }
    }

    /* renamed from: d */
    public static Bitmap m12517d(C6004e eVar, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap a = eVar.mo20280a((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), m12512b(bitmap));
        m12509a(bitmap, a);
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i + "x" + i2);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + a.getWidth() + "x" + a.getHeight());
            StringBuilder sb = new StringBuilder();
            sb.append("minPct:   ");
            sb.append(min);
            Log.v("TransformationUtils", sb.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        m12510a(bitmap, a, matrix);
        return a;
    }

    /* renamed from: a */
    public static Bitmap m12506a(C6004e eVar, Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f3 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            f2 = ((float) i2) / ((float) bitmap.getHeight());
            f3 = (((float) i) - (((float) bitmap.getWidth()) * f2)) * 0.5f;
            f = 0.0f;
        } else {
            f2 = ((float) i) / ((float) bitmap.getWidth());
            f = (((float) i2) - (((float) bitmap.getHeight()) * f2)) * 0.5f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) (f + 0.5f)));
        Bitmap a = eVar.mo20280a(i, i2, m12512b(bitmap));
        m12509a(bitmap, a);
        m12510a(bitmap, a, matrix);
        return a;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static Bitmap m12513b(C6004e eVar, Bitmap bitmap, int i) {
        C6315j.m12982a(i > 0, "roundingRadius must be greater than 0.");
        Bitmap.Config a = m12503a(bitmap);
        Bitmap a2 = m12504a(eVar, bitmap);
        Bitmap a3 = eVar.mo20280a(a2.getWidth(), a2.getHeight(), a);
        a3.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(a2, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, (float) a3.getWidth(), (float) a3.getHeight());
        f11310e.lock();
        try {
            Canvas canvas = new Canvas(a3);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f = (float) i;
            canvas.drawRoundRect(rectF, f, f, paint);
            m12511a(canvas);
            f11310e.unlock();
            if (!a2.equals(bitmap)) {
                eVar.mo20283a(a2);
            }
            return a3;
        } catch (Throwable th) {
            f11310e.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public static void m12509a(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    /* renamed from: a */
    public static Bitmap m12505a(C6004e eVar, Bitmap bitmap, int i) {
        if (!m12515b(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m12508a(i, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap a = eVar.mo20280a(Math.round(rectF.width()), Math.round(rectF.height()), m12512b(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        a.setHasAlpha(bitmap.hasAlpha());
        m12510a(bitmap, a, matrix);
        return a;
    }

    /* renamed from: b */
    private static Bitmap.Config m12512b(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: a */
    private static Bitmap m12504a(C6004e eVar, Bitmap bitmap) {
        Bitmap.Config a = m12503a(bitmap);
        if (a.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap a2 = eVar.mo20280a(bitmap.getWidth(), bitmap.getHeight(), a);
        new Canvas(a2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return a2;
    }

    /* renamed from: a */
    private static Bitmap.Config m12503a(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            return Bitmap.Config.ARGB_8888;
        }
        return Bitmap.Config.RGBA_F16;
    }

    /* renamed from: a */
    private static void m12511a(Canvas canvas) {
        canvas.setBitmap((Bitmap) null);
    }

    /* renamed from: a */
    private static void m12510a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        f11310e.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f11306a);
            m12511a(canvas);
        } finally {
            f11310e.unlock();
        }
    }

    /* renamed from: a */
    static void m12508a(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }
}
