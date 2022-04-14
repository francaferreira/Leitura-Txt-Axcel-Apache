# Leitura e escrita TXT e Excel com Apache POI e Json com Gson

### Escrevendo em arquivo de txt:
> São armazenados como uma sequência de caracteres dividida em linhas terminadas por um caractere de fim de linha. Os arquivos no formato texto geralmente são encontrados com nomes com a extensão padrão TXT (abreviação de TEXT, ou texto em inglês).

### Escrevendo e lendo CSV planilha Excel:
> Para fazer operações em planilhas do excel usando Java, que vem a calhar para usar os CSV arquivos porque os arquivos CSV podem ser facilmente usado com o Microsoft Excel, planilhas do Google, e quase todas as outras planilhas disponíveis.

### Lendo Excel XLS com Apache Poi e Montando lista:
>  O POI é bastante utilizado em frameworks conhecidos, como o PrimeFaces e o RichFaces, que tem funcionalidades como exportar dados de um DataTable diretamente para um arquivo Excel.
>  1) HSSF: classes para trabalhar com o formado binário mais antigo do Excel (XLS).

>  2) XSSF: classes para trabalhar com o formato mais novo do Excel baseado em XML (XLSX).

>  3) SS: supermodelo que engloba tanto HSSF quanto XSSF.

### Escrevendo JSON em arquivo TXT com GSON:
> GSON é uma biblioteca do Google utilizada, entre outras coisas, na conversão de objetos Java em representação JSON. Também pode ser utilizada para converter uma cadeia JSON para um objetos Java equivalentes. Com GSON podemos trabalhar com objetos Java arbitrários, incluindo objetos pré-existentes dos quais não possuímos o código-fonte.
> A estrutura básica JSON para representar um simples objeto é um conjunto desordenado de pares nome/valor. Um objeto começa com { (chave esquerda) e termina com } (chave direita). Cada nome é seguido por : (dois pontos) e os pares nome/valor são separados por , (vírgula).

> Essa classe irá importar as seguintes classes:

> 1) FileWriter – Classe utilizada para se escrever em arquivos;

> 2) IOException – Classe que lança uma exceção de entradas e saídas;

> 3) JSONObject – Classe que cria objetos JSON (importada da biblioteca JSON.simple).

> O arquivo gerado estará armazenado na pasta do projeto, se quiser mudar o local onde o arquivo é armazenado, é só mudar o caminho na declaração writeFile = new FileWriter("saida.json").
> A resposta é bem simples: temos que importar a classe JSONParser e criar um objeto desse tipo. Mas por quê? Porque o JSONParse é responsável por trazer o arquivo do tipo JSON e salva-lo corretamente no objeto do tipo JSONObject.

> Agora será criada a classe que irá ler o arquivo, essa classe possui as seguintes dependências:

> 1) IOException – Classe que lança uma exceção de entradas e saídas;
 
> 2) JSONObject – Classe que cria objetos JSON (importada da biblioteca JSON.simple);
 
> 3) FileReader – Classe responsável por ler arquivos;
 
> 4) JSONParse – Classe que irá criar um parse JSON;
 
> 5) FileNotFoundException – Classe que irá lançar uma exception se o arquivo não for encontrado;

> 6) ParseException – Classe que lançará uma exception se o parse falhar.

> Com isso pode-se perceber que a leitura e escrita em arquivos JSON é simples e de fácil acesso para todos os programadores. Pode-se fazer diversas operações com essas saídas como, por exemplo, criar arquivos JSON a partir de consultas em bancos de dados, e esse JSON pode ser lido por uma rotina DOJO na web para poupar a sobrecarga de acessos ao banco de dados quando um web site é aberto. Existem, além dessas, muitas outras aplicações para arquivos JSON.
