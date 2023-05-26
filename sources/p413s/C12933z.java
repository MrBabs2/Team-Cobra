package p413s;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C10202j;

/* renamed from: s.z */
/* compiled from: Okio.kt */
final class C12933z extends C12899d {

    /* renamed from: a */
    private final Logger f33206a = Logger.getLogger("okio.Okio");

    /* renamed from: b */
    private final Socket f33207b;

    public C12933z(Socket socket) {
        C10202j.m34178b(socket, "socket");
        this.f33207b = socket;
    }

    /* access modifiers changed from: protected */
    public IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* access modifiers changed from: protected */
    public void timedOut() {
        try {
            this.f33207b.close();
        } catch (Exception e) {
            Logger logger = this.f33206a;
            Level level = Level.WARNING;
            logger.log(level, "Failed to close timed out socket " + this.f33207b, e);
        } catch (AssertionError e2) {
            if (C12919p.m41682a(e2)) {
                Logger logger2 = this.f33206a;
                Level level2 = Level.WARNING;
                logger2.log(level2, "Failed to close timed out socket " + this.f33207b, e2);
                return;
            }
            throw e2;
        }
    }
}
