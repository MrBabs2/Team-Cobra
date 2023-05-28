package p112n.p312h.p313a;

import android.content.Context;
import com.liulishuo.filedownloader.services.C8900d;
import java.io.File;
import java.util.List;
import p112n.p312h.p313a.C10722a;
import p112n.p312h.p313a.p315c0.C10744d;
import p112n.p312h.p313a.p318f0.C10763c;
import p112n.p312h.p313a.p318f0.C10767d;
import p112n.p312h.p313a.p318f0.C10771f;

/* renamed from: n.h.a.q */
/* compiled from: FileDownloader */
public class C10794q {

    /* renamed from: c */
    private static final Object f28867c = new Object();

    /* renamed from: d */
    private static final Object f28868d = new Object();

    /* renamed from: a */
    private C10800v f28869a;

    /* renamed from: b */
    private C10799u f28870b;

    /* renamed from: n.h.a.q$a */
    /* compiled from: FileDownloader */
    private static final class C10795a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C10794q f28871a = new C10794q();
    }

    /* renamed from: a */
    public static void m36614a(Context context, C8900d.C8901a aVar) {
        if (C10767d.f28826a) {
            C10767d.m36490a(C10794q.class, "init Downloader", new Object[0]);
        }
        C10763c.m36480a(context);
        C10784m.m36573c().mo36550a(aVar);
    }

    /* renamed from: e */
    public static C10794q m36615e() {
        return C10795a.f28871a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C10799u mo36576b() {
        if (this.f28870b == null) {
            synchronized (f28868d) {
                if (this.f28870b == null) {
                    C10805y yVar = new C10805y();
                    this.f28870b = yVar;
                    mo36572a((C10753e) yVar);
                }
            }
        }
        return this.f28870b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C10800v mo36577c() {
        if (this.f28869a == null) {
            synchronized (f28867c) {
                if (this.f28869a == null) {
                    this.f28869a = new C10727a0();
                }
            }
        }
        return this.f28869a;
    }

    /* renamed from: d */
    public boolean mo36578d() {
        return C10784m.m36573c().isConnected();
    }

    /* renamed from: a */
    public C10722a mo36570a(String str) {
        return new C10736c(str);
    }

    /* renamed from: a */
    public boolean mo36575a(C10776i iVar, boolean z) {
        if (iVar == null) {
            C10767d.m36495e(this, "Tasks with the listener can't start, because the listener provided is null: [null, %B]", Boolean.valueOf(z));
            return false;
        } else if (z) {
            return mo36577c().mo36441b(iVar);
        } else {
            return mo36577c().mo36439a(iVar);
        }
    }

    /* renamed from: a */
    public void mo36573a(C10776i iVar) {
        C10790p.m36603a().mo36558a(iVar);
        for (C10722a.C10724b r : C10773h.m36524b().mo36513a(iVar)) {
            r.mo36425r().pause();
        }
    }

    /* renamed from: a */
    public int mo36568a(int i) {
        List<C10722a.C10724b> c = C10773h.m36524b().mo36519c(i);
        if (c == null || c.isEmpty()) {
            C10767d.m36495e(this, "request pause but not exist %d", Integer.valueOf(i));
            return 0;
        }
        for (C10722a.C10724b r : c) {
            r.mo36425r().pause();
        }
        return c.size();
    }

    /* renamed from: a */
    public boolean mo36574a(int i, String str) {
        mo36568a(i);
        if (!C10784m.m36573c().mo36554e(i)) {
            return false;
        }
        File file = new File(C10771f.m36519g(str));
        if (file.exists()) {
            file.delete();
        }
        File file2 = new File(str);
        if (!file2.exists()) {
            return true;
        }
        file2.delete();
        return true;
    }

    /* renamed from: a */
    public int mo36569a(int i, C10776i iVar) {
        C10722a.C10724b b = C10773h.m36524b().mo36517b(i);
        if (b == null) {
            return 0;
        }
        b.mo36425r().mo36393b(iVar);
        return b.mo36425r().getId();
    }

    /* renamed from: a */
    public void mo36571a() {
        if (!mo36578d()) {
            C10784m.m36573c().mo32757a(C10763c.m36479a());
        }
    }

    /* renamed from: a */
    public void mo36572a(C10753e eVar) {
        C10757f.m36470a().mo36461a("event.service.connect.changed", (C10744d) eVar);
    }
}
