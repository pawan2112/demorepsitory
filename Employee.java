import java.util.*;
class Employee{
    private int empno;
    private String empname;
    private int salary;

    Employee(int empno,String empname,int salary){
         empno=empno;
         empname=empname;
         salary=salary;
    }
    public int  getEmpno(){
        return empno;
    }
    public int getEmpSalary(){
        return salary;
    }
    public String getEmpname(){
       return empname;
    }
    public String toString(){
        return empno+""+empname+""+salary;
    }
}
class Employee{
    public static void main(String[] args) {
        Scanner  p = new Scanner(System.in);
        int ch;
         do{
            System.out.println("Insert");
            System.out.println("Display");
            System.out.println("Search");
            System.out.println("Delete");
            System.out.println("Update");
            System.out.println("mvcdnvdvn");
            ch= p.nextInt();
        }while(ch!=0);        
    }
}