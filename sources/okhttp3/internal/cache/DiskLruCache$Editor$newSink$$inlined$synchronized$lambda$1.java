package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p215c0.p216c.C9113l;
import okhttp3.internal.cache.DiskLruCache;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo16641d2 = {"<anonymous>", "", "it", "Ljava/io/IOException;", "invoke", "okhttp3/internal/cache/DiskLruCache$Editor$newSink$1$1"}, mo16642k = 3, mo16643mv = {1, 1, 15})
/* compiled from: DiskLruCache.kt */
final class DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1 extends C10203k implements C9113l<IOException, C10483v> {
    final /* synthetic */ int $index$inlined;
    final /* synthetic */ DiskLruCache.Editor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1(DiskLruCache.Editor editor, int i) {
        super(1);
        this.this$0 = editor;
        this.$index$inlined = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IOException) obj);
        return C10483v.f28357a;
    }

    public final void invoke(IOException iOException) {
        C10202j.m34178b(iOException, "it");
        synchronized (this.this$0.this$0) {
            this.this$0.detach$okhttp();
            C10483v vVar = C10483v.f28357a;
        }
    }
}
