import controllers.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
      Person[] personas = {
        new Person("Alice", 30, new int[]{10,15,20}), //15
        new Person("Bob", 25, new int[] {15,15,20}),//16.66
        new Person("Charlie", 35, new int[] {20,15,20}),//18.33
        new Person("David", 20 ,new int[] {20,20,20}),//20
        new Person("Eve", 28 ,new int[] {10,10,20}),//13..

      };
      //Imprimimos
      //Intanciamos
      //Ordenado por edad
      //Imprimimos 
      for (Person persona : personas) {
        System.out.println(persona);
      }
      //Ordenado por edad
      PersonController pcontroller = new PersonController();
        pcontroller.sortPeopleByAge(personas);
        System.out.println("\nPersonas ordenadas por edad:");
        for (Person persona : personas) {
            System.out.println(persona);
        }
        //Ordenado por nombre
        pcontroller.sortPeopleByName(personas);
        System.out.println("\nPersonas ordenadas por nombre:");
        for (Person persona : personas) {
            System.out.println(persona);
        }
        pcontroller.sortPeopleByAvr(personas);
        System.out.println("\nPersonas ordenadas por promedio:");
        for (Person persona : personas) {
            System.out.println(persona);
    }
    
}
}