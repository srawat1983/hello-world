package com.practice.interfaceexample;

public class CsvReportServiceImpl implements ReportService {


    @Override
    public String formatType() {
        return ".csv";
    }

    @Override
    public boolean write() {
        System.out.println("writing csv file");

        return true;
    }

    @Override
    public byte[] get() {

        System.out.println("reading csv file");

        return null;
    }
}
