package leituraEscritaTxtExcelApachePoiJsonGson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class EscreveJSON {

	public static void main(String[] args) throws Exception {
		
		Usuario usuario1 = new Usuario();
		usuario1.setNome("Jefferson");
		usuario1.setCpf("30405060");
		usuario1.setLogin("admin");
		usuario1.setSenha("admin");
		
		Usuario usuario2 = new Usuario();
		usuario2.setNome("Idallice Franca");
		usuario2.setCpf("1234567");
		usuario2.setLogin("if2030");
		usuario2.setSenha("1020304050");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String jsonUser = gson.toJson(usuarios);
		
		System.out.println(jsonUser);
		
		FileWriter fileWriter = new FileWriter("C:\\Users\\jef\\eclipse-workspace\\"
				+ "leituraEscritaTxtExcelApachePoiJsonGson\\src\\"
				+ "leituraEscritaTxtExcelApachePoiJsonGson\\filjson.json");
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
		
		
		//=================LENDO O ARQUIVO JSON====================
				
		FileReader fileReader = new FileReader("C:\\Users\\jef\\eclipse-workspace\\"
				+ "leituraEscritaTxtExcelApachePoiJsonGson\\src\\"
				+ "leituraEscritaTxtExcelApachePoiJsonGson\\filjson.json");
		
		JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader);
		
		List<Usuario> listUsuarios = new ArrayList<Usuario>();
		
		for (JsonElement jsonElement : jsonArray ) {
			
			Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
			listUsuarios.add(usuario);
		}
		
		System.out.println("Leitura do arquivo Json: " + listUsuarios);
	}

}
