package p015cm.aptoide.p016pt.link;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.C0394a;
import p015cm.aptoide.p016pt.C1086R;
import p050l.p063c.p064b.C4858c;

/* renamed from: cm.aptoide.pt.link.CustomTabsHelper */
public class CustomTabsHelper {
    private static CustomTabsHelper customTabsHelper;

    private CustomTabsHelper() {
        if (customTabsHelper != null) {
            throw new IllegalStateException("Already instantiated");
        }
    }

    private void addRefererHttpHeader(Context context, C4858c cVar) {
        Bundle bundle = new Bundle();
        bundle.putString("Referer", "http://m.aptoide.com");
        cVar.f8326a.putExtra("com.android.browser.headers", bundle);
        cVar.f8326a.getExtras();
        if (Build.VERSION.SDK_INT >= 22) {
            Intent intent = cVar.f8326a;
            intent.putExtra("android.intent.extra.REFERRER_NAME", "android-app://" + context.getPackageName() + "/");
        }
    }

    private C4858c.C4859a getBuilder(Context context, int i) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context.getApplicationContext(), 0, new Intent(context.getApplicationContext(), CustomTabNativeReceiver.class), 0);
        C4858c.C4859a aVar = new C4858c.C4859a();
        aVar.mo16890a(C0394a.m1909a(context, i));
        aVar.mo16894a(true);
        aVar.mo16892a(BitmapFactory.decodeResource(context.getResources(), C1086R.C1087drawable.ic_arrow_back));
        aVar.mo16889a();
        aVar.mo16893a(context.getString(C1086R.string.customtabs_open_native_app), broadcast);
        aVar.mo16895b(context, C1086R.anim.slide_in_right, C1086R.anim.slide_out_left);
        aVar.mo16891a(context, C1086R.anim.slide_in_left, C1086R.anim.slide_out_right);
        return aVar;
    }

    public static CustomTabsHelper getInstance() {
        if (customTabsHelper == null) {
            customTabsHelper = new CustomTabsHelper();
        }
        return customTabsHelper;
    }

    public void openInChromeCustomTab(String str, Context context, int i) {
        C4858c b = getBuilder(context, i).mo16896b();
        addRefererHttpHeader(context, b);
        b.f8326a.setFlags(268435456);
        b.mo16888a(context, Uri.parse(str));
    }
}
