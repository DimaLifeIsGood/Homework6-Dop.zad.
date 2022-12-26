public class Ram {
    String nameRam;
    int valueRam;

    public Ram() {
    }

    public Ram(String nameRam, int valueRam) {
        this.nameRam = nameRam;
        this.valueRam = valueRam;
    }
    public void  printRam(){
        System.out.println("Name RAM :  "+nameRam);
        System.out.println("Value RAm :  "+valueRam);
    }
}
