package hafta4progDilleri;
import java.util.*;
import java.io.*;
public class arrayDosyaİslemleri {

	
	public static void main(String[] args) {
		List<String> kitaplar=new ArrayList<>();
		kitaplar.add("Hobbit");
		kitaplar.add("Seker Portakali");
		kitaplar.add("Beyaz Zambaklar");
		kitaplar.add("Bir Delinin Hatira Defteri");
		kitaplar.add("Divan");
		System.out.println(kitaplar);
		
		//dosyaya yazma islemi
		try {
		BufferedWriter writer=new BufferedWriter(new FileWriter("/Users/pc/Documents/metin1.txt",true));
		writer.write("Programdan aktarilan liste >>"+kitaplar.toString());
		System.out.println("Dosyaya basariyla yazildi");
		writer.close();
		
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		
		//dosyadan okuma islemi
		File file=new File("/Users/pc/Documents/metin1.txt");
		try 
		{          
		Scanner x=new Scanner(file);
		while(x.hasNextLine())
		{
		String line=x.nextLine();
		System.out.println(line);
		}
		x.close();
		} catch 
		(FileNotFoundException e)
		{
		e.printStackTrace();
		}
		
		
	}

}
