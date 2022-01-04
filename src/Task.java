import java.io.*;

public class Task {
    public static void main(String[] args) throws IOException {

    String source = args[0];
    String dest =  args[1];

    File fileInput = new File(source);
    FileInputStream fileInputStream = new FileInputStream(fileInput);
    BufferedReader in = new BufferedReader(new InputStreamReader(fileInputStream));

    FileWriter fw = new FileWriter(dest, false);
    BufferedWriter out = new BufferedWriter(fw);

    String str = null;
    while ((str = in.readLine()) != null) {
        out.write(str.replace("hell", ""));
        out.newLine();
    }

    in.close();

    out.close();
}
}

