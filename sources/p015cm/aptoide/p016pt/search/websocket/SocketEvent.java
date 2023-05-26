package p015cm.aptoide.p016pt.search.websocket;

/* renamed from: cm.aptoide.pt.search.websocket.SocketEvent */
public final class SocketEvent {
    private final byte[] data;
    private final Status status;

    /* renamed from: cm.aptoide.pt.search.websocket.SocketEvent$Status */
    public enum Status {
        OPEN,
        MESSAGE,
        CLOSING,
        CLOSED,
        FAILURE
    }

    SocketEvent(Status status2, byte[] bArr) {
        this.status = status2;
        this.data = bArr;
    }

    public byte[] getData() {
        return this.data;
    }

    public Status getStatus() {
        return this.status;
    }

    public boolean hasData() {
        return this.data != null;
    }

    SocketEvent(Status status2) {
        this(status2, (byte[]) null);
    }
}
