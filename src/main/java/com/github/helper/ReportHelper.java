package com.github.helper;

import java.util.ArrayList;
import java.util.List;

import com.github.dto.UserDTO;
import com.github.service.impl.ReportServiceImpl;

import net.sf.jasperreports.engine.JRException;

/**
 * 
 * @author Timóteo Soutello
 *
 */
public class ReportHelper {

	/**
	 * Generating data.
	 * @throws JRException
	 */
	public void generateData() throws JRException{
		List<UserDTO> dtoList = new ArrayList<UserDTO>(); 
		dtoList.add(new UserDTO("Tim",27));
		dtoList.add(new UserDTO("Thomas",21));
		new ReportServiceImpl().generateReport(dtoList);
	}
}
