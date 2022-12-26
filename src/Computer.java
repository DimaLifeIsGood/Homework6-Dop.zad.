public class Computer {
    int costComputer;
    String modelComputer;
    Ram ram;
    Hdd hdd;

    public Computer(int costComputer, String modelComputer) {
        this.costComputer = costComputer;
        this.modelComputer = modelComputer;
        this.ram=new Ram();
        this.hdd=new Hdd();
    }

    public Computer(int costComputer, String modelComputer, Ram ram, Hdd hdd) {
        this.costComputer = costComputer;
        this.modelComputer = modelComputer;
        this.ram = ram;
        this.hdd = hdd;
    }
    public void printComputer(){
        System.out.println("Cost computer :  "+ costComputer);
        System.out.println("Model of computer :  "+ modelComputer);


    }
}
