package me.kapsel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BiedaBazaDanych extends Bot {
	public static ArrayList<String> main(String lang, String[] args){
		String[] elements;
		List<String> fixedLenghtList;
			
		//WA¯NE: nowe nadanie wartoœci czyœci zmienn¹
		
			if(lang == "pl") {
			String po_polsku_s = "szczêka,jelito,nerka,warga,p³uco,lek,¿ebro,opatrunek,brew,banda¿";
			elements = po_polsku_s.split(",");
			fixedLenghtList = Arrays.asList(elements);
			ArrayList<String> po_polsku = new ArrayList<String>(fixedLenghtList);
			return po_polsku;
			}
			
			if(lang== "en") {
			String po_angielsku_s = "jaw,intestine,kidney,lip,lung,medicine,rib,dressing,eyebrow,bandage";
			elements = po_angielsku_s.split(",");
			fixedLenghtList = Arrays.asList(elements);
			ArrayList<String> po_angielsku = new ArrayList<String>(fixedLenghtList);
			return po_angielsku;
			}
			return null;
	}	
}