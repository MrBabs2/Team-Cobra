package p015cm.aptoide.p016pt.account.view.store;

import android.content.res.Resources;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.account.ErrorsMapper;

/* renamed from: cm.aptoide.pt.account.view.store.ManageStoreErrorMapper */
public class ManageStoreErrorMapper {
    private final ErrorsMapper errorsMapper;
    private final Resources resources;

    /* renamed from: cm.aptoide.pt.account.view.store.ManageStoreErrorMapper$1 */
    static /* synthetic */ class C12091 {

        /* renamed from: $SwitchMap$cm$aptoide$pt$account$view$store$ManageStoreErrorMapper$SocialErrorType */
        static final /* synthetic */ int[] f3626x4bddeb47;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                cm.aptoide.pt.account.view.store.ManageStoreErrorMapper$SocialErrorType[] r0 = p015cm.aptoide.p016pt.account.view.store.ManageStoreErrorMapper.SocialErrorType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3626x4bddeb47 = r0
                cm.aptoide.pt.account.view.store.ManageStoreErrorMapper$SocialErrorType r1 = p015cm.aptoide.p016pt.account.view.store.ManageStoreErrorMapper.SocialErrorType.INVALID_URL_TEXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3626x4bddeb47     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.account.view.store.ManageStoreErrorMapper$SocialErrorType r1 = p015cm.aptoide.p016pt.account.view.store.ManageStoreErrorMapper.SocialErrorType.LINK_CHANNEL_ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3626x4bddeb47     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.account.view.store.ManageStoreErrorMapper$SocialErrorType r1 = p015cm.aptoide.p016pt.account.view.store.ManageStoreErrorMapper.SocialErrorType.PAGE_DOES_NOT_EXIST     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3626x4bddeb47     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.account.view.store.ManageStoreErrorMapper$SocialErrorType r1 = p015cm.aptoide.p016pt.account.view.store.ManageStoreErrorMapper.SocialErrorType.GENERIC_ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.account.view.store.ManageStoreErrorMapper.C12091.<clinit>():void");
        }
    }

    /* renamed from: cm.aptoide.pt.account.view.store.ManageStoreErrorMapper$SocialErrorType */
    enum SocialErrorType {
        INVALID_URL_TEXT,
        LINK_CHANNEL_ERROR,
        PAGE_DOES_NOT_EXIST,
        GENERIC_ERROR
    }

    public ManageStoreErrorMapper(Resources resources2, ErrorsMapper errorsMapper2) {
        this.resources = resources2;
        this.errorsMapper = errorsMapper2;
    }

    private int getErrorMessage(SocialErrorType socialErrorType) {
        int i = C12091.f3626x4bddeb47[socialErrorType.ordinal()];
        if (i == 1) {
            return C1086R.string.edit_store_social_link_invalid_url_text;
        }
        if (i != 2) {
            return i != 3 ? C1086R.string.all_message_general_error : C1086R.string.edit_store_page_doesnt_exist_error_short;
        }
        return C1086R.string.edit_store_social_link_channel_error;
    }

    public String getError(SocialErrorType socialErrorType) {
        return this.resources.getString(getErrorMessage(socialErrorType));
    }

    public String getGenericError() {
        return this.resources.getString(C1086R.string.all_message_general_error);
    }

    public String getImageError() {
        return this.resources.getString(C1086R.string.ws_error_IMAGE_ERROR_1);
    }

    public String getInvalidStoreError() {
        return this.resources.getString(C1086R.string.ws_error_WOP_2);
    }

    public String getNetworkError(String str, String str2) {
        Resources resources2 = this.resources;
        return resources2.getString(this.errorsMapper.getWebServiceErrorMessageFromCode(str, str2, resources2));
    }
}
