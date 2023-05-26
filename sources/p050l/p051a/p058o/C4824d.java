package p050l.p051a.p058o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p050l.p051a.C4798i;

/* renamed from: l.a.o.d */
/* compiled from: ContextThemeWrapper */
public class C4824d extends ContextWrapper {

    /* renamed from: a */
    private int f8215a;

    /* renamed from: b */
    private Resources.Theme f8216b;

    /* renamed from: c */
    private LayoutInflater f8217c;

    /* renamed from: d */
    private Configuration f8218d;

    /* renamed from: e */
    private Resources f8219e;

    public C4824d() {
        super((Context) null);
    }

    /* renamed from: b */
    private Resources m8051b() {
        if (this.f8219e == null) {
            Configuration configuration = this.f8218d;
            if (configuration == null) {
                this.f8219e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.f8219e = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources = super.getResources();
                Configuration configuration2 = new Configuration(resources.getConfiguration());
                configuration2.updateFrom(this.f8218d);
                this.f8219e = new Resources(resources.getAssets(), resources.getDisplayMetrics(), configuration2);
            }
        }
        return this.f8219e;
    }

    /* renamed from: c */
    private void m8052c() {
        boolean z = this.f8216b == null;
        if (z) {
            this.f8216b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f8216b.setTo(theme);
            }
        }
        mo16782a(this.f8216b, this.f8215a, z);
    }

    /* renamed from: a */
    public void mo16781a(Configuration configuration) {
        if (this.f8219e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f8218d == null) {
            this.f8218d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return m8051b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f8217c == null) {
            this.f8217c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f8217c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f8216b;
        if (theme != null) {
            return theme;
        }
        if (this.f8215a == 0) {
            this.f8215a = C4798i.Theme_AppCompat_Light;
        }
        m8052c();
        return this.f8216b;
    }

    public void setTheme(int i) {
        if (this.f8215a != i) {
            this.f8215a = i;
            m8052c();
        }
    }

    public C4824d(Context context, int i) {
        super(context);
        this.f8215a = i;
    }

    public C4824d(Context context, Resources.Theme theme) {
        super(context);
        this.f8216b = theme;
    }

    /* renamed from: a */
    public int mo16780a() {
        return this.f8215a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16782a(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }
}
