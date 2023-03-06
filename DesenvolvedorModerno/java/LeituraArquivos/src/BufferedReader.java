/*
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader {
    public static void main(String[] args) {
        String path = "/home/lucasvinij/Documents/devSuperior/DesenvolvedorModerno/java/LeituraArquivos/src/in.txt ";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getCause());
        }finally {
            if (br != null) {
                br.close();
            }
            if (fr != null) {
                fr.close();;
            }
        }
    }

    private String readLine() {
    }
}
*/
