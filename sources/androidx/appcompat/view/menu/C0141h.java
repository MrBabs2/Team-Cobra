package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.C0074c;
import androidx.appcompat.view.menu.C0153m;
import p050l.p051a.C4796g;

/* renamed from: androidx.appcompat.view.menu.h */
/* compiled from: MenuDialogHelper */
class C0141h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C0153m.C0154a {

    /* renamed from: f */
    private C0138g f549f;

    /* renamed from: g */
    private C0074c f550g;

    /* renamed from: h */
    C0135e f551h;

    /* renamed from: i */
    private C0153m.C0154a f552i;

    public C0141h(C0138g gVar) {
        this.f549f = gVar;
    }

    /* renamed from: a */
    public void mo686a(IBinder iBinder) {
        C0138g gVar = this.f549f;
        C0074c.C0075a aVar = new C0074c.C0075a(gVar.mo655e());
        C0135e eVar = new C0135e(aVar.mo226b(), C4796g.abc_list_menu_item_layout);
        this.f551h = eVar;
        eVar.mo551a((C0153m.C0154a) this);
        this.f549f.mo620a((C0153m) this.f551h);
        aVar.mo219a(this.f551h.mo590a(), (DialogInterface.OnClickListener) this);
        View i = gVar.mo663i();
        if (i != null) {
            aVar.mo217a(i);
        } else {
            aVar.mo216a(gVar.mo659g());
            aVar.mo230b(gVar.mo661h());
        }
        aVar.mo215a((DialogInterface.OnKeyListener) this);
        C0074c a = aVar.mo225a();
        this.f550g = a;
        a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f550g.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f550g.show();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f549f.mo624a((MenuItem) (C0142i) this.f551h.mo590a().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f551h.mo549a(this.f549f, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f550g.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f550g.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f549f.mo623a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f549f.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: a */
    public void mo685a() {
        C0074c cVar = this.f550g;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    /* renamed from: a */
    public void mo349a(C0138g gVar, boolean z) {
        if (z || gVar == this.f549f) {
            mo685a();
        }
        C0153m.C0154a aVar = this.f552i;
        if (aVar != null) {
            aVar.mo349a(gVar, z);
        }
    }

    /* renamed from: a */
    public boolean mo350a(C0138g gVar) {
        C0153m.C0154a aVar = this.f552i;
        if (aVar != null) {
            return aVar.mo350a(gVar);
        }
        return false;
    }
}
