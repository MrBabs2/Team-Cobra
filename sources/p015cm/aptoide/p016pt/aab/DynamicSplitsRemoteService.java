package p015cm.aptoide.p016pt.aab;

import java.util.Collections;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9064d;
import kotlinx.coroutines.C12190d;
import kotlinx.coroutines.C12310t0;
import p015cm.aptoide.p016pt.aab.DynamicSplitsResponse;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, mo16641d2 = {"Lcm/aptoide/pt/aab/DynamicSplitsRemoteService;", "Lcm/aptoide/pt/aab/DynamicSplitsService;", "dynamicSplitsApi", "Lcm/aptoide/pt/aab/DynamicSplitsRemoteService$DynamicSplitsApi;", "mapper", "Lcm/aptoide/pt/aab/DynamicSplitsMapper;", "(Lcm/aptoide/pt/aab/DynamicSplitsRemoteService$DynamicSplitsApi;Lcm/aptoide/pt/aab/DynamicSplitsMapper;)V", "getDynamicSplitsByMd5", "Lcm/aptoide/pt/aab/DynamicSplitsModel;", "apkMd5Sum", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapErrorResponse", "mapResponse", "dynamicSplitsResponseBody", "Lcm/aptoide/pt/aab/DynamicSplitsResponse;", "DynamicSplitsApi", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.aab.DynamicSplitsRemoteService */
/* compiled from: DynamicSplitsRemoteService.kt */
public final class DynamicSplitsRemoteService implements DynamicSplitsService {
    /* access modifiers changed from: private */
    public final DynamicSplitsApi dynamicSplitsApi;
    private final DynamicSplitsMapper mapper;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, mo16641d2 = {"Lcm/aptoide/pt/aab/DynamicSplitsRemoteService$DynamicSplitsApi;", "", "getDynamicSplitsByMd5", "Lretrofit2/Response;", "Lcm/aptoide/pt/aab/DynamicSplitsResponse;", "md5", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.aab.DynamicSplitsRemoteService$DynamicSplitsApi */
    /* compiled from: DynamicSplitsRemoteService.kt */
    public interface DynamicSplitsApi {
        @GET("app/getDynamicSplits")
        Object getDynamicSplitsByMd5(@Query("apk_md5sum") String str, C9064d<? super Response<DynamicSplitsResponse>> dVar);
    }

    public DynamicSplitsRemoteService(DynamicSplitsApi dynamicSplitsApi2, DynamicSplitsMapper dynamicSplitsMapper) {
        C10202j.m34178b(dynamicSplitsApi2, "dynamicSplitsApi");
        C10202j.m34178b(dynamicSplitsMapper, "mapper");
        this.dynamicSplitsApi = dynamicSplitsApi2;
        this.mapper = dynamicSplitsMapper;
    }

    /* access modifiers changed from: private */
    public final DynamicSplitsModel mapErrorResponse() {
        List emptyList = Collections.emptyList();
        C10202j.m34174a((Object) emptyList, "Collections.emptyList()");
        return new DynamicSplitsModel(emptyList);
    }

    /* access modifiers changed from: private */
    public final DynamicSplitsModel mapResponse(DynamicSplitsResponse dynamicSplitsResponse) {
        DynamicSplitsMapper dynamicSplitsMapper = this.mapper;
        List<DynamicSplitsResponse.DynamicSplit> dynamicSplitList = dynamicSplitsResponse.getDynamicSplitList();
        C10202j.m34174a((Object) dynamicSplitList, "dynamicSplitsResponseBody.dynamicSplitList");
        return new DynamicSplitsModel(dynamicSplitsMapper.mapDynamicSplits(dynamicSplitList));
    }

    public Object getDynamicSplitsByMd5(String str, C9064d<? super DynamicSplitsModel> dVar) {
        return C12190d.m40228a(C12310t0.m40641b(), new DynamicSplitsRemoteService$getDynamicSplitsByMd5$2(this, str, (C9064d) null), dVar);
    }
}
