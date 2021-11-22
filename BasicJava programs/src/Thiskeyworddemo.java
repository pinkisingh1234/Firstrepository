
class Student{  
int rollno;  
String name,branch;  
float fee;  
Student(int rollno,String name,String branch){  
this.rollno=rollno;  
this.name=name;  
this.branch=branch;  
}  
Student(int rollno,String name,String course,float fee){  
this(rollno,name,course);//reusing constructor  
this.fee=fee;  
}  
void display(){
	System.out.println(rollno+" "+name+" "+branch+" "+fee);
	}  
}  
class Thiskeyworddemo{  
public static void main(String args[]){  
Student s1=new Student(1,"anuj","IT");  
Student s2=new Student(2,"sumit","IT",6000f);  
s1.display();  
s2.display();  
}}  