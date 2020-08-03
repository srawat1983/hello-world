package com.practice.interfaceexample;

public class ReportClient {

    private ReportServiceImpl reportService ;

    public ReportServiceImpl getReportService() {
        return reportService;
    }

    public void setReportService(ReportServiceImpl reportService) {
        this.reportService = reportService;
    }

    public static void main (String[] args){

        ReportClient cl = new ReportClient();
        cl.setReportService(new ReportServiceImpl());


        System.out.println("format in use is - " +cl.reportService.getReportService().formatType());
        System.out.println("file writing status " + cl.reportService.getReportService().write());
        System.out.println("file data is " + cl.reportService.getReportService().get());



     }


}
