package date;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MicroWave {

    int duration;

    List<Program> programList = new ArrayList<>();


   public MicroWave(int duration) {
       this.duration = duration;
   }

   public MicroWave() {

   }


   public void selectProgram(int number) {

       Program program = null;

       for (Program program2 : programList) {
           if (program2.number == number) {
               program = program2;
           }
       }

       int count = 0;

       LocalTime programEnd = LocalTime.now();
       programEnd = programEnd.plusSeconds(program.duration);

       while (LocalTime.now().isBefore(programEnd)) {
           if (count == 100 || count == 1000 || count == 10000 || count == 100000 || count == 1000000) {
               System.out.println("Se prepara");
           }

           count++;
       }

       System.out.println("A fost preparat");
   }

   public void start() {
       LocalTime endTime = LocalTime.now().plusSeconds(duration);

       int count = 0;
       while (LocalTime.now().isBefore(endTime)) {
           if (count < 5) {
               System.out.println("Se Prepara");
           }
           count++;
       }

       System.out.println("A fost preparat");
   }


   public void addProgram(Program program) {
       programList.add(program);
   }

   public void displayPrograms() {
       for (Program program : programList) {
           System.out.println("Numar: " + program.getNumber());
           System.out.println("Name: " + program.getName());
           System.out.println("Duration in Seconds: " + program.getDuration());
       }
   }


}
