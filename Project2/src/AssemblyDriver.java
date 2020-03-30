import java.util.ArrayList;
import java.util.Scanner;

public class AssemblyDriver {


    public static void main(String[] args) {
        ArrayList<Assembly> assemblies = new ArrayList<>();
        // References
        boolean doneCheck = false;
        while (true) {

            
            Scanner input = new Scanner(System.in);
            System.out.print("\nEnter the assembly number you would like to build (D if done): ");
            String assemblyName = input.nextLine();

            if (assemblyName.equals("D") || assemblyName.equals("d")) {
                doneCheck = true;
                break;
            }

            System.out.print("\nAdd parts:");
            Assembly t = new Assembly(assemblyName);


            do {


                System.out.print("\nPart number: ");
                String partName = input.nextLine();

                System.out.print("Serial number: ");
                String serial = input.nextLine();

                System.out.print("Part weight (0-100): ");
                String userWeight = input.nextLine();
                int weight = 0;
                try {
                    weight = Integer.parseInt(userWeight);
                } catch (Exception e) {
                    System.out.println(userWeight + " doesn't seem to be an integer, provide a value between 0-100.");
                    System.exit(2);
                }

                System.out.print("Part surface area: ");
                String userArea;
                userArea = input.nextLine();
                double surfaceArea = Double.parseDouble(userArea);

                System.out.print("\nAdd another part to this assembly? (Y or N): ");
                String yn = input.nextLine();

                t.addPartToAssembly(partName, serial, weight, surfaceArea);

                if (yn.equalsIgnoreCase("Y")) {
                    continue;
                } else {
                    assemblies.add(t);
                    break;
                }


            } while (doneCheck == false);


        }//while loop
        System.out.println("Assembly Report");
        System.out.println("============================");
        for (Assembly e : assemblies) {
            System.out.println(e.toString());
        }
        System.exit(-1);
    }//main
}//class


