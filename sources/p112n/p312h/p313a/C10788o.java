package p112n.p312h.p313a;

import android.os.IBinder;
import android.os.RemoteException;
import com.liulishuo.filedownloader.message.C8887b;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.services.C8897a;
import com.liulishuo.filedownloader.services.FileDownloadService;
import p112n.p312h.p313a.p316d0.C10747a;
import p112n.p312h.p313a.p316d0.C10750b;
import p112n.p312h.p313a.p318f0.C10760a;

/* renamed from: n.h.a.o */
/* compiled from: FileDownloadServiceUIGuard */
class C10788o extends C8897a<C10789a, C10750b> {

    /* renamed from: n.h.a.o$a */
    /* compiled from: FileDownloadServiceUIGuard */
    protected static class C10789a extends C10747a.C10748a {
        protected C10789a() {
        }

        /* renamed from: b */
        public void mo36484b(MessageSnapshot messageSnapshot) throws RemoteException {
            C8887b.m29133a().mo32713a(messageSnapshot);
        }
    }

    C10788o() {
        super(FileDownloadService.SeparateProcessService.class);
    }

    /* renamed from: d */
    public boolean mo36553d(int i) {
        if (!isConnected()) {
            return C10760a.m36476c(i);
        }
        try {
            return ((C10750b) mo32760b()).mo32794d(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: e */
    public boolean mo36554e(int i) {
        if (!isConnected()) {
            return C10760a.m36473a(i);
        }
        try {
            return ((C10750b) mo32760b()).mo32795e(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo32761b(C10750b bVar, C10789a aVar) throws RemoteException {
        bVar.mo32792b((C10747a) aVar);
    }

    /* renamed from: b */
    public byte mo36552b(int i) {
        if (!isConnected()) {
            return C10760a.m36475b(i);
        }
        try {
            return ((C10750b) mo32760b()).mo32790b(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10789a m36593a() {
        return new C10789a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10750b m36592a(IBinder iBinder) {
        return C10750b.C10751a.m36442a(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32759a(C10750b bVar, C10789a aVar) throws RemoteException {
        bVar.mo32788a(aVar);
    }

    /* renamed from: a */
    public boolean mo36551a(String str, String str2, boolean z, int i, int i2, int i3, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) {
        if (!isConnected()) {
            return C10760a.m36474a(str, str2, z);
        }
        try {
            ((C10750b) mo32760b()).mo32787a(str, str2, z, i, i2, i3, z2, fileDownloadHeader, z3);
            return true;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }
}
