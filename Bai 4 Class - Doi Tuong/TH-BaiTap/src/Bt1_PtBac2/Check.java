package Bt1_PtBac2;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Mời bạn nhập b: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Mời bạn nhập c: ");
        double c = Double.parseDouble(sc.nextLine());
        QuadraticEquation ptBac2 = new QuadraticEquation(a,b,c);
        if (ptBac2.getDiscriminant()>0){
            System.out.println("Pt có 2 nghiệm x1 ="+ptBac2.getRoot1()+" và x2="+ptBac2.getRoot2());
        }else if (ptBac2.getDiscriminant()==0)
            System.out.println("Pt có nghiệm kép x1=x2="+(-ptBac2.getB()/ (ptBac2.getA()*2)));
            else System.out.println("Pt vô nghiệm");

    }
}
