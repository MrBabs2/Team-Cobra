package p015cm.aptoide.p016pt.networking.image;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.bumptech.glide.C5874c;
import com.bumptech.glide.C5879h;
import com.bumptech.glide.C5885j;
import com.bumptech.glide.load.C5902b;
import com.bumptech.glide.load.C6030l;
import com.bumptech.glide.load.engine.C5963j;
import com.bumptech.glide.load.p152o.p153c.C6151g;
import com.bumptech.glide.load.p152o.p153c.C6152h;
import com.bumptech.glide.load.p152o.p153c.C6153i;
import com.bumptech.glide.load.p152o.p153c.C6180u;
import com.bumptech.glide.load.p152o.p155e.C6199c;
import com.bumptech.glide.p162p.C6265a;
import com.bumptech.glide.p162p.C6267c;
import com.bumptech.glide.p162p.C6272g;
import com.bumptech.glide.p162p.C6273h;
import com.bumptech.glide.p162p.p163l.C6284f;
import com.bumptech.glide.p162p.p163l.C6285g;
import com.bumptech.glide.p162p.p163l.C6287i;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p050l.p100o.p101a.C5153b;

/* renamed from: cm.aptoide.pt.networking.image.ImageLoader */
public class ImageLoader {
    private static final String TAG = "cm.aptoide.pt.networking.image.ImageLoader";
    private final Resources resources;
    private final WeakReference<Context> weakContext;
    private final WindowManager windowManager;

    private ImageLoader(Context context) {
        this.weakContext = new WeakReference<>(context);
        this.resources = context.getResources();
        this.windowManager = (WindowManager) context.getSystemService("window");
    }

    public static void cancel(Context context, View view) {
        C5874c.m11490e(context).mo20000a(view);
    }

