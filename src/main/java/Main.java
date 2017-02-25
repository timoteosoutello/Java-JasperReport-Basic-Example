import com.github.helper.ReportHelper;

import net.sf.jasperreports.engine.JRException;
/**
 * 
 * @author Timóteo Soutello
 *
 */
public class Main {

	/**
	 * Main
	 * @param args
	 * @throws JRException
	 */
	public static void main(String[] args) throws JRException {
		ReportHelper helper = new ReportHelper();
		helper.generateData();
	}

}
