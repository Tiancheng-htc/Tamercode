    public void writeXls() throws IOException {
        if (evModel == null || evModel.isEmpty()) {
            out.print("Status: 404 Not Found\r\n\r\n");
            out.flush();
        } else if ("Excel97".equalsIgnoreCase(Settings.getVal("excel.exportChartsMethod"))) {
            out.print("Content-type: application/vnd.ms-excel\r\n\r\n");
            out.flush();
            FileUtils.copyFile(EVReport.class.getResourceAsStream("evCharts97.xls"), outStream);
        } else {
            out = new PrintWriter(new OutputStreamWriter(outStream, "us-ascii"));
            out.print("Content-type: application/vnd.ms-excel\r\n\r\n");
            BufferedReader in = new BufferedReader(new InputStreamReader(EVReport.class.getResourceAsStream("evCharts2002.mht"), "us-ascii"));
            scanAndCopyLines(in, "Single File Web Page", true, false);
            out.print("This document, generated by the Process Dashboard,\r\n" + "is designed to work with Excel 2002 and higher.  If\r\n" + "you are using an earlier version of Excel, try\r\n" + "adding the following line to your pspdash.ini file:\r\n" + "excel.exportChartsMethod=Excel97\r\n");
            boolean needsOptimizedLine = (evModel.getSchedule() instanceof EVScheduleRollup);
            if (needsOptimizedLine == false) {
                scanAndCopyLines(in, "'EV Data'!$D$2:$D$10", true, true);
                scanAndCopyLines(in, "</x:Series>", true, true);
                scanAndCopyLines(in, "</x:Series>", false, false);
            }
            String line;
            while ((line = scanAndCopyLines(in, "http://localhost:2468/++/", true, false)) != null) {
                writeUrlLine(line);
            }
            out.flush();
        }
    }