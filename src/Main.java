import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println ("Введите текст для записи в файл");
        InputIntoFile();
    }

    private static void InputIntoFile() {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        File file = new File ("InputtedData.txt");//файл запишется в ту же папку откуда запустили прогу
        FileWriter fw = null;
        String data;
        try {
            fw = new FileWriter (file , true);//флаг-true, для дозаписывания

            //Записываем все что вводится с консоли, пока не будет какое-нибудь стоп-условие
            while (true) {
                data = br.readLine ();
                if (!data.equals (""))// "" - можно заменить на какое нибудь ключевое слово типа Done(если нужно)
                    fw.write (data + "\n");
                else
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            try {
                assert fw != null;
                fw.close ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }
        System.out.println ("\nТекст записан в файл:\n" + file.getAbsolutePath ());
    }
}
