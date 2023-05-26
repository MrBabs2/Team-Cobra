package p112n.p312h.p313a;

import android.content.Context;
import android.content.Intent;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.services.C8903f;
import com.liulishuo.filedownloader.services.FileDownloadService;
import java.util.ArrayList;
import java.util.List;
import p112n.p312h.p313a.p315c0.C10741b;
import p112n.p312h.p313a.p318f0.C10760a;

/* renamed from: n.h.a.n */
/* compiled from: FileDownloadServiceSharedTransmit */
class C10787n implements C10798t, C8903f.C8904a {

    /* renamed from: h */
    private static final Class<?> f28858h = FileDownloadService.SharedMainProcessService.class;

    /* renamed from: f */
    private final ArrayList<Runnable> f28859f = new ArrayList<>();

    /* renamed from: g */
    private C8903f f28860g;

    C10787n() {
    }

    /* renamed from: a */
    public boolean mo36551a(String str, String str2, boolean z, int i, int i2, int i3, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) {
        if (!isConnected()) {
            return C10760a.m36474a(str, str2, z);
        }
        this.f28860g.mo32787a(str, str2, z, i, i2, i3, z2, fileDownloadHeader, z3);
        return true;
    }

    /* renamed from: b */
    public byte mo36552b(int i) {
        if (!isConnected()) {
            return C10760a.m36475b(i);
        }
        return this.f28860g.mo32790b(i);
    }

    /* renamed from: d */
    public boolean mo36553d(int i) {
        if (!isConnected()) {
            return C10760a.m36476c(i);
        }
        return this.f28860g.mo32794d(i);
    }

    /* renamed from: e */
    public boolean mo36554e(int i) {
        if (!isConnected()) {
            return C10760a.m36473a(i);
        }
        return this.f28860g.mo32795e(i);
    }

    public boolean isConnected() {
        return this.f28860g != null;
    }

    /* renamed from: a */
    public void mo32757a(Context context) {
        mo36555a(context, (Runnable) null);
    }

    /* renamed from: a */
    public void mo36555a(Context context, Runnable runnable) {
        if (runnable != null && !this.f28859f.contains(runnable)) {
            this.f28859f.add(runnable);
        }
        context.startService(new Intent(context, f28858h));
    }

    /* renamed from: a */
    public void mo32803a(C8903f fVar) {
        this.f28860g = fVar;
        this.f28859f.clear();
        for (Runnable run : (List) this.f28859f.clone()) {
            run.run();
        }
        C10757f.m36470a().mo36460a(new C10741b(C10741b.C10742a.connected, f28858h));
    }

    /* renamed from: a */
    public void mo32802a() {
        this.f28860g = null;
        C10757f.m36470a().mo36460a(new C10741b(C10741b.C10742a.disconnected, f28858h));
    }
}
