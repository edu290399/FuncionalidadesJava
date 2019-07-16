
import java.nio.file.Files;





public class Item2 {
    
    
    
public static void main(String[] args) {
        String resp = "C:\\Users\\Claudia_KK\\Documents\\Prova\\RespostaItem2.txt";
        
        
        //GRAVAÇÃO


        
        
        //String texto = Arquivo.Read(resp);

        
        
        String Item2 = "C:\\Users\\Claudia_KK\\Documents\\Prova\\Item2.txt";
        /*
        String nome = "Gilberto";
        String login = "admin";
        String versao = "1.0.5";
        
        String print = nome+";"+login+";"+versao;
        Arquivo.Write(ArqConfig,print);
        */
        
        String conteudo = Arquivo.Read(Item2);
        
      String texto = "";
      for(int i=12; i>=0;i-=1){
       
        
        texto += conteudo.split(";")[i]+"\r\n";
        
      
        if(texto.isEmpty())
          System.out.println("Erro ao ler do arquivo!");
        else
            System.out.println(texto);
      }
        if(Arquivo.Write(resp, texto))
            System.out.println("Arquivo salvo com sucesso!");
        else
            System.out.println("Erro ao salvar o arquivo!");
    
}
    
}
