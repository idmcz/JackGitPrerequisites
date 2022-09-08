import java.io.IOException;
public class GitPrerequisitesTester{

	public static void main(String[] args) throws IOException{
		Blob bob = new Blob ("Input.txt");//makes the blob
		System.out.print(bob.getHash());//returns a hash
	}

}
