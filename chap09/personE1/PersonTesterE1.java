/**
 * PersonTesterE1
 */
public class PersonTesterE1 {

    public static void main(String[] args) {
        PersonE1[] people = {
            new PersonE1("ryo", 180, 99),
            new PersonE1("hana", 170, 50)
        };

        for(int i = 0; i < people.length; ++i) {
            System.out.println(
                "people[" +i+ "] " +
                "\n height:"+
                people[i].getHeight() +
                "\n weight:"+
                people[i].getWeight()
            );
        }
    }
}