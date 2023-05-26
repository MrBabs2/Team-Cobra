package p015cm.aptoide.p016pt.download;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.aab.Split;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Obb;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002Jb\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo16641d2 = {"Lcm/aptoide/pt/download/AppValidator;", "", "appValidationAnalytics", "Lcm/aptoide/pt/download/AppValidationAnalytics;", "(Lcm/aptoide/pt/download/AppValidationAnalytics;)V", "isStringEmptyOrNull", "", "text", "", "validateApp", "Lcm/aptoide/pt/download/AppValidator$AppValidationResult;", "md5", "appObb", "Lcm/aptoide/pt/dataprovider/model/v7/Obb;", "packageName", "appName", "filePath", "filePathAlt", "splits", "", "Lcm/aptoide/pt/aab/Split;", "requiredSplits", "", "AppValidationResult", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.AppValidator */
/* compiled from: AppValidator.kt */
public final class AppValidator {
    private final AppValidationAnalytics appValidationAnalytics;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, mo16641d2 = {"Lcm/aptoide/pt/download/AppValidator$AppValidationResult;", "", "message", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "INVALID_MD5", "NO_MAIN_DOWNLOAD_LINK", "NO_ALTERNATIVE_DOWNLOAD_LINK", "NO_MAIN_OBB_DOWNLOAD_LINK", "NO_PATCH_OBB_DOWNLOAD_LINK", "NO_PACKAGE_NAME_SPECIFIED", "NO_APP_NAME_SPECIFIED", "REQUIRED_SPLITS_NOT_FOUND", "VALID_APP", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.download.AppValidator$AppValidationResult */
    /* compiled from: AppValidator.kt */
    public enum AppValidationResult {
        INVALID_MD5("Invalid App md5"),
        NO_MAIN_DOWNLOAD_LINK("No main download link provided"),
        NO_ALTERNATIVE_DOWNLOAD_LINK("No alternative download link provided"),
        NO_MAIN_OBB_DOWNLOAD_LINK("No main obb download link provided"),
        NO_PATCH_OBB_DOWNLOAD_LINK("No patch obb download link provided"),
        NO_PACKAGE_NAME_SPECIFIED("This app has an OBB and doesn't have the package name specified"),
        NO_APP_NAME_SPECIFIED("This app has an OBB and doesn't have the App name specified"),
        REQUIRED_SPLITS_NOT_FOUND("Not all required App bundle Splits are being provided"),
        VALID_APP("This is a valid app");
        
        private final String message;

        private AppValidationResult(String str) {
            this.message = str;
        }

        public final String getMessage() {
            return this.message;
        }
    }

    public AppValidator(AppValidationAnalytics appValidationAnalytics2) {
        C10202j.m34178b(appValidationAnalytics2, "appValidationAnalytics");
        this.appValidationAnalytics = appValidationAnalytics2;
    }

    private final boolean isStringEmptyOrNull(String str) {
        if (str != null) {
            return str.length() == 0;
        }
    }

    public final AppValidationResult validateApp(String str, Obb obb, String str2, String str3, String str4, String str5, List<Split> list, List<String> list2) {
        boolean z;
        AppValidationResult appValidationResult = AppValidationResult.VALID_APP;
        if (isStringEmptyOrNull(str)) {
            appValidationResult = AppValidationResult.INVALID_MD5;
        }
        if (isStringEmptyOrNull(str4)) {
            this.appValidationAnalytics.sendInvalidDownloadMainPath(str2);
            appValidationResult = AppValidationResult.NO_MAIN_DOWNLOAD_LINK;
        } else if (isStringEmptyOrNull(str5)) {
            this.appValidationAnalytics.sendInvalidDownloadAlternativePath(str2);
            appValidationResult = AppValidationResult.NO_ALTERNATIVE_DOWNLOAD_LINK;
        } else {
            if (!(obb == null || obb.getMain() == null)) {
                Obb.ObbItem main = obb.getMain();
                C10202j.m34174a((Object) main, "appObb.main");
                if (isStringEmptyOrNull(main.getPath())) {
                    this.appValidationAnalytics.sendInvalidDownloadObbMainPath(str2);
                    appValidationResult = AppValidationResult.NO_MAIN_OBB_DOWNLOAD_LINK;
                }
            }
            if (!(obb == null || obb.getPatch() == null)) {
                Obb.ObbItem patch = obb.getPatch();
                C10202j.m34174a((Object) patch, "appObb.patch");
                if (isStringEmptyOrNull(patch.getPath())) {
                    this.appValidationAnalytics.sendInvalidDownloadObbPatchPath(str2);
                    appValidationResult = AppValidationResult.NO_PATCH_OBB_DOWNLOAD_LINK;
                }
            }
            if (obb != null && isStringEmptyOrNull(str2)) {
                appValidationResult = AppValidationResult.NO_PACKAGE_NAME_SPECIFIED;
            } else if (isStringEmptyOrNull(str3)) {
                appValidationResult = AppValidationResult.NO_APP_NAME_SPECIFIED;
            }
        }
        if (list2 == null || !(!list2.isEmpty())) {
            return appValidationResult;
        }
        for (String next : list2) {
            if (list != null) {
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C10202j.m34176a((Object) ((Split) it.next()).getType(), (Object) next)) {
                                z = false;
                                continue;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = true;
                continue;
                if (z) {
                    return AppValidationResult.REQUIRED_SPLITS_NOT_FOUND;
                }
            } else {
                C10202j.m34172a();
                throw null;
            }
        }
        return appValidationResult;
    }
}
