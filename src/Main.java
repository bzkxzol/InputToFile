import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Введите текст для записи в файл");
        BufferedReader inpReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = inpReader.readLine();
        FileWriter(inputText);
        System.console().readLine();
    }

    private static void FileWriter(String data){
        File file = new File("InputtedData.txt");
        FileWriter fr =null;
        try{
            fr = new FileWriter(file);
            fr.write(data);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                assert fr != null;
                fr.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        System.out.println("\nТекст записан в файл:\n" + file.getAbsolutePath());
    }
}
