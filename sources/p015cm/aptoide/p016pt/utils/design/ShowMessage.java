package p015cm.aptoide.p016pt.utils.design;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.google.android.material.snackbar.Snackbar;
import p015cm.aptoide.p016pt.logger.Logger;
import p123rx.C12464c;
import p123rx.C5328b;

@Deprecated
/* renamed from: cm.aptoide.pt.utils.design.ShowMessage */
public class ShowMessage {
    private static final String TAG = "ShowMessage";

    public static C5328b asLongObservableSnack(Activity activity, int i) {
        return asSnackObservableInternal(asLongSnackInternal(activity, i));
    }

    public static void asLongSnack(Activity activity, String str) {
        asSnackInternal(activity, str, 0).mo31972k();
    }

    private static Snackbar asLongSnackInternal(View view, String str) {
        return Snackbar.m28076a(view, (CharSequence) str, 0);
    }

    public static C5328b asObservableSnack(View view, String str, String str2, View.OnClickListener onClickListener) {
        return asSnackObservableInternal(asSnackInternal(view, str, str2, onClickListener, -1));
    }

    public static void asSnack(View view, String str, String str2, View.OnClickListener onClickListener, int i) {
        asSnackInternal(view, str, str2, onClickListener, i).mo31972k();
    }

    public static void asSnackIndefiniteTime(Activity activity, String str, int i, View.OnClickListener onClickListener) {
        Snackbar asSnackInternal = asSnackInternal(activity, str, i, onClickListener, -2);
        if (asSnackInternal != null) {
            asSnackInternal.mo31972k();
        }
    }

    private static Snackbar asSnackInternal(View view, String str, String str2, View.OnClickListener onClickListener, int i) {
        Snackbar a = Snackbar.m28076a(view, (CharSequence) str, i);
        a.mo32014a((CharSequence) str2, onClickListener);
        return a;
    }

    private static C5328b asSnackObservableInternal(final Snackbar snackbar) {
        return C5328b.m10158a((C5328b.C5366w) new C5328b.C5366w() {
            public void call(final C12464c cVar) {
                Snackbar.this.mo31956a(new Snackbar.C8598b() {
                    public void onDismissed(Snackbar snackbar, int i) {
                        super.onDismissed(snackbar, i);
                        snackbar.mo31959b(this);
                        cVar.onCompleted();
                    }

                    public void onShown(Snackbar snackbar) {
                        super.onShown(snackbar);
                    }
                });
                Snackbar.this.mo31972k();
            }
        });
    }

    @Deprecated
    public static void asToast(Context context, String str) {
        Toast.makeText(context, str, 0).show();
    }

