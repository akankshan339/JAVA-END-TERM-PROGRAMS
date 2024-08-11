import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class VowelExtractorFile {

    public static void main(String[] args) {
        String filePath = "file.txt";
        
        // Step 1: Write sentences to a file
        writeToFile(filePath);
        
        // Step 2: Read the content from the file
        String str = readFromFile(filePath);
        
        // Step 3: Extract vowels from the content
        String vowels = extractVowels(str);
        
        // Step 4: Display the extracted vowels
        System.out.println("Extracted Vowels: " + vowels);
    }

    private static void writeToFile(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("This is the first sentence.\n");
            writer.write("My name is Akanksha Negi\n");
            writer.write("The quick brown fox jumps over the lazy dog.");
        } 
        catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    private static String readFromFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
        return content.toString();
    }

    private static String extractVowels(String content) {
        StringBuilder vowels = new StringBuilder();
        for (char ch : content.toCharArray()) {
            if (isVowel(ch)) {
                vowels.append(ch);
            }
        }
        return vowels.toString();
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
