public class Main {
    public static void main(String[] args){
Computer computer1= new Computer(1500,"IntelCeleron");
computer1.printComputer();
//computer1.hdd=new Hdd("CCP",1024,"ZEWN");
computer1.hdd.printHdd();
computer1.ram.printRam();
        Computer computer2= new Computer(2000,"InelPentium",new Ram(),new Hdd());
        computer2.printComputer();
        computer2.hdd.printHdd();
        computer2.ram.printRam();

    }

}
