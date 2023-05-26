package okhttp3.internal;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import okhttp3.Call;
import okhttp3.EventListener;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo16641d2 = {"okhttp3/internal/Util$asFactory$1", "Lokhttp3/EventListener$Factory;", "create", "Lokhttp3/EventListener;", "call", "Lokhttp3/Call;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: Util.kt */
public final class Util$asFactory$1 implements EventListener.Factory {
    final /* synthetic */ EventListener $this_asFactory;

    Util$asFactory$1(EventListener eventListener) {
        this.$this_asFactory = eventListener;
    }

    public EventListener create(Call call) {
        C10202j.m34178b(call, "call");
        return this.$this_asFactory;
    }
}
