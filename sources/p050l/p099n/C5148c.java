package p050l.p099n;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Stream;

/* renamed from: l.n.c */
/* compiled from: ZipUtil */
final class C5148c {

    /* renamed from: l.n.c$a */
    /* compiled from: ZipUtil */
    static class C5149a {

        /* renamed from: a */
        long f9096a;

        /* renamed from: b */
        long f9097b;

        C5149a() {
        }
    }

    /* renamed from: a */
    static long m9518a(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return m9519a(randomAccessFile, m9520a(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }

    /* renamed from: a */
    static C5149a m9520a(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long length = randomAccessFile.length() - 22;
        long j = 0;
        if (length >= 0) {
            long j2 = length - 65536;
            if (j2 >= 0) {
                j = j2;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    C5149a aVar = new C5149a();
                    aVar.f9097b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    aVar.f9096a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    return aVar;
                }
                length--;
            } while (length >= j);
            throw new ZipException("End Of Central Directory signature not found");
        }
        throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
    }

    /* renamed from: a */
    static long m9519a(RandomAccessFile randomAccessFile, C5149a aVar) throws IOException {
        CRC32 crc32 = new CRC32();
        long j = aVar.f9097b;
        randomAccessFile.seek(aVar.f9096a);
        int min = (int) Math.min(Http2Stream.EMIT_BUFFER_SIZE, j);
        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        int read = randomAccessFile.read(bArr, 0, min);
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j -= (long) read;
            if (j == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(Http2Stream.EMIT_BUFFER_SIZE, j));
        }
        return crc32.getValue();
    }
}
