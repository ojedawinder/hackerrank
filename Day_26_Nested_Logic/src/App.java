import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
       
        String  realDate = scan.nextLine();
        LocalDate fechaReal = getDate(realDate);

        String  expectedDate = scan.nextLine();
        LocalDate fechaEsperada = getDate(expectedDate);
        
        scan.close();

        int multa = 0;
        if(fechaReal.isAfter(fechaEsperada)){
            if(fechaReal.getYear()>fechaEsperada.getYear())
                multa = 10000;
            else if(fechaReal.getMonthValue() > fechaEsperada.getMonthValue())
                multa = (fechaReal.getMonthValue() - fechaEsperada.getMonthValue())*500;
            else if(fechaReal.getDayOfMonth() > fechaEsperada.getDayOfMonth())
                multa = (fechaReal.getDayOfMonth() - fechaEsperada.getDayOfMonth())*15;
        }
        System.out.printf("%d%n", multa);
    }

    private static LocalDate getDate(String line){
        String[] date = line.split(" ");
        LocalDate fecha = LocalDate.of(Integer.parseInt(date[2]), Integer.parseInt(date[1]), Integer.parseInt(date[0]));
        return fecha;
    }
}
