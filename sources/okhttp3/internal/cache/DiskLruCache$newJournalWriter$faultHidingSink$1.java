package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.C10483v;
import kotlin.C10485x;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p215c0.p216c.C9113l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo16641d2 = {"<anonymous>", "", "it", "Ljava/io/IOException;", "invoke"}, mo16642k = 3, mo16643mv = {1, 1, 15})
/* compiled from: DiskLruCache.kt */
final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends C10203k implements C9113l<IOException, C10483v> {
    final /* synthetic */ DiskLruCache this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.this$0 = diskLruCache;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IOException) obj);
        return C10483v.f28357a;
    }

    public final void invoke(IOException iOException) {
        C10202j.m34178b(iOException, "it");
        boolean holdsLock = Thread.holdsLock(this.this$0);
        if (!C10485x.f28360a || holdsLock) {
            this.this$0.hasJournalErrors = true;
            return;
        }
        throw new AssertionError("Assertion failed");
    }
}
