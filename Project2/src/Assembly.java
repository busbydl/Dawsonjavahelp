import java.util.ArrayList;

public class Assembly {

    //local variables
    private String name;

        private ArrayList<Part> parts = new ArrayList<Part>();


            public Assembly(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public ArrayList<Part> getParts() {
                return parts;
            }

            public void addPartToAssembly(String partNumber, String serialNumber, int weight, double surfaceArea) {
                parts.add(new Part(partNumber, serialNumber, weight, surfaceArea));
            }

            public double calculateTotalSurfaceArea(){
                int surfaceArea = 0;
                return surfaceArea;
            }

            public int calculateTotalWeight(){
                int totalWeight = 0;
                return totalWeight;
            }

    @Override
    public String toString() {
        return "Assembly{" +
                "name='" + name + '\'' +
                ", parts=" + parts +
                '}';
    }
}
