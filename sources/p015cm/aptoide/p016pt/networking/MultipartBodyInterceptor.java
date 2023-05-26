package p015cm.aptoide.p016pt.networking;

import okhttp3.RequestBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.RequestBodyFactory;
import p015cm.aptoide.p016pt.dataprovider.util.HashMapNotNull;
import p123rx.Single;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.networking.MultipartBodyInterceptor */
public class MultipartBodyInterceptor implements BodyInterceptor<HashMapNotNull<String, RequestBody>> {
    private final AuthenticationPersistence authenticationPersistence;
    private final IdsRepository idsRepository;
    private final RequestBodyFactory requestBodyFactory;

    public MultipartBodyInterceptor(IdsRepository idsRepository2, RequestBodyFactory requestBodyFactory2, AuthenticationPersistence authenticationPersistence2) {
        this.idsRepository = idsRepository2;
        this.authenticationPersistence = authenticationPersistence2;
        this.requestBodyFactory = requestBodyFactory2;
    }

    /* renamed from: a */
    public /* synthetic */ Single mo13062a(HashMapNotNull hashMapNotNull, Authentication authentication) {
        return this.idsRepository.getUniqueIdentifier().mo18559a(new C3446p(this, authentication, hashMapNotNull));
    }

    public Single<HashMapNotNull<String, RequestBody>> intercept(HashMapNotNull<String, RequestBody> hashMapNotNull) {
        return this.authenticationPersistence.getAuthentication().mo18559a(new C3445o(this, hashMapNotNull)).mo18563b(Schedulers.computation());
    }

    /* renamed from: a */
    public /* synthetic */ Single mo13063a(Authentication authentication, HashMapNotNull hashMapNotNull, String str) {
        if (authentication.isAuthenticated()) {
            hashMapNotNull.put("access_token", this.requestBodyFactory.createBodyPartFromString(authentication.getAccessToken()));
        }
        hashMapNotNull.put("aptoide_uid", this.requestBodyFactory.createBodyPartFromString(str));
        return Single.m10119a(hashMapNotNull);
    }
}
