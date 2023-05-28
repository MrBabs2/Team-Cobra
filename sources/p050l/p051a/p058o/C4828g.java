package p050l.p051a.p058o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0142i;
import androidx.appcompat.view.menu.C0144j;
import androidx.appcompat.widget.C0278q0;
import androidx.appcompat.widget.C0301y;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import okhttp3.internal.http2.Settings;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p050l.p051a.C4799j;
import p050l.p075h.p077f.p078a.C4965a;
import p050l.p075h.p084l.C5013b;
import p050l.p075h.p084l.C5055h;

/* renamed from: l.a.o.g */
/* compiled from: SupportMenuInflater */
public class C4828g extends MenuInflater {

    /* renamed from: e */
    static final Class<?>[] f8232e;

    /* renamed from: f */
    static final Class<?>[] f8233f;

    /* renamed from: a */
    final Object[] f8234a;

    /* renamed from: b */
    final Object[] f8235b;

    /* renamed from: c */
    Context f8236c;

    /* renamed from: d */
    private Object f8237d;

    /* renamed from: l.a.o.g$a */
    /* compiled from: SupportMenuInflater */
    private static class C4829a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: h */
        private static final Class<?>[] f8238h = {MenuItem.class};

        /* renamed from: f */
        private Object f8239f;

        /* renamed from: g */
        private Method f8240g;

