package p015cm.aptoide.p016pt.networking.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import com.bumptech.glide.load.C6022f;
import com.bumptech.glide.load.engine.p147z.C6004e;
import com.bumptech.glide.load.p152o.p153c.C6149e;
import java.security.MessageDigest;

/* renamed from: cm.aptoide.pt.networking.image.ShadowCircleTransformation */
public class ShadowCircleTransformation extends C6149e {

    /* renamed from: ID */
    private static final String f6420ID = "cm.aptoide.pt.networking.image.ShadowCircleTransformation";
    private static final byte[] ID_BYTES = f6420ID.getBytes(C6022f.f11096a);
    private final int shadowColor;
    private final float spaceBetween;
    private final float strokeSize;

    public ShadowCircleTransformation(Context context, View view) {
        view.setLayerType(1, (Paint) null);
        this.shadowColor = -1;
        this.strokeSize = 0.08f;
        this.spaceBetween = 0.0f;
    }

    private Bitmap circleCrop(C6004e eVar, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - min) / 2, (bitmap.getHeight() - min) / 2, min, min);
        Bitmap a = eVar.mo20280a(min, min, Bitmap.Config.ARGB_8888);
        if (a == null) {
            a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(a);
        float f = (float) min;
        float f2 = f / 2.0f;
        Paint paint = new Paint();
        paint.setColor(this.shadowColor);
        paint.setStyle(Paint.Style.FILL);
        float f3 = 0.02f * f;
        paint.setShadowLayer(f3, 0.0f, 0.0f, -7829368);
        paint.setAntiAlias(true);
        float f4 = f2 - f3;
        canvas.drawCircle(f2, f2, f4, paint);
        paint.setColor(-1);
        canvas.drawCircle(f2, f2, f4 * this.spaceBetween, paint);
        Paint paint2 = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        paint2.setAntiAlias(true);
        canvas.drawCircle(f2, f2, f2 - (f * this.strokeSize), paint2);
        return a;
    }

    public String getId() {
        return ShadowCircleTransformation.class.getName();
    }

    public int hashCode() {
        return 1388573390;
    }

    /* access modifiers changed from: protected */
    public Bitmap transform(C6004e eVar, Bitmap bitmap, int i, int i2) {
        return circleCrop(eVar, bitmap);
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(ID_BYTES);
    }

    public ShadowCircleTransformation(Context context) {
        this.shadowColor = -1;
        this.strokeSize = 0.08f;
        this.spaceBetween = 0.0f;
    }

    public ShadowCircleTransformation(Context context, View view, int i, float f, float f2) {
        this.strokeSize = f2;
        view.setLayerType(1, (Paint) null);
        this.shadowColor = i;
        this.spaceBetween = f;
    }

    public ShadowCircleTransformation(Context context, View view, int i) {
        view.setLayerType(1, (Paint) null);
        this.shadowColor = i;
        this.strokeSize = 0.08f;
        this.spaceBetween = 0.95f;
    }

    public ShadowCircleTransformation(Context context, View view, float f) {
        view.setLayerType(1, (Paint) null);
        this.strokeSize = f;
        this.shadowColor = -1;
        this.spaceBetween = 0.95f;
    }
}
