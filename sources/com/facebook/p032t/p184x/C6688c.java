package com.facebook.p032t.p184x;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.p032t.p177r.p178g.C6639f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.root.execution.Command;

/* renamed from: com.facebook.t.x.c */
/* compiled from: SuggestedEventViewHierarchy */
class C6688c {

    /* renamed from: a */
    private static final List<Class<? extends View>> f12476a = new ArrayList(Arrays.asList(new Class[]{Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class}));

    C6688c() {
    }

    /* renamed from: a */
    static JSONObject m14322a(View view, View view2) {
        Class<C6688c> cls = C6688c.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            m14323a(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            List<View> b = C6639f.m14136b(view);
            for (int i = 0; i < b.size(); i++) {
                jSONArray.put(m14322a(b.get(i), view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    private static List<String> m14324b(View view) {
        Class<C6688c> cls = C6688c.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View next : C6639f.m14136b(view)) {
                String j = C6639f.m14144j(next);
                if (!j.isEmpty()) {
                    arrayList.add(j);
                }
                arrayList.addAll(m14324b(next));
            }
            return arrayList;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    static String m14325c(View view) {
        Class<C6688c> cls = C6688c.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            String j = C6639f.m14144j(view);
            if (!j.isEmpty()) {
                return j;
            }
            return TextUtils.join(" ", m14324b(view));
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    static void m14323a(View view, JSONObject jSONObject) {
        Class<C6688c> cls = C6688c.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                String j = C6639f.m14144j(view);
                String h = C6639f.m14142h(view);
                jSONObject.put("classname", view.getClass().getSimpleName());
                jSONObject.put("classtypebitmask", C6639f.m14137c(view));
                if (!j.isEmpty()) {
                    jSONObject.put(Command.CommandHandler.TEXT, j);
                }
                if (!h.isEmpty()) {
                    jSONObject.put("hint", h);
                }
                if (view instanceof EditText) {
                    jSONObject.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: a */
    static List<View> m14321a(View view) {
        Class<C6688c> cls = C6688c.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Class<? extends View> isInstance : f12476a) {
                if (isInstance.isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            for (View a : C6639f.m14136b(view)) {
                arrayList.addAll(m14321a(a));
            }
            return arrayList;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }
}
