package p015cm.aptoide.p016pt.editorial;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.aab.SplitsMapper;
import p015cm.aptoide.p016pt.dataprovider.exception.NoNetworkConnectionException;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.EditorialCard;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.App;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.File;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.editorial.EditorialViewModel;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p126m.C5377a;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.editorial.EditorialService */
public class EditorialService {
    private final BodyInterceptor<BaseBody> bodyInterceptorPoolV7;
    private final Converter.Factory converterFactory;
    private boolean loading;
    private final OkHttpClient okHttpClient;
    private final SharedPreferences sharedPreferences;
    private final SplitsMapper splitsMapper;
    private final TokenInvalidator tokenInvalidator;

    public EditorialService(BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient2, TokenInvalidator tokenInvalidator2, Converter.Factory factory, SharedPreferences sharedPreferences2, SplitsMapper splitsMapper2) {
        this.bodyInterceptorPoolV7 = bodyInterceptor;
        this.okHttpClient = okHttpClient2;
        this.tokenInvalidator = tokenInvalidator2;
        this.converterFactory = factory;
        this.sharedPreferences = sharedPreferences2;
        this.splitsMapper = splitsMapper2;
    }

    private EditorialContent buildEditorialContent(EditorialCard.Content content, List<EditorialMedia> list, App app, EditorialCard.Action action, int i) {
        if (action != null && app != null) {
            Store store = app.getStore();
            File file = app.getFile();
            return new EditorialContent(content.getTitle(), list, content.getMessage(), content.getType(), app.getId(), app.getName(), app.getIcon(), app.getStats().getRating().getAvg(), app.getPackageName(), app.getSize(), app.getGraphic(), app.getObb(), store.getId(), store.getName(), file.getVername(), file.getVercode(), file.getPath(), file.getPathAlt(), file.getMd5sum(), action.getTitle(), action.getUrl(), i, this.splitsMapper.mapSplits(app.hasSplits() ? app.getAab().getSplits() : Collections.emptyList()), app.hasSplits() ? app.getAab().getRequiredSplits() : Collections.emptyList(), app.getAppcoins().hasAdvertising() || app.getAppcoins().hasBilling(), app.getFile().getMalware().getRank().toString());
        } else if (app != null) {
            Store store2 = app.getStore();
            File file2 = app.getFile();
            return new EditorialContent(content.getTitle(), list, content.getMessage(), content.getType(), app.getId(), app.getName(), app.getIcon(), app.getStats().getRating().getAvg(), app.getPackageName(), app.getSize(), app.getGraphic(), app.getObb(), store2.getId(), store2.getName(), file2.getVername(), file2.getVercode(), file2.getPath(), file2.getPathAlt(), file2.getMd5sum(), i, this.splitsMapper.mapSplits(app.hasSplits() ? app.getAab().getSplits() : Collections.emptyList()), app.hasSplits() ? app.getAab().getRequiredSplits() : Collections.emptyList(), app.getAppcoins().hasAdvertising() || app.getAppcoins().hasBilling(), app.getFile().getMalware().getRank().toString());
        } else if (action != null) {
            return new EditorialContent(content.getTitle(), list, content.getMessage(), content.getType(), action.getTitle(), action.getUrl(), i);
        } else {
            return new EditorialContent(content.getTitle(), list, content.getMessage(), content.getType(), i);
        }
    }

    private EditorialViewModel buildEditorialViewModel(List<EditorialContent> list, EditorialCard.Data data, List<Integer> list2, List<EditorialContent> list3, EditorialContent editorialContent, String str, String str2) {
        String theme = data.getAppearance() != null ? data.getAppearance().getCaption().getTheme() : "";
        if (editorialContent != null) {
            return new EditorialViewModel(list, data.getTitle(), data.getCaption(), data.getBackground(), list2, list3, editorialContent.getAppName(), editorialContent.getIcon(), editorialContent.getId(), editorialContent.getPackageName(), editorialContent.getMd5sum(), editorialContent.getVerCode(), editorialContent.getVerName(), editorialContent.getPath(), editorialContent.getPathAlt(), editorialContent.getObb(), true, str, str2, editorialContent.getSize(), theme, editorialContent.getSplits(), editorialContent.getRequiredSplits(), editorialContent.hasAppc(), editorialContent.getRank(), editorialContent.getStoreName());
        }
        return new EditorialViewModel(list, data.getTitle(), data.getCaption(), data.getBackground(), list2, list3, false, str, str2, theme);
    }

