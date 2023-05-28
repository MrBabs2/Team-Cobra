package p112n.p312h.p313a;

import android.text.TextUtils;
import android.util.SparseArray;
import com.liulishuo.filedownloader.model.C8896b;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import java.io.File;
import java.util.ArrayList;
import p112n.p312h.p313a.C10722a;
import p112n.p312h.p313a.C10745d;
import p112n.p312h.p313a.C10801w;
import p112n.p312h.p313a.p318f0.C10767d;
import p112n.p312h.p313a.p318f0.C10771f;

/* renamed from: n.h.a.c */
/* compiled from: DownloadTask */
public class C10736c implements C10722a, C10722a.C10724b, C10745d.C10746a {

    /* renamed from: a */
    private final C10801w f28772a;

    /* renamed from: b */
    private final C10801w.C10802a f28773b;

    /* renamed from: c */
    private int f28774c;

    /* renamed from: d */
    private ArrayList<C10722a.C10723a> f28775d;

    /* renamed from: e */
    private final String f28776e;

    /* renamed from: f */
    private String f28777f;

    /* renamed from: g */
    private String f28778g;

    /* renamed from: h */
    private boolean f28779h;

    /* renamed from: i */
    private FileDownloadHeader f28780i;

    /* renamed from: j */
    private C10776i f28781j;

    /* renamed from: k */
    private SparseArray<Object> f28782k;

    /* renamed from: l */
    private Object f28783l;

    /* renamed from: m */
    private int f28784m = 0;

    /* renamed from: n */
    private boolean f28785n = false;

    /* renamed from: o */
    private boolean f28786o = false;

    /* renamed from: p */
    private int f28787p = 100;

    /* renamed from: q */
    private int f28788q = 10;

    /* renamed from: r */
    private boolean f28789r = false;

    /* renamed from: s */
    volatile int f28790s = 0;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f28791t;

    /* renamed from: u */
    private final Object f28792u;

    /* renamed from: v */
    private final Object f28793v = new Object();

    /* renamed from: w */
    private volatile boolean f28794w = false;

    /* renamed from: n.h.a.c$b */
    /* compiled from: DownloadTask */
    private static final class C10738b implements C10722a.C10725c {

        /* renamed from: a */
        private final C10736c f28795a;

        /* renamed from: a */
        public int mo36432a() {
            int id = this.f28795a.getId();
            if (C10767d.f28826a) {
                C10767d.m36490a(this, "add the task[%d] to the queue", Integer.valueOf(id));
            }
            C10773h.m36524b().mo36518b((C10722a.C10724b) this.f28795a);
            return id;
        }

        private C10738b(C10736c cVar) {
            this.f28795a = cVar;
            boolean unused = cVar.f28791t = true;
        }
    }

    C10736c(String str) {
        this.f28776e = str;
        Object obj = new Object();
        this.f28792u = obj;
        C10745d dVar = new C10745d(this, obj);
        this.f28772a = dVar;
        this.f28773b = dVar;
    }

    /* renamed from: K */
    private void m36340K() {
        if (this.f28780i == null) {
            synchronized (this.f28793v) {
                if (this.f28780i == null) {
                    this.f28780i = new FileDownloadHeader();
                }
            }
        }
    }

    /* renamed from: L */
    private int m36341L() {
        if (!mo36454J()) {
            if (!mo36408j()) {
                mo36429v();
            }
            this.f28772a.mo36478g();
            return getId();
        } else if (mo36453I()) {
            throw new IllegalStateException(C10771f.m36504a("This task is running %d, if you want to start the same task, please create a new one by FileDownloader.create", Integer.valueOf(getId())));
        } else {
            throw new IllegalStateException("This task is dirty to restart, If you want to reuse this task, please invoke #reuse method manually and retry to restart again." + this.f28772a.toString());
        }
    }

    /* renamed from: A */
    public void mo36418A() {
        m36341L();
    }

    /* renamed from: B */
    public boolean mo36384B() {
        return this.f28789r;
    }

    /* renamed from: C */
    public FileDownloadHeader mo36452C() {
        return this.f28780i;
    }

    /* renamed from: D */
    public boolean mo36419D() {
        return C8896b.m29177b(getStatus());
    }

    /* renamed from: E */
    public boolean mo36385E() {
        return this.f28779h;
    }

    /* renamed from: F */
    public void mo36420F() {
        this.f28794w = true;
    }

    /* renamed from: G */
    public boolean mo36386G() {
        return this.f28785n;
    }

    /* renamed from: H */
    public String mo36387H() {
        return this.f28778g;
    }

    /* renamed from: I */
    public boolean mo36453I() {
        if (C10794q.m36615e().mo36576b().mo36579a(this)) {
            return true;
        }
        return C8896b.m29174a((int) getStatus());
    }

    /* renamed from: J */
    public boolean mo36454J() {
        return this.f28772a.getStatus() != 0;
    }

    /* renamed from: b */
    public C10722a mo36392b(String str) {
        mo36455a(str, false);
        return this;
    }

    /* renamed from: c */
    public C10722a mo36396c(int i) {
        this.f28784m = i;
        return this;
    }

    /* renamed from: d */
    public C10722a mo36397d(int i) {
        this.f28787p = i;
        return this;
    }

    /* renamed from: e */
    public int mo36399e() {
        if (this.f28772a.mo36481i() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) this.f28772a.mo36481i();
    }

