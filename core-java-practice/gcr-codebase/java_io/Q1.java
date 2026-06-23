import java.io.*;
import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		String inputFile = args.length > 0 ? args[0] : "students.txt";
		String outputFile = args.length > 1 ? args[1] : "report_cards.txt";

		try {
			Scanner sc = new Scanner(new File(inputFile));
			try (Scanner in = sc; BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile, true))) {
				bw.write("---- Report generated: " + java.time.LocalDateTime.now() + " ----");
				bw.newLine();

				while (in.hasNextLine()) {
					String line = in.nextLine().trim();
					if (line.isEmpty()) continue;

					String name = null;
					List<Integer> marks = new ArrayList<>();
					String[] commaParts = line.split(",");
					if (commaParts.length >= 2) {
						name = commaParts[0].trim();
						for (int i = 1; i < commaParts.length; i++) {
							String token = commaParts[i].trim();
							try {
								marks.add(Integer.parseInt(token));
							} catch (NumberFormatException ex) {
								
							}
						}
					} else {
						
						String[] tokens = line.split("\\s+");
						if (tokens.length >= 2) {
							name = tokens[0].trim();
							for (int i = 1; i < tokens.length; i++) {
								try {
									marks.add(Integer.parseInt(tokens[i].trim()));
								} catch (NumberFormatException ex) {
									  
								}
							}
						}
					}

					if (name == null || marks.isEmpty()) continue;

					int sum = 0;
					for (int m : marks) sum += m;
					double avg = (double) sum / marks.size();

					bw.write("Student: " + name);
					bw.newLine();
					bw.write("Marks: " + marks.toString());
					bw.newLine();
					bw.write(String.format("Average: %.2f", avg));
					bw.newLine();
					bw.write("-------------------------------");
					bw.newLine();
				}

				bw.flush();
				System.out.println("Report(s) appended to " + outputFile);
			}
		} catch (FileNotFoundException e) {
			System.err.println("Input file not found: " + inputFile);
			System.err.println("Create a file named '" + inputFile + "' with lines like: Name, 78, 82, 91");
		} catch (IOException e) {
			System.err.println("I/O error: " + e.getMessage());
		}
	}
}

