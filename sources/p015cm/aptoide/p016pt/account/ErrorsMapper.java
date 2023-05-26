package p015cm.aptoide.p016pt.account;

import android.content.res.Resources;
import p015cm.aptoide.p016pt.C1086R;

/* renamed from: cm.aptoide.pt.account.ErrorsMapper */
public class ErrorsMapper {
    public int getWebServiceErrorMessageFromCode(String str, String str2, Resources resources) {
        int identifier = resources.getIdentifier(String.format("ws_error_%1s", new Object[]{str.replace("-", "_")}), "string", str2);
        return identifier == 0 ? C1086R.string.unknown_error : identifier;
    }
}
