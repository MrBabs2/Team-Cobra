package p015cm.aptoide.p016pt.dataprovider.util;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import p015cm.aptoide.p016pt.dataprovider.exception.NoNetworkConnectionException;

/* renamed from: cm.aptoide.pt.dataprovider.util.ErrorUtils */
public class ErrorUtils {
    public static boolean isNoNetworkConnection(Throwable th) {
        return (th instanceof NoNetworkConnectionException) || (th.getCause() != null && (th.getCause() instanceof SocketTimeoutException)) || (th instanceof UnknownHostException) || (th instanceof ConnectException);
    }
}
