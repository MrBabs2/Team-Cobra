package retrofit2;

import kotlin.C10222o;
import kotlin.C10225p;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlinx.coroutines.C12242h;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J$\u0010\b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¨\u0006\u000b"}, mo16641d2 = {"retrofit2/KotlinExtensions$awaitResponse$2$2", "Lretrofit2/Callback;", "onFailure", "", "call", "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "retrofit"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: KotlinExtensions.kt */
public final class KotlinExtensions$awaitResponse$2$2 implements Callback<T> {
    final /* synthetic */ C12242h $continuation;

    KotlinExtensions$awaitResponse$2$2(C12242h hVar) {
        this.$continuation = hVar;
    }

    public void onFailure(Call<T> call, Throwable th) {
        C10202j.m34178b(call, "call");
        C10202j.m34178b(th, "t");
        C12242h hVar = this.$continuation;
        C10222o.C10223a aVar = C10222o.f27863f;
        Object a = C10225p.m34213a(th);
        C10222o.m34210a(a);
        hVar.resumeWith(a);
    }

    public void onResponse(Call<T> call, Response<T> response) {
        C10202j.m34178b(call, "call");
        C10202j.m34178b(response, "response");
        C12242h hVar = this.$continuation;
        C10222o.C10223a aVar = C10222o.f27863f;
        C10222o.m34210a(response);
        hVar.resumeWith(response);
    }
}
