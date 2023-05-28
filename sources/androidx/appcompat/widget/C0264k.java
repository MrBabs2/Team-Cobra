package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import androidx.core.widget.C0440l;
import p050l.p051a.C4790a;
import p050l.p075h.p084l.C5070u;

/* renamed from: androidx.appcompat.widget.k */
/* compiled from: AppCompatImageButton */
public class C0264k extends ImageButton implements C5070u, C0440l {

    /* renamed from: f */
    private final C0231d f1122f;

    /* renamed from: g */
    private final C0267l f1123g;

    public C0264k(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0231d dVar = this.f1122f;
        if (dVar != null) {
            dVar.mo1476a();
        }
        C0267l lVar = this.f1123g;
        if (lVar != null) {
            lVar.mo1678a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0231d dVar = this.f1122f;
        if (dVar != null) {
            return dVar.mo1482b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0231d dVar = this.f1122f;
        if (dVar != null) {
            return dVar.mo1484c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0267l lVar = this.f1123g;
        if (lVar != null) {
            return lVar.mo1683b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0267l lVar = this.f1123g;
        if (lVar != null) {
            return lVar.mo1684c();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f1123g.mo1685d() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0231d dVar = this.f1122f;
        if (dVar != null) {
            dVar.mo1480a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0231d dVar = this.f1122f;
        if (dVar != null) {
            dVar.mo1477a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0267l lVar = this.f1123g;
        if (lVar != null) {
            lVar.mo1678a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0267l lVar = this.f1123g;
        if (lVar != null) {
            lVar.mo1678a();
        }
    }

    public void setImageResource(int i) {
        this.f1123g.mo1679a(i);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0267l lVar = this.f1123g;
        if (lVar != null) {
            lVar.mo1678a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0231d dVar = this.f1122f;
        if (dVar != null) {
            dVar.mo1483b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0231d dVar = this.f1122f;
        if (dVar != null) {
            dVar.mo1479a(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0267l lVar = this.f1123g;
        if (lVar != null) {
            lVar.mo1680a(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0267l lVar = this.f1123g;
        if (lVar != null) {
            lVar.mo1681a(mode);
        }
    }

    public C0264k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4790a.imageButtonStyle);
    }

    public C0264k(Context context, AttributeSet attributeSet, int i) {
        super(C0272n0.m1256b(context), attributeSet, i);
        C0268l0.m1250a((View) this, getContext());
        C0231d dVar = new C0231d(this);
        this.f1122f = dVar;
        dVar.mo1481a(attributeSet, i);
        C0267l lVar = new C0267l(this);
        this.f1123g = lVar;
        lVar.mo1682a(attributeSet, i);
    }
}
