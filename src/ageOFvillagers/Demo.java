package ageOFvillagers;

public class Demo {
    public static void main(String[] args) {
      
    	shape circle = new shape("Circle","Green","2D");
        shape line = new shape("Line","Brown","1D");
        shape plane = new shape("Plane","Black","2D");
        shape cube= new shape("Cube","Blue" ,"3D");
        shape triangle = new shape("Triangle","White","2D");
        shape pyramid = new shape("Pyramid","Gray","3D");
        shape rectangle = new shape("Rectangle","Blue","2D");
        
        shape tree = new shape("Tree","Green","3D");
        tree.add(line);
        tree.add(circle);

        cube.add(plane);
        pyramid.add(triangle);
        shape house = new shape("House","Blue-Gray","3D");
        house.add(cube);
        house.add(pyramid);

        shape waterSource = new shape("Well","Tranparent","2D");
        waterSource.add(circle);
        
        shape roads = new shape("roads","mixed","2D");
        roads.add(rectangle);
        roads.add(line);
        
        shape village = new shape("Village","mixed","3D");
        village.add(house);
        village.add(tree);
        village.add(waterSource);
        village.add(roads);
        
        System.out.println("-----------------------------------");
        village.print();

        System.out.println("-----------------------------------");
        house.print();
        
        System.out.println("-----------------------------------");
        tree.print();
        
        System.out.println("-----------------------------------");
        waterSource.print();
        
        System.out.println("-----------------------------------");
        roads.print();
        
        
    }
}