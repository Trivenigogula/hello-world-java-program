import java.util.*;
class buffer {
public static void main(String[] args) {
StringBuffer s1=new StringBuffer("goodmorning");

System.out.println(s1.capacity());
StringBuffer s2=new StringBuffer("goodmorning");
System.out.println(s2.length());
StringBuffer s3=new StringBuffer("goodmorning");
System.out.println(s3.append("hi"));
StringBuffer s4=new StringBuffer("goodmorning");
System.out.println(s4.reverse());
StringBuffer s5=new StringBuffer("goodmorning");
System.out.println(s5.insert(2,"hi"));
StringBuffer s6=new StringBuffer("goodmorning");
System.out.println(s6.replace(6,8,"oo"));
StringBuffer s7=new StringBuffer("goodmorning");
System.out.println(s7.delete(2,4));
StringBuffer s9=new StringBuffer("goodmorning");
System.out.println(s9.substring(2,7));
StringBuffer s10=new StringBuffer("goodmorning");
System.out.println(s10.charAt(0));
}
}
