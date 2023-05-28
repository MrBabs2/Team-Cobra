package p050l.p051a.p058o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import p050l.p051a.C4790a;
import p050l.p051a.C4791b;
import p050l.p051a.C4793d;
import p050l.p051a.C4799j;

/* renamed from: l.a.o.a */
/* compiled from: ActionBarPolicy */
public class C4820a {

    /* renamed from: a */
    private Context f8212a;

    private C4820a(Context context) {
        this.f8212a = context;
    }

    /* renamed from: a */
    public static C4820a m8020a(Context context) {
        return new C4820a(context);
    }

    /* renamed from: b */
    public int mo16771b() {
        return this.f8212a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: c */
    public int mo16772c() {
        Configuration configuration = this.f8212a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: d */
    public int mo16773d() {
        return this.f8212a.getResources().getDimensionPixelSize(C4793d.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: e */
    public int mo16774e() {
        TypedArray obtainStyledAttributes = this.f8212a.obtainStyledAttributes((AttributeSet) null, C4799j.ActionBar, C4790a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C4799j.ActionBar_height, 0);
        Resources resources = this.f8212a.getResources();
        if (!mo16775f()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C4793d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: f */
    public boolean mo16775f() {
        return this.f8212a.getResources().getBoolean(C4791b.abc_action_bar_embed_tabs);
    }

    /* renamed from: g */
    public boolean mo16776g() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f8212a).hasPermanentMenuKey();
    }

    /* renamed from: a */
    public boolean mo16770a() {
        return this.f8212a.getApplicationInfo().targetSdkVersion < 14;
    }
}
