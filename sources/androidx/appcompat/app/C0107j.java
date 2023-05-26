package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.C0228c;
import androidx.appcompat.widget.C0240e;
import androidx.appcompat.widget.C0242f;
import androidx.appcompat.widget.C0256i;
import androidx.appcompat.widget.C0264k;
import androidx.appcompat.widget.C0269m;
import androidx.appcompat.widget.C0272n0;
import androidx.appcompat.widget.C0275p;
import androidx.appcompat.widget.C0286t;
import androidx.appcompat.widget.C0295v;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p050l.p051a.C4799j;
import p050l.p051a.p058o.C4824d;
import p050l.p066e.C4881g;
import p050l.p075h.p084l.C5071v;

/* renamed from: androidx.appcompat.app.j */
/* compiled from: AppCompatViewInflater */
public class C0107j {

    /* renamed from: b */
    private static final Class<?>[] f321b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final int[] f322c = {16843375};

    /* renamed from: d */
    private static final String[] f323d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e */
    private static final C4881g<String, Constructor<? extends View>> f324e = new C4881g<>();

    /* renamed from: a */
    private final Object[] f325a = new Object[2];

    /* renamed from: androidx.appcompat.app.j$a */
    /* compiled from: AppCompatViewInflater */
    private static class C0108a implements View.OnClickListener {

        /* renamed from: f */
        private final View f326f;

        /* renamed from: g */
        private final String f327g;

        /* renamed from: h */
        private Method f328h;

        /* renamed from: i */
        private Context f329i;

        public C0108a(View view, String str) {
            this.f326f = view;
            this.f327g = str;
        }

        /* renamed from: a */
        private void m420a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f327g, new Class[]{View.class})) != null) {
                        this.f328h = method;
                        this.f329i = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f326f.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f326f.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f327g + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f326f.getClass() + str);
        }

        public void onClick(View view) {
            if (this.f328h == null) {
                m420a(this.f326f.getContext());
            }
            try {
                this.f328h.invoke(this.f329i, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo395a(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo396a(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m399a(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0272n0.m1256b(context2);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 8;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 12;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = 13;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 9;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = mo409m(context2, attributeSet);
                m402a(view2, str);
                break;
            case 1:
                view2 = mo403g(context2, attributeSet);
                m402a(view2, str);
                break;
            case 2:
                view2 = mo398b(context2, attributeSet);
                m402a(view2, str);
                break;
            case 3:
                view2 = mo401e(context2, attributeSet);
                m402a(view2, str);
                break;
            case 4:
                view2 = mo408l(context2, attributeSet);
                m402a(view2, str);
                break;
            case 5:
                view2 = mo402f(context2, attributeSet);
                m402a(view2, str);
                break;
            case 6:
                view2 = mo399c(context2, attributeSet);
                m402a(view2, str);
                break;
            case 7:
                view2 = mo405i(context2, attributeSet);
                m402a(view2, str);
                break;
            case 8:
                view2 = mo400d(context2, attributeSet);
                m402a(view2, str);
                break;
            case 9:
                view2 = mo397a(context2, attributeSet);
                m402a(view2, str);
                break;
            case 10:
                view2 = mo404h(context2, attributeSet);
                m402a(view2, str);
                break;
            case 11:
                view2 = mo406j(context2, attributeSet);
                m402a(view2, str);
                break;
            case 12:
                view2 = mo407k(context2, attributeSet);
                m402a(view2, str);
                break;
            case 13:
                view2 = mo410n(context2, attributeSet);
                m402a(view2, str);
                break;
            default:
                view2 = mo395a(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = m403b(context2, str, attributeSet);
        }
        if (view2 != null) {
            m401a(view2, attributeSet);
        }
        return view2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AppCompatButton mo398b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0240e mo399c(Context context, AttributeSet attributeSet) {
        return new C0240e(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0242f mo400d(Context context, AttributeSet attributeSet) {
        return new C0242f(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0256i mo401e(Context context, AttributeSet attributeSet) {
        return new C0256i(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C0264k mo402f(Context context, AttributeSet attributeSet) {
        return new C0264k(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public AppCompatImageView mo403g(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C0269m mo404h(Context context, AttributeSet attributeSet) {
        return new C0269m(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public AppCompatRadioButton mo405i(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public AppCompatRatingBar mo406j(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C0275p mo407k(Context context, AttributeSet attributeSet) {
        return new C0275p(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public AppCompatSpinner mo408l(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C0286t mo409m(Context context, AttributeSet attributeSet) {
        return new C0286t(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C0295v mo410n(Context context, AttributeSet attributeSet) {
        return new C0295v(context, attributeSet);
    }

    /* renamed from: b */
    private View m403b(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            this.f325a[0] = context;
            this.f325a[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (String a : f323d) {
                    View a2 = m400a(context, str, a);
                    if (a2 != null) {
                        return a2;
                    }
                }
                Object[] objArr = this.f325a;
                objArr[0] = null;
                objArr[1] = null;
                return null;
            }
            View a3 = m400a(context, str, (String) null);
            Object[] objArr2 = this.f325a;
            objArr2[0] = null;
            objArr2[1] = null;
            return a3;
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr3 = this.f325a;
            objArr3[0] = null;
            objArr3[1] = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0228c mo397a(Context context, AttributeSet attributeSet) {
        return new C0228c(context, attributeSet);
    }

    /* renamed from: a */
    private void m402a(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    /* renamed from: a */
    private void m401a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || C5071v.m9214z(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f322c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0108a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private View m400a(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        Constructor<? extends U> constructor = f324e.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f321b);
            f324e.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f325a);
    }

    /* renamed from: a */
    private static Context m399a(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4799j.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C4799j.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C4799j.View_theme, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return (!(context instanceof C4824d) || ((C4824d) context).mo16780a() != resourceId) ? new C4824d(context, resourceId) : context;
        }
        return context;
    }
}
