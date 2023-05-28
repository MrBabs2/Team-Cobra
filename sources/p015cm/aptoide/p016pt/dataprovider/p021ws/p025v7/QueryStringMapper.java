package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.util.HashMap;
import java.util.Map;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.GetAppRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.GetRecommendedRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.ListAppsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.ListSearchAppsRequest;
import p015cm.aptoide.p016pt.reviews.RateAndReviewsFragment;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.QueryStringMapper */
public class QueryStringMapper {
    private String getNodesAsString(GetAppRequest.Body body) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
            objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
            return objectMapper.writeValueAsString(body.getNodes());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void put(String str, Object obj, Map<String, String> map) {
        if (obj != null) {
            map.put(str, String.valueOf(obj));
        }
    }

    public Map<String, String> map(BaseBody baseBody, boolean z, Map<String, String> map) {
        put("aptoide_md5sum", baseBody.getAptoideMd5sum(), map);
        put("aptoide_package", baseBody.getAptoidePackage(), map);
        put("aptoide_vercode", Integer.valueOf(baseBody.getAptoideVercode()), map);
        put("cdn", baseBody.getCdn(), map);
        put("lang", baseBody.getLang(), map);
        put("mature", Boolean.valueOf(baseBody.isMature()), map);
        put("q", baseBody.getQ(), map);
        put("refresh", Boolean.valueOf(baseBody.isRefresh()), map);
        if (z) {
            put("aptoide_uid", baseBody.getAptoideId(), map);
        }
        put("country", baseBody.getCountry(), map);
        if (baseBody.getAccessToken() != null && !baseBody.getAccessToken().equals("")) {
            put("access_token", baseBody.getAccessToken(), map);
        }
        if (baseBody instanceof BaseBodyWithAlphaBetaKey) {
            BaseBodyWithAlphaBetaKey baseBodyWithAlphaBetaKey = (BaseBodyWithAlphaBetaKey) baseBody;
            if (baseBodyWithAlphaBetaKey.shouldIncludeTag()) {
                put("not_apk_tags", baseBodyWithAlphaBetaKey.getNotApkTags(), map);
            }
        }
        if (baseBody instanceof BaseBodyWithApp) {
            BaseBodyWithApp baseBodyWithApp = (BaseBodyWithApp) baseBody;
            put("store_user", baseBodyWithApp.getStoreUser(), map);
            put("store_pass_sha1", baseBodyWithApp.getStorePassSha1(), map);
        }
        return map;
    }

    public Map<String, String> map(ListAppsRequest.Body body, boolean z) {
        HashMap hashMap = new HashMap();
        map(body, false, hashMap);
        put("aab", Boolean.valueOf(z), hashMap);
        put("not_apk_tags", body.getNotApkTags(), hashMap);
        put("store_user", body.getStoreUser(), hashMap);
        put("store_pass_sha1", body.getStorePassSha1(), hashMap);
        put("limit", body.getLimit(), hashMap);
        put("offset", Integer.valueOf(body.getOffset()), hashMap);
        put(StoreTabGridRecyclerFragment.BundleCons.GROUP_ID, body.getGroupId(), hashMap);
        put("store_id", body.getStoreId(), hashMap);
        if (body.getSort() != null) {
            put("sort", body.getSort().name(), hashMap);
        }
        return hashMap;
    }

    public Map<String, String> map(ListSearchAppsRequest.Body body, boolean z) {
        HashMap hashMap = new HashMap();
        map(body, true, hashMap);
        put("aab", Boolean.valueOf(z), hashMap);
        put("limit", body.getLimit(), hashMap);
        put("offset", Integer.valueOf(body.getOffset()), hashMap);
        put("query", body.getQuery(), hashMap);
        put("trusted", body.getOnlyTrusted(), hashMap);
        put("appc_only", body.getOnlyAppc(), hashMap);
        if (body.getStoreIds() != null) {
            put("store_ids", body.getStoreIdsAsString(), hashMap);
        }
        if (body.getStoreNames() != null) {
            put("store_names", body.getStoreNamesAsString(), hashMap);
        }
        if (body.getOnlyBeta().booleanValue()) {
            put("apk_tags", "alpha,beta", hashMap);
        }
        if (body.getStoresAuthMap() != null && !body.getStoresAuthMap().isEmpty()) {
            put("stores_auth_map", body.getStoresAuthMapAsString(), hashMap);
        }
        return hashMap;
    }

    public Map<String, String> map(GetAppRequest.Body body, boolean z) {
        HashMap hashMap = new HashMap();
        map(body, false, hashMap);
        put("aab", Boolean.valueOf(z), hashMap);
        put(RateAndReviewsFragment.BundleCons.APP_ID, body.getAppId(), hashMap);
        put("nodes", getNodesAsString(body), hashMap);
        put("package_name", body.getPackageName(), hashMap);
        put("package_uname", body.getUname(), hashMap);
        put("apk_md5sum", body.getMd5(), hashMap);
        put("store_name", body.getStoreName(), hashMap);
        return hashMap;
    }

    public Map<String, String> map(GetRecommendedRequest.Body body) {
        HashMap hashMap = new HashMap();
        map(body, false, hashMap);
        put("package_name", body.getPackageName(), hashMap);
        put("limit", body.getLimit(), hashMap);
        put("offset", Integer.valueOf(body.getOffset()), hashMap);
        put("section", body.getSection(), hashMap);
        return hashMap;
    }
}
