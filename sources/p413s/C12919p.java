package p413s;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.jvm.internal.C10202j;

/* renamed from: s.p */
/* compiled from: Okio.kt */
public final class C12919p {
    /* renamed from: a */
    public static final C12910h m41675a(C12892a0 a0Var) {
        C10202j.m34178b(a0Var, "$receiver");
        return new C12925u(a0Var);
    }

    /* renamed from: b */
    public static final C12892a0 m41684b(Socket socket) throws IOException {
        C10202j.m34178b(socket, "$receiver");
        C12933z zVar = new C12933z(socket);
        InputStream inputStream = socket.getInputStream();
        C10202j.m34174a((Object) inputStream, "getInputStream()");
        return zVar.source(new C12918o(inputStream, zVar));
    }

    /* renamed from: a */
    public static final C12909g m41674a(C12932y yVar) {
        C10202j.m34178b(yVar, "$receiver");
        return new C12924t(yVar);
    }

    /* renamed from: a */
    public static final C12932y m41680a(OutputStream outputStream) {
        C10202j.m34178b(outputStream, "$receiver");
        return new C12922r(outputStream, new C12894b0());
    }

    /* renamed from: a */
    public static final C12892a0 m41673a(InputStream inputStream) {
        C10202j.m34178b(inputStream, "$receiver");
        return new C12918o(inputStream, new C12894b0());
    }

    /* renamed from: b */
    public static final C12892a0 m41683b(File file) throws FileNotFoundException {
        C10202j.m34178b(file, "$receiver");
        return m41673a((InputStream) new FileInputStream(file));
    }

    /* renamed from: a */
    public static final C12932y m41676a() {
        return new C12904e();
    }

    /* renamed from: a */
    public static final C12932y m41681a(Socket socket) throws IOException {
        C10202j.m34178b(socket, "$receiver");
        C12933z zVar = new C12933z(socket);
        OutputStream outputStream = socket.getOutputStream();
        C10202j.m34174a((Object) outputStream, "getOutputStream()");
        return zVar.sink(new C12922r(outputStream, zVar));
    }

    /* renamed from: a */
    public static final C12932y m41678a(File file, boolean z) throws FileNotFoundException {
        C10202j.m34178b(file, "$receiver");
        return m41680a((OutputStream) new FileOutputStream(file, z));
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ C12932y m41679a(File file, boolean z, int i, Object obj) throws FileNotFoundException {
        if ((i & 1) != 0) {
            z = false;
        }
        return m41678a(file, z);
    }

    /* renamed from: a */
    public static final C12932y m41677a(File file) throws FileNotFoundException {
        C10202j.m34178b(file, "$receiver");
        return m41680a((OutputStream) new FileOutputStream(file, true));
    }

    /* renamed from: a */
    public static final boolean m41682a(AssertionError assertionError) {
        C10202j.m34178b(assertionError, "$receiver");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? C12131w.m40085a((CharSequence) message, (CharSequence) "getsockname failed", false, 2, (Object) null) : false;
    }
}
