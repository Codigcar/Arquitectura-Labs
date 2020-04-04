package lab12;

import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class CodeBase64 {

	public static void main(String[] args) {
		Path originalPath = Paths.get("D:\\Ciclo 7\\Fundamentos de Arquitectura\\Lab 1 y 2\\Lab12\\src\\lab12","test.pdf");
		Path targetPath = Paths.get("D:\\Ciclo 7\\Fundamentos de Arquitectura\\Lab 1 y 2\\Lab12\\src\\lab12","encoded.txt");
		Base64.Encoder mimeEncoder = Base64.getMimeEncoder();
		try(OutputStream output = Files.newOutputStream(targetPath)) {
			
			Files.copy(originalPath, mimeEncoder.wrap(output));
			
			OutputStream encodedStream = mimeEncoder.wrap(output);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
}
