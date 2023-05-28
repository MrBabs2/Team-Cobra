package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store;

import java.io.File;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.RequestBodyFactory */
public class RequestBodyFactory {
    public MultipartBody.Part createBodyPartFromFile(String str, File file) {
        return MultipartBody.Part.createFormData(str, file.getName(), RequestBody.create(MediaType.parse("multipart/form-data"), file));
    }

    public RequestBody createBodyPartFromLong(long j) {
        return RequestBody.create(MediaType.parse("multipart/form-data"), String.valueOf(j));
    }

    public RequestBody createBodyPartFromString(String str) {
        if (str == null) {
            str = "";
        }
        return RequestBody.create(MediaType.parse("multipart/form-data"), str);
    }
}
