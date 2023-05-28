package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.load.C5902b;
import com.bumptech.glide.load.C6028j;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.C5969k;
import com.bumptech.glide.load.engine.p144a0.C5926h;
import com.bumptech.glide.load.engine.p146c0.C5946a;
import com.bumptech.glide.load.engine.p147z.C5999b;
import com.bumptech.glide.load.engine.p147z.C6004e;
import com.bumptech.glide.load.p148m.C6036e;
import com.bumptech.glide.load.p148m.C6047k;
import com.bumptech.glide.load.p150n.C6059a;
import com.bumptech.glide.load.p150n.C6063b;
import com.bumptech.glide.load.p150n.C6070c;
import com.bumptech.glide.load.p150n.C6071d;
import com.bumptech.glide.load.p150n.C6074e;
import com.bumptech.glide.load.p150n.C6079f;
import com.bumptech.glide.load.p150n.C6087g;
import com.bumptech.glide.load.p150n.C6094k;
import com.bumptech.glide.load.p150n.C6113s;
import com.bumptech.glide.load.p150n.C6118t;
import com.bumptech.glide.load.p150n.C6119u;
import com.bumptech.glide.load.p150n.C6123v;
import com.bumptech.glide.load.p150n.C6126w;
import com.bumptech.glide.load.p150n.C6131x;
import com.bumptech.glide.load.p150n.p151y.C6133a;
import com.bumptech.glide.load.p150n.p151y.C6135b;
import com.bumptech.glide.load.p150n.p151y.C6137c;
import com.bumptech.glide.load.p150n.p151y.C6139d;
import com.bumptech.glide.load.p150n.p151y.C6141e;
import com.bumptech.glide.load.p152o.p153c.C6145a;
import com.bumptech.glide.load.p152o.p153c.C6146b;
import com.bumptech.glide.load.p152o.p153c.C6147c;
import com.bumptech.glide.load.p152o.p153c.C6150f;
import com.bumptech.glide.load.p152o.p153c.C6154j;
import com.bumptech.glide.load.p152o.p153c.C6167l;
import com.bumptech.glide.load.p152o.p153c.C6173o;
import com.bumptech.glide.load.p152o.p153c.C6179t;
import com.bumptech.glide.load.p152o.p153c.C6181v;
import com.bumptech.glide.load.p152o.p153c.C6185x;
import com.bumptech.glide.load.p152o.p153c.C6187y;
import com.bumptech.glide.load.p152o.p154d.C6194a;
import com.bumptech.glide.load.p152o.p155e.C6201e;
import com.bumptech.glide.load.p152o.p155e.C6202f;
import com.bumptech.glide.load.p152o.p156f.C6203a;
import com.bumptech.glide.load.p152o.p157g.C6205a;
import com.bumptech.glide.load.p152o.p157g.C6209c;
import com.bumptech.glide.load.p152o.p157g.C6211d;
import com.bumptech.glide.load.p152o.p157g.C6219h;
import com.bumptech.glide.load.p152o.p157g.C6221j;
import com.bumptech.glide.load.p152o.p158h.C6222a;
import com.bumptech.glide.load.p152o.p158h.C6223b;
import com.bumptech.glide.load.p152o.p158h.C6224c;
import com.bumptech.glide.load.p152o.p158h.C6225d;
import com.bumptech.glide.p143l.C5895a;
import com.bumptech.glide.p159m.C6234d;
import com.bumptech.glide.p159m.C6244l;
import com.bumptech.glide.p160n.C6253b;
import com.bumptech.glide.p160n.C6255d;
import com.bumptech.glide.p162p.C6272g;
import com.bumptech.glide.p162p.C6273h;
import com.bumptech.glide.p162p.p163l.C6283e;
import com.bumptech.glide.p162p.p163l.C6287i;
import com.bumptech.glide.p166r.C6315j;
import com.bumptech.glide.p166r.C6316k;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bumptech.glide.c */
/* compiled from: Glide */
public class C5874c implements ComponentCallbacks2 {

    /* renamed from: n */
    private static volatile C5874c f10608n;

    /* renamed from: o */
    private static volatile boolean f10609o;

    /* renamed from: f */
    private final C6004e f10610f;

    /* renamed from: g */
    private final C5926h f10611g;

    /* renamed from: h */
    private final C5876e f10612h;

    /* renamed from: i */
    private final Registry f10613i;

    /* renamed from: j */
    private final C5999b f10614j;

