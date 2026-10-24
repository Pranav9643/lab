// write a java pgm that has an abstract class called employee and 
// abstract method called salary. 
// it has a sub class called HR and manager 
// that impelements the abstract method display the salary of both hr and manager
abstract class employee{
    abstract void salary();
}
class HR extends employee{
    void salary(){
        System.out.println("HR salaray: 8000");
    }

}
class manager extends employee{
    void salary(){
        System.out.println("Manager salaray: 8000");
    }
}
class emp{
    public static void main(String args[]){
        HR r = new HR();
        manager m = new manager();
        r.salary();
        m.salary();
    }
}