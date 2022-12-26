public class Hdd {
    String nameHdd;
    int valueHdd;
    String typeHdd;

    public Hdd() {
    }

    public Hdd(String nameHdd, int valueHdd, String typeHdd) {
        this.nameHdd = nameHdd;
        this.valueHdd = valueHdd;
        this.typeHdd = typeHdd;
    }
    public void  printHdd(){
        System.out.println("Name HDD :  "+nameHdd);
        System.out.println("Value HDD :  "+valueHdd);
        System.out.println("Type HDD :  "+typeHdd);
    }
}
