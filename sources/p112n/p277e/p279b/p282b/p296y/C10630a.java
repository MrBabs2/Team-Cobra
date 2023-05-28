package p112n.p277e.p279b.p282b.p296y;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p050l.p075h.p076e.C4949a;

/* renamed from: n.e.b.b.y.a */
/* compiled from: ShadowRenderer */
public class C10630a {

    /* renamed from: i */
    private static final int[] f28543i = new int[3];

    /* renamed from: j */
    private static final float[] f28544j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    private static final int[] f28545k = new int[4];

    /* renamed from: l */
    private static final float[] f28546l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    private final Paint f28547a;

    /* renamed from: b */
    private final Paint f28548b;

    /* renamed from: c */
    private final Paint f28549c;

    /* renamed from: d */
    private int f28550d;

    /* renamed from: e */
    private int f28551e;

    /* renamed from: f */
    private int f28552f;

    /* renamed from: g */
    private final Path f28553g;

    /* renamed from: h */
    private Paint f28554h;

    public C10630a() {
        this(-16777216);
    }

    /* renamed from: a */
    public void mo36223a(int i) {
        this.f28550d = C4949a.m8709d(i, 68);
        this.f28551e = C4949a.m8709d(i, 20);
        this.f28552f = C4949a.m8709d(i, 0);
        this.f28547a.setColor(this.f28550d);
    }

    public C10630a(int i) {
        this.f28553g = new Path();
        this.f28554h = new Paint();
        this.f28547a = new Paint();
        mo36223a(i);
        this.f28554h.setColor(0);
        Paint paint = new Paint(4);
        this.f28548b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f28549c = new Paint(this.f28548b);
    }

    /* renamed from: a */
    public void mo36224a(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += (float) i;
        rectF.offset(0.0f, (float) (-i));
        int[] iArr = f28543i;
        iArr[0] = this.f28552f;
        iArr[1] = this.f28551e;
        iArr[2] = this.f28550d;
        Paint paint = this.f28549c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, f28543i, f28544j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f28549c);
        canvas.restore();
    }

    /* renamed from: a */
    public void mo36225a(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        int i2 = i;
        float f3 = f2;
        boolean z = f3 < 0.0f;
        Path path = this.f28553g;
        if (z) {
            int[] iArr = f28545k;
            iArr[0] = 0;
            iArr[1] = this.f28552f;
            iArr[2] = this.f28551e;
            iArr[3] = this.f28550d;
            float f4 = f;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f, f3);
            path.close();
            float f5 = (float) (-i2);
            rectF2.inset(f5, f5);
            int[] iArr2 = f28545k;
            iArr2[0] = 0;
            iArr2[1] = this.f28550d;
            iArr2[2] = this.f28551e;
            iArr2[3] = this.f28552f;
        }
        float width = 1.0f - (((float) i2) / (rectF.width() / 2.0f));
        float[] fArr = f28546l;
        fArr[1] = width;
        fArr[2] = ((1.0f - width) / 2.0f) + width;
        this.f28548b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, f28545k, f28546l, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas2.clipPath(path, Region.Op.DIFFERENCE);
            canvas2.drawPath(path, this.f28554h);
        }
        canvas.drawArc(rectF, f, f2, true, this.f28548b);
        canvas.restore();
    }

    /* renamed from: a */
    public Paint mo36222a() {
        return this.f28547a;
    }
}