    private List<EditorialMedia> buildMediaList(List<EditorialCard.Media> list) {
        EditorialMedia editorialMedia;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (EditorialCard.Media next : list) {
                if (next.getUrl() != null) {
                    editorialMedia = new EditorialMedia(next.getType(), next.getDescription(), next.getThumbnail(), next.getUrl());
                } else {
                    editorialMedia = new EditorialMedia(next.getType(), next.getDescription(), next.getThumbnail(), next.getImage());
                }
                arrayList.add(editorialMedia);
            }
        }
        return arrayList;
    }

    private List<EditorialContent> buildPlaceHolderContent(List<EditorialContent> list, List<Integer> list2) {
        ArrayList arrayList = new ArrayList();
        for (Integer intValue : list2) {
            arrayList.add(list.get(intValue.intValue()));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: createErrorEditorialModel */
    public EditorialViewModel mo11265b(Throwable th) {
        if (th instanceof NoNetworkConnectionException) {
            return new EditorialViewModel(EditorialViewModel.Error.NETWORK);
        }
        return new EditorialViewModel(EditorialViewModel.Error.GENERIC);
    }

    private List<Integer> getPlaceHolderPositions(List<EditorialContent> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).isPlaceHolderType()) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: mapEditorial */
    public C5368e<EditorialViewModel> mo11263a(EditorialCard editorialCard, String str) {
        if (!editorialCard.isOk()) {
            return C5368e.m10238a((Throwable) new IllegalStateException("Could not obtain request from server."));
        }
        EditorialCard.Data data = editorialCard.getData();
        List<EditorialContent> mapEditorialContent = mapEditorialContent(data.getContent());
        List<Integer> placeHolderPositions = getPlaceHolderPositions(mapEditorialContent);
        List<EditorialContent> buildPlaceHolderContent = buildPlaceHolderContent(mapEditorialContent, placeHolderPositions);
        EditorialContent editorialContent = null;
        if (!buildPlaceHolderContent.isEmpty() && buildPlaceHolderContent.size() == 1) {
            editorialContent = buildPlaceHolderContent.get(0);
        }
        return C5368e.m10257c(buildEditorialViewModel(mapEditorialContent, data, placeHolderPositions, buildPlaceHolderContent, editorialContent, str, data.getType()));
    }

    private List<EditorialContent> mapEditorialContent(List<EditorialCard.Content> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                EditorialCard.Content content = list.get(i);
                arrayList.add(buildEditorialContent(content, buildMediaList(content.getMedia()), content.getApp(), content.getAction(), i));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public /* synthetic */ void mo11264a() {
        this.loading = true;
    }

    /* renamed from: b */
    public /* synthetic */ void mo11266b() {
        this.loading = false;
    }

    /* renamed from: c */
    public /* synthetic */ void mo11267c() {
        this.loading = false;
    }

    /* renamed from: d */
    public /* synthetic */ void mo11268d() {
        this.loading = true;
    }

    /* renamed from: e */
    public /* synthetic */ void mo11269e() {
        this.loading = false;
    }

    /* renamed from: f */
    public /* synthetic */ void mo11270f() {
        this.loading = false;
    }

    public Single<EditorialViewModel> loadEditorialViewModel(String str) {
        if (this.loading) {
            return Single.m10119a(new EditorialViewModel(true));
        }
        return EditorialRequest.ofWithCardId(str, this.bodyInterceptorPoolV7, this.okHttpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe().mo18663b((C5377a) new C2526q6(this)).mo18680d((C5377a) new C2470j6(this)).mo18673c((C5377a) new C2510o6(this)).mo18687f(new C2462i6(this, str)).mo18700m().mo18571f(new C2494m6(this));
    }

    public Single<EditorialViewModel> loadEditorialViewModelWithSlug(String str) {
        if (this.loading) {
            return Single.m10119a(new EditorialViewModel(true));
        }
        return EditorialRequest.ofWithSlug(str, this.bodyInterceptorPoolV7, this.okHttpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe().mo18663b((C5377a) new C2486l6(this)).mo18680d((C5377a) new C2502n6(this)).mo18673c((C5377a) new C2518p6(this)).mo18687f(new C2454h6(this)).mo18700m().mo18571f(new C2478k6(this));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo11262a(EditorialCard editorialCard) {
        return mo11263a(editorialCard, editorialCard.getData().getId());
    }
}
