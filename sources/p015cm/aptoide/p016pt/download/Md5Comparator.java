package p015cm.aptoide.p016pt.download;

import android.text.TextUtils;
import java.io.File;
import p015cm.aptoide.p016pt.utils.AptoideUtils;

/* renamed from: cm.aptoide.pt.download.Md5Comparator */
public class Md5Comparator {
    private String generalFolderPath;

    public Md5Comparator(String str) {
        this.generalFolderPath = str;
    }

    public boolean compareMd5(String str, String str2) {
        return TextUtils.equals(AptoideUtils.AlgorithmU.computeMd5(new File(this.generalFolderPath + str2)), str);
    }
}
