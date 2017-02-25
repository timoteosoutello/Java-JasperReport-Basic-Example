package com.github.service;

import java.util.List;

import com.github.dto.UserDTO;

import net.sf.jasperreports.engine.JRException;

/**
 * jReport interface.
 * @author Timóteo Soutello
 *
 */
public interface ReportService {

	/**
	 * Generate report assignature.
	 * @param data
	 * @throws JRException 
	 */
	void generateReport(List<UserDTO> data) throws JRException;
}