    /* renamed from: k */
    private final C6244l f10615k;

    /* renamed from: l */
    private final C6234d f10616l;

    /* renamed from: m */
    private final List<C5881i> f10617m = new ArrayList();

    C5874c(Context context, C5969k kVar, C5926h hVar, C6004e eVar, C5999b bVar, C6244l lVar, C6234d dVar, int i, C6273h hVar2, Map<Class<?>, C5885j<?, ?>> map, List<C6272g<Object>> list, boolean z) {
        Context context2 = context;
        C5926h hVar3 = hVar;
        C6004e eVar2 = eVar;
        C5999b bVar2 = bVar;
        Class<C5895a> cls = C5895a.class;
        Class<String> cls2 = String.class;
        Class<Integer> cls3 = Integer.class;
        Class<byte[]> cls4 = byte[].class;
        C5877f fVar = C5877f.NORMAL;
        this.f10610f = eVar2;
        this.f10614j = bVar2;
        this.f10611g = hVar3;
        this.f10615k = lVar;
        this.f10616l = dVar;
        new C5946a(hVar3, eVar2, (C5902b) hVar2.mo20667l().mo20316a(C6167l.f11270f));
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.f10613i = registry;
        registry.mo19933a((ImageHeaderParser) new C6154j());
        if (Build.VERSION.SDK_INT >= 27) {
            this.f10613i.mo19933a((ImageHeaderParser) new C6173o());
        }
        List<ImageHeaderParser> a = this.f10613i.mo19944a();
        C6167l lVar2 = new C6167l(a, resources.getDisplayMetrics(), eVar2, bVar2);
        C6205a aVar = new C6205a(context2, a, eVar2, bVar2);
        C6028j<ParcelFileDescriptor, Bitmap> b = C6187y.m12529b(eVar);
        C6150f fVar2 = new C6150f(lVar2);
        C6181v vVar = new C6181v(lVar2, bVar2);
        C6201e eVar3 = new C6201e(context2);
        C6113s.C6116c cVar = new C6113s.C6116c(resources);
        Class<byte[]> cls5 = cls4;
        C6113s.C6117d dVar2 = new C6113s.C6117d(resources);
        C6113s.C6115b bVar3 = new C6113s.C6115b(resources);
        Class<String> cls6 = cls2;
        C6113s.C6114a aVar2 = new C6113s.C6114a(resources);
        C6147c cVar2 = new C6147c(bVar2);
        C6113s.C6117d dVar3 = dVar2;
        C6222a aVar3 = new C6222a();
        C6225d dVar4 = new C6225d();
        ContentResolver contentResolver = context.getContentResolver();
        Registry registry2 = this.f10613i;
        registry2.mo19935a(ByteBuffer.class, new C6070c());
        registry2.mo19935a(InputStream.class, new C6118t(bVar2));
        registry2.mo19940a("Bitmap", ByteBuffer.class, Bitmap.class, fVar2);
        registry2.mo19940a("Bitmap", InputStream.class, Bitmap.class, vVar);
        registry2.mo19940a("Bitmap", ParcelFileDescriptor.class, Bitmap.class, b);
        registry2.mo19940a("Bitmap", AssetFileDescriptor.class, Bitmap.class, C6187y.m12527a(eVar));
        registry2.mo19938a(Bitmap.class, Bitmap.class, C6123v.C6124a.m12334a());
        registry2.mo19940a("Bitmap", Bitmap.class, Bitmap.class, new C6185x());
        registry2.mo19936a(Bitmap.class, cVar2);
        registry2.mo19940a("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C6145a(resources, fVar2));
        registry2.mo19940a("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C6145a(resources, vVar));
        registry2.mo19940a("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C6145a(resources, b));
        registry2.mo19936a(BitmapDrawable.class, new C6146b(eVar2, cVar2));
        registry2.mo19940a("Gif", InputStream.class, C6209c.class, new C6221j(a, aVar, bVar2));
        registry2.mo19940a("Gif", ByteBuffer.class, C6209c.class, aVar);
        registry2.mo19936a(C6209c.class, new C6211d());
        registry2.mo19938a(cls, cls, C6123v.C6124a.m12334a());
        registry2.mo19940a("Bitmap", cls, Bitmap.class, new C6219h(eVar2));
        registry2.mo19937a(Uri.class, Drawable.class, eVar3);
        registry2.mo19937a(Uri.class, Bitmap.class, new C6179t(eVar3, eVar2));
        registry2.mo19934a((C6036e.C6037a<?>) new C6194a.C6195a());
        registry2.mo19938a(File.class, ByteBuffer.class, new C6071d.C6073b());
        registry2.mo19938a(File.class, InputStream.class, new C6079f.C6085e());
        registry2.mo19937a(File.class, File.class, new C6203a());
        registry2.mo19938a(File.class, ParcelFileDescriptor.class, new C6079f.C6081b());
        registry2.mo19938a(File.class, File.class, C6123v.C6124a.m12334a());
        registry2.mo19934a((C6036e.C6037a<?>) new C6047k.C6048a(bVar2));
        C6113s.C6116c cVar3 = cVar;
        registry2.mo19938a(Integer.TYPE, InputStream.class, cVar3);
        C6113s.C6115b bVar4 = bVar3;
        registry2.mo19938a(Integer.TYPE, ParcelFileDescriptor.class, bVar4);
        Class<Integer> cls7 = cls3;
        registry2.mo19938a(cls7, InputStream.class, cVar3);
        registry2.mo19938a(cls7, ParcelFileDescriptor.class, bVar4);
        C6113s.C6117d dVar5 = dVar3;
        registry2.mo19938a(cls7, Uri.class, dVar5);
        C6113s.C6114a aVar4 = aVar2;
        registry2.mo19938a(Integer.TYPE, AssetFileDescriptor.class, aVar4);
        registry2.mo19938a(cls7, AssetFileDescriptor.class, aVar4);
        registry2.mo19938a(Integer.TYPE, Uri.class, dVar5);
        Class<String> cls8 = cls6;
        registry2.mo19938a(cls8, InputStream.class, new C6074e.C6077c());
        registry2.mo19938a(Uri.class, InputStream.class, new C6074e.C6077c());
        registry2.mo19938a(cls8, InputStream.class, new C6119u.C6122c());
        registry2.mo19938a(cls8, ParcelFileDescriptor.class, new C6119u.C6121b());
        registry2.mo19938a(cls8, AssetFileDescriptor.class, new C6119u.C6120a());
        registry2.mo19938a(Uri.class, InputStream.class, new C6135b.C6136a());
        registry2.mo19938a(Uri.class, InputStream.class, new C6059a.C6062c(context.getAssets()));
        registry2.mo19938a(Uri.class, ParcelFileDescriptor.class, new C6059a.C6061b(context.getAssets()));
        Context context3 = context;
        registry2.mo19938a(Uri.class, InputStream.class, new C6137c.C6138a(context3));
        registry2.mo19938a(Uri.class, InputStream.class, new C6139d.C6140a(context3));
        ContentResolver contentResolver2 = contentResolver;
        registry2.mo19938a(Uri.class, InputStream.class, new C6126w.C6130d(contentResolver2));
        registry2.mo19938a(Uri.class, ParcelFileDescriptor.class, new C6126w.C6128b(contentResolver2));
        registry2.mo19938a(Uri.class, AssetFileDescriptor.class, new C6126w.C6127a(contentResolver2));
        registry2.mo19938a(Uri.class, InputStream.class, new C6131x.C6132a());
        registry2.mo19938a(URL.class, InputStream.class, new C6141e.C6142a());
        registry2.mo19938a(Uri.class, File.class, new C6094k.C6095a(context3));
        registry2.mo19938a(C6087g.class, InputStream.class, new C6133a.C6134a());
        Class<byte[]> cls9 = cls5;
        registry2.mo19938a(cls9, ByteBuffer.class, new C6063b.C6064a());
        registry2.mo19938a(cls9, InputStream.class, new C6063b.C6068d());
        registry2.mo19938a(Uri.class, Uri.class, C6123v.C6124a.m12334a());
        registry2.mo19938a(Drawable.class, Drawable.class, C6123v.C6124a.m12334a());
        registry2.mo19937a(Drawable.class, Drawable.class, new C6202f());
        registry2.mo19939a(Bitmap.class, BitmapDrawable.class, new C6223b(resources));
        C6222a aVar5 = aVar3;
        registry2.mo19939a(Bitmap.class, cls9, aVar5);
        C6225d dVar6 = dVar4;
        registry2.mo19939a(Drawable.class, cls9, new C6224c(eVar2, aVar5, dVar6));
        registry2.mo19939a(C6209c.class, cls9, dVar6);
        this.f10612h = new C5876e(context, bVar, this.f10613i, new C6283e(), hVar2, map, list, kVar, z, i);
    }

    /* renamed from: a */
    private static void m11484a(Context context) {
        if (!f10609o) {
            f10609o = true;
            m11489d(context);
            f10609o = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    /* renamed from: b */
    public static C5874c m11487b(Context context) {
        if (f10608n == null) {
            synchronized (C5874c.class) {
                if (f10608n == null) {
                    m11484a(context);
                }
            }
        }
        return f10608n;
    }

    /* renamed from: d */
    private static void m11489d(Context context) {
        m11485a(context, new C5875d());
    }

    /* renamed from: i */
    private static C5872a m11491i() {
        try {
            return (C5872a) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (InstantiationException e) {
            m11486a((Exception) e);
            throw null;
        } catch (IllegalAccessException e2) {
            m11486a((Exception) e2);
            throw null;
        } catch (NoSuchMethodException e3) {
            m11486a((Exception) e3);
            throw null;
        } catch (InvocationTargetException e4) {
            m11486a((Exception) e4);
            throw null;
        }
    }

    /* renamed from: c */
    public C6004e mo19958c() {
        return this.f10610f;
    }

    /* renamed from: e */
    public Context mo19960e() {
        return this.f10612h.getBaseContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C5876e mo19961f() {
        return this.f10612h;
    }

    /* renamed from: g */
    public Registry mo19962g() {
        return this.f10613i;
    }

    /* renamed from: h */
    public C6244l mo19963h() {
        return this.f10615k;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        mo19952a();
    }

    public void onTrimMemory(int i) {
        mo19953a(i);
    }

    /* renamed from: c */
    private static C6244l m11488c(Context context) {
        C6315j.m12979a(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m11487b(context).mo19963h();
    }

    /* renamed from: e */
    public static C5881i m11490e(Context context) {
        return m11488c(context).mo20578a(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C6234d mo19959d() {
        return this.f10616l;
    }

    /* renamed from: a */
    private static void m11485a(Context context, C5875d dVar) {
        Context applicationContext = context.getApplicationContext();
        C5872a i = m11491i();
        List<C6253b> emptyList = Collections.emptyList();
        if (i == null || i.mo20603a()) {
            emptyList = new C6255d(applicationContext).mo20605a();
        }
        if (i != null && !i.mo19950b().isEmpty()) {
            Set<Class<?>> b = i.mo19950b();
            Iterator<C6253b> it = emptyList.iterator();
            while (it.hasNext()) {
                C6253b next = it.next();
                if (b.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (C6253b bVar : emptyList) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + bVar.getClass());
            }
        }
        dVar.mo19971a(i != null ? i.mo19951c() : null);
        for (C6253b applyOptions : emptyList) {
            applyOptions.applyOptions(applicationContext, dVar);
        }
        if (i != null) {
            i.mo20602a(applicationContext, dVar);
        }
        C5874c a = dVar.mo19967a(applicationContext);
        for (C6253b registerComponents : emptyList) {
            registerComponents.registerComponents(applicationContext, a, a.f10613i);
        }
        if (i != null) {
            i.mo20604a(applicationContext, a, a.f10613i);
        }
        applicationContext.registerComponentCallbacks(a);
        f10608n = a;
    }

    /* renamed from: b */
    public C5999b mo19956b() {
        return this.f10614j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo19957b(C5881i iVar) {
        synchronized (this.f10617m) {
            if (this.f10617m.contains(iVar)) {
                this.f10617m.remove(iVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    /* renamed from: a */
    private static void m11486a(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: a */
    public void mo19952a() {
        C6316k.m12998b();
        this.f10611g.mo20111a();
        this.f10610f.mo20281a();
        this.f10614j.mo20260a();
    }

    /* renamed from: a */
    public void mo19953a(int i) {
        C6316k.m12998b();
        this.f10611g.mo20106a(i);
        this.f10610f.mo20282a(i);
        this.f10614j.mo20261a(i);
    }

    /* renamed from: a */
    public static C5881i m11483a(Fragment fragment) {
        return m11488c(fragment.getActivity()).mo20579a(fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo19955a(C6287i<?> iVar) {
        synchronized (this.f10617m) {
            for (C5881i b : this.f10617m) {
                if (b.mo20006b(iVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo19954a(C5881i iVar) {
        synchronized (this.f10617m) {
            if (!this.f10617m.contains(iVar)) {
                this.f10617m.add(iVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }
}
