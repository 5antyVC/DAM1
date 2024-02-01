import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CrearScriptGIT {
    public static void main(String[] args) {
        try {
            FileWriter script=new FileWriter("C:\\Users\\Hp EliteDesk\\Desktop\\Clon\\tallerciberseguridad\\creategit.sh");
            BufferedWriter bs=new BufferedWriter(script);
            bs.write("git checkout -b spock\n");
            bs.write("git add creategit.sh\n");
            bs.write("git commit -m 'subido fichero'\n");
            bs.write("git push origin spock");
            System.out.println("script creado\n");
            bs.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();;
        }
    }
}
