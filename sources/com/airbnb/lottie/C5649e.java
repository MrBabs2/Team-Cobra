package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.JsonReader;
import android.util.Log;
import com.airbnb.lottie.p133s.C5728g;
import com.airbnb.lottie.p137t.C5785c;
import com.airbnb.lottie.p138u.C5817t;
import com.airbnb.lottie.p139v.C5829f;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p015cm.aptoide.p016pt.utils.MultiDexHelper;

/* renamed from: com.airbnb.lottie.e */
/* compiled from: LottieCompositionFactory */
public class C5649e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Map<String, C5672l<C5648d>> f9975a = new HashMap();

    /* renamed from: com.airbnb.lottie.e$a */
    /* compiled from: LottieCompositionFactory */
    static class C5650a implements C5668h<Throwable> {

        /* renamed from: a */
        final /* synthetic */ String f9976a;

        C5650a(String str) {
            this.f9976a = str;
        }

        /* renamed from: a */
        public void mo19384a(Throwable th) {
            C5649e.f9975a.remove(this.f9976a);
        }
    }

    /* renamed from: com.airbnb.lottie.e$b */
    /* compiled from: LottieCompositionFactory */
    static class C5651b implements Callable<C5671k<C5648d>> {

        /* renamed from: f */
        final /* synthetic */ Context f9977f;

        /* renamed from: g */
        final /* synthetic */ String f9978g;

        C5651b(Context context, String str) {
            this.f9977f = context;
            this.f9978g = str;
        }

        public C5671k<C5648d> call() {
            return C5649e.m10784b(this.f9977f, this.f9978g);
        }
    }

    /* renamed from: com.airbnb.lottie.e$c */
    /* compiled from: LottieCompositionFactory */
    static class C5652c implements Callable<C5671k<C5648d>> {

        /* renamed from: f */
        final /* synthetic */ Context f9979f;

        /* renamed from: g */
        final /* synthetic */ int f9980g;

        C5652c(Context context, int i) {
            this.f9979f = context;
            this.f9980g = i;
        }

        public C5671k<C5648d> call() {
            return C5649e.m10783b(this.f9979f, this.f9980g);
        }
    }

    /* renamed from: com.airbnb.lottie.e$d */
    /* compiled from: LottieCompositionFactory */
    static class C5653d implements Callable<C5671k<C5648d>> {

        /* renamed from: f */
        final /* synthetic */ JsonReader f9981f;

        /* renamed from: g */
        final /* synthetic */ String f9982g;

        C5653d(JsonReader jsonReader, String str) {
            this.f9981f = jsonReader;
            this.f9982g = str;
        }

        public C5671k<C5648d> call() {
            return C5649e.m10785b(this.f9981f, this.f9982g);
        }
    }

    /* renamed from: com.airbnb.lottie.e$e */
    /* compiled from: LottieCompositionFactory */
    static class C5654e implements Callable<C5671k<C5648d>> {

        /* renamed from: f */
        final /* synthetic */ C5648d f9983f;

        C5654e(C5648d dVar) {
            this.f9983f = dVar;
        }

        public C5671k<C5648d> call() {
            Log.d("Gabe", "call\treturning from cache");
            return new C5671k<>(this.f9983f);
        }
    }

    /* renamed from: com.airbnb.lottie.e$f */
    /* compiled from: LottieCompositionFactory */
    static class C5655f implements C5668h<C5648d> {

        /* renamed from: a */
        final /* synthetic */ String f9984a;

        C5655f(String str) {
            this.f9984a = str;
        }

        /* renamed from: a */
        public void mo19384a(C5648d dVar) {
            if (this.f9984a != null) {
                C5728g.m11049a().mo19557a(this.f9984a, dVar);
            }
            C5649e.f9975a.remove(this.f9984a);
        }
    }

    /* renamed from: b */
    public static C5671k<C5648d> m10784b(Context context, String str) {
        try {
            String str2 = "asset_" + str;
            if (str.endsWith(MultiDexHelper.EXTRACTED_SUFFIX)) {
                return m10776a(new ZipInputStream(context.getAssets().open(str)), str2);
            }
            return m10774a(context.getAssets().open(str), str2);
        } catch (IOException e) {
            return new C5671k<>((Throwable) e);
        }
    }

    /* renamed from: c */
    public static C5672l<C5648d> m10787c(Context context, String str) {
        return C5785c.m11252a(context, str);
    }

    /* renamed from: a */
    public static C5672l<C5648d> m10778a(Context context, String str) {
        return m10780a(str, (Callable<C5671k<C5648d>>) new C5651b(context.getApplicationContext(), str));
    }

    /* renamed from: a */
    public static C5672l<C5648d> m10777a(Context context, int i) {
        return m10780a(m10781a(i), (Callable<C5671k<C5648d>>) new C5652c(context.getApplicationContext(), i));
    }

    /* renamed from: a */
    private static String m10781a(int i) {
        return "rawRes_" + i;
    }

    /* renamed from: b */
    public static C5671k<C5648d> m10783b(Context context, int i) {
        try {
            return m10774a(context.getResources().openRawResource(i), m10781a(i));
        } catch (Resources.NotFoundException e) {
            return new C5671k<>((Throwable) e);
        }
    }

    /* renamed from: a */
    public static C5671k<C5648d> m10774a(InputStream inputStream, String str) {
        return m10775a(inputStream, str, true);
    }

    /* renamed from: a */
    private static C5671k<C5648d> m10775a(InputStream inputStream, String str, boolean z) {
        try {
            return m10785b(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z) {
                C5829f.m11382a((Closeable) inputStream);
            }
        }
    }

    /* renamed from: b */
    public static C5671k<C5648d> m10785b(JsonReader jsonReader, String str) {
        try {
            C5648d a = C5817t.m11321a(jsonReader);
            C5728g.m11049a().mo19557a(str, a);
            return new C5671k<>(a);
        } catch (Exception e) {
            return new C5671k<>((Throwable) e);
        }
    }

    /* renamed from: a */
    public static C5672l<C5648d> m10779a(JsonReader jsonReader, String str) {
        return m10780a(str, (Callable<C5671k<C5648d>>) new C5653d(jsonReader, str));
    }

    /* renamed from: a */
    public static C5671k<C5648d> m10776a(ZipInputStream zipInputStream, String str) {
        try {
            return m10786b(zipInputStream, str);
        } finally {
            C5829f.m11382a((Closeable) zipInputStream);
        }
    }

    /* renamed from: b */
    private static C5671k<C5648d> m10786b(ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C5648d dVar = null;
            while (nextEntry != null) {
                if (nextEntry.getName().contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    dVar = m10775a(zipInputStream, str, false).mo19475b();
                } else if (nextEntry.getName().contains(".png")) {
                    String[] split = nextEntry.getName().split("/");
                    hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (dVar == null) {
                return new C5671k<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                C5667g a = m10773a(dVar, (String) entry.getKey());
                if (a != null) {
                    a.mo19470a((Bitmap) entry.getValue());
                }
            }
            for (Map.Entry next : dVar.mo19401h().entrySet()) {
                if (((C5667g) next.getValue()).mo19469a() == null) {
                    return new C5671k<>((Throwable) new IllegalStateException("There is no image for " + ((C5667g) next.getValue()).mo19471b()));
                }
            }
            C5728g.m11049a().mo19557a(str, dVar);
            return new C5671k<>(dVar);
        } catch (IOException e) {
            return new C5671k<>((Throwable) e);
        }
    }

    /* renamed from: a */
    private static C5667g m10773a(C5648d dVar, String str) {
        for (C5667g next : dVar.mo19401h().values()) {
            if (next.mo19471b().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static C5672l<C5648d> m10780a(String str, Callable<C5671k<C5648d>> callable) {
        C5648d a = C5728g.m11049a().mo19556a(str);
        if (a != null) {
            return new C5672l<>(new C5654e(a));
        }
        if (f9975a.containsKey(str)) {
            return f9975a.get(str);
        }
        C5672l<C5648d> lVar = new C5672l<>(callable);
        lVar.mo19479b((C5668h<C5648d>) new C5655f(str));
        lVar.mo19478a((C5668h<Throwable>) new C5650a(str));
        f9975a.put(str, lVar);
        return lVar;
    }
}
