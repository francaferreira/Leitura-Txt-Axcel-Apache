package leituraEscritaTxtExcelApachePoiJsonGson;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiEditando {
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\Users\\jef\\eclipse-workspace\\"
				+ "leituraEscritaTxtExcelApachePoiJsonGson\\src\\"
				+ "leituraEscritaTxtExcelApachePoiJsonGson\\arquivo_excel.xls");
		
		FileInputStream entrada = new FileInputStream(file);
		
		//Prepara a entrada do arquivo xls exceel
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);
		
		//Pegando a planilha
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0);
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		while (linhaIterator.hasNext()) {//Enquato tiver linha
			Row linha = linhaIterator.next();//Dados da pessoas na linha
			
			int numeroCelulas = linha.getPhysicalNumberOfCells();//Quantidade de célula
			
			Cell cell = linha.createCell(numeroCelulas);//Cria nova celular na linha
			cell.setCellValue("5.487,20");
			
		}
		
		entrada.close();
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);
		saida.flush();
		saida.close();
		
		System.out.println("Planilha atualizada");
	}

}
