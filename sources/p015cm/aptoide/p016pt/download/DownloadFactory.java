package p015cm.aptoide.p016pt.download;

import java.util.ArrayList;
import java.util.List;
import p015cm.aptoide.p016pt.aab.DynamicSplit;
import p015cm.aptoide.p016pt.aab.Split;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.database.room.RoomFileToDownload;
import p015cm.aptoide.p016pt.database.room.RoomSplit;
import p015cm.aptoide.p016pt.database.room.RoomUpdate;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Obb;
import p015cm.aptoide.p016pt.download.AppValidator;

/* renamed from: cm.aptoide.pt.download.DownloadFactory */
public class DownloadFactory {
    private final AppValidator appValidator;
    private final String cachePath;
    private final DownloadApkPathsProvider downloadApkPathsProvider;
    private final String marketName;
    private final SplitTypeSubFileTypeMapper splitTypeSubFileTypeMapper;

    public DownloadFactory(String str, DownloadApkPathsProvider downloadApkPathsProvider2, String str2, AppValidator appValidator2, SplitTypeSubFileTypeMapper splitTypeSubFileTypeMapper2) {
        this.marketName = str;
        this.cachePath = str2;
        this.downloadApkPathsProvider = downloadApkPathsProvider2;
        this.appValidator = appValidator2;
        this.splitTypeSubFileTypeMapper = splitTypeSubFileTypeMapper2;
    }

    private long calculateAppSize(long j, List<DynamicSplit> list) {
        long j2 = 0;
        for (DynamicSplit next : list) {
            if (next.getDeliveryTypes().contains("INSTALL_TIME")) {
                j2 += next.getFileSize();
                for (Split filesize : next.getConfigSplits()) {
                    j2 += filesize.getFilesize();
                }
            }
        }
        return j2 + j;
    }

    private List<RoomFileToDownload> createFileList(String str, String str2, String str3, String str4, Obb obb, String str5, int i, String str6, List<Split> list, List<DynamicSplit> list2) {
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        if (obb != null) {
            Obb.ObbItem main = obb.getMain();
            if (main != null) {
                str14 = main.getPath();
                str13 = main.getMd5sum();
                str15 = main.getFilename();
            } else {
                str15 = null;
                str14 = null;
                str13 = null;
            }
            Obb.ObbItem patch = obb.getPatch();
            if (patch != null) {
                String path = patch.getPath();
                String md5sum = patch.getMd5sum();
                str10 = path;
                str8 = str15;
                str12 = str14;
                str11 = str13;
                str7 = patch.getFilename();
                str9 = md5sum;
            } else {
                str10 = null;
                str9 = null;
                str7 = null;
                str8 = str15;
                str12 = str14;
                str11 = str13;
            }
        } else {
            str12 = null;
            str11 = null;
            str10 = null;
            str9 = null;
            str8 = null;
            str7 = null;
        }
        return createFileList(str, str2, str3, str5, str4, str12, str11, str10, str9, i, str6, str8, str7, list, list2);
    }

    private List<Split> map(List<RoomSplit> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (RoomSplit next : list) {
            arrayList.add(new Split(next.getName(), next.getType(), next.getPath(), next.getFileSize(), next.getMd5()));
        }
        return arrayList;
    }

    public RoomDownload create(RoomUpdate roomUpdate, boolean z, List<DynamicSplit> list) {
        AppValidator.AppValidationResult validateApp = this.appValidator.validateApp(roomUpdate.getMd5(), (Obb) null, roomUpdate.getPackageName(), roomUpdate.getLabel(), roomUpdate.getApkPath(), roomUpdate.getAlternativeApkPath(), map(roomUpdate.getRoomSplits()), roomUpdate.getRequiredSplits());
        if (validateApp == AppValidator.AppValidationResult.VALID_APP) {
            int i = 2;
            ApkPaths downloadPaths = this.downloadApkPathsProvider.getDownloadPaths(z ? 2 : 1, roomUpdate.getApkPath(), roomUpdate.getAlternativeApkPath());
            RoomDownload roomDownload = new RoomDownload();
            roomDownload.setMd5(roomUpdate.getMd5());
            roomDownload.setIcon(roomUpdate.getIcon());
            roomDownload.setAppName(roomUpdate.getLabel());
            if (!z) {
                i = 1;
            }
            roomDownload.setAction(i);
            roomDownload.setPackageName(roomUpdate.getPackageName());
            roomDownload.setVersionCode(roomUpdate.getUpdateVersionCode());
            roomDownload.setVersionName(roomUpdate.getUpdateVersionName());
            roomDownload.setHasAppc(roomUpdate.hasAppc());
            roomDownload.setTrustedBadge(roomUpdate.getTrustedBadge());
            roomDownload.setStoreName(roomUpdate.getStoreName());
            RoomDownload roomDownload2 = roomDownload;
            roomDownload2.setFilesToDownload(createFileList(roomUpdate.getMd5(), roomUpdate.getPackageName(), downloadPaths.getPath(), downloadPaths.getAltPath(), roomUpdate.getMd5(), roomUpdate.getMainObbPath(), roomUpdate.getMainObbMd5(), roomUpdate.getPatchObbPath(), roomUpdate.getPatchObbMd5(), roomUpdate.getUpdateVersionCode(), roomUpdate.getUpdateVersionName(), roomUpdate.getMainObbName(), roomUpdate.getPatchObbName(), map(roomUpdate.getRoomSplits()), list));
            roomDownload2.setSize(calculateAppSize(roomUpdate.getSize(), list));
            return roomDownload2;
        }
        throw new InvalidAppException(validateApp.getMessage());
    }

