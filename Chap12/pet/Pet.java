/**
 * Pet
 */
public class Pet {

    private String name;
    private String masterName;

    public Pet(String name, String masterName) {
        this.name = name;
        this.masterName = masterName;
    }

    // 子クラスから直接参照できないから、親クラスのメソッドを呼ぶこと
    public String getName() { return name; }
    public String getMasterName() { return masterName; }
    
    public void introduce() {
        System.out.println("my name is " + name );
        System.out.println("my masterName is " + masterName );
    }
}

class RobotPet extends Pet {
    public RobotPet(String name, String masterName){
        super(name, masterName);
    }

    public void introduce() {
        System.out.println("I am a robot. my name is " + getName() );
        System.out.println("my master's name is " + getMasterName() );
    }

    public void work(int sw) {
        switch (sw) {
            case 0:
                System.out.println("Rufreumen");
                break;
            case 1:
                System.out.println("waschen");
                break;
            case 2:
                System.out.println("kochen");
                break;
        
            default:
                break;
        }
    }
    
}