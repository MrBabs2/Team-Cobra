package p368r.p369a.p370g;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashSet;
import p368r.p369a.C11594b;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: r.a.g.o */
/* compiled from: NetworkTopologyDiscoveryImpl */
public class C11660o implements C11594b {

    /* renamed from: a */
    private static final C12938b f31084a = C12939c.m41778a(C11660o.class.getName());

    /* renamed from: a */
    public InetAddress[] mo37844a() {
        HashSet hashSet = new HashSet();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if (f31084a.mo41314b()) {
                        C12938b bVar = f31084a;
                        bVar.mo41319d("Found NetworkInterface/InetAddress: " + nextElement + " -- " + nextElement2);
                    }
                    if (mo38157a(nextElement, nextElement2)) {
                        hashSet.add(nextElement2);
                    }
                }
            }
        } catch (SocketException e) {
            C12938b bVar2 = f31084a;
            bVar2.mo41315c("Error while fetching network interfaces addresses: " + e);
        }
        return (InetAddress[]) hashSet.toArray(new InetAddress[hashSet.size()]);
    }

    /* renamed from: a */
    public boolean mo38157a(NetworkInterface networkInterface, InetAddress inetAddress) {
        try {
            if (networkInterface.isUp() && networkInterface.supportsMulticast() && !networkInterface.isLoopback()) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
