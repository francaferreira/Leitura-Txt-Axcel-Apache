package leituraEscritaTxtExcelApachePoiJsonGson;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class LeituraApachePoi {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream entrada = new FileInputStream(new File("C:\\Users\\jef\\eclipse-workspace\\"
		+ "leituraEscritaTxtExcelApachePoiJsonGson\\src\\"
		+ "leituraEscritaTxtExcelApachePoiJsonGson\\arquivo_excel.xls"));
		
		//Prepara a entrada do arquivo excel para ler
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);
		
		//Pega a primera planilha do nosso arquivo excel
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0);
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		while (linhaIterator.hasNext()) {//Enquanto tiver linha no arquivo excel
			Row linha = linhaIterator.next();//Dados da pessoa na linha
			
			Iterator<Cell> celulas = linha.iterator();
			
			Pessoa pessoa = new Pessoa();
			
			while (celulas.hasNext()) {//Percorrer as celulas
				Cell cell = celulas.next();
				
				switch (cell.getColumnIndex()) {
				case 0:
					pessoa.setNome(cell.getStringCellValue());
					break;
				case 1:
					pessoa.setEmail(cell.getStringCellValue());
					break;
				case 2:
					pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
					break;
				} 
				
			}//Fim das celular da linha
				
			pessoas.add(pessoa);
		}
		
		entrada.close();//Terminou de ler o arquivo excel
		
		for (Pessoa pessoa : pessoas) {//Poseria gravar no banco de dados
			System.out.println(pessoa);
		}
			
		
	}

}
