import java.io.FileNotFoundException;
import java.io.IOException;

import com.DS.bean.Data;
import com.DS.controller.DataControllerImpl;
import com.DS.controller.DataStoreControllerImpl;

public class MainClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataStoreControllerImpl dsc = new DataStoreControllerImpl();
		DataControllerImpl dc = new DataControllerImpl();
		try {
			System.out.println(dsc.deleteStore());
			System.out.println(dsc.createStore());
			Data data = new Data("A","{\n" + 
					"    \"fruit\": \"Apple\",\n" + 
					"    \"size\": \"Large\",\n" + 
					"    \"color\": \"Red\"\n" + 
					"}");
			System.out.println(dc.insertData(data));
			data = new Data("B","{\n" + 
					"    \"fruit\": \"Banana\",\n" + 
					"    \"size\": \"Large\",\n" + 
					"    \"color\": \"Yellow\"\n" + 
					"}");
			System.out.println(dc.insertData(data));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File Not found");		
			}
		catch(NullPointerException np) {
			System.out.println("Null Pointer");
		}
	}

}
