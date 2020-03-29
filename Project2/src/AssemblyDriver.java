import java.util.ArrayList;
import java.util.Scanner;

public class AssemblyDriver {


    public static void main(String[] args) {
        ArrayList<Assembly> parts = new ArrayList<>();
        // References
        boolean usercheck = false;
        while (true){



            String newparts;
            Scanner input = new Scanner(System.in);
            System.out.print("\nEnter the assembly number you would like to build (D if done): ");
            newparts = input.nextLine();

            if( newparts.equals("D") || newparts.equals("d")){
                usercheck = true;
                break;
            }

            System.out.print("\nAdd parts:");
            Assembly t = new Assembly(newparts);


            do {



                System.out.print("\nPart number: ");
                String partName = input.nextLine();

                System.out.print("Serial number: ");
                String userSerialNumber = input.nextLine();
                Integer.parseInt(userSerialNumber);

                System.out.print("Part weight: ");
                int  weight = 0;
                String userweight = input.nextLine();
                Integer.parseInt(userweight);

                System.out.print("Part surface area: ");
                double surfaceArea = 0.0;
                String userArea;
                userArea = input.nextLine();
                Double.parseDouble(userArea);

                System.out.print("\nAdd another part to this assembly? (Y or N): ");
                String yn = input.nextLine();



                if (yn.equalsIgnoreCase("Y")){
                    continue;
                } else {
                    parts.add(t);
                    break;
                }



            } while (usercheck == false);


        }//while loop
        System.out.println("Assembly Report");
        System.out.println("============================");
        for (Assembly e: parts){
            System.out.println(e.toString());
        }
        System.exit(-1);
    }//main
}//class


