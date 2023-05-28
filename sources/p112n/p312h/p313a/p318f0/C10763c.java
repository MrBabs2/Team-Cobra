package p112n.p312h.p313a.p318f0;

import android.annotation.SuppressLint;
import android.content.Context;
import com.liulishuo.filedownloader.message.C8887b;
import com.liulishuo.filedownloader.message.C8890c;
import com.liulishuo.filedownloader.model.C8895a;
import com.liulishuo.filedownloader.services.C8905g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p112n.p312h.p313a.C10804x;
import p112n.p312h.p313a.p314b0.C10732a;
import p112n.p312h.p313a.p317e0.C10754a;

/* renamed from: n.h.a.f0.c */
/* compiled from: FileDownloadHelper */
public class C10763c {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    private static Context f28825a;

    /* renamed from: n.h.a.f0.c$a */
    /* compiled from: FileDownloadHelper */
    public interface C10764a {
        /* renamed from: a */
        C10732a mo36102a(String str) throws IOException;
    }

    /* renamed from: n.h.a.f0.c$b */
    /* compiled from: FileDownloadHelper */
    public interface C10765b {
        /* renamed from: a */
        C8905g mo36502a();
    }

    /* renamed from: n.h.a.f0.c$c */
    /* compiled from: FileDownloadHelper */
    public interface C10766c {
        /* renamed from: a */
        C10754a mo36499a(File file) throws FileNotFoundException;

        /* renamed from: a */
        boolean mo36500a();
    }

    /* renamed from: a */
    public static void m36480a(Context context) {
        f28825a = context;
    }

    /* renamed from: a */
    public static Context m36479a() {
        return f28825a;
    }

    /* renamed from: a */
    public static boolean m36482a(int i, String str, boolean z, boolean z2) {
        if (!z && str != null) {
            File file = new File(str);
            if (file.exists()) {
                C8887b.m29133a().mo32713a(C8890c.m29140a(i, file, z2));
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m36481a(int i, C8895a aVar, C10804x xVar, boolean z) {
        if (!xVar.mo32807a(aVar)) {
            return false;
        }
        C8887b.m29133a().mo32713a(C8890c.m29139a(i, aVar.mo32741f(), aVar.mo32745j(), z));
        return true;
    }
}
