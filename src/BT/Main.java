package BT;

public class Main {

    public static void main(String args[]) {
        Fraction a = new Fraction();
        Fraction c = new Fraction();
        Fraction p = new Fraction();
        a.setTuso(5);
        a.setMauso(10);
        a.InPso();
        c.Nhap();
        c.InPso();
        c.nghichdao();
        c.InPso();
        a.RutgonPS();
        a.InPso();

        Fraction tong = a.add(c);
        System.out.println("Tong: ");
        tong.InPso();
        Fraction hieu = a.sub(c);
        System.out.println("Hieu: ");
        hieu.InPso();
        Fraction tich = a.mul(c);
        System.out.println("Tich: ");
        tich.InPso();

        Fraction thuong = a.div(c);
        System.out.println("Thuong: ");
        thuong.InPso();
    }
}
