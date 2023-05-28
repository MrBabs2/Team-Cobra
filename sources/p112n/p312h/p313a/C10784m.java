package p112n.p312h.p313a;

import android.content.Context;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.services.C8900d;
import com.liulishuo.filedownloader.services.C8903f;
import p112n.p312h.p313a.p318f0.C10768e;

/* renamed from: n.h.a.m */
/* compiled from: FileDownloadServiceProxy */
public class C10784m implements C10798t {

    /* renamed from: f */
    private C8900d.C8901a f28855f;

    /* renamed from: g */
    private final C10798t f28856g;

    /* renamed from: n.h.a.m$b */
    /* compiled from: FileDownloadServiceProxy */
    private static final class C10786b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C10784m f28857a = new C10784m();
    }

    /* renamed from: b */
    public static C8903f.C8904a m36572b() {
        if (m36573c().f28856g instanceof C10787n) {
            return (C8903f.C8904a) m36573c().f28856g;
        }
        return null;
    }

    /* renamed from: c */
    public static C10784m m36573c() {
        return C10786b.f28857a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36550a(C8900d.C8901a aVar) {
        this.f28855f = aVar;
    }

    /* renamed from: d */
    public boolean mo36553d(int i) {
        return this.f28856g.mo36553d(i);
    }

    /* renamed from: e */
    public boolean mo36554e(int i) {
        return this.f28856g.mo36554e(i);
    }

    public boolean isConnected() {
        return this.f28856g.isConnected();
    }

    private C10784m() {
        this.f28856g = C10768e.m36497a().f28830d ? new C10787n() : new C10788o();
    }

    /* renamed from: a */
    public C8900d mo36549a() {
        return new C8900d(this.f28855f);
    }

    /* renamed from: a */
    public boolean mo36551a(String str, String str2, boolean z, int i, int i2, int i3, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) {
        return this.f28856g.mo36551a(str, str2, z, i, i2, i3, z2, fileDownloadHeader, z3);
    }

    /* renamed from: b */
    public byte mo36552b(int i) {
        return this.f28856g.mo36552b(i);
    }

    /* renamed from: a */
    public void mo32757a(Context context) {
        this.f28856g.mo32757a(context);
    }
}
