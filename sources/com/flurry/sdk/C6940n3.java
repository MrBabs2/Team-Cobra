package com.flurry.sdk;

import com.flurry.sdk.C6826g0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.n3 */
public final class C6940n3 {

    /* renamed from: a */
    private static final List<C7023s6> f13026a;

    static {
        ArrayList arrayList = new ArrayList();
        f13026a = arrayList;
        arrayList.add(C7023s6.SESSION_ID);
        f13026a.add(C7023s6.SESSION_INFO);
        f13026a.add(C7023s6.REPORTED_ID);
    }

    /* renamed from: a */
    public static C6826g0.C6828b m14738a(File file) {
        try {
            return m14739a(m14740b(file));
        } catch (IOException e) {
            C6792d1.m14483b("FileWriterUtils", "Invalid frame data file: " + file + " => " + e.toString());
            C6826g0.C6828b bVar = C6826g0.C6828b.IOEXCEPTION;
            bVar.f12772f = e.toString();
            return bVar;
        }
    }

    /* renamed from: b */
    private static byte[] m14740b(File file) throws IOException {
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        byte[] bArr2 = new byte[length];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int read = fileInputStream.read(bArr, 0, length);
            if (read < length) {
                int i = length - read;
                while (i > 0) {
                    int read2 = fileInputStream.read(bArr2, 0, i);
                    System.arraycopy(bArr2, 0, bArr, length - i, read2);
                    i -= read2;
                }
            }
            return bArr;
        } finally {
            fileInputStream.close();
        }
    }

    /* renamed from: a */
    private static C6826g0.C6828b m14739a(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        TreeSet treeSet = new TreeSet();
        C6826g0.C6828b bVar = C6826g0.C6828b.SUCCEED;
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                if (bArr.length > i) {
                    if (bArr.length - i <= 0) {
                        bVar = C6826g0.C6828b.EOF;
                        bVar.f12772f = "EOF frame version";
                        break;
                    }
                    int i3 = i + 1;
                    byte[] bArr2 = new byte[3];
                    if (bArr.length - i3 < 3) {
                        bVar = C6826g0.C6828b.EOF;
                        bVar.f12772f = "EOF frame type";
                        break;
                    }
                    bArr2[0] = bArr[i3];
                    bArr2[1] = bArr[i3 + 1];
                    bArr2[2] = bArr[i3 + 2];
                    int i4 = i3 + 3;
                    byte[] bArr3 = new byte[4];
                    System.arraycopy(bArr2, 0, bArr3, 1, 3);
                    int i5 = ByteBuffer.wrap(bArr3).getInt();
                    arrayList.add(C7023s6.m14900a(i5));
                    for (C7023s6 next : f13026a) {
                        if (i5 == next.f13210f) {
                            treeSet.add(next);
                        }
                    }
                    if (bArr.length - i4 < 8) {
                        bVar = C6826g0.C6828b.EOF;
                        bVar.f12772f = "EOF frame timestamp";
                        break;
                    }
                    int i6 = i4 + 8;
                    if (bArr.length - i6 < 8) {
                        bVar = C6826g0.C6828b.EOF;
                        bVar.f12772f = "EOF frame relative timestamp";
                        break;
                    }
                    int i7 = i6 + 8;
                    byte[] bArr4 = new byte[4];
                    if (bArr.length - i7 < 4) {
                        bVar = C6826g0.C6828b.EOF;
                        bVar.f12772f = "EOF frame payload length";
                        break;
                    }
                    System.arraycopy(bArr, i7, bArr4, 0, 4);
                    int i8 = i7 + 4;
                    int i9 = ByteBuffer.wrap(bArr4).getInt();
                    byte[] bArr5 = new byte[i9];
                    if (bArr.length - i8 < i9) {
                        bVar = C6826g0.C6828b.EOF;
                        bVar.f12772f = "EOF frame payload";
                        break;
                    }
                    System.arraycopy(bArr, i8, bArr5, 0, i9);
                    int i10 = i8 + i9;
                    try {
                        new JSONObject(new String(bArr5));
                        if (bArr.length - i10 < 4) {
                            bVar = C6826g0.C6828b.EOF;
                            bVar.f12772f = "EOF frame checksum";
                            break;
                        }
                        i = i10 + 4;
                        i2++;
                    } catch (JSONException e) {
                        C6792d1.m14483b("FileWriterUtils", "Invalid Frame Payload: " + C7023s6.m14900a(i5));
                        C6826g0.C6828b bVar2 = C6826g0.C6828b.PAYLOAD_ERROR;
                        bVar2.f12772f = e.toString();
                        bVar = bVar2;
                    }
                } else {
                    break;
                }
            } catch (Exception | VirtualMachineError e2) {
                C6792d1.m14483b("FileWriterUtils", "Invalid Payload: " + e2.toString());
                C6826g0.C6828b bVar3 = C6826g0.C6828b.PAYLOAD_ERROR;
                bVar3.f12772f = e2.toString();
                bVar = bVar3;
            }
        }
        if (bVar == C6826g0.C6828b.SUCCEED && treeSet.size() < f13026a.size()) {
            bVar = C6826g0.C6828b.FRAME_MISSING;
        }
        bVar.f12773g = bArr.length;
        bVar.f12774h = i2;
        bVar.f12775i = arrayList;
        bVar.f12776j = treeSet;
        return bVar;
    }
}
