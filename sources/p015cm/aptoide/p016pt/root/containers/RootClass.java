package p015cm.aptoide.p016pt.root.containers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: cm.aptoide.pt.root.containers.RootClass */
public class RootClass {
    static String PATH_TO_DX = "/Users/Chris/Projects/android-sdk-macosx/build-tools/18.0.1/dx";

    /* renamed from: cm.aptoide.pt.root.containers.RootClass$1 */
    static /* synthetic */ class C39791 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$root$containers$RootClass$READ_STATE;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                cm.aptoide.pt.root.containers.RootClass$READ_STATE[] r0 = p015cm.aptoide.p016pt.root.containers.RootClass.READ_STATE.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$root$containers$RootClass$READ_STATE = r0
                cm.aptoide.pt.root.containers.RootClass$READ_STATE r1 = p015cm.aptoide.p016pt.root.containers.RootClass.READ_STATE.STARTING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$cm$aptoide$pt$root$containers$RootClass$READ_STATE     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.root.containers.RootClass$READ_STATE r1 = p015cm.aptoide.p016pt.root.containers.RootClass.READ_STATE.FOUND_ANNOTATION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.root.containers.RootClass.C39791.<clinit>():void");
        }
    }

    /* renamed from: cm.aptoide.pt.root.containers.RootClass$AnnotationsFinder */
    public static class AnnotationsFinder {
        private final String AVOIDDIRPATH = ("stericson" + File.separator + "RootShell" + File.separator);
        private List<File> classFiles;

        public AnnotationsFinder() throws IOException {
            String[] strArr;
            String[] strArr2;
            System.out.println("Discovering root class annotations...");
            this.classFiles = new ArrayList();
            lookup(new File("src"), this.classFiles);
            System.out.println("Done discovering annotations. Building jar file.");
            File builtPath = getBuiltPath();
            if (builtPath != null) {
                String str = "com" + File.separator + "stericson" + File.separator + "RootShell" + File.separator + "containers" + File.separator + "RootClass.class";
                String str2 = "com" + File.separator + "stericson" + File.separator + "RootShell" + File.separator + "containers" + File.separator + "RootClass$RootArgs.class";
                String str3 = "com" + File.separator + "stericson" + File.separator + "RootShell" + File.separator + "containers" + File.separator + "RootClass$AnnotationsFinder.class";
                String str4 = "com" + File.separator + "stericson" + File.separator + "RootShell" + File.separator + "containers" + File.separator + "RootClass$AnnotationsFinder$1.class";
                String str5 = "com" + File.separator + "stericson" + File.separator + "RootShell" + File.separator + "containers" + File.separator + "RootClass$AnnotationsFinder$2.class";
                boolean z = -1 != System.getProperty("os.name").toLowerCase().indexOf("win");
                if (z) {
                    StringBuilder sb = new StringBuilder(" " + str + " " + str2 + " " + str3 + " " + str4 + " " + str5);
                    for (File path : this.classFiles) {
                        sb.append(" " + path.getPath());
                    }
                    strArr = new String[]{"cmd", "/C", "jar cvf anbuild.jar" + sb.toString()};
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("jar");
                    arrayList.add("cf");
                    arrayList.add("anbuild.jar");
                    arrayList.add(str);
                    arrayList.add(str2);
                    arrayList.add(str3);
                    arrayList.add(str4);
                    arrayList.add(str5);
                    for (File path2 : this.classFiles) {
                        arrayList.add(path2.getPath());
                    }
                    strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
                ProcessBuilder processBuilder = new ProcessBuilder(strArr);
                processBuilder.directory(builtPath);
                try {
                    processBuilder.start().waitFor();
                } catch (IOException | InterruptedException unused) {
                }
                File file = new File("res" + File.separator + "raw");
                if (!file.exists()) {
                    file.mkdirs();
                }
                System.out.println("Done building jar file. Creating dex file.");
                if (z) {
                    strArr2 = new String[]{"cmd", "/C", "dx --dex --output=res" + File.separator + "raw" + File.separator + "anbuild.dex " + builtPath + File.separator + "anbuild.jar"};
                } else {
                    strArr2 = new String[]{getPathToDx(), "--dex", "--output=res" + File.separator + "raw" + File.separator + "anbuild.dex", builtPath + File.separator + "anbuild.jar"};
                }
                try {
                    new ProcessBuilder(strArr2).start().waitFor();
                } catch (IOException | InterruptedException unused2) {
                }
            }
            System.out.println("All done. ::: anbuild.dex should now be in your project's res" + File.separator + "raw" + File.separator + " folder :::");
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x0057  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.io.File getBuiltPath() {
            /*
                r4 = this;
                java.io.File r0 = new java.io.File
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "out"
                r1.append(r2)
                java.lang.String r2 = java.io.File.separator
                r1.append(r2)
                java.lang.String r2 = "production"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                boolean r1 = r0.isDirectory()
                if (r1 == 0) goto L_0x0054
                cm.aptoide.pt.root.containers.RootClass$AnnotationsFinder$2 r1 = new cm.aptoide.pt.root.containers.RootClass$AnnotationsFinder$2
                r1.<init>()
                java.io.File[] r1 = r0.listFiles(r1)
                int r2 = r1.length
                if (r2 <= 0) goto L_0x0054
                java.io.File r2 = new java.io.File
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = r0.getAbsolutePath()
                r3.append(r0)
                java.lang.String r0 = java.io.File.separator
                r3.append(r0)
                r0 = 0
                r0 = r1[r0]
                java.lang.String r0 = r0.getName()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r2.<init>(r0)
                goto L_0x0055
            L_0x0054:
                r2 = 0
            L_0x0055:
                if (r2 != 0) goto L_0x007b
                java.io.File r0 = new java.io.File
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "bin"
                r1.append(r3)
                java.lang.String r3 = java.io.File.separator
                r1.append(r3)
                java.lang.String r3 = "classes"
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                boolean r1 = r0.isDirectory()
                if (r1 == 0) goto L_0x007b
                r2 = r0
            L_0x007b:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.root.containers.RootClass.AnnotationsFinder.getBuiltPath():java.io.File");
        }

        /* access modifiers changed from: protected */
        public String getPathToDx() throws IOException {
            String str;
            String str2 = System.getenv("ANDROID_HOME");
            if (str2 != null) {
                String str3 = null;
                int i = 0;
                for (File file : new File(str2 + File.separator + "build-tools").listFiles()) {
                    if (file.getName().contains("-")) {
                        String[] split = file.getName().split("-");
                        if (split[1].contains("W")) {
                            str = String.valueOf(split[1].toCharArray()[0]);
                        } else {
                            str = split[1];
                        }
                    } else {
                        str = file.getName();
                    }
                    String[] split2 = str.split("[.]");
                    int parseInt = Integer.parseInt(split2[0]) * 10000;
                    if (split2.length > 1) {
                        parseInt += Integer.parseInt(split2[1]) * 100;
                        if (split2.length > 2) {
                            parseInt += Integer.parseInt(split2[2]);
                        }
                    }
                    if (parseInt > i) {
                        String str4 = file.getAbsolutePath() + File.separator + "dx";
                        if (new File(str4).exists()) {
                            str3 = str4;
                            i = parseInt;
                        }
                    }
                }
                if (str3 != null) {
                    return str3;
                }
                throw new IOException("Error: unable to find dx binary in $ANDROID_HOME");
            }
            throw new IOException("Error: you need to set $ANDROID_HOME globally");
        }

        /* access modifiers changed from: protected */
        public boolean hasClassAnnotation(File file) {
            READ_STATE read_state = READ_STATE.STARTING;
            Pattern compile = Pattern.compile(" class ([A-Za-z0-9_]+)");
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    int i = C39791.$SwitchMap$cm$aptoide$pt$root$containers$RootClass$READ_STATE[read_state.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            Matcher matcher = compile.matcher(readLine);
                            if (matcher.find()) {
                                PrintStream printStream = System.out;
                                printStream.println(" Found annotated class: " + matcher.group(0));
                                return true;
                            }
                            PrintStream printStream2 = System.err;
                            printStream2.println("Error: unmatched annotation in " + file.getAbsolutePath());
                            read_state = READ_STATE.STARTING;
                        }
                    } else if (-1 < readLine.indexOf("@RootClass.Candidate")) {
                        read_state = READ_STATE.FOUND_ANNOTATION;
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void lookup(File file, List<File> list) {
            String replace = file.toString().replace("src" + File.separator, "");
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    if (-1 == file2.getAbsolutePath().indexOf(this.AVOIDDIRPATH)) {
                        lookup(file2, list);
                    }
                } else if (file2.getName().endsWith(".java") && hasClassAnnotation(file2)) {
                    final String replace2 = file2.getName().replace(".java", "");
                    for (File file3 : new File(getBuiltPath().toString() + File.separator + replace).listFiles(new FilenameFilter() {
                        public boolean accept(File file, String str) {
                            return str.startsWith(replace2);
                        }
                    })) {
                        list.add(new File(replace + File.separator + file3.getName()));
                    }
                }
            }
        }
    }

    /* renamed from: cm.aptoide.pt.root.containers.RootClass$Candidate */
    public @interface Candidate {
    }

    /* renamed from: cm.aptoide.pt.root.containers.RootClass$READ_STATE */
    enum READ_STATE {
        STARTING,
        FOUND_ANNOTATION
    }

    /* renamed from: cm.aptoide.pt.root.containers.RootClass$RootArgs */
    public class RootArgs {
        public String[] args;

        public RootArgs() {
        }
    }

    public RootClass(String[] strArr) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String str = strArr[0];
        RootArgs rootArgs = new RootArgs();
        String[] strArr2 = new String[(strArr.length - 1)];
        rootArgs.args = strArr2;
        System.arraycopy(strArr, 1, strArr2, 0, strArr.length - 1);
        Class.forName(str).getConstructor(new Class[]{RootArgs.class}).newInstance(new Object[]{rootArgs});
    }

    static void displayError(Exception exc) {
        PrintStream printStream = System.out;
        printStream.println("##ERR##" + exc.getMessage() + "##");
        exc.printStackTrace();
    }

    public static void main(String[] strArr) {
        try {
            if (strArr.length == 0) {
                new AnnotationsFinder();
            } else {
                new RootClass(strArr);
            }
        } catch (Exception e) {
            displayError(e);
        }
    }
}
