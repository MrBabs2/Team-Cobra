package p120q.p121b.p354i;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: q.b.i.c */
/* compiled from: FileResourceLoader */
public class C11514c implements C11516e {

    /* renamed from: a */
    private static final C12938b f30759a = C12939c.m41777a((Class<?>) C11514c.class);

    /* renamed from: a */
    public InputStream mo37632a(String str) {
        File file = new File(str);
        if (!file.isFile() || !file.canRead()) {
            f30759a.mo41307a("The configuration file {} (which resolves to absolute path {}) doesn't exist, is not a file or is not readable.", file, file.getAbsolutePath());
            return null;
        }
        try {
            return new FileInputStream(file);
        } catch (FileNotFoundException unused) {
            f30759a.mo41316c("Configuration file {} could not be found even though we just checked it can be read...", (Object) str);
            return null;
        }
    }
}
