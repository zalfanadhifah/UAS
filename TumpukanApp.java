package Stack;

public class TumpukanApp {
  public static void main(String[] args){
        
        Tumpukan tumpukan = new Tumpukan (10);
        tumpukan.push(1);
        tumpukan.baca();
        tumpukan.push(2);
        tumpukan.baca();
        tumpukan.push(3);
        tumpukan.baca();
        System.out.println("nilai teratas = " + tumpukan.peek());
        System.out.println("Nama saya adalah Zalfa Nadhifah");
        System.out.println("nilai yang dihapus = " + tumpukan.pop());
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(4);
        tumpukan.baca();
}
}



