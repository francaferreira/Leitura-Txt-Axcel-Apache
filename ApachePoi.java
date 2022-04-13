package leituraEscritaTxtExcelApachePoiJsonGson;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {
	
	public static void main(String[] args) throws IOException {
		
		
		File file = new File("C:\\Users\\jef\\eclipse-workspace\\"
		+ "leituraEscritaTxtExcelApachePoiJsonGson\\src\\"
		+ "leituraEscritaTxtExcelApachePoiJsonGson\\arquivo_excel.xls");
		
		if (!file.exists()) {
			file.createNewFile();
		}
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setEmail("pessoa1@gmail.com");
		pessoa1.setIdade(50);
		pessoa1.setNome("jefferson franca");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setEmail("pessoa2@gmail.com");
		pessoa2.setIdade(90);
		pessoa2.setNome("Idalice franca");
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setEmail("pessoa3@gmail.com");
		pessoa3.setIdade(70);
		pessoa3.setNome("Beatriz franca");
		
		Pessoa pessoa4 = new Pessoa();
		pessoa4.setEmail("pessoa4@gmail.com");
		pessoa4.setIdade(50);
		pessoa4.setNome("Felipe franca");
		
		//Pode vir do banco de dados ou qualquer fonte de dados
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		
	    //Vai ser usado para escrever a planilha
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(); 
		HSSFSheet linhasPessoa = hssfWorkbook.createSheet
		("Planilha de pessoas JDev Treinamento");//Criar a planilha
			
			int numeroLinha = 0;
			for (Pessoa p : pessoas) {
			Row linha = linhasPessoa.createRow(numeroLinha ++);//Criando a linha na planilha
				
				int celula = 0;
				
				Cell celNome = linha.createCell(celula ++);//Celula 1
				celNome.setCellValue(p.getNome());
				
				Cell celemail = linha.createCell(celula ++);//Celula 2
				celemail.setCellValue(p.getEmail());
				
				Cell celIdade = linha.createCell(celula ++);// Celula 3
				celIdade.setCellValue(p.getIdade());
				
			}//Término de montar a planilha
			
			FileOutputStream saida = new FileOutputStream(file);
			hssfWorkbook.write(saida);//Escreve planilha em arquivo
			saida.flush();
			saida.close();
			
			System.out.println("Planilha foi criada");
		}
			
	}




