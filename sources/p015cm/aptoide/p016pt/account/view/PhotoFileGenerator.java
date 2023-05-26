package p015cm.aptoide.p016pt.account.view;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.account.view.PhotoFileGenerator */
public class PhotoFileGenerator {
    private static final SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
    private final Context context;
    private final String fileProviderAuthority;
    private final File storageDirectory;

    public PhotoFileGenerator(Context context2, File file, String str) {
        this.context = context2;
        this.storageDirectory = file;
        this.fileProviderAuthority = str;
    }

    /* renamed from: a */
    public /* synthetic */ String mo6429a() throws Exception {
        String format = String.format("aptoide_image_%s", new Object[]{DATE_FORMATTER.format(new Date())});
        if (Build.VERSION.SDK_INT >= 21) {
            return FileProvider.m1898a(this.context, this.fileProviderAuthority, File.createTempFile(format, ".jpg", this.storageDirectory)).toString();
        }
        return Uri.fromFile(new File(this.storageDirectory + File.separator + format + ".jpg")).toString();
    }

    public Single<String> generateNewImageFileUriAsString() {
        return Single.m10126b(new C1169d1(this));
    }
}
