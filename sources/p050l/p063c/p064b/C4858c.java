package p050l.p063c.p064b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.C0359b;
import androidx.core.app.C0367e;
import androidx.core.content.C0394a;
import java.util.ArrayList;

/* renamed from: l.c.b.c */
/* compiled from: CustomTabsIntent */
public final class C4858c {

    /* renamed from: a */
    public final Intent f8326a;

    /* renamed from: b */
    public final Bundle f8327b;

    /* renamed from: l.c.b.c$a */
    /* compiled from: CustomTabsIntent */
    public static final class C4859a {

        /* renamed from: a */
        private final Intent f8328a;

        /* renamed from: b */
        private ArrayList<Bundle> f8329b;

        /* renamed from: c */
        private Bundle f8330c;

        /* renamed from: d */
        private ArrayList<Bundle> f8331d;

        /* renamed from: e */
        private boolean f8332e;

        public C4859a() {
            this((C4862e) null);
        }

        /* renamed from: a */
        public C4859a mo16890a(int i) {
            this.f8328a.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", i);
            return this;
        }

        /* renamed from: b */
        public C4859a mo16895b(Context context, int i, int i2) {
            this.f8330c = C0359b.m1782a(context, i, i2).mo2209a();
            return this;
        }

        public C4859a(C4862e eVar) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f8328a = intent;
            IBinder iBinder = null;
            this.f8329b = null;
            this.f8330c = null;
            this.f8331d = null;
            this.f8332e = true;
            if (eVar != null) {
                intent.setPackage(eVar.mo16900b().getPackageName());
            }
            Bundle bundle = new Bundle();
            C0367e.m1797a(bundle, "android.support.customtabs.extra.SESSION", eVar != null ? eVar.mo16898a() : iBinder);
            this.f8328a.putExtras(bundle);
        }

        /* renamed from: a */
        public C4859a mo16892a(Bitmap bitmap) {
            this.f8328a.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", bitmap);
            return this;
        }

        /* renamed from: a */
        public C4859a mo16894a(boolean z) {
            this.f8328a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z ? 1 : 0);
            return this;
        }

        /* renamed from: b */
        public C4858c mo16896b() {
            ArrayList<Bundle> arrayList = this.f8329b;
            if (arrayList != null) {
                this.f8328a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f8331d;
            if (arrayList2 != null) {
                this.f8328a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f8328a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f8332e);
            return new C4858c(this.f8328a, this.f8330c);
        }

        /* renamed from: a */
        public C4859a mo16893a(String str, PendingIntent pendingIntent) {
            if (this.f8329b == null) {
                this.f8329b = new ArrayList<>();
            }
            Bundle bundle = new Bundle();
            bundle.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", str);
            bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
            this.f8329b.add(bundle);
            return this;
        }

        /* renamed from: a */
        public C4859a mo16889a() {
            this.f8328a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            return this;
        }

        /* renamed from: a */
        public C4859a mo16891a(Context context, int i, int i2) {
            this.f8328a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", C0359b.m1782a(context, i, i2).mo2209a());
            return this;
        }
    }

    C4858c(Intent intent, Bundle bundle) {
        this.f8326a = intent;
        this.f8327b = bundle;
    }

    /* renamed from: a */
    public void mo16888a(Context context, Uri uri) {
        this.f8326a.setData(uri);
        C0394a.m1912a(context, this.f8326a, this.f8327b);
    }
}
