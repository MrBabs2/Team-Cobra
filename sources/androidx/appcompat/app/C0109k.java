package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: androidx.appcompat.app.k */
/* compiled from: ResourcesFlusher */
class C0109k {

    /* renamed from: a */
    private static Field f330a;

    /* renamed from: b */
    private static boolean f331b;

    /* renamed from: c */
    private static Class<?> f332c;

    /* renamed from: d */
    private static boolean f333d;

    /* renamed from: e */
    private static Field f334e;

    /* renamed from: f */
    private static boolean f335f;

    /* renamed from: g */
    private static Field f336g;

    /* renamed from: h */
    private static boolean f337h;

    /* renamed from: a */
    static void m421a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                m425d(resources);
            } else if (i >= 23) {
                m424c(resources);
            } else if (i >= 21) {
                m423b(resources);
            }
        }
    }

    /* renamed from: b */
    private static void m423b(Resources resources) {
        if (!f331b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f330a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f331b = true;
        }
        Field field = f330a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m424c(Resources resources) {
        if (!f331b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f330a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f331b = true;
        }
        Object obj = null;
        Field field = f330a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (obj != null) {
            m422a(obj);
        }
    }

    /* renamed from: d */
    private static void m425d(Resources resources) {
        Object obj;
        if (!f337h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f336g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f337h = true;
        }
        Field field = f336g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                obj = null;
            }
            if (obj != null) {
                if (!f331b) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        f330a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    f331b = true;
                }
                Field field2 = f330a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                    }
                }
                if (obj2 != null) {
                    m422a(obj2);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m422a(Object obj) {
        if (!f333d) {
            try {
                f332c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f333d = true;
        }
        Class<?> cls = f332c;
        if (cls != null) {
            if (!f335f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f334e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f335f = true;
            }
            Field field = f334e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
