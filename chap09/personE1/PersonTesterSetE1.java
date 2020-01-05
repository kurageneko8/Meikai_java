import java.util.Scanner;

/**
 * PersonTesterE1
 */
class PersonTesterSetE1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        PersonE1[] people = {
            new PersonE1("hina", 0, 0)
            // new PersonE1("hana", 170, 50)
        };

        for(int i = 0; i < people.length; ++i) {
            System.out.println("people[" +i+ "] ");
            
            System.out.print("name:");
            String name = in.next();
            people[i].setName(name);

            System.out.println("name :"+people[i].getName());
            

            //      +
            //     "\n height:"+
            //     people[i].getHeight() +
            //     "\n weight:"+
            //     people[i].getWeight()
            // );
        }
    }
}