package com.facebook.p032t.p177r.p178g;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.internal.C6476x;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.google.android.gms.ads.AdRequest;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Http2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.root.execution.Command;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment;

/* renamed from: com.facebook.t.r.g.f */
/* compiled from: ViewHierarchy */
public class C6639f {

    /* renamed from: a */
    private static final String f12366a = "com.facebook.t.r.g.f";

    /* renamed from: b */
    private static WeakReference<View> f12367b = new WeakReference<>((Object) null);

    /* renamed from: c */
    private static Method f12368c = null;

    /* renamed from: a */
    public static void m14134a(View view, JSONObject jSONObject) {
        Class<C6639f> cls = C6639f.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                String j = m14144j(view);
                String h = m14142h(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", m14137c(view));
                jSONObject.put(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID, view.getId());
                if (!C6637d.m14119a(view)) {
                    jSONObject.put(Command.CommandHandler.TEXT, C6476x.m13486a(C6476x.m13540g(j), ""));
                } else {
                    jSONObject.put(Command.CommandHandler.TEXT, "");
                    jSONObject.put("is_user_input", true);
                }
                jSONObject.put("hint", C6476x.m13486a(C6476x.m13540g(h), ""));
                if (tag != null) {
                    jSONObject.put(StoreTabGridRecyclerFragment.BundleCons.TAG, C6476x.m13486a(C6476x.m13540g(tag.toString()), ""));
                }
                if (contentDescription != null) {
                    jSONObject.put("description", C6476x.m13486a(C6476x.m13540g(contentDescription.toString()), ""));
                }
                jSONObject.put("dimension", m14139e(view));
            } catch (JSONException e) {
                C6476x.m13507a(f12366a, (Exception) e);
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: b */
    public static List<View> m14136b(View view) {
        Class<C6639f> cls = C6639f.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    arrayList.add(viewGroup.getChildAt(i));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    public static int m14137c(View view) {
        Class<C6639f> cls = C6639f.class;
        if (C6391a.m13260a((Object) cls)) {
            return 0;
        }
        try {
            int i = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i |= 32;
            }
            if (m14146l(view)) {
                i |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            if (view instanceof TextView) {
                int i2 = i | 1024 | 1;
                if (view instanceof Button) {
                    i2 |= 4;
                    if (view instanceof Switch) {
                        i2 |= 8192;
                    } else if (view instanceof CheckBox) {
                        i2 |= 32768;
                    }
                }
                if (view instanceof EditText) {
                    return i2 | RecyclerView.C0638l.FLAG_MOVED;
                }
                return i2;
            }
            if (!(view instanceof Spinner)) {
                if (!(view instanceof DatePicker)) {
                    if (view instanceof RatingBar) {
                        return i | 65536;
                    }
                    if (view instanceof RadioGroup) {
                        return i | Http2.INITIAL_MAX_FRAME_SIZE;
                    }
                    return (!(view instanceof ViewGroup) || !m14135a(view, (View) f12367b.get())) ? i : i | 64;
                }
            }
            return i | RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return 0;
        }
    }

    /* renamed from: d */
    public static JSONObject m14138d(View view) {
        JSONObject jSONObject;
        Class<C6639f> cls = C6639f.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
                f12367b = new WeakReference<>(view);
            }
            jSONObject = new JSONObject();
            m14134a(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            List<View> b = m14136b(view);
            for (int i = 0; i < b.size(); i++) {
                jSONArray.put(m14138d(b.get(i)));
            }
            jSONObject.put("childviews", jSONArray);
        } catch (JSONException e) {
            Log.e(f12366a, "Failed to create JSONObject for view.", e);
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
        return jSONObject;
    }

    /* renamed from: e */
    private static JSONObject m14139e(View view) {
        JSONObject jSONObject;
        Class<C6639f> cls = C6639f.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            jSONObject = new JSONObject();
            jSONObject.put("top", view.getTop());
            jSONObject.put("left", view.getLeft());
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("scrollx", view.getScrollX());
            jSONObject.put("scrolly", view.getScrollY());
            jSONObject.put("visibility", view.getVisibility());
        } catch (JSONException e) {
            Log.e(f12366a, "Failed to create JSONObject for dimension.", e);
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
        return jSONObject;
    }

    /* renamed from: f */
    public static View.OnClickListener m14140f(View view) {
        Field declaredField;
        Class<C6639f> cls = C6639f.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (View.OnClickListener) declaredField.get(obj);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: g */
    public static View.OnTouchListener m14141g(View view) {
        Field declaredField;
        Class<C6639f> cls = C6639f.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (View.OnTouchListener) declaredField.get(obj);
        } catch (NoSuchFieldException e) {
            C6476x.m13507a(f12366a, (Exception) e);
        } catch (ClassNotFoundException e2) {
            C6476x.m13507a(f12366a, (Exception) e2);
        } catch (IllegalAccessException e3) {
            C6476x.m13507a(f12366a, (Exception) e3);
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
        return null;
    }

    /* renamed from: h */
    public static String m14142h(View view) {
        CharSequence charSequence;
        Class<C6639f> cls = C6639f.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                charSequence = ((EditText) view).getHint();
            } else {
                charSequence = view instanceof TextView ? ((TextView) view).getHint() : null;
            }
            if (charSequence == null) {
                return "";
            }
            return charSequence.toString();
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: i */
    public static ViewGroup m14143i(View view) {
        Class<C6639f> cls = C6639f.class;
        if (C6391a.m13260a((Object) cls) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00da A[Catch:{ all -> 0x00e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd A[Catch:{ all -> 0x00e2 }] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m14144j(android.view.View r9) {
        /*
            java.lang.Class<com.facebook.t.r.g.f> r0 = com.facebook.p032t.p177r.p178g.C6639f.class
            boolean r1 = com.facebook.internal.p168a0.p170f.C6391a.m13260a((java.lang.Object) r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            boolean r1 = r9 instanceof android.widget.TextView     // Catch:{ all -> 0x00e2 }
            if (r1 == 0) goto L_0x0029
            r1 = r9
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ all -> 0x00e2 }
            java.lang.CharSequence r1 = r1.getText()     // Catch:{ all -> 0x00e2 }
            boolean r3 = r9 instanceof android.widget.Switch     // Catch:{ all -> 0x00e2 }
            if (r3 == 0) goto L_0x00d8
            android.widget.Switch r9 = (android.widget.Switch) r9     // Catch:{ all -> 0x00e2 }
            boolean r9 = r9.isChecked()     // Catch:{ all -> 0x00e2 }
            if (r9 == 0) goto L_0x0024
            java.lang.String r9 = "1"
            goto L_0x0026
        L_0x0024:
            java.lang.String r9 = "0"
        L_0x0026:
            r1 = r9
            goto L_0x00d8
        L_0x0029:
            boolean r1 = r9 instanceof android.widget.Spinner     // Catch:{ all -> 0x00e2 }
            if (r1 == 0) goto L_0x0043
            r1 = r9
            android.widget.Spinner r1 = (android.widget.Spinner) r1     // Catch:{ all -> 0x00e2 }
            int r1 = r1.getCount()     // Catch:{ all -> 0x00e2 }
            if (r1 <= 0) goto L_0x00d7
            android.widget.Spinner r9 = (android.widget.Spinner) r9     // Catch:{ all -> 0x00e2 }
            java.lang.Object r9 = r9.getSelectedItem()     // Catch:{ all -> 0x00e2 }
            if (r9 == 0) goto L_0x00d7
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00e2 }
            goto L_0x0026
        L_0x0043:
            boolean r1 = r9 instanceof android.widget.DatePicker     // Catch:{ all -> 0x00e2 }
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0074
            android.widget.DatePicker r9 = (android.widget.DatePicker) r9     // Catch:{ all -> 0x00e2 }
            int r1 = r9.getYear()     // Catch:{ all -> 0x00e2 }
            int r6 = r9.getMonth()     // Catch:{ all -> 0x00e2 }
            int r9 = r9.getDayOfMonth()     // Catch:{ all -> 0x00e2 }
            java.lang.String r7 = "%04d-%02d-%02d"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x00e2 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00e2 }
            r8[r5] = r1     // Catch:{ all -> 0x00e2 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00e2 }
            r8[r4] = r1     // Catch:{ all -> 0x00e2 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00e2 }
            r8[r3] = r9     // Catch:{ all -> 0x00e2 }
            java.lang.String r1 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x00e2 }
            goto L_0x00d8
        L_0x0074:
            boolean r1 = r9 instanceof android.widget.TimePicker     // Catch:{ all -> 0x00e2 }
            if (r1 == 0) goto L_0x009f
            android.widget.TimePicker r9 = (android.widget.TimePicker) r9     // Catch:{ all -> 0x00e2 }
            java.lang.Integer r1 = r9.getCurrentHour()     // Catch:{ all -> 0x00e2 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x00e2 }
            java.lang.Integer r9 = r9.getCurrentMinute()     // Catch:{ all -> 0x00e2 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x00e2 }
            java.lang.String r6 = "%02d:%02d"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00e2 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00e2 }
            r3[r5] = r1     // Catch:{ all -> 0x00e2 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00e2 }
            r3[r4] = r9     // Catch:{ all -> 0x00e2 }
            java.lang.String r1 = java.lang.String.format(r6, r3)     // Catch:{ all -> 0x00e2 }
            goto L_0x00d8
        L_0x009f:
            boolean r1 = r9 instanceof android.widget.RadioGroup     // Catch:{ all -> 0x00e2 }
            if (r1 == 0) goto L_0x00c8
            android.widget.RadioGroup r9 = (android.widget.RadioGroup) r9     // Catch:{ all -> 0x00e2 }
            int r1 = r9.getCheckedRadioButtonId()     // Catch:{ all -> 0x00e2 }
            int r3 = r9.getChildCount()     // Catch:{ all -> 0x00e2 }
        L_0x00ad:
            if (r5 >= r3) goto L_0x00d7
            android.view.View r4 = r9.getChildAt(r5)     // Catch:{ all -> 0x00e2 }
            int r6 = r4.getId()     // Catch:{ all -> 0x00e2 }
            if (r6 != r1) goto L_0x00c5
            boolean r6 = r4 instanceof android.widget.RadioButton     // Catch:{ all -> 0x00e2 }
            if (r6 == 0) goto L_0x00c5
            android.widget.RadioButton r4 = (android.widget.RadioButton) r4     // Catch:{ all -> 0x00e2 }
            java.lang.CharSequence r9 = r4.getText()     // Catch:{ all -> 0x00e2 }
            goto L_0x0026
        L_0x00c5:
            int r5 = r5 + 1
            goto L_0x00ad
        L_0x00c8:
            boolean r1 = r9 instanceof android.widget.RatingBar     // Catch:{ all -> 0x00e2 }
            if (r1 == 0) goto L_0x00d7
            android.widget.RatingBar r9 = (android.widget.RatingBar) r9     // Catch:{ all -> 0x00e2 }
            float r9 = r9.getRating()     // Catch:{ all -> 0x00e2 }
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00e2 }
            goto L_0x00d8
        L_0x00d7:
            r1 = r2
        L_0x00d8:
            if (r1 != 0) goto L_0x00dd
            java.lang.String r9 = ""
            goto L_0x00e1
        L_0x00dd:
            java.lang.String r9 = r1.toString()     // Catch:{ all -> 0x00e2 }
        L_0x00e1:
            return r9
        L_0x00e2:
            r9 = move-exception
            com.facebook.internal.p168a0.p170f.C6391a.m13259a(r9, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p032t.p177r.p178g.C6639f.m14144j(android.view.View):java.lang.String");
    }

    /* renamed from: k */
    private static float[] m14145k(View view) {
        Class<C6639f> cls = C6639f.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return new float[]{(float) iArr[0], (float) iArr[1]};
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: l */
    private static boolean m14146l(View view) {
        Class<C6639f> cls = C6639f.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            Class<?> a = m14131a("androidx.core.view.NestedScrollingChild");
            if (a != null && a.isInstance(parent)) {
                return true;
            }
            Class<?> a2 = m14131a("androidx.core.view.NestedScrollingChild");
            if (a2 == null || !a2.isInstance(parent)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }

    /* renamed from: m */
    public static boolean m14147m(View view) {
        Class<C6639f> cls = C6639f.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            return view.getClass().getName().equals("com.facebook.react.ReactRootView");
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0029 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m14133a(android.view.View r5, android.view.View.OnClickListener r6) {
        /*
            java.lang.Class<com.facebook.t.r.g.f> r0 = com.facebook.p032t.p177r.p178g.C6639f.class
            boolean r1 = com.facebook.internal.p168a0.p170f.C6391a.m13260a((java.lang.Object) r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            r1 = 0
            java.lang.String r2 = "android.view.View"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0025 }
            java.lang.String r3 = "mListenerInfo"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0025 }
            java.lang.String r3 = "android.view.View$ListenerInfo"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0026 }
            java.lang.String r4 = "mOnClickListener"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0026 }
            goto L_0x0027
        L_0x0023:
            r5 = move-exception
            goto L_0x004a
        L_0x0025:
            r2 = r1
        L_0x0026:
            r3 = r1
        L_0x0027:
            if (r2 == 0) goto L_0x0046
            if (r3 != 0) goto L_0x002c
            goto L_0x0046
        L_0x002c:
            r4 = 1
            r2.setAccessible(r4)     // Catch:{ Exception -> 0x004d, all -> 0x0023 }
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x004d, all -> 0x0023 }
            r2.setAccessible(r4)     // Catch:{ IllegalAccessException -> 0x003b }
            java.lang.Object r1 = r2.get(r5)     // Catch:{ IllegalAccessException -> 0x003b }
            goto L_0x003c
        L_0x003b:
        L_0x003c:
            if (r1 != 0) goto L_0x0042
            r5.setOnClickListener(r6)     // Catch:{ Exception -> 0x004d, all -> 0x0023 }
            return
        L_0x0042:
            r3.set(r1, r6)     // Catch:{ Exception -> 0x004d, all -> 0x0023 }
            goto L_0x004d
        L_0x0046:
            r5.setOnClickListener(r6)     // Catch:{ Exception -> 0x004d, all -> 0x0023 }
            return
        L_0x004a:
            com.facebook.internal.p168a0.p170f.C6391a.m13259a(r5, r0)
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p032t.p177r.p178g.C6639f.m14133a(android.view.View, android.view.View$OnClickListener):void");
    }

    /* renamed from: a */
    public static View m14130a(float[] fArr, View view) {
        View view2;
        Class<C6639f> cls = C6639f.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            m14132a();
            if (!(f12368c == null || view == null)) {
                View view3 = (View) f12368c.invoke((Object) null, new Object[]{fArr, view});
                if (view3 == null || view3.getId() <= 0 || (view2 = (View) view3.getParent()) == null) {
                    return null;
                }
                return view2;
            }
        } catch (IllegalAccessException e) {
            C6476x.m13507a(f12366a, (Exception) e);
        } catch (InvocationTargetException e2) {
            C6476x.m13507a(f12366a, (Exception) e2);
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m14135a(View view, View view2) {
        View a;
        Class<C6639f> cls = C6639f.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            if (!view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup") || (a = m14130a(m14145k(view), view2)) == null || a.getId() != view.getId()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }

    /* renamed from: a */
    public static View m14129a(View view) {
        Class<C6639f> cls = C6639f.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        while (view != null) {
            try {
                if (!m14147m(view)) {
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m14132a() {
        Class<C6639f> cls = C6639f.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                if (f12368c == null) {
                    Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", new Class[]{float[].class, ViewGroup.class});
                    f12368c = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
            } catch (ClassNotFoundException e) {
                C6476x.m13507a(f12366a, (Exception) e);
            } catch (NoSuchMethodException e2) {
                C6476x.m13507a(f12366a, (Exception) e2);
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: a */
    private static Class<?> m14131a(String str) {
        Class<C6639f> cls = C6639f.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }
}