    /* renamed from: f */
    public String mo36400f() {
        return C10771f.m36503a(getPath(), mo36385E(), mo36387H());
    }

    /* renamed from: g */
    public C10722a.C10725c mo36401g() {
        return new C10738b();
    }

    public int getId() {
        int i = this.f28774c;
        if (i != 0) {
            return i;
        }
        if (TextUtils.isEmpty(this.f28777f) || TextUtils.isEmpty(this.f28776e)) {
            return 0;
        }
        int a = C10771f.m36499a(this.f28776e, this.f28777f, this.f28779h);
        this.f28774c = a;
        return a;
    }

    public String getPath() {
        return this.f28777f;
    }

    public byte getStatus() {
        return this.f28772a.getStatus();
    }

    public Object getTag() {
        return this.f28783l;
    }

    /* renamed from: h */
    public String mo36406h() {
        return this.f28776e;
    }

    /* renamed from: i */
    public long mo36407i() {
        return this.f28772a.mo36480h();
    }

    /* renamed from: j */
    public boolean mo36408j() {
        return this.f28790s != 0;
    }

    /* renamed from: k */
    public int mo36409k() {
        return this.f28788q;
    }

    /* renamed from: l */
    public boolean mo36410l() {
        return this.f28786o;
    }

    /* renamed from: m */
    public C10722a.C10724b mo36457m() {
        return this;
    }

    /* renamed from: n */
    public int mo36411n() {
        return this.f28784m;
    }

    /* renamed from: o */
    public int mo36412o() {
        if (this.f28772a.mo36480h() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) this.f28772a.mo36480h();
    }

    /* renamed from: p */
    public ArrayList<C10722a.C10723a> mo36458p() {
        return this.f28775d;
    }

    public boolean pause() {
        boolean pause;
        synchronized (this.f28792u) {
            pause = this.f28772a.pause();
        }
        return pause;
    }

    /* renamed from: q */
    public long mo36414q() {
        return this.f28772a.mo36481i();
    }

    /* renamed from: r */
    public C10722a mo36425r() {
        return this;
    }

    /* renamed from: s */
    public void mo36426s() {
        m36341L();
    }

    /* renamed from: t */
    public int mo36427t() {
        return this.f28790s;
    }

    public String toString() {
        return C10771f.m36504a("%d@%s", Integer.valueOf(getId()), super.toString());
    }

    /* renamed from: u */
    public C10801w.C10802a mo36428u() {
        return this.f28773b;
    }

    /* renamed from: v */
    public void mo36429v() {
        int i;
        if (mo36415w() != null) {
            i = mo36415w().hashCode();
        } else {
            i = hashCode();
        }
        this.f28790s = i;
    }

    /* renamed from: w */
    public C10776i mo36415w() {
        return this.f28781j;
    }

    /* renamed from: x */
    public boolean mo36430x() {
        return this.f28794w;
    }

    /* renamed from: y */
    public Object mo36431y() {
        return this.f28792u;
    }

    /* renamed from: z */
    public int mo36416z() {
        return this.f28787p;
    }

    /* renamed from: a */
    public C10722a mo36455a(String str, boolean z) {
        this.f28777f = str;
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "setPath %s", str);
        }
        this.f28779h = z;
        if (z) {
            this.f28778g = null;
        } else {
            this.f28778g = new File(str).getName();
        }
        return this;
    }

    /* renamed from: b */
    public C10722a mo36393b(C10776i iVar) {
        this.f28781j = iVar;
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "setListener %s", iVar);
        }
        return this;
    }

    /* renamed from: c */
    public Throwable mo36395c() {
        return this.f28772a.mo36473c();
    }

    /* renamed from: d */
    public boolean mo36398d() {
        return this.f28772a.mo36475d();
    }

    /* renamed from: b */
    public boolean mo36394b(C10722a.C10723a aVar) {
        ArrayList<C10722a.C10723a> arrayList = this.f28775d;
        return arrayList != null && arrayList.remove(aVar);
    }

    /* renamed from: b */
    public int mo36391b() {
        return this.f28772a.mo36471b();
    }

    /* renamed from: b */
    public void mo36424b(int i) {
        this.f28790s = i;
    }

    /* renamed from: a */
    public C10722a mo36388a(int i, Object obj) {
        if (this.f28782k == null) {
            this.f28782k = new SparseArray<>(2);
        }
        this.f28782k.put(i, obj);
        return this;
    }

    /* renamed from: a */
    public C10722a mo36390a(C10722a.C10723a aVar) {
        if (this.f28775d == null) {
            this.f28775d = new ArrayList<>();
        }
        if (!this.f28775d.contains(aVar)) {
            this.f28775d.add(aVar);
        }
        return this;
    }

    /* renamed from: a */
    public C10722a mo36389a(String str, String str2) {
        m36340K();
        this.f28780i.mo32721a(str, str2);
        return this;
    }

    /* renamed from: a */
    public void mo36421a() {
        this.f28772a.mo36468a();
        if (C10773h.m36524b().mo36520c((C10722a.C10724b) this)) {
            this.f28794w = false;
        }
    }

    /* renamed from: a */
    public void mo36456a(String str) {
        this.f28778g = str;
    }

    /* renamed from: a */
    public boolean mo36422a(int i) {
        return getId() == i;
    }

    /* renamed from: a */
    public boolean mo36423a(C10776i iVar) {
        return mo36415w() == iVar;
    }
}
