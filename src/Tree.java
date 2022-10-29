import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Tree {
	public String sha,con;
	public Tree(String[] entries) {
		StringBuilder builder = new StringBuilder();
		for(String i : entries) {
			builder.append(i).append('\n');
		}
		String ret = builder.toString();
		con=ret;
		String hash = Blob.encryptThisString(ret);
		sha = hash;
		try {
			Files.writeString(Paths.get("objects/" + hash), ret);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	String getName () { return sha; }
	String contents () { return con; }
}