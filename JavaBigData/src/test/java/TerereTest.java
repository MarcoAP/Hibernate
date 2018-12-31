import java.util.Date;

import com.everis.dao.TerereDAO;
import com.everis.model.TerereModel;

public class TerereTest {
	
	public static void main(String[] args) {
		TerereModel terere = new TerereModel();
		terere.setId(2);
		terere.setName("Silvio");
		terere.setDt_insercao("2018-12-29");
		
		TerereDAO dao = new TerereDAO();
		dao.insertTerere(terere);
	}

}

