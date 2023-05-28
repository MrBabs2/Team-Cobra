package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0296v0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0352a;
import androidx.core.app.C0371g;
import androidx.core.app.C0390o;
import androidx.fragment.app.C0456c;
import p050l.p051a.p058o.C4821b;

/* renamed from: androidx.appcompat.app.d */
/* compiled from: AppCompatActivity */
public class C0076d extends C0456c implements C0077e, C0390o.C0391a {
    private C0078f mDelegate;
    private Resources mResources;

    public C0076d() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean performMenuItemShortcut(android.view.KeyEvent r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L_0x003e
            boolean r0 = r3.isCtrlPressed()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getRepeatCount()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003e
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L_0x003e
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003e
            android.view.View r0 = r0.getDecorView()
            boolean r3 = r0.dispatchKeyShortcutEvent(r3)
            if (r3 == 0) goto L_0x003e
            r3 = 1
            return r3
        L_0x003e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0076d.performMenuItemShortcut(android.view.KeyEvent):boolean");
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo288a(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().mo292b(context));
    }

    public void closeOptionsMenu() {
        C0069a supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo190e()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0069a supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.mo184a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i) {
        return getDelegate().mo282a(i);
    }

    public C0078f getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = C0078f.m241a((Activity) this, (C0077e) this);
        }
        return this.mDelegate;
    }

    public C0073b getDrawerToggleDelegate() {
        return getDelegate().mo293b();
    }

    public MenuInflater getMenuInflater() {
        return getDelegate().mo300d();
    }

    public Resources getResources() {
        if (this.mResources == null && C0296v0.m1411b()) {
            this.mResources = new C0296v0(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public C0069a getSupportActionBar() {
        return getDelegate().mo302e();
    }

    public Intent getSupportParentActivityIntent() {
        return C0371g.m1800a(this);
    }

    public void invalidateOptionsMenu() {
        getDelegate().mo304g();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        getDelegate().mo285a(configuration);
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0078f delegate = getDelegate();
        delegate.mo303f();
        delegate.mo286a(bundle);
        super.onCreate(bundle);
    }

    public void onCreateSupportNavigateUpTaskStack(C0390o oVar) {
        oVar.mo2281a((Activity) this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo305h();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0069a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo193g() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onNightModeChanged(int i) {
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().mo294b(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        getDelegate().mo306i();
    }

    public void onPrepareSupportNavigateUpTaskStack(C0390o oVar) {
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getDelegate().mo299c(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        getDelegate().mo307j();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        getDelegate().mo308k();
    }

    public void onSupportActionModeFinished(C4821b bVar) {
    }

    public void onSupportActionModeStarted(C4821b bVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            C0390o a = C0390o.m1891a((Context) this);
            onCreateSupportNavigateUpTaskStack(a);
            onPrepareSupportNavigateUpTaskStack(a);
            a.mo2284a();
            try {
                C0352a.m1769a(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().mo290a(charSequence);
    }

    public C4821b onWindowStartingSupportActionMode(C4821b.C4822a aVar) {
        return null;
    }

    public void openOptionsMenu() {
        C0069a supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo198k()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        getDelegate().mo298c(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().mo289a(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().mo301d(i);
    }

    public C4821b startSupportActionMode(C4821b.C4822a aVar) {
        return getDelegate().mo283a(aVar);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().mo304g();
    }

    public void supportNavigateUpTo(Intent intent) {
        C0371g.m1802a((Activity) this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo296b(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return C0371g.m1805b((Activity) this, intent);
    }

    public C0076d(int i) {
        super(i);
    }

    public void setContentView(View view) {
        getDelegate().mo287a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo295b(view, layoutParams);
    }
}
