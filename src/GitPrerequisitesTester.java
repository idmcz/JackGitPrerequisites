import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class GitPrerequisitesTester{

	public static void main(String[] args) throws IOException{
		Blob bob = new Blob ("Input.txt");//makes the blob
		System.out.print(bob.getHash());//returns a hash
		
		Path p = Paths.get("./objects");
		Files.exists(p);
		Path p2 = Paths.get("index.txt");
		Files.exists(p2);
		Path p3 = Paths.get(bob.getHash());
		Files.exists(p3);
		Path p4 = Paths.get("./objects");
		Files.exists(p4);
		
		Index i = new Index ();
		i.initialize();
		i.addBlob ("Input.txt");
		i.addBlob("chucky.txt");
		i.addBlob("Chuckilicious.txt");
		i.removeBlob("Input.txt");
		i.removeBlob("Chuckilicious.txt");//removes chuckilicious
	}

}
