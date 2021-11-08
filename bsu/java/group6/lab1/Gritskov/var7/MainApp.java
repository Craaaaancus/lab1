package bsu.java.group6.lab1.Gritskov.var7;

public class MainApp {
	public static void main(String[] args) {
		Food[] breakfast = new Food[20];
		int i = 0;
		for (String arg:args) {
			String[] parts = arg.split("/");
			if (parts[0].equals("Apple")) {
				breakfast[i] = new Apple(parts[1]);
			}
			else if (parts[0].equals("IceCream")) {
				breakfast[i] = new IceCream(parts[1]);
			}
			else if (parts[0].equals("Cheese")) {
				breakfast[i] = new Cheese();
			}
			i++;
		}
		
		for (Food item:breakfast) {
			if (item != null) {
				item.consume();
			}
			else {
				break;
			}
		}
		
		int a = 0;
        int b = 0;
        int c = 0;
        
        for(int food = 0; food < breakfast.length; food++) {

            if (breakfast[food] instanceof Apple){
                a++;
            }
            else if (breakfast[food] instanceof IceCream) {
            	b++;
            }
            else if (breakfast[food] instanceof Cheese) {
            	c++;
            }
        }
        System.out.println("Apple - " + a);
        System.out.println("IceCream - " + b);
        System.out.println("Cheese - " + c);
		System.out.println("Good day!");
	}
}
