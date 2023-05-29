package may18.training.afternoon.separator.program;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FileSeparator {

	public static void main(String[] args) throws IOException  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path of directory...");
		String path = sc.next().concat("\\");
		Path directory = Path.of(path);
		List<String> paths = new ArrayList<>();
		
//			paths = Files.walk(directory).filter(Files::isRegularFile).map(Path::toString).collect(Collectors.toList());
			paths = Files.list(directory).filter(Files::isRegularFile).map(Path::toString).collect(Collectors.toList());
			
		Map<String, Path> map = new HashMap<>();
		for(String p : paths) {
			StringBuilder sb = new StringBuilder();
			for(int i=p.length()-1;i>=0;i--) {
				if(p.charAt(i)=='.') break;
				sb.append(p.charAt(i));
			}
			sb.reverse();
			String dest = path+sb.toString();
			Path source = Path.of(p);
			Path destination = Path.of(dest);
			if(map.containsKey(sb.toString())) {
				destination = map.get(sb.toString());
				Files.move(source, destination.resolve(source.getFileName()), StandardCopyOption.REPLACE_EXISTING);
			}else {
				try {
					map.put(sb.toString(),Files.createDirectory(Paths.get(dest)));
				} catch (IOException e) {
					System.out.println(destination.getFileName()+" Folder already exists so copying to same folder i cant help with another folder please implement if you want another folder...");
				}
			
				Files.move(source, destination.resolve(source.getFileName()), StandardCopyOption.REPLACE_EXISTING);
			}
		}
		
		paths.forEach(System.out::println);

	}

}
