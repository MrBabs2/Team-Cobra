package p015cm.aptoide.p016pt.install.remote;

import java.net.InetAddress;

/* renamed from: cm.aptoide.pt.install.remote.ReceiverDevice */
public class ReceiverDevice {
    private InetAddress address;
    private String deviceName;
    private int port;

    public ReceiverDevice(String str, InetAddress inetAddress, int i) {
        this.deviceName = str;
        this.address = inetAddress;
        this.port = i;
    }

    public InetAddress getAddress() {
        return this.address;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public int getPort() {
        return this.port;
    }

    public boolean isSameDevice(ReceiverDevice receiverDevice) {
        return this.address.getHostAddress().equals(receiverDevice.getAddress().getHostAddress());
    }

    public void setAddress(InetAddress inetAddress) {
        this.address = inetAddress;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }
}
