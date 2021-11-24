package com.company.lab27and28;

import java.io.File;

public class Main {
    private  static int newWidth = 256;

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        int nrOfProcessors = runtime.availableProcessors();
        String srcFolder = "src/main/java/com/company/lab27and28/images";
        File srcDir = new File(srcFolder);
        File[] files = srcDir.listFiles();

        startThread(nrOfProcessors, files);
    }


    private static void startThread (int nrOfProcessors, File[] files){

        long start = System.currentTimeMillis();

        int middle = files.length / nrOfProcessors;

        for (int i = 0; i < nrOfProcessors - 1; i++){
            File[] files1 = new File[middle];
            System.arraycopy(files, 0 + (middle * i), files1, 0, middle);
            Resizer resizer1 = new Resizer(start, files1);
            new Thread(resizer1).start();
        }

    }
}