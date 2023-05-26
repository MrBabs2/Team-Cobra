package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import androidx.core.app.C0388n;
import androidx.core.content.C0394a;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.core.app.a */
/* compiled from: ActivityCompat */
public class C0352a extends C0394a {

    /* renamed from: c */
    private static C0355c f1643c;

    /* renamed from: androidx.core.app.a$a */
    /* compiled from: ActivityCompat */
    class C0353a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String[] f1644f;

        /* renamed from: g */
        final /* synthetic */ Activity f1645g;

        /* renamed from: h */
        final /* synthetic */ int f1646h;

        C0353a(String[] strArr, Activity activity, int i) {
            this.f1644f = strArr;
            this.f1645g = activity;
            this.f1646h = i;
        }

        public void run() {
            int[] iArr = new int[this.f1644f.length];
            PackageManager packageManager = this.f1645g.getPackageManager();
            String packageName = this.f1645g.getPackageName();
            int length = this.f1644f.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f1644f[i], packageName);
            }
            ((C0354b) this.f1645g).onRequestPermissionsResult(this.f1646h, this.f1644f, iArr);
        }
    }

    /* renamed from: androidx.core.app.a$b */
    /* compiled from: ActivityCompat */
    public interface C0354b {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: androidx.core.app.a$c */
    /* compiled from: ActivityCompat */
    public interface C0355c {
        /* renamed from: a */
        boolean mo2199a(Activity activity, int i, int i2, Intent intent);

        /* renamed from: a */
        boolean mo2200a(Activity activity, String[] strArr, int i);
    }

    /* renamed from: androidx.core.app.a$d */
    /* compiled from: ActivityCompat */
    public interface C0356d {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* renamed from: androidx.core.app.a$e */
    /* compiled from: ActivityCompat */
    private static class C0357e extends SharedElementCallback {

        /* renamed from: a */
        private final C0388n f1647a;

        /* renamed from: androidx.core.app.a$e$a */
        /* compiled from: ActivityCompat */
        class C0358a implements C0388n.C0389a {
            C0358a(C0357e eVar, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            }
        }

        C0357e(C0388n nVar) {
            this.f1647a = nVar;
        }

        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f1647a.mo2274a(view, matrix, rectF);
        }

        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f1647a.mo2275a(context, parcelable);
        }

        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f1647a.mo2279a(list, map);
        }

        public void onRejectSharedElements(List<View> list) {
            this.f1647a.mo2276a(list);
        }

        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f1647a.mo2278a(list, list2, list3);
        }

        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f1647a.mo2280b(list, list2, list3);
        }

        public void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f1647a.mo2277a(list, list2, (C0388n.C0389a) new C0358a(this, onSharedElementsReadyListener));
        }
    }

    /* renamed from: a */
    public static C0355c m1768a() {
        return f1643c;
    }

    /* renamed from: b */
    public static void m1775b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    /* renamed from: c */
    public static void m1777c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.postponeEnterTransition();
        }
    }

    /* renamed from: d */
    public static void m1778d(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else if (!C0361c.m1787a(activity)) {
            activity.recreate();
        }
    }

    /* renamed from: e */
    public static void m1779e(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.startPostponedEnterTransition();
        }
    }

    /* renamed from: a */
    public static void m1770a(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: b */
    public static void m1776b(Activity activity, C0388n nVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setExitSharedElementCallback(nVar != null ? new C0357e(nVar) : null);
        }
    }

    /* renamed from: a */
    public static void m1771a(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m1769a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: a */
    public static void m1772a(Activity activity, C0388n nVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setEnterSharedElementCallback(nVar != null ? new C0357e(nVar) : null);
        }
    }

    /* renamed from: a */
    public static void m1773a(Activity activity, String[] strArr, int i) {
        C0355c cVar = f1643c;
        if (cVar != null && cVar.mo2200a(activity, strArr, i)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof C0356d) {
                ((C0356d) activity).validateRequestPermissionsRequestCode(i);
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof C0354b) {
            new Handler(Looper.getMainLooper()).post(new C0353a(strArr, activity, i));
        }
    }

    /* renamed from: a */
    public static boolean m1774a(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }
}
