import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream;
        OutputStream outputStream;
        try {
            inputStream=new FileInputStream("input.txt");
            outputStream=new FileOutputStream("output.txt");
        }
        catch(FileNotFoundException e){
            throw new RuntimeException(e);
        }

        BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));
        PrintWriter out = new PrintWriter(outputStream);
        try {
            while(reader.ready()) {
                StringTokenizer tokenizer=new StringTokenizer(reader.readLine(), "|");

                if (!tokenizer.hasMoreTokens()) continue;
                String str = tokenizer.nextToken();
                str=FIO.checkWithRegExp(str);
                System.out.print(str+" ");
                if (!tokenizer.hasMoreTokens()) continue;
                str = tokenizer.nextToken();
                System.out.print(Age.checkWithRegExp(str)+" ");
                if (!tokenizer.hasMoreTokens()) continue;
                str = tokenizer.nextToken();
                System.out.print(Phone.checkWithRegExp(str)+" ");
                if (!tokenizer.hasMoreTokens()) continue;
                str = tokenizer.nextToken();
                System.out.println(Mail.checkWithRegExp(str));

            }
        }
        catch(IOException e) {
            throw new RuntimeException(e);
        }
        out.close();
    }
}
