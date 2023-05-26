package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: j */
    static final PorterDuff.Mode f1797j = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f1798a = -1;

    /* renamed from: b */
    Object f1799b;

    /* renamed from: c */
    public byte[] f1800c = null;

    /* renamed from: d */
    public Parcelable f1801d = null;

    /* renamed from: e */
    public int f1802e = 0;

    /* renamed from: f */
    public int f1803f = 0;

    /* renamed from: g */
    public ColorStateList f1804g = null;

    /* renamed from: h */
    PorterDuff.Mode f1805h = f1797j;

    /* renamed from: i */
    public String f1806i = null;

    public IconCompat() {
    }

    /* renamed from: a */
    public static IconCompat m1998a(Resources resources, String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f1802e = i;
            if (resources != null) {
                try {
                    iconCompat.f1799b = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f1799b = str;
            }
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    /* renamed from: a */
    private static String m1999a(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: b */
    public String mo2322b() {
        if (this.f1798a == -1 && Build.VERSION.SDK_INT >= 23) {
            return m2001b((Icon) this.f1799b);
        }
        if (this.f1798a == 2) {
            return ((String) this.f1799b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: c */
    public int mo2323c() {
        if (this.f1798a != -1 || Build.VERSION.SDK_INT < 23) {
            return this.f1798a;
        }
        return m2002c((Icon) this.f1799b);
    }

    /* renamed from: d */
    public Uri mo2324d() {
        if (this.f1798a == -1 && Build.VERSION.SDK_INT >= 23) {
            return m2003d((Icon) this.f1799b);
        }
        int i = this.f1798a;
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f1799b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* renamed from: e */
    public void mo2325e() {
        this.f1805h = PorterDuff.Mode.valueOf(this.f1806i);
        switch (this.f1798a) {
            case -1:
                Parcelable parcelable = this.f1801d;
                if (parcelable != null) {
                    this.f1799b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                Parcelable parcelable2 = this.f1801d;
                if (parcelable2 != null) {
                    this.f1799b = parcelable2;
                    return;
                }
                byte[] bArr = this.f1800c;
                this.f1799b = bArr;
                this.f1798a = 3;
                this.f1802e = 0;
                this.f1803f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                this.f1799b = new String(this.f1800c, Charset.forName("UTF-16"));
                return;
            case 3:
                this.f1799b = this.f1800c;
                return;
            default:
                return;
        }
    }

    @Deprecated
    /* renamed from: f */
    public Icon mo2326f() {
        return mo2320a((Context) null);
    }

    public String toString() {
        if (this.f1798a == -1) {
            return String.valueOf(this.f1799b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m1999a(this.f1798a));
        switch (this.f1798a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1799b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1799b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(mo2322b());
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(mo2319a())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1802e);
                if (this.f1803f != 0) {
                    sb.append(" off=");
                    sb.append(this.f1803f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1799b);
                break;
        }
        if (this.f1804g != null) {
            sb.append(" tint=");
            sb.append(this.f1804g);
        }
        if (this.f1805h != f1797j) {
            sb.append(" mode=");
            sb.append(this.f1805h);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: c */
    private static int m2002c(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e);
            return -1;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e2);
            return -1;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e3);
            return -1;
        }
    }

    /* renamed from: b */
    private InputStream m2000b(Context context) {
        Uri d = mo2324d();
        String scheme = d.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(d);
            } catch (Exception e) {
                Log.w("IconCompat", "Unable to load image from URI: " + d, e);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f1799b));
            } catch (FileNotFoundException e2) {
                Log.w("IconCompat", "Unable to load image from path: " + d, e2);
                return null;
            }
        }
    }

    /* renamed from: d */
    private static Uri m2003d(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    /* renamed from: a */
    public int mo2319a() {
        if (this.f1798a == -1 && Build.VERSION.SDK_INT >= 23) {
            return m1996a((Icon) this.f1799b);
        }
        if (this.f1798a == 2) {
            return this.f1802e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    private IconCompat(int i) {
        this.f1798a = i;
    }

    /* renamed from: a */
    public Icon mo2320a(Context context) {
        Icon icon;
        switch (this.f1798a) {
            case -1:
                return (Icon) this.f1799b;
            case 1:
                icon = Icon.createWithBitmap((Bitmap) this.f1799b);
                break;
            case 2:
                icon = Icon.createWithResource(mo2322b(), this.f1802e);
                break;
            case 3:
                icon = Icon.createWithData((byte[]) this.f1799b, this.f1802e, this.f1803f);
                break;
            case 4:
                icon = Icon.createWithContentUri((String) this.f1799b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    icon = Icon.createWithBitmap(m1997a((Bitmap) this.f1799b, false));
                    break;
                } else {
                    icon = Icon.createWithAdaptiveBitmap((Bitmap) this.f1799b);
                    break;
                }
            case 6:
                if (context != null) {
                    InputStream b = m2000b(context);
                    if (b != null) {
                        if (Build.VERSION.SDK_INT < 26) {
                            icon = Icon.createWithBitmap(m1997a(BitmapFactory.decodeStream(b), false));
                            break;
                        } else {
                            icon = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(b));
                            break;
                        }
                    } else {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + mo2324d());
                    }
                } else {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + mo2324d());
                }
            default:
                throw new IllegalArgumentException("Unknown type");
        }
        ColorStateList colorStateList = this.f1804g;
        if (colorStateList != null) {
            icon.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f1805h;
        if (mode != f1797j) {
            icon.setTintMode(mode);
        }
        return icon;
    }

    /* renamed from: b */
    private static String m2001b(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }

    /* renamed from: a */
    public void mo2321a(boolean z) {
        this.f1806i = this.f1805h.name();
        switch (this.f1798a) {
            case -1:
                if (!z) {
                    this.f1801d = (Parcelable) this.f1799b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f1799b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f1800c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f1801d = (Parcelable) this.f1799b;
                return;
            case 2:
                this.f1800c = ((String) this.f1799b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f1800c = (byte[]) this.f1799b;
                return;
            case 4:
            case 6:
                this.f1800c = this.f1799b.toString().getBytes(Charset.forName("UTF-16"));
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private static int m1996a(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    /* renamed from: a */
    static Bitmap m1997a(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }
}
