package p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p015cm.aptoide.p016pt.dataprovider.model.p019v3.BaseV3Response;
import p015cm.aptoide.p016pt.dataprovider.model.p019v3.CheckUserCredentialsJson;
import p015cm.aptoide.p016pt.dataprovider.model.p019v3.OAuth;
import p015cm.aptoide.p016pt.dataprovider.model.p019v3.TermsAndConditionsResponse;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.GenericResponseV2;
import p015cm.aptoide.p016pt.dataprovider.util.HashMapNotNull;
import p123rx.C5368e;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v3.Service */
public interface Service {
    @FormUrlEncoded
    @POST("addApkFlag")
    C5368e<GenericResponseV2> addApkFlag(@FieldMap BaseBody baseBody, @Header("X-Bypass-Cache") boolean z);

    @FormUrlEncoded
    @POST("checkUserCredentials")
    C5368e<CheckUserCredentialsJson> checkUserCredentials(@FieldMap BaseBody baseBody, @Header("X-Bypass-Cache") boolean z);

    @FormUrlEncoded
    @POST("createUser")
    C5368e<BaseV3Response> createUser(@FieldMap BaseBody baseBody, @Header("X-Bypass-Cache") boolean z);

    @POST("createUser")
    @Multipart
    C5368e<BaseV3Response> createUserWithFile(@Part MultipartBody.Part part, @PartMap HashMapNotNull<String, RequestBody> hashMapNotNull, @Header("X-Bypass-Cache") boolean z);

    @FormUrlEncoded
    @POST("getPushNotifications")
    C5368e<GetPushNotificationsResponse> getPushNotifications(@FieldMap BaseBody baseBody, @Header("X-Bypass-Cache") boolean z);

    @FormUrlEncoded
    @POST("getUserInfo")
    C5368e<TermsAndConditionsResponse> getTermsAndConditionsStatus(@FieldMap BaseBody baseBody, @Header("X-Bypass-Cache") boolean z);

    @FormUrlEncoded
    @POST("getUserInfo")
    C5368e<CheckUserCredentialsJson> getUserInfo(@FieldMap BaseBody baseBody, @Header("X-Bypass-Cache") boolean z);

    @FormUrlEncoded
    @POST("oauth2Authentication")
    C5368e<OAuth> oauth2Authentication(@FieldMap BaseBody baseBody, @Header("X-Bypass-Cache") boolean z);

    @FormUrlEncoded
    @POST("acceptUserAgreement")
    C5368e<BaseV3Response> updateTermsAndConditions(@FieldMap BaseBody baseBody, @Header("X-Bypass-Cache") boolean z);
}
