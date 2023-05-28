package p015cm.aptoide.p016pt.editorialList;

import android.content.SharedPreferences;
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.exception.NoNetworkConnectionException;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.DataList;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.EditorialListData;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.EditorialListRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.EditorialListResponse;
import p015cm.aptoide.p016pt.editorialList.EditorialCardListModel;
import p123rx.Single;
import p123rx.p126m.C5377a;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.editorialList.EditorialCardListService */
public class EditorialCardListService {
    private final BodyInterceptor<BaseBody> bodyInterceptorPoolV7;
    private final Converter.Factory converterFactory;
    private final int limit;
    private boolean loading;
    private final OkHttpClient okHttpClient;
    private final SharedPreferences sharedPreferences;
    private final TokenInvalidator tokenInvalidator;

    public EditorialCardListService(BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient2, TokenInvalidator tokenInvalidator2, Converter.Factory factory, SharedPreferences sharedPreferences2, int i) {
        this.bodyInterceptorPoolV7 = bodyInterceptor;
        this.okHttpClient = okHttpClient2;
        this.tokenInvalidator = tokenInvalidator2;
        this.converterFactory = factory;
        this.sharedPreferences = sharedPreferences2;
        this.limit = i;
    }

    private List<CurationCard> buildCurationCardList(List<EditorialListData> list) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        for (EditorialListData next : list) {
            String id = next.getId();
            String caption = next.getCaption();
            String icon = next.getIcon();
            String title = next.getTitle();
            String views = next.getViews();
            String type = next.getType();
            String date = next.getDate();
            if (next.getAppearance() != null) {
                str = next.getAppearance().getCaption().getTheme();
            } else {
                str = "";
            }
            if (next.getFlair() != null) {
                str2 = next.getFlair();
            } else {
                str2 = "";
            }
            arrayList.add(new CurationCard(id, caption, icon, title, views, type, date, str, str2));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public EditorialCardListModel mapEditorialCardList(EditorialListResponse editorialListResponse) {
        DataList dataList = editorialListResponse.getDataList();
        return new EditorialCardListModel(buildCurationCardList(dataList.getList()), dataList.getNext(), dataList.getTotal());
    }

    /* access modifiers changed from: private */
    public EditorialCardListModel mapEditorialCardListError(Throwable th) {
        if ((th instanceof NoNetworkConnectionException) || (th instanceof ConnectException)) {
            return new EditorialCardListModel(EditorialCardListModel.Error.NETWORK);
        }
        return new EditorialCardListModel(EditorialCardListModel.Error.GENERIC);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11355a() {
        this.loading = true;
    }

    /* renamed from: b */
    public /* synthetic */ void mo11356b() {
        this.loading = false;
    }

    /* renamed from: c */
    public /* synthetic */ void mo11357c() {
        this.loading = false;
    }

    public Single<EditorialCardListModel> loadEditorialCardListModel(int i, boolean z) {
        if (this.loading) {
            return Single.m10119a(new EditorialCardListModel(true));
        }
        return EditorialListRequest.m5249of(this.bodyInterceptorPoolV7, this.okHttpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, this.limit, i).observe(z, false).mo18663b((C5377a) new C2625h(this)).mo18680d((C5377a) new C2617f(this)).mo18673c((C5377a) new C2613e(this)).mo18694j(new C2621g(this)).mo18700m().mo18571f(new C2609d(this));
    }
}
