package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo16641d2 = {"okhttp3/Dns$Companion$SYSTEM$1", "Lokhttp3/Dns;", "lookup", "", "Ljava/net/InetAddress;", "hostname", "", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: Dns.kt */
public final class Dns$Companion$SYSTEM$1 implements Dns {
    Dns$Companion$SYSTEM$1() {
    }

    public List<InetAddress> lookup(String str) {
        C10202j.m34178b(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            C10202j.m34174a((Object) allByName, "InetAddress.getAllByName(hostname)");
            return C10519k.m35653k(allByName);
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }
}