    private static View getViewFromActivity(Activity activity) {
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = activity.findViewById(16908290);
        }
        if (currentFocus != null) {
            return currentFocus;
        }
        Logger.getInstance().mo12981e(TAG, (Throwable) new IllegalStateException("Unable to find a view to bind this snack too"));
        return null;
    }

    public static C5328b asLongObservableSnack(View view, int i) {
        return asSnackObservableInternal(asLongSnackInternal(view, i));
    }

    public static void asLongSnack(Fragment fragment, String str) {
        asLongSnackInternal(fragment, str).mo31972k();
    }

    private static Snackbar asLongSnackInternal(View view, int i) {
        return Snackbar.m28075a(view, i, 0);
    }

    public static void asSnack(View view, String str) {
        asSnackInternal(view, str).mo31972k();
    }

    public static C5328b asLongObservableSnack(View view, String str) {
        return asSnackObservableInternal(asLongSnackInternal(view, str));
    }

    public static void asLongSnack(Fragment fragment, int i) {
        asLongSnackInternal(fragment, i).mo31972k();
    }

    private static Snackbar asLongSnackInternal(Fragment fragment, int i) {
        return asLongSnackInternal(fragment.getView(), i);
    }

    public static C5328b asObservableSnack(View view, String str) {
        return asSnackObservableInternal(asSnackInternal(view, str));
    }

    public static void asSnack(View view, int i, int i2, View.OnClickListener onClickListener) {
        asSnackInternal(view, i, i2, onClickListener).mo31972k();
    }

    private static Snackbar asSnackInternal(View view, String str) {
        return Snackbar.m28076a(view, (CharSequence) str, -1);
    }

    @Deprecated
    public static void asToast(Context context, int i) {
        Toast.makeText(context, i, 0).show();
    }

    public static C5328b asLongObservableSnack(Fragment fragment, int i) {
        return asSnackObservableInternal(asLongSnackInternal(fragment, i));
    }

    private static Snackbar asLongSnackInternal(Fragment fragment, String str) {
        return asLongSnackInternal(fragment.getView(), str);
    }

    public static C5328b asObservableSnack(View view, int i, int i2, View.OnClickListener onClickListener) {
        return asSnackObservableInternal(asSnackInternal(view, i, i2, onClickListener));
    }

    public static void asSnack(View view, int i) {
        asSnackInternal(view, i).mo31972k();
    }

    private static Snackbar asSnackInternal(View view, int i, int i2, View.OnClickListener onClickListener) {
        Snackbar a = Snackbar.m28075a(view, i, -1);
        a.mo32011a(i2, onClickListener);
        return a;
    }

    private static Snackbar asLongSnackInternal(Activity activity, int i) {
        return asLongSnackInternal(getViewFromActivity(activity), i);
    }

    public static C5328b asObservableSnack(View view, int i) {
        return asSnackObservableInternal(asSnackInternal(view, i));
    }

    public static void asSnack(Activity activity, String str) {
        asSnackInternal(activity, str).mo31972k();
    }

    public static C5328b asObservableSnack(Activity activity, String str) {
        return asSnackObservableInternal(asSnackInternal(activity, str));
    }

    public static void asSnack(Activity activity, int i) {
        asSnackInternal(activity, i).mo31972k();
    }

    private static Snackbar asSnackInternal(View view, int i) {
        return Snackbar.m28075a(view, i, -1);
    }

    public static C5328b asObservableSnack(Activity activity, int i) {
        return asSnackObservableInternal(asSnackInternal(activity, i));
    }

    public static void asSnack(Fragment fragment, String str) {
        asSnackInternal(fragment, str).mo31972k();
    }

    private static Snackbar asSnackInternal(Activity activity, String str, int i) {
        return Snackbar.m28076a(getViewFromActivity(activity), (CharSequence) str, i);
    }

    public static C5328b asObservableSnack(Fragment fragment, String str) {
        return asSnackObservableInternal(asSnackInternal(fragment, str));
    }

    public static void asSnack(Fragment fragment, int i) {
        asSnackInternal(fragment, i).mo31972k();
    }

    public static C5328b asObservableSnack(Fragment fragment, int i) {
        return asSnackObservableInternal(asSnackInternal(fragment, i));
    }

    public static void asSnack(Activity activity, int i, int i2, View.OnClickListener onClickListener, int i3) {
        Snackbar asSnackInternal = asSnackInternal(activity, i, i2, onClickListener, i3);
        if (asSnackInternal != null) {
            asSnackInternal.mo31972k();
        }
    }

    private static Snackbar asSnackInternal(Activity activity, String str) {
        return asSnackInternal(activity, str, -1);
    }

    public static C5328b asObservableSnack(Activity activity, int i, int i2, View.OnClickListener onClickListener) {
        Snackbar asSnackInternal = asSnackInternal(activity, i, i2, onClickListener, -1);
        if (asSnackInternal != null) {
            return asSnackObservableInternal(asSnackInternal);
        }
        return C5328b.m10163b((Throwable) new IllegalStateException("Extracted view from activity is null"));
    }

    private static Snackbar asSnackInternal(Activity activity, int i) {
        return Snackbar.m28075a(getViewFromActivity(activity), i, -1);
    }

    public static void asSnack(android.app.Fragment fragment, int i) {
        asSnackInternal(fragment, i).mo31972k();
    }

    private static Snackbar asSnackInternal(Fragment fragment, String str) {
        return Snackbar.m28076a(fragment.getView(), (CharSequence) str, -1);
    }

    public static C5328b asObservableSnack(android.app.Fragment fragment, int i) {
        return asSnackObservableInternal(asSnackInternal(fragment, i));
    }

    private static Snackbar asSnackInternal(Fragment fragment, int i) {
        return Snackbar.m28075a(fragment.getView(), i, -1);
    }

    private static Snackbar asSnackInternal(Activity activity, String str, int i, View.OnClickListener onClickListener, int i2) {
        View viewFromActivity = getViewFromActivity(activity);
        if (viewFromActivity == null) {
            return null;
        }
        Snackbar a = Snackbar.m28076a(viewFromActivity, (CharSequence) str, i2);
        a.mo32011a(i, onClickListener);
        return a;
    }

    private static Snackbar asSnackInternal(Activity activity, int i, int i2, View.OnClickListener onClickListener, int i3) {
        View viewFromActivity = getViewFromActivity(activity);
        if (viewFromActivity == null) {
            return null;
        }
        Snackbar a = Snackbar.m28075a(viewFromActivity, i, i3);
        a.mo32011a(i2, onClickListener);
        return a;
    }

    @TargetApi(11)
    private static Snackbar asSnackInternal(android.app.Fragment fragment, int i) {
        return Snackbar.m28075a(fragment.getView(), i, -1);
    }
}
