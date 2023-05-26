package p050l.p094l.p095a;

import android.os.Bundle;
import androidx.lifecycle.C0521j;
import androidx.lifecycle.C0547y;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p050l.p094l.p096b.C5121b;

/* renamed from: l.l.a.a */
/* compiled from: LoaderManager */
public abstract class C5112a {

    /* renamed from: l.l.a.a$a */
    /* compiled from: LoaderManager */
    public interface C5113a<D> {
        /* renamed from: a */
        C5121b<D> mo17728a(int i, Bundle bundle);

        /* renamed from: a */
        void mo17729a(C5121b<D> bVar);

        /* renamed from: a */
        void mo17730a(C5121b<D> bVar, D d);
    }

    /* renamed from: a */
    public static <T extends C0521j & C0547y> C5112a m9392a(T t) {
        return new C5114b(t, ((C0547y) t).getViewModelStore());
    }

    /* renamed from: a */
    public abstract <D> C5121b<D> mo17725a(int i, Bundle bundle, C5113a<D> aVar);

    /* renamed from: a */
    public abstract void mo17726a();

    @Deprecated
    /* renamed from: a */
    public abstract void mo17727a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
