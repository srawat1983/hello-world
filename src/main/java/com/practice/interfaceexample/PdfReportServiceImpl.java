package com.practice.interfaceexample;

public class PdfReportServiceImpl implements ReportService {


    @Override
    public String formatType() {
        return ".pdf";
    }

    @Override
    public boolean write() {
        System.out.println("writing pdf file");

        return true;
    }

    @Override
    public byte[] get() {

        System.out.println("reading pdf file");

        return null;
    }
}
