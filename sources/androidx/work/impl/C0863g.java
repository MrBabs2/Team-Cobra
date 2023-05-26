package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.room.p005s.C0774a;
import androidx.work.impl.utils.C0937e;
import p050l.p103q.p104a.C5165b;

/* renamed from: androidx.work.impl.g */
/* compiled from: WorkDatabaseMigrations */
public class C0863g {

    /* renamed from: a */
    public static C0774a f3097a = new C0864a(1, 2);

    /* renamed from: b */
    public static C0774a f3098b = new C0865b(3, 4);

    /* renamed from: c */
    public static C0774a f3099c = new C0866c(4, 5);

    /* renamed from: androidx.work.impl.g$a */
    /* compiled from: WorkDatabaseMigrations */
    static class C0864a extends C0774a {
        C0864a(int i, int i2) {
            super(i, i2);
        }

        public void migrate(C5165b bVar) {
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.execSQL("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            bVar.execSQL("DROP TABLE IF EXISTS alarmInfo");
            bVar.execSQL("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* renamed from: androidx.work.impl.g$b */
    /* compiled from: WorkDatabaseMigrations */
    static class C0865b extends C0774a {
        C0865b(int i, int i2) {
            super(i, i2);
        }

        public void migrate(C5165b bVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                bVar.execSQL("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* renamed from: androidx.work.impl.g$c */
    /* compiled from: WorkDatabaseMigrations */
    static class C0866c extends C0774a {
        C0866c(int i, int i2) {
            super(i, i2);
        }

        public void migrate(C5165b bVar) {
            bVar.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            bVar.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* renamed from: androidx.work.impl.g$d */
    /* compiled from: WorkDatabaseMigrations */
    public static class C0867d extends C0774a {

        /* renamed from: a */
        final Context f3100a;

        public C0867d(Context context, int i, int i2) {
            super(i, i2);
            this.f3100a = context;
        }

        public void migrate(C5165b bVar) {
            new C0937e(this.f3100a).mo4929a(true);
        }
    }
}