    private int getAttrColor(int i) {
        if (((Context) this.weakContext.get()) == null) {
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        ((Context) this.weakContext.get()).getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    private int getAttrDrawable(int i) {
        if (((Context) this.weakContext.get()) == null) {
            return C1086R.C1087drawable.placeholder_square;
        }
        TypedValue typedValue = new TypedValue();
        ((Context) this.weakContext.get()).getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    @SuppressLint({"CheckResult"})
    private C6273h getRequestOptions() {
        C5902b bVar;
        C6273h hVar = new C6273h();
        if (Build.VERSION.SDK_INT >= 26) {
            bVar = C5902b.PREFER_ARGB_8888;
            hVar.mo20658e();
        } else {
            bVar = C5902b.PREFER_RGB_565;
        }
        return (C6273h) ((C6273h) hVar.mo20642a(bVar)).mo20643a(C5963j.f10940c);
    }

    public static ImageLoader with(Context context) {
        return new ImageLoader(context);
    }

    /* renamed from: a */
    public /* synthetic */ void mo13075a(String str, int i, ImageView imageView, C5153b bVar) {
        loadWithColorPlaceholder(str, bVar.mo17820a(i), imageView);
    }

    public C6287i<Drawable> load(int i, ImageView imageView) {
        Context context = (Context) this.weakContext.get();
        if (context != null) {
            return C5874c.m11490e(context).mo19998a(Integer.valueOf(i)).m11535a((C6265a<?>) getRequestOptions()).mo19991a(imageView);
        }
        Log.e(TAG, "::load() Context is null");
        return null;
    }

    public Bitmap loadBitmap(String str) {
        Context context = (Context) this.weakContext.get();
        if (context != null) {
            try {
                C5879h<Bitmap> a = C5874c.m11490e(context).mo19995a();
                a.mo19988a(str);
                return (Bitmap) a.mo19981O().get();
            } catch (InterruptedException e) {
                e.printStackTrace();
                return null;
            } catch (ExecutionException e2) {
                e2.printStackTrace();
                return null;
            }
        } else {
            Log.e(TAG, "::loadBitmap() Context is null");
            return null;
        }
    }

    public C6284f loadImageToNotification(C6284f fVar, String str) {
        Context context = (Context) this.weakContext.get();
        if (context != null) {
            C5879h<Bitmap> a = C5874c.m11490e(context.getApplicationContext()).mo19995a();
            a.mo19988a(str);
            a.m11535a((C6265a<?>) getRequestOptions()).mo19989a(fVar);
            return fVar;
        }
        Log.e(TAG, "::loadImageToNotification() Context is null");
        return fVar;
    }

    public void loadIntoTarget(String str, C6285g<Drawable> gVar) {
        Context context = (Context) this.weakContext.get();
        if (context != null) {
            C5879h<Drawable> a = C5874c.m11490e(context).mo19999a(str).m11535a((C6265a<?>) getRequestOptions());
            a.mo19983a((C5885j<?, ? super Drawable>) C6199c.m12557e());
            a.mo19989a(gVar);
        }
    }

    public C6287i<Drawable> loadScreenshotToThumb(String str, String str2, int i, ImageView imageView) {
        Context context = (Context) this.weakContext.get();
        if (context != null) {
            C5879h<Drawable> a = C5874c.m11490e(context).mo19999a(AptoideUtils.IconSizeU.screenshotToThumb(str, str2, this.windowManager, this.resources)).m11535a((C6265a<?>) getRequestOptions().mo20638a(getAttrDrawable(i)));
            a.mo19983a((C5885j<?, ? super Drawable>) C6199c.m12557e());
            return a.mo19991a(imageView);
        }
        Log.e(TAG, "::loadScreenshotToThumb() Context is null");
        return null;
    }

    public C6287i<Drawable> loadUsingCircleTransform(int i, ImageView imageView) {
        Context context = (Context) this.weakContext.get();
        if (context != null) {
            C5879h<Drawable> a = C5874c.m11490e(context).mo19998a(Integer.valueOf(i)).m11535a((C6265a<?>) getRequestOptions().mo20646a((C6030l<Bitmap>) new C6153i()));
            a.mo19983a((C5885j<?, ? super Drawable>) C6199c.m12557e());
            return a.mo19991a(imageView);
        }
        Log.e(TAG, "::loadUsingCircleTransform() Context is null");
        return null;
    }

    public C6287i<Drawable> loadUsingCircleTransformAndPlaceholder(String str, ImageView imageView, int i) {
        Context context = (Context) this.weakContext.get();
        if (context != null) {
            C5879h<Drawable> a = C5874c.m11490e(context).mo19999a(str).m11535a((C6265a<?>) ((C6273h) getRequestOptions().mo20646a((C6030l<Bitmap>) new C6153i())).mo20638a(i));
            a.mo19983a((C5885j<?, ? super Drawable>) C6199c.m12557e());
            return a.mo19991a(imageView);
        }
        Log.e(TAG, "::loadUsingCircleTransformAndPlaceholder() Context is null");
        return null;
    }

    public C6287i<Drawable> loadWithCircleTransformAndPlaceHolder(String str, ImageView imageView, int i) {
        Context context = (Context) this.weakContext.get();
        if (context != null) {
            C5879h<Drawable> a = C5874c.m11490e(context).mo19999a(str).m11535a((C6265a<?>) ((C6273h) getRequestOptions().mo20646a((C6030l<Bitmap>) new C6153i())).mo20638a(i));
            a.mo19983a((C5885j<?, ? super Drawable>) C6199c.m12557e());
            return a.mo19991a(imageView);
        }
        Log.e(TAG, "::loadWithCircleTransformAndPlaceHolder() Context is null");
        return null;
    }

    public C6287i<Drawable> loadWithCircleTransformAndPlaceHolderAvatarSize(String str, ImageView imageView, int i) {
        return loadWithCircleTransformAndPlaceHolder(AptoideUtils.IconSizeU.generateStringAvatar(str, this.resources, this.windowManager), imageView, i);
    }

    public C6287i<Drawable> loadWithColorAttrPlaceholder(String str, int i, ImageView imageView) {
        Context context = (Context) this.weakContext.get();
        if (context != null) {
            C5879h<Drawable> a = C5874c.m11490e(context).mo19999a(str).m11535a((C6265a<?>) getRequestOptions().mo20640a((Drawable) new ColorDrawable(getAttrColor(i))));
            a.mo19983a((C5885j<?, ? super Drawable>) C6199c.m12557e());
            return a.mo19991a(imageView);
        }
        Log.e(TAG, "::load() Context is null");
        return null;
    }

    public C6287i<Drawable> loadWithColorPlaceholder(String str, int i, ImageView imageView) {
        Context context = (Context) this.weakContext.get();
        if (context != null) {
            C5879h<Drawable> a = C5874c.m11490e(context).mo19999a(str).m11535a((C6265a<?>) getRequestOptions().mo20640a((Drawable) new ColorDrawable(i)));
            a.mo19983a((C5885j<?, ? super Drawable>) C6199c.m12557e());
            return a.mo19991a(imageView);
        }
        Log.e(TAG, "::load() Context is null");
        return null;
    }

    public C6287i<Drawable> loadWithColorPlaceholderRoundCorners(String str, int i, ImageView imageView, int i2, C6272g<Drawable> gVar) {
        Context context = (Context) this.weakContext.get();
        if (context == null) {
            return null;
        }
        C5879h<Drawable> a = C5874c.m11490e(context).mo19999a(str).m11535a((C6265a<?>) ((C6273h) ((C6273h) getRequestOptions().mo20657c()).mo20640a((Drawable) new ColorDrawable(getAttrColor(i2)))).mo20653a((C6030l<Bitmap>[]) new C6030l[]{new C6151g(), new C6180u(i)}));
        a.mo19992b(gVar);
        a.mo19983a((C5885j<?, ? super Drawable>) C6199c.m12557e());
        return a.mo19991a(imageView);
    }

    public void loadWithPalettePlaceholder(String str, BitmapDrawable bitmapDrawable, int i, ImageView imageView) {
        C5153b.C5155b a = C5153b.m9546a(bitmapDrawable.getBitmap());
        a.mo17824a(6);
        a.mo17823a((C5153b.C5158d) new C3439a(this, str, i, imageView));
    }

    public void loadWithRoundCorners(String str, int i, ImageView imageView, int i2) {
        Context context = (Context) this.weakContext.get();
        if (context != null) {
            C5879h<Drawable> a = C5874c.m11490e(context).mo19999a(str).m11535a((C6265a<?>) ((C6273h) ((C6273h) getRequestOptions().mo20657c()).mo20638a(getAttrDrawable(i2))).mo20653a((C6030l<Bitmap>[]) new C6030l[]{new C6152h(), new C6180u(i)}));
            a.mo19983a((C5885j<?, ? super Drawable>) C6199c.m12557e());
            a.mo19991a(imageView);
        }
    }

    public C6287i<Drawable> loadWithShadowCircleTransform(String str, ImageView imageView) {
        Context context = (Context) this.weakContext.get();
        if (context != null) {
            C5879h<Drawable> a = C5874c.m11490e(context).mo19999a(str).m11535a((C6265a<?>) getRequestOptions().mo20646a((C6030l<Bitmap>) new ShadowCircleTransformation(context, imageView)));
            a.mo19983a((C5885j<?, ? super Drawable>) C6199c.m12557e());
            return a.mo19991a(imageView);
        }
        Log.e(TAG, "::loadWithShadowCircleTransform() Context is null");
        return null;
    }

    public C6287i<Drawable> loadWithShadowCircleTransformWithPlaceholder(String str, ImageView imageView, int i) {
        Context context = (Context) this.weakContext.get();
        if (context != null) {
            C5879h<Drawable> a = C5874c.m11490e(context).mo19999a(str).m11535a((C6265a<?>) ((C6273h) getRequestOptions().mo20646a((C6030l<Bitmap>) new ShadowCircleTransformation(context))).mo20638a(i));
            a.mo19983a((C5885j<?, ? super Drawable>) C6199c.m12557e());
            return a.mo19991a(imageView);
        }
        Log.e(TAG, "::loadWithShadowCircleTransform() Context is null");
        return null;
    }

    public static <R> void cancel(Context context, C6267c<R> cVar) {
        C5874c.m11490e(context).mo20002a((C6287i<?>) cVar);
    }

    public static <R> void cancel(Context context, C6287i<R> iVar) {
        C5874c.m11490e(context).mo20002a((C6287i<?>) iVar);
    }

    public C6287i<Drawable> load(String str, int i, ImageView imageView) {
        Context context = (Context) this.weakContext.get();
        if (context != null) {
            C5879h<Drawable> a = C5874c.m11490e(context).mo19999a(str).m11535a((C6265a<?>) getRequestOptions().mo20638a(getAttrDrawable(i)));
            a.mo19983a((C5885j<?, ? super Drawable>) C6199c.m12557e());
            return a.mo19991a(imageView);
        }
        Log.e(TAG, "::load() Context is null");
        return null;
    }

    public C6287i<Drawable> loadUsingCircleTransform(String str, ImageView imageView) {
        Context context = (Context) this.weakContext.get();
        if (context != null) {
            C5879h<Drawable> a = C5874c.m11490e(context).mo19999a(str).m11535a((C6265a<?>) getRequestOptions().mo20646a((C6030l<Bitmap>) new C6153i()));
            a.mo19983a((C5885j<?, ? super Drawable>) C6199c.m12557e());
            return a.mo19991a(imageView);
        }
        Log.e(TAG, "::loadUsingCircleTransform() Context is null");
        return null;
    }

    public C6287i<Drawable> loadWithShadowCircleTransform(String str, ImageView imageView, int i, float f, float f2) {
        Context context = (Context) this.weakContext.get();
        if (context != null) {
            C5879h<Drawable> a = C5874c.m11490e(context).mo19999a(str).m11535a((C6265a<?>) getRequestOptions().mo20646a((C6030l<Bitmap>) new ShadowCircleTransformation(context, imageView, i, f, f2)));
            a.mo19983a((C5885j<?, ? super Drawable>) C6199c.m12557e());
            return a.mo19991a(imageView);
        }
        Log.e(TAG, "::loadWithShadowCircleTransform() Context is null");
        return null;
    }

    public C6287i<Drawable> loadWithRoundCorners(String str, int i, ImageView imageView, int i2, C6272g<Drawable> gVar) {
        Context context = (Context) this.weakContext.get();
        if (context == null) {
            return null;
        }
        C5879h<Drawable> a = C5874c.m11490e(context).mo19999a(str).m11535a((C6265a<?>) ((C6273h) ((C6273h) getRequestOptions().mo20657c()).mo20638a(getAttrDrawable(i2))).mo20653a((C6030l<Bitmap>[]) new C6030l[]{new C6151g(), new C6180u(i)}));
        a.mo19992b(gVar);
        a.mo19983a((C5885j<?, ? super Drawable>) C6199c.m12557e());
        return a.mo19991a(imageView);
    }

    public C6287i<Drawable> loadWithShadowCircleTransformWithPlaceholder(String str, ImageView imageView, float f, int i) {
        Context context = (Context) this.weakContext.get();
        if (context != null) {
            C5879h<Drawable> a = C5874c.m11490e(context).mo19999a(AptoideUtils.IconSizeU.generateSizeStoreString(str, this.resources, this.windowManager)).m11535a((C6265a<?>) ((C6273h) getRequestOptions().mo20646a((C6030l<Bitmap>) new ShadowCircleTransformation(context, (View) imageView, f))).mo20638a(getAttrDrawable(i)));
            a.mo19983a((C5885j<?, ? super Drawable>) C6199c.m12557e());
            return a.mo19991a(imageView);
        }
        Log.e(TAG, "::loadWithShadowCircleTransform() Context is null");
        return null;
    }

    public C6287i<Drawable> load(String str, ImageView imageView) {
        Context context = (Context) this.weakContext.get();
        if (context != null) {
            String newImageUrl = AptoideUtils.IconSizeU.getNewImageUrl(str, this.resources, this.windowManager);
            if (newImageUrl != null) {
                C5879h<Drawable> a = C5874c.m11490e(context).mo19996a(Uri.parse(newImageUrl)).m11535a((C6265a<?>) getRequestOptions());
                a.mo19983a((C5885j<?, ? super Drawable>) C6199c.m12557e());
                return a.mo19991a(imageView);
            }
            Log.e(TAG, "newImageUrl is null");
            return null;
        }
        Log.e(TAG, "::load() Context is null");
        return null;
    }

    public C6287i<Drawable> loadWithShadowCircleTransform(int i, ImageView imageView) {
        Context context = (Context) this.weakContext.get();
        if (context != null) {
            C5879h<Drawable> a = C5874c.m11490e(context).mo19998a(Integer.valueOf(i)).m11535a((C6265a<?>) getRequestOptions().mo20646a((C6030l<Bitmap>) new ShadowCircleTransformation(context, imageView)));
            a.mo19983a((C5885j<?, ? super Drawable>) C6199c.m12557e());
            return a.mo19991a(imageView);
        }
        Log.e(TAG, "::loadWithShadowCircleTransform() Context is null");
        return null;
    }

    public C6287i<Drawable> loadWithShadowCircleTransform(String str, ImageView imageView, int i) {
        Context context = (Context) this.weakContext.get();
        if (context != null) {
            C5879h<Drawable> a = C5874c.m11490e(context).mo19999a(AptoideUtils.IconSizeU.generateSizeStoreString(str, this.resources, this.windowManager)).m11535a((C6265a<?>) getRequestOptions().mo20646a((C6030l<Bitmap>) new ShadowCircleTransformation(context, (View) imageView, i)));
            a.mo19983a((C5885j<?, ? super Drawable>) C6199c.m12557e());
            return a.mo19991a(imageView);
        }
        Log.e(TAG, "::loadWithShadowCircleTransform() Context is null");
        return null;
    }

    public Drawable load(int i) {
        if (i == 0) {
            return null;
        }
        Context context = (Context) this.weakContext.get();
        if (context == null) {
            Log.e(TAG, "::load() Context is null");
            return null;
        } else if (Build.VERSION.SDK_INT >= 21) {
            return context.getResources().getDrawable(i, context.getTheme());
        } else {
            return context.getResources().getDrawable(i);
        }
    }

    public C6287i<Drawable> loadWithShadowCircleTransform(int i, ImageView imageView, int i2) {
        Context context = (Context) this.weakContext.get();
        if (context != null) {
            C5879h<Drawable> a = C5874c.m11490e(context).mo19998a(Integer.valueOf(i)).m11535a((C6265a<?>) getRequestOptions().mo20646a((C6030l<Bitmap>) new ShadowCircleTransformation(context, (View) imageView, i2)));
            a.mo19983a((C5885j<?, ? super Drawable>) C6199c.m12557e());
            return a.mo19991a(imageView);
        }
        Log.e(TAG, "::loadWithShadowCircleTransform() Context is null");
        return null;
    }

    public Bitmap load(String str) {
        Context context = (Context) this.weakContext.get();
        if (context != null) {
            try {
                C5879h<Bitmap> a = C5874c.m11490e(context).mo19995a();
                a.mo19988a(str);
                return (Bitmap) a.mo19981O().get();
            } catch (InterruptedException e) {
                e.printStackTrace();
                return null;
            } catch (ExecutionException e2) {
                e2.printStackTrace();
                return null;
            }
        } else {
            Log.e(TAG, "::load() Context is null");
            return null;
        }
    }
}