        public C4829a(Object obj, String str) {
            this.f8239f = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f8240g = cls.getMethod(str, f8238h);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f8240g.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f8240g.invoke(this.f8239f, new Object[]{menuItem})).booleanValue();
                }
                this.f8240g.invoke(this.f8239f, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f8232e = r0
            f8233f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p051a.p058o.C4828g.<clinit>():void");
    }

    public C4828g(Context context) {
        super(context);
        this.f8236c = context;
        Object[] objArr = {context};
        this.f8234a = objArr;
        this.f8235b = objArr;
    }

    /* renamed from: a */
    private void m8079a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        C4830b bVar = new C4830b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            bVar.mo16815d();
                        } else if (name2.equals("item")) {
                            if (!bVar.mo16814c()) {
                                C5013b bVar2 = bVar.f8241A;
                                if (bVar2 == null || !bVar2.mo802a()) {
                                    bVar.mo16810a();
                                } else {
                                    bVar.mo16812b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.mo16811a(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.mo16813b(attributeSet);
                    } else if (name3.equals("menu")) {
                        m8079a(xmlPullParser, attributeSet, bVar.mo16812b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof C4965a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f8236c.getResources().getLayout(i);
            m8079a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* renamed from: l.a.o.g$b */
    /* compiled from: SupportMenuInflater */
    private class C4830b {

        /* renamed from: A */
        C5013b f8241A;

        /* renamed from: B */
        private CharSequence f8242B;

        /* renamed from: C */
        private CharSequence f8243C;

        /* renamed from: D */
        private ColorStateList f8244D = null;

        /* renamed from: E */
        private PorterDuff.Mode f8245E = null;

        /* renamed from: a */
        private Menu f8247a;

        /* renamed from: b */
        private int f8248b;

        /* renamed from: c */
        private int f8249c;

        /* renamed from: d */
        private int f8250d;

        /* renamed from: e */
        private int f8251e;

        /* renamed from: f */
        private boolean f8252f;

        /* renamed from: g */
        private boolean f8253g;

        /* renamed from: h */
        private boolean f8254h;

        /* renamed from: i */
        private int f8255i;

        /* renamed from: j */
        private int f8256j;

        /* renamed from: k */
        private CharSequence f8257k;

        /* renamed from: l */
        private CharSequence f8258l;

        /* renamed from: m */
        private int f8259m;

        /* renamed from: n */
        private char f8260n;

        /* renamed from: o */
        private int f8261o;

        /* renamed from: p */
        private char f8262p;

        /* renamed from: q */
        private int f8263q;

        /* renamed from: r */
        private int f8264r;

        /* renamed from: s */
        private boolean f8265s;

        /* renamed from: t */
        private boolean f8266t;

        /* renamed from: u */
        private boolean f8267u;

        /* renamed from: v */
        private int f8268v;

        /* renamed from: w */
        private int f8269w;

        /* renamed from: x */
        private String f8270x;

        /* renamed from: y */
        private String f8271y;

        /* renamed from: z */
        private String f8272z;

        public C4830b(Menu menu) {
            this.f8247a = menu;
            mo16815d();
        }

        /* renamed from: a */
        public void mo16811a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C4828g.this.f8236c.obtainStyledAttributes(attributeSet, C4799j.MenuGroup);
            this.f8248b = obtainStyledAttributes.getResourceId(C4799j.MenuGroup_android_id, 0);
            this.f8249c = obtainStyledAttributes.getInt(C4799j.MenuGroup_android_menuCategory, 0);
            this.f8250d = obtainStyledAttributes.getInt(C4799j.MenuGroup_android_orderInCategory, 0);
            this.f8251e = obtainStyledAttributes.getInt(C4799j.MenuGroup_android_checkableBehavior, 0);
            this.f8252f = obtainStyledAttributes.getBoolean(C4799j.MenuGroup_android_visible, true);
            this.f8253g = obtainStyledAttributes.getBoolean(C4799j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        public void mo16813b(AttributeSet attributeSet) {
            C0278q0 a = C0278q0.m1270a(C4828g.this.f8236c, attributeSet, C4799j.MenuItem);
            this.f8255i = a.mo1729g(C4799j.MenuItem_android_id, 0);
            this.f8256j = (a.mo1723d(C4799j.MenuItem_android_menuCategory, this.f8249c) & -65536) | (a.mo1723d(C4799j.MenuItem_android_orderInCategory, this.f8250d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            this.f8257k = a.mo1726e(C4799j.MenuItem_android_title);
            this.f8258l = a.mo1726e(C4799j.MenuItem_android_titleCondensed);
            this.f8259m = a.mo1729g(C4799j.MenuItem_android_icon, 0);
            this.f8260n = m8081a(a.mo1724d(C4799j.MenuItem_android_alphabeticShortcut));
            this.f8261o = a.mo1723d(C4799j.MenuItem_alphabeticModifiers, RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT);
            this.f8262p = m8081a(a.mo1724d(C4799j.MenuItem_android_numericShortcut));
            this.f8263q = a.mo1723d(C4799j.MenuItem_numericModifiers, RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT);
            if (a.mo1730g(C4799j.MenuItem_android_checkable)) {
                this.f8264r = a.mo1716a(C4799j.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.f8264r = this.f8251e;
            }
            this.f8265s = a.mo1716a(C4799j.MenuItem_android_checked, false);
            this.f8266t = a.mo1716a(C4799j.MenuItem_android_visible, this.f8252f);
            this.f8267u = a.mo1716a(C4799j.MenuItem_android_enabled, this.f8253g);
            this.f8268v = a.mo1723d(C4799j.MenuItem_showAsAction, -1);
            this.f8272z = a.mo1724d(C4799j.MenuItem_android_onClick);
            this.f8269w = a.mo1729g(C4799j.MenuItem_actionLayout, 0);
            this.f8270x = a.mo1724d(C4799j.MenuItem_actionViewClass);
            String d = a.mo1724d(C4799j.MenuItem_actionProviderClass);
            this.f8271y = d;
            boolean z = d != null;
            if (z && this.f8269w == 0 && this.f8270x == null) {
                this.f8241A = (C5013b) m8082a(this.f8271y, C4828g.f8233f, C4828g.this.f8235b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f8241A = null;
            }
            this.f8242B = a.mo1726e(C4799j.MenuItem_contentDescription);
            this.f8243C = a.mo1726e(C4799j.MenuItem_tooltipText);
            if (a.mo1730g(C4799j.MenuItem_iconTintMode)) {
                this.f8245E = C0301y.m1449a(a.mo1723d(C4799j.MenuItem_iconTintMode, -1), this.f8245E);
            } else {
                this.f8245E = null;
            }
            if (a.mo1730g(C4799j.MenuItem_iconTint)) {
                this.f8244D = a.mo1713a(C4799j.MenuItem_iconTint);
            } else {
                this.f8244D = null;
            }
            a.mo1720b();
            this.f8254h = false;
        }

        /* renamed from: c */
        public boolean mo16814c() {
            return this.f8254h;
        }

        /* renamed from: d */
        public void mo16815d() {
            this.f8248b = 0;
            this.f8249c = 0;
            this.f8250d = 0;
            this.f8251e = 0;
            this.f8252f = true;
            this.f8253g = true;
        }

        /* renamed from: a */
        private char m8081a(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: a */
        private void m8083a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f8265s).setVisible(this.f8266t).setEnabled(this.f8267u).setCheckable(this.f8264r >= 1).setTitleCondensed(this.f8258l).setIcon(this.f8259m);
            int i = this.f8268v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f8272z != null) {
                if (!C4828g.this.f8236c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new C4829a(C4828g.this.mo16807a(), this.f8272z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f8264r >= 2) {
                if (menuItem instanceof C0142i) {
                    ((C0142i) menuItem).mo697c(true);
                } else if (menuItem instanceof C0144j) {
                    ((C0144j) menuItem).mo746a(true);
                }
            }
            String str = this.f8270x;
            if (str != null) {
                menuItem.setActionView((View) m8082a(str, C4828g.f8232e, C4828g.this.f8234a));
                z = true;
            }
            int i2 = this.f8269w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            C5013b bVar = this.f8241A;
            if (bVar != null) {
                C5055h.m9092a(menuItem, bVar);
            }
            C5055h.m9097a(menuItem, this.f8242B);
            C5055h.m9099b(menuItem, this.f8243C);
            C5055h.m9094a(menuItem, this.f8260n, this.f8261o);
            C5055h.m9098b(menuItem, this.f8262p, this.f8263q);
            PorterDuff.Mode mode = this.f8245E;
            if (mode != null) {
                C5055h.m9096a(menuItem, mode);
            }
            ColorStateList colorStateList = this.f8244D;
            if (colorStateList != null) {
                C5055h.m9095a(menuItem, colorStateList);
            }
        }

        /* renamed from: b */
        public SubMenu mo16812b() {
            this.f8254h = true;
            SubMenu addSubMenu = this.f8247a.addSubMenu(this.f8248b, this.f8255i, this.f8256j, this.f8257k);
            m8083a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: a */
        public void mo16810a() {
            this.f8254h = true;
            m8083a(this.f8247a.add(this.f8248b, this.f8255i, this.f8256j, this.f8257k));
        }

        /* renamed from: a */
        private <T> T m8082a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C4828g.this.f8236c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo16807a() {
        if (this.f8237d == null) {
            this.f8237d = m8078a(this.f8236c);
        }
        return this.f8237d;
    }

    /* renamed from: a */
    private Object m8078a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m8078a(((ContextWrapper) obj).getBaseContext()) : obj;
    }
}
