package p015cm.aptoide.p016pt.account.view;

import android.content.Context;
import android.content.res.Resources;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.account.view.exception.InvalidImageException;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.utils.GenericDialogs;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.account.view.ImagePickerErrorHandler */
public class ImagePickerErrorHandler {
    private final Context context;
    private final Resources resources;
    private final ThemeManager themeManager;

    /* renamed from: cm.aptoide.pt.account.view.ImagePickerErrorHandler$1 */
    static /* synthetic */ class C11541 {

        /* renamed from: $SwitchMap$cm$aptoide$pt$account$view$exception$InvalidImageException$ImageError */
        static final /* synthetic */ int[] f3580xc452ba21;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                cm.aptoide.pt.account.view.exception.InvalidImageException$ImageError[] r0 = p015cm.aptoide.p016pt.account.view.exception.InvalidImageException.ImageError.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3580xc452ba21 = r0
                cm.aptoide.pt.account.view.exception.InvalidImageException$ImageError r1 = p015cm.aptoide.p016pt.account.view.exception.InvalidImageException.ImageError.MIN_HEIGHT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3580xc452ba21     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.account.view.exception.InvalidImageException$ImageError r1 = p015cm.aptoide.p016pt.account.view.exception.InvalidImageException.ImageError.MAX_HEIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3580xc452ba21     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.account.view.exception.InvalidImageException$ImageError r1 = p015cm.aptoide.p016pt.account.view.exception.InvalidImageException.ImageError.MIN_WIDTH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3580xc452ba21     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.account.view.exception.InvalidImageException$ImageError r1 = p015cm.aptoide.p016pt.account.view.exception.InvalidImageException.ImageError.MAX_WIDTH     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f3580xc452ba21     // Catch:{ NoSuchFieldError -> 0x003e }
                cm.aptoide.pt.account.view.exception.InvalidImageException$ImageError r1 = p015cm.aptoide.p016pt.account.view.exception.InvalidImageException.ImageError.MAX_IMAGE_SIZE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f3580xc452ba21     // Catch:{ NoSuchFieldError -> 0x0049 }
                cm.aptoide.pt.account.view.exception.InvalidImageException$ImageError r1 = p015cm.aptoide.p016pt.account.view.exception.InvalidImageException.ImageError.ERROR_DECODING     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.account.view.ImagePickerErrorHandler.C11541.<clinit>():void");
        }
    }

    public ImagePickerErrorHandler(Context context2, ThemeManager themeManager2) {
        this.context = context2;
        this.resources = context2.getResources();
        this.themeManager = themeManager2;
    }

    private String buildErrorMessage(InvalidImageException invalidImageException) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.resources.getString(C1086R.string.image_requirements_popup_message));
        for (InvalidImageException.ImageError ordinal : invalidImageException.getImageErrors()) {
            switch (C11541.f3580xc452ba21[ordinal.ordinal()]) {
                case 1:
                    sb.append(this.resources.getString(C1086R.string.image_requirements_error_min_height));
                    break;
                case 2:
                    sb.append(this.resources.getString(C1086R.string.image_requirements_error_max_height));
                    break;
                case 3:
                    sb.append(this.resources.getString(C1086R.string.image_requirements_error_min_width));
                    break;
                case 4:
                    sb.append(this.resources.getString(C1086R.string.image_requirements_error_max_width));
                    break;
                case 5:
                    sb.append(this.resources.getString(C1086R.string.image_requirements_error_max_file_size));
                    break;
                case 6:
                    sb.append(this.resources.getString(C1086R.string.image_requirements_error_open_image));
                    break;
            }
        }
        int lastIndexOf = sb.lastIndexOf("\n");
        if (lastIndexOf > 0) {
            sb.delete(lastIndexOf, sb.length());
        }
        return sb.toString();
    }

    public C5368e<GenericDialogs.EResponse> showIconPropertiesError(InvalidImageException invalidImageException) {
        return GenericDialogs.createGenericOkMessage(this.context, this.resources.getString(C1086R.string.image_requirements_error_popup_title), buildErrorMessage(invalidImageException), this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId);
    }
}
