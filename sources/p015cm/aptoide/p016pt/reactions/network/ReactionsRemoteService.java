package p015cm.aptoide.p016pt.reactions.network;

import java.net.ConnectException;
import java.util.ArrayList;
import p015cm.aptoide.p016pt.dataprovider.exception.NoNetworkConnectionException;
import p015cm.aptoide.p016pt.reactions.data.TopReaction;
import p015cm.aptoide.p016pt.reactions.network.ReactionsResponse;
import p015cm.aptoide.p016pt.reactions.network.TopReactionsResponse;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.Single;
import retrofit2.Response;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* renamed from: cm.aptoide.pt.reactions.network.ReactionsRemoteService */
public class ReactionsRemoteService implements ReactionsService {
    private C5373h ioScheduler;
    private ServiceV8 service;

    /* renamed from: cm.aptoide.pt.reactions.network.ReactionsRemoteService$ServiceV8 */
    public interface ServiceV8 {
        @DELETE("echo/8.20181122/reactions/{uid}/")
        C5368e<Response<Void>> deleteReaction(@Path("uid") String str);

        @GET("echo/8.20181122/groups/{group_id}/objects/{id}/reactions/summary")
        C5368e<TopReactionsResponse> getTopReactionsResponse(@Path("group_id") String str, @Path("id") String str2);

        @POST("echo/8.20181122/reactions/")
        C5368e<Response<Void>> setFirstUserReaction(@retrofit2.http.Body Body body);

        @PATCH("echo/8.20181122/reactions/{uid}/")
        C5368e<Response<Void>> setSecondUserReaction(@Path("uid") String str, @retrofit2.http.Body Body body);
    }

    public ReactionsRemoteService(ServiceV8 serviceV8, C5373h hVar) {
        this.service = serviceV8;
        this.ioScheduler = hVar;
    }

    /* access modifiers changed from: private */
    public ReactionsResponse mapErrorResponse(Throwable th) {
        if ((th instanceof NoNetworkConnectionException) || (th instanceof ConnectException)) {
            return new ReactionsResponse(ReactionsResponse.ReactionResponseMessage.NETWORK_ERROR);
        }
        return new ReactionsResponse(ReactionsResponse.ReactionResponseMessage.GENERAL_ERROR);
    }

    /* access modifiers changed from: private */
    public ReactionsResponse mapResponse(Response response) {
        return new ReactionsResponse(ReactionsResponse.ReactionResponseMapper.mapReactionResponse(response));
    }

    /* access modifiers changed from: private */
    public LoadReactionModel mapToTopReactionsList(TopReactionsResponse topReactionsResponse) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (TopReactionsResponse.ReactionTypeResponse next : topReactionsResponse.getTop()) {
            arrayList.add(new TopReaction(next.getType(), next.getTotal()));
        }
        String str2 = "";
        if (topReactionsResponse.getMy() != null) {
            str2 = topReactionsResponse.getMy().getType();
            str = topReactionsResponse.getMy().getUid();
        } else {
            str = str2;
        }
        return new LoadReactionModel(topReactionsResponse.getTotal(), str2, str, arrayList);
    }

    public Single<ReactionsResponse> deleteReaction(String str) {
        return this.service.deleteReaction(str).mo18694j(new C3952b(this)).mo18700m().mo18563b(this.ioScheduler).mo18571f(new C3953c(this));
    }

    public Single<LoadReactionModel> loadReactionModel(String str, String str2) {
        return this.service.getTopReactionsResponse(str2, str).mo18694j(new C3951a(this)).mo18700m().mo18563b(this.ioScheduler);
    }

    public Single<ReactionsResponse> setReaction(String str, String str2, String str3) {
        return this.service.setFirstUserReaction(new Body(str, str2, str3)).mo18694j(new C3952b(this)).mo18700m().mo18563b(this.ioScheduler).mo18571f(new C3953c(this));
    }

    public Single<ReactionsResponse> setSecondReaction(String str, String str2) {
        return this.service.setSecondUserReaction(str, new Body(str2)).mo18694j(new C3952b(this)).mo18700m().mo18563b(this.ioScheduler).mo18571f(new C3953c(this));
    }

    /* renamed from: cm.aptoide.pt.reactions.network.ReactionsRemoteService$Body */
    public static class Body {
        private String groupUid;
        private String objectUid;
        private String type;

        public Body(String str, String str2, String str3) {
            this.objectUid = str;
            this.groupUid = str2;
            this.type = str3;
        }

        public String getGroupUid() {
            return this.groupUid;
        }

        public String getObjectUid() {
            return this.objectUid;
        }

        public String getType() {
            return this.type;
        }

        public void setGroupUid(String str) {
            this.groupUid = str;
        }

        public void setObjectUid(String str) {
            this.objectUid = str;
        }

        public void setType(String str) {
            this.type = str;
        }

        public Body(String str) {
            this.type = str;
        }
    }
}
