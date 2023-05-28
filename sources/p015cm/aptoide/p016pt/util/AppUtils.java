package p015cm.aptoide.p016pt.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Obb;
import p015cm.aptoide.p016pt.permissions.ApkPermission;
import p015cm.aptoide.p016pt.permissions.ApkPermissionGroup;

/* renamed from: cm.aptoide.pt.util.AppUtils */
public final class AppUtils {
    public static void fillPermissionsForTableLayout(Context context, TableLayout tableLayout, List<ApkPermissionGroup> list) {
        TableRow tableRow = new TableRow(context);
        tableRow.setLayoutParams(new TableRow.LayoutParams(-1, -2));
        int i = 0;
        for (int i2 = 0; i2 <= list.size(); i2++) {
            if (i2 < list.size()) {
                i++;
                ApkPermissionGroup apkPermissionGroup = list.get(i2);
                if (apkPermissionGroup != null) {
                    LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(C1086R.layout.row_permission, tableRow, false);
                    ((TextView) linearLayout.findViewById(C1086R.C1088id.permission_name)).setText(apkPermissionGroup.getName());
                    for (String text : apkPermissionGroup.getDescriptions()) {
                        TextView textView = (TextView) LayoutInflater.from(context).inflate(C1086R.layout.row_description, linearLayout, false);
                        textView.setText(text);
                        linearLayout.addView(textView);
                    }
                    tableRow.addView(linearLayout, new TableRow.LayoutParams(0, -2, 1.0f));
                    if (i % 2 == 0) {
                        tableLayout.addView(tableRow, new TableLayout.LayoutParams(-1, -2));
                        tableRow = new TableRow(context);
                        tableRow.setLayoutParams(new TableRow.LayoutParams(-1, -2));
                    }
                }
            } else if (tableRow.getChildCount() > 0) {
                tableRow.setPadding(0, 0, 0, 20);
                tableLayout.addView(tableRow, new TableLayout.LayoutParams(-1, -2));
            }
        }
    }

    public static ArrayList<ApkPermissionGroup> fillPermissionsGroups(List<ApkPermission> list) {
        ArrayList<ApkPermissionGroup> arrayList = new ArrayList<>();
        String str = null;
        ApkPermissionGroup apkPermissionGroup = null;
        for (int i = 0; i <= list.size(); i++) {
            if (i < list.size()) {
                ApkPermission apkPermission = list.get(i);
                if (!apkPermission.getName().equals(str)) {
                    str = apkPermission.getName();
                    apkPermissionGroup = new ApkPermissionGroup(apkPermission.getName(), apkPermission.getDescription());
                    arrayList.add(apkPermissionGroup);
                } else {
                    apkPermissionGroup.setDescription(apkPermission.getDescription());
                }
            } else if (!arrayList.contains(apkPermissionGroup)) {
                arrayList.add(apkPermissionGroup);
            }
        }
        return arrayList;
    }

    public static long sumFileSizes(long j, Obb obb) {
        long filesize;
        if (obb == null || obb.getMain() == null) {
            return j;
        }
        if (obb.getPatch() == null) {
            filesize = obb.getMain().getFilesize();
        } else {
            j += obb.getMain().getFilesize();
            filesize = obb.getPatch().getFilesize();
        }
        return j + filesize;
    }
}
