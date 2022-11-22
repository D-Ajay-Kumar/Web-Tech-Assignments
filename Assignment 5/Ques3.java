import java.util.*;

class Marks {
    int rollno;
    static int id=19102054;
    static int total_marks=0;
    String name;
    int marks;

    void set_marks(String name, int marks) {
        this.marks=marks;
        this.name=name;
        this.rollno=id;
    }

    public String toString() {
        return "Name "+name+" Roll No.="+rollno+" Total Marks="+marks;
    }
}

class Physics extends Marks {
    
}

class Chemistry extends Marks {
        
}

class Maths extends Marks {
        
}

class Ques3 {
    public static void main(String[] args){
        System.out.println("Enter number of students");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Enter First Name ");
            String name=sc.next();
            System.out.println("Enter marks in maths");
            int math=sc.nextInt();
            Maths m=new Maths();
            m.set_marks(name, math);
            System.out.println("Enter marks in Chem");
            int chem=sc.nextInt();
            Chemistry c=new Chemistry();
            c.set_marks(name, chem);
            System.out.println("Enter marks in Physics");
            int physics =sc.nextInt();

            sc.close();

            Physics p =new Physics();
            p.set_marks(name, physics);
            Marks total= new Marks();
            total.set_marks(name, physics+chem+math);
            Marks.total_marks+=physics+chem+math;
            Marks.id+=1;
            System.out.println(total);
        }
        System.out.println("Average= "+Marks.total_marks/n);
    }
}