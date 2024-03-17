package DSA.week3.ex1;


//• Hoàn thiện thân hàm của các hàm trên.
//• Nhập dãy n phân số.
//• In ra phân số ở vị trí thứ v trong dãy.
//• Tính tổng của n phân số, cho kết quả là một phân số đã tối giản.
//• Thực hiện tương tự với trừ, nhân và chia n phân số.
//• (*) Tự đề xuất ít nhất một yêu cầu sử dụng kiểu phân số đã tạo ở trên, viết hàm thực hiện yêu cầu đó.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Nhap n phan so:");

        int n = in.nextInt();

        ManagerFraction list = new ManagerFraction();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap tu so: ");
            float tu = in.nextFloat();
            System.out.print("nhap mau so: ");
            float mau = in.nextFloat();
            while (mau <= 0) {
                System.out.println("mau k dc bang 0 hoac mau am");
                System.out.print("nhap lai mau so: ");
                mau = in.nextFloat();
            }
            list.append(new Fraction(tu, mau));
        }



//        In ra phân số ở vị trí thứ i trong dãy.
        System.out.println("In phan so vi tri ");
        int index = in.nextInt();
        System.out.println("ps vi tri " + index + " la: " + list.getFractionIndex(index - 1));

        System.out.println("tong ps la: "+list.add());
        System.out.println("hieu ps la; "+list.minus());
        System.out.println("thuong ps la; "+list.divi());
        System.out.println("nhan ps la; "+list.multi());
        System.out.println("tb ps la; "+list.media());

    }
}
