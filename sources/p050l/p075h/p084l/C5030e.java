package p050l.p075h.p084l;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: l.h.l.e */
/* compiled from: KeyEventDispatcher */
public class C5030e {

    /* renamed from: a */
    private static boolean f8889a = false;

    /* renamed from: b */
    private static Method f8890b = null;

    /* renamed from: c */
    private static boolean f8891c = false;

    /* renamed from: d */
    private static Field f8892d;

    /* renamed from: l.h.l.e$a */
    /* compiled from: KeyEventDispatcher */
    public interface C5031a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    /* renamed from: a */
    public static boolean m8984a(View view, KeyEvent keyEvent) {
        return C5071v.m9180b(view, keyEvent);
    }

    /* renamed from: a */
    public static boolean m8985a(C5031a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            return m8982a((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m8983a((Dialog) callback, keyEvent);
        }
        if ((view == null || !C5071v.m9173a(view, keyEvent)) && !aVar.superDispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m8981a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f8889a) {
            try {
                f8890b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f8889a = true;
        }
        Method method = f8890b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, new Object[]{keyEvent})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m8982a(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m8981a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C5071v.m9173a(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: a */
    private static DialogInterface.OnKeyListener m8980a(Dialog dialog) {
        if (!f8891c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f8892d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f8891c = true;
        }
        Field field = f8892d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m8983a(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener a = m8980a(dialog);
        if (a != null && a.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C5071v.m9173a(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }
}
