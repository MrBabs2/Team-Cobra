package p112n.p277e.p279b.p282b.p283m;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: n.e.b.b.m.f */
/* compiled from: ImageMatrixProperty */
public class C10590f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f28465a = new Matrix();

    public C10590f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: a */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }

    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f28465a.set(imageView.getImageMatrix());
        return this.f28465a;
    }
}
