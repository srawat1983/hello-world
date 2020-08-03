package com.practice.interfaceexample;

public class ReportServiceImpl  {

    ReportService reportService;

    public ReportService getReportService(){

        reportService = new ExcelReportServiceImpl();
//        return new ExcelReportServiceImpl();
        return reportService;
    }


}