    private List<RoomFileToDownload> createFileList(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, String str10, String str11, String str12, List<Split> list, List<DynamicSplit> list2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RoomFileToDownload.createFileToDownload(str3, str4, str, str5, 0, str2, i, str10, this.cachePath, 15));
        if (str6 != null) {
            arrayList.add(RoomFileToDownload.createFileToDownload(str6, (String) null, str7, str11, 1, str2, i, str10, this.cachePath, 13));
        }
        if (str8 != null) {
            arrayList.add(RoomFileToDownload.createFileToDownload(str8, (String) null, str9, str12, 1, str2, i, str10, this.cachePath, 14));
        }
        if (list != null) {
            for (Split next : list) {
                String path = next.getPath();
                String md5sum = next.getMd5sum();
                arrayList.add(RoomFileToDownload.createFileToDownload(path, (String) null, md5sum, next.getMd5sum() + "." + next.getName(), 3, str2, i, str10, this.cachePath, 10));
            }
        }
        if (list2 != null) {
            for (DynamicSplit next2 : list2) {
                if (next2.getDeliveryTypes().contains("INSTALL_TIME")) {
                    int mapSplitToSubFileType = this.splitTypeSubFileTypeMapper.mapSplitToSubFileType(next2.getType());
                    String path2 = next2.getPath();
                    String md5Sum = next2.getMd5Sum();
                    arrayList.add(RoomFileToDownload.createFileToDownload(path2, (String) null, md5Sum, next2.getMd5Sum() + "." + next2.getName(), 3, str2, i, str10, this.cachePath, mapSplitToSubFileType));
                    for (Split next3 : next2.getConfigSplits()) {
                        String path3 = next3.getPath();
                        String md5sum2 = next3.getMd5sum();
                        arrayList.add(RoomFileToDownload.createFileToDownload(path3, (String) null, md5sum2, next3.getMd5sum() + "." + next3.getName(), 3, str2, i, str10, this.cachePath, mapSplitToSubFileType));
                    }
                }
            }
        }
        return arrayList;
    }

    public RoomDownload create(String str, int i, String str2, String str3, boolean z) {
        String str4 = str3;
        ApkPaths downloadPaths = this.downloadApkPathsProvider.getDownloadPaths(1, str4, str4);
        RoomDownload roomDownload = new RoomDownload();
        roomDownload.setAppName(this.marketName);
        roomDownload.setMd5(str);
        roomDownload.setVersionCode(i);
        String str5 = str2;
        roomDownload.setPackageName(str5);
        roomDownload.setVersionName("Auto-Update");
        roomDownload.setIcon("");
        roomDownload.setAction(1);
        roomDownload.setHasAppc(z);
        roomDownload.setSize(0);
        String path = downloadPaths.getPath();
        String altPath = downloadPaths.getAltPath();
        roomDownload.setFilesToDownload(createFileList(str, str5, path, str, (Obb) null, altPath, i, "Auto-Update", (List<Split>) null, (List<DynamicSplit>) null));
        return roomDownload;
    }

    public RoomDownload create(int i, String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7, Obb obb, boolean z, long j, List<Split> list, List<String> list2, String str8, String str9, List<DynamicSplit> list3) {
        return create(i, str, str2, str3, str4, str5, i2, str6, str7, obb, z, j, list, list2, str8, str9, (String) null, list3);
    }

    public RoomDownload create(int i, String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7, Obb obb, boolean z, long j, List<Split> list, List<String> list2, String str8, String str9, String str10, List<DynamicSplit> list3) {
        int i3 = i;
        String str11 = str10;
        AppValidator.AppValidationResult validateApp = this.appValidator.validateApp(str3, obb, str2, str, str6, str7, list, list2);
        if (validateApp == AppValidator.AppValidationResult.VALID_APP) {
            ApkPaths downloadPaths = this.downloadApkPathsProvider.getDownloadPaths(i, str6, str7, str11);
            List<DynamicSplit> list4 = list3;
            long calculateAppSize = calculateAppSize(j, list4);
            RoomDownload roomDownload = new RoomDownload();
            roomDownload.setMd5(str3);
            roomDownload.setIcon(str4);
            String str12 = str;
            roomDownload.setAppName(str);
            roomDownload.setAction(i);
            roomDownload.setPackageName(str2);
            roomDownload.setHasAppc(z);
            int i4 = i2;
            roomDownload.setVersionCode(i4);
            String str13 = str5;
            roomDownload.setVersionName(str13);
            roomDownload.setSize(calculateAppSize);
            roomDownload.setTrustedBadge(str8);
            roomDownload.setStoreName(str9);
            roomDownload.setAttributionId(str11);
            roomDownload.setFilesToDownload(createFileList(str3, str2, downloadPaths.getPath(), str3, obb, downloadPaths.getAltPath(), i4, str13, list, list4));
            return roomDownload;
        }
        throw new InvalidAppException(validateApp.getMessage());
    }
}
