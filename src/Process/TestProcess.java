package Process;
import Process.JCB;
import Process.ProcessMenu;

import java.util.Scanner;

import static javax.swing.text.html.HTML.Tag.P;

public class TestProcess {
    public static void main(String[] args) {
        ProcessMenu pm=new ProcessMenu();
        pm.init();//初始化容器

//        pm.FCFS();pm.printProcess();
//        pm.SJF();pm.printProcess();
//        pm.RR();pm.printProcess();
//        pm.HRN();pm.printProcess();
        Scanner sc=new Scanner(System.in);
        System.out.println("********************************************");
        System.out.println("                进程调度演示");
        System.out.println("********************************************");
        System.out.println("              1.FIFO算法");
        System.out.println("              2.SJF算法");
        System.out.println("              2.RR算法");
        System.out.println("              4.退出该程序");
        System.out.print("请选择所要采用的算法：");
        int flag=sc.nextInt();
        switch (flag){
            case 1:
                pm.FCFS();pm.printProcess();
                break;
            case 2:
                pm.SJF();pm.printProcess();
                break;
            case 3:
                pm.RR();pm.printProcess();
                break;
            case 4: System.exit(0);
            default:break;
        }
    }
}