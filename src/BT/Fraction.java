package BT;

import java.util.Scanner;

public class Fraction {
    int tuso;
    int mauso;



    // xay dung mac nhien
    public Fraction() {

    }
    // xay dung 2 doi so
    public Fraction(int t, int m) {
        tuso = t;
        mauso = m;
    }
    //phuong thuc xay dung sao chep
    public Fraction (Fraction p) {
        tuso = p.tuso;
        mauso = p.mauso;
    }


    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }
    //nhap
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so: ");
        tuso = sc.nextInt();
        do {
            System.out.println("Nhap mau so: ");
            mauso = sc.nextInt();
        } while (mauso == 0);
    } //in
    public void InPso() {
        // tuso = 0, mauso = 1, bth
        if (tuso == 0) {
            System.out.println(0);
        } else if (mauso == 1) {
            System.out.println(tuso);
        } else {
            System.out.println("Phan so:" + tuso + "/" + mauso);
        }
    }
//rutgon
    public  void rutgon() {

    }
    //nghichdao pso
    public  void nghichdao() {
        System.out.println("Pso da dc nghich dao");
        int tam = tuso;
        tuso = mauso;
        mauso = tam;
    }
    // tinh ra 1 gia tri moi
    // rut gon ps
    int UCLN(int a, int b) {
        while (a!=b) {
            if(a>b) a-=b;
            else b -= a;
        }
        return a;
    }
    public void RutgonPS() {
        int ucln = UCLN(tuso, mauso);
        tuso/=ucln;
        mauso/=ucln;
    }
    // cong ps
    public Fraction add(Fraction c) {
        //this + p
      Fraction tong = new Fraction();
      tong.tuso = this.tuso * c.mauso + this.mauso * c.tuso;
      tong.mauso = this.mauso * c.mauso;
        return tong;
    }
    // tru ps
    public Fraction sub(Fraction c) {
        Fraction hieu = new Fraction();
        hieu.tuso = this.tuso*c.mauso - this.mauso*c.tuso;
        hieu.mauso = this.mauso * c.mauso;
        return hieu;
    }

    public Fraction mul(Fraction c) {
        Fraction tich = new Fraction();
        tich.tuso = this.tuso * c.tuso;
        tich.mauso = this.mauso * c.mauso;
        return tich;
    }
    public Fraction div(Fraction c) {

        Fraction thuong = new Fraction();
        thuong.tuso = this.tuso * c.mauso;
        thuong.mauso = this.mauso * c.tuso;
        return thuong;
    }



}