package com.practice.interfaceexample;

public class ExcelReportServiceImpl implements ReportService {


    @Override
    public String formatType() {
        return ".xls";
    }

    @Override
    public boolean write() {
        System.out.println("writing xls file");

        return true;
    }

    @Override
    public byte[] get() {

        System.out.println("reading xls file");

        return null;
    }
}
