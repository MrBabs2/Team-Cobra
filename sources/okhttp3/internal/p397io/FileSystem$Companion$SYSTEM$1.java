package okhttp3.internal.p397io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p413s.C12892a0;
import p413s.C12919p;
import p413s.C12932y;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0014"}, mo16641d2 = {"okhttp3/internal/io/FileSystem$Companion$SYSTEM$1", "Lokhttp3/internal/io/FileSystem;", "appendingSink", "Lokio/Sink;", "file", "Ljava/io/File;", "delete", "", "deleteContents", "directory", "exists", "", "rename", "from", "to", "sink", "size", "", "source", "Lokio/Source;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: okhttp3.internal.io.FileSystem$Companion$SYSTEM$1 */
/* compiled from: FileSystem.kt */
public final class FileSystem$Companion$SYSTEM$1 implements FileSystem {
    FileSystem$Companion$SYSTEM$1() {
    }

    public C12932y appendingSink(File file) throws FileNotFoundException {
        C10202j.m34178b(file, "file");
        try {
            return C12919p.m41677a(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return C12919p.m41677a(file);
        }
    }

    public void delete(File file) throws IOException {
        C10202j.m34178b(file, "file");
        if (!file.delete() && file.exists()) {
            throw new IOException("failed to delete " + file);
        }
    }

    public void deleteContents(File file) throws IOException {
        C10202j.m34178b(file, "directory");
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                C10202j.m34174a((Object) file2, "file");
                if (file2.isDirectory()) {
                    deleteContents(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    throw new IOException("failed to delete " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }

    public boolean exists(File file) {
        C10202j.m34178b(file, "file");
        return file.exists();
    }

    public void rename(File file, File file2) throws IOException {
        C10202j.m34178b(file, "from");
        C10202j.m34178b(file2, "to");
        delete(file2);
        if (!file.renameTo(file2)) {
            throw new IOException("failed to rename " + file + " to " + file2);
        }
    }

    public C12932y sink(File file) throws FileNotFoundException {
        C10202j.m34178b(file, "file");
        try {
            return C12919p.m41679a(file, false, 1, (Object) null);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return C12919p.m41679a(file, false, 1, (Object) null);
        }
    }

    public long size(File file) {
        C10202j.m34178b(file, "file");
        return file.length();
    }

    public C12892a0 source(File file) throws FileNotFoundException {
        C10202j.m34178b(file, "file");
        return C12919p.m41683b(file);
    }
}
