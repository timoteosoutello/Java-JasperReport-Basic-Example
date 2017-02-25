package com.github.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.constants.ReportEnum;
import com.github.dto.UserDTO;
import com.github.service.ReportService;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class ReportServiceImpl implements ReportService {

	/**
	 * 
	 * Report generation service
	 * @param data user list.
	 */
	public void generateReport(List<UserDTO> data) throws JRException {
		Map params = new HashMap();
		JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(data);
		JasperPrint impressao = JasperFillManager.fillReport(
				ReportEnum.REPORT_SOURCE_DIR.getValue() + ReportEnum.REPORT_USER_NAME.getValue(), params, ds);
		JasperExportManager.exportReportToPdfFile(impressao, ReportEnum.REPORT_SOURCE_DIR.getValue() + "result.pdf");
	}

}
