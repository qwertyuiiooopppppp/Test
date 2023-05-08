package ex01;


import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface
interface Aaaa{
   int max(int a,int b);
//   int max2(int a,int b); 
   // but @FunctionalInterface 를 붙이면 여기서 걸러짐 ㅇㅇ
   // 람다식 쓸거니까 추상메소드 한개만 써라~
}
interface Bbbb{
   void printVar(String name,int i);
//   void printVar2(String name,int i); // 메인에서 람다식 쓰려면 하나만 있어야댐
}
interface Cccc{
   int func();
}
interface Dddd{
   int square(int x);
}

interface Eee{
   int sumArr(int[] arr);
}

public class Exam01 {
   public static void main(String[] args) {
      
      Aaaa A = (a , b) -> a>b ? a:b;
      System.out.println(A.max(10,20));
      
      BiFunction<Integer, Integer, Integer> bi = (a, b) -> a>b ? a : b;  
      System.out.println(bi.apply(30, 20));
      
      Bbbb B = (name, i) -> System.out.println(name+"="+i);
      B.printVar("홍길동", 20);
      System.out.println("-------------------------------------------");
      BiFunction<String, Integer,String> bi2 = 
            (name, age) ->    "이름은 "+name+" 이고, 나이는 " + age + "입니다"; 
            
         
      System.out.println(bi2.apply("홍길동", 20));
      System.out.println("-------------------------------------------");
      
      BiConsumer<String, Integer> b13 =
    		  (name, i)->  System.out.println(name+"="+i);
 //     b13.accept("로이, 11);
    		  
    		  
      Cccc C = () -> (int)(Math.random()*6);
      System.out.println(C.func());
      Supplier<Integer> s1 = () -> (int)(Math.random()*6);
      int num =s1.get();
      System.out.println("s1.get() : " +num);
      
      Dddd d = x ->  x * x;
      System.out.println(d.square(10));
      
 //     Function<T, R>
      
      Eee e = arr -> {
         int sum = 0;
         for(int i : arr)
            sum+=i;
         return sum;
      };
      
      int[] arr = {10,20,30,40};
      System.out.println(e.sumArr(arr));
      
      Function<int [],Integer> f1 =arr2 -> {
                 int sum = 0;
                 for(int i : arr)
                  sum+=i;
                  return sum;
   };
   int num2 =f1.apply(arr);
   System.out.println("num2:"+ num2);
      }   
}

	
	
	


