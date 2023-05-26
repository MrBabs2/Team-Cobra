package okhttp3;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.root.execution.Command;
import p413s.C12911i;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0016"}, mo16641d2 = {"Lokhttp3/WebSocketListener;", "", "()V", "onClosed", "", "webSocket", "Lokhttp3/WebSocket;", "code", "", "reason", "", "onClosing", "onFailure", "t", "", "response", "Lokhttp3/Response;", "onMessage", "text", "bytes", "Lokio/ByteString;", "onOpen", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: WebSocketListener.kt */
public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int i, String str) {
        C10202j.m34178b(webSocket, "webSocket");
        C10202j.m34178b(str, "reason");
    }

    public void onClosing(WebSocket webSocket, int i, String str) {
        C10202j.m34178b(webSocket, "webSocket");
        C10202j.m34178b(str, "reason");
    }

    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        C10202j.m34178b(webSocket, "webSocket");
        C10202j.m34178b(th, "t");
    }

    public void onMessage(WebSocket webSocket, String str) {
        C10202j.m34178b(webSocket, "webSocket");
        C10202j.m34178b(str, Command.CommandHandler.TEXT);
    }

    public void onMessage(WebSocket webSocket, C12911i iVar) {
        C10202j.m34178b(webSocket, "webSocket");
        C10202j.m34178b(iVar, "bytes");
    }

    public void onOpen(WebSocket webSocket, Response response) {
        C10202j.m34178b(webSocket, "webSocket");
        C10202j.m34178b(response, "response");
    }
}
