package p050l.p051a.p058o;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: l.a.o.i */
/* compiled from: WindowCallbackWrapper */
public class C4833i implements Window.Callback {

    /* renamed from: f */
    final Window.Callback f8282f;

    public C4833i(Window.Callback callback) {
        if (callback != null) {
            this.f8282f = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    /* renamed from: a */
    public final Window.Callback mo16825a() {
        return this.f8282f;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f8282f.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f8282f.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f8282f.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f8282f.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f8282f.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f8282f.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f8282f.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f8282f.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f8282f.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.f8282f.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f8282f.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.f8282f.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.f8282f.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f8282f.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f8282f.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f8282f.onPanelClosed(i, menu);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f8282f.onPointerCaptureChanged(z);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f8282f.onPreparePanel(i, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.f8282f.onProvideKeyboardShortcuts(list, menu, i);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f8282f.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f8282f.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f8282f.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f8282f.onWindowStartingActionMode(callback);
    }

    public boolean onSearchRequested() {
        return this.f8282f.onSearchRequested();
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f8282f.onWindowStartingActionMode(callback, i);
    }
}
